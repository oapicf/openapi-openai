package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The aggregated audio transcriptions usage details of the specific time bucket.
 */

@Schema(name = "UsageAudioTranscriptionsResult", description = "The aggregated audio transcriptions usage details of the specific time bucket.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UsageAudioTranscriptionsResult implements UsageTimeBucketResultInner {

  /**
   * Gets or Sets _object
   */
  public enum ObjectEnum {
    ORGANIZATION_USAGE_AUDIO_TRANSCRIPTIONS_RESULT("organization.usage.audio_transcriptions.result");

    private final String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private ObjectEnum _object;

  private Integer seconds;

  private Integer numModelRequests;

  private JsonNullable<String> projectId = JsonNullable.<String>undefined();

  private JsonNullable<String> userId = JsonNullable.<String>undefined();

  private JsonNullable<String> apiKeyId = JsonNullable.<String>undefined();

  private JsonNullable<String> model = JsonNullable.<String>undefined();

  public UsageAudioTranscriptionsResult() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UsageAudioTranscriptionsResult(ObjectEnum _object, Integer seconds, Integer numModelRequests) {
    this._object = _object;
    this.seconds = seconds;
    this.numModelRequests = numModelRequests;
  }

  public UsageAudioTranscriptionsResult _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
   */
  @NotNull 
  @Schema(name = "object", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public UsageAudioTranscriptionsResult seconds(Integer seconds) {
    this.seconds = seconds;
    return this;
  }

  /**
   * The number of seconds processed.
   * @return seconds
   */
  @NotNull 
  @Schema(name = "seconds", description = "The number of seconds processed.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("seconds")
  public Integer getSeconds() {
    return seconds;
  }

  public void setSeconds(Integer seconds) {
    this.seconds = seconds;
  }

  public UsageAudioTranscriptionsResult numModelRequests(Integer numModelRequests) {
    this.numModelRequests = numModelRequests;
    return this;
  }

  /**
   * The count of requests made to the model.
   * @return numModelRequests
   */
  @NotNull 
  @Schema(name = "num_model_requests", description = "The count of requests made to the model.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("num_model_requests")
  public Integer getNumModelRequests() {
    return numModelRequests;
  }

  public void setNumModelRequests(Integer numModelRequests) {
    this.numModelRequests = numModelRequests;
  }

  public UsageAudioTranscriptionsResult projectId(String projectId) {
    this.projectId = JsonNullable.of(projectId);
    return this;
  }

  /**
   * When `group_by=project_id`, this field provides the project ID of the grouped usage result.
   * @return projectId
   */
  
  @Schema(name = "project_id", description = "When `group_by=project_id`, this field provides the project ID of the grouped usage result.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("project_id")
  public JsonNullable<String> getProjectId() {
    return projectId;
  }

  public void setProjectId(JsonNullable<String> projectId) {
    this.projectId = projectId;
  }

  public UsageAudioTranscriptionsResult userId(String userId) {
    this.userId = JsonNullable.of(userId);
    return this;
  }

  /**
   * When `group_by=user_id`, this field provides the user ID of the grouped usage result.
   * @return userId
   */
  
  @Schema(name = "user_id", description = "When `group_by=user_id`, this field provides the user ID of the grouped usage result.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_id")
  public JsonNullable<String> getUserId() {
    return userId;
  }

  public void setUserId(JsonNullable<String> userId) {
    this.userId = userId;
  }

  public UsageAudioTranscriptionsResult apiKeyId(String apiKeyId) {
    this.apiKeyId = JsonNullable.of(apiKeyId);
    return this;
  }

  /**
   * When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
   * @return apiKeyId
   */
  
  @Schema(name = "api_key_id", description = "When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("api_key_id")
  public JsonNullable<String> getApiKeyId() {
    return apiKeyId;
  }

  public void setApiKeyId(JsonNullable<String> apiKeyId) {
    this.apiKeyId = apiKeyId;
  }

  public UsageAudioTranscriptionsResult model(String model) {
    this.model = JsonNullable.of(model);
    return this;
  }

  /**
   * When `group_by=model`, this field provides the model name of the grouped usage result.
   * @return model
   */
  
  @Schema(name = "model", description = "When `group_by=model`, this field provides the model name of the grouped usage result.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("model")
  public JsonNullable<String> getModel() {
    return model;
  }

  public void setModel(JsonNullable<String> model) {
    this.model = model;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageAudioTranscriptionsResult usageAudioTranscriptionsResult = (UsageAudioTranscriptionsResult) o;
    return Objects.equals(this._object, usageAudioTranscriptionsResult._object) &&
        Objects.equals(this.seconds, usageAudioTranscriptionsResult.seconds) &&
        Objects.equals(this.numModelRequests, usageAudioTranscriptionsResult.numModelRequests) &&
        equalsNullable(this.projectId, usageAudioTranscriptionsResult.projectId) &&
        equalsNullable(this.userId, usageAudioTranscriptionsResult.userId) &&
        equalsNullable(this.apiKeyId, usageAudioTranscriptionsResult.apiKeyId) &&
        equalsNullable(this.model, usageAudioTranscriptionsResult.model);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, seconds, numModelRequests, hashCodeNullable(projectId), hashCodeNullable(userId), hashCodeNullable(apiKeyId), hashCodeNullable(model));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageAudioTranscriptionsResult {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
    sb.append("    numModelRequests: ").append(toIndentedString(numModelRequests)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    apiKeyId: ").append(toIndentedString(apiKeyId)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
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

