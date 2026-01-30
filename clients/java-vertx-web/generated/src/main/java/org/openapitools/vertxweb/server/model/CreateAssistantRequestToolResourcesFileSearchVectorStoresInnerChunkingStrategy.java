package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.AutoChunkingStrategy;
import org.openapitools.vertxweb.server.model.StaticChunkingStrategy;
import org.openapitools.vertxweb.server.model.StaticChunkingStrategyStatic;

/**
 * The chunking strategy used to chunk the file(s). If not set, will use the &#x60;auto&#x60; strategy.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy   {
  


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
  private StaticChunkingStrategyStatic _static;

  public CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy () {

  }

  public CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy (TypeEnum type, StaticChunkingStrategyStatic _static) {
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
  public StaticChunkingStrategyStatic getStatic() {
    return _static;
  }
  public void setStatic(StaticChunkingStrategyStatic _static) {
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
    CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy createAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy = (CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy) o;
    return Objects.equals(type, createAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy.type) &&
        Objects.equals(_static, createAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy._static);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, _static);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy {\n");
    
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
