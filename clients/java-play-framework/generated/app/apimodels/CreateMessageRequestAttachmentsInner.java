package apimodels;

import apimodels.CreateMessageRequestAttachmentsInnerToolsInner;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateMessageRequestAttachmentsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateMessageRequestAttachmentsInner   {
  @JsonProperty("file_id")
  
  private String fileId;

  @JsonProperty("tools")
  @Valid

  private List<CreateMessageRequestAttachmentsInnerToolsInner> tools = null;

  public CreateMessageRequestAttachmentsInner fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

   /**
   * The ID of the file to attach to the message.
   * @return fileId
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

