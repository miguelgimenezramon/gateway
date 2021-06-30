package microservices.book.gateway.domain;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@NoArgsConstructor(force=true)
@Getter
@ToString
@EqualsAndHashCode
public final class MultiplicationFallbackResponse {
	private Long id;
	// Both factors
	private final String factorA;
	private final String factorB;
}

