package br.com.filipedev.myblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.filipedev.myblog.model.Post;

public interface MyblogRepository extends JpaRepository<Post, Long>{

}
