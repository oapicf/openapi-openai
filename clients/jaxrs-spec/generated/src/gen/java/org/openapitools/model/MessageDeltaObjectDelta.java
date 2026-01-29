package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MessageDeltaObjectDeltaContentInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The delta containing the fields that have changed on the Message.
 **/
@ApiModel(description = "The delta containing the fields that have changed on the Message.")
@JsonTypeName("MessageDeltaObject_delta")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T10:45:34.459631427Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageDeltaObjectDelta   {
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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static RoleEnum fromString(String s) {
        for (RoleEnum b : RoleEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private RoleEnum role;
  private @Valid List<MessageDeltaObjectDeltaContentInner> content = new ArrayList<>();
  private @Valid List<String> fileIds = new ArrayList<>();

  public MessageDeltaObjectDelta() {
  }

  /**
   * The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;.
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

  @JsonProperty("role")
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
  @Valid public List<@Valid MessageDeltaObjectDeltaContentInner> getContent() {
    return content;
  }

  @JsonProperty("content")
  public void setContent(List<MessageDeltaObjectDeltaContentInner> content) {
    this.content = content;
  }

  public MessageDeltaObjectDelta addContentItem(MessageDeltaObjectDeltaContentInner contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }

    this.content.add(contentItem);
    return this;
  }

  public MessageDeltaObjectDelta removeContentItem(MessageDeltaObjectDeltaContentInner contentItem) {
    if (contentItem != null && this.content != null) {
      this.content.remove(contentItem);
    }

    return this;
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
   @Size(max=10)public List<String> getFileIds() {
    return fileIds;
  }

  @JsonProperty("file_ids")
  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  public MessageDeltaObjectDelta addFileIdsItem(String fileIdsItem) {
    if (this.fileIds == null) {
      this.fileIds = new ArrayList<>();
    }

    this.fileIds.add(fileIdsItem);
    return this;
  }

  public MessageDeltaObjectDelta removeFileIdsItem(String fileIdsItem) {
    if (fileIdsItem != null && this.fileIds != null) {
      this.fileIds.remove(fileIdsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

