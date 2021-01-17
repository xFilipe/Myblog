package br.com.filipedev.myblog.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.filipedev.myblog.model.Post;
import br.com.filipedev.myblog.service.MyblogService;

@Component
public class DummyData {

	@Autowired
	MyblogService myblogservice;

	
	//@PostConstruct
	public void savePosts() {

		List<Post> posts = new ArrayList<>();

		Post post1 = new Post();
		post1.setAutor("Filipe");
		post1.setData(LocalDate.now());
		post1.setTitulo("Lorem Ipsum");
		post1.setTexto(
				"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");

		Post post2 = new Post();
		post2.setAutor("Filipe");
		post2.setData(LocalDate.now());
		post2.setTitulo("Lorem Ipsum");
		post2.setTexto(
				"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
	
	
		posts.add(post1);
		posts.add(post2);
		
		
		for(Post post: posts) {
			myblogservice.save(post);
			System.out.println("Post Salvo");
		}
	
	}

}

