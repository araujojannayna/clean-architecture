package school;

import lombok.Getter;

@Getter
public class Recommendation {

    private Student indicator;
    private Student nominated;

    public Recommendation(Student indicator, Student nominated){
        this.indicator = indicator;
        this.nominated = nominated;
    }
}
