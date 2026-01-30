/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UsageCompletionsResult   {
  


  public enum ObjectEnum {
    ORGANIZATION_USAGE_COMPLETIONS_RESULT("organization.usage.completions.result");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ObjectEnum _object;
  private Integer inputTokens;
  private Integer inputCachedTokens;
  private Integer outputTokens;
  private Integer inputAudioTokens;
  private Integer outputAudioTokens;
  private Integer numModelRequests;
  private String projectId;
  private String userId;
  private String apiKeyId;
  private String model;
  private Boolean batch;

  /**
   */
  public UsageCompletionsResult _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens.
   */
  public UsageCompletionsResult inputTokens(Integer inputTokens) {
    this.inputTokens = inputTokens;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens.")
  @JsonProperty("input_tokens")
  public Integer getInputTokens() {
    return inputTokens;
  }
  public void setInputTokens(Integer inputTokens) {
    this.inputTokens = inputTokens;
  }

  /**
   * The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
   */
  public UsageCompletionsResult inputCachedTokens(Integer inputCachedTokens) {
    this.inputCachedTokens = inputCachedTokens;
    return this;
  }

  
  @ApiModelProperty(value = "The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.")
  @JsonProperty("input_cached_tokens")
  public Integer getInputCachedTokens() {
    return inputCachedTokens;
  }
  public void setInputCachedTokens(Integer inputCachedTokens) {
    this.inputCachedTokens = inputCachedTokens;
  }

  /**
   * The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
   */
  public UsageCompletionsResult outputTokens(Integer outputTokens) {
    this.outputTokens = outputTokens;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.")
  @JsonProperty("output_tokens")
  public Integer getOutputTokens() {
    return outputTokens;
  }
  public void setOutputTokens(Integer outputTokens) {
    this.outputTokens = outputTokens;
  }

  /**
   * The aggregated number of audio input tokens used, including cached tokens.
   */
  public UsageCompletionsResult inputAudioTokens(Integer inputAudioTokens) {
    this.inputAudioTokens = inputAudioTokens;
    return this;
  }

  
  @ApiModelProperty(value = "The aggregated number of audio input tokens used, including cached tokens.")
  @JsonProperty("input_audio_tokens")
  public Integer getInputAudioTokens() {
    return inputAudioTokens;
  }
  public void setInputAudioTokens(Integer inputAudioTokens) {
    this.inputAudioTokens = inputAudioTokens;
  }

  /**
   * The aggregated number of audio output tokens used.
   */
  public UsageCompletionsResult outputAudioTokens(Integer outputAudioTokens) {
    this.outputAudioTokens = outputAudioTokens;
    return this;
  }

  
  @ApiModelProperty(value = "The aggregated number of audio output tokens used.")
  @JsonProperty("output_audio_tokens")
  public Integer getOutputAudioTokens() {
    return outputAudioTokens;
  }
  public void setOutputAudioTokens(Integer outputAudioTokens) {
    this.outputAudioTokens = outputAudioTokens;
  }

  /**
   * The count of requests made to the model.
   */
  public UsageCompletionsResult numModelRequests(Integer numModelRequests) {
    this.numModelRequests = numModelRequests;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The count of requests made to the model.")
  @JsonProperty("num_model_requests")
  public Integer getNumModelRequests() {
    return numModelRequests;
  }
  public void setNumModelRequests(Integer numModelRequests) {
    this.numModelRequests = numModelRequests;
  }

  /**
   * When `group_by=project_id`, this field provides the project ID of the grouped usage result.
   */
  public UsageCompletionsResult projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  
  @ApiModelProperty(value = "When `group_by=project_id`, this field provides the project ID of the grouped usage result.")
  @JsonProperty("project_id")
  public String getProjectId() {
    return projectId;
  }
  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  /**
   * When `group_by=user_id`, this field provides the user ID of the grouped usage result.
   */
  public UsageCompletionsResult userId(String userId) {
    this.userId = userId;
    return this;
  }

  
  @ApiModelProperty(value = "When `group_by=user_id`, this field provides the user ID of the grouped usage result.")
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   * When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
   */
  public UsageCompletionsResult apiKeyId(String apiKeyId) {
    this.apiKeyId = apiKeyId;
    return this;
  }

  
  @ApiModelProperty(value = "When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.")
  @JsonProperty("api_key_id")
  public String getApiKeyId() {
    return apiKeyId;
  }
  public void setApiKeyId(String apiKeyId) {
    this.apiKeyId = apiKeyId;
  }

  /**
   * When `group_by=model`, this field provides the model name of the grouped usage result.
   */
  public UsageCompletionsResult model(String model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(value = "When `group_by=model`, this field provides the model name of the grouped usage result.")
  @JsonProperty("model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  /**
   * When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
   */
  public UsageCompletionsResult batch(Boolean batch) {
    this.batch = batch;
    return this;
  }

  
  @ApiModelProperty(value = "When `group_by=batch`, this field tells whether the grouped usage result is batch or not.")
  @JsonProperty("batch")
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
    return Objects.equals(_object, usageCompletionsResult._object) &&
        Objects.equals(inputTokens, usageCompletionsResult.inputTokens) &&
        Objects.equals(inputCachedTokens, usageCompletionsResult.inputCachedTokens) &&
        Objects.equals(outputTokens, usageCompletionsResult.outputTokens) &&
        Objects.equals(inputAudioTokens, usageCompletionsResult.inputAudioTokens) &&
        Objects.equals(outputAudioTokens, usageCompletionsResult.outputAudioTokens) &&
        Objects.equals(numModelRequests, usageCompletionsResult.numModelRequests) &&
        Objects.equals(projectId, usageCompletionsResult.projectId) &&
        Objects.equals(userId, usageCompletionsResult.userId) &&
        Objects.equals(apiKeyId, usageCompletionsResult.apiKeyId) &&
        Objects.equals(model, usageCompletionsResult.model) &&
        Objects.equals(batch, usageCompletionsResult.batch);
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

