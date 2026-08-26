package org.openapitools.api.consumer;

import org.openapitools.model.CreateCompletionRequest;
import org.openapitools.model.CreateCompletionResponse;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.CompletionsService;
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
@RequestMapping("/completions")
public class CompletionsServiceController {

    @DubboReference
    private CompletionsService completionsService;

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public CreateCompletionResponse createCompletion(
        @RequestParam(name = "createCompletionRequest") CreateCompletionRequest createCompletionRequest
    ) {
        return completionsService.createCompletion(createCompletionRequest);
    }
}
