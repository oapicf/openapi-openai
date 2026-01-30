package org.openapitools.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a project rate limit config.
 */
@ApiModel(description="Represents a project rate limit config.")

public class ProjectRateLimit  {
  
public enum ObjectEnum {

PROJECT_RATE_LIMIT(String.valueOf("project.rate_limit"));


    private String value;

    ObjectEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String value) {
        for (ObjectEnum b : ObjectEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The object type, which is always `project.rate_limit`
  */
  @ApiModelProperty(required = true, value = "The object type, which is always `project.rate_limit`")

  private ObjectEnum _object;

 /**
  * The identifier, which can be referenced in API endpoints.
  */
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints.")

  private String id;

 /**
  * The model this rate limit applies to.
  */
  @ApiModelProperty(required = true, value = "The model this rate limit applies to.")

  private String model;

 /**
  * The maximum requests per minute.
  */
  @ApiModelProperty(required = true, value = "The maximum requests per minute.")

  private Integer maxRequestsPer1Minute;

 /**
  * The maximum tokens per minute.
  */
  @ApiModelProperty(required = true, value = "The maximum tokens per minute.")

  private Integer maxTokensPer1Minute;

 /**
  * The maximum images per minute. Only present for relevant models.
  */
  @ApiModelProperty(value = "The maximum images per minute. Only present for relevant models.")

  private Integer maxImagesPer1Minute;

 /**
  * The maximum audio megabytes per minute. Only present for relevant models.
  */
  @ApiModelProperty(value = "The maximum audio megabytes per minute. Only present for relevant models.")

  private Integer maxAudioMegabytesPer1Minute;

 /**
  * The maximum requests per day. Only present for relevant models.
  */
  @ApiModelProperty(value = "The maximum requests per day. Only present for relevant models.")

  private Integer maxRequestsPer1Day;

 /**
  * The maximum batch input tokens per day. Only present for relevant models.
  */
  @ApiModelProperty(value = "The maximum batch input tokens per day. Only present for relevant models.")

  private Integer batch1DayMaxInputTokens;
 /**
   * The object type, which is always &#x60;project.rate_limit&#x60;
   * @return _object
  **/
  @JsonProperty("object")
  public String getObject() {
    if (_object == null) {
      return null;
    }
    return _object.value();
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public ProjectRateLimit _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
   * The identifier, which can be referenced in API endpoints.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProjectRateLimit id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The model this rate limit applies to.
   * @return model
  **/
  @JsonProperty("model")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public ProjectRateLimit model(String model) {
    this.model = model;
    return this;
  }

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

  public ProjectRateLimit maxRequestsPer1Minute(Integer maxRequestsPer1Minute) {
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

  public ProjectRateLimit maxTokensPer1Minute(Integer maxTokensPer1Minute) {
    this.maxTokensPer1Minute = maxTokensPer1Minute;
    return this;
  }

 /**
   * The maximum images per minute. Only present for relevant models.
   * @return maxImagesPer1Minute
  **/
  @JsonProperty("max_images_per_1_minute")
  public Integer getMaxImagesPer1Minute() {
    return maxImagesPer1Minute;
  }

  public void setMaxImagesPer1Minute(Integer maxImagesPer1Minute) {
    this.maxImagesPer1Minute = maxImagesPer1Minute;
  }

  public ProjectRateLimit maxImagesPer1Minute(Integer maxImagesPer1Minute) {
    this.maxImagesPer1Minute = maxImagesPer1Minute;
    return this;
  }

 /**
   * The maximum audio megabytes per minute. Only present for relevant models.
   * @return maxAudioMegabytesPer1Minute
  **/
  @JsonProperty("max_audio_megabytes_per_1_minute")
  public Integer getMaxAudioMegabytesPer1Minute() {
    return maxAudioMegabytesPer1Minute;
  }

  public void setMaxAudioMegabytesPer1Minute(Integer maxAudioMegabytesPer1Minute) {
    this.maxAudioMegabytesPer1Minute = maxAudioMegabytesPer1Minute;
  }

  public ProjectRateLimit maxAudioMegabytesPer1Minute(Integer maxAudioMegabytesPer1Minute) {
    this.maxAudioMegabytesPer1Minute = maxAudioMegabytesPer1Minute;
    return this;
  }

 /**
   * The maximum requests per day. Only present for relevant models.
   * @return maxRequestsPer1Day
  **/
  @JsonProperty("max_requests_per_1_day")
  public Integer getMaxRequestsPer1Day() {
    return maxRequestsPer1Day;
  }

  public void setMaxRequestsPer1Day(Integer maxRequestsPer1Day) {
    this.maxRequestsPer1Day = maxRequestsPer1Day;
  }

  public ProjectRateLimit maxRequestsPer1Day(Integer maxRequestsPer1Day) {
    this.maxRequestsPer1Day = maxRequestsPer1Day;
    return this;
  }

 /**
   * The maximum batch input tokens per day. Only present for relevant models.
   * @return batch1DayMaxInputTokens
  **/
  @JsonProperty("batch_1_day_max_input_tokens")
  public Integer getBatch1DayMaxInputTokens() {
    return batch1DayMaxInputTokens;
  }

  public void setBatch1DayMaxInputTokens(Integer batch1DayMaxInputTokens) {
    this.batch1DayMaxInputTokens = batch1DayMaxInputTokens;
  }

  public ProjectRateLimit batch1DayMaxInputTokens(Integer batch1DayMaxInputTokens) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

