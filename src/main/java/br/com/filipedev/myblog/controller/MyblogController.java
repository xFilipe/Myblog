package br.com.filipedev.myblog.controller;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.filipedev.myblog.model.Post;
import br.com.filipedev.myblog.service.MyblogService;

@Controller
public class MyblogController {
	
		
	@Autowired
	MyblogService myblogService;
	
	
	

	@GetMapping(value = "/posts")
	public ModelAndView getPosts() {

		ModelAndView mv = new ModelAndView("posts");
		List<Post> posts = myblogService.findAll();
		mv.addObject("posts", posts);
		return mv;

	}

	@GetMapping(value = "/posts/{id}")
	public ModelAndView getPostDetails(@PathVariable("id") long id) {
		ModelAndView mv = new ModelAndView("postDetails");
		Post post = myblogService.findById(id);
		mv.addObject("post", post);

		return mv;
	}
	
	
	@GetMapping(value = "/newpost")
	public String getPostForm() {
		return "postForm";
	}
	
	
    @PostMapping(value="/newpost")
	public String savePost(@Valid Post post, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
            attributes.addFlashAttribute("mensagem", "Verifique se os campos obrigatórios foram preenchidos!");
			return "redirect:/newpost";
		}
		post.setData(LocalDate.now());
		myblogService.save(post);
		return "redirect:/newpost";
		
		
	}
    
    @GetMapping(value = "/")
    public String login() {    	
    	return "login";
    }
    
    
	

}
