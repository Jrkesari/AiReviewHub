package com.aihub.major.service;
import com.aihub.major.model.Review;
import com.aihub.major.repository.ReviewRepository;
import com.aihub.major.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public List<Review> getReviewsByProduct(Long productId) {
        return reviewRepository.findByProductId(productId);
    }

    @Override
    public Review saveReview(Review review) {
        return reviewRepository.save(review);
    }
}
