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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * CreateMessageRequest
 */
@JsonPropertyOrder({
  CreateMessageRequest.JSON_PROPERTY_ROLE,
  CreateMessageRequest.JSON_PROPERTY_CONTENT,
  CreateMessageRequest.JSON_PROPERTY_FILE_IDS,
  CreateMessageRequest.JSON_PROPERTY_METADATA
})
@JsonTypeName("CreateMessageRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-03T11:06:54.019288922Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class CreateMessageRequest {
    /**
     * The role of the entity that is creating the message. Allowed values include: - &#x60;user&#x60;: Indicates the message is sent by an actual user and should be used in most cases to represent user-generated messages. - &#x60;assistant&#x60;: Indicates the message is generated by the assistant. Use this value to insert messages from the assistant into the conversation. 
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
    private String content;

    public static final String JSON_PROPERTY_FILE_IDS = "file_ids";
    private List<String> fileIds = null;

    public static final String JSON_PROPERTY_METADATA = "metadata";
    private Object metadata;

    public CreateMessageRequest(RoleEnum role, String content) {
        this.role = role;
        this.content = content;
    }

    public CreateMessageRequest role(RoleEnum role) {
        this.role = role;
        return this;
    }

    /**
     * The role of the entity that is creating the message. Allowed values include: - &#x60;user&#x60;: Indicates the message is sent by an actual user and should be used in most cases to represent user-generated messages. - &#x60;assistant&#x60;: Indicates the message is generated by the assistant. Use this value to insert messages from the assistant into the conversation. 
     * @return role
     */
    @NotNull
    @Schema(name = "role", description = "The role of the entity that is creating the message. Allowed values include: - `user`: Indicates the message is sent by an actual user and should be used in most cases to represent user-generated messages. - `assistant`: Indicates the message is generated by the assistant. Use this value to insert messages from the assistant into the conversation. ", requiredMode = Schema.RequiredMode.REQUIRED)
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

    public CreateMessageRequest content(String content) {
        this.content = content;
        return this;
    }

    /**
     * The content of the message.
     * @return content
     */
    @NotNull
    @Size(min=1, max=256000)
    @Schema(name = "content", description = "The content of the message.", requiredMode = Schema.RequiredMode.REQUIRED)
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

    public CreateMessageRequest fileIds(List<String> fileIds) {
        this.fileIds = fileIds;
        return this;
    }

    public CreateMessageRequest addFileIdsItem(String fileIdsItem) {
        if (this.fileIds == null) {
            this.fileIds = new ArrayList<>();
        }
        this.fileIds.add(fileIdsItem);
        return this;
    }

    /**
     * A list of [File](/docs/api-reference/files) IDs that the message should use. There can be a maximum of 10 files attached to a message. Useful for tools like &#x60;retrieval&#x60; and &#x60;code_interpreter&#x60; that can access and use files.
     * @return fileIds
     */
    @Nullable
    @Size(min=1, max=10)
    @Schema(name = "file_ids", description = "A list of [File](/docs/api-reference/files) IDs that the message should use. There can be a maximum of 10 files attached to a message. Useful for tools like `retrieval` and `code_interpreter` that can access and use files.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

    public CreateMessageRequest metadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
     * @return metadata
     */
    @Nullable
    @Schema(name = "metadata", description = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_METADATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Object getMetadata() {
        return metadata;
    }

    @JsonProperty(JSON_PROPERTY_METADATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateMessageRequest createMessageRequest = (CreateMessageRequest) o;
        return Objects.equals(this.role, createMessageRequest.role) &&
            Objects.equals(this.content, createMessageRequest.content) &&
            Objects.equals(this.fileIds, createMessageRequest.fileIds) &&
            Objects.equals(this.metadata, createMessageRequest.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role, content, fileIds, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMessageRequest {\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

