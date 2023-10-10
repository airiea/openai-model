package com.airiea.openai.model.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Choice {
    Integer index;
    Message message;

    @JsonProperty("finish_reason")
    String finishReason;
}
