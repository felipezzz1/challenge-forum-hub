package com.nataliatsi.api.forumhub.repository;

import com.nataliatsi.api.forumhub.domain.autor.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
