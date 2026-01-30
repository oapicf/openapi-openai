package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.RealtimeResponseUsageInputTokenDetails;
import org.openapitools.vertxweb.server.model.RealtimeResponseUsageOutputTokenDetails;

/**
 * Usage statistics for the Response, this will correspond to billing. A  Realtime API session will maintain a conversation context and append new  Items to the Conversation, thus output from previous turns (text and  audio tokens) will become the input for later turns. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealtimeResponseUsage   {
  
  private Integer totalTokens;
  private Integer inputTokens;
  private Integer outputTokens;
  private RealtimeResponseUsageInputTokenDetails inputTokenDetails;
  private RealtimeResponseUsageOutputTokenDetails outputTokenDetails;

  public RealtimeResponseUsage () {

  }

  public RealtimeResponseUsage (Integer totalTokens, Integer inputTokens, Integer outputTokens, RealtimeResponseUsageInputTokenDetails inputTokenDetails, RealtimeResponseUsageOutputTokenDetails outputTokenDetails) {
    this.totalTokens = totalTokens;
    this.inputTokens = inputTokens;
    this.outputTokens = outputTokens;
    this.inputTokenDetails = inputTokenDetails;
    this.outputTokenDetails = outputTokenDetails;
  }

    
  @JsonProperty("total_tokens")
  public Integer getTotalTokens() {
    return totalTokens;
  }
  public void setTotalTokens(Integer totalTokens) {
    this.totalTokens = totalTokens;
  }

    
  @JsonProperty("input_tokens")
  public Integer getInputTokens() {
    return inputTokens;
  }
  public void setInputTokens(Integer inputTokens) {
    this.inputTokens = inputTokens;
  }

    
  @JsonProperty("output_tokens")
  public Integer getOutputTokens() {
    return outputTokens;
  }
  public void setOutputTokens(Integer outputTokens) {
    this.outputTokens = outputTokens;
  }

    
  @JsonProperty("input_token_details")
  public RealtimeResponseUsageInputTokenDetails getInputTokenDetails() {
    return inputTokenDetails;
  }
  public void setInputTokenDetails(RealtimeResponseUsageInputTokenDetails inputTokenDetails) {
    this.inputTokenDetails = inputTokenDetails;
  }

    
  @JsonProperty("output_token_details")
  public RealtimeResponseUsageOutputTokenDetails getOutputTokenDetails() {
    return outputTokenDetails;
  }
  public void setOutputTokenDetails(RealtimeResponseUsageOutputTokenDetails outputTokenDetails) {
    this.outputTokenDetails = outputTokenDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeResponseUsage realtimeResponseUsage = (RealtimeResponseUsage) o;
    return Objects.equals(totalTokens, realtimeResponseUsage.totalTokens) &&
        Objects.equals(inputTokens, realtimeResponseUsage.inputTokens) &&
        Objects.equals(outputTokens, realtimeResponseUsage.outputTokens) &&
        Objects.equals(inputTokenDetails, realtimeResponseUsage.inputTokenDetails) &&
        Objects.equals(outputTokenDetails, realtimeResponseUsage.outputTokenDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalTokens, inputTokens, outputTokens, inputTokenDetails, outputTokenDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeResponseUsage {\n");
    
    sb.append("    totalTokens: ").append(toIndentedString(totalTokens)).append("\n");
    sb.append("    inputTokens: ").append(toIndentedString(inputTokens)).append("\n");
    sb.append("    outputTokens: ").append(toIndentedString(outputTokens)).append("\n");
    sb.append("    inputTokenDetails: ").append(toIndentedString(inputTokenDetails)).append("\n");
    sb.append("    outputTokenDetails: ").append(toIndentedString(outputTokenDetails)).append("\n");
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
