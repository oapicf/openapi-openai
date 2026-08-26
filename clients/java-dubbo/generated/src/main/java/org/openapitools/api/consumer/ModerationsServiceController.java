package org.openapitools.api.consumer;

import org.openapitools.model.CreateModerationRequest;
import org.openapitools.model.CreateModerationResponse;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.ModerationsService;
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
@RequestMapping("/moderations")
public class ModerationsServiceController {

    @DubboReference
    private ModerationsService moderationsService;

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public CreateModerationResponse createModeration(
        @RequestParam(name = "createModerationRequest") CreateModerationRequest createModerationRequest
    ) {
        return moderationsService.createModeration(createModerationRequest);
    }
}
