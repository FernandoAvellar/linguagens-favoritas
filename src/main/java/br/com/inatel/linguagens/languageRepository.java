package br.com.inatel.linguagens;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface languageRepository extends MongoRepository<Linguagem, String> {   
}
