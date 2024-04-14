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
import org.openapitools.model.MessageDeltaContentImageFileObject;
import org.openapitools.model.MessageDeltaContentImageFileObjectImageFile;
import org.openapitools.model.MessageDeltaContentTextObject;
import org.openapitools.model.MessageDeltaContentTextObjectText;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * MessageDeltaObjectDeltaContentInner
 */
@JsonPropertyOrder({
  MessageDeltaObjectDeltaContentInner.JSON_PROPERTY_INDEX,
  MessageDeltaObjectDeltaContentInner.JSON_PROPERTY_TYPE,
  MessageDeltaObjectDeltaContentInner.JSON_PROPERTY_IMAGE_FILE,
  MessageDeltaObjectDeltaContentInner.JSON_PROPERTY_TEXT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-04-14T13:41:38.036864137Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MessageDeltaObjectDeltaContentInner   {
  public static final String JSON_PROPERTY_INDEX = "index";
  @JsonProperty(JSON_PROPERTY_INDEX)
  private Integer index;

  /**
   * Always &#x60;image_file&#x60;.
   */
  public enum TypeEnum {
    IMAGE_FILE("image_file"),
    
    TEXT("text");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  @JsonProperty(JSON_PROPERTY_TYPE)
  private TypeEnum type;

  public static final String JSON_PROPERTY_IMAGE_FILE = "image_file";
  @JsonProperty(JSON_PROPERTY_IMAGE_FILE)
  private MessageDeltaContentImageFileObjectImageFile imageFile;

  public static final String JSON_PROPERTY_TEXT = "text";
  @JsonProperty(JSON_PROPERTY_TEXT)
  private MessageDeltaContentTextObjectText text;

  public MessageDeltaObjectDeltaContentInner index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * The index of the content part in the message.
   * @return index
   **/
  @JsonProperty(value = "index")
  @ApiModelProperty(required = true, value = "The index of the content part in the message.")
  @NotNull 
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public MessageDeltaObjectDeltaContentInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Always &#x60;image_file&#x60;.
   * @return type
   **/
  @JsonProperty(value = "type")
  @ApiModelProperty(required = true, value = "Always `image_file`.")
  @NotNull 
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public MessageDeltaObjectDeltaContentInner imageFile(MessageDeltaContentImageFileObjectImageFile imageFile) {
    this.imageFile = imageFile;
    return this;
  }

  /**
   * Get imageFile
   * @return imageFile
   **/
  @JsonProperty(value = "image_file")
  @ApiModelProperty(value = "")
  @Valid 
  public MessageDeltaContentImageFileObjectImageFile getImageFile() {
    return imageFile;
  }

  public void setImageFile(MessageDeltaContentImageFileObjectImageFile imageFile) {
    this.imageFile = imageFile;
  }

  public MessageDeltaObjectDeltaContentInner text(MessageDeltaContentTextObjectText text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
   **/
  @JsonProperty(value = "text")
  @ApiModelProperty(value = "")
  @Valid 
  public MessageDeltaContentTextObjectText getText() {
    return text;
  }

  public void setText(MessageDeltaContentTextObjectText text) {
    this.text = text;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageDeltaObjectDeltaContentInner messageDeltaObjectDeltaContentInner = (MessageDeltaObjectDeltaContentInner) o;
    return Objects.equals(this.index, messageDeltaObjectDeltaContentInner.index) &&
        Objects.equals(this.type, messageDeltaObjectDeltaContentInner.type) &&
        Objects.equals(this.imageFile, messageDeltaObjectDeltaContentInner.imageFile) &&
        Objects.equals(this.text, messageDeltaObjectDeltaContentInner.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, type, imageFile, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDeltaObjectDeltaContentInner {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    imageFile: ").append(toIndentedString(imageFile)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

