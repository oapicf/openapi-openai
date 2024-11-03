package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ChatCompletionTokenLogprobTopLogprobsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ChatCompletionTokenLogprob")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-03T11:09:06.848004747Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ChatCompletionTokenLogprob   {
  private String token;
  private BigDecimal logprob;
  private @Valid List<Integer> bytes;
  private @Valid List<@Valid ChatCompletionTokenLogprobTopLogprobsInner> topLogprobs = new ArrayList<>();

  /**
   * The token.
   **/
  public ChatCompletionTokenLogprob token(String token) {
    this.token = token;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The token.")
  @JsonProperty("token")
  @NotNull public String getToken() {
    return token;
  }

  @JsonProperty("token")
  public void setToken(String token) {
    this.token = token;
  }

  /**
   * The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value &#x60;-9999.0&#x60; is used to signify that the token is very unlikely.
   **/
  public ChatCompletionTokenLogprob logprob(BigDecimal logprob) {
    this.logprob = logprob;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.")
  @JsonProperty("logprob")
  @NotNull @Valid public BigDecimal getLogprob() {
    return logprob;
  }

  @JsonProperty("logprob")
  public void setLogprob(BigDecimal logprob) {
    this.logprob = logprob;
  }

  /**
   * A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be &#x60;null&#x60; if there is no bytes representation for the token.
   **/
  public ChatCompletionTokenLogprob bytes(List<Integer> bytes) {
    this.bytes = bytes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.")
  @JsonProperty("bytes")
  @NotNull public List<Integer> getBytes() {
    return bytes;
  }

  @JsonProperty("bytes")
  public void setBytes(List<Integer> bytes) {
    this.bytes = bytes;
  }

  public ChatCompletionTokenLogprob addBytesItem(Integer bytesItem) {
    if (this.bytes == null) {
      this.bytes = new ArrayList<>();
    }

    this.bytes.add(bytesItem);
    return this;
  }

  public ChatCompletionTokenLogprob removeBytesItem(Integer bytesItem) {
    if (bytesItem != null && this.bytes != null) {
      this.bytes.remove(bytesItem);
    }

    return this;
  }
  /**
   * List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested &#x60;top_logprobs&#x60; returned.
   **/
  public ChatCompletionTokenLogprob topLogprobs(List<@Valid ChatCompletionTokenLogprobTopLogprobsInner> topLogprobs) {
    this.topLogprobs = topLogprobs;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned.")
  @JsonProperty("top_logprobs")
  @NotNull @Valid public List<@Valid ChatCompletionTokenLogprobTopLogprobsInner> getTopLogprobs() {
    return topLogprobs;
  }

  @JsonProperty("top_logprobs")
  public void setTopLogprobs(List<@Valid ChatCompletionTokenLogprobTopLogprobsInner> topLogprobs) {
    this.topLogprobs = topLogprobs;
  }

  public ChatCompletionTokenLogprob addTopLogprobsItem(ChatCompletionTokenLogprobTopLogprobsInner topLogprobsItem) {
    if (this.topLogprobs == null) {
      this.topLogprobs = new ArrayList<>();
    }

    this.topLogprobs.add(topLogprobsItem);
    return this;
  }

  public ChatCompletionTokenLogprob removeTopLogprobsItem(ChatCompletionTokenLogprobTopLogprobsInner topLogprobsItem) {
    if (topLogprobsItem != null && this.topLogprobs != null) {
      this.topLogprobs.remove(topLogprobsItem);
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
    ChatCompletionTokenLogprob chatCompletionTokenLogprob = (ChatCompletionTokenLogprob) o;
    return Objects.equals(this.token, chatCompletionTokenLogprob.token) &&
        Objects.equals(this.logprob, chatCompletionTokenLogprob.logprob) &&
        Objects.equals(this.bytes, chatCompletionTokenLogprob.bytes) &&
        Objects.equals(this.topLogprobs, chatCompletionTokenLogprob.topLogprobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, logprob, bytes, topLogprobs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionTokenLogprob {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    logprob: ").append(toIndentedString(logprob)).append("\n");
    sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
    sb.append("    topLogprobs: ").append(toIndentedString(topLogprobs)).append("\n");
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

