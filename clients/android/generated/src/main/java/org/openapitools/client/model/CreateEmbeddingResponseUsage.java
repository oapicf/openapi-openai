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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The usage information for the request.
 **/
@ApiModel(description = "The usage information for the request.")
public class CreateEmbeddingResponseUsage {
  
  @SerializedName("prompt_tokens")
  private Integer promptTokens = null;
  @SerializedName("total_tokens")
  private Integer totalTokens = null;

  /**
   * The number of tokens used by the prompt.
   **/
  @ApiModelProperty(required = true, value = "The number of tokens used by the prompt.")
  public Integer getPromptTokens() {
    return promptTokens;
  }
  public void setPromptTokens(Integer promptTokens) {
    this.promptTokens = promptTokens;
  }

  /**
   * The total number of tokens used by the request.
   **/
  @ApiModelProperty(required = true, value = "The total number of tokens used by the request.")
  public Integer getTotalTokens() {
    return totalTokens;
  }
  public void setTotalTokens(Integer totalTokens) {
    this.totalTokens = totalTokens;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEmbeddingResponseUsage createEmbeddingResponseUsage = (CreateEmbeddingResponseUsage) o;
    return (this.promptTokens == null ? createEmbeddingResponseUsage.promptTokens == null : this.promptTokens.equals(createEmbeddingResponseUsage.promptTokens)) &&
        (this.totalTokens == null ? createEmbeddingResponseUsage.totalTokens == null : this.totalTokens.equals(createEmbeddingResponseUsage.totalTokens));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.promptTokens == null ? 0: this.promptTokens.hashCode());
    result = 31 * result + (this.totalTokens == null ? 0: this.totalTokens.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEmbeddingResponseUsage {\n");
    
    sb.append("  promptTokens: ").append(promptTokens).append("\n");
    sb.append("  totalTokens: ").append(totalTokens).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
