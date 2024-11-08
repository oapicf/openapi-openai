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
import org.openapitools.model.ChatCompletionMessageToolCallFunction;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * ChatCompletionMessageToolCall
 */
@JsonPropertyOrder({
  ChatCompletionMessageToolCall.JSON_PROPERTY_ID,
  ChatCompletionMessageToolCall.JSON_PROPERTY_TYPE,
  ChatCompletionMessageToolCall.JSON_PROPERTY_FUNCTION
})
@JsonTypeName("ChatCompletionMessageToolCall")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-03T11:06:40.431829781Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class ChatCompletionMessageToolCall {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    /**
     * The type of the tool. Currently, only &#x60;function&#x60; is supported.
     */
    public enum TypeEnum {
        FUNCTION("function");

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
    private ChatCompletionMessageToolCallFunction function;

    public ChatCompletionMessageToolCall(String id, TypeEnum type, ChatCompletionMessageToolCallFunction function) {
        this.id = id;
        this.type = type;
        this.function = function;
    }

    public ChatCompletionMessageToolCall id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The ID of the tool call.
     * @return id
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setId(String id) {
        this.id = id;
    }

    public ChatCompletionMessageToolCall type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The type of the tool. Currently, only &#x60;function&#x60; is supported.
     * @return type
     */
    @NotNull
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

    public ChatCompletionMessageToolCall function(ChatCompletionMessageToolCallFunction function) {
        this.function = function;
        return this;
    }

    /**
     * Get function
     * @return function
     */
    @Valid
    @NotNull
    @JsonProperty(JSON_PROPERTY_FUNCTION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public ChatCompletionMessageToolCallFunction getFunction() {
        return function;
    }

    @JsonProperty(JSON_PROPERTY_FUNCTION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setFunction(ChatCompletionMessageToolCallFunction function) {
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
        ChatCompletionMessageToolCall chatCompletionMessageToolCall = (ChatCompletionMessageToolCall) o;
        return Objects.equals(this.id, chatCompletionMessageToolCall.id) &&
            Objects.equals(this.type, chatCompletionMessageToolCall.type) &&
            Objects.equals(this.function, chatCompletionMessageToolCall.function);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, function);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatCompletionMessageToolCall {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

