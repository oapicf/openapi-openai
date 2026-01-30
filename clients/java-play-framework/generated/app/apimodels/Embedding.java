package apimodels;

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
 * Represents an embedding vector returned by embedding endpoint. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Embedding   {
  @JsonProperty("index")
  @NotNull

  private Integer index;

  @JsonProperty("embedding")
  @NotNull
@Valid

  private List<BigDecimal> embedding = new ArrayList<>();

  /**
   * The object type, which is always \"embedding\".
   */
  public enum ObjectEnum {
    EMBEDDING("embedding");

    private final String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("object")
  @NotNull

  private ObjectEnum _object;

  public Embedding index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * The index of the embedding in the list of embeddings.
   * @return index
  **/
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public Embedding embedding(List<BigDecimal> embedding) {
    this.embedding = embedding;
    return this;
  }

  public Embedding addEmbeddingItem(BigDecimal embeddingItem) {
    if (this.embedding == null) {
      this.embedding = new ArrayList<>();
    }
    this.embedding.add(embeddingItem);
    return this;
  }

   /**
   * The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). 
   * @return embedding
  **/
  public List<BigDecimal> getEmbedding() {
    return embedding;
  }

  public void setEmbedding(List<BigDecimal> embedding) {
    this.embedding = embedding;
  }

  public Embedding _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

   /**
   * The object type, which is always \"embedding\".
   * @return _object
  **/
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
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
    return Objects.equals(index, embedding.index) &&
        Objects.equals(embedding, embedding.embedding) &&
        Objects.equals(_object, embedding._object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, embedding, _object);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

