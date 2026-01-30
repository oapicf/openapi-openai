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
 * The default strategy. This strategy currently uses a &#x60;max_chunk_size_tokens&#x60; of &#x60;800&#x60; and &#x60;chunk_overlap_tokens&#x60; of &#x60;400&#x60;.
 */

@Schema(name = "AutoChunkingStrategyRequestParam", description = "The default strategy. This strategy currently uses a `max_chunk_size_tokens` of `800` and `chunk_overlap_tokens` of `400`.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AutoChunkingStrategyRequestParam implements ChunkingStrategyRequestParam, CreateVectorStoreRequestChunkingStrategy {

  /**
   * Always `auto`.
   */
  public enum TypeEnum {
    AUTO("auto");

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

  public AutoChunkingStrategyRequestParam() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AutoChunkingStrategyRequestParam(TypeEnum type) {
    this.type = type;
  }

  public AutoChunkingStrategyRequestParam type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Always `auto`.
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "Always `auto`.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    AutoChunkingStrategyRequestParam autoChunkingStrategyRequestParam = (AutoChunkingStrategyRequestParam) o;
    return Objects.equals(this.type, autoChunkingStrategyRequestParam.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoChunkingStrategyRequestParam {\n");
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

