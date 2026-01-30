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
import org.openapitools.model.CostsResult;
import org.openapitools.model.CostsResultAmount;
import org.openapitools.model.UsageAudioSpeechesResult;
import org.openapitools.model.UsageAudioTranscriptionsResult;
import org.openapitools.model.UsageCodeInterpreterSessionsResult;
import org.openapitools.model.UsageCompletionsResult;
import org.openapitools.model.UsageEmbeddingsResult;
import org.openapitools.model.UsageImagesResult;
import org.openapitools.model.UsageModerationsResult;
import org.openapitools.model.UsageVectorStoresResult;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UsageTimeBucketResultInner   {
  


  public enum ObjectEnum {
    ORGANIZATION_COSTS_RESULT("organization.costs.result");

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
  private Integer images;
  private String source;
  private String size;
  private Integer characters;
  private Integer seconds;
  private Integer usageBytes;
  private Integer sessions;
  private CostsResultAmount amount;
  private String lineItem;

  /**
   */
  public UsageTimeBucketResultInner _object(ObjectEnum _object) {
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
   * The aggregated number of input tokens used.
   */
  public UsageTimeBucketResultInner inputTokens(Integer inputTokens) {
    this.inputTokens = inputTokens;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The aggregated number of input tokens used.")
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
  public UsageTimeBucketResultInner inputCachedTokens(Integer inputCachedTokens) {
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
  public UsageTimeBucketResultInner outputTokens(Integer outputTokens) {
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
  public UsageTimeBucketResultInner inputAudioTokens(Integer inputAudioTokens) {
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
  public UsageTimeBucketResultInner outputAudioTokens(Integer outputAudioTokens) {
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
  public UsageTimeBucketResultInner numModelRequests(Integer numModelRequests) {
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
   * When `group_by=project_id`, this field provides the project ID of the grouped costs result.
   */
  public UsageTimeBucketResultInner projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  
  @ApiModelProperty(value = "When `group_by=project_id`, this field provides the project ID of the grouped costs result.")
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
  public UsageTimeBucketResultInner userId(String userId) {
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
  public UsageTimeBucketResultInner apiKeyId(String apiKeyId) {
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
  public UsageTimeBucketResultInner model(String model) {
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
  public UsageTimeBucketResultInner batch(Boolean batch) {
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

  /**
   * The number of images processed.
   */
  public UsageTimeBucketResultInner images(Integer images) {
    this.images = images;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The number of images processed.")
  @JsonProperty("images")
  public Integer getImages() {
    return images;
  }
  public void setImages(Integer images) {
    this.images = images;
  }

  /**
   * When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
   */
  public UsageTimeBucketResultInner source(String source) {
    this.source = source;
    return this;
  }

  
  @ApiModelProperty(value = "When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  /**
   * When `group_by=size`, this field provides the image size of the grouped usage result.
   */
  public UsageTimeBucketResultInner size(String size) {
    this.size = size;
    return this;
  }

  
  @ApiModelProperty(value = "When `group_by=size`, this field provides the image size of the grouped usage result.")
  @JsonProperty("size")
  public String getSize() {
    return size;
  }
  public void setSize(String size) {
    this.size = size;
  }

  /**
   * The number of characters processed.
   */
  public UsageTimeBucketResultInner characters(Integer characters) {
    this.characters = characters;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The number of characters processed.")
  @JsonProperty("characters")
  public Integer getCharacters() {
    return characters;
  }
  public void setCharacters(Integer characters) {
    this.characters = characters;
  }

  /**
   * The number of seconds processed.
   */
  public UsageTimeBucketResultInner seconds(Integer seconds) {
    this.seconds = seconds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The number of seconds processed.")
  @JsonProperty("seconds")
  public Integer getSeconds() {
    return seconds;
  }
  public void setSeconds(Integer seconds) {
    this.seconds = seconds;
  }

  /**
   * The vector stores usage in bytes.
   */
  public UsageTimeBucketResultInner usageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The vector stores usage in bytes.")
  @JsonProperty("usage_bytes")
  public Integer getUsageBytes() {
    return usageBytes;
  }
  public void setUsageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
  }

  /**
   * The number of code interpreter sessions.
   */
  public UsageTimeBucketResultInner sessions(Integer sessions) {
    this.sessions = sessions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The number of code interpreter sessions.")
  @JsonProperty("sessions")
  public Integer getSessions() {
    return sessions;
  }
  public void setSessions(Integer sessions) {
    this.sessions = sessions;
  }

  /**
   */
  public UsageTimeBucketResultInner amount(CostsResultAmount amount) {
    this.amount = amount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("amount")
  public CostsResultAmount getAmount() {
    return amount;
  }
  public void setAmount(CostsResultAmount amount) {
    this.amount = amount;
  }

  /**
   * When `group_by=line_item`, this field provides the line item of the grouped costs result.
   */
  public UsageTimeBucketResultInner lineItem(String lineItem) {
    this.lineItem = lineItem;
    return this;
  }

  
  @ApiModelProperty(value = "When `group_by=line_item`, this field provides the line item of the grouped costs result.")
  @JsonProperty("line_item")
  public String getLineItem() {
    return lineItem;
  }
  public void setLineItem(String lineItem) {
    this.lineItem = lineItem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageTimeBucketResultInner usageTimeBucketResultInner = (UsageTimeBucketResultInner) o;
    return Objects.equals(_object, usageTimeBucketResultInner._object) &&
        Objects.equals(inputTokens, usageTimeBucketResultInner.inputTokens) &&
        Objects.equals(inputCachedTokens, usageTimeBucketResultInner.inputCachedTokens) &&
        Objects.equals(outputTokens, usageTimeBucketResultInner.outputTokens) &&
        Objects.equals(inputAudioTokens, usageTimeBucketResultInner.inputAudioTokens) &&
        Objects.equals(outputAudioTokens, usageTimeBucketResultInner.outputAudioTokens) &&
        Objects.equals(numModelRequests, usageTimeBucketResultInner.numModelRequests) &&
        Objects.equals(projectId, usageTimeBucketResultInner.projectId) &&
        Objects.equals(userId, usageTimeBucketResultInner.userId) &&
        Objects.equals(apiKeyId, usageTimeBucketResultInner.apiKeyId) &&
        Objects.equals(model, usageTimeBucketResultInner.model) &&
        Objects.equals(batch, usageTimeBucketResultInner.batch) &&
        Objects.equals(images, usageTimeBucketResultInner.images) &&
        Objects.equals(source, usageTimeBucketResultInner.source) &&
        Objects.equals(size, usageTimeBucketResultInner.size) &&
        Objects.equals(characters, usageTimeBucketResultInner.characters) &&
        Objects.equals(seconds, usageTimeBucketResultInner.seconds) &&
        Objects.equals(usageBytes, usageTimeBucketResultInner.usageBytes) &&
        Objects.equals(sessions, usageTimeBucketResultInner.sessions) &&
        Objects.equals(amount, usageTimeBucketResultInner.amount) &&
        Objects.equals(lineItem, usageTimeBucketResultInner.lineItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, inputTokens, inputCachedTokens, outputTokens, inputAudioTokens, outputAudioTokens, numModelRequests, projectId, userId, apiKeyId, model, batch, images, source, size, characters, seconds, usageBytes, sessions, amount, lineItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageTimeBucketResultInner {\n");
    
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
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    characters: ").append(toIndentedString(characters)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
    sb.append("    usageBytes: ").append(toIndentedString(usageBytes)).append("\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    lineItem: ").append(toIndentedString(lineItem)).append("\n");
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

