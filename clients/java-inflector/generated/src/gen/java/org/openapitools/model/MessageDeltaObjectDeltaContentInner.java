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
import org.openapitools.model.MessageDeltaContentImageUrlObject;
import org.openapitools.model.MessageDeltaContentImageUrlObjectImageUrl;
import org.openapitools.model.MessageDeltaContentRefusalObject;
import org.openapitools.model.MessageDeltaContentTextObject;
import org.openapitools.model.MessageDeltaContentTextObjectText;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageDeltaObjectDeltaContentInner   {
  @JsonProperty("index")
  private Integer index;

  /**
   * Always `image_file`.
   */
  public enum TypeEnum {
    IMAGE_FILE("image_file"),
    
    TEXT("text"),
    
    REFUSAL("refusal"),
    
    IMAGE_URL("image_url");

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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("image_file")
  private MessageDeltaContentImageFileObjectImageFile imageFile;

  @JsonProperty("text")
  private MessageDeltaContentTextObjectText text;

  @JsonProperty("refusal")
  private String refusal;

  @JsonProperty("image_url")
  private MessageDeltaContentImageUrlObjectImageUrl imageUrl;

  /**
   * The index of the content part in the message.
   **/
  public MessageDeltaObjectDeltaContentInner index(Integer index) {
    this.index = index;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The index of the content part in the message.")
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * Always `image_file`.
   **/
  public MessageDeltaObjectDeltaContentInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Always `image_file`.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  public MessageDeltaObjectDeltaContentInner imageFile(MessageDeltaContentImageFileObjectImageFile imageFile) {
    this.imageFile = imageFile;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("image_file")
  public MessageDeltaContentImageFileObjectImageFile getImageFile() {
    return imageFile;
  }
  public void setImageFile(MessageDeltaContentImageFileObjectImageFile imageFile) {
    this.imageFile = imageFile;
  }

  /**
   **/
  public MessageDeltaObjectDeltaContentInner text(MessageDeltaContentTextObjectText text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("text")
  public MessageDeltaContentTextObjectText getText() {
    return text;
  }
  public void setText(MessageDeltaContentTextObjectText text) {
    this.text = text;
  }

  /**
   **/
  public MessageDeltaObjectDeltaContentInner refusal(String refusal) {
    this.refusal = refusal;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("refusal")
  public String getRefusal() {
    return refusal;
  }
  public void setRefusal(String refusal) {
    this.refusal = refusal;
  }

  /**
   **/
  public MessageDeltaObjectDeltaContentInner imageUrl(MessageDeltaContentImageUrlObjectImageUrl imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("image_url")
  public MessageDeltaContentImageUrlObjectImageUrl getImageUrl() {
    return imageUrl;
  }
  public void setImageUrl(MessageDeltaContentImageUrlObjectImageUrl imageUrl) {
    this.imageUrl = imageUrl;
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
    return Objects.equals(index, messageDeltaObjectDeltaContentInner.index) &&
        Objects.equals(type, messageDeltaObjectDeltaContentInner.type) &&
        Objects.equals(imageFile, messageDeltaObjectDeltaContentInner.imageFile) &&
        Objects.equals(text, messageDeltaObjectDeltaContentInner.text) &&
        Objects.equals(refusal, messageDeltaObjectDeltaContentInner.refusal) &&
        Objects.equals(imageUrl, messageDeltaObjectDeltaContentInner.imageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, type, imageFile, text, refusal, imageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDeltaObjectDeltaContentInner {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    imageFile: ").append(toIndentedString(imageFile)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    refusal: ").append(toIndentedString(refusal)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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

