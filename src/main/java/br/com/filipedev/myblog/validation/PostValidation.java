package br.com.filipedev.myblog.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.filipedev.myblog.model.Post;

public class PostValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
	
	Post post = new Post();
	target = post;
	ValidationUtils.rejectIfEmpty(errors, post.getTitulo(), "Field.required");
		
	}

}
