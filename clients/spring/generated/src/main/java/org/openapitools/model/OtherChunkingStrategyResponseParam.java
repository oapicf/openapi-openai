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
 * This is returned when the chunking strategy is unknown. Typically, this is because the file was indexed before the &#x60;chunking_strategy&#x60; concept was introduced in the API.
 */

@Schema(name = "OtherChunkingStrategyResponseParam", description = "This is returned when the chunking strategy is unknown. Typically, this is because the file was indexed before the `chunking_strategy` concept was introduced in the API.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class OtherChunkingStrategyResponseParam implements VectorStoreFileObjectChunkingStrategy {

  /**
   * Always `other`.
   */
  public enum TypeEnum {
    OTHER("other");

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

  public OtherChunkingStrategyResponseParam() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OtherChunkingStrategyResponseParam(TypeEnum type) {
    this.type = type;
  }

  public OtherChunkingStrategyResponseParam type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Always `other`.
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "Always `other`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherChunkingStrategyResponseParam otherChunkingStrategyResponseParam = (OtherChunkingStrategyResponseParam) o;
    return Objects.equals(this.type, otherChunkingStrategyResponseParam.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherChunkingStrategyResponseParam {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

