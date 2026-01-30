package org.openapitools.model;

import org.openapitools.model.AutoChunkingStrategyRequestParam;
import org.openapitools.model.StaticChunkingStrategy;
import org.openapitools.model.StaticChunkingStrategyRequestParam;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy. Only applicable if `file_ids` is non-empty.
 */
@ApiModel(description="The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy. Only applicable if `file_ids` is non-empty.")

public class CreateVectorStoreRequestChunkingStrategy  {
  
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
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Always `auto`.
  */
  @ApiModelProperty(required = true, value = "Always `auto`.")

  private TypeEnum type;

  @ApiModelProperty(required = true, value = "")

  private StaticChunkingStrategy _static;
 /**
   * Always &#x60;auto&#x60;.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public CreateVectorStoreRequestChunkingStrategy type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Get _static
   * @return _static
  **/
  @JsonProperty("static")
  public StaticChunkingStrategy getStatic() {
    return _static;
  }

  public void setStatic(StaticChunkingStrategy _static) {
    this._static = _static;
  }

  public CreateVectorStoreRequestChunkingStrategy _static(StaticChunkingStrategy _static) {
    this._static = _static;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVectorStoreRequestChunkingStrategy createVectorStoreRequestChunkingStrategy = (CreateVectorStoreRequestChunkingStrategy) o;
    return Objects.equals(this.type, createVectorStoreRequestChunkingStrategy.type) &&
        Objects.equals(this._static, createVectorStoreRequestChunkingStrategy._static);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, _static);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVectorStoreRequestChunkingStrategy {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    _static: ").append(toIndentedString(_static)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

