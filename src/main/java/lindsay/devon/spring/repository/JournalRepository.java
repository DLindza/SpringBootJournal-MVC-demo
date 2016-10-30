package lindsay.devon.spring.repository;

/**
 * Created by devon on 10/23/16.
 */

import org.springframework.data.jpa.repository.JpaRepository;
import lindsay.devon.spring.domain.JournalEntry;

public interface JournalRepository extends JpaRepository<JournalEntry,Long>{
}
