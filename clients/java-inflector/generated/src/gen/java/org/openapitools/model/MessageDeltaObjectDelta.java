package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MessageDeltaObjectDeltaContentInner;



/**
 * The delta containing the fields that have changed on the Message.
 **/

@ApiModel(description = "The delta containing the fields that have changed on the Message.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-03T11:06:32.740431132Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class MessageDeltaObjectDelta   {
  /**
   * The entity that produced the message. One of `user` or `assistant`.
   */
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
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String text) {
      for (RoleEnum b : RoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("role")
  private RoleEnum role;

  @JsonProperty("content")
  private List<MessageDeltaObjectDeltaContentInner> content = null;

  @JsonProperty("file_ids")
  private List<String> fileIds = null;

  /**
   * The entity that produced the message. One of `user` or `assistant`.
   **/
  public MessageDeltaObjectDelta role(RoleEnum role) {
    this.role = role;
    return this;
  }

  
  @ApiModelProperty(value = "The entity that produced the message. One of `user` or `assistant`.")
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
  }

  /**
   * The content of the message in array of text and/or images.
   **/
  public MessageDeltaObjectDelta content(List<MessageDeltaObjectDeltaContentInner> content) {
    this.content = content;
    return this;
  }

  
  @ApiModelProperty(value = "The content of the message in array of text and/or images.")
  @JsonProperty("content")
  public List<MessageDeltaObjectDeltaContentInner> getContent() {
    return content;
  }
  public void setContent(List<MessageDeltaObjectDeltaContentInner> content) {
    this.content = content;
  }

  /**
   * A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
   **/
  public MessageDeltaObjectDelta fileIds(List<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  
  @ApiModelProperty(value = "A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.")
  @JsonProperty("file_ids")
  public List<String> getFileIds() {
    return fileIds;
  }
  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageDeltaObjectDelta messageDeltaObjectDelta = (MessageDeltaObjectDelta) o;
    return Objects.equals(role, messageDeltaObjectDelta.role) &&
        Objects.equals(content, messageDeltaObjectDelta.content) &&
        Objects.equals(fileIds, messageDeltaObjectDelta.fileIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, content, fileIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDeltaObjectDelta {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
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

