package apimodels;

import apimodels.MessageDeltaContentImageUrlObjectImageUrl;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * References an image URL in the content of a message.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MessageDeltaContentImageUrlObject   {
  @JsonProperty("index")
  @NotNull

  private Integer index;

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
  @Valid

  private MessageDeltaContentImageUrlObjectImageUrl imageUrl;

  public MessageDeltaContentImageUrlObject index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * The index of the content part in the message.
   * @return index
  **/
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public MessageDeltaContentImageUrlObject type(TypeEnum type) {
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

  public MessageDeltaContentImageUrlObject imageUrl(MessageDeltaContentImageUrlObjectImageUrl imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

