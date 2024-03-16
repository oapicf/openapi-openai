package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-03-16T01:13:41.666812110Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateEmbeddingResponseDataInner   {
  
  private Integer index;
  private String _object;
  private List<BigDecimal> embedding = new ArrayList<>();

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("index")
  @NotNull
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("embedding")
  @NotNull
  public List<BigDecimal> getEmbedding() {
    return embedding;
  }
  public void setEmbedding(List<BigDecimal> embedding) {
    this.embedding = embedding;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEmbeddingResponseDataInner createEmbeddingResponseDataInner = (CreateEmbeddingResponseDataInner) o;
    return Objects.equals(this.index, createEmbeddingResponseDataInner.index) &&
        Objects.equals(this._object, createEmbeddingResponseDataInner._object) &&
        Objects.equals(this.embedding, createEmbeddingResponseDataInner.embedding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, _object, embedding);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEmbeddingResponseDataInner {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    embedding: ").append(toIndentedString(embedding)).append("\n");
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

