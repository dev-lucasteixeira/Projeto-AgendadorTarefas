package com.lucasteixeira.agendador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients //habilita o uso de feign client da netflix
public class AgendadorDeTarefasApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendadorDeTarefasApplication.class, args);
	}

}
