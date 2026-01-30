package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageDeltaObjectDeltaContentInner   {
  
  private Integer index;

  /**
   * Always &#x60;image_file&#x60;.
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
  }

  private TypeEnum type;
  private MessageDeltaContentImageFileObjectImageFile imageFile;
  private MessageDeltaContentTextObjectText text;
  private String refusal;
  private MessageDeltaContentImageUrlObjectImageUrl imageUrl;

  /**
   * The index of the content part in the message.
   **/
  
  @ApiModelProperty(required = true, value = "The index of the content part in the message.")
  @JsonProperty("index")
  @NotNull
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * Always &#x60;image_file&#x60;.
   **/
  
  @ApiModelProperty(required = true, value = "Always `image_file`.")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("image_file")
  @Valid
  public MessageDeltaContentImageFileObjectImageFile getImageFile() {
    return imageFile;
  }
  public void setImageFile(MessageDeltaContentImageFileObjectImageFile imageFile) {
    this.imageFile = imageFile;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("text")
  @Valid
  public MessageDeltaContentTextObjectText getText() {
    return text;
  }
  public void setText(MessageDeltaContentTextObjectText text) {
    this.text = text;
  }

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("image_url")
  @Valid
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
    return Objects.equals(this.index, messageDeltaObjectDeltaContentInner.index) &&
        Objects.equals(this.type, messageDeltaObjectDeltaContentInner.type) &&
        Objects.equals(this.imageFile, messageDeltaObjectDeltaContentInner.imageFile) &&
        Objects.equals(this.text, messageDeltaObjectDeltaContentInner.text) &&
        Objects.equals(this.refusal, messageDeltaObjectDeltaContentInner.refusal) &&
        Objects.equals(this.imageUrl, messageDeltaObjectDeltaContentInner.imageUrl);
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

