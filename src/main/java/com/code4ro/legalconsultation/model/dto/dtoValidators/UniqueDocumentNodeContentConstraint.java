package com.code4ro.legalconsultation.model.dto.dtoValidators;

import com.code4ro.legalconsultation.service.impl.validators.DocumentNodeContentValidator;
import com.code4ro.legalconsultation.service.impl.validators.DocumentNodeTitleValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = DocumentNodeContentValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueDocumentNodeContentConstraint {
    String message() default "document.save.duplicatedContent";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
