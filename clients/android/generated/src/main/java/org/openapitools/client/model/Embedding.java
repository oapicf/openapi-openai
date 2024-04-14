/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.math.BigDecimal;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Represents an embedding vector returned by embedding endpoint. 
 **/
@ApiModel(description = "Represents an embedding vector returned by embedding endpoint. ")
public class Embedding {
  
  @SerializedName("index")
  private Integer index = null;
  @SerializedName("embedding")
  private List<BigDecimal> embedding = null;
  public enum _objectEnum {
     embedding, 
  };
  @SerializedName("object")
  private _objectEnum _object = null;

  /**
   * The index of the embedding in the list of embeddings.
   **/
  @ApiModelProperty(required = true, value = "The index of the embedding in the list of embeddings.")
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
  public List<BigDecimal> getEmbedding() {
    return embedding;
  }
  public void setEmbedding(List<BigDecimal> embedding) {
    this.embedding = embedding;
  }

  /**
   * The object type, which is always \"embedding\".
   **/
  @ApiModelProperty(required = true, value = "The object type, which is always \"embedding\".")
  public _objectEnum getObject() {
    return _object;
  }
  public void setObject(_objectEnum _object) {
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
    return (this.index == null ? embedding.index == null : this.index.equals(embedding.index)) &&
        (this.embedding == null ? embedding.embedding == null : this.embedding.equals(embedding.embedding)) &&
        (this._object == null ? embedding._object == null : this._object.equals(embedding._object));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.index == null ? 0: this.index.hashCode());
    result = 31 * result + (this.embedding == null ? 0: this.embedding.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Embedding {\n");
    
    sb.append("  index: ").append(index).append("\n");
    sb.append("  embedding: ").append(embedding).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
