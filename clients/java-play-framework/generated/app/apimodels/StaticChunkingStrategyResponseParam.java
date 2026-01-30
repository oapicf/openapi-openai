package apimodels;

import apimodels.StaticChunkingStrategy;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * StaticChunkingStrategyResponseParam
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class StaticChunkingStrategyResponseParam   {
  /**
   * Always `static`.
   */
  public enum TypeEnum {
    STATIC("static");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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

  @JsonProperty("type")
  @NotNull

  private TypeEnum type;

  @JsonProperty("static")
  @NotNull
@Valid

  private StaticChunkingStrategy _static;

  public StaticChunkingStrategyResponseParam type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Always `static`.
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public StaticChunkingStrategyResponseParam _static(StaticChunkingStrategy _static) {
    this._static = _static;
    return this;
  }

   /**
   * Get _static
   * @return _static
  **/
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
    StaticChunkingStrategyResponseParam staticChunkingStrategyResponseParam = (StaticChunkingStrategyResponseParam) o;
    return Objects.equals(type, staticChunkingStrategyResponseParam.type) &&
        Objects.equals(_static, staticChunkingStrategyResponseParam._static);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, _static);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

