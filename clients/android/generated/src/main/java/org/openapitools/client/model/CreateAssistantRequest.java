/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.AssistantObjectToolsInner;
import org.openapitools.client.model.CreateAssistantRequestModel;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CreateAssistantRequest {
  
  @SerializedName("model")
  private CreateAssistantRequestModel model = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("instructions")
  private String instructions = null;
  @SerializedName("tools")
  private List<AssistantObjectToolsInner> tools = [];
  @SerializedName("file_ids")
  private List<String> fileIds = [];
  @SerializedName("metadata")
  private Object metadata = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CreateAssistantRequestModel getModel() {
    return model;
  }
  public void setModel(CreateAssistantRequestModel model) {
    this.model = model;
  }

  /**
   * The name of the assistant. The maximum length is 256 characters. 
   **/
  @ApiModelProperty(value = "The name of the assistant. The maximum length is 256 characters. ")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The description of the assistant. The maximum length is 512 characters. 
   **/
  @ApiModelProperty(value = "The description of the assistant. The maximum length is 512 characters. ")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The system instructions that the assistant uses. The maximum length is 256,000 characters. 
   **/
  @ApiModelProperty(value = "The system instructions that the assistant uses. The maximum length is 256,000 characters. ")
  public String getInstructions() {
    return instructions;
  }
  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  /**
   * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 
   **/
  @ApiModelProperty(value = "A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. ")
  public List<AssistantObjectToolsInner> getTools() {
    return tools;
  }
  public void setTools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
  }

  /**
   * A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. 
   **/
  @ApiModelProperty(value = "A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. ")
  public List<String> getFileIds() {
    return fileIds;
  }
  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
   **/
  @ApiModelProperty(value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. ")
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
    return (this.model == null ? createAssistantRequest.model == null : this.model.equals(createAssistantRequest.model)) &&
        (this.name == null ? createAssistantRequest.name == null : this.name.equals(createAssistantRequest.name)) &&
        (this.description == null ? createAssistantRequest.description == null : this.description.equals(createAssistantRequest.description)) &&
        (this.instructions == null ? createAssistantRequest.instructions == null : this.instructions.equals(createAssistantRequest.instructions)) &&
        (this.tools == null ? createAssistantRequest.tools == null : this.tools.equals(createAssistantRequest.tools)) &&
        (this.fileIds == null ? createAssistantRequest.fileIds == null : this.fileIds.equals(createAssistantRequest.fileIds)) &&
        (this.metadata == null ? createAssistantRequest.metadata == null : this.metadata.equals(createAssistantRequest.metadata));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.model == null ? 0: this.model.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.instructions == null ? 0: this.instructions.hashCode());
    result = 31 * result + (this.tools == null ? 0: this.tools.hashCode());
    result = 31 * result + (this.fileIds == null ? 0: this.fileIds.hashCode());
    result = 31 * result + (this.metadata == null ? 0: this.metadata.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAssistantRequest {\n");
    
    sb.append("  model: ").append(model).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  instructions: ").append(instructions).append("\n");
    sb.append("  tools: ").append(tools).append("\n");
    sb.append("  fileIds: ").append(fileIds).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
