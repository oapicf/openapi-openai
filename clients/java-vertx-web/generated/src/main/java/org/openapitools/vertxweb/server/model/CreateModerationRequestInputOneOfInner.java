package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.CreateModerationRequestInputOneOfInnerOneOf;
import org.openapitools.vertxweb.server.model.CreateModerationRequestInputOneOfInnerOneOf1;
import org.openapitools.vertxweb.server.model.CreateModerationRequestInputOneOfInnerOneOfImageUrl;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateModerationRequestInputOneOfInner   {
  


  public enum TypeEnum {
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
  private CreateModerationRequestInputOneOfInnerOneOfImageUrl imageUrl;
  private String text;

  public CreateModerationRequestInputOneOfInner () {

  }

  public CreateModerationRequestInputOneOfInner (TypeEnum type, CreateModerationRequestInputOneOfInnerOneOfImageUrl imageUrl, String text) {
    this.type = type;
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

    
  @JsonProperty("image_url")
  public CreateModerationRequestInputOneOfInnerOneOfImageUrl getImageUrl() {
    return imageUrl;
  }
  public void setImageUrl(CreateModerationRequestInputOneOfInnerOneOfImageUrl imageUrl) {
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
    CreateModerationRequestInputOneOfInner createModerationRequestInputOneOfInner = (CreateModerationRequestInputOneOfInner) o;
    return Objects.equals(type, createModerationRequestInputOneOfInner.type) &&
        Objects.equals(imageUrl, createModerationRequestInputOneOfInner.imageUrl) &&
        Objects.equals(text, createModerationRequestInputOneOfInner.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, imageUrl, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationRequestInputOneOfInner {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
