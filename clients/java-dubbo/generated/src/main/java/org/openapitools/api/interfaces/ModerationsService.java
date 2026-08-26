package org.openapitools.api.interfaces;

import org.openapitools.model.CreateModerationRequest;
import org.openapitools.model.CreateModerationResponse;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface ModerationsService {

    /**
     * Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 
     * 
     *
     * @param createModerationRequest  (required)
     * @return CreateModerationResponse
     */
    CreateModerationResponse createModeration(
        CreateModerationRequest createModerationRequest
    );
}
