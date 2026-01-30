package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UsageTimeBucketResultInner  {
  
public enum ObjectEnum {

    @JsonProperty("organization.costs.result") ORGANIZATION_COSTS_RESULT(String.valueOf("organization.costs.result"));

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
  * The aggregated number of input tokens used.
  */
  @ApiModelProperty(required = true, value = "The aggregated number of input tokens used.")
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
  * When `group_by=project_id`, this field provides the project ID of the grouped costs result.
  */
  @ApiModelProperty(value = "When `group_by=project_id`, this field provides the project ID of the grouped costs result.")
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
  * The number of images processed.
  */
  @ApiModelProperty(required = true, value = "The number of images processed.")
  private Integer images;

 /**
  * When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
  */
  @ApiModelProperty(value = "When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.")
  private String source;

 /**
  * When `group_by=size`, this field provides the image size of the grouped usage result.
  */
  @ApiModelProperty(value = "When `group_by=size`, this field provides the image size of the grouped usage result.")
  private String size;

 /**
  * The number of characters processed.
  */
  @ApiModelProperty(required = true, value = "The number of characters processed.")
  private Integer characters;

 /**
  * The number of seconds processed.
  */
  @ApiModelProperty(required = true, value = "The number of seconds processed.")
  private Integer seconds;

 /**
  * The vector stores usage in bytes.
  */
  @ApiModelProperty(required = true, value = "The vector stores usage in bytes.")
  private Integer usageBytes;

 /**
  * The number of code interpreter sessions.
  */
  @ApiModelProperty(required = true, value = "The number of code interpreter sessions.")
  private Integer sessions;

  @ApiModelProperty(value = "")
  @Valid
  private CostsResultAmount amount;

 /**
  * When `group_by=line_item`, this field provides the line item of the grouped costs result.
  */
  @ApiModelProperty(value = "When `group_by=line_item`, this field provides the line item of the grouped costs result.")
  private String lineItem;
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
  public UsageTimeBucketResultInner _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
  * The aggregated number of input tokens used.
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
  public UsageTimeBucketResultInner inputTokens(Integer inputTokens) {
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
  public UsageTimeBucketResultInner inputCachedTokens(Integer inputCachedTokens) {
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
  public UsageTimeBucketResultInner outputTokens(Integer outputTokens) {
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
  public UsageTimeBucketResultInner inputAudioTokens(Integer inputAudioTokens) {
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
  public UsageTimeBucketResultInner outputAudioTokens(Integer outputAudioTokens) {
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
  public UsageTimeBucketResultInner numModelRequests(Integer numModelRequests) {
    this.numModelRequests = numModelRequests;
    return this;
  }

 /**
  * When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped costs result.
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
  public UsageTimeBucketResultInner projectId(String projectId) {
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
  public UsageTimeBucketResultInner userId(String userId) {
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
  public UsageTimeBucketResultInner apiKeyId(String apiKeyId) {
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
  public UsageTimeBucketResultInner model(String model) {
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
  public UsageTimeBucketResultInner batch(Boolean batch) {
    this.batch = batch;
    return this;
  }

 /**
  * The number of images processed.
  * @return images
  */
  @JsonProperty("images")
  @NotNull
  public Integer getImages() {
    return images;
  }

  /**
   * Sets the <code>images</code> property.
   */
 public void setImages(Integer images) {
    this.images = images;
  }

  /**
   * Sets the <code>images</code> property.
   */
  public UsageTimeBucketResultInner images(Integer images) {
    this.images = images;
    return this;
  }

 /**
  * When &#x60;group_by&#x3D;source&#x60;, this field provides the source of the grouped usage result, possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60;.
  * @return source
  */
  @JsonProperty("source")
  public String getSource() {
    return source;
  }

  /**
   * Sets the <code>source</code> property.
   */
 public void setSource(String source) {
    this.source = source;
  }

  /**
   * Sets the <code>source</code> property.
   */
  public UsageTimeBucketResultInner source(String source) {
    this.source = source;
    return this;
  }

 /**
  * When &#x60;group_by&#x3D;size&#x60;, this field provides the image size of the grouped usage result.
  * @return size
  */
  @JsonProperty("size")
  public String getSize() {
    return size;
  }

  /**
   * Sets the <code>size</code> property.
   */
 public void setSize(String size) {
    this.size = size;
  }

  /**
   * Sets the <code>size</code> property.
   */
  public UsageTimeBucketResultInner size(String size) {
    this.size = size;
    return this;
  }

 /**
  * The number of characters processed.
  * @return characters
  */
  @JsonProperty("characters")
  @NotNull
  public Integer getCharacters() {
    return characters;
  }

  /**
   * Sets the <code>characters</code> property.
   */
 public void setCharacters(Integer characters) {
    this.characters = characters;
  }

  /**
   * Sets the <code>characters</code> property.
   */
  public UsageTimeBucketResultInner characters(Integer characters) {
    this.characters = characters;
    return this;
  }

 /**
  * The number of seconds processed.
  * @return seconds
  */
  @JsonProperty("seconds")
  @NotNull
  public Integer getSeconds() {
    return seconds;
  }

  /**
   * Sets the <code>seconds</code> property.
   */
 public void setSeconds(Integer seconds) {
    this.seconds = seconds;
  }

  /**
   * Sets the <code>seconds</code> property.
   */
  public UsageTimeBucketResultInner seconds(Integer seconds) {
    this.seconds = seconds;
    return this;
  }

 /**
  * The vector stores usage in bytes.
  * @return usageBytes
  */
  @JsonProperty("usage_bytes")
  @NotNull
  public Integer getUsageBytes() {
    return usageBytes;
  }

  /**
   * Sets the <code>usageBytes</code> property.
   */
 public void setUsageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
  }

  /**
   * Sets the <code>usageBytes</code> property.
   */
  public UsageTimeBucketResultInner usageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
    return this;
  }

 /**
  * The number of code interpreter sessions.
  * @return sessions
  */
  @JsonProperty("sessions")
  @NotNull
  public Integer getSessions() {
    return sessions;
  }

  /**
   * Sets the <code>sessions</code> property.
   */
 public void setSessions(Integer sessions) {
    this.sessions = sessions;
  }

  /**
   * Sets the <code>sessions</code> property.
   */
  public UsageTimeBucketResultInner sessions(Integer sessions) {
    this.sessions = sessions;
    return this;
  }

 /**
  * Get amount
  * @return amount
  */
  @JsonProperty("amount")
  public CostsResultAmount getAmount() {
    return amount;
  }

  /**
   * Sets the <code>amount</code> property.
   */
 public void setAmount(CostsResultAmount amount) {
    this.amount = amount;
  }

  /**
   * Sets the <code>amount</code> property.
   */
  public UsageTimeBucketResultInner amount(CostsResultAmount amount) {
    this.amount = amount;
    return this;
  }

 /**
  * When &#x60;group_by&#x3D;line_item&#x60;, this field provides the line item of the grouped costs result.
  * @return lineItem
  */
  @JsonProperty("line_item")
  public String getLineItem() {
    return lineItem;
  }

  /**
   * Sets the <code>lineItem</code> property.
   */
 public void setLineItem(String lineItem) {
    this.lineItem = lineItem;
  }

  /**
   * Sets the <code>lineItem</code> property.
   */
  public UsageTimeBucketResultInner lineItem(String lineItem) {
    this.lineItem = lineItem;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

