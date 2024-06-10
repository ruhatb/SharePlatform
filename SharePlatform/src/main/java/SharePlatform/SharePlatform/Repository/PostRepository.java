package SharePlatform.SharePlatform.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PostRepository extends JpaRepository<Posts, Long> {
    List<Posts> findByUser(Users user);
}
