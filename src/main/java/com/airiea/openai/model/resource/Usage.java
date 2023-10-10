package com.airiea.openai.model.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Usage {
    @JsonProperty("prompt_tokens")
    Integer promptTokens;

    @JsonProperty("completion_tokens")
    Integer completionTokens;

    @JsonProperty("total_tokens")
    Integer totalTokens;
}
