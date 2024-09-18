package green.mtcoding.travel.festivalInfo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class FestivalInfoRepository {

    private final EntityManager em;

    public List<FestivalInfo> findAll() {
       Query query = em.createQuery("select fb from FestivalInfo fb order by fb.id desc", FestivalInfo.class);
        List<FestivalInfo> festivalInfoList = query.getResultList();
        return festivalInfoList;
    }

}
