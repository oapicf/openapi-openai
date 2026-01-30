package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AutoChunkingStrategyRequestParam;
import org.openapitools.model.StaticChunkingStrategy;
import org.openapitools.model.StaticChunkingStrategyRequestParam;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The chunking strategy used to chunk the file(s). If not set, will use the &#x60;auto&#x60; strategy.
 **/
@ApiModel(description = "The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.")
@JsonTypeName("ChunkingStrategyRequestParam")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ChunkingStrategyRequestParam   {
  public enum TypeEnum {

    AUTO(String.valueOf("auto")), STATIC(String.valueOf("static"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static TypeEnum fromString(String s) {
        for (TypeEnum b : TypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  public ChunkingStrategyRequestParam() {
  }

  @JsonCreator
  public ChunkingStrategyRequestParam(
    @JsonProperty(required = true, value = "type") TypeEnum type,
    @JsonProperty(required = true, value = "static") StaticChunkingStrategy _static
  ) {
    this.type = type;
    this._static = _static;
  }

  /**
   * Always &#x60;auto&#x60;.
   **/
  public ChunkingStrategyRequestParam type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Always `auto`.")
  @JsonProperty(required = true, value = "type")
  @NotNull public TypeEnum getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  public ChunkingStrategyRequestParam _static(StaticChunkingStrategy _static) {
    this._static = _static;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "static")
  @NotNull @Valid public StaticChunkingStrategy getStatic() {
    return _static;
  }

  @JsonProperty(required = true, value = "static")
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
    ChunkingStrategyRequestParam chunkingStrategyRequestParam = (ChunkingStrategyRequestParam) o;
    return Objects.equals(this.type, chunkingStrategyRequestParam.type) &&
        Objects.equals(this._static, chunkingStrategyRequestParam._static);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, _static);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChunkingStrategyRequestParam {\n");
    
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

