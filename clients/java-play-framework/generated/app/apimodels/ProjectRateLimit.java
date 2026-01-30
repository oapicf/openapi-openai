package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Represents a project rate limit config.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ProjectRateLimit   {
  /**
   * The object type, which is always `project.rate_limit`
   */
  public enum ObjectEnum {
    PROJECT_RATE_LIMIT("project.rate_limit");

    private final String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
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

  @JsonProperty("object")
  @NotNull

  private ObjectEnum _object;

  @JsonProperty("id")
  @NotNull

  private String id;

  @JsonProperty("model")
  @NotNull

  private String model;

  @JsonProperty("max_requests_per_1_minute")
  @NotNull

  private Integer maxRequestsPer1Minute;

  @JsonProperty("max_tokens_per_1_minute")
  @NotNull

  private Integer maxTokensPer1Minute;

  @JsonProperty("max_images_per_1_minute")
  
  private Integer maxImagesPer1Minute;

  @JsonProperty("max_audio_megabytes_per_1_minute")
  
  private Integer maxAudioMegabytesPer1Minute;

  @JsonProperty("max_requests_per_1_day")
  
  private Integer maxRequestsPer1Day;

  @JsonProperty("batch_1_day_max_input_tokens")
  
  private Integer batch1DayMaxInputTokens;

  public ProjectRateLimit _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

   /**
   * The object type, which is always `project.rate_limit`
   * @return _object
  **/
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public ProjectRateLimit id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier, which can be referenced in API endpoints.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProjectRateLimit model(String model) {
    this.model = model;
    return this;
  }

   /**
   * The model this rate limit applies to.
   * @return model
  **/
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public ProjectRateLimit maxRequestsPer1Minute(Integer maxRequestsPer1Minute) {
    this.maxRequestsPer1Minute = maxRequestsPer1Minute;
    return this;
  }

   /**
   * The maximum requests per minute.
   * @return maxRequestsPer1Minute
  **/
  public Integer getMaxRequestsPer1Minute() {
    return maxRequestsPer1Minute;
  }

  public void setMaxRequestsPer1Minute(Integer maxRequestsPer1Minute) {
    this.maxRequestsPer1Minute = maxRequestsPer1Minute;
  }

  public ProjectRateLimit maxTokensPer1Minute(Integer maxTokensPer1Minute) {
    this.maxTokensPer1Minute = maxTokensPer1Minute;
    return this;
  }

   /**
   * The maximum tokens per minute.
   * @return maxTokensPer1Minute
  **/
  public Integer getMaxTokensPer1Minute() {
    return maxTokensPer1Minute;
  }

  public void setMaxTokensPer1Minute(Integer maxTokensPer1Minute) {
    this.maxTokensPer1Minute = maxTokensPer1Minute;
  }

  public ProjectRateLimit maxImagesPer1Minute(Integer maxImagesPer1Minute) {
    this.maxImagesPer1Minute = maxImagesPer1Minute;
    return this;
  }

   /**
   * The maximum images per minute. Only present for relevant models.
   * @return maxImagesPer1Minute
  **/
  public Integer getMaxImagesPer1Minute() {
    return maxImagesPer1Minute;
  }

  public void setMaxImagesPer1Minute(Integer maxImagesPer1Minute) {
    this.maxImagesPer1Minute = maxImagesPer1Minute;
  }

  public ProjectRateLimit maxAudioMegabytesPer1Minute(Integer maxAudioMegabytesPer1Minute) {
    this.maxAudioMegabytesPer1Minute = maxAudioMegabytesPer1Minute;
    return this;
  }

   /**
   * The maximum audio megabytes per minute. Only present for relevant models.
   * @return maxAudioMegabytesPer1Minute
  **/
  public Integer getMaxAudioMegabytesPer1Minute() {
    return maxAudioMegabytesPer1Minute;
  }

  public void setMaxAudioMegabytesPer1Minute(Integer maxAudioMegabytesPer1Minute) {
    this.maxAudioMegabytesPer1Minute = maxAudioMegabytesPer1Minute;
  }

  public ProjectRateLimit maxRequestsPer1Day(Integer maxRequestsPer1Day) {
    this.maxRequestsPer1Day = maxRequestsPer1Day;
    return this;
  }

   /**
   * The maximum requests per day. Only present for relevant models.
   * @return maxRequestsPer1Day
  **/
  public Integer getMaxRequestsPer1Day() {
    return maxRequestsPer1Day;
  }

  public void setMaxRequestsPer1Day(Integer maxRequestsPer1Day) {
    this.maxRequestsPer1Day = maxRequestsPer1Day;
  }

  public ProjectRateLimit batch1DayMaxInputTokens(Integer batch1DayMaxInputTokens) {
    this.batch1DayMaxInputTokens = batch1DayMaxInputTokens;
    return this;
  }

   /**
   * The maximum batch input tokens per day. Only present for relevant models.
   * @return batch1DayMaxInputTokens
  **/
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
    return Objects.equals(_object, projectRateLimit._object) &&
        Objects.equals(id, projectRateLimit.id) &&
        Objects.equals(model, projectRateLimit.model) &&
        Objects.equals(maxRequestsPer1Minute, projectRateLimit.maxRequestsPer1Minute) &&
        Objects.equals(maxTokensPer1Minute, projectRateLimit.maxTokensPer1Minute) &&
        Objects.equals(maxImagesPer1Minute, projectRateLimit.maxImagesPer1Minute) &&
        Objects.equals(maxAudioMegabytesPer1Minute, projectRateLimit.maxAudioMegabytesPer1Minute) &&
        Objects.equals(maxRequestsPer1Day, projectRateLimit.maxRequestsPer1Day) &&
        Objects.equals(batch1DayMaxInputTokens, projectRateLimit.batch1DayMaxInputTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, id, model, maxRequestsPer1Minute, maxTokensPer1Minute, maxImagesPer1Minute, maxAudioMegabytesPer1Minute, maxRequestsPer1Day, batch1DayMaxInputTokens);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

