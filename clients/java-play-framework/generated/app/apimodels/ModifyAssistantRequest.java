package apimodels;

import apimodels.AssistantObjectToolsInner;
import apimodels.AssistantsApiResponseFormatOption;
import apimodels.ModifyAssistantRequestToolResources;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModifyAssistantRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ModifyAssistantRequest   {
  @JsonProperty("model")
  
  private String model;

  @JsonProperty("name")
  @Size(max=256)

  private String name;

  @JsonProperty("description")
  @Size(max=512)

  private String description;

  @JsonProperty("instructions")
  @Size(max=256000)

  private String instructions;

  @JsonProperty("tools")
  @Size(max=128)
@Valid

  private List<AssistantObjectToolsInner> tools = null;

  @JsonProperty("tool_resources")
  @Valid

  private ModifyAssistantRequestToolResources toolResources;

  @JsonProperty("metadata")
  
  private Object metadata;

  @JsonProperty("temperature")
  @DecimalMin("0")
@DecimalMax("2")
@Valid

  private BigDecimal temperature = new BigDecimal("1");

  @JsonProperty("top_p")
  @DecimalMin("0")
@DecimalMax("1")
@Valid

  private BigDecimal topP = new BigDecimal("1");

  @JsonProperty("response_format")
  @Valid

  private AssistantsApiResponseFormatOption responseFormat;

  public ModifyAssistantRequest model(String model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public ModifyAssistantRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the assistant. The maximum length is 256 characters. 
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ModifyAssistantRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the assistant. The maximum length is 512 characters. 
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ModifyAssistantRequest instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

   /**
   * The system instructions that the assistant uses. The maximum length is 256,000 characters. 
   * @return instructions
  **/
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  public ModifyAssistantRequest tools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
    return this;
  }

  public ModifyAssistantRequest addToolsItem(AssistantObjectToolsInner toolsItem) {
    if (this.tools == null) {
      this.tools = new ArrayList<>();
    }
    this.tools.add(toolsItem);
    return this;
  }

   /**
   * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. 
   * @return tools
  **/
  public List<AssistantObjectToolsInner> getTools() {
    return tools;
  }

  public void setTools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
  }

  public ModifyAssistantRequest toolResources(ModifyAssistantRequestToolResources toolResources) {
    this.toolResources = toolResources;
    return this;
  }

   /**
   * Get toolResources
   * @return toolResources
  **/
  public ModifyAssistantRequestToolResources getToolResources() {
    return toolResources;
  }

  public void setToolResources(ModifyAssistantRequestToolResources toolResources) {
    this.toolResources = toolResources;
  }

  public ModifyAssistantRequest metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   * @return metadata
  **/
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public ModifyAssistantRequest temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

   /**
   * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
   * minimum: 0
   * maximum: 2
   * @return temperature
  **/
  public BigDecimal getTemperature() {
    return temperature;
  }

  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  public ModifyAssistantRequest topP(BigDecimal topP) {
    this.topP = topP;
    return this;
  }

   /**
   * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
   * minimum: 0
   * maximum: 1
   * @return topP
  **/
  public BigDecimal getTopP() {
    return topP;
  }

  public void setTopP(BigDecimal topP) {
    this.topP = topP;
  }

  public ModifyAssistantRequest responseFormat(AssistantsApiResponseFormatOption responseFormat) {
    this.responseFormat = responseFormat;
    return this;
  }

   /**
   * Get responseFormat
   * @return responseFormat
  **/
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
    return Objects.equals(model, modifyAssistantRequest.model) &&
        Objects.equals(name, modifyAssistantRequest.name) &&
        Objects.equals(description, modifyAssistantRequest.description) &&
        Objects.equals(instructions, modifyAssistantRequest.instructions) &&
        Objects.equals(tools, modifyAssistantRequest.tools) &&
        Objects.equals(toolResources, modifyAssistantRequest.toolResources) &&
        Objects.equals(metadata, modifyAssistantRequest.metadata) &&
        Objects.equals(temperature, modifyAssistantRequest.temperature) &&
        Objects.equals(topP, modifyAssistantRequest.topP) &&
        Objects.equals(responseFormat, modifyAssistantRequest.responseFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, name, description, instructions, tools, toolResources, metadata, temperature, topP, responseFormat);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

