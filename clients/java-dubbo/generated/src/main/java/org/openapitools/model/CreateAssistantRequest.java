package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AssistantObjectToolsInner;
import org.openapitools.model.AssistantsApiResponseFormatOption;
import org.openapitools.model.CreateAssistantRequestModel;
import org.openapitools.model.CreateAssistantRequestToolResources;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CreateAssistantRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("model")
  private CreateAssistantRequestModel model;

  /**
   * The name of the assistant. The maximum length is 256 characters. 
   */
  @JsonProperty("name")
  private String name;

  /**
   * The description of the assistant. The maximum length is 512 characters. 
   */
  @JsonProperty("description")
  private String description;

  /**
   * The system instructions that the assistant uses. The maximum length is 256,000 characters. 
   */
  @JsonProperty("instructions")
  private String instructions;

  /**
   * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;. 
   */
  @JsonProperty("tools")
  private List<AssistantObjectToolsInner> tools = new ArrayList<>();

  @JsonProperty("tool_resources")
  private CreateAssistantRequestToolResources toolResources;

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   */
  @JsonProperty("metadata")
  private Object metadata;

  /**
   * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
   */
  @JsonProperty("temperature")
  private BigDecimal temperature = new BigDecimal("1");

  /**
   * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
   */
  @JsonProperty("top_p")
  private BigDecimal topP = new BigDecimal("1");

  @JsonProperty("response_format")
  private AssistantsApiResponseFormatOption responseFormat;

  /**
   * 
   * @return model
   */
  public CreateAssistantRequestModel getModel() {
    return model;
  }

  public void setModel(CreateAssistantRequestModel model) {
    this.model = model;
  }

  /**
   * The name of the assistant. The maximum length is 256 characters. 
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The description of the assistant. The maximum length is 512 characters. 
   * @return description
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The system instructions that the assistant uses. The maximum length is 256,000 characters. 
   * @return instructions
   */
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  /**
   * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;. 
   * @return tools
   */
  public List<AssistantObjectToolsInner> getTools() {
    return tools;
  }

  public void setTools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
  }

  /**
   * 
   * @return toolResources
   */
  public CreateAssistantRequestToolResources getToolResources() {
    return toolResources;
  }

  public void setToolResources(CreateAssistantRequestToolResources toolResources) {
    this.toolResources = toolResources;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   * @return metadata
   */
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  /**
   * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
   * @return temperature
   */
  public BigDecimal getTemperature() {
    return temperature;
  }

  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  /**
   * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
   * @return topP
   */
  public BigDecimal getTopP() {
    return topP;
  }

  public void setTopP(BigDecimal topP) {
    this.topP = topP;
  }

  /**
   * 
   * @return responseFormat
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
