package com.code4ro.legalconsultation.model.dto;

import com.code4ro.legalconsultation.model.dto.dtoValidators.UniqueDocumentFilePath;
import com.code4ro.legalconsultation.model.dto.dtoValidators.UniqueDocumentNumberConstraint;
import com.code4ro.legalconsultation.model.dto.dtoValidators.UniqueDocumentTitleConstraint;
import com.code4ro.legalconsultation.model.persistence.DocumentType;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.math.BigInteger;
import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DocumentViewDto {
    @NotNull(message = "document.save.number.null")
    @UniqueDocumentNumberConstraint
    private BigInteger documentNumber;

    @NotNull(message = "document.save.title.null")
    @UniqueDocumentTitleConstraint
    private String documentTitle;

    @NotNull(message = "document.save.initializer.null")
    private String documentInitializer;

    @NotNull(message = "document.save.type.null")
    private DocumentType documentType;

    @NotNull(message = "document.save.develop.null")
    private Date dateOfDevelopment;

    @NotNull(message = "document.save.receiving.null")
    private Date dateOfReceipt;

    @NotNull(message = "document.save.filePath.null")
    @UniqueDocumentFilePath
    private String filePath;

}
