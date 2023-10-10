package com.airiea.openai.model.operation.chat;

import com.airiea.openai.model.resource.Choice;
import com.airiea.openai.model.resource.Usage;
import lombok.Data;

import java.util.List;

@Data
public class ChatCompletion {
    String id;
    String object;
    Integer created;
    String model;
    List<Choice> choices;
    Usage usage;
}
