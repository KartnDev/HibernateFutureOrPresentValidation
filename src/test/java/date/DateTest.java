package date;

import jakarta.validation.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Set;


public class DateTest {

    private static Validator validator;
    static {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.usingContext().getValidator();
    }

    @Test
    void testDateValidationNow() {
        var dateTestDTO = new DateTestDTO();
        dateTestDTO.setDate(new Date());
        Set<ConstraintViolation<Object>> validate = validator.validate(dateTestDTO);

        Assertions.assertEquals(0, validate.size());
    }

    @Test
    void testLocalDateValidationNow() {
        var dateTestDTO = new LocalDateTestDTO();
        dateTestDTO.setDate(LocalDate.now());
        Set<ConstraintViolation<Object>> validate = validator.validate(dateTestDTO);

        Assertions.assertEquals(0, validate.size());
    }

    @Test
    void testLocalDateTimeValidationNow() {
        var dateTestDTO = new LocalDateTimeTestDTO();
        dateTestDTO.setDate(LocalDateTime.now());
        //dateTestDTO.setDate(LocalDateTime.now().plus(100, ChronoUnit.MILLIS)); -> should works for windows
        Set<ConstraintViolation<Object>> validate = validator.validate(dateTestDTO);

        Assertions.assertEquals(0, validate.size());
    }
}
