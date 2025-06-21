package class1.ex;

public class MovieReviewMain1 {

    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "기생충";
        movieReview1.review = "재밌어요";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "범죄도시";
        movieReview2.review = "좋아요";

        System.out.println("영화 제목: " + movieReview1.title + ", 리뷰:" + movieReview1.review);
        System.out.println("영화 제목: " + movieReview2.title + ", 리뷰:" + movieReview2.review);

    }
}
