package apimodels;

import apimodels.CreateModerationRequestInputOneOfInnerOneOf;
import apimodels.CreateModerationRequestInputOneOfInnerOneOf1;
import apimodels.CreateModerationRequestInputOneOfInnerOneOfImageUrl;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateModerationRequestInputOneOfInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateModerationRequestInputOneOfInner   {
  /**
   * Always `image_url`.
   */
  public enum TypeEnum {
    IMAGE_URL("image_url"),
    
    TEXT("text");

    private final String value;

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

  @JsonProperty("type")
  @NotNull

  private TypeEnum type;

  @JsonProperty("image_url")
  @NotNull
@Valid

  private CreateModerationRequestInputOneOfInnerOneOfImageUrl imageUrl;

  @JsonProperty("text")
  @NotNull

  private String text;

  public CreateModerationRequestInputOneOfInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Always `image_url`.
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public CreateModerationRequestInputOneOfInner imageUrl(CreateModerationRequestInputOneOfInnerOneOfImageUrl imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  public CreateModerationRequestInputOneOfInnerOneOfImageUrl getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(CreateModerationRequestInputOneOfInnerOneOfImageUrl imageUrl) {
    this.imageUrl = imageUrl;
  }

  public CreateModerationRequestInputOneOfInner text(String text) {
    this.text = text;
    return this;
  }

   /**
   * A string of text to classify.
   * @return text
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

