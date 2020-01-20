package com.abhinash.userrating.repos;import com.abhinash.userrating.domain.Rating;import org.springframework.data.jpa.repository.JpaRepository;import org.springframework.data.jpa.repository.Query;import java.util.List;public interface RatingRepos extends JpaRepository<Rating, Long> {    Rating findByMovieId(Long movieId);    @Query(value = "select new com.abhinash.userrating.domain.Rating(movieId, rating) from Rating where userId =:userId")    List<Rating> findByUserId(String userId);}