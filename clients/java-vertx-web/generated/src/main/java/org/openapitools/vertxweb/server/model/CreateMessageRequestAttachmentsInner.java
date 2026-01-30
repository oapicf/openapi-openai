package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.CreateMessageRequestAttachmentsInnerToolsInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateMessageRequestAttachmentsInner   {
  
  private String fileId;
  private List<CreateMessageRequestAttachmentsInnerToolsInner> tools = new ArrayList<>();

  public CreateMessageRequestAttachmentsInner () {

  }

  public CreateMessageRequestAttachmentsInner (String fileId, List<CreateMessageRequestAttachmentsInnerToolsInner> tools) {
    this.fileId = fileId;
    this.tools = tools;
  }

    
  @JsonProperty("file_id")
  public String getFileId() {
    return fileId;
  }
  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

    
  @JsonProperty("tools")
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
    return Objects.equals(fileId, createMessageRequestAttachmentsInner.fileId) &&
        Objects.equals(tools, createMessageRequestAttachmentsInner.tools);
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
