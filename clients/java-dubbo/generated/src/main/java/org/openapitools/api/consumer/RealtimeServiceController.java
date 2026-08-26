package org.openapitools.api.consumer;

import org.openapitools.model.RealtimeSessionCreateRequest;
import org.openapitools.model.RealtimeSessionCreateResponse;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.RealtimeService;
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
@RequestMapping("/realtime")
public class RealtimeServiceController {

    @DubboReference
    private RealtimeService realtimeService;

    @RequestMapping(method = RequestMethod.POST, value = "/sessions")
    public RealtimeSessionCreateResponse createRealtimeSession(
        @RequestParam(name = "realtimeSessionCreateRequest") RealtimeSessionCreateRequest realtimeSessionCreateRequest
    ) {
        return realtimeService.createRealtimeSession(realtimeSessionCreateRequest);
    }
}
