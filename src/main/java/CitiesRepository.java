package repositories;

import attraction.Cities;
import attraction.Sight;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository


public interface CitiesRepository extends JpaRepository<Cities, Long> {
}