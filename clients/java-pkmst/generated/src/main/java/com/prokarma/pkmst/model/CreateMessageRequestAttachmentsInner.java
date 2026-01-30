package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.CreateMessageRequestAttachmentsInnerToolsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CreateMessageRequestAttachmentsInner
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateMessageRequestAttachmentsInner   {
  @JsonProperty("file_id")
  private String fileId;

  @JsonProperty("tools")
  
  private List<CreateMessageRequestAttachmentsInnerToolsInner> tools = null;

  public CreateMessageRequestAttachmentsInner fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

  /**
   * The ID of the file to attach to the message.
   * @return fileId
   */
  @ApiModelProperty(value = "The ID of the file to attach to the message.")
  public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  public CreateMessageRequestAttachmentsInner tools(List<CreateMessageRequestAttachmentsInnerToolsInner> tools) {
    this.tools = tools;
    return this;
  }

  public CreateMessageRequestAttachmentsInner addToolsItem(CreateMessageRequestAttachmentsInnerToolsInner toolsItem) {
    if (this.tools == null) {
      this.tools = new ArrayList<>();
    }
    this.tools.add(toolsItem);
    return this;
  }

  /**
   * The tools to add this file to.
   * @return tools
   */
  @ApiModelProperty(value = "The tools to add this file to.")
  public List<CreateMessageRequestAttachmentsInnerToolsInner> getTools() {
    return tools;
  }

  public void setTools(List<CreateMessageRequestAttachmentsInnerToolsInner> tools) {
    this.tools = tools;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMessageRequestAttachmentsInner createMessageRequestAttachmentsInner = (CreateMessageRequestAttachmentsInner) o;
    return Objects.equals(this.fileId, createMessageRequestAttachmentsInner.fileId) &&
        Objects.equals(this.tools, createMessageRequestAttachmentsInner.tools);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, tools);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMessageRequestAttachmentsInner {\n");
    
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
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

