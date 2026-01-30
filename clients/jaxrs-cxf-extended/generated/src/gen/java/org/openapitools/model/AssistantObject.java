package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AssistantObjectToolResources;
import org.openapitools.model.AssistantObjectToolsInner;
import org.openapitools.model.AssistantsApiResponseFormatOption;
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
  * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. 
  */
  @ApiModelProperty(required = true, value = "ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. ")
  private String model;

 /**
  * The system instructions that the assistant uses. The maximum length is 256,000 characters. 
  */
  @ApiModelProperty(required = true, value = "The system instructions that the assistant uses. The maximum length is 256,000 characters. ")
  private String instructions;

 /**
  * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. 
  */
  @ApiModelProperty(required = true, value = "A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. ")
  @Valid
  private List<AssistantObjectToolsInner> tools = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private AssistantObjectToolResources toolResources;

 /**
  * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  */
  @ApiModelProperty(required = true, value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
  private Object metadata;

 /**
  * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
  */
  @ApiModelProperty(example = "1", value = "What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. ")
  @Valid
  private BigDecimal temperature = new BigDecimal("1");

 /**
  * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
  */
  @ApiModelProperty(example = "1", value = "An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. ")
  @Valid
  private BigDecimal topP = new BigDecimal("1");

  @ApiModelProperty(value = "")
  @Valid
  private AssistantsApiResponseFormatOption responseFormat;
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
  * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. 
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
  * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;. 
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
  * Get toolResources
  * @return toolResources
  */
  @JsonProperty("tool_resources")
  public AssistantObjectToolResources getToolResources() {
    return toolResources;
  }

  /**
   * Sets the <code>toolResources</code> property.
   */
 public void setToolResources(AssistantObjectToolResources toolResources) {
    this.toolResources = toolResources;
  }

  /**
   * Sets the <code>toolResources</code> property.
   */
  public AssistantObject toolResources(AssistantObjectToolResources toolResources) {
    this.toolResources = toolResources;
    return this;
  }

 /**
  * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
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

 /**
  * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
  * minimum: 0
  * maximum: 2
  * @return temperature
  */
  @JsonProperty("temperature")
 @DecimalMin("0") @DecimalMax("2")  public BigDecimal getTemperature() {
    return temperature;
  }

  /**
   * Sets the <code>temperature</code> property.
   */
 public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  /**
   * Sets the <code>temperature</code> property.
   */
  public AssistantObject temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

 /**
  * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
  * minimum: 0
  * maximum: 1
  * @return topP
  */
  @JsonProperty("top_p")
 @DecimalMin("0") @DecimalMax("1")  public BigDecimal getTopP() {
    return topP;
  }

  /**
   * Sets the <code>topP</code> property.
   */
 public void setTopP(BigDecimal topP) {
    this.topP = topP;
  }

  /**
   * Sets the <code>topP</code> property.
   */
  public AssistantObject topP(BigDecimal topP) {
    this.topP = topP;
    return this;
  }

 /**
  * Get responseFormat
  * @return responseFormat
  */
  @JsonProperty("response_format")
  public AssistantsApiResponseFormatOption getResponseFormat() {
    return responseFormat;
  }

  /**
   * Sets the <code>responseFormat</code> property.
   */
 public void setResponseFormat(AssistantsApiResponseFormatOption responseFormat) {
    this.responseFormat = responseFormat;
  }

  /**
   * Sets the <code>responseFormat</code> property.
   */
  public AssistantObject responseFormat(AssistantsApiResponseFormatOption responseFormat) {
    this.responseFormat = responseFormat;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

