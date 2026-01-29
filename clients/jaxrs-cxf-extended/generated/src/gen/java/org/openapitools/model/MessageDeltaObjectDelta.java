package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MessageDeltaObjectDeltaContentInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The delta containing the fields that have changed on the Message.
 */
@ApiModel(description="The delta containing the fields that have changed on the Message.")

public class MessageDeltaObjectDelta  {
  
public enum RoleEnum {

    @JsonProperty("user") USER(String.valueOf("user")),
    @JsonProperty("assistant") ASSISTANT(String.valueOf("assistant"));

    private String value;

    RoleEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RoleEnum fromValue(String value) {
        for (RoleEnum b : RoleEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The entity that produced the message. One of `user` or `assistant`.
  */
  @ApiModelProperty(value = "The entity that produced the message. One of `user` or `assistant`.")
  private RoleEnum role;

 /**
  * The content of the message in array of text and/or images.
  */
  @ApiModelProperty(value = "The content of the message in array of text and/or images.")
  @Valid
  private List<MessageDeltaObjectDeltaContentInner> content = new ArrayList<>();

 /**
  * A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
  */
  @ApiModelProperty(value = "A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.")
  private List<String> fileIds = new ArrayList<>();
 /**
  * The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;.
  * @return role
  */
  @JsonProperty("role")
  public String getRole() {
    return role == null ? null : role.value();
  }

  /**
   * Sets the <code>role</code> property.
   */
 public void setRole(RoleEnum role) {
    this.role = role;
  }

  /**
   * Sets the <code>role</code> property.
   */
  public MessageDeltaObjectDelta role(RoleEnum role) {
    this.role = role;
    return this;
  }

 /**
  * The content of the message in array of text and/or images.
  * @return content
  */
  @JsonProperty("content")
  public List<MessageDeltaObjectDeltaContentInner> getContent() {
    return content;
  }

  /**
   * Sets the <code>content</code> property.
   */
 public void setContent(List<MessageDeltaObjectDeltaContentInner> content) {
    this.content = content;
  }

  /**
   * Sets the <code>content</code> property.
   */
  public MessageDeltaObjectDelta content(List<MessageDeltaObjectDeltaContentInner> content) {
    this.content = content;
    return this;
  }

  /**
   * Adds a new item to the <code>content</code> list.
   */
  public MessageDeltaObjectDelta addContentItem(MessageDeltaObjectDeltaContentInner contentItem) {
    this.content.add(contentItem);
    return this;
  }

 /**
  * A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
  * @return fileIds
  */
  @JsonProperty("file_ids")
 @Size(max=10)  public List<String> getFileIds() {
    return fileIds;
  }

  /**
   * Sets the <code>fileIds</code> property.
   */
 public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  /**
   * Sets the <code>fileIds</code> property.
   */
  public MessageDeltaObjectDelta fileIds(List<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  /**
   * Adds a new item to the <code>fileIds</code> list.
   */
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

