package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Represents a project rate limit config.
 */
public class ProjectRateLimit implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The object type, which is always &#x60;project.rate_limit&#x60;
   */
  @JsonProperty("object")
  private String _object;

  /**
   * The identifier, which can be referenced in API endpoints.
   */
  @JsonProperty("id")
  private String id;

  /**
   * The model this rate limit applies to.
   */
  @JsonProperty("model")
  private String model;

  /**
   * The maximum requests per minute.
   */
  @JsonProperty("max_requests_per_1_minute")
  private Integer maxRequestsPer1Minute;

  /**
   * The maximum tokens per minute.
   */
  @JsonProperty("max_tokens_per_1_minute")
  private Integer maxTokensPer1Minute;

  /**
   * The maximum images per minute. Only present for relevant models.
   */
  @JsonProperty("max_images_per_1_minute")
  private Integer maxImagesPer1Minute;

  /**
   * The maximum audio megabytes per minute. Only present for relevant models.
   */
  @JsonProperty("max_audio_megabytes_per_1_minute")
  private Integer maxAudioMegabytesPer1Minute;

  /**
   * The maximum requests per day. Only present for relevant models.
   */
  @JsonProperty("max_requests_per_1_day")
  private Integer maxRequestsPer1Day;

  /**
   * The maximum batch input tokens per day. Only present for relevant models.
   */
  @JsonProperty("batch_1_day_max_input_tokens")
  private Integer batch1DayMaxInputTokens;

  /**
   * The object type, which is always &#x60;project.rate_limit&#x60;
   * @return _object
   */
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   * The identifier, which can be referenced in API endpoints.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The model this rate limit applies to.
   * @return model
   */
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  /**
   * The maximum requests per minute.
   * @return maxRequestsPer1Minute
   */
  public Integer getMaxRequestsPer1Minute() {
    return maxRequestsPer1Minute;
  }

  public void setMaxRequestsPer1Minute(Integer maxRequestsPer1Minute) {
    this.maxRequestsPer1Minute = maxRequestsPer1Minute;
  }

  /**
   * The maximum tokens per minute.
   * @return maxTokensPer1Minute
   */
  public Integer getMaxTokensPer1Minute() {
    return maxTokensPer1Minute;
  }

  public void setMaxTokensPer1Minute(Integer maxTokensPer1Minute) {
    this.maxTokensPer1Minute = maxTokensPer1Minute;
  }

  /**
   * The maximum images per minute. Only present for relevant models.
   * @return maxImagesPer1Minute
   */
  public Integer getMaxImagesPer1Minute() {
    return maxImagesPer1Minute;
  }

  public void setMaxImagesPer1Minute(Integer maxImagesPer1Minute) {
    this.maxImagesPer1Minute = maxImagesPer1Minute;
  }

  /**
   * The maximum audio megabytes per minute. Only present for relevant models.
   * @return maxAudioMegabytesPer1Minute
   */
  public Integer getMaxAudioMegabytesPer1Minute() {
    return maxAudioMegabytesPer1Minute;
  }

  public void setMaxAudioMegabytesPer1Minute(Integer maxAudioMegabytesPer1Minute) {
    this.maxAudioMegabytesPer1Minute = maxAudioMegabytesPer1Minute;
  }

  /**
   * The maximum requests per day. Only present for relevant models.
   * @return maxRequestsPer1Day
   */
  public Integer getMaxRequestsPer1Day() {
    return maxRequestsPer1Day;
  }

  public void setMaxRequestsPer1Day(Integer maxRequestsPer1Day) {
    this.maxRequestsPer1Day = maxRequestsPer1Day;
  }

  /**
   * The maximum batch input tokens per day. Only present for relevant models.
   * @return batch1DayMaxInputTokens
   */
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
    ProjectRateLimit projectRateLimit = (ProjectRateLimit) o;
    return Objects.equals(this._object, projectRateLimit._object) &&
        Objects.equals(this.id, projectRateLimit.id) &&
        Objects.equals(this.model, projectRateLimit.model) &&
        Objects.equals(this.maxRequestsPer1Minute, projectRateLimit.maxRequestsPer1Minute) &&
        Objects.equals(this.maxTokensPer1Minute, projectRateLimit.maxTokensPer1Minute) &&
        Objects.equals(this.maxImagesPer1Minute, projectRateLimit.maxImagesPer1Minute) &&
        Objects.equals(this.maxAudioMegabytesPer1Minute, projectRateLimit.maxAudioMegabytesPer1Minute) &&
        Objects.equals(this.maxRequestsPer1Day, projectRateLimit.maxRequestsPer1Day) &&
        Objects.equals(this.batch1DayMaxInputTokens, projectRateLimit.batch1DayMaxInputTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, id, model, maxRequestsPer1Minute, maxTokensPer1Minute, maxImagesPer1Minute, maxAudioMegabytesPer1Minute, maxRequestsPer1Day, batch1DayMaxInputTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectRateLimit {\n");
    
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
