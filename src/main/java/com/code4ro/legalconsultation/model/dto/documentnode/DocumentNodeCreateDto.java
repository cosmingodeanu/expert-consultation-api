package com.code4ro.legalconsultation.model.dto.documentnode;

import com.code4ro.legalconsultation.model.dto.dtoValidators.UniqueDocumentNodeContentConstraint;
import com.code4ro.legalconsultation.model.dto.dtoValidators.UniqueDocumentNodeTitleConstraint;
import com.code4ro.legalconsultation.model.persistence.DocumentNodeType;
import lombok.Data;

import javax.validation.constraints.Size;
import java.util.UUID;

@Data
public class DocumentNodeCreateDto {
    private UUID parentId;
    private DocumentNodeType documentNodeType;
    @Size(max = 255)
    @UniqueDocumentNodeTitleConstraint
    private String title;
    @UniqueDocumentNodeContentConstraint
    private String content;
    @Size(max = 255)
    private String identifier;
}
