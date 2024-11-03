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
import org.openapitools.model.AssistantObjectToolsInner;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Represents an &#x60;assistant&#x60; that can call the model and use tools.
 */
@Schema(name = "AssistantObject", description = "Represents an `assistant` that can call the model and use tools.")
@JsonPropertyOrder({
  AssistantObject.JSON_PROPERTY_ID,
  AssistantObject.JSON_PROPERTY_OBJECT,
  AssistantObject.JSON_PROPERTY_CREATED_AT,
  AssistantObject.JSON_PROPERTY_NAME,
  AssistantObject.JSON_PROPERTY_DESCRIPTION,
  AssistantObject.JSON_PROPERTY_MODEL,
  AssistantObject.JSON_PROPERTY_INSTRUCTIONS,
  AssistantObject.JSON_PROPERTY_TOOLS,
  AssistantObject.JSON_PROPERTY_FILE_IDS,
  AssistantObject.JSON_PROPERTY_METADATA
})
@JsonTypeName("AssistantObject")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-03T11:06:54.019288922Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class AssistantObject {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    /**
     * The object type, which is always &#x60;assistant&#x60;.
     */
    public enum ObjectEnum {
        ASSISTANT("assistant");

        private String value;

        ObjectEnum(String value) {
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
        public static ObjectEnum fromValue(String value) {
            for (ObjectEnum b : ObjectEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_OBJECT = "object";
    private ObjectEnum _object;

    public static final String JSON_PROPERTY_CREATED_AT = "created_at";
    private Integer createdAt;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    private String description;

    public static final String JSON_PROPERTY_MODEL = "model";
    private String model;

    public static final String JSON_PROPERTY_INSTRUCTIONS = "instructions";
    private String instructions;

    public static final String JSON_PROPERTY_TOOLS = "tools";
    private List<AssistantObjectToolsInner> tools = new ArrayList<>();

    public static final String JSON_PROPERTY_FILE_IDS = "file_ids";
    private List<String> fileIds = new ArrayList<>();

    public static final String JSON_PROPERTY_METADATA = "metadata";
    private Object metadata;

    public AssistantObject(String id, ObjectEnum _object, Integer createdAt, String name, String description, String model, String instructions, List<AssistantObjectToolsInner> tools, List<String> fileIds, Object metadata) {
        this.id = id;
        this._object = _object;
        this.createdAt = createdAt;
        this.name = name;
        this.description = description;
        this.model = model;
        this.instructions = instructions;
        this.tools = tools;
        this.fileIds = fileIds;
        this.metadata = metadata;
    }

    public AssistantObject id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The identifier, which can be referenced in API endpoints.
     * @return id
     */
    @NotNull
    @Schema(name = "id", description = "The identifier, which can be referenced in API endpoints.", requiredMode = Schema.RequiredMode.REQUIRED)
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

    public AssistantObject _object(ObjectEnum _object) {
        this._object = _object;
        return this;
    }

    /**
     * The object type, which is always &#x60;assistant&#x60;.
     * @return _object
     */
    @NotNull
    @Schema(name = "object", description = "The object type, which is always `assistant`.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_OBJECT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public ObjectEnum getObject() {
        return _object;
    }

    @JsonProperty(JSON_PROPERTY_OBJECT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    public AssistantObject createdAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The Unix timestamp (in seconds) for when the assistant was created.
     * @return createdAt
     */
    @NotNull
    @Schema(name = "created_at", description = "The Unix timestamp (in seconds) for when the assistant was created.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getCreatedAt() {
        return createdAt;
    }

    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public AssistantObject name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the assistant. The maximum length is 256 characters. 
     * @return name
     */
    @Nullable
    @Size(max=256)
    @Schema(name = "name", description = "The name of the assistant. The maximum length is 256 characters. ", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setName(String name) {
        this.name = name;
    }

    public AssistantObject description(String description) {
        this.description = description;
        return this;
    }

    /**
     * The description of the assistant. The maximum length is 512 characters. 
     * @return description
     */
    @Nullable
    @Size(max=512)
    @Schema(name = "description", description = "The description of the assistant. The maximum length is 512 characters. ", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getDescription() {
        return description;
    }

    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDescription(String description) {
        this.description = description;
    }

    public AssistantObject model(String model) {
        this.model = model;
        return this;
    }

    /**
     * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
     * @return model
     */
    @NotNull
    @Schema(name = "model", description = "ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. ", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_MODEL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getModel() {
        return model;
    }

    @JsonProperty(JSON_PROPERTY_MODEL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setModel(String model) {
        this.model = model;
    }

    public AssistantObject instructions(String instructions) {
        this.instructions = instructions;
        return this;
    }

    /**
     * The system instructions that the assistant uses. The maximum length is 256,000 characters. 
     * @return instructions
     */
    @Nullable
    @Size(max=256000)
    @Schema(name = "instructions", description = "The system instructions that the assistant uses. The maximum length is 256,000 characters. ", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_INSTRUCTIONS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getInstructions() {
        return instructions;
    }

    @JsonProperty(JSON_PROPERTY_INSTRUCTIONS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public AssistantObject tools(List<AssistantObjectToolsInner> tools) {
        this.tools = tools;
        return this;
    }

    public AssistantObject addToolsItem(AssistantObjectToolsInner toolsItem) {
        this.tools.add(toolsItem);
        return this;
    }

    /**
     * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;. 
     * @return tools
     */
    @NotNull
    @Size(max=128)
    @Schema(name = "tools", description = "A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. ", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_TOOLS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<AssistantObjectToolsInner> getTools() {
        return tools;
    }

    @JsonProperty(JSON_PROPERTY_TOOLS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTools(List<AssistantObjectToolsInner> tools) {
        this.tools = tools;
    }

    public AssistantObject fileIds(List<String> fileIds) {
        this.fileIds = fileIds;
        return this;
    }

    public AssistantObject addFileIdsItem(String fileIdsItem) {
        this.fileIds.add(fileIdsItem);
        return this;
    }

    /**
     * A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. 
     * @return fileIds
     */
    @NotNull
    @Size(max=20)
    @Schema(name = "file_ids", description = "A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. ", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_FILE_IDS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<String> getFileIds() {
        return fileIds;
    }

    @JsonProperty(JSON_PROPERTY_FILE_IDS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setFileIds(List<String> fileIds) {
        this.fileIds = fileIds;
    }

    public AssistantObject metadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
     * @return metadata
     */
    @Nullable
    @Schema(name = "metadata", description = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. ", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_METADATA)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Object getMetadata() {
        return metadata;
    }

    @JsonProperty(JSON_PROPERTY_METADATA)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
        AssistantObject assistantObject = (AssistantObject) o;
        return Objects.equals(this.id, assistantObject.id) &&
            Objects.equals(this._object, assistantObject._object) &&
            Objects.equals(this.createdAt, assistantObject.createdAt) &&
            Objects.equals(this.name, assistantObject.name) &&
            Objects.equals(this.description, assistantObject.description) &&
            Objects.equals(this.model, assistantObject.model) &&
            Objects.equals(this.instructions, assistantObject.instructions) &&
            Objects.equals(this.tools, assistantObject.tools) &&
            Objects.equals(this.fileIds, assistantObject.fileIds) &&
            Objects.equals(this.metadata, assistantObject.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, _object, createdAt, name, description, model, instructions, tools, fileIds, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssistantObject {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
        sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
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

