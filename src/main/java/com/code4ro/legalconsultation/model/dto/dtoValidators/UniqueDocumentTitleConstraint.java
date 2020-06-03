package com.code4ro.legalconsultation.model.dto.dtoValidators;

import com.code4ro.legalconsultation.service.impl.validators.DocumentMetadataTitleValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = DocumentMetadataTitleValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueDocumentTitleConstraint {
    String message() default "document.save.duplicatedTitle";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
