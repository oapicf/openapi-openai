package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MessageDeltaObjectDeltaContentInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The delta containing the fields that have changed on the Message.
 **/
@ApiModel(description="The delta containing the fields that have changed on the Message.")

public class MessageDeltaObjectDelta  {
  
public enum RoleEnum {

USER(String.valueOf("user")), ASSISTANT(String.valueOf("assistant"));


    private String value;

    RoleEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String value) {
        for (RoleEnum b : RoleEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "The entity that produced the message. One of `user` or `assistant`.")
 /**
   * The entity that produced the message. One of `user` or `assistant`.
  **/
  private RoleEnum role;

  @ApiModelProperty(value = "The content of the message in array of text and/or images.")
  @Valid
 /**
   * The content of the message in array of text and/or images.
  **/
  private List<MessageDeltaObjectDeltaContentInner> content = new ArrayList<>();

  @ApiModelProperty(value = "A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.")
 /**
   * A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
  **/
  private List<String> fileIds = new ArrayList<>();
 /**
   * The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;.
   * @return role
  **/
  @JsonProperty("role")
  public String getRole() {
    if (role == null) {
      return null;
    }
    return role.value();
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public MessageDeltaObjectDelta role(RoleEnum role) {
    this.role = role;
    return this;
  }

 /**
   * The content of the message in array of text and/or images.
   * @return content
  **/
  @JsonProperty("content")
  public List<MessageDeltaObjectDeltaContentInner> getContent() {
    return content;
  }

  public void setContent(List<MessageDeltaObjectDeltaContentInner> content) {
    this.content = content;
  }

  public MessageDeltaObjectDelta content(List<MessageDeltaObjectDeltaContentInner> content) {
    this.content = content;
    return this;
  }

  public MessageDeltaObjectDelta addContentItem(MessageDeltaObjectDeltaContentInner contentItem) {
    this.content.add(contentItem);
    return this;
  }

 /**
   * A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
   * @return fileIds
  **/
  @JsonProperty("file_ids")
 @Size(max=10)  public List<String> getFileIds() {
    return fileIds;
  }

  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  public MessageDeltaObjectDelta fileIds(List<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  public MessageDeltaObjectDelta addFileIdsItem(String fileIdsItem) {
    this.fileIds.add(fileIdsItem);
    return this;
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
    return Objects.equals(this.role, messageDeltaObjectDelta.role) &&
        Objects.equals(this.content, messageDeltaObjectDelta.content) &&
        Objects.equals(this.fileIds, messageDeltaObjectDelta.fileIds);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

