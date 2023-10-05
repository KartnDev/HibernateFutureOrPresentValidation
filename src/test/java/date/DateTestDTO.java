package date;

import jakarta.validation.constraints.FutureOrPresent;

import java.util.Date;

public class DateTestDTO {

    @FutureOrPresent
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
