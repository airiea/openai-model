package com.airiea.openai.model.operation.embedding;

import lombok.Data;

import java.util.List;

@Data
public class Embedding {
    String object;
    Integer index;
    List<Double> embedding;
}
