package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.CostsResult;
import com.prokarma.pkmst.model.CostsResultAmount;
import com.prokarma.pkmst.model.UsageAudioSpeechesResult;
import com.prokarma.pkmst.model.UsageAudioTranscriptionsResult;
import com.prokarma.pkmst.model.UsageCodeInterpreterSessionsResult;
import com.prokarma.pkmst.model.UsageCompletionsResult;
import com.prokarma.pkmst.model.UsageEmbeddingsResult;
import com.prokarma.pkmst.model.UsageImagesResult;
import com.prokarma.pkmst.model.UsageModerationsResult;
import com.prokarma.pkmst.model.UsageVectorStoresResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * UsageTimeBucketResultInner
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UsageTimeBucketResultInner   {
  /**
   * Gets or Sets _object
   */
  public enum ObjectEnum {
    ORGANIZATION_COSTS_RESULT("organization.costs.result");

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

  @JsonProperty("images")
  private Integer images;

  @JsonProperty("source")
  private String source;

  @JsonProperty("size")
  private String size;

  @JsonProperty("characters")
  private Integer characters;

  @JsonProperty("seconds")
  private Integer seconds;

  @JsonProperty("usage_bytes")
  private Integer usageBytes;

  @JsonProperty("sessions")
  private Integer sessions;

  @JsonProperty("amount")
  private CostsResultAmount amount;

  @JsonProperty("line_item")
  private String lineItem;

  public UsageTimeBucketResultInner _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
   */
  @ApiModelProperty(required = true, value = "")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public UsageTimeBucketResultInner inputTokens(Integer inputTokens) {
    this.inputTokens = inputTokens;
    return this;
  }

  /**
   * The aggregated number of input tokens used.
   * @return inputTokens
   */
  @ApiModelProperty(required = true, value = "The aggregated number of input tokens used.")
  public Integer getInputTokens() {
    return inputTokens;
  }

  public void setInputTokens(Integer inputTokens) {
    this.inputTokens = inputTokens;
  }

  public UsageTimeBucketResultInner inputCachedTokens(Integer inputCachedTokens) {
    this.inputCachedTokens = inputCachedTokens;
    return this;
  }

  /**
   * The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
   * @return inputCachedTokens
   */
  @ApiModelProperty(value = "The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.")
  public Integer getInputCachedTokens() {
    return inputCachedTokens;
  }

  public void setInputCachedTokens(Integer inputCachedTokens) {
    this.inputCachedTokens = inputCachedTokens;
  }

  public UsageTimeBucketResultInner outputTokens(Integer outputTokens) {
    this.outputTokens = outputTokens;
    return this;
  }

  /**
   * The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
   * @return outputTokens
   */
  @ApiModelProperty(required = true, value = "The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.")
  public Integer getOutputTokens() {
    return outputTokens;
  }

  public void setOutputTokens(Integer outputTokens) {
    this.outputTokens = outputTokens;
  }

  public UsageTimeBucketResultInner inputAudioTokens(Integer inputAudioTokens) {
    this.inputAudioTokens = inputAudioTokens;
    return this;
  }

  /**
   * The aggregated number of audio input tokens used, including cached tokens.
   * @return inputAudioTokens
   */
  @ApiModelProperty(value = "The aggregated number of audio input tokens used, including cached tokens.")
  public Integer getInputAudioTokens() {
    return inputAudioTokens;
  }

  public void setInputAudioTokens(Integer inputAudioTokens) {
    this.inputAudioTokens = inputAudioTokens;
  }

  public UsageTimeBucketResultInner outputAudioTokens(Integer outputAudioTokens) {
    this.outputAudioTokens = outputAudioTokens;
    return this;
  }

  /**
   * The aggregated number of audio output tokens used.
   * @return outputAudioTokens
   */
  @ApiModelProperty(value = "The aggregated number of audio output tokens used.")
  public Integer getOutputAudioTokens() {
    return outputAudioTokens;
  }

  public void setOutputAudioTokens(Integer outputAudioTokens) {
    this.outputAudioTokens = outputAudioTokens;
  }

  public UsageTimeBucketResultInner numModelRequests(Integer numModelRequests) {
    this.numModelRequests = numModelRequests;
    return this;
  }

  /**
   * The count of requests made to the model.
   * @return numModelRequests
   */
  @ApiModelProperty(required = true, value = "The count of requests made to the model.")
  public Integer getNumModelRequests() {
    return numModelRequests;
  }

  public void setNumModelRequests(Integer numModelRequests) {
    this.numModelRequests = numModelRequests;
  }

  public UsageTimeBucketResultInner projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * When `group_by=project_id`, this field provides the project ID of the grouped costs result.
   * @return projectId
   */
  @ApiModelProperty(value = "When `group_by=project_id`, this field provides the project ID of the grouped costs result.")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public UsageTimeBucketResultInner userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * When `group_by=user_id`, this field provides the user ID of the grouped usage result.
   * @return userId
   */
  @ApiModelProperty(value = "When `group_by=user_id`, this field provides the user ID of the grouped usage result.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public UsageTimeBucketResultInner apiKeyId(String apiKeyId) {
    this.apiKeyId = apiKeyId;
    return this;
  }

  /**
   * When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
   * @return apiKeyId
   */
  @ApiModelProperty(value = "When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.")
  public String getApiKeyId() {
    return apiKeyId;
  }

  public void setApiKeyId(String apiKeyId) {
    this.apiKeyId = apiKeyId;
  }

  public UsageTimeBucketResultInner model(String model) {
    this.model = model;
    return this;
  }

  /**
   * When `group_by=model`, this field provides the model name of the grouped usage result.
   * @return model
   */
  @ApiModelProperty(value = "When `group_by=model`, this field provides the model name of the grouped usage result.")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public UsageTimeBucketResultInner batch(Boolean batch) {
    this.batch = batch;
    return this;
  }

  /**
   * When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
   * @return batch
   */
  @ApiModelProperty(value = "When `group_by=batch`, this field tells whether the grouped usage result is batch or not.")
  public Boolean getBatch() {
    return batch;
  }

  public void setBatch(Boolean batch) {
    this.batch = batch;
  }

  public UsageTimeBucketResultInner images(Integer images) {
    this.images = images;
    return this;
  }

  /**
   * The number of images processed.
   * @return images
   */
  @ApiModelProperty(required = true, value = "The number of images processed.")
  public Integer getImages() {
    return images;
  }

  public void setImages(Integer images) {
    this.images = images;
  }

  public UsageTimeBucketResultInner source(String source) {
    this.source = source;
    return this;
  }

  /**
   * When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
   * @return source
   */
  @ApiModelProperty(value = "When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public UsageTimeBucketResultInner size(String size) {
    this.size = size;
    return this;
  }

  /**
   * When `group_by=size`, this field provides the image size of the grouped usage result.
   * @return size
   */
  @ApiModelProperty(value = "When `group_by=size`, this field provides the image size of the grouped usage result.")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public UsageTimeBucketResultInner characters(Integer characters) {
    this.characters = characters;
    return this;
  }

  /**
   * The number of characters processed.
   * @return characters
   */
  @ApiModelProperty(required = true, value = "The number of characters processed.")
  public Integer getCharacters() {
    return characters;
  }

  public void setCharacters(Integer characters) {
    this.characters = characters;
  }

  public UsageTimeBucketResultInner seconds(Integer seconds) {
    this.seconds = seconds;
    return this;
  }

  /**
   * The number of seconds processed.
   * @return seconds
   */
  @ApiModelProperty(required = true, value = "The number of seconds processed.")
  public Integer getSeconds() {
    return seconds;
  }

  public void setSeconds(Integer seconds) {
    this.seconds = seconds;
  }

  public UsageTimeBucketResultInner usageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
    return this;
  }

  /**
   * The vector stores usage in bytes.
   * @return usageBytes
   */
  @ApiModelProperty(required = true, value = "The vector stores usage in bytes.")
  public Integer getUsageBytes() {
    return usageBytes;
  }

  public void setUsageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
  }

  public UsageTimeBucketResultInner sessions(Integer sessions) {
    this.sessions = sessions;
    return this;
  }

  /**
   * The number of code interpreter sessions.
   * @return sessions
   */
  @ApiModelProperty(required = true, value = "The number of code interpreter sessions.")
  public Integer getSessions() {
    return sessions;
  }

  public void setSessions(Integer sessions) {
    this.sessions = sessions;
  }

  public UsageTimeBucketResultInner amount(CostsResultAmount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @ApiModelProperty(value = "")
  public CostsResultAmount getAmount() {
    return amount;
  }

  public void setAmount(CostsResultAmount amount) {
    this.amount = amount;
  }

  public UsageTimeBucketResultInner lineItem(String lineItem) {
    this.lineItem = lineItem;
    return this;
  }

  /**
   * When `group_by=line_item`, this field provides the line item of the grouped costs result.
   * @return lineItem
   */
  @ApiModelProperty(value = "When `group_by=line_item`, this field provides the line item of the grouped costs result.")
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
    return Objects.equals(this._object, usageTimeBucketResultInner._object) &&
        Objects.equals(this.inputTokens, usageTimeBucketResultInner.inputTokens) &&
        Objects.equals(this.inputCachedTokens, usageTimeBucketResultInner.inputCachedTokens) &&
        Objects.equals(this.outputTokens, usageTimeBucketResultInner.outputTokens) &&
        Objects.equals(this.inputAudioTokens, usageTimeBucketResultInner.inputAudioTokens) &&
        Objects.equals(this.outputAudioTokens, usageTimeBucketResultInner.outputAudioTokens) &&
        Objects.equals(this.numModelRequests, usageTimeBucketResultInner.numModelRequests) &&
        Objects.equals(this.projectId, usageTimeBucketResultInner.projectId) &&
        Objects.equals(this.userId, usageTimeBucketResultInner.userId) &&
        Objects.equals(this.apiKeyId, usageTimeBucketResultInner.apiKeyId) &&
        Objects.equals(this.model, usageTimeBucketResultInner.model) &&
        Objects.equals(this.batch, usageTimeBucketResultInner.batch) &&
        Objects.equals(this.images, usageTimeBucketResultInner.images) &&
        Objects.equals(this.source, usageTimeBucketResultInner.source) &&
        Objects.equals(this.size, usageTimeBucketResultInner.size) &&
        Objects.equals(this.characters, usageTimeBucketResultInner.characters) &&
        Objects.equals(this.seconds, usageTimeBucketResultInner.seconds) &&
        Objects.equals(this.usageBytes, usageTimeBucketResultInner.usageBytes) &&
        Objects.equals(this.sessions, usageTimeBucketResultInner.sessions) &&
        Objects.equals(this.amount, usageTimeBucketResultInner.amount) &&
        Objects.equals(this.lineItem, usageTimeBucketResultInner.lineItem);
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

