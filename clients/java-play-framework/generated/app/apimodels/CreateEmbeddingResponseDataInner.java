package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateEmbeddingResponseDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-16T01:12:54.315235707Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateEmbeddingResponseDataInner   {
  @JsonProperty("index")
  @NotNull

  private Integer index;

  @JsonProperty("object")
  @NotNull

  private String _object;

  @JsonProperty("embedding")
  @NotNull
@Valid

  private List<BigDecimal> embedding = new ArrayList<>();

  public CreateEmbeddingResponseDataInner index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
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
  **/
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
  **/
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
    return Objects.equals(index, createEmbeddingResponseDataInner.index) &&
        Objects.equals(_object, createEmbeddingResponseDataInner._object) &&
        Objects.equals(embedding, createEmbeddingResponseDataInner.embedding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, _object, embedding);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

