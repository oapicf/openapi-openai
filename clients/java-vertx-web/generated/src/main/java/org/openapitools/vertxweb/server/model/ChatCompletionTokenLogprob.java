package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ChatCompletionTokenLogprobTopLogprobsInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChatCompletionTokenLogprob   {
  
  private String token;
  private BigDecimal logprob;
  private List<Integer> bytes;
  private List<ChatCompletionTokenLogprobTopLogprobsInner> topLogprobs = new ArrayList<>();

  public ChatCompletionTokenLogprob () {

  }

  public ChatCompletionTokenLogprob (String token, BigDecimal logprob, List<Integer> bytes, List<ChatCompletionTokenLogprobTopLogprobsInner> topLogprobs) {
    this.token = token;
    this.logprob = logprob;
    this.bytes = bytes;
    this.topLogprobs = topLogprobs;
  }

    
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

    
  @JsonProperty("logprob")
  public BigDecimal getLogprob() {
    return logprob;
  }
  public void setLogprob(BigDecimal logprob) {
    this.logprob = logprob;
  }

    
  @JsonProperty("bytes")
  public List<Integer> getBytes() {
    return bytes;
  }
  public void setBytes(List<Integer> bytes) {
    this.bytes = bytes;
  }

    
  @JsonProperty("top_logprobs")
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
    return Objects.equals(token, chatCompletionTokenLogprob.token) &&
        Objects.equals(logprob, chatCompletionTokenLogprob.logprob) &&
        Objects.equals(bytes, chatCompletionTokenLogprob.bytes) &&
        Objects.equals(topLogprobs, chatCompletionTokenLogprob.topLogprobs);
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
