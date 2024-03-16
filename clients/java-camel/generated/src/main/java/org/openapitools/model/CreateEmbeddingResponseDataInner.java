package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateEmbeddingResponseDataInner
 */

@JsonTypeName("CreateEmbeddingResponse_data_inner")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-16T01:13:12.257183065Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateEmbeddingResponseDataInner {

  private Integer index;

  private String _object;

  @Valid
  private List<BigDecimal> embedding = new ArrayList<>();

  public CreateEmbeddingResponseDataInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateEmbeddingResponseDataInner(Integer index, String _object, List<BigDecimal> embedding) {
    this.index = index;
    this._object = _object;
    this.embedding = embedding;
  }

  public CreateEmbeddingResponseDataInner index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * Get index
   * @return index
  */
  @NotNull 
  @Schema(name = "index", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public CreateEmbeddingResponseDataInner _object(String _object) {
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
  */
  @NotNull 
  @Schema(name = "object", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("object")
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  public CreateEmbeddingResponseDataInner embedding(List<BigDecimal> embedding) {
    this.embedding = embedding;
    return this;
  }

  public CreateEmbeddingResponseDataInner addEmbeddingItem(BigDecimal embeddingItem) {
    if (this.embedding == null) {
      this.embedding = new ArrayList<>();
    }
    this.embedding.add(embeddingItem);
    return this;
  }

  /**
   * Get embedding
   * @return embedding
  */
  @NotNull @Valid 
  @Schema(name = "embedding", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("embedding")
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

