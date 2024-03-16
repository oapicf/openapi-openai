/*
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
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
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatCompletionRequestMessageFunctionCall;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ChatCompletionStreamResponseDelta
 */
@JsonPropertyOrder({
  ChatCompletionStreamResponseDelta.JSON_PROPERTY_ROLE,
  ChatCompletionStreamResponseDelta.JSON_PROPERTY_CONTENT,
  ChatCompletionStreamResponseDelta.JSON_PROPERTY_FUNCTION_CALL
})
@JsonTypeName("ChatCompletionStreamResponseDelta")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-03-16T01:12:38.762786439Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class ChatCompletionStreamResponseDelta {
    /**
     * The role of the author of this message.
     */
    public enum RoleEnum {
        SYSTEM("system"),
        USER("user"),
        ASSISTANT("assistant"),
        FUNCTION("function");

        private String value;

        RoleEnum(String value) {
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
        public static RoleEnum fromValue(String value) {
            for (RoleEnum b : RoleEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_ROLE = "role";
    private RoleEnum role;

    public static final String JSON_PROPERTY_CONTENT = "content";
    private String content;

    public static final String JSON_PROPERTY_FUNCTION_CALL = "function_call";
    private ChatCompletionRequestMessageFunctionCall functionCall;

    public ChatCompletionStreamResponseDelta() {
    }

    public ChatCompletionStreamResponseDelta role(RoleEnum role) {
        this.role = role;
        return this;
    }

    /**
     * The role of the author of this message.
     * @return role
     **/
    @Nullable
    @Schema(name = "role", description = "The role of the author of this message.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_ROLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public RoleEnum getRole() {
        return role;
    }

    @JsonProperty(JSON_PROPERTY_ROLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRole(RoleEnum role) {
        this.role = role;
    }

    public ChatCompletionStreamResponseDelta content(String content) {
        this.content = content;
        return this;
    }

    /**
     * The contents of the chunk message.
     * @return content
     **/
    @Nullable
    @Schema(name = "content", description = "The contents of the chunk message.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_CONTENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getContent() {
        return content;
    }

    @JsonProperty(JSON_PROPERTY_CONTENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setContent(String content) {
        this.content = content;
    }

    public ChatCompletionStreamResponseDelta functionCall(ChatCompletionRequestMessageFunctionCall functionCall) {
        this.functionCall = functionCall;
        return this;
    }

    /**
     * Get functionCall
     * @return functionCall
     **/
    @Valid
    @Nullable
    @Schema(name = "function_call", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_FUNCTION_CALL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ChatCompletionRequestMessageFunctionCall getFunctionCall() {
        return functionCall;
    }

    @JsonProperty(JSON_PROPERTY_FUNCTION_CALL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFunctionCall(ChatCompletionRequestMessageFunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChatCompletionStreamResponseDelta chatCompletionStreamResponseDelta = (ChatCompletionStreamResponseDelta) o;
        return Objects.equals(this.role, chatCompletionStreamResponseDelta.role) &&
            Objects.equals(this.content, chatCompletionStreamResponseDelta.content) &&
            Objects.equals(this.functionCall, chatCompletionStreamResponseDelta.functionCall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role, content, functionCall);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatCompletionStreamResponseDelta {\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    functionCall: ").append(toIndentedString(functionCall)).append("\n");
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

