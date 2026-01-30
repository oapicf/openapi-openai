package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ProjectRateLimitUpdateRequest  {
  
 /**
  * The maximum requests per minute.
  */
  @ApiModelProperty(value = "The maximum requests per minute.")

  private Integer maxRequestsPer1Minute;

 /**
  * The maximum tokens per minute.
  */
  @ApiModelProperty(value = "The maximum tokens per minute.")

  private Integer maxTokensPer1Minute;

 /**
  * The maximum images per minute. Only relevant for certain models.
  */
  @ApiModelProperty(value = "The maximum images per minute. Only relevant for certain models.")

  private Integer maxImagesPer1Minute;

 /**
  * The maximum audio megabytes per minute. Only relevant for certain models.
  */
  @ApiModelProperty(value = "The maximum audio megabytes per minute. Only relevant for certain models.")

  private Integer maxAudioMegabytesPer1Minute;

 /**
  * The maximum requests per day. Only relevant for certain models.
  */
  @ApiModelProperty(value = "The maximum requests per day. Only relevant for certain models.")

  private Integer maxRequestsPer1Day;

 /**
  * The maximum batch input tokens per day. Only relevant for certain models.
  */
  @ApiModelProperty(value = "The maximum batch input tokens per day. Only relevant for certain models.")

  private Integer batch1DayMaxInputTokens;
 /**
   * The maximum requests per minute.
   * @return maxRequestsPer1Minute
  **/
  @JsonProperty("max_requests_per_1_minute")
  public Integer getMaxRequestsPer1Minute() {
    return maxRequestsPer1Minute;
  }

  public void setMaxRequestsPer1Minute(Integer maxRequestsPer1Minute) {
    this.maxRequestsPer1Minute = maxRequestsPer1Minute;
  }

  public ProjectRateLimitUpdateRequest maxRequestsPer1Minute(Integer maxRequestsPer1Minute) {
    this.maxRequestsPer1Minute = maxRequestsPer1Minute;
    return this;
  }

 /**
   * The maximum tokens per minute.
   * @return maxTokensPer1Minute
  **/
  @JsonProperty("max_tokens_per_1_minute")
  public Integer getMaxTokensPer1Minute() {
    return maxTokensPer1Minute;
  }

  public void setMaxTokensPer1Minute(Integer maxTokensPer1Minute) {
    this.maxTokensPer1Minute = maxTokensPer1Minute;
  }

  public ProjectRateLimitUpdateRequest maxTokensPer1Minute(Integer maxTokensPer1Minute) {
    this.maxTokensPer1Minute = maxTokensPer1Minute;
    return this;
  }

 /**
   * The maximum images per minute. Only relevant for certain models.
   * @return maxImagesPer1Minute
  **/
  @JsonProperty("max_images_per_1_minute")
  public Integer getMaxImagesPer1Minute() {
    return maxImagesPer1Minute;
  }

  public void setMaxImagesPer1Minute(Integer maxImagesPer1Minute) {
    this.maxImagesPer1Minute = maxImagesPer1Minute;
  }

  public ProjectRateLimitUpdateRequest maxImagesPer1Minute(Integer maxImagesPer1Minute) {
    this.maxImagesPer1Minute = maxImagesPer1Minute;
    return this;
  }

 /**
   * The maximum audio megabytes per minute. Only relevant for certain models.
   * @return maxAudioMegabytesPer1Minute
  **/
  @JsonProperty("max_audio_megabytes_per_1_minute")
  public Integer getMaxAudioMegabytesPer1Minute() {
    return maxAudioMegabytesPer1Minute;
  }

  public void setMaxAudioMegabytesPer1Minute(Integer maxAudioMegabytesPer1Minute) {
    this.maxAudioMegabytesPer1Minute = maxAudioMegabytesPer1Minute;
  }

  public ProjectRateLimitUpdateRequest maxAudioMegabytesPer1Minute(Integer maxAudioMegabytesPer1Minute) {
    this.maxAudioMegabytesPer1Minute = maxAudioMegabytesPer1Minute;
    return this;
  }

 /**
   * The maximum requests per day. Only relevant for certain models.
   * @return maxRequestsPer1Day
  **/
  @JsonProperty("max_requests_per_1_day")
  public Integer getMaxRequestsPer1Day() {
    return maxRequestsPer1Day;
  }

  public void setMaxRequestsPer1Day(Integer maxRequestsPer1Day) {
    this.maxRequestsPer1Day = maxRequestsPer1Day;
  }

  public ProjectRateLimitUpdateRequest maxRequestsPer1Day(Integer maxRequestsPer1Day) {
    this.maxRequestsPer1Day = maxRequestsPer1Day;
    return this;
  }

 /**
   * The maximum batch input tokens per day. Only relevant for certain models.
   * @return batch1DayMaxInputTokens
  **/
  @JsonProperty("batch_1_day_max_input_tokens")
  public Integer getBatch1DayMaxInputTokens() {
    return batch1DayMaxInputTokens;
  }

  public void setBatch1DayMaxInputTokens(Integer batch1DayMaxInputTokens) {
    this.batch1DayMaxInputTokens = batch1DayMaxInputTokens;
  }

  public ProjectRateLimitUpdateRequest batch1DayMaxInputTokens(Integer batch1DayMaxInputTokens) {
    this.batch1DayMaxInputTokens = batch1DayMaxInputTokens;
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
    ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest = (ProjectRateLimitUpdateRequest) o;
    return Objects.equals(this.maxRequestsPer1Minute, projectRateLimitUpdateRequest.maxRequestsPer1Minute) &&
        Objects.equals(this.maxTokensPer1Minute, projectRateLimitUpdateRequest.maxTokensPer1Minute) &&
        Objects.equals(this.maxImagesPer1Minute, projectRateLimitUpdateRequest.maxImagesPer1Minute) &&
        Objects.equals(this.maxAudioMegabytesPer1Minute, projectRateLimitUpdateRequest.maxAudioMegabytesPer1Minute) &&
        Objects.equals(this.maxRequestsPer1Day, projectRateLimitUpdateRequest.maxRequestsPer1Day) &&
        Objects.equals(this.batch1DayMaxInputTokens, projectRateLimitUpdateRequest.batch1DayMaxInputTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxRequestsPer1Minute, maxTokensPer1Minute, maxImagesPer1Minute, maxAudioMegabytesPer1Minute, maxRequestsPer1Day, batch1DayMaxInputTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectRateLimitUpdateRequest {\n");
    
    sb.append("    maxRequestsPer1Minute: ").append(toIndentedString(maxRequestsPer1Minute)).append("\n");
    sb.append("    maxTokensPer1Minute: ").append(toIndentedString(maxTokensPer1Minute)).append("\n");
    sb.append("    maxImagesPer1Minute: ").append(toIndentedString(maxImagesPer1Minute)).append("\n");
    sb.append("    maxAudioMegabytesPer1Minute: ").append(toIndentedString(maxAudioMegabytesPer1Minute)).append("\n");
    sb.append("    maxRequestsPer1Day: ").append(toIndentedString(maxRequestsPer1Day)).append("\n");
    sb.append("    batch1DayMaxInputTokens: ").append(toIndentedString(batch1DayMaxInputTokens)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

