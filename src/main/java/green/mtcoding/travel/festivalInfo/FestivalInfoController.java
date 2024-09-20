package green.mtcoding.travel.festivalInfo;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class FestivalInfoController {

    private final FestivalInfoService festivalInfoService;

    /*           main-start             */
    /*           main-end             */

    /*           theme-start             */
    /*           theme-end             */

    /*           region-start             */
    /*           region-end             */

    /*           hotPlace-start             */
    /*           hotPlace-end             */

    /*           festival-start             */
    @GetMapping("/festival/main")
    public String festival(HttpServletRequest request) {
        List<FestivalInfoResponse.FestivalMainDTO> festivalInfoList = festivalInfoService.목록보기();
        request.setAttribute("models", festivalInfoList);
        return "/festival/festival";
    }

    @GetMapping("/festival/detail/{contentId}")
    public String festivalDetail(@PathVariable("contentId") String contentId, HttpServletRequest request) {
        request.setAttribute("festivalContentId", contentId);

        return "/festival/festival-detail";
    }
    /*           festival-end             */

    /*           info-start             */
    /*           info-end             */

    /*           map-start             */
    /*           map-end             */

    /*           user-start             */
    /*           user-end             */

    /*           myPage-start             */
    /*           myPage-end             */
}
