package io.github.sqrelles.news2.repository;

import io.github.sqrelles.news2.models.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {

    List<News> findAllByDateBetween(LocalDateTime startDate, LocalDateTime endDate);
}
