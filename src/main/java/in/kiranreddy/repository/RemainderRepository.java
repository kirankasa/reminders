package in.kiranreddy.repository;

import in.kiranreddy.domain.Remainder;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by kiranreddy on 11/04/17.
 */
public interface RemainderRepository extends JpaRepository<Remainder,Long> {
}
