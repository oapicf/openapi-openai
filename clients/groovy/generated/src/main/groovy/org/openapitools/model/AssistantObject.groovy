package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AssistantObjectToolResources;
import org.openapitools.model.AssistantObjectToolsInner;
import org.openapitools.model.AssistantsApiResponseFormatOption;

@Canonical
class AssistantObject {
    /* The identifier, which can be referenced in API endpoints. */
    String id

    enum ObjectEnum {
    
        ASSISTANT("assistant")
    
        private final String value
    
        ObjectEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The object type, which is always `assistant`. */
    ObjectEnum _object
    /* The Unix timestamp (in seconds) for when the assistant was created. */
    Integer createdAt
    /* The name of the assistant. The maximum length is 256 characters.  */
    String name
    /* The description of the assistant. The maximum length is 512 characters.  */
    String description
    /* ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them.  */
    String model
    /* The system instructions that the assistant uses. The maximum length is 256,000 characters.  */
    String instructions
    /* A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`.  */
    List<AssistantObjectToolsInner> tools = new ArrayList<>()
    
    AssistantObjectToolResources toolResources
    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    Object metadata
    /* What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  */
    BigDecimal temperature = new BigDecimal("1")
    /* An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.  */
    BigDecimal topP = new BigDecimal("1")
    
    AssistantsApiResponseFormatOption responseFormat
}
