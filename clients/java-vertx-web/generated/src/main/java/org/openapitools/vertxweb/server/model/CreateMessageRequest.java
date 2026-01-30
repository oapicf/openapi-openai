package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CreateMessageRequestAttachmentsInner;
import org.openapitools.vertxweb.server.model.CreateMessageRequestContent;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateMessageRequest   {
  


  public enum RoleEnum {
    USER("user"),
    ASSISTANT("assistant");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private RoleEnum role;
  private CreateMessageRequestContent content;
  private List<CreateMessageRequestAttachmentsInner> attachments;
  private Object metadata;

  public CreateMessageRequest () {

  }

  public CreateMessageRequest (RoleEnum role, CreateMessageRequestContent content, List<CreateMessageRequestAttachmentsInner> attachments, Object metadata) {
    this.role = role;
    this.content = content;
    this.attachments = attachments;
    this.metadata = metadata;
  }

    
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
  }

    
  @JsonProperty("content")
  public CreateMessageRequestContent getContent() {
    return content;
  }
  public void setContent(CreateMessageRequestContent content) {
    this.content = content;
  }

    
  @JsonProperty("attachments")
  public List<CreateMessageRequestAttachmentsInner> getAttachments() {
    return attachments;
  }
  public void setAttachments(List<CreateMessageRequestAttachmentsInner> attachments) {
    this.attachments = attachments;
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
    CreateMessageRequest createMessageRequest = (CreateMessageRequest) o;
    return Objects.equals(role, createMessageRequest.role) &&
        Objects.equals(content, createMessageRequest.content) &&
        Objects.equals(attachments, createMessageRequest.attachments) &&
        Objects.equals(metadata, createMessageRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, content, attachments, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMessageRequest {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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
