package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Represents a project rate limit config.
 **/
@ApiModel(description = "Represents a project rate limit config.")
@JsonTypeName("ProjectRateLimit")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ProjectRateLimit   {
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ObjectEnum fromString(String s) {
        for (ObjectEnum b : ObjectEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static ObjectEnum fromValue(String value) {
        for (ObjectEnum b : ObjectEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

  public ProjectRateLimit() {
  }

  @JsonCreator
  public ProjectRateLimit(
    @JsonProperty(required = true, value = "object") ObjectEnum _object,
    @JsonProperty(required = true, value = "id") String id,
    @JsonProperty(required = true, value = "model") String model,
    @JsonProperty(required = true, value = "max_requests_per_1_minute") Integer maxRequestsPer1Minute,
    @JsonProperty(required = true, value = "max_tokens_per_1_minute") Integer maxTokensPer1Minute
  ) {
    this._object = _object;
    this.id = id;
    this.model = model;
    this.maxRequestsPer1Minute = maxRequestsPer1Minute;
    this.maxTokensPer1Minute = maxTokensPer1Minute;
  }

  /**
   * The object type, which is always &#x60;project.rate_limit&#x60;
   **/
  public ProjectRateLimit _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The object type, which is always `project.rate_limit`")
  @JsonProperty(required = true, value = "object")
  @NotNull public ObjectEnum getObject() {
    return _object;
  }

  @JsonProperty(required = true, value = "object")
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * The identifier, which can be referenced in API endpoints.
   **/
  public ProjectRateLimit id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints.")
  @JsonProperty(required = true, value = "id")
  @NotNull public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The model this rate limit applies to.
   **/
  public ProjectRateLimit model(String model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The model this rate limit applies to.")
  @JsonProperty(required = true, value = "model")
  @NotNull public String getModel() {
    return model;
  }

  @JsonProperty(required = true, value = "model")
  public void setModel(String model) {
    this.model = model;
  }

  /**
   * The maximum requests per minute.
   **/
  public ProjectRateLimit maxRequestsPer1Minute(Integer maxRequestsPer1Minute) {
    this.maxRequestsPer1Minute = maxRequestsPer1Minute;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The maximum requests per minute.")
  @JsonProperty(required = true, value = "max_requests_per_1_minute")
  @NotNull public Integer getMaxRequestsPer1Minute() {
    return maxRequestsPer1Minute;
  }

  @JsonProperty(required = true, value = "max_requests_per_1_minute")
  public void setMaxRequestsPer1Minute(Integer maxRequestsPer1Minute) {
    this.maxRequestsPer1Minute = maxRequestsPer1Minute;
  }

  /**
   * The maximum tokens per minute.
   **/
  public ProjectRateLimit maxTokensPer1Minute(Integer maxTokensPer1Minute) {
    this.maxTokensPer1Minute = maxTokensPer1Minute;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The maximum tokens per minute.")
  @JsonProperty(required = true, value = "max_tokens_per_1_minute")
  @NotNull public Integer getMaxTokensPer1Minute() {
    return maxTokensPer1Minute;
  }

  @JsonProperty(required = true, value = "max_tokens_per_1_minute")
  public void setMaxTokensPer1Minute(Integer maxTokensPer1Minute) {
    this.maxTokensPer1Minute = maxTokensPer1Minute;
  }

  /**
   * The maximum images per minute. Only present for relevant models.
   **/
  public ProjectRateLimit maxImagesPer1Minute(Integer maxImagesPer1Minute) {
    this.maxImagesPer1Minute = maxImagesPer1Minute;
    return this;
  }

  
  @ApiModelProperty(value = "The maximum images per minute. Only present for relevant models.")
  @JsonProperty("max_images_per_1_minute")
  public Integer getMaxImagesPer1Minute() {
    return maxImagesPer1Minute;
  }

  @JsonProperty("max_images_per_1_minute")
  public void setMaxImagesPer1Minute(Integer maxImagesPer1Minute) {
    this.maxImagesPer1Minute = maxImagesPer1Minute;
  }

  /**
   * The maximum audio megabytes per minute. Only present for relevant models.
   **/
  public ProjectRateLimit maxAudioMegabytesPer1Minute(Integer maxAudioMegabytesPer1Minute) {
    this.maxAudioMegabytesPer1Minute = maxAudioMegabytesPer1Minute;
    return this;
  }

  
  @ApiModelProperty(value = "The maximum audio megabytes per minute. Only present for relevant models.")
  @JsonProperty("max_audio_megabytes_per_1_minute")
  public Integer getMaxAudioMegabytesPer1Minute() {
    return maxAudioMegabytesPer1Minute;
  }

  @JsonProperty("max_audio_megabytes_per_1_minute")
  public void setMaxAudioMegabytesPer1Minute(Integer maxAudioMegabytesPer1Minute) {
    this.maxAudioMegabytesPer1Minute = maxAudioMegabytesPer1Minute;
  }

  /**
   * The maximum requests per day. Only present for relevant models.
   **/
  public ProjectRateLimit maxRequestsPer1Day(Integer maxRequestsPer1Day) {
    this.maxRequestsPer1Day = maxRequestsPer1Day;
    return this;
  }

  
  @ApiModelProperty(value = "The maximum requests per day. Only present for relevant models.")
  @JsonProperty("max_requests_per_1_day")
  public Integer getMaxRequestsPer1Day() {
    return maxRequestsPer1Day;
  }

  @JsonProperty("max_requests_per_1_day")
  public void setMaxRequestsPer1Day(Integer maxRequestsPer1Day) {
    this.maxRequestsPer1Day = maxRequestsPer1Day;
  }

  /**
   * The maximum batch input tokens per day. Only present for relevant models.
   **/
  public ProjectRateLimit batch1DayMaxInputTokens(Integer batch1DayMaxInputTokens) {
    this.batch1DayMaxInputTokens = batch1DayMaxInputTokens;
    return this;
  }

  
  @ApiModelProperty(value = "The maximum batch input tokens per day. Only present for relevant models.")
  @JsonProperty("batch_1_day_max_input_tokens")
  public Integer getBatch1DayMaxInputTokens() {
    return batch1DayMaxInputTokens;
  }

  @JsonProperty("batch_1_day_max_input_tokens")
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

