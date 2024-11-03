package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.MessageContentImageFileObject;
import org.openapitools.vertxweb.server.model.MessageContentImageFileObjectImageFile;
import org.openapitools.vertxweb.server.model.MessageContentTextObject;
import org.openapitools.vertxweb.server.model.MessageContentTextObjectText;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessageObjectContentInner   {
  


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
      return value;
    }
  }

  private TypeEnum type;
  private MessageContentImageFileObjectImageFile imageFile;
  private MessageContentTextObjectText text;

  public MessageObjectContentInner () {

  }

  public MessageObjectContentInner (TypeEnum type, MessageContentImageFileObjectImageFile imageFile, MessageContentTextObjectText text) {
    this.type = type;
    this.imageFile = imageFile;
    this.text = text;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
  @JsonProperty("image_file")
  public MessageContentImageFileObjectImageFile getImageFile() {
    return imageFile;
  }
  public void setImageFile(MessageContentImageFileObjectImageFile imageFile) {
    this.imageFile = imageFile;
  }

    
  @JsonProperty("text")
  public MessageContentTextObjectText getText() {
    return text;
  }
  public void setText(MessageContentTextObjectText text) {
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
    MessageObjectContentInner messageObjectContentInner = (MessageObjectContentInner) o;
    return Objects.equals(type, messageObjectContentInner.type) &&
        Objects.equals(imageFile, messageObjectContentInner.imageFile) &&
        Objects.equals(text, messageObjectContentInner.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, imageFile, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageObjectContentInner {\n");
    
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
