package apimodels;

import apimodels.MessageContentImageFileObject;
import apimodels.MessageContentImageFileObjectImageFile;
import apimodels.MessageContentImageUrlObject;
import apimodels.MessageContentImageUrlObjectImageUrl;
import apimodels.MessageContentRefusalObject;
import apimodels.MessageContentTextObject;
import apimodels.MessageContentTextObjectText;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * MessageObjectContentInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MessageObjectContentInner   {
  /**
   * Always `image_file`.
   */
  public enum TypeEnum {
    IMAGE_FILE("image_file"),
    
    IMAGE_URL("image_url"),
    
    TEXT("text"),
    
    REFUSAL("refusal");

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

  @JsonProperty("image_file")
  @NotNull
@Valid

  private MessageContentImageFileObjectImageFile imageFile;

  @JsonProperty("image_url")
  @NotNull
@Valid

  private MessageContentImageUrlObjectImageUrl imageUrl;

  @JsonProperty("text")
  @NotNull
@Valid

  private MessageContentTextObjectText text;

  @JsonProperty("refusal")
  @NotNull

  private String refusal;

  public MessageObjectContentInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Always `image_file`.
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public MessageObjectContentInner imageFile(MessageContentImageFileObjectImageFile imageFile) {
    this.imageFile = imageFile;
    return this;
  }

   /**
   * Get imageFile
   * @return imageFile
  **/
  public MessageContentImageFileObjectImageFile getImageFile() {
    return imageFile;
  }

  public void setImageFile(MessageContentImageFileObjectImageFile imageFile) {
    this.imageFile = imageFile;
  }

  public MessageObjectContentInner imageUrl(MessageContentImageUrlObjectImageUrl imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  public MessageContentImageUrlObjectImageUrl getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(MessageContentImageUrlObjectImageUrl imageUrl) {
    this.imageUrl = imageUrl;
  }

  public MessageObjectContentInner text(MessageContentTextObjectText text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  public MessageContentTextObjectText getText() {
    return text;
  }

  public void setText(MessageContentTextObjectText text) {
    this.text = text;
  }

  public MessageObjectContentInner refusal(String refusal) {
    this.refusal = refusal;
    return this;
  }

   /**
   * Get refusal
   * @return refusal
  **/
  public String getRefusal() {
    return refusal;
  }

  public void setRefusal(String refusal) {
    this.refusal = refusal;
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
        Objects.equals(imageUrl, messageObjectContentInner.imageUrl) &&
        Objects.equals(text, messageObjectContentInner.text) &&
        Objects.equals(refusal, messageObjectContentInner.refusal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, imageFile, imageUrl, text, refusal);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageObjectContentInner {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    imageFile: ").append(toIndentedString(imageFile)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    refusal: ").append(toIndentedString(refusal)).append("\n");
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

