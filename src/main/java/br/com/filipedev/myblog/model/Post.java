package br.com.filipedev.myblog.model;

import java.time.LocalDate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="TB_POST")
@ToString
@EqualsAndHashCode
public class Post {

	@Getter
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotBlank
	@Getter
	@Setter
	private String titulo;

	@Getter
	@Setter
	@NotBlank
	private String autor;

	@Getter
	@Setter
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate data;

	@Getter
	@Setter
	@NotBlank
	@Lob
	private String texto;

}
