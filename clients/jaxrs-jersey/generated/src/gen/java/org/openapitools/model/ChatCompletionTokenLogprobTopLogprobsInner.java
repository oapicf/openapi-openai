/*
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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * ChatCompletionTokenLogprobTopLogprobsInner
 */
@JsonPropertyOrder({
  ChatCompletionTokenLogprobTopLogprobsInner.JSON_PROPERTY_TOKEN,
  ChatCompletionTokenLogprobTopLogprobsInner.JSON_PROPERTY_LOGPROB,
  ChatCompletionTokenLogprobTopLogprobsInner.JSON_PROPERTY_BYTES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-03T11:08:40.472203335Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ChatCompletionTokenLogprobTopLogprobsInner   {
  public static final String JSON_PROPERTY_TOKEN = "token";
  @JsonProperty(JSON_PROPERTY_TOKEN)
  private String token;

  public static final String JSON_PROPERTY_LOGPROB = "logprob";
  @JsonProperty(JSON_PROPERTY_LOGPROB)
  private BigDecimal logprob;

  public static final String JSON_PROPERTY_BYTES = "bytes";
  @JsonProperty(JSON_PROPERTY_BYTES)
  private List<Integer> bytes;

  public ChatCompletionTokenLogprobTopLogprobsInner token(String token) {
    this.token = token;
    return this;
  }

  /**
   * The token.
   * @return token
   **/
  @JsonProperty(value = "token")
  @ApiModelProperty(required = true, value = "The token.")
  @NotNull 
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public ChatCompletionTokenLogprobTopLogprobsInner logprob(BigDecimal logprob) {
    this.logprob = logprob;
    return this;
  }

  /**
   * The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value &#x60;-9999.0&#x60; is used to signify that the token is very unlikely.
   * @return logprob
   **/
  @JsonProperty(value = "logprob")
  @ApiModelProperty(required = true, value = "The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.")
  @NotNull @Valid 
  public BigDecimal getLogprob() {
    return logprob;
  }

  public void setLogprob(BigDecimal logprob) {
    this.logprob = logprob;
  }

  public ChatCompletionTokenLogprobTopLogprobsInner bytes(List<Integer> bytes) {
    this.bytes = bytes;
    return this;
  }

  public ChatCompletionTokenLogprobTopLogprobsInner addBytesItem(Integer bytesItem) {
    if (this.bytes == null) {
      this.bytes = new ArrayList<>();
    }
    this.bytes.add(bytesItem);
    return this;
  }

  /**
   * A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be &#x60;null&#x60; if there is no bytes representation for the token.
   * @return bytes
   **/
  @JsonProperty(value = "bytes")
  @ApiModelProperty(required = true, value = "A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.")
  @NotNull 
  public List<Integer> getBytes() {
    return bytes;
  }

  public void setBytes(List<Integer> bytes) {
    this.bytes = bytes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionTokenLogprobTopLogprobsInner chatCompletionTokenLogprobTopLogprobsInner = (ChatCompletionTokenLogprobTopLogprobsInner) o;
    return Objects.equals(this.token, chatCompletionTokenLogprobTopLogprobsInner.token) &&
        Objects.equals(this.logprob, chatCompletionTokenLogprobTopLogprobsInner.logprob) &&
        Objects.equals(this.bytes, chatCompletionTokenLogprobTopLogprobsInner.bytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, logprob, bytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionTokenLogprobTopLogprobsInner {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    logprob: ").append(toIndentedString(logprob)).append("\n");
    sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
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

