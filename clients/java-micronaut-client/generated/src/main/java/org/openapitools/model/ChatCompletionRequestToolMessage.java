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
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * ChatCompletionRequestToolMessage
 */
@JsonPropertyOrder({
  ChatCompletionRequestToolMessage.JSON_PROPERTY_ROLE,
  ChatCompletionRequestToolMessage.JSON_PROPERTY_CONTENT,
  ChatCompletionRequestToolMessage.JSON_PROPERTY_TOOL_CALL_ID
})
@JsonTypeName("ChatCompletionRequestToolMessage")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-03T11:06:40.431829781Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class ChatCompletionRequestToolMessage {
    /**
     * The role of the messages author, in this case &#x60;tool&#x60;.
     */
    public enum RoleEnum {
        TOOL("tool");

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

    public static final String JSON_PROPERTY_TOOL_CALL_ID = "tool_call_id";
    private String toolCallId;

    public ChatCompletionRequestToolMessage(RoleEnum role, String content, String toolCallId) {
        this.role = role;
        this.content = content;
        this.toolCallId = toolCallId;
    }

    public ChatCompletionRequestToolMessage role(RoleEnum role) {
        this.role = role;
        return this;
    }

    /**
     * The role of the messages author, in this case &#x60;tool&#x60;.
     * @return role
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_ROLE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public RoleEnum getRole() {
        return role;
    }

    @JsonProperty(JSON_PROPERTY_ROLE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setRole(RoleEnum role) {
        this.role = role;
    }

    public ChatCompletionRequestToolMessage content(String content) {
        this.content = content;
        return this;
    }

    /**
     * The contents of the tool message.
     * @return content
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_CONTENT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getContent() {
        return content;
    }

    @JsonProperty(JSON_PROPERTY_CONTENT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setContent(String content) {
        this.content = content;
    }

    public ChatCompletionRequestToolMessage toolCallId(String toolCallId) {
        this.toolCallId = toolCallId;
        return this;
    }

    /**
     * Tool call that this message is responding to.
     * @return toolCallId
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_TOOL_CALL_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getToolCallId() {
        return toolCallId;
    }

    @JsonProperty(JSON_PROPERTY_TOOL_CALL_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setToolCallId(String toolCallId) {
        this.toolCallId = toolCallId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChatCompletionRequestToolMessage chatCompletionRequestToolMessage = (ChatCompletionRequestToolMessage) o;
        return Objects.equals(this.role, chatCompletionRequestToolMessage.role) &&
            Objects.equals(this.content, chatCompletionRequestToolMessage.content) &&
            Objects.equals(this.toolCallId, chatCompletionRequestToolMessage.toolCallId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role, content, toolCallId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatCompletionRequestToolMessage {\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    toolCallId: ").append(toIndentedString(toolCallId)).append("\n");
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

