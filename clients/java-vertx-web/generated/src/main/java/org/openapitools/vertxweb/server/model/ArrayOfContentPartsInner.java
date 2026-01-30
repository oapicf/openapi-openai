package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.MessageContentImageFileObject;
import org.openapitools.vertxweb.server.model.MessageContentImageFileObjectImageFile;
import org.openapitools.vertxweb.server.model.MessageContentImageUrlObject;
import org.openapitools.vertxweb.server.model.MessageContentImageUrlObjectImageUrl;
import org.openapitools.vertxweb.server.model.MessageRequestContentTextObject;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ArrayOfContentPartsInner   {
  


  public enum TypeEnum {
    IMAGE_FILE("image_file"),
    IMAGE_URL("image_url"),
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
  private MessageContentImageUrlObjectImageUrl imageUrl;
  private String text;

  public ArrayOfContentPartsInner () {

  }

  public ArrayOfContentPartsInner (TypeEnum type, MessageContentImageFileObjectImageFile imageFile, MessageContentImageUrlObjectImageUrl imageUrl, String text) {
    this.type = type;
    this.imageFile = imageFile;
    this.imageUrl = imageUrl;
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

    
  @JsonProperty("image_url")
  public MessageContentImageUrlObjectImageUrl getImageUrl() {
    return imageUrl;
  }
  public void setImageUrl(MessageContentImageUrlObjectImageUrl imageUrl) {
    this.imageUrl = imageUrl;
  }

    
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
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
    ArrayOfContentPartsInner arrayOfContentPartsInner = (ArrayOfContentPartsInner) o;
    return Objects.equals(type, arrayOfContentPartsInner.type) &&
        Objects.equals(imageFile, arrayOfContentPartsInner.imageFile) &&
        Objects.equals(imageUrl, arrayOfContentPartsInner.imageUrl) &&
        Objects.equals(text, arrayOfContentPartsInner.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, imageFile, imageUrl, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayOfContentPartsInner {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    imageFile: ").append(toIndentedString(imageFile)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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
