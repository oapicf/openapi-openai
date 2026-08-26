package org.openapitools.api.consumer;

import org.openapitools.model.CreateChatCompletionRequest;
import org.openapitools.model.CreateChatCompletionResponse;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.ChatService;
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
@RequestMapping("/chat")
public class ChatServiceController {

    @DubboReference
    private ChatService chatService;

    @RequestMapping(method = RequestMethod.POST, value = "/completions")
    public CreateChatCompletionResponse createChatCompletion(
        @RequestParam(name = "createChatCompletionRequest") CreateChatCompletionRequest createChatCompletionRequest
    ) {
        return chatService.createChatCompletion(createChatCompletionRequest);
    }
}
