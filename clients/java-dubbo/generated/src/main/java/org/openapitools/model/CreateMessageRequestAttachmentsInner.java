package org.openapitools.model;

import org.openapitools.model.CreateMessageRequestAttachmentsInnerToolsInner;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CreateMessageRequestAttachmentsInner implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The ID of the file to attach to the message.
   */
  @JsonProperty("file_id")
  private String fileId;

  /**
   * The tools to add this file to.
   */
  @JsonProperty("tools")
  private List<CreateMessageRequestAttachmentsInnerToolsInner> tools = new ArrayList<>();

  /**
   * The ID of the file to attach to the message.
   * @return fileId
   */
  public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  /**
   * The tools to add this file to.
   * @return tools
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
