package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Represents an &#x60;assistant&#x60; that can call the model and use tools.
 **/
@ApiModel(description = "Represents an `assistant` that can call the model and use tools.")
@JsonTypeName("AssistantObject")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AssistantObject   {
  private String id;
  public enum ObjectEnum {

    ASSISTANT(String.valueOf("assistant"));


    private String value;

    ObjectEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ObjectEnum fromString(String s) {
        for (ObjectEnum b : ObjectEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private ObjectEnum _object;
  private Integer createdAt;
  private String name;
  private String description;
  private String model;
  private String instructions;
  private @Valid List<AssistantObjectToolsInner> tools = new ArrayList<>();
  private AssistantObjectToolResources toolResources;
  private Object metadata;
  private BigDecimal temperature = new BigDecimal("1");
  private BigDecimal topP = new BigDecimal("1");
  private AssistantsApiResponseFormatOption responseFormat;

  public AssistantObject() {
  }

  @JsonCreator
  public AssistantObject(
    @JsonProperty(required = true, value = "id") String id,
    @JsonProperty(required = true, value = "object") ObjectEnum _object,
    @JsonProperty(required = true, value = "created_at") Integer createdAt,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "description") String description,
    @JsonProperty(required = true, value = "model") String model,
    @JsonProperty(required = true, value = "instructions") String instructions,
    @JsonProperty(required = true, value = "tools") List<@Valid AssistantObjectToolsInner> tools,
    @JsonProperty(required = true, value = "metadata") Object metadata
  ) {
    this.id = id;
    this._object = _object;
    this.createdAt = createdAt;
    this.name = name;
    this.description = description;
    this.model = model;
    this.instructions = instructions;
    this.tools = tools;
    this.metadata = metadata;
  }

  /**
   * The identifier, which can be referenced in API endpoints.
   **/
  public AssistantObject id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints.")
  @JsonProperty(required = true, value = "id")
  @NotNull public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The object type, which is always &#x60;assistant&#x60;.
   **/
  public AssistantObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The object type, which is always `assistant`.")
  @JsonProperty(required = true, value = "object")
  @NotNull public ObjectEnum getObject() {
    return _object;
  }

  @JsonProperty(required = true, value = "object")
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * The Unix timestamp (in seconds) for when the assistant was created.
   **/
  public AssistantObject createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the assistant was created.")
  @JsonProperty(required = true, value = "created_at")
  @NotNull public Integer getCreatedAt() {
    return createdAt;
  }

  @JsonProperty(required = true, value = "created_at")
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The name of the assistant. The maximum length is 256 characters. 
   **/
  public AssistantObject name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of the assistant. The maximum length is 256 characters. ")
  @JsonProperty(required = true, value = "name")
  @NotNull  @Size(max=256)public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The description of the assistant. The maximum length is 512 characters. 
   **/
  public AssistantObject description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The description of the assistant. The maximum length is 512 characters. ")
  @JsonProperty(required = true, value = "description")
  @NotNull  @Size(max=512)public String getDescription() {
    return description;
  }

  @JsonProperty(required = true, value = "description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. 
   **/
  public AssistantObject model(String model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. ")
  @JsonProperty(required = true, value = "model")
  @NotNull public String getModel() {
    return model;
  }

  @JsonProperty(required = true, value = "model")
  public void setModel(String model) {
    this.model = model;
  }

  /**
   * The system instructions that the assistant uses. The maximum length is 256,000 characters. 
   **/
  public AssistantObject instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The system instructions that the assistant uses. The maximum length is 256,000 characters. ")
  @JsonProperty(required = true, value = "instructions")
  @NotNull  @Size(max=256000)public String getInstructions() {
    return instructions;
  }

  @JsonProperty(required = true, value = "instructions")
  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  /**
   * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;. 
   **/
  public AssistantObject tools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. ")
  @JsonProperty(required = true, value = "tools")
  @NotNull @Valid  @Size(max=128)public List<@Valid AssistantObjectToolsInner> getTools() {
    return tools;
  }

  @JsonProperty(required = true, value = "tools")
  public void setTools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
  }

  public AssistantObject addToolsItem(AssistantObjectToolsInner toolsItem) {
    if (this.tools == null) {
      this.tools = new ArrayList<>();
    }

    this.tools.add(toolsItem);
    return this;
  }

  public AssistantObject removeToolsItem(AssistantObjectToolsInner toolsItem) {
    if (toolsItem != null && this.tools != null) {
      this.tools.remove(toolsItem);
    }

    return this;
  }
  /**
   **/
  public AssistantObject toolResources(AssistantObjectToolResources toolResources) {
    this.toolResources = toolResources;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tool_resources")
  @Valid public AssistantObjectToolResources getToolResources() {
    return toolResources;
  }

  @JsonProperty("tool_resources")
  public void setToolResources(AssistantObjectToolResources toolResources) {
    this.toolResources = toolResources;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   **/
  public AssistantObject metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
  @JsonProperty(required = true, value = "metadata")
  @NotNull public Object getMetadata() {
    return metadata;
  }

  @JsonProperty(required = true, value = "metadata")
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  /**
   * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
   * minimum: 0
   * maximum: 2
   **/
  public AssistantObject temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. ")
  @JsonProperty("temperature")
  @Valid  @DecimalMin("0") @DecimalMax("2")public BigDecimal getTemperature() {
    return temperature;
  }

  @JsonProperty("temperature")
  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  /**
   * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
   * minimum: 0
   * maximum: 1
   **/
  public AssistantObject topP(BigDecimal topP) {
    this.topP = topP;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. ")
  @JsonProperty("top_p")
  @Valid  @DecimalMin("0") @DecimalMax("1")public BigDecimal getTopP() {
    return topP;
  }

  @JsonProperty("top_p")
  public void setTopP(BigDecimal topP) {
    this.topP = topP;
  }

  /**
   **/
  public AssistantObject responseFormat(AssistantsApiResponseFormatOption responseFormat) {
    this.responseFormat = responseFormat;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("response_format")
  @Valid public AssistantsApiResponseFormatOption getResponseFormat() {
    return responseFormat;
  }

  @JsonProperty("response_format")
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

