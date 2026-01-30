/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OtherChunkingStrategyResponseParam;
import org.openapitools.model.StaticChunkingStrategy;
import org.openapitools.model.StaticChunkingStrategyResponseParam;



/**
 * The strategy used to chunk the file.
 */

@ApiModel(description = "The strategy used to chunk the file.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class VectorStoreFileObjectChunkingStrategy   {
  


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
      return value;
    }
  }

  private TypeEnum type;
  private StaticChunkingStrategy _static;

  /**
   * Always `static`.
   */
  public VectorStoreFileObjectChunkingStrategy type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Always `static`.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   */
  public VectorStoreFileObjectChunkingStrategy _static(StaticChunkingStrategy _static) {
    this._static = _static;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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
    VectorStoreFileObjectChunkingStrategy vectorStoreFileObjectChunkingStrategy = (VectorStoreFileObjectChunkingStrategy) o;
    return Objects.equals(type, vectorStoreFileObjectChunkingStrategy.type) &&
        Objects.equals(_static, vectorStoreFileObjectChunkingStrategy._static);
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

