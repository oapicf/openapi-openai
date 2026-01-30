package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Represents a project rate limit config.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ProjectRateLimit   {
  

  /**
   * The object type, which is always &#x60;project.rate_limit&#x60;
   */
  public enum ObjectEnum {
    PROJECT_RATE_LIMIT("project.rate_limit");
    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ObjectEnum _object;
  private String id;
  private String model;
  private Integer maxRequestsPer1Minute;
  private Integer maxTokensPer1Minute;
  private Integer maxImagesPer1Minute;
  private Integer maxAudioMegabytesPer1Minute;
  private Integer maxRequestsPer1Day;
  private Integer batch1DayMaxInputTokens;

  /**
   * The object type, which is always &#x60;project.rate_limit&#x60;
   **/
  
  @ApiModelProperty(required = true, value = "The object type, which is always `project.rate_limit`")
  @JsonProperty("object")
  @NotNull
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * The identifier, which can be referenced in API endpoints.
   **/
  
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints.")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The model this rate limit applies to.
   **/
  
  @ApiModelProperty(required = true, value = "The model this rate limit applies to.")
  @JsonProperty("model")
  @NotNull
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  /**
   * The maximum requests per minute.
   **/
  
  @ApiModelProperty(required = true, value = "The maximum requests per minute.")
  @JsonProperty("max_requests_per_1_minute")
  @NotNull
  public Integer getMaxRequestsPer1Minute() {
    return maxRequestsPer1Minute;
  }
  public void setMaxRequestsPer1Minute(Integer maxRequestsPer1Minute) {
    this.maxRequestsPer1Minute = maxRequestsPer1Minute;
  }

  /**
   * The maximum tokens per minute.
   **/
  
  @ApiModelProperty(required = true, value = "The maximum tokens per minute.")
  @JsonProperty("max_tokens_per_1_minute")
  @NotNull
  public Integer getMaxTokensPer1Minute() {
    return maxTokensPer1Minute;
  }
  public void setMaxTokensPer1Minute(Integer maxTokensPer1Minute) {
    this.maxTokensPer1Minute = maxTokensPer1Minute;
  }

  /**
   * The maximum images per minute. Only present for relevant models.
   **/
  
  @ApiModelProperty(value = "The maximum images per minute. Only present for relevant models.")
  @JsonProperty("max_images_per_1_minute")
  public Integer getMaxImagesPer1Minute() {
    return maxImagesPer1Minute;
  }
  public void setMaxImagesPer1Minute(Integer maxImagesPer1Minute) {
    this.maxImagesPer1Minute = maxImagesPer1Minute;
  }

  /**
   * The maximum audio megabytes per minute. Only present for relevant models.
   **/
  
  @ApiModelProperty(value = "The maximum audio megabytes per minute. Only present for relevant models.")
  @JsonProperty("max_audio_megabytes_per_1_minute")
  public Integer getMaxAudioMegabytesPer1Minute() {
    return maxAudioMegabytesPer1Minute;
  }
  public void setMaxAudioMegabytesPer1Minute(Integer maxAudioMegabytesPer1Minute) {
    this.maxAudioMegabytesPer1Minute = maxAudioMegabytesPer1Minute;
  }

  /**
   * The maximum requests per day. Only present for relevant models.
   **/
  
  @ApiModelProperty(value = "The maximum requests per day. Only present for relevant models.")
  @JsonProperty("max_requests_per_1_day")
  public Integer getMaxRequestsPer1Day() {
    return maxRequestsPer1Day;
  }
  public void setMaxRequestsPer1Day(Integer maxRequestsPer1Day) {
    this.maxRequestsPer1Day = maxRequestsPer1Day;
  }

  /**
   * The maximum batch input tokens per day. Only present for relevant models.
   **/
  
  @ApiModelProperty(value = "The maximum batch input tokens per day. Only present for relevant models.")
  @JsonProperty("batch_1_day_max_input_tokens")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

