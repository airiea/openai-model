package com.airiea.openai.model.operation.embedding;

import lombok.Builder;
import lombok.Data;

import java.util.List;


@Data
@Builder
public class EmbeddingRequest {
    String model;
    List<String> input;
}
