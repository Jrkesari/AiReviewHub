package com.aihub.major.service;
import com.aihub.major.model.Review;

import java.util.List;

public interface ReviewService {
    List<Review> getReviewsByProduct(Long productId);
    Review saveReview(Review review);
}
