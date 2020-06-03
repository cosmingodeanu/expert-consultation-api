package com.code4ro.legalconsultation.model.dto.documentnode;

import com.code4ro.legalconsultation.model.dto.BaseEntityDto;
import com.code4ro.legalconsultation.model.dto.dtoValidators.UniqueDocumentNodeContentConstraint;
import com.code4ro.legalconsultation.model.dto.dtoValidators.UniqueDocumentNodeTitleConstraint;
import com.code4ro.legalconsultation.model.persistence.DocumentNodeType;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Size;
import java.math.BigInteger;
import java.util.List;

@Getter
@Setter
public class DocumentNodeDto extends BaseEntityDto {
    private List<DocumentNodeDto> children;
    private DocumentNodeType documentNodeType;
    @Size(max = 255)
    @UniqueDocumentNodeTitleConstraint
    private String title;
    @UniqueDocumentNodeContentConstraint
    private String content;
    @Size(max = 255)
    private String identifier;

    private BigInteger numberOfComments;
}
