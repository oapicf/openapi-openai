package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChatCompletionTokenLogprobTopLogprobsInner   {
  
  private String token;
  private BigDecimal logprob;
  private List<Integer> bytes;

  public ChatCompletionTokenLogprobTopLogprobsInner () {

  }

  public ChatCompletionTokenLogprobTopLogprobsInner (String token, BigDecimal logprob, List<Integer> bytes) {
    this.token = token;
    this.logprob = logprob;
    this.bytes = bytes;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionTokenLogprobTopLogprobsInner chatCompletionTokenLogprobTopLogprobsInner = (ChatCompletionTokenLogprobTopLogprobsInner) o;
    return Objects.equals(token, chatCompletionTokenLogprobTopLogprobsInner.token) &&
        Objects.equals(logprob, chatCompletionTokenLogprobTopLogprobsInner.logprob) &&
        Objects.equals(bytes, chatCompletionTokenLogprobTopLogprobsInner.bytes);
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
