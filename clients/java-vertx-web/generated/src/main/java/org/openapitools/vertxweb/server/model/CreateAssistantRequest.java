package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.AssistantObjectToolsInner;
import org.openapitools.vertxweb.server.model.CreateAssistantRequestModel;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAssistantRequest   {
  
  private CreateAssistantRequestModel model;
  private String name;
  private String description;
  private String instructions;
  private List<AssistantObjectToolsInner> tools = new ArrayList<>();
  private List<String> fileIds = new ArrayList<>();
  private Object metadata;

  public CreateAssistantRequest () {

  }

  public CreateAssistantRequest (CreateAssistantRequestModel model, String name, String description, String instructions, List<AssistantObjectToolsInner> tools, List<String> fileIds, Object metadata) {
    this.model = model;
    this.name = name;
    this.description = description;
    this.instructions = instructions;
    this.tools = tools;
    this.fileIds = fileIds;
    this.metadata = metadata;
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

    
  @JsonProperty("file_ids")
  public List<String> getFileIds() {
    return fileIds;
  }
  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

    
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
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
        Objects.equals(fileIds, createAssistantRequest.fileIds) &&
        Objects.equals(metadata, createAssistantRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, name, description, instructions, tools, fileIds, metadata);
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
    sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
