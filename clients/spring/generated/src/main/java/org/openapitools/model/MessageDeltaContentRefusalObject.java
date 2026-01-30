package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * The refusal content that is part of a message.
 */

@Schema(name = "MessageDeltaContentRefusalObject", description = "The refusal content that is part of a message.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageDeltaContentRefusalObject implements MessageDeltaObjectDeltaContentInner {

  private Integer index;

  /**
   * Always `refusal`.
   */
  public enum TypeEnum {
    REFUSAL("refusal");

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

  private @Nullable String refusal;

  public MessageDeltaContentRefusalObject() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MessageDeltaContentRefusalObject(Integer index, TypeEnum type) {
    this.index = index;
    this.type = type;
  }

  public MessageDeltaContentRefusalObject index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * The index of the refusal part in the message.
   * @return index
   */
  @NotNull 
  @Schema(name = "index", description = "The index of the refusal part in the message.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public MessageDeltaContentRefusalObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Always `refusal`.
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "Always `refusal`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public MessageDeltaContentRefusalObject refusal(@Nullable String refusal) {
    this.refusal = refusal;
    return this;
  }

  /**
   * Get refusal
   * @return refusal
   */
  
  @Schema(name = "refusal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("refusal")
  public @Nullable String getRefusal() {
    return refusal;
  }

  public void setRefusal(@Nullable String refusal) {
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
    MessageDeltaContentRefusalObject messageDeltaContentRefusalObject = (MessageDeltaContentRefusalObject) o;
    return Objects.equals(this.index, messageDeltaContentRefusalObject.index) &&
        Objects.equals(this.type, messageDeltaContentRefusalObject.type) &&
        Objects.equals(this.refusal, messageDeltaContentRefusalObject.refusal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, type, refusal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDeltaContentRefusalObject {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

