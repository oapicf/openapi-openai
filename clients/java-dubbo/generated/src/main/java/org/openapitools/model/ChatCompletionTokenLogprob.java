package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.model.ChatCompletionTokenLogprobTopLogprobsInner;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ChatCompletionTokenLogprob implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The token.
   */
  @JsonProperty("token")
  private String token;

  /**
   * The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value &#x60;-9999.0&#x60; is used to signify that the token is very unlikely.
   */
  @JsonProperty("logprob")
  private BigDecimal logprob;

  /**
   * A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be &#x60;null&#x60; if there is no bytes representation for the token.
   */
  @JsonProperty("bytes")
  private List<Integer> bytes;

  /**
   * List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested &#x60;top_logprobs&#x60; returned.
   */
  @JsonProperty("top_logprobs")
  private List<ChatCompletionTokenLogprobTopLogprobsInner> topLogprobs = new ArrayList<>();

  /**
   * The token.
   * @return token
   */
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  /**
   * The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value &#x60;-9999.0&#x60; is used to signify that the token is very unlikely.
   * @return logprob
   */
  public BigDecimal getLogprob() {
    return logprob;
  }

  public void setLogprob(BigDecimal logprob) {
    this.logprob = logprob;
  }

  /**
   * A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be &#x60;null&#x60; if there is no bytes representation for the token.
   * @return bytes
   */
  public List<Integer> getBytes() {
    return bytes;
  }

  public void setBytes(List<Integer> bytes) {
    this.bytes = bytes;
  }

  /**
   * List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested &#x60;top_logprobs&#x60; returned.
   * @return topLogprobs
   */
  public List<ChatCompletionTokenLogprobTopLogprobsInner> getTopLogprobs() {
    return topLogprobs;
  }

  public void setTopLogprobs(List<ChatCompletionTokenLogprobTopLogprobsInner> topLogprobs) {
    this.topLogprobs = topLogprobs;
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
