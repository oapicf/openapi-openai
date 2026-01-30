package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.MessageDeltaContentTextObjectText;
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
 * The text content that is part of a message.
 */

@Schema(name = "MessageDeltaContentTextObject", description = "The text content that is part of a message.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageDeltaContentTextObject implements MessageDeltaObjectDeltaContentInner {

  private Integer index;

  /**
   * Always `text`.
   */
  public enum TypeEnum {
    TEXT("text");

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

  private @Nullable MessageDeltaContentTextObjectText text;

  public MessageDeltaContentTextObject() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MessageDeltaContentTextObject(Integer index, TypeEnum type) {
    this.index = index;
    this.type = type;
  }

  public MessageDeltaContentTextObject index(Integer index) {
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

  public MessageDeltaContentTextObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Always `text`.
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "Always `text`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public MessageDeltaContentTextObject text(@Nullable MessageDeltaContentTextObjectText text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
   */
  @Valid 
  @Schema(name = "text", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text")
  public @Nullable MessageDeltaContentTextObjectText getText() {
    return text;
  }

  public void setText(@Nullable MessageDeltaContentTextObjectText text) {
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
    MessageDeltaContentTextObject messageDeltaContentTextObject = (MessageDeltaContentTextObject) o;
    return Objects.equals(this.index, messageDeltaContentTextObject.index) &&
        Objects.equals(this.type, messageDeltaContentTextObject.type) &&
        Objects.equals(this.text, messageDeltaContentTextObject.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, type, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDeltaContentTextObject {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

