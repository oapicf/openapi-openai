package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.lang.Nullable;
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
 * The aggregated completions usage details of the specific time bucket.
 */

@Schema(name = "UsageCompletionsResult", description = "The aggregated completions usage details of the specific time bucket.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UsageCompletionsResult implements UsageTimeBucketResultInner {

  /**
   * Gets or Sets _object
   */
  public enum ObjectEnum {
    ORGANIZATION_USAGE_COMPLETIONS_RESULT("organization.usage.completions.result");

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

  private Integer inputTokens;

  private @Nullable Integer inputCachedTokens;

  private Integer outputTokens;

  private @Nullable Integer inputAudioTokens;

  private @Nullable Integer outputAudioTokens;

  private Integer numModelRequests;

  private JsonNullable<String> projectId = JsonNullable.<String>undefined();

  private JsonNullable<String> userId = JsonNullable.<String>undefined();

  private JsonNullable<String> apiKeyId = JsonNullable.<String>undefined();

  private JsonNullable<String> model = JsonNullable.<String>undefined();

  private JsonNullable<Boolean> batch = JsonNullable.<Boolean>undefined();

  public UsageCompletionsResult() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UsageCompletionsResult(ObjectEnum _object, Integer inputTokens, Integer outputTokens, Integer numModelRequests) {
    this._object = _object;
    this.inputTokens = inputTokens;
    this.outputTokens = outputTokens;
    this.numModelRequests = numModelRequests;
  }

  public UsageCompletionsResult _object(ObjectEnum _object) {
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

  public UsageCompletionsResult inputTokens(Integer inputTokens) {
    this.inputTokens = inputTokens;
    return this;
  }

  /**
   * The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens.
   * @return inputTokens
   */
  @NotNull 
  @Schema(name = "input_tokens", description = "The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("input_tokens")
  public Integer getInputTokens() {
    return inputTokens;
  }

  public void setInputTokens(Integer inputTokens) {
    this.inputTokens = inputTokens;
  }

  public UsageCompletionsResult inputCachedTokens(@Nullable Integer inputCachedTokens) {
    this.inputCachedTokens = inputCachedTokens;
    return this;
  }

  /**
   * The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
   * @return inputCachedTokens
   */
  
  @Schema(name = "input_cached_tokens", description = "The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("input_cached_tokens")
  public @Nullable Integer getInputCachedTokens() {
    return inputCachedTokens;
  }

  public void setInputCachedTokens(@Nullable Integer inputCachedTokens) {
    this.inputCachedTokens = inputCachedTokens;
  }

  public UsageCompletionsResult outputTokens(Integer outputTokens) {
    this.outputTokens = outputTokens;
    return this;
  }

  /**
   * The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
   * @return outputTokens
   */
  @NotNull 
  @Schema(name = "output_tokens", description = "The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("output_tokens")
  public Integer getOutputTokens() {
    return outputTokens;
  }

  public void setOutputTokens(Integer outputTokens) {
    this.outputTokens = outputTokens;
  }

  public UsageCompletionsResult inputAudioTokens(@Nullable Integer inputAudioTokens) {
    this.inputAudioTokens = inputAudioTokens;
    return this;
  }

  /**
   * The aggregated number of audio input tokens used, including cached tokens.
   * @return inputAudioTokens
   */
  
  @Schema(name = "input_audio_tokens", description = "The aggregated number of audio input tokens used, including cached tokens.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("input_audio_tokens")
  public @Nullable Integer getInputAudioTokens() {
    return inputAudioTokens;
  }

  public void setInputAudioTokens(@Nullable Integer inputAudioTokens) {
    this.inputAudioTokens = inputAudioTokens;
  }

  public UsageCompletionsResult outputAudioTokens(@Nullable Integer outputAudioTokens) {
    this.outputAudioTokens = outputAudioTokens;
    return this;
  }

  /**
   * The aggregated number of audio output tokens used.
   * @return outputAudioTokens
   */
  
  @Schema(name = "output_audio_tokens", description = "The aggregated number of audio output tokens used.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("output_audio_tokens")
  public @Nullable Integer getOutputAudioTokens() {
    return outputAudioTokens;
  }

  public void setOutputAudioTokens(@Nullable Integer outputAudioTokens) {
    this.outputAudioTokens = outputAudioTokens;
  }

  public UsageCompletionsResult numModelRequests(Integer numModelRequests) {
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

  public UsageCompletionsResult projectId(String projectId) {
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

  public UsageCompletionsResult userId(String userId) {
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

  public UsageCompletionsResult apiKeyId(String apiKeyId) {
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

  public UsageCompletionsResult model(String model) {
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

  public UsageCompletionsResult batch(Boolean batch) {
    this.batch = JsonNullable.of(batch);
    return this;
  }

  /**
   * When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
   * @return batch
   */
  
  @Schema(name = "batch", description = "When `group_by=batch`, this field tells whether the grouped usage result is batch or not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("batch")
  public JsonNullable<Boolean> getBatch() {
    return batch;
  }

  public void setBatch(JsonNullable<Boolean> batch) {
    this.batch = batch;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageCompletionsResult usageCompletionsResult = (UsageCompletionsResult) o;
    return Objects.equals(this._object, usageCompletionsResult._object) &&
        Objects.equals(this.inputTokens, usageCompletionsResult.inputTokens) &&
        Objects.equals(this.inputCachedTokens, usageCompletionsResult.inputCachedTokens) &&
        Objects.equals(this.outputTokens, usageCompletionsResult.outputTokens) &&
        Objects.equals(this.inputAudioTokens, usageCompletionsResult.inputAudioTokens) &&
        Objects.equals(this.outputAudioTokens, usageCompletionsResult.outputAudioTokens) &&
        Objects.equals(this.numModelRequests, usageCompletionsResult.numModelRequests) &&
        equalsNullable(this.projectId, usageCompletionsResult.projectId) &&
        equalsNullable(this.userId, usageCompletionsResult.userId) &&
        equalsNullable(this.apiKeyId, usageCompletionsResult.apiKeyId) &&
        equalsNullable(this.model, usageCompletionsResult.model) &&
        equalsNullable(this.batch, usageCompletionsResult.batch);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, inputTokens, inputCachedTokens, outputTokens, inputAudioTokens, outputAudioTokens, numModelRequests, hashCodeNullable(projectId), hashCodeNullable(userId), hashCodeNullable(apiKeyId), hashCodeNullable(model), hashCodeNullable(batch));
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
    sb.append("class UsageCompletionsResult {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    inputTokens: ").append(toIndentedString(inputTokens)).append("\n");
    sb.append("    inputCachedTokens: ").append(toIndentedString(inputCachedTokens)).append("\n");
    sb.append("    outputTokens: ").append(toIndentedString(outputTokens)).append("\n");
    sb.append("    inputAudioTokens: ").append(toIndentedString(inputAudioTokens)).append("\n");
    sb.append("    outputAudioTokens: ").append(toIndentedString(outputAudioTokens)).append("\n");
    sb.append("    numModelRequests: ").append(toIndentedString(numModelRequests)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    apiKeyId: ").append(toIndentedString(apiKeyId)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    batch: ").append(toIndentedString(batch)).append("\n");
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

