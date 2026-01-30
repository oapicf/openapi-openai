package apimodels;

import apimodels.RealtimeResponseUsageInputTokenDetails;
import apimodels.RealtimeResponseUsageOutputTokenDetails;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Usage statistics for the Response, this will correspond to billing. A  Realtime API session will maintain a conversation context and append new  Items to the Conversation, thus output from previous turns (text and  audio tokens) will become the input for later turns. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RealtimeResponseUsage   {
  @JsonProperty("total_tokens")
  
  private Integer totalTokens;

  @JsonProperty("input_tokens")
  
  private Integer inputTokens;

  @JsonProperty("output_tokens")
  
  private Integer outputTokens;

  @JsonProperty("input_token_details")
  @Valid

  private RealtimeResponseUsageInputTokenDetails inputTokenDetails;

  @JsonProperty("output_token_details")
  @Valid

  private RealtimeResponseUsageOutputTokenDetails outputTokenDetails;

  public RealtimeResponseUsage totalTokens(Integer totalTokens) {
    this.totalTokens = totalTokens;
    return this;
  }

   /**
   * The total number of tokens in the Response including input and output  text and audio tokens. 
   * @return totalTokens
  **/
  public Integer getTotalTokens() {
    return totalTokens;
  }

  public void setTotalTokens(Integer totalTokens) {
    this.totalTokens = totalTokens;
  }

  public RealtimeResponseUsage inputTokens(Integer inputTokens) {
    this.inputTokens = inputTokens;
    return this;
  }

   /**
   * The number of input tokens used in the Response, including text and  audio tokens. 
   * @return inputTokens
  **/
  public Integer getInputTokens() {
    return inputTokens;
  }

  public void setInputTokens(Integer inputTokens) {
    this.inputTokens = inputTokens;
  }

  public RealtimeResponseUsage outputTokens(Integer outputTokens) {
    this.outputTokens = outputTokens;
    return this;
  }

   /**
   * The number of output tokens sent in the Response, including text and  audio tokens. 
   * @return outputTokens
  **/
  public Integer getOutputTokens() {
    return outputTokens;
  }

  public void setOutputTokens(Integer outputTokens) {
    this.outputTokens = outputTokens;
  }

  public RealtimeResponseUsage inputTokenDetails(RealtimeResponseUsageInputTokenDetails inputTokenDetails) {
    this.inputTokenDetails = inputTokenDetails;
    return this;
  }

   /**
   * Get inputTokenDetails
   * @return inputTokenDetails
  **/
  public RealtimeResponseUsageInputTokenDetails getInputTokenDetails() {
    return inputTokenDetails;
  }

  public void setInputTokenDetails(RealtimeResponseUsageInputTokenDetails inputTokenDetails) {
    this.inputTokenDetails = inputTokenDetails;
  }

  public RealtimeResponseUsage outputTokenDetails(RealtimeResponseUsageOutputTokenDetails outputTokenDetails) {
    this.outputTokenDetails = outputTokenDetails;
    return this;
  }

   /**
   * Get outputTokenDetails
   * @return outputTokenDetails
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

