package green.mtcoding.travel.review;

import green.mtcoding.travel.festivalInfo.FestivalInfo;
import green.mtcoding.travel.tourismInfo.TourismInfo;
import green.mtcoding.travel.user.User;
import green.mtcoding.travel.restourantInfo.RestaurantInfo;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="review_tb")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private int contentId;

    private byte rating;  // 리뷰 별점 (TINYINT에 해당)

    private boolean isDeleted;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;  // 회원 ID (외래 키로 참조)

    @ManyToOne(fetch = FetchType.LAZY)
    private FestivalInfo festivalInfo;

    @ManyToOne(fetch = FetchType.LAZY)
    private TourismInfo tourismInfo;

    @ManyToOne(fetch = FetchType.LAZY)
    private RestaurantInfo restaurantInfo;
}
