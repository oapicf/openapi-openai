package org.openapitools.api.consumer;

import org.openapitools.model.CreateEmbeddingRequest;
import org.openapitools.model.CreateEmbeddingResponse;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.EmbeddingsService;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@RestController
@RequestMapping("/embeddings")
public class EmbeddingsServiceController {

    @DubboReference
    private EmbeddingsService embeddingsService;

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public CreateEmbeddingResponse createEmbedding(
        @RequestParam(name = "createEmbeddingRequest") CreateEmbeddingRequest createEmbeddingRequest
    ) {
        return embeddingsService.createEmbedding(createEmbeddingRequest);
    }
}
