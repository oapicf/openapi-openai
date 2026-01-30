package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.AssistantObjectToolsInner;
import org.openapitools.vertxweb.server.model.AssistantsApiResponseFormatOption;
import org.openapitools.vertxweb.server.model.CreateAssistantRequestModel;
import org.openapitools.vertxweb.server.model.CreateAssistantRequestToolResources;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAssistantRequest   {
  
  private CreateAssistantRequestModel model;
  private String name;
  private String description;
  private String instructions;
  private List<AssistantObjectToolsInner> tools = new ArrayList<>();
  private CreateAssistantRequestToolResources toolResources;
  private Object metadata;
  private BigDecimal temperature = new BigDecimal("1");
  private BigDecimal topP = new BigDecimal("1");
  private AssistantsApiResponseFormatOption responseFormat;

  public CreateAssistantRequest () {

  }

  public CreateAssistantRequest (CreateAssistantRequestModel model, String name, String description, String instructions, List<AssistantObjectToolsInner> tools, CreateAssistantRequestToolResources toolResources, Object metadata, BigDecimal temperature, BigDecimal topP, AssistantsApiResponseFormatOption responseFormat) {
    this.model = model;
    this.name = name;
    this.description = description;
    this.instructions = instructions;
    this.tools = tools;
    this.toolResources = toolResources;
    this.metadata = metadata;
    this.temperature = temperature;
    this.topP = topP;
    this.responseFormat = responseFormat;
  }

    
  @JsonProperty("model")
  public CreateAssistantRequestModel getModel() {
    return model;
  }
  public void setModel(CreateAssistantRequestModel model) {
    this.model = model;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("instructions")
  public String getInstructions() {
    return instructions;
  }
  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

    
  @JsonProperty("tools")
  public List<AssistantObjectToolsInner> getTools() {
    return tools;
  }
  public void setTools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
  }

    
  @JsonProperty("tool_resources")
  public CreateAssistantRequestToolResources getToolResources() {
    return toolResources;
  }
  public void setToolResources(CreateAssistantRequestToolResources toolResources) {
    this.toolResources = toolResources;
  }

    
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

    
  @JsonProperty("temperature")
  public BigDecimal getTemperature() {
    return temperature;
  }
  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

    
  @JsonProperty("top_p")
  public BigDecimal getTopP() {
    return topP;
  }
  public void setTopP(BigDecimal topP) {
    this.topP = topP;
  }

    
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
