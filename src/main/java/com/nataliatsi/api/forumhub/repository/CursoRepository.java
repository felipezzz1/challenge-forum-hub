package com.nataliatsi.api.forumhub.repository;

import com.nataliatsi.api.forumhub.domain.curso.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
