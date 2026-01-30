package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.MessageDeltaContentImageUrlObjectImageUrl;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * References an image URL in the content of a message.
 */

@Schema(name = "MessageDeltaContentImageUrlObject", description = "References an image URL in the content of a message.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageDeltaContentImageUrlObject implements MessageDeltaObjectDeltaContentInner {

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private TypeEnum type;

  private @Nullable MessageDeltaContentImageUrlObjectImageUrl imageUrl;

  public MessageDeltaContentImageUrlObject() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MessageDeltaContentImageUrlObject(Integer index, TypeEnum type) {
    this.index = index;
    this.type = type;
  }

  public MessageDeltaContentImageUrlObject index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * The index of the content part in the message.
   * @return index
   */
  @NotNull 
  @Schema(name = "index", description = "The index of the content part in the message.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("index")
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
   */
  @NotNull 
  @Schema(name = "type", description = "Always `image_url`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public MessageDeltaContentImageUrlObject imageUrl(@Nullable MessageDeltaContentImageUrlObjectImageUrl imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   * @return imageUrl
   */
  @Valid 
  @Schema(name = "image_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image_url")
  public @Nullable MessageDeltaContentImageUrlObjectImageUrl getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(@Nullable MessageDeltaContentImageUrlObjectImageUrl imageUrl) {
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

