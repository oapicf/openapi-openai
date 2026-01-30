package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.StaticChunkingStrategy;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class StaticChunkingStrategyResponseParam  {
  
public enum TypeEnum {

    @JsonProperty("static") STATIC(String.valueOf("static"));

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
  * Always `static`.
  */
  @ApiModelProperty(required = true, value = "Always `static`.")
  private TypeEnum type;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private StaticChunkingStrategy _static;
 /**
  * Always &#x60;static&#x60;.
  * @return type
  */
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type == null ? null : type.value();
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public StaticChunkingStrategyResponseParam type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * Get _static
  * @return _static
  */
  @JsonProperty("static")
  @NotNull
  public StaticChunkingStrategy getStatic() {
    return _static;
  }

  /**
   * Sets the <code>_static</code> property.
   */
 public void setStatic(StaticChunkingStrategy _static) {
    this._static = _static;
  }

  /**
   * Sets the <code>_static</code> property.
   */
  public StaticChunkingStrategyResponseParam _static(StaticChunkingStrategy _static) {
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
    StaticChunkingStrategyResponseParam staticChunkingStrategyResponseParam = (StaticChunkingStrategyResponseParam) o;
    return Objects.equals(this.type, staticChunkingStrategyResponseParam.type) &&
        Objects.equals(this._static, staticChunkingStrategyResponseParam._static);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, _static);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaticChunkingStrategyResponseParam {\n");
    
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

