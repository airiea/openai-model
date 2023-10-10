package com.airiea.openai.model.resource;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Function {
    @NonNull
    String name;

    String description;
}
