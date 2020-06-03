package com.code4ro.legalconsultation.service.impl.validators;

import com.code4ro.legalconsultation.model.dto.dtoValidators.UniqueDocumentNodeTitleConstraint;
import com.code4ro.legalconsultation.repository.DocumentNodeRepository;
import lombok.AllArgsConstructor;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@AllArgsConstructor
public class DocumentNodeTitleValidator implements ConstraintValidator<UniqueDocumentNodeTitleConstraint, String> {
    private final DocumentNodeRepository documentNodeRepository;

    @Override
    public boolean isValid(String title, ConstraintValidatorContext constraintValidatorContext) {
        return !documentNodeRepository.existsByTitle(title);
    }
}
