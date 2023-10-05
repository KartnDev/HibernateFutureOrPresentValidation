package date;

import jakarta.validation.constraints.FutureOrPresent;

import java.time.LocalDate;

public class LocalDateTestDTO {

    @FutureOrPresent
    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
