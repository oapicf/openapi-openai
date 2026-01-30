package org.openapitools.model;

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

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UsageTimeBucketResultInner  {
  
public enum ObjectEnum {

ORGANIZATION_COSTS_RESULT(String.valueOf("organization.costs.result"));


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

  private CostsResultAmount amount;

 /**
  * When `group_by=line_item`, this field provides the line item of the grouped costs result.
  */
  @ApiModelProperty(value = "When `group_by=line_item`, this field provides the line item of the grouped costs result.")

  private String lineItem;
 /**
   * Get _object
   * @return _object
  **/
  @JsonProperty("object")
  public String getObject() {
    if (_object == null) {
      return null;
    }
    return _object.value();
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public UsageTimeBucketResultInner _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
   * The aggregated number of input tokens used.
   * @return inputTokens
  **/
  @JsonProperty("input_tokens")
  public Integer getInputTokens() {
    return inputTokens;
  }

  public void setInputTokens(Integer inputTokens) {
    this.inputTokens = inputTokens;
  }

  public UsageTimeBucketResultInner inputTokens(Integer inputTokens) {
    this.inputTokens = inputTokens;
    return this;
  }

 /**
   * The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
   * @return inputCachedTokens
  **/
  @JsonProperty("input_cached_tokens")
  public Integer getInputCachedTokens() {
    return inputCachedTokens;
  }

  public void setInputCachedTokens(Integer inputCachedTokens) {
    this.inputCachedTokens = inputCachedTokens;
  }

  public UsageTimeBucketResultInner inputCachedTokens(Integer inputCachedTokens) {
    this.inputCachedTokens = inputCachedTokens;
    return this;
  }

 /**
   * The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
   * @return outputTokens
  **/
  @JsonProperty("output_tokens")
  public Integer getOutputTokens() {
    return outputTokens;
  }

  public void setOutputTokens(Integer outputTokens) {
    this.outputTokens = outputTokens;
  }

  public UsageTimeBucketResultInner outputTokens(Integer outputTokens) {
    this.outputTokens = outputTokens;
    return this;
  }

 /**
   * The aggregated number of audio input tokens used, including cached tokens.
   * @return inputAudioTokens
  **/
  @JsonProperty("input_audio_tokens")
  public Integer getInputAudioTokens() {
    return inputAudioTokens;
  }

  public void setInputAudioTokens(Integer inputAudioTokens) {
    this.inputAudioTokens = inputAudioTokens;
  }

  public UsageTimeBucketResultInner inputAudioTokens(Integer inputAudioTokens) {
    this.inputAudioTokens = inputAudioTokens;
    return this;
  }

 /**
   * The aggregated number of audio output tokens used.
   * @return outputAudioTokens
  **/
  @JsonProperty("output_audio_tokens")
  public Integer getOutputAudioTokens() {
    return outputAudioTokens;
  }

  public void setOutputAudioTokens(Integer outputAudioTokens) {
    this.outputAudioTokens = outputAudioTokens;
  }

  public UsageTimeBucketResultInner outputAudioTokens(Integer outputAudioTokens) {
    this.outputAudioTokens = outputAudioTokens;
    return this;
  }

 /**
   * The count of requests made to the model.
   * @return numModelRequests
  **/
  @JsonProperty("num_model_requests")
  public Integer getNumModelRequests() {
    return numModelRequests;
  }

  public void setNumModelRequests(Integer numModelRequests) {
    this.numModelRequests = numModelRequests;
  }

  public UsageTimeBucketResultInner numModelRequests(Integer numModelRequests) {
    this.numModelRequests = numModelRequests;
    return this;
  }

 /**
   * When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped costs result.
   * @return projectId
  **/
  @JsonProperty("project_id")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public UsageTimeBucketResultInner projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

 /**
   * When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result.
   * @return userId
  **/
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public UsageTimeBucketResultInner userId(String userId) {
    this.userId = userId;
    return this;
  }

 /**
   * When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result.
   * @return apiKeyId
  **/
  @JsonProperty("api_key_id")
  public String getApiKeyId() {
    return apiKeyId;
  }

  public void setApiKeyId(String apiKeyId) {
    this.apiKeyId = apiKeyId;
  }

  public UsageTimeBucketResultInner apiKeyId(String apiKeyId) {
    this.apiKeyId = apiKeyId;
    return this;
  }

 /**
   * When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result.
   * @return model
  **/
  @JsonProperty("model")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public UsageTimeBucketResultInner model(String model) {
    this.model = model;
    return this;
  }

 /**
   * When &#x60;group_by&#x3D;batch&#x60;, this field tells whether the grouped usage result is batch or not.
   * @return batch
  **/
  @JsonProperty("batch")
  public Boolean getBatch() {
    return batch;
  }

  public void setBatch(Boolean batch) {
    this.batch = batch;
  }

  public UsageTimeBucketResultInner batch(Boolean batch) {
    this.batch = batch;
    return this;
  }

 /**
   * The number of images processed.
   * @return images
  **/
  @JsonProperty("images")
  public Integer getImages() {
    return images;
  }

  public void setImages(Integer images) {
    this.images = images;
  }

  public UsageTimeBucketResultInner images(Integer images) {
    this.images = images;
    return this;
  }

 /**
   * When &#x60;group_by&#x3D;source&#x60;, this field provides the source of the grouped usage result, possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60;.
   * @return source
  **/
  @JsonProperty("source")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public UsageTimeBucketResultInner source(String source) {
    this.source = source;
    return this;
  }

 /**
   * When &#x60;group_by&#x3D;size&#x60;, this field provides the image size of the grouped usage result.
   * @return size
  **/
  @JsonProperty("size")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public UsageTimeBucketResultInner size(String size) {
    this.size = size;
    return this;
  }

 /**
   * The number of characters processed.
   * @return characters
  **/
  @JsonProperty("characters")
  public Integer getCharacters() {
    return characters;
  }

  public void setCharacters(Integer characters) {
    this.characters = characters;
  }

  public UsageTimeBucketResultInner characters(Integer characters) {
    this.characters = characters;
    return this;
  }

 /**
   * The number of seconds processed.
   * @return seconds
  **/
  @JsonProperty("seconds")
  public Integer getSeconds() {
    return seconds;
  }

  public void setSeconds(Integer seconds) {
    this.seconds = seconds;
  }

  public UsageTimeBucketResultInner seconds(Integer seconds) {
    this.seconds = seconds;
    return this;
  }

 /**
   * The vector stores usage in bytes.
   * @return usageBytes
  **/
  @JsonProperty("usage_bytes")
  public Integer getUsageBytes() {
    return usageBytes;
  }

  public void setUsageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
  }

  public UsageTimeBucketResultInner usageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
    return this;
  }

 /**
   * The number of code interpreter sessions.
   * @return sessions
  **/
  @JsonProperty("sessions")
  public Integer getSessions() {
    return sessions;
  }

  public void setSessions(Integer sessions) {
    this.sessions = sessions;
  }

  public UsageTimeBucketResultInner sessions(Integer sessions) {
    this.sessions = sessions;
    return this;
  }

 /**
   * Get amount
   * @return amount
  **/
  @JsonProperty("amount")
  public CostsResultAmount getAmount() {
    return amount;
  }

  public void setAmount(CostsResultAmount amount) {
    this.amount = amount;
  }

  public UsageTimeBucketResultInner amount(CostsResultAmount amount) {
    this.amount = amount;
    return this;
  }

 /**
   * When &#x60;group_by&#x3D;line_item&#x60;, this field provides the line item of the grouped costs result.
   * @return lineItem
  **/
  @JsonProperty("line_item")
  public String getLineItem() {
    return lineItem;
  }

  public void setLineItem(String lineItem) {
    this.lineItem = lineItem;
  }

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

