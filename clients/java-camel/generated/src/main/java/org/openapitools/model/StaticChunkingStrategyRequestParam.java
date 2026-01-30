package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.StaticChunkingStrategy;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * StaticChunkingStrategyRequestParam
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class StaticChunkingStrategyRequestParam implements ChunkingStrategyRequestParam, CreateVectorStoreRequestChunkingStrategy {

  /**
   * Always `static`.
   */
  public enum TypeEnum {
    STATIC("static");

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

  private StaticChunkingStrategy _static;

  public StaticChunkingStrategyRequestParam() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StaticChunkingStrategyRequestParam(TypeEnum type, StaticChunkingStrategy _static) {
    this.type = type;
    this._static = _static;
  }

  public StaticChunkingStrategyRequestParam type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Always `static`.
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "Always `static`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public StaticChunkingStrategyRequestParam _static(StaticChunkingStrategy _static) {
    this._static = _static;
    return this;
  }

  /**
   * Get _static
   * @return _static
   */
  @NotNull @Valid 
  @Schema(name = "static", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("static")
  public StaticChunkingStrategy getStatic() {
    return _static;
  }

  public void setStatic(StaticChunkingStrategy _static) {
    this._static = _static;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaticChunkingStrategyRequestParam staticChunkingStrategyRequestParam = (StaticChunkingStrategyRequestParam) o;
    return Objects.equals(this.type, staticChunkingStrategyRequestParam.type) &&
        Objects.equals(this._static, staticChunkingStrategyRequestParam._static);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, _static);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaticChunkingStrategyRequestParam {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    _static: ").append(toIndentedString(_static)).append("\n");
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

