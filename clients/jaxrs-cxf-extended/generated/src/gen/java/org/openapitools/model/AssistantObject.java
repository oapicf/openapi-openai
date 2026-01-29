package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssistantObjectToolsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Represents an `assistant` that can call the model and use tools.
 */
@ApiModel(description="Represents an `assistant` that can call the model and use tools.")

public class AssistantObject  {
  
 /**
  * The identifier, which can be referenced in API endpoints.
  */
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints.")
  private String id;

public enum ObjectEnum {

    @JsonProperty("assistant") ASSISTANT(String.valueOf("assistant"));

    private String value;

    ObjectEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String value) {
        for (ObjectEnum b : ObjectEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The object type, which is always `assistant`.
  */
  @ApiModelProperty(required = true, value = "The object type, which is always `assistant`.")
  private ObjectEnum _object;

 /**
  * The Unix timestamp (in seconds) for when the assistant was created.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the assistant was created.")
  private Integer createdAt;

 /**
  * The name of the assistant. The maximum length is 256 characters. 
  */
  @ApiModelProperty(required = true, value = "The name of the assistant. The maximum length is 256 characters. ")
  private String name;

 /**
  * The description of the assistant. The maximum length is 512 characters. 
  */
  @ApiModelProperty(required = true, value = "The description of the assistant. The maximum length is 512 characters. ")
  private String description;

 /**
  * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
  */
  @ApiModelProperty(required = true, value = "ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. ")
  private String model;

 /**
  * The system instructions that the assistant uses. The maximum length is 256,000 characters. 
  */
  @ApiModelProperty(required = true, value = "The system instructions that the assistant uses. The maximum length is 256,000 characters. ")
  private String instructions;

 /**
  * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 
  */
  @ApiModelProperty(required = true, value = "A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. ")
  @Valid
  private List<AssistantObjectToolsInner> tools = new ArrayList<>();

 /**
  * A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. 
  */
  @ApiModelProperty(required = true, value = "A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. ")
  private List<String> fileIds = new ArrayList<>();

 /**
  * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
  */
  @ApiModelProperty(required = true, value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. ")
  private Object metadata;
 /**
  * The identifier, which can be referenced in API endpoints.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public AssistantObject id(String id) {
    this.id = id;
    return this;
  }

 /**
  * The object type, which is always &#x60;assistant&#x60;.
  * @return _object
  */
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    return _object == null ? null : _object.value();
  }

  /**
   * Sets the <code>_object</code> property.
   */
 public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * Sets the <code>_object</code> property.
   */
  public AssistantObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
  * The Unix timestamp (in seconds) for when the assistant was created.
  * @return createdAt
  */
  @JsonProperty("created_at")
  @NotNull
  public Integer getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
 public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
  public AssistantObject createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
  * The name of the assistant. The maximum length is 256 characters. 
  * @return name
  */
  @JsonProperty("name")
  @NotNull
 @Size(max=256)  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public AssistantObject name(String name) {
    this.name = name;
    return this;
  }

 /**
  * The description of the assistant. The maximum length is 512 characters. 
  * @return description
  */
  @JsonProperty("description")
  @NotNull
 @Size(max=512)  public String getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
 public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public AssistantObject description(String description) {
    this.description = description;
    return this;
  }

 /**
  * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
  * @return model
  */
  @JsonProperty("model")
  @NotNull
  public String getModel() {
    return model;
  }

  /**
   * Sets the <code>model</code> property.
   */
 public void setModel(String model) {
    this.model = model;
  }

  /**
   * Sets the <code>model</code> property.
   */
  public AssistantObject model(String model) {
    this.model = model;
    return this;
  }

 /**
  * The system instructions that the assistant uses. The maximum length is 256,000 characters. 
  * @return instructions
  */
  @JsonProperty("instructions")
  @NotNull
 @Size(max=256000)  public String getInstructions() {
    return instructions;
  }

  /**
   * Sets the <code>instructions</code> property.
   */
 public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  /**
   * Sets the <code>instructions</code> property.
   */
  public AssistantObject instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

 /**
  * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;. 
  * @return tools
  */
  @JsonProperty("tools")
  @NotNull
 @Size(max=128)  public List<AssistantObjectToolsInner> getTools() {
    return tools;
  }

  /**
   * Sets the <code>tools</code> property.
   */
 public void setTools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
  }

  /**
   * Sets the <code>tools</code> property.
   */
  public AssistantObject tools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
    return this;
  }

  /**
   * Adds a new item to the <code>tools</code> list.
   */
  public AssistantObject addToolsItem(AssistantObjectToolsInner toolsItem) {
    this.tools.add(toolsItem);
    return this;
  }

 /**
  * A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. 
  * @return fileIds
  */
  @JsonProperty("file_ids")
  @NotNull
 @Size(max=20)  public List<String> getFileIds() {
    return fileIds;
  }

  /**
   * Sets the <code>fileIds</code> property.
   */
 public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  /**
   * Sets the <code>fileIds</code> property.
   */
  public AssistantObject fileIds(List<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  /**
   * Adds a new item to the <code>fileIds</code> list.
   */
  public AssistantObject addFileIdsItem(String fileIdsItem) {
    this.fileIds.add(fileIdsItem);
    return this;
  }

 /**
  * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
  * @return metadata
  */
  @JsonProperty("metadata")
  @NotNull
  public Object getMetadata() {
    return metadata;
  }

  /**
   * Sets the <code>metadata</code> property.
   */
 public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  /**
   * Sets the <code>metadata</code> property.
   */
  public AssistantObject metadata(Object metadata) {
    this.metadata = metadata;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

