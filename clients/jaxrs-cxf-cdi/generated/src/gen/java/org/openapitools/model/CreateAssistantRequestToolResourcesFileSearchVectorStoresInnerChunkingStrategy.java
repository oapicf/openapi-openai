package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AutoChunkingStrategy;
import org.openapitools.model.StaticChunkingStrategy;
import org.openapitools.model.StaticChunkingStrategyStatic;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The chunking strategy used to chunk the file(s). If not set, will use the &#x60;auto&#x60; strategy.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.")
public class CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy   {
  

public enum TypeEnum {

    @JsonProperty("auto") AUTO(String.valueOf("auto")), @JsonProperty("static") STATIC(String.valueOf("static"));


    private String value;

    TypeEnum(String v) {
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

  private TypeEnum type;

  private StaticChunkingStrategyStatic _static;

  /**
   * Always &#x60;auto&#x60;.
   **/
  public CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Always `auto`.")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   **/
  public CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy _static(StaticChunkingStrategyStatic _static) {
    this._static = _static;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("static")
  @NotNull
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

