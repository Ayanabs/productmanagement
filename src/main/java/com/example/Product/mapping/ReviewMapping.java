import com.example.Product.dto.Reviewdto;
import com.example.Product.entity.Product;
import com.example.Product.entity.Review;
import com.example.Product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component

@RequiredArgsConstructor
public class ReviewMapping {

    private final ProductRepository productRepository;

    public Review toEntity(Reviewdto.ReviewDto dto) {
        Review review = new Review();
        review.setComment(dto.getComment());
        review.setRating(dto.getRating());


        Product product = productRepository.findById(dto.getProductId())
                .orElseThrow(() -> new RuntimeException("Product not found"));
        review.setProduct(product);

        return review;
    }

    public Reviewdto.ReviewDto toDto(Review entity) {
        Reviewdto.ReviewDto dto = new Reviewdto.ReviewDto();
        dto.setId(entity.getId());
        dto.setContent(entity.getContent());
        dto.setRating(entity.getRating());
        dto.setProductId(entity.getProduct().getProduct_id());
        dto.setCreatedAt(entity.getCreatedAt());
        return dto;
    }
}
