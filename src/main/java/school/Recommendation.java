package school;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class Recommendation {

    private Student indicator;
    private Student nominated;
    private LocalDateTime recommendationDate;

    public Recommendation(Student indicator, Student nominated){
        this.indicator = indicator;
        this.nominated = nominated;
        this.recommendationDate = LocalDateTime.now();
    }
}
