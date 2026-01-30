package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProjectRateLimitUpdateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ProjectRateLimitUpdateRequest {

  private @Nullable Integer maxRequestsPer1Minute;

  private @Nullable Integer maxTokensPer1Minute;

  private @Nullable Integer maxImagesPer1Minute;

  private @Nullable Integer maxAudioMegabytesPer1Minute;

  private @Nullable Integer maxRequestsPer1Day;

  private @Nullable Integer batch1DayMaxInputTokens;

  public ProjectRateLimitUpdateRequest maxRequestsPer1Minute(@Nullable Integer maxRequestsPer1Minute) {
    this.maxRequestsPer1Minute = maxRequestsPer1Minute;
    return this;
  }

  /**
   * The maximum requests per minute.
   * @return maxRequestsPer1Minute
   */
  
  @Schema(name = "max_requests_per_1_minute", description = "The maximum requests per minute.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_requests_per_1_minute")
  public @Nullable Integer getMaxRequestsPer1Minute() {
    return maxRequestsPer1Minute;
  }

  public void setMaxRequestsPer1Minute(@Nullable Integer maxRequestsPer1Minute) {
    this.maxRequestsPer1Minute = maxRequestsPer1Minute;
  }

  public ProjectRateLimitUpdateRequest maxTokensPer1Minute(@Nullable Integer maxTokensPer1Minute) {
    this.maxTokensPer1Minute = maxTokensPer1Minute;
    return this;
  }

  /**
   * The maximum tokens per minute.
   * @return maxTokensPer1Minute
   */
  
  @Schema(name = "max_tokens_per_1_minute", description = "The maximum tokens per minute.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_tokens_per_1_minute")
  public @Nullable Integer getMaxTokensPer1Minute() {
    return maxTokensPer1Minute;
  }

  public void setMaxTokensPer1Minute(@Nullable Integer maxTokensPer1Minute) {
    this.maxTokensPer1Minute = maxTokensPer1Minute;
  }

  public ProjectRateLimitUpdateRequest maxImagesPer1Minute(@Nullable Integer maxImagesPer1Minute) {
    this.maxImagesPer1Minute = maxImagesPer1Minute;
    return this;
  }

  /**
   * The maximum images per minute. Only relevant for certain models.
   * @return maxImagesPer1Minute
   */
  
  @Schema(name = "max_images_per_1_minute", description = "The maximum images per minute. Only relevant for certain models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_images_per_1_minute")
  public @Nullable Integer getMaxImagesPer1Minute() {
    return maxImagesPer1Minute;
  }

  public void setMaxImagesPer1Minute(@Nullable Integer maxImagesPer1Minute) {
    this.maxImagesPer1Minute = maxImagesPer1Minute;
  }

  public ProjectRateLimitUpdateRequest maxAudioMegabytesPer1Minute(@Nullable Integer maxAudioMegabytesPer1Minute) {
    this.maxAudioMegabytesPer1Minute = maxAudioMegabytesPer1Minute;
    return this;
  }

  /**
   * The maximum audio megabytes per minute. Only relevant for certain models.
   * @return maxAudioMegabytesPer1Minute
   */
  
  @Schema(name = "max_audio_megabytes_per_1_minute", description = "The maximum audio megabytes per minute. Only relevant for certain models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_audio_megabytes_per_1_minute")
  public @Nullable Integer getMaxAudioMegabytesPer1Minute() {
    return maxAudioMegabytesPer1Minute;
  }

  public void setMaxAudioMegabytesPer1Minute(@Nullable Integer maxAudioMegabytesPer1Minute) {
    this.maxAudioMegabytesPer1Minute = maxAudioMegabytesPer1Minute;
  }

  public ProjectRateLimitUpdateRequest maxRequestsPer1Day(@Nullable Integer maxRequestsPer1Day) {
    this.maxRequestsPer1Day = maxRequestsPer1Day;
    return this;
  }

  /**
   * The maximum requests per day. Only relevant for certain models.
   * @return maxRequestsPer1Day
   */
  
  @Schema(name = "max_requests_per_1_day", description = "The maximum requests per day. Only relevant for certain models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_requests_per_1_day")
  public @Nullable Integer getMaxRequestsPer1Day() {
    return maxRequestsPer1Day;
  }

  public void setMaxRequestsPer1Day(@Nullable Integer maxRequestsPer1Day) {
    this.maxRequestsPer1Day = maxRequestsPer1Day;
  }

  public ProjectRateLimitUpdateRequest batch1DayMaxInputTokens(@Nullable Integer batch1DayMaxInputTokens) {
    this.batch1DayMaxInputTokens = batch1DayMaxInputTokens;
    return this;
  }

  /**
   * The maximum batch input tokens per day. Only relevant for certain models.
   * @return batch1DayMaxInputTokens
   */
  
  @Schema(name = "batch_1_day_max_input_tokens", description = "The maximum batch input tokens per day. Only relevant for certain models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("batch_1_day_max_input_tokens")
  public @Nullable Integer getBatch1DayMaxInputTokens() {
    return batch1DayMaxInputTokens;
  }

  public void setBatch1DayMaxInputTokens(@Nullable Integer batch1DayMaxInputTokens) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

