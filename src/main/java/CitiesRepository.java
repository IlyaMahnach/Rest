import attraction.Cities;
import attraction.Sight;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CitiesRepository extends JpaRepository<Cities, Long> {
}