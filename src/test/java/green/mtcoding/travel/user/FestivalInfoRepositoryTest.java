package green.mtcoding.travel.user;

import green.mtcoding.travel.festivalInfo.FestivalInfo;
import green.mtcoding.travel.festivalInfo.FestivalInfoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import java.util.List;

@Import(FestivalInfoRepository.class)
@DataJpaTest
public class FestivalInfoRepositoryTest {
    @Autowired
    private FestivalInfoRepository festivalInfoRepository;

    @Test
    public void findAll() {
        // given

        // when
        List<FestivalInfo> festivalInfoList = festivalInfoRepository.findAll();

        // eye
        System.out.println(festivalInfoList.size());
        System.out.println(festivalInfoList.get(0).getContentId());
        System.out.println(festivalInfoList.get(0).getEventplace());
    }
}
