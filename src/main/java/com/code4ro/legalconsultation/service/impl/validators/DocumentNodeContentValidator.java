package com.code4ro.legalconsultation.service.impl.validators;

import com.code4ro.legalconsultation.model.dto.dtoValidators.UniqueDocumentNodeContentConstraint;
import com.code4ro.legalconsultation.repository.DocumentNodeRepository;
import lombok.AllArgsConstructor;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@AllArgsConstructor
public class DocumentNodeContentValidator implements ConstraintValidator<UniqueDocumentNodeContentConstraint, String> {
    private final DocumentNodeRepository documentNodeRepository;

    @Override
    public boolean isValid(String content, ConstraintValidatorContext constraintValidatorContext) {
        return !documentNodeRepository.existsByContent(content);
    }
}
