package Class1.ex;

public class MovieReviewMain2 {

    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];

        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "기생충";
        movieReview1.review = "재밌어요";
        reviews[0] = movieReview1;

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "범죄도시";
        movieReview2.review = "좋아요";
        reviews[1] = movieReview2;

        for (MovieReview review : reviews) {
            System.out.println("영화 제목: " + review.title + ", 리뷰:" + review.review);
        }


    }
}
