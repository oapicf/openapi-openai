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
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MessageDeltaObjectDeltaContentInner;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * The delta containing the fields that have changed on the Message.
 */
@Schema(name = "MessageDeltaObject_delta", description = "The delta containing the fields that have changed on the Message.")
@JsonPropertyOrder({
  MessageDeltaObjectDelta.JSON_PROPERTY_ROLE,
  MessageDeltaObjectDelta.JSON_PROPERTY_CONTENT,
  MessageDeltaObjectDelta.JSON_PROPERTY_FILE_IDS
})
@JsonTypeName("MessageDeltaObject_delta")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-03T11:06:54.019288922Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class MessageDeltaObjectDelta {
    /**
     * The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;.
     */
    public enum RoleEnum {
        USER("user"),
        ASSISTANT("assistant");

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
    private List<MessageDeltaObjectDeltaContentInner> content = null;

    public static final String JSON_PROPERTY_FILE_IDS = "file_ids";
    private List<String> fileIds = null;

    public MessageDeltaObjectDelta() {
    }

    public MessageDeltaObjectDelta role(RoleEnum role) {
        this.role = role;
        return this;
    }

    /**
     * The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;.
     * @return role
     */
    @Nullable
    @Schema(name = "role", description = "The entity that produced the message. One of `user` or `assistant`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

    public MessageDeltaObjectDelta content(List<MessageDeltaObjectDeltaContentInner> content) {
        this.content = content;
        return this;
    }

    public MessageDeltaObjectDelta addContentItem(MessageDeltaObjectDeltaContentInner contentItem) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        this.content.add(contentItem);
        return this;
    }

    /**
     * The content of the message in array of text and/or images.
     * @return content
     */
    @Nullable
    @Schema(name = "content", description = "The content of the message in array of text and/or images.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_CONTENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<MessageDeltaObjectDeltaContentInner> getContent() {
        return content;
    }

    @JsonProperty(JSON_PROPERTY_CONTENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setContent(List<MessageDeltaObjectDeltaContentInner> content) {
        this.content = content;
    }

    public MessageDeltaObjectDelta fileIds(List<String> fileIds) {
        this.fileIds = fileIds;
        return this;
    }

    public MessageDeltaObjectDelta addFileIdsItem(String fileIdsItem) {
        if (this.fileIds == null) {
            this.fileIds = new ArrayList<>();
        }
        this.fileIds.add(fileIdsItem);
        return this;
    }

    /**
     * A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
     * @return fileIds
     */
    @Nullable
    @Size(max=10)
    @Schema(name = "file_ids", description = "A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_FILE_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getFileIds() {
        return fileIds;
    }

    @JsonProperty(JSON_PROPERTY_FILE_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFileIds(List<String> fileIds) {
        this.fileIds = fileIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessageDeltaObjectDelta messageDeltaObjectDelta = (MessageDeltaObjectDelta) o;
        return Objects.equals(this.role, messageDeltaObjectDelta.role) &&
            Objects.equals(this.content, messageDeltaObjectDelta.content) &&
            Objects.equals(this.fileIds, messageDeltaObjectDelta.fileIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role, content, fileIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageDeltaObjectDelta {\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
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

