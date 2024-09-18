package green.mtcoding.travel.festivalInfo;

import lombok.Data;

public class FestivalInfoResponse {

    @Data
    public static class FestivalMainDTO {
        private String contentId;
        private String contenttypeid;
        private String eventStartDate;
        private String eventenddate;
        private String eventplace;
        private String originImgUrl;
        private boolean active;
        private int index;

        public FestivalMainDTO(String contentId, String contenttypeid, String eventStartDate, String eventenddate, String eventplace, String originImgUrl) {
            this.contentId = contentId;
            this.contenttypeid = contenttypeid;
            this.eventStartDate = eventStartDate;
            this.eventenddate = eventenddate;
            this.eventplace = eventplace;
            this.originImgUrl = originImgUrl;
        }

        public FestivalMainDTO(String contentId, String contenttypeid, String eventStartDate, String eventenddate, String eventplace, String originImgUrl, boolean active, int index) {
            this.contentId = contentId;
            this.contenttypeid = contenttypeid;
            this.eventStartDate = eventStartDate;
            this.eventenddate = eventenddate;
            this.eventplace = eventplace;
            this.originImgUrl = originImgUrl;
            this.active = active;
            this.index = index;
        }
    }
}
