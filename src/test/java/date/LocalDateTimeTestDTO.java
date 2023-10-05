package date;

import jakarta.validation.constraints.FutureOrPresent;

import java.time.LocalDateTime;

public class LocalDateTimeTestDTO {

    @FutureOrPresent
    private LocalDateTime date;

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
