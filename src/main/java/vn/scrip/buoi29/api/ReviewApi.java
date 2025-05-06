package vn.scrip.buoi29.api;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.scrip.buoi29.model.request.CreateReviewRequest;
import vn.scrip.buoi29.model.request.UpdateReviewRequest;

import vn.scrip.buoi29.service.ReviewService;
@RestController
@RequestMapping("/api/reviews")
@RequiredArgsConstructor
public class ReviewApi {

    private final ReviewService reviewService;
    @PostMapping
    public ResponseEntity<?> createReview(@RequestBody CreateReviewRequest request) {

        return ResponseEntity.ok(reviewService.createReview(request));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateReview(@PathVariable Integer id, @RequestBody UpdateReviewRequest request) {
        return ResponseEntity.ok(reviewService.updateReview(id, request));
    }
}




