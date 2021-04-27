package com.kim.minsang.repository;


import com.kim.minsang.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Post,Long> {

}
