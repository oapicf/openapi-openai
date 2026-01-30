package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The aggregated completions usage details of the specific time bucket.
 */
@ApiModel(description = "The aggregated completions usage details of the specific time bucket.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UsageCompletionsResult   {
  /**
   * Gets or Sets _object
   */
  public enum ObjectEnum {
    ORGANIZATION_USAGE_COMPLETIONS_RESULT("organization.usage.completions.result");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ObjectEnum fromValue(String text) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("object")
  private ObjectEnum _object;

  @JsonProperty("input_tokens")
  private Integer inputTokens;

  @JsonProperty("input_cached_tokens")
  private Integer inputCachedTokens;

  @JsonProperty("output_tokens")
  private Integer outputTokens;

  @JsonProperty("input_audio_tokens")
  private Integer inputAudioTokens;

  @JsonProperty("output_audio_tokens")
  private Integer outputAudioTokens;

  @JsonProperty("num_model_requests")
  private Integer numModelRequests;

  @JsonProperty("project_id")
  private String projectId;

  @JsonProperty("user_id")
  private String userId;

  @JsonProperty("api_key_id")
  private String apiKeyId;

  @JsonProperty("model")
  private String model;

  @JsonProperty("batch")
  private Boolean batch;

  public UsageCompletionsResult _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @ApiModelProperty(required = true, value = "")
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
  **/
  @ApiModelProperty(required = true, value = "The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens.")
  public Integer getInputTokens() {
    return inputTokens;
  }

  public void setInputTokens(Integer inputTokens) {
    this.inputTokens = inputTokens;
  }

  public UsageCompletionsResult inputCachedTokens(Integer inputCachedTokens) {
    this.inputCachedTokens = inputCachedTokens;
    return this;
  }

   /**
   * The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
   * @return inputCachedTokens
  **/
  @ApiModelProperty(value = "The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.")
  public Integer getInputCachedTokens() {
    return inputCachedTokens;
  }

  public void setInputCachedTokens(Integer inputCachedTokens) {
    this.inputCachedTokens = inputCachedTokens;
  }

  public UsageCompletionsResult outputTokens(Integer outputTokens) {
    this.outputTokens = outputTokens;
    return this;
  }

   /**
   * The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
   * @return outputTokens
  **/
  @ApiModelProperty(required = true, value = "The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.")
  public Integer getOutputTokens() {
    return outputTokens;
  }

  public void setOutputTokens(Integer outputTokens) {
    this.outputTokens = outputTokens;
  }

  public UsageCompletionsResult inputAudioTokens(Integer inputAudioTokens) {
    this.inputAudioTokens = inputAudioTokens;
    return this;
  }

   /**
   * The aggregated number of audio input tokens used, including cached tokens.
   * @return inputAudioTokens
  **/
  @ApiModelProperty(value = "The aggregated number of audio input tokens used, including cached tokens.")
  public Integer getInputAudioTokens() {
    return inputAudioTokens;
  }

  public void setInputAudioTokens(Integer inputAudioTokens) {
    this.inputAudioTokens = inputAudioTokens;
  }

  public UsageCompletionsResult outputAudioTokens(Integer outputAudioTokens) {
    this.outputAudioTokens = outputAudioTokens;
    return this;
  }

   /**
   * The aggregated number of audio output tokens used.
   * @return outputAudioTokens
  **/
  @ApiModelProperty(value = "The aggregated number of audio output tokens used.")
  public Integer getOutputAudioTokens() {
    return outputAudioTokens;
  }

  public void setOutputAudioTokens(Integer outputAudioTokens) {
    this.outputAudioTokens = outputAudioTokens;
  }

  public UsageCompletionsResult numModelRequests(Integer numModelRequests) {
    this.numModelRequests = numModelRequests;
    return this;
  }

   /**
   * The count of requests made to the model.
   * @return numModelRequests
  **/
  @ApiModelProperty(required = true, value = "The count of requests made to the model.")
  public Integer getNumModelRequests() {
    return numModelRequests;
  }

  public void setNumModelRequests(Integer numModelRequests) {
    this.numModelRequests = numModelRequests;
  }

  public UsageCompletionsResult projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * When `group_by=project_id`, this field provides the project ID of the grouped usage result.
   * @return projectId
  **/
  @ApiModelProperty(value = "When `group_by=project_id`, this field provides the project ID of the grouped usage result.")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public UsageCompletionsResult userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * When `group_by=user_id`, this field provides the user ID of the grouped usage result.
   * @return userId
  **/
  @ApiModelProperty(value = "When `group_by=user_id`, this field provides the user ID of the grouped usage result.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public UsageCompletionsResult apiKeyId(String apiKeyId) {
    this.apiKeyId = apiKeyId;
    return this;
  }

   /**
   * When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
   * @return apiKeyId
  **/
  @ApiModelProperty(value = "When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.")
  public String getApiKeyId() {
    return apiKeyId;
  }

  public void setApiKeyId(String apiKeyId) {
    this.apiKeyId = apiKeyId;
  }

  public UsageCompletionsResult model(String model) {
    this.model = model;
    return this;
  }

   /**
   * When `group_by=model`, this field provides the model name of the grouped usage result.
   * @return model
  **/
  @ApiModelProperty(value = "When `group_by=model`, this field provides the model name of the grouped usage result.")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public UsageCompletionsResult batch(Boolean batch) {
    this.batch = batch;
    return this;
  }

   /**
   * When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
   * @return batch
  **/
  @ApiModelProperty(value = "When `group_by=batch`, this field tells whether the grouped usage result is batch or not.")
  public Boolean getBatch() {
    return batch;
  }

  public void setBatch(Boolean batch) {
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
        Objects.equals(this.projectId, usageCompletionsResult.projectId) &&
        Objects.equals(this.userId, usageCompletionsResult.userId) &&
        Objects.equals(this.apiKeyId, usageCompletionsResult.apiKeyId) &&
        Objects.equals(this.model, usageCompletionsResult.model) &&
        Objects.equals(this.batch, usageCompletionsResult.batch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, inputTokens, inputCachedTokens, outputTokens, inputAudioTokens, outputAudioTokens, numModelRequests, projectId, userId, apiKeyId, model, batch);
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

