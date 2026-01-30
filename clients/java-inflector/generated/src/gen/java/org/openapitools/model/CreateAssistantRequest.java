package org.openapitools.model;

import java.util.Objects;
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
import org.openapitools.model.CreateAssistantRequestModel;
import org.openapitools.model.CreateAssistantRequestToolResources;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateAssistantRequest   {
  @JsonProperty("model")
  private CreateAssistantRequestModel model;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("instructions")
  private String instructions;

  @JsonProperty("tools")
  private List<AssistantObjectToolsInner> tools = null;

  @JsonProperty("tool_resources")
  private CreateAssistantRequestToolResources toolResources;

  @JsonProperty("metadata")
  private Object metadata;

  @JsonProperty("temperature")
  private BigDecimal temperature = new BigDecimal("1");

  @JsonProperty("top_p")
  private BigDecimal topP = new BigDecimal("1");

  @JsonProperty("response_format")
  private AssistantsApiResponseFormatOption responseFormat;

  /**
   **/
  public CreateAssistantRequest model(CreateAssistantRequestModel model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("model")
  public CreateAssistantRequestModel getModel() {
    return model;
  }
  public void setModel(CreateAssistantRequestModel model) {
    this.model = model;
  }

  /**
   * The name of the assistant. The maximum length is 256 characters. 
   **/
  public CreateAssistantRequest name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "The name of the assistant. The maximum length is 256 characters. ")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The description of the assistant. The maximum length is 512 characters. 
   **/
  public CreateAssistantRequest description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "The description of the assistant. The maximum length is 512 characters. ")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The system instructions that the assistant uses. The maximum length is 256,000 characters. 
   **/
  public CreateAssistantRequest instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

  
  @ApiModelProperty(value = "The system instructions that the assistant uses. The maximum length is 256,000 characters. ")
  @JsonProperty("instructions")
  public String getInstructions() {
    return instructions;
  }
  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  /**
   * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. 
   **/
  public CreateAssistantRequest tools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
    return this;
  }

  
  @ApiModelProperty(value = "A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. ")
  @JsonProperty("tools")
  public List<AssistantObjectToolsInner> getTools() {
    return tools;
  }
  public void setTools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
  }

  /**
   **/
  public CreateAssistantRequest toolResources(CreateAssistantRequestToolResources toolResources) {
    this.toolResources = toolResources;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tool_resources")
  public CreateAssistantRequestToolResources getToolResources() {
    return toolResources;
  }
  public void setToolResources(CreateAssistantRequestToolResources toolResources) {
    this.toolResources = toolResources;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   **/
  public CreateAssistantRequest metadata(Object metadata) {
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
  public CreateAssistantRequest temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. ")
  @JsonProperty("temperature")
  public BigDecimal getTemperature() {
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
  public CreateAssistantRequest topP(BigDecimal topP) {
    this.topP = topP;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. ")
  @JsonProperty("top_p")
  public BigDecimal getTopP() {
    return topP;
  }
  public void setTopP(BigDecimal topP) {
    this.topP = topP;
  }

  /**
   **/
  public CreateAssistantRequest responseFormat(AssistantsApiResponseFormatOption responseFormat) {
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
    CreateAssistantRequest createAssistantRequest = (CreateAssistantRequest) o;
    return Objects.equals(model, createAssistantRequest.model) &&
        Objects.equals(name, createAssistantRequest.name) &&
        Objects.equals(description, createAssistantRequest.description) &&
        Objects.equals(instructions, createAssistantRequest.instructions) &&
        Objects.equals(tools, createAssistantRequest.tools) &&
        Objects.equals(toolResources, createAssistantRequest.toolResources) &&
        Objects.equals(metadata, createAssistantRequest.metadata) &&
        Objects.equals(temperature, createAssistantRequest.temperature) &&
        Objects.equals(topP, createAssistantRequest.topP) &&
        Objects.equals(responseFormat, createAssistantRequest.responseFormat);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

