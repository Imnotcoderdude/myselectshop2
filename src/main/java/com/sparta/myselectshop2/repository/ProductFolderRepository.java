package com.sparta.myselectshop2.repository;

import com.sparta.myselectshop2.entity.Folder;
import com.sparta.myselectshop2.entity.Product;
import com.sparta.myselectshop2.entity.ProductFolder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductFolderRepository extends JpaRepository<ProductFolder, Long> {

    Optional<ProductFolder> findByProductAndFolder(Product product, Folder folder);

}
