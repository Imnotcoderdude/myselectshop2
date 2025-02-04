package com.sparta.myselectshop2.repository;

import com.sparta.myselectshop2.entity.Folder;
import com.sparta.myselectshop2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FolderRepository extends JpaRepository<Folder, Long> {

    List<Folder> findAllByUserAndNameIn(User user, List<String> folderNames);
    // 쿼리 : select * from folder where user_id = 1 and name in ('1', '2', '3');


    List<Folder> findAllByUser(User user);
}
