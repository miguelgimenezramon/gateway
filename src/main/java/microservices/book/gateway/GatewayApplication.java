package microservices.book.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

//	@Bean
//	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//		return builder.routes()
//				.route("multiplications",
//						r -> r.path("/api/multiplications/**").filters(f -> f.stripPrefix(1))
//								.uri("http://localhost:8080/multiplications/"))
//				.route("results",
//						r -> r.path("/api/results/**").filters(f -> f.stripPrefix(1))
//								.uri("http://localhost:8080/results/"))
//				.route("leaders",
//						r -> r.path("/api/leaders/**").filters(f -> f.stripPrefix(1))
//								.uri("http://localhost:8081/leaders/"))
//				.route("stats",
//						r -> r.path("/api/stats/**").filters(f -> f.stripPrefix(1)).uri("http://localhost:8081/stats/"))
//				.build();
//	}


}
