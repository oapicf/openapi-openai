package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The aggregated completions usage details of the specific time bucket.
 */
@ApiModel(description="The aggregated completions usage details of the specific time bucket.")

public class UsageCompletionsResult  {
  
public enum ObjectEnum {

    @JsonProperty("organization.usage.completions.result") ORGANIZATION_USAGE_COMPLETIONS_RESULT(String.valueOf("organization.usage.completions.result"));

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

  @ApiModelProperty(required = true, value = "")
  private ObjectEnum _object;

 /**
  * The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens.
  */
  @ApiModelProperty(required = true, value = "The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens.")
  private Integer inputTokens;

 /**
  * The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
  */
  @ApiModelProperty(value = "The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.")
  private Integer inputCachedTokens;

 /**
  * The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
  */
  @ApiModelProperty(required = true, value = "The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.")
  private Integer outputTokens;

 /**
  * The aggregated number of audio input tokens used, including cached tokens.
  */
  @ApiModelProperty(value = "The aggregated number of audio input tokens used, including cached tokens.")
  private Integer inputAudioTokens;

 /**
  * The aggregated number of audio output tokens used.
  */
  @ApiModelProperty(value = "The aggregated number of audio output tokens used.")
  private Integer outputAudioTokens;

 /**
  * The count of requests made to the model.
  */
  @ApiModelProperty(required = true, value = "The count of requests made to the model.")
  private Integer numModelRequests;

 /**
  * When `group_by=project_id`, this field provides the project ID of the grouped usage result.
  */
  @ApiModelProperty(value = "When `group_by=project_id`, this field provides the project ID of the grouped usage result.")
  private String projectId;

 /**
  * When `group_by=user_id`, this field provides the user ID of the grouped usage result.
  */
  @ApiModelProperty(value = "When `group_by=user_id`, this field provides the user ID of the grouped usage result.")
  private String userId;

 /**
  * When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
  */
  @ApiModelProperty(value = "When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.")
  private String apiKeyId;

 /**
  * When `group_by=model`, this field provides the model name of the grouped usage result.
  */
  @ApiModelProperty(value = "When `group_by=model`, this field provides the model name of the grouped usage result.")
  private String model;

 /**
  * When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
  */
  @ApiModelProperty(value = "When `group_by=batch`, this field tells whether the grouped usage result is batch or not.")
  private Boolean batch;
 /**
  * Get _object
  * @return _object
  */
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    return _object == null ? null : _object.value();
  }

  /**
   * Sets the <code>_object</code> property.
   */
 public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * Sets the <code>_object</code> property.
   */
  public UsageCompletionsResult _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
  * The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens.
  * @return inputTokens
  */
  @JsonProperty("input_tokens")
  @NotNull
  public Integer getInputTokens() {
    return inputTokens;
  }

  /**
   * Sets the <code>inputTokens</code> property.
   */
 public void setInputTokens(Integer inputTokens) {
    this.inputTokens = inputTokens;
  }

  /**
   * Sets the <code>inputTokens</code> property.
   */
  public UsageCompletionsResult inputTokens(Integer inputTokens) {
    this.inputTokens = inputTokens;
    return this;
  }

 /**
  * The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
  * @return inputCachedTokens
  */
  @JsonProperty("input_cached_tokens")
  public Integer getInputCachedTokens() {
    return inputCachedTokens;
  }

  /**
   * Sets the <code>inputCachedTokens</code> property.
   */
 public void setInputCachedTokens(Integer inputCachedTokens) {
    this.inputCachedTokens = inputCachedTokens;
  }

  /**
   * Sets the <code>inputCachedTokens</code> property.
   */
  public UsageCompletionsResult inputCachedTokens(Integer inputCachedTokens) {
    this.inputCachedTokens = inputCachedTokens;
    return this;
  }

 /**
  * The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
  * @return outputTokens
  */
  @JsonProperty("output_tokens")
  @NotNull
  public Integer getOutputTokens() {
    return outputTokens;
  }

  /**
   * Sets the <code>outputTokens</code> property.
   */
 public void setOutputTokens(Integer outputTokens) {
    this.outputTokens = outputTokens;
  }

  /**
   * Sets the <code>outputTokens</code> property.
   */
  public UsageCompletionsResult outputTokens(Integer outputTokens) {
    this.outputTokens = outputTokens;
    return this;
  }

 /**
  * The aggregated number of audio input tokens used, including cached tokens.
  * @return inputAudioTokens
  */
  @JsonProperty("input_audio_tokens")
  public Integer getInputAudioTokens() {
    return inputAudioTokens;
  }

  /**
   * Sets the <code>inputAudioTokens</code> property.
   */
 public void setInputAudioTokens(Integer inputAudioTokens) {
    this.inputAudioTokens = inputAudioTokens;
  }

  /**
   * Sets the <code>inputAudioTokens</code> property.
   */
  public UsageCompletionsResult inputAudioTokens(Integer inputAudioTokens) {
    this.inputAudioTokens = inputAudioTokens;
    return this;
  }

 /**
  * The aggregated number of audio output tokens used.
  * @return outputAudioTokens
  */
  @JsonProperty("output_audio_tokens")
  public Integer getOutputAudioTokens() {
    return outputAudioTokens;
  }

  /**
   * Sets the <code>outputAudioTokens</code> property.
   */
 public void setOutputAudioTokens(Integer outputAudioTokens) {
    this.outputAudioTokens = outputAudioTokens;
  }

  /**
   * Sets the <code>outputAudioTokens</code> property.
   */
  public UsageCompletionsResult outputAudioTokens(Integer outputAudioTokens) {
    this.outputAudioTokens = outputAudioTokens;
    return this;
  }

 /**
  * The count of requests made to the model.
  * @return numModelRequests
  */
  @JsonProperty("num_model_requests")
  @NotNull
  public Integer getNumModelRequests() {
    return numModelRequests;
  }

  /**
   * Sets the <code>numModelRequests</code> property.
   */
 public void setNumModelRequests(Integer numModelRequests) {
    this.numModelRequests = numModelRequests;
  }

  /**
   * Sets the <code>numModelRequests</code> property.
   */
  public UsageCompletionsResult numModelRequests(Integer numModelRequests) {
    this.numModelRequests = numModelRequests;
    return this;
  }

 /**
  * When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result.
  * @return projectId
  */
  @JsonProperty("project_id")
  public String getProjectId() {
    return projectId;
  }

  /**
   * Sets the <code>projectId</code> property.
   */
 public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  /**
   * Sets the <code>projectId</code> property.
   */
  public UsageCompletionsResult projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

 /**
  * When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result.
  * @return userId
  */
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }

  /**
   * Sets the <code>userId</code> property.
   */
 public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   * Sets the <code>userId</code> property.
   */
  public UsageCompletionsResult userId(String userId) {
    this.userId = userId;
    return this;
  }

 /**
  * When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result.
  * @return apiKeyId
  */
  @JsonProperty("api_key_id")
  public String getApiKeyId() {
    return apiKeyId;
  }

  /**
   * Sets the <code>apiKeyId</code> property.
   */
 public void setApiKeyId(String apiKeyId) {
    this.apiKeyId = apiKeyId;
  }

  /**
   * Sets the <code>apiKeyId</code> property.
   */
  public UsageCompletionsResult apiKeyId(String apiKeyId) {
    this.apiKeyId = apiKeyId;
    return this;
  }

 /**
  * When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result.
  * @return model
  */
  @JsonProperty("model")
  public String getModel() {
    return model;
  }

  /**
   * Sets the <code>model</code> property.
   */
 public void setModel(String model) {
    this.model = model;
  }

  /**
   * Sets the <code>model</code> property.
   */
  public UsageCompletionsResult model(String model) {
    this.model = model;
    return this;
  }

 /**
  * When &#x60;group_by&#x3D;batch&#x60;, this field tells whether the grouped usage result is batch or not.
  * @return batch
  */
  @JsonProperty("batch")
  public Boolean getBatch() {
    return batch;
  }

  /**
   * Sets the <code>batch</code> property.
   */
 public void setBatch(Boolean batch) {
    this.batch = batch;
  }

  /**
   * Sets the <code>batch</code> property.
   */
  public UsageCompletionsResult batch(Boolean batch) {
    this.batch = batch;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

