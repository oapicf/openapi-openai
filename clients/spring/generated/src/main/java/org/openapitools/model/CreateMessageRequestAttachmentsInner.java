package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateMessageRequestAttachmentsInnerToolsInner;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateMessageRequestAttachmentsInner
 */

@JsonTypeName("CreateMessageRequest_attachments_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateMessageRequestAttachmentsInner {

  private @Nullable String fileId;

  @Valid
  private List<CreateMessageRequestAttachmentsInnerToolsInner> tools = new ArrayList<>();

  public CreateMessageRequestAttachmentsInner fileId(@Nullable String fileId) {
    this.fileId = fileId;
    return this;
  }

  /**
   * The ID of the file to attach to the message.
   * @return fileId
   */
  
  @Schema(name = "file_id", description = "The ID of the file to attach to the message.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("file_id")
  public @Nullable String getFileId() {
    return fileId;
  }

  public void setFileId(@Nullable String fileId) {
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
  @Valid 
  @Schema(name = "tools", description = "The tools to add this file to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

