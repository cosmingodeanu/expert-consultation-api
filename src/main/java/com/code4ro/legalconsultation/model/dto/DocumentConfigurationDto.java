package com.code4ro.legalconsultation.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DocumentConfigurationDto extends BaseEntityDto {
    private Boolean openForCommenting;
    private Boolean openForVotingComments;
}
