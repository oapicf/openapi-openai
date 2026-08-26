package org.openapitools.api.interfaces;

import org.openapitools.model.CreateEmbeddingRequest;
import org.openapitools.model.CreateEmbeddingResponse;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface EmbeddingsService {

    /**
     * Creates an embedding vector representing the input text.
     * 
     *
     * @param createEmbeddingRequest  (required)
     * @return CreateEmbeddingResponse
     */
    CreateEmbeddingResponse createEmbedding(
        CreateEmbeddingRequest createEmbeddingRequest
    );
}
