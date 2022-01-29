package br.com.cleanarch.school.core.domain.recommendation;

import br.com.cleanarch.school.core.domain.student.Student;
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

    public Recommendation(Student indicator, Student nominated, LocalDateTime date){
        this.indicator = indicator;
        this.nominated = nominated;
        this.recommendationDate = date;
    }
}
