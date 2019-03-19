package pl.maciejszczesny.movie_app.models.forms;

import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Data
public class MovieForm {

    private String title;
    private String author;
    @Min(1850)
    @Max(3000)
    private int year;
    private String shortSum;
    private String longSum;
    private String genre;
}
