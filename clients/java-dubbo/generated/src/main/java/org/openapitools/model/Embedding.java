package org.openapitools.model;

import java.math.BigDecimal;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Represents an embedding vector returned by embedding endpoint. 
 */
public class Embedding implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The index of the embedding in the list of embeddings.
   */
  @JsonProperty("index")
  private Integer index;

  /**
   * The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). 
   */
  @JsonProperty("embedding")
  private List<BigDecimal> embedding = new ArrayList<>();

  /**
   * The object type, which is always \&quot;embedding\&quot;.
   */
  @JsonProperty("object")
  private String _object;

  /**
   * The index of the embedding in the list of embeddings.
   * @return index
   */
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). 
   * @return embedding
   */
  public List<BigDecimal> getEmbedding() {
    return embedding;
  }

  public void setEmbedding(List<BigDecimal> embedding) {
    this.embedding = embedding;
  }

  /**
   * The object type, which is always \&quot;embedding\&quot;.
   * @return _object
   */
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Embedding embedding = (Embedding) o;
    return Objects.equals(this.index, embedding.index) &&
        Objects.equals(this.embedding, embedding.embedding) &&
        Objects.equals(this._object, embedding._object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, embedding, _object);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Embedding {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    embedding: ").append(toIndentedString(embedding)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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
