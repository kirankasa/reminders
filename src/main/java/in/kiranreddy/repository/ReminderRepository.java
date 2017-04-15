package in.kiranreddy.repository;

import in.kiranreddy.domain.Reminder;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by kiranreddy on 11/04/17.
 */
public interface ReminderRepository extends JpaRepository<Reminder,Long> {
}
