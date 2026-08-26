package org.openapitools.api.interfaces;

import org.openapitools.model.AssistantObject;
import org.openapitools.model.CreateAssistantRequest;
import org.openapitools.model.DeleteAssistantResponse;
import org.openapitools.model.ListAssistantsResponse;
import org.openapitools.model.ModifyAssistantRequest;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface AssistantsService {

    /**
     * Create an assistant with a model and instructions.
     * 
     *
     * @param createAssistantRequest  (required)
     * @return AssistantObject
     */
    AssistantObject createAssistant(
        CreateAssistantRequest createAssistantRequest
    );

    /**
     * Delete an assistant.
     * 
     *
     * @param assistantId The ID of the assistant to delete. (required)
     * @return DeleteAssistantResponse
     */
    DeleteAssistantResponse deleteAssistant(
        String assistantId
    );

    /**
     * Retrieves an assistant.
     * 
     *
     * @param assistantId The ID of the assistant to retrieve. (required)
     * @return AssistantObject
     */
    AssistantObject getAssistant(
        String assistantId
    );

    /**
     * Returns a list of assistants.
     * 
     *
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @return ListAssistantsResponse
     */
    ListAssistantsResponse listAssistants(
        Integer limit,
        String order,
        String after,
        String before
    );

    /**
     * Modifies an assistant.
     * 
     *
     * @param assistantId The ID of the assistant to modify. (required)
     * @param modifyAssistantRequest  (required)
     * @return AssistantObject
     */
    AssistantObject modifyAssistant(
        String assistantId,
        ModifyAssistantRequest modifyAssistantRequest
    );
}
