package org.openapitools.model;

import org.openapitools.model.AutoChunkingStrategyRequestParam;
import org.openapitools.model.StaticChunkingStrategy;
import org.openapitools.model.StaticChunkingStrategyStatic;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * The chunking strategy used to chunk the file(s). If not set, will use the &#x60;auto&#x60; strategy.
 */
public class CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Always &#x60;auto&#x60;.
   */
  @JsonProperty("type")
  private String type;

  @JsonProperty("static")
  private StaticChunkingStrategyStatic _static;

  /**
   * Always &#x60;auto&#x60;.
   * @return type
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * 
   * @return _static
   */
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
    return Objects.equals(this.type, createAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy.type) &&
        Objects.equals(this._static, createAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy._static);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
