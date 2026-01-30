package apimodels;

import apimodels.CreateModerationRequestInputOneOfInnerOneOfImageUrl;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * An object describing an image to classify.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateModerationRequestInputOneOfInnerOneOf   {
  /**
   * Always `image_url`.
   */
  public enum TypeEnum {
    IMAGE_URL("image_url");

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

  public CreateModerationRequestInputOneOfInnerOneOf type(TypeEnum type) {
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

  public CreateModerationRequestInputOneOfInnerOneOf imageUrl(CreateModerationRequestInputOneOfInnerOneOfImageUrl imageUrl) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateModerationRequestInputOneOfInnerOneOf createModerationRequestInputOneOfInnerOneOf = (CreateModerationRequestInputOneOfInnerOneOf) o;
    return Objects.equals(type, createModerationRequestInputOneOfInnerOneOf.type) &&
        Objects.equals(imageUrl, createModerationRequestInputOneOfInnerOneOf.imageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, imageUrl);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationRequestInputOneOfInnerOneOf {\n");
    
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

