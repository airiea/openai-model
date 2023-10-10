package com.airiea.openai.model.resource;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class FunctionCall {
    @NonNull
    String name;

    @NonNull
    String arguments;
}
