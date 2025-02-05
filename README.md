# MySelectShop

- 민감정보 .env 파일로 관리.
- Dockerfile 로컬에서 빌드 후 docker hub 이용하여 EC2 내에 수동으로 이미지 pull 받아서 배포.
- 백엔드 앱과 데이터베이스 컨테이너 분리 후 동시 관리를 위해 docker-compose 사용.


# 트러블 슈팅
1. 로컬에서 빌드한 docker image 파일을 EC2 내에서 실행할때 platform 불일치 에러 발생.
   - 로컬 환경은 arm/64, Ec2 환경은 amd/64 로, 서로 다르기 때문에 발생한 문제.
   - 로컬에서 빌드시 arm/64로 빌드하는 것이 아닌 amd/64로 빌드하기 위해 명령어 실행.
   - (docker build --platform linux/amd64 -t 도커사용자명/앱이름:태그)
   - amd/64로 다시 빌드한 이미지 파일을 도커 허브에 push 후 EC2내에서 pull 받아서 실행.
   - 해결.

