package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.AssistantObjectToolResources;
import com.prokarma.pkmst.model.AssistantObjectToolsInner;
import com.prokarma.pkmst.model.AssistantsApiResponseFormatOption;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Represents an &#x60;assistant&#x60; that can call the model and use tools.
 */
@ApiModel(description = "Represents an `assistant` that can call the model and use tools.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AssistantObject   {
  @JsonProperty("id")
  private String id;

  /**
   * The object type, which is always `assistant`.
   */
  public enum ObjectEnum {
    ASSISTANT("assistant");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ObjectEnum fromValue(String text) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("object")
  private ObjectEnum _object;

  @JsonProperty("created_at")
  private Integer createdAt;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("model")
  private String model;

  @JsonProperty("instructions")
  private String instructions;

  @JsonProperty("tools")
  
  private List<AssistantObjectToolsInner> tools = new ArrayList<>();

  @JsonProperty("tool_resources")
  private AssistantObjectToolResources toolResources;

  @JsonProperty("metadata")
  private Object metadata;

  @JsonProperty("temperature")
  private BigDecimal temperature = new BigDecimal("1");

  @JsonProperty("top_p")
  private BigDecimal topP = new BigDecimal("1");

  @JsonProperty("response_format")
  private AssistantsApiResponseFormatOption responseFormat;

  public AssistantObject id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier, which can be referenced in API endpoints.
   * @return id
   */
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AssistantObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always `assistant`.
   * @return _object
   */
  @ApiModelProperty(required = true, value = "The object type, which is always `assistant`.")
  public ObjectEnum getObject() {
    return _object;
  }

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
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the assistant was created.")
  public Integer getCreatedAt() {
    return createdAt;
  }

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
  @ApiModelProperty(required = true, value = "The name of the assistant. The maximum length is 256 characters. ")
  public String getName() {
    return name;
  }

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
  @ApiModelProperty(required = true, value = "The description of the assistant. The maximum length is 512 characters. ")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AssistantObject model(String model) {
    this.model = model;
    return this;
  }

  /**
   * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. 
   * @return model
   */
  @ApiModelProperty(required = true, value = "ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. ")
  public String getModel() {
    return model;
  }

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
  @ApiModelProperty(required = true, value = "The system instructions that the assistant uses. The maximum length is 256,000 characters. ")
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  public AssistantObject tools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
    return this;
  }

  public AssistantObject addToolsItem(AssistantObjectToolsInner toolsItem) {
    if (this.tools == null) {
      this.tools = new ArrayList<>();
    }
    this.tools.add(toolsItem);
    return this;
  }

  /**
   * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. 
   * @return tools
   */
  @ApiModelProperty(required = true, value = "A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. ")
  public List<AssistantObjectToolsInner> getTools() {
    return tools;
  }

  public void setTools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
  }

  public AssistantObject toolResources(AssistantObjectToolResources toolResources) {
    this.toolResources = toolResources;
    return this;
  }

  /**
   * Get toolResources
   * @return toolResources
   */
  @ApiModelProperty(value = "")
  public AssistantObjectToolResources getToolResources() {
    return toolResources;
  }

  public void setToolResources(AssistantObjectToolResources toolResources) {
    this.toolResources = toolResources;
  }

  public AssistantObject metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   * @return metadata
   */
  @ApiModelProperty(required = true, value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public AssistantObject temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

  /**
   * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
   * minimum: 0
   * maximum: 2
   * @return temperature
   */
  @ApiModelProperty(example = "1", value = "What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. ")
  public BigDecimal getTemperature() {
    return temperature;
  }

  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  public AssistantObject topP(BigDecimal topP) {
    this.topP = topP;
    return this;
  }

  /**
   * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
   * minimum: 0
   * maximum: 1
   * @return topP
   */
  @ApiModelProperty(example = "1", value = "An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. ")
  public BigDecimal getTopP() {
    return topP;
  }

  public void setTopP(BigDecimal topP) {
    this.topP = topP;
  }

  public AssistantObject responseFormat(AssistantsApiResponseFormatOption responseFormat) {
    this.responseFormat = responseFormat;
    return this;
  }

  /**
   * Get responseFormat
   * @return responseFormat
   */
  @ApiModelProperty(value = "")
  public AssistantsApiResponseFormatOption getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(AssistantsApiResponseFormatOption responseFormat) {
    this.responseFormat = responseFormat;
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
        Objects.equals(this.toolResources, assistantObject.toolResources) &&
        Objects.equals(this.metadata, assistantObject.metadata) &&
        Objects.equals(this.temperature, assistantObject.temperature) &&
        Objects.equals(this.topP, assistantObject.topP) &&
        Objects.equals(this.responseFormat, assistantObject.responseFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, createdAt, name, description, model, instructions, tools, toolResources, metadata, temperature, topP, responseFormat);
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
    sb.append("    toolResources: ").append(toIndentedString(toolResources)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
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

