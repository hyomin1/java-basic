package class1;

public class MovieReviewMain2 {
    public static void main(String[] args) {

        MovieReview mr1 = new MovieReview();
        MovieReview mr2 = new MovieReview();

        mr1.title = "인셉션";
        mr1.review = "인생은 무한 루프";

        mr2.title = "어바웃 타임";
        mr2.review = "인생 시간 영화!";

        MovieReview[] mrs = new MovieReview[2];
        mrs[0] = mr1;
        mrs[1] = mr2;

        for (int i = 0; i< mrs.length; i++) {
            System.out.println("영화 제목: " + mrs[i].title + ", 리뷰: " + mrs[i].review);

        }

    }


}
