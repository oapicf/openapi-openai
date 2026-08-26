package org.openapitools.api.interfaces;

import org.openapitools.model.CreateCompletionRequest;
import org.openapitools.model.CreateCompletionResponse;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface CompletionsService {

    /**
     * Creates a completion for the provided prompt and parameters.
     * 
     *
     * @param createCompletionRequest  (required)
     * @return CreateCompletionResponse
     */
    CreateCompletionResponse createCompletion(
        CreateCompletionRequest createCompletionRequest
    );
}
