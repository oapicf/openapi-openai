package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * The payload used to update the rate limits.
 */
@ApiModel(description = "The payload used to update the rate limits.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogRateLimitUpdatedChangesRequested   {
  @JsonProperty("max_requests_per_1_minute")
  private Integer maxRequestsPer1Minute;

  @JsonProperty("max_tokens_per_1_minute")
  private Integer maxTokensPer1Minute;

  @JsonProperty("max_images_per_1_minute")
  private Integer maxImagesPer1Minute;

  @JsonProperty("max_audio_megabytes_per_1_minute")
  private Integer maxAudioMegabytesPer1Minute;

  @JsonProperty("max_requests_per_1_day")
  private Integer maxRequestsPer1Day;

  @JsonProperty("batch_1_day_max_input_tokens")
  private Integer batch1DayMaxInputTokens;

  public AuditLogRateLimitUpdatedChangesRequested maxRequestsPer1Minute(Integer maxRequestsPer1Minute) {
    this.maxRequestsPer1Minute = maxRequestsPer1Minute;
    return this;
  }

  /**
   * The maximum requests per minute.
   * @return maxRequestsPer1Minute
   */
  @ApiModelProperty(value = "The maximum requests per minute.")
  public Integer getMaxRequestsPer1Minute() {
    return maxRequestsPer1Minute;
  }

  public void setMaxRequestsPer1Minute(Integer maxRequestsPer1Minute) {
    this.maxRequestsPer1Minute = maxRequestsPer1Minute;
  }

  public AuditLogRateLimitUpdatedChangesRequested maxTokensPer1Minute(Integer maxTokensPer1Minute) {
    this.maxTokensPer1Minute = maxTokensPer1Minute;
    return this;
  }

  /**
   * The maximum tokens per minute.
   * @return maxTokensPer1Minute
   */
  @ApiModelProperty(value = "The maximum tokens per minute.")
  public Integer getMaxTokensPer1Minute() {
    return maxTokensPer1Minute;
  }

  public void setMaxTokensPer1Minute(Integer maxTokensPer1Minute) {
    this.maxTokensPer1Minute = maxTokensPer1Minute;
  }

  public AuditLogRateLimitUpdatedChangesRequested maxImagesPer1Minute(Integer maxImagesPer1Minute) {
    this.maxImagesPer1Minute = maxImagesPer1Minute;
    return this;
  }

  /**
   * The maximum images per minute. Only relevant for certain models.
   * @return maxImagesPer1Minute
   */
  @ApiModelProperty(value = "The maximum images per minute. Only relevant for certain models.")
  public Integer getMaxImagesPer1Minute() {
    return maxImagesPer1Minute;
  }

  public void setMaxImagesPer1Minute(Integer maxImagesPer1Minute) {
    this.maxImagesPer1Minute = maxImagesPer1Minute;
  }

  public AuditLogRateLimitUpdatedChangesRequested maxAudioMegabytesPer1Minute(Integer maxAudioMegabytesPer1Minute) {
    this.maxAudioMegabytesPer1Minute = maxAudioMegabytesPer1Minute;
    return this;
  }

  /**
   * The maximum audio megabytes per minute. Only relevant for certain models.
   * @return maxAudioMegabytesPer1Minute
   */
  @ApiModelProperty(value = "The maximum audio megabytes per minute. Only relevant for certain models.")
  public Integer getMaxAudioMegabytesPer1Minute() {
    return maxAudioMegabytesPer1Minute;
  }

  public void setMaxAudioMegabytesPer1Minute(Integer maxAudioMegabytesPer1Minute) {
    this.maxAudioMegabytesPer1Minute = maxAudioMegabytesPer1Minute;
  }

  public AuditLogRateLimitUpdatedChangesRequested maxRequestsPer1Day(Integer maxRequestsPer1Day) {
    this.maxRequestsPer1Day = maxRequestsPer1Day;
    return this;
  }

  /**
   * The maximum requests per day. Only relevant for certain models.
   * @return maxRequestsPer1Day
   */
  @ApiModelProperty(value = "The maximum requests per day. Only relevant for certain models.")
  public Integer getMaxRequestsPer1Day() {
    return maxRequestsPer1Day;
  }

  public void setMaxRequestsPer1Day(Integer maxRequestsPer1Day) {
    this.maxRequestsPer1Day = maxRequestsPer1Day;
  }

  public AuditLogRateLimitUpdatedChangesRequested batch1DayMaxInputTokens(Integer batch1DayMaxInputTokens) {
    this.batch1DayMaxInputTokens = batch1DayMaxInputTokens;
    return this;
  }

  /**
   * The maximum batch input tokens per day. Only relevant for certain models.
   * @return batch1DayMaxInputTokens
   */
  @ApiModelProperty(value = "The maximum batch input tokens per day. Only relevant for certain models.")
  public Integer getBatch1DayMaxInputTokens() {
    return batch1DayMaxInputTokens;
  }

  public void setBatch1DayMaxInputTokens(Integer batch1DayMaxInputTokens) {
    this.batch1DayMaxInputTokens = batch1DayMaxInputTokens;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogRateLimitUpdatedChangesRequested auditLogRateLimitUpdatedChangesRequested = (AuditLogRateLimitUpdatedChangesRequested) o;
    return Objects.equals(this.maxRequestsPer1Minute, auditLogRateLimitUpdatedChangesRequested.maxRequestsPer1Minute) &&
        Objects.equals(this.maxTokensPer1Minute, auditLogRateLimitUpdatedChangesRequested.maxTokensPer1Minute) &&
        Objects.equals(this.maxImagesPer1Minute, auditLogRateLimitUpdatedChangesRequested.maxImagesPer1Minute) &&
        Objects.equals(this.maxAudioMegabytesPer1Minute, auditLogRateLimitUpdatedChangesRequested.maxAudioMegabytesPer1Minute) &&
        Objects.equals(this.maxRequestsPer1Day, auditLogRateLimitUpdatedChangesRequested.maxRequestsPer1Day) &&
        Objects.equals(this.batch1DayMaxInputTokens, auditLogRateLimitUpdatedChangesRequested.batch1DayMaxInputTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxRequestsPer1Minute, maxTokensPer1Minute, maxImagesPer1Minute, maxAudioMegabytesPer1Minute, maxRequestsPer1Day, batch1DayMaxInputTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogRateLimitUpdatedChangesRequested {\n");
    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

