package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RealtimeResponseUsageInputTokenDetails;
import org.openapitools.model.RealtimeResponseUsageOutputTokenDetails;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Usage statistics for the Response, this will correspond to billing. A  Realtime API session will maintain a conversation context and append new  Items to the Conversation, thus output from previous turns (text and  audio tokens) will become the input for later turns. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeResponseUsage   {
  
  private Integer totalTokens;
  private Integer inputTokens;
  private Integer outputTokens;
  private RealtimeResponseUsageInputTokenDetails inputTokenDetails;
  private RealtimeResponseUsageOutputTokenDetails outputTokenDetails;

  /**
   * The total number of tokens in the Response including input and output  text and audio tokens. 
   **/
  
  @ApiModelProperty(value = "The total number of tokens in the Response including input and output  text and audio tokens. ")
  @JsonProperty("total_tokens")
  public Integer getTotalTokens() {
    return totalTokens;
  }
  public void setTotalTokens(Integer totalTokens) {
    this.totalTokens = totalTokens;
  }

  /**
   * The number of input tokens used in the Response, including text and  audio tokens. 
   **/
  
  @ApiModelProperty(value = "The number of input tokens used in the Response, including text and  audio tokens. ")
  @JsonProperty("input_tokens")
  public Integer getInputTokens() {
    return inputTokens;
  }
  public void setInputTokens(Integer inputTokens) {
    this.inputTokens = inputTokens;
  }

  /**
   * The number of output tokens sent in the Response, including text and  audio tokens. 
   **/
  
  @ApiModelProperty(value = "The number of output tokens sent in the Response, including text and  audio tokens. ")
  @JsonProperty("output_tokens")
  public Integer getOutputTokens() {
    return outputTokens;
  }
  public void setOutputTokens(Integer outputTokens) {
    this.outputTokens = outputTokens;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("input_token_details")
  @Valid
  public RealtimeResponseUsageInputTokenDetails getInputTokenDetails() {
    return inputTokenDetails;
  }
  public void setInputTokenDetails(RealtimeResponseUsageInputTokenDetails inputTokenDetails) {
    this.inputTokenDetails = inputTokenDetails;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("output_token_details")
  @Valid
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
    return Objects.equals(this.totalTokens, realtimeResponseUsage.totalTokens) &&
        Objects.equals(this.inputTokens, realtimeResponseUsage.inputTokens) &&
        Objects.equals(this.outputTokens, realtimeResponseUsage.outputTokens) &&
        Objects.equals(this.inputTokenDetails, realtimeResponseUsage.inputTokenDetails) &&
        Objects.equals(this.outputTokenDetails, realtimeResponseUsage.outputTokenDetails);
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

