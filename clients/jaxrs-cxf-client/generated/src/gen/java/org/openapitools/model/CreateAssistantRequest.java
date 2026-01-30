package org.openapitools.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AssistantObjectToolsInner;
import org.openapitools.model.AssistantsApiResponseFormatOption;
import org.openapitools.model.CreateAssistantRequestModel;
import org.openapitools.model.CreateAssistantRequestToolResources;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateAssistantRequest  {
  
  @ApiModelProperty(required = true, value = "")

  private CreateAssistantRequestModel model;

 /**
  * The name of the assistant. The maximum length is 256 characters. 
  */
  @ApiModelProperty(value = "The name of the assistant. The maximum length is 256 characters. ")

  private String name;

 /**
  * The description of the assistant. The maximum length is 512 characters. 
  */
  @ApiModelProperty(value = "The description of the assistant. The maximum length is 512 characters. ")

  private String description;

 /**
  * The system instructions that the assistant uses. The maximum length is 256,000 characters. 
  */
  @ApiModelProperty(value = "The system instructions that the assistant uses. The maximum length is 256,000 characters. ")

  private String instructions;

 /**
  * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. 
  */
  @ApiModelProperty(value = "A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. ")

  private List<AssistantObjectToolsInner> tools = new ArrayList<>();

  @ApiModelProperty(value = "")

  private CreateAssistantRequestToolResources toolResources;

 /**
  * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  */
  @ApiModelProperty(value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")

  private Object metadata;

 /**
  * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
  */
  @ApiModelProperty(example = "1", value = "What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. ")

  private BigDecimal temperature = new BigDecimal("1");

 /**
  * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
  */
  @ApiModelProperty(example = "1", value = "An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. ")

  private BigDecimal topP = new BigDecimal("1");

  @ApiModelProperty(value = "")

  private AssistantsApiResponseFormatOption responseFormat;
 /**
   * Get model
   * @return model
  **/
  @JsonProperty("model")
  public CreateAssistantRequestModel getModel() {
    return model;
  }

  public void setModel(CreateAssistantRequestModel model) {
    this.model = model;
  }

  public CreateAssistantRequest model(CreateAssistantRequestModel model) {
    this.model = model;
    return this;
  }

 /**
   * The name of the assistant. The maximum length is 256 characters. 
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateAssistantRequest name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The description of the assistant. The maximum length is 512 characters. 
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateAssistantRequest description(String description) {
    this.description = description;
    return this;
  }

 /**
   * The system instructions that the assistant uses. The maximum length is 256,000 characters. 
   * @return instructions
  **/
  @JsonProperty("instructions")
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  public CreateAssistantRequest instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

 /**
   * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;. 
   * @return tools
  **/
  @JsonProperty("tools")
  public List<AssistantObjectToolsInner> getTools() {
    return tools;
  }

  public void setTools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
  }

  public CreateAssistantRequest tools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
    return this;
  }

  public CreateAssistantRequest addToolsItem(AssistantObjectToolsInner toolsItem) {
    this.tools.add(toolsItem);
    return this;
  }

 /**
   * Get toolResources
   * @return toolResources
  **/
  @JsonProperty("tool_resources")
  public CreateAssistantRequestToolResources getToolResources() {
    return toolResources;
  }

  public void setToolResources(CreateAssistantRequestToolResources toolResources) {
    this.toolResources = toolResources;
  }

  public CreateAssistantRequest toolResources(CreateAssistantRequestToolResources toolResources) {
    this.toolResources = toolResources;
    return this;
  }

 /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   * @return metadata
  **/
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public CreateAssistantRequest metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

 /**
   * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
   * minimum: 0
   * maximum: 2
   * @return temperature
  **/
  @JsonProperty("temperature")
  public BigDecimal getTemperature() {
    return temperature;
  }

  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  public CreateAssistantRequest temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

 /**
   * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
   * minimum: 0
   * maximum: 1
   * @return topP
  **/
  @JsonProperty("top_p")
  public BigDecimal getTopP() {
    return topP;
  }

  public void setTopP(BigDecimal topP) {
    this.topP = topP;
  }

  public CreateAssistantRequest topP(BigDecimal topP) {
    this.topP = topP;
    return this;
  }

 /**
   * Get responseFormat
   * @return responseFormat
  **/
  @JsonProperty("response_format")
  public AssistantsApiResponseFormatOption getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(AssistantsApiResponseFormatOption responseFormat) {
    this.responseFormat = responseFormat;
  }

  public CreateAssistantRequest responseFormat(AssistantsApiResponseFormatOption responseFormat) {
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
    CreateAssistantRequest createAssistantRequest = (CreateAssistantRequest) o;
    return Objects.equals(this.model, createAssistantRequest.model) &&
        Objects.equals(this.name, createAssistantRequest.name) &&
        Objects.equals(this.description, createAssistantRequest.description) &&
        Objects.equals(this.instructions, createAssistantRequest.instructions) &&
        Objects.equals(this.tools, createAssistantRequest.tools) &&
        Objects.equals(this.toolResources, createAssistantRequest.toolResources) &&
        Objects.equals(this.metadata, createAssistantRequest.metadata) &&
        Objects.equals(this.temperature, createAssistantRequest.temperature) &&
        Objects.equals(this.topP, createAssistantRequest.topP) &&
        Objects.equals(this.responseFormat, createAssistantRequest.responseFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, name, description, instructions, tools, toolResources, metadata, temperature, topP, responseFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAssistantRequest {\n");
    
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

