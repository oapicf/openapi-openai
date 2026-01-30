package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.MessageDeltaContentImageUrlObjectImageUrl;

/**
 * References an image URL in the content of a message.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessageDeltaContentImageUrlObject   {
  
  private Integer index;


  public enum TypeEnum {
    IMAGE_URL("image_url");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type;
  private MessageDeltaContentImageUrlObjectImageUrl imageUrl;

  public MessageDeltaContentImageUrlObject () {

  }

  public MessageDeltaContentImageUrlObject (Integer index, TypeEnum type, MessageDeltaContentImageUrlObjectImageUrl imageUrl) {
    this.index = index;
    this.type = type;
    this.imageUrl = imageUrl;
  }

    
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
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
    return Objects.equals(index, messageDeltaContentImageUrlObject.index) &&
        Objects.equals(type, messageDeltaContentImageUrlObject.type) &&
        Objects.equals(imageUrl, messageDeltaContentImageUrlObject.imageUrl);
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
