package com.blogpessoal;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

/*spring.profiles.active=dev 🡢 O Spring executará a aplicação com a configuração do Banco
de dados local (MySQL)
spring.profiles.active=prod 🡢 O Spring executará a aplicação com a configuração do
Banco de dados na nuvem (Heroku)
*/


@SpringBootApplication
public class BlogpessoalApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogpessoalApplication.class, args);
	}

}
