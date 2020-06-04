package com.code4ro.legalconsultation.service.impl.validators;

import com.code4ro.legalconsultation.model.dto.dtoValidators.UniqueDocumentTitleConstraint;
import com.code4ro.legalconsultation.repository.DocumentMetadataRepository;
import lombok.AllArgsConstructor;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@AllArgsConstructor
public class DocumentMetadataTitleValidator implements ConstraintValidator<UniqueDocumentTitleConstraint, String> {
    private DocumentMetadataRepository documentMetadataRepository;

    @Override
    public boolean isValid(String title, ConstraintValidatorContext constraintValidatorContext) {
        return !documentMetadataRepository.existsByDocumentTitle(title);
    }
}
