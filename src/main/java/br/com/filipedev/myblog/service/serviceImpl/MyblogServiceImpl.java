package br.com.filipedev.myblog.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.filipedev.myblog.model.Post;
import br.com.filipedev.myblog.repository.MyblogRepository;
import br.com.filipedev.myblog.service.MyblogService;


@Service
public class MyblogServiceImpl implements MyblogService {

	@Autowired
	MyblogRepository myblogRepository;

	@Override
	public List<Post> findAll() {
		return myblogRepository.findAll();
	}

	@Override
	public Post findById(long id) {
		return myblogRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return myblogRepository.save(post);
	}

}
