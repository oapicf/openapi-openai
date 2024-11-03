/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import org.openapitools.model.AssistantsApiNamedToolChoice;
import org.openapitools.model.ChatCompletionNamedToolChoiceFunction;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Controls which (if any) tool is called by the model. &#x60;none&#x60; means the model will not call any tools and instead generates a message. &#x60;auto&#x60; is the default value and means the model can pick between generating a message or calling a tool. Specifying a particular tool like &#x60;{\&quot;type\&quot;: \&quot;TOOL_TYPE\&quot;}&#x60; or &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that tool. 
 */
@Schema(name = "AssistantsApiToolChoiceOption", description = "Controls which (if any) tool is called by the model. `none` means the model will not call any tools and instead generates a message. `auto` is the default value and means the model can pick between generating a message or calling a tool. Specifying a particular tool like `{\"type\": \"TOOL_TYPE\"}` or `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool. ")
@JsonPropertyOrder({
  AssistantsApiToolChoiceOption.JSON_PROPERTY_TYPE,
  AssistantsApiToolChoiceOption.JSON_PROPERTY_FUNCTION
})
@JsonTypeName("AssistantsApiToolChoiceOption")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-03T11:06:54.019288922Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class AssistantsApiToolChoiceOption {
    /**
     * The type of the tool. If type is &#x60;function&#x60;, the function name must be set
     */
    public enum TypeEnum {
        FUNCTION("function"),
        CODE_INTERPRETER("code_interpreter"),
        RETRIEVAL("retrieval");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_TYPE = "type";
    private TypeEnum type;

    public static final String JSON_PROPERTY_FUNCTION = "function";
    private ChatCompletionNamedToolChoiceFunction function;

    public AssistantsApiToolChoiceOption(TypeEnum type) {
        this.type = type;
    }

    public AssistantsApiToolChoiceOption type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The type of the tool. If type is &#x60;function&#x60;, the function name must be set
     * @return type
     */
    @NotNull
    @Schema(name = "type", description = "The type of the tool. If type is `function`, the function name must be set", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public TypeEnum getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setType(TypeEnum type) {
        this.type = type;
    }

    public AssistantsApiToolChoiceOption function(ChatCompletionNamedToolChoiceFunction function) {
        this.function = function;
        return this;
    }

    /**
     * Get function
     * @return function
     */
    @Valid
    @Nullable
    @Schema(name = "function", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_FUNCTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ChatCompletionNamedToolChoiceFunction getFunction() {
        return function;
    }

    @JsonProperty(JSON_PROPERTY_FUNCTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFunction(ChatCompletionNamedToolChoiceFunction function) {
        this.function = function;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssistantsApiToolChoiceOption assistantsApiToolChoiceOption = (AssistantsApiToolChoiceOption) o;
        return Objects.equals(this.type, assistantsApiToolChoiceOption.type) &&
            Objects.equals(this.function, assistantsApiToolChoiceOption.function);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, function);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssistantsApiToolChoiceOption {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    function: ").append(toIndentedString(function)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

