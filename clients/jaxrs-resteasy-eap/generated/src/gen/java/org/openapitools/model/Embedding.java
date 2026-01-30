package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Represents an embedding vector returned by embedding endpoint. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class Embedding   {
  
  private Integer index;
  private List<BigDecimal> embedding = new ArrayList<>();

  /**
   * The object type, which is always \&quot;embedding\&quot;.
   */
  public enum ObjectEnum {
    EMBEDDING("embedding");
    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ObjectEnum _object;

  /**
   * The index of the embedding in the list of embeddings.
   **/
  
  @ApiModelProperty(required = true, value = "The index of the embedding in the list of embeddings.")
  @JsonProperty("index")
  @NotNull
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). 
   **/
  
  @ApiModelProperty(required = true, value = "The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). ")
  @JsonProperty("embedding")
  @NotNull
  public List<BigDecimal> getEmbedding() {
    return embedding;
  }
  public void setEmbedding(List<BigDecimal> embedding) {
    this.embedding = embedding;
  }

  /**
   * The object type, which is always \&quot;embedding\&quot;.
   **/
  
  @ApiModelProperty(required = true, value = "The object type, which is always \"embedding\".")
  @JsonProperty("object")
  @NotNull
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

