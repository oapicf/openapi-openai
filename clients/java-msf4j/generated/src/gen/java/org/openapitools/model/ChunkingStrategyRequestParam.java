package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AutoChunkingStrategyRequestParam;
import org.openapitools.model.StaticChunkingStrategy;
import org.openapitools.model.StaticChunkingStrategyRequestParam;

/**
 * The chunking strategy used to chunk the file(s). If not set, will use the &#x60;auto&#x60; strategy.
 */
@ApiModel(description = "The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ChunkingStrategyRequestParam   {
  /**
   * Always `auto`.
   */
  public enum TypeEnum {
    AUTO("auto"),
    
    STATIC("static");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("static")
  private StaticChunkingStrategy _static;

  public ChunkingStrategyRequestParam type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Always `auto`.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Always `auto`.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ChunkingStrategyRequestParam _static(StaticChunkingStrategy _static) {
    this._static = _static;
    return this;
  }

   /**
   * Get _static
   * @return _static
  **/
  @ApiModelProperty(required = true, value = "")
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

