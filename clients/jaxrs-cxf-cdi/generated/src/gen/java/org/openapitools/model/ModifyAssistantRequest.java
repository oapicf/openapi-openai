package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AssistantObjectToolsInner;
import org.openapitools.model.AssistantsApiResponseFormatOption;
import org.openapitools.model.ModifyAssistantRequestToolResources;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ModifyAssistantRequest   {
  
  private String model;

  private String name;

  private String description;

  private String instructions;

  private List<AssistantObjectToolsInner> tools = new ArrayList<>();

  private ModifyAssistantRequestToolResources toolResources;

  private Object metadata;

  private BigDecimal temperature = new BigDecimal("1");

  private BigDecimal topP = new BigDecimal("1");

  private AssistantsApiResponseFormatOption responseFormat;

  /**
   **/
  public ModifyAssistantRequest model(String model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }


  /**
   * The name of the assistant. The maximum length is 256 characters. 
   **/
  public ModifyAssistantRequest name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "The name of the assistant. The maximum length is 256 characters. ")
  @JsonProperty("name")
 @Size(max=256)  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The description of the assistant. The maximum length is 512 characters. 
   **/
  public ModifyAssistantRequest description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "The description of the assistant. The maximum length is 512 characters. ")
  @JsonProperty("description")
 @Size(max=512)  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The system instructions that the assistant uses. The maximum length is 256,000 characters. 
   **/
  public ModifyAssistantRequest instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

  
  @ApiModelProperty(value = "The system instructions that the assistant uses. The maximum length is 256,000 characters. ")
  @JsonProperty("instructions")
 @Size(max=256000)  public String getInstructions() {
    return instructions;
  }
  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }


  /**
   * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;. 
   **/
  public ModifyAssistantRequest tools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
    return this;
  }

  
  @ApiModelProperty(value = "A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. ")
  @JsonProperty("tools")
 @Size(max=128)  public List<AssistantObjectToolsInner> getTools() {
    return tools;
  }
  public void setTools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
  }

  public ModifyAssistantRequest addToolsItem(AssistantObjectToolsInner toolsItem) {
    if (this.tools == null) {
      this.tools = new ArrayList<>();
    }
    this.tools.add(toolsItem);
    return this;
  }


  /**
   **/
  public ModifyAssistantRequest toolResources(ModifyAssistantRequestToolResources toolResources) {
    this.toolResources = toolResources;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tool_resources")
  public ModifyAssistantRequestToolResources getToolResources() {
    return toolResources;
  }
  public void setToolResources(ModifyAssistantRequestToolResources toolResources) {
    this.toolResources = toolResources;
  }


  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   **/
  public ModifyAssistantRequest metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  /**
   * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
   * minimum: 0
   * maximum: 2
   **/
  public ModifyAssistantRequest temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. ")
  @JsonProperty("temperature")
 @DecimalMin("0") @DecimalMax("2")  public BigDecimal getTemperature() {
    return temperature;
  }
  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }


  /**
   * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
   * minimum: 0
   * maximum: 1
   **/
  public ModifyAssistantRequest topP(BigDecimal topP) {
    this.topP = topP;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. ")
  @JsonProperty("top_p")
 @DecimalMin("0") @DecimalMax("1")  public BigDecimal getTopP() {
    return topP;
  }
  public void setTopP(BigDecimal topP) {
    this.topP = topP;
  }


  /**
   **/
  public ModifyAssistantRequest responseFormat(AssistantsApiResponseFormatOption responseFormat) {
    this.responseFormat = responseFormat;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("response_format")
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
    ModifyAssistantRequest modifyAssistantRequest = (ModifyAssistantRequest) o;
    return Objects.equals(this.model, modifyAssistantRequest.model) &&
        Objects.equals(this.name, modifyAssistantRequest.name) &&
        Objects.equals(this.description, modifyAssistantRequest.description) &&
        Objects.equals(this.instructions, modifyAssistantRequest.instructions) &&
        Objects.equals(this.tools, modifyAssistantRequest.tools) &&
        Objects.equals(this.toolResources, modifyAssistantRequest.toolResources) &&
        Objects.equals(this.metadata, modifyAssistantRequest.metadata) &&
        Objects.equals(this.temperature, modifyAssistantRequest.temperature) &&
        Objects.equals(this.topP, modifyAssistantRequest.topP) &&
        Objects.equals(this.responseFormat, modifyAssistantRequest.responseFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, name, description, instructions, tools, toolResources, metadata, temperature, topP, responseFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyAssistantRequest {\n");
    
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

