package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.AutoChunkingStrategyRequestParam;
import org.openapitools.vertxweb.server.model.StaticChunkingStrategy;
import org.openapitools.vertxweb.server.model.StaticChunkingStrategyRequestParam;

/**
 * The chunking strategy used to chunk the file(s). If not set, will use the &#x60;auto&#x60; strategy. Only applicable if &#x60;file_ids&#x60; is non-empty.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateVectorStoreRequestChunkingStrategy   {
  


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
      return value;
    }
  }

  private TypeEnum type;
  private StaticChunkingStrategy _static;

  public CreateVectorStoreRequestChunkingStrategy () {

  }

  public CreateVectorStoreRequestChunkingStrategy (TypeEnum type, StaticChunkingStrategy _static) {
    this.type = type;
    this._static = _static;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
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
    CreateVectorStoreRequestChunkingStrategy createVectorStoreRequestChunkingStrategy = (CreateVectorStoreRequestChunkingStrategy) o;
    return Objects.equals(type, createVectorStoreRequestChunkingStrategy.type) &&
        Objects.equals(_static, createVectorStoreRequestChunkingStrategy._static);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
