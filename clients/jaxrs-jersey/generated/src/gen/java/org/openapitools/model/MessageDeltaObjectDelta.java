/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The delta containing the fields that have changed on the Message.
 */
@ApiModel(description = "The delta containing the fields that have changed on the Message.")
@JsonPropertyOrder({
  MessageDeltaObjectDelta.JSON_PROPERTY_ROLE,
  MessageDeltaObjectDelta.JSON_PROPERTY_CONTENT,
  MessageDeltaObjectDelta.JSON_PROPERTY_FILE_IDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-03T11:08:40.472203335Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class MessageDeltaObjectDelta   {
  /**
   * The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;.
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
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ROLE = "role";
  @JsonProperty(JSON_PROPERTY_ROLE)
  private RoleEnum role;

  public static final String JSON_PROPERTY_CONTENT = "content";
  @JsonProperty(JSON_PROPERTY_CONTENT)
  private List<MessageDeltaObjectDeltaContentInner> content = new ArrayList<>();

  public static final String JSON_PROPERTY_FILE_IDS = "file_ids";
  @JsonProperty(JSON_PROPERTY_FILE_IDS)
  private List<String> fileIds = new ArrayList<>();

  public MessageDeltaObjectDelta role(RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;.
   * @return role
   **/
  @JsonProperty(value = "role")
  @ApiModelProperty(value = "The entity that produced the message. One of `user` or `assistant`.")
  
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public MessageDeltaObjectDelta content(List<MessageDeltaObjectDeltaContentInner> content) {
    this.content = content;
    return this;
  }

  public MessageDeltaObjectDelta addContentItem(MessageDeltaObjectDeltaContentInner contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * The content of the message in array of text and/or images.
   * @return content
   **/
  @JsonProperty(value = "content")
  @ApiModelProperty(value = "The content of the message in array of text and/or images.")
  @Valid 
  public List<MessageDeltaObjectDeltaContentInner> getContent() {
    return content;
  }

  public void setContent(List<MessageDeltaObjectDeltaContentInner> content) {
    this.content = content;
  }

  public MessageDeltaObjectDelta fileIds(List<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  public MessageDeltaObjectDelta addFileIdsItem(String fileIdsItem) {
    if (this.fileIds == null) {
      this.fileIds = new ArrayList<>();
    }
    this.fileIds.add(fileIdsItem);
    return this;
  }

  /**
   * A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
   * @return fileIds
   **/
  @JsonProperty(value = "file_ids")
  @ApiModelProperty(value = "A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.")
   @Size(max=10)
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

