package org.openapitools.api.consumer;

import org.openapitools.model.AssistantObject;
import org.openapitools.model.CreateAssistantRequest;
import org.openapitools.model.DeleteAssistantResponse;
import org.openapitools.model.ListAssistantsResponse;
import org.openapitools.model.ModifyAssistantRequest;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.AssistantsService;
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
@RequestMapping("/assistants")
public class AssistantsServiceController {

    @DubboReference
    private AssistantsService assistantsService;

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public AssistantObject createAssistant(
        @RequestParam(name = "createAssistantRequest") CreateAssistantRequest createAssistantRequest
    ) {
        return assistantsService.createAssistant(createAssistantRequest);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{assistant_id}")
    public DeleteAssistantResponse deleteAssistant(
        @RequestParam(name = "assistantId") String assistantId
    ) {
        return assistantsService.deleteAssistant(assistantId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{assistant_id}")
    public AssistantObject getAssistant(
        @RequestParam(name = "assistantId") String assistantId
    ) {
        return assistantsService.getAssistant(assistantId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public ListAssistantsResponse listAssistants(
        @RequestParam(name = "limit", defaultValue = "20") Integer limit,
        @RequestParam(name = "order", defaultValue = "desc") String order,
        @RequestParam(name = "after") String after,
        @RequestParam(name = "before") String before
    ) {
        return assistantsService.listAssistants(limit, order, after, before);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{assistant_id}")
    public AssistantObject modifyAssistant(
        @RequestParam(name = "assistantId") String assistantId,
        @RequestParam(name = "modifyAssistantRequest") ModifyAssistantRequest modifyAssistantRequest
    ) {
        return assistantsService.modifyAssistant(assistantId, modifyAssistantRequest);
    }
}
