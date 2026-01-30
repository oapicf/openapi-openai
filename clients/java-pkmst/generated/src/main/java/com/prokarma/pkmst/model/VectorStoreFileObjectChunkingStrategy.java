package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.OtherChunkingStrategyResponseParam;
import com.prokarma.pkmst.model.StaticChunkingStrategy;
import com.prokarma.pkmst.model.StaticChunkingStrategyResponseParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * The strategy used to chunk the file.
 */
@ApiModel(description = "The strategy used to chunk the file.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class VectorStoreFileObjectChunkingStrategy   {
  /**
   * Always `static`.
   */
  public enum TypeEnum {
    STATIC("static"),
    
    OTHER("other");

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

  public VectorStoreFileObjectChunkingStrategy type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Always `static`.
   * @return type
   */
  @ApiModelProperty(required = true, value = "Always `static`.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public VectorStoreFileObjectChunkingStrategy _static(StaticChunkingStrategy _static) {
    this._static = _static;
    return this;
  }

  /**
   * Get _static
   * @return _static
   */
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
    VectorStoreFileObjectChunkingStrategy vectorStoreFileObjectChunkingStrategy = (VectorStoreFileObjectChunkingStrategy) o;
    return Objects.equals(this.type, vectorStoreFileObjectChunkingStrategy.type) &&
        Objects.equals(this._static, vectorStoreFileObjectChunkingStrategy._static);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, _static);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VectorStoreFileObjectChunkingStrategy {\n");
    
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

