package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessageDeltaContentImageUrlObjectImageUrl;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * References an image URL in the content of a message.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "References an image URL in the content of a message.")
public class MessageDeltaContentImageUrlObject   {
  
  private Integer index;


public enum TypeEnum {

    @JsonProperty("image_url") IMAGE_URL(String.valueOf("image_url"));


    private String value;

    TypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private TypeEnum type;

  private MessageDeltaContentImageUrlObjectImageUrl imageUrl;

  /**
   * The index of the content part in the message.
   **/
  public MessageDeltaContentImageUrlObject index(Integer index) {
    this.index = index;
    return this;
  }

  
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
   * Always &#x60;image_url&#x60;.
   **/
  public MessageDeltaContentImageUrlObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Always `image_url`.")
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
  public MessageDeltaContentImageUrlObject imageUrl(MessageDeltaContentImageUrlObjectImageUrl imageUrl) {
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
    MessageDeltaContentImageUrlObject messageDeltaContentImageUrlObject = (MessageDeltaContentImageUrlObject) o;
    return Objects.equals(this.index, messageDeltaContentImageUrlObject.index) &&
        Objects.equals(this.type, messageDeltaContentImageUrlObject.type) &&
        Objects.equals(this.imageUrl, messageDeltaContentImageUrlObject.imageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, type, imageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDeltaContentImageUrlObject {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

