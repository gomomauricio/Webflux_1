package net.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class ReactorUdemyApplication implements CommandLineRunner  //para hacerla tipo consola
{

	public static void main(String[] args) {
		SpringApplication.run(ReactorUdemyApplication.class, args);
		System.out.println("Iniciando REACTOR - . - . - . ");
	}

	@Override
	public void run(String... args) throws Exception 
	{
		Flux<String> nombres = Flux.just("Andres","Pedro","Diego","Juan")
//								   .doOnNext(elemento -> System.out.println(elemento + " ") );
		 						  .doOnNext(System.out::println );

		nombres.subscribe();
		
	}

}
