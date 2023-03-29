package in.madhu.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.madhu.entites.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

}
