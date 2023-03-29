package in.madhu;



import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.madhu.entites.Book;
import in.madhu.repo.BookRepository;

@SpringBootApplication
public class JpaAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt =
				SpringApplication.run(JpaAppApplication.class, args);
		
		BookRepository repo = ctxt.getBean(BookRepository.class);
		Book b = new Book();
		b.setBookId(1100);
		b.setBookName("Spring");
		b.setBookPrice(1000.0);

		repo.save(b);
	
		
		
		System.out.println("Record inserted ......");
	}

}
