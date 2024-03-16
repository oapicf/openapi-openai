package org.openapitools.model;

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
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("CreateEmbeddingResponse_data_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-16T01:13:46.302927795Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateEmbeddingResponseDataInner   {
  private @Valid Integer index;
  private @Valid String _object;
  private @Valid List<BigDecimal> embedding = new ArrayList<>();

  /**
   **/
  public CreateEmbeddingResponseDataInner index(Integer index) {
    this.index = index;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("index")
  @NotNull
  public Integer getIndex() {
    return index;
  }

  @JsonProperty("index")
  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   **/
  public CreateEmbeddingResponseDataInner _object(String _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    return _object;
  }

  @JsonProperty("object")
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   **/
  public CreateEmbeddingResponseDataInner embedding(List<BigDecimal> embedding) {
    this.embedding = embedding;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("embedding")
  @NotNull
  public List<BigDecimal> getEmbedding() {
    return embedding;
  }

  @JsonProperty("embedding")
  public void setEmbedding(List<BigDecimal> embedding) {
    this.embedding = embedding;
  }

  public CreateEmbeddingResponseDataInner addEmbeddingItem(BigDecimal embeddingItem) {
    if (this.embedding == null) {
      this.embedding = new ArrayList<>();
    }

    this.embedding.add(embeddingItem);
    return this;
  }

  public CreateEmbeddingResponseDataInner removeEmbeddingItem(BigDecimal embeddingItem) {
    if (embeddingItem != null && this.embedding != null) {
      this.embedding.remove(embeddingItem);
    }

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

