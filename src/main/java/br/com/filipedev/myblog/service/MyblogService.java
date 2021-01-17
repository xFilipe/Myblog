package br.com.filipedev.myblog.service;

import java.util.List;

import br.com.filipedev.myblog.model.Post;

public interface MyblogService {

	List<Post> findAll();

	Post findById(long id);

	Post save(Post post);

}
