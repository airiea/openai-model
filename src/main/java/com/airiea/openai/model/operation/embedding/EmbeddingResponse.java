package com.airiea.openai.model.operation.embedding;

import com.airiea.openai.model.resource.Usage;
import lombok.Data;

import java.util.List;

@Data
public class EmbeddingResponse {
    String model;
    String object;
    List<Embedding> data;
    Usage usage;
}
