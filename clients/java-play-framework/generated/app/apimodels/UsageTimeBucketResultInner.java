package apimodels;

import apimodels.CostsResult;
import apimodels.CostsResultAmount;
import apimodels.UsageAudioSpeechesResult;
import apimodels.UsageAudioTranscriptionsResult;
import apimodels.UsageCodeInterpreterSessionsResult;
import apimodels.UsageCompletionsResult;
import apimodels.UsageEmbeddingsResult;
import apimodels.UsageImagesResult;
import apimodels.UsageModerationsResult;
import apimodels.UsageVectorStoresResult;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UsageTimeBucketResultInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UsageTimeBucketResultInner   {
  /**
   * Gets or Sets _object
   */
  public enum ObjectEnum {
    ORGANIZATION_COSTS_RESULT("organization.costs.result");

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

  @JsonProperty("input_tokens")
  @NotNull

  private Integer inputTokens;

  @JsonProperty("input_cached_tokens")
  
  private Integer inputCachedTokens;

  @JsonProperty("output_tokens")
  @NotNull

  private Integer outputTokens;

  @JsonProperty("input_audio_tokens")
  
  private Integer inputAudioTokens;

  @JsonProperty("output_audio_tokens")
  
  private Integer outputAudioTokens;

  @JsonProperty("num_model_requests")
  @NotNull

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
  @NotNull

  private Integer images;

  @JsonProperty("source")
  
  private String source;

  @JsonProperty("size")
  
  private String size;

  @JsonProperty("characters")
  @NotNull

  private Integer characters;

  @JsonProperty("seconds")
  @NotNull

  private Integer seconds;

  @JsonProperty("usage_bytes")
  @NotNull

  private Integer usageBytes;

  @JsonProperty("sessions")
  @NotNull

  private Integer sessions;

  @JsonProperty("amount")
  @Valid

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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

