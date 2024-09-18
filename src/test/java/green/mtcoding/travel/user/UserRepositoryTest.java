package green.mtcoding.travel.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

@DataJpaTest
@Import(UserRepository.class)
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void findAll_test() {

    }

}