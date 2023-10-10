package com.airiea.openai.model.operation.chat;

import com.airiea.openai.model.resource.Message;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
@Builder
public class ChatCompletionRequest {
    @NonNull
    String model;

    @NonNull
    List<Message> messages;

    Double temperature;

    Integer n;

    Boolean stream;

    @JsonProperty("max_tokens")
    Integer maxTokens;
}
