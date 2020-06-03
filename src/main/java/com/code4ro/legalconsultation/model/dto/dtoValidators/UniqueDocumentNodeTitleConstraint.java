package com.code4ro.legalconsultation.model.dto.dtoValidators;

import com.code4ro.legalconsultation.service.impl.validators.DocumentNodeTitleValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = DocumentNodeTitleValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueDocumentNodeTitleConstraint {
    String message() default "document.save.duplicatedTitle";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
