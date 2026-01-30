package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CostsResult;
import org.openapitools.vertxweb.server.model.CostsResultAmount;
import org.openapitools.vertxweb.server.model.UsageAudioSpeechesResult;
import org.openapitools.vertxweb.server.model.UsageAudioTranscriptionsResult;
import org.openapitools.vertxweb.server.model.UsageCodeInterpreterSessionsResult;
import org.openapitools.vertxweb.server.model.UsageCompletionsResult;
import org.openapitools.vertxweb.server.model.UsageEmbeddingsResult;
import org.openapitools.vertxweb.server.model.UsageImagesResult;
import org.openapitools.vertxweb.server.model.UsageModerationsResult;
import org.openapitools.vertxweb.server.model.UsageVectorStoresResult;

@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public UsageTimeBucketResultInner () {

  }

  public UsageTimeBucketResultInner (ObjectEnum _object, Integer inputTokens, Integer inputCachedTokens, Integer outputTokens, Integer inputAudioTokens, Integer outputAudioTokens, Integer numModelRequests, String projectId, String userId, String apiKeyId, String model, Boolean batch, Integer images, String source, String size, Integer characters, Integer seconds, Integer usageBytes, Integer sessions, CostsResultAmount amount, String lineItem) {
    this._object = _object;
    this.inputTokens = inputTokens;
    this.inputCachedTokens = inputCachedTokens;
    this.outputTokens = outputTokens;
    this.inputAudioTokens = inputAudioTokens;
    this.outputAudioTokens = outputAudioTokens;
    this.numModelRequests = numModelRequests;
    this.projectId = projectId;
    this.userId = userId;
    this.apiKeyId = apiKeyId;
    this.model = model;
    this.batch = batch;
    this.images = images;
    this.source = source;
    this.size = size;
    this.characters = characters;
    this.seconds = seconds;
    this.usageBytes = usageBytes;
    this.sessions = sessions;
    this.amount = amount;
    this.lineItem = lineItem;
  }

    
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

    
  @JsonProperty("input_tokens")
  public Integer getInputTokens() {
    return inputTokens;
  }
  public void setInputTokens(Integer inputTokens) {
    this.inputTokens = inputTokens;
  }

    
  @JsonProperty("input_cached_tokens")
  public Integer getInputCachedTokens() {
    return inputCachedTokens;
  }
  public void setInputCachedTokens(Integer inputCachedTokens) {
    this.inputCachedTokens = inputCachedTokens;
  }

    
  @JsonProperty("output_tokens")
  public Integer getOutputTokens() {
    return outputTokens;
  }
  public void setOutputTokens(Integer outputTokens) {
    this.outputTokens = outputTokens;
  }

    
  @JsonProperty("input_audio_tokens")
  public Integer getInputAudioTokens() {
    return inputAudioTokens;
  }
  public void setInputAudioTokens(Integer inputAudioTokens) {
    this.inputAudioTokens = inputAudioTokens;
  }

    
  @JsonProperty("output_audio_tokens")
  public Integer getOutputAudioTokens() {
    return outputAudioTokens;
  }
  public void setOutputAudioTokens(Integer outputAudioTokens) {
    this.outputAudioTokens = outputAudioTokens;
  }

    
  @JsonProperty("num_model_requests")
  public Integer getNumModelRequests() {
    return numModelRequests;
  }
  public void setNumModelRequests(Integer numModelRequests) {
    this.numModelRequests = numModelRequests;
  }

    
  @JsonProperty("project_id")
  public String getProjectId() {
    return projectId;
  }
  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

    
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

    
  @JsonProperty("api_key_id")
  public String getApiKeyId() {
    return apiKeyId;
  }
  public void setApiKeyId(String apiKeyId) {
    this.apiKeyId = apiKeyId;
  }

    
  @JsonProperty("model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

    
  @JsonProperty("batch")
  public Boolean getBatch() {
    return batch;
  }
  public void setBatch(Boolean batch) {
    this.batch = batch;
  }

    
  @JsonProperty("images")
  public Integer getImages() {
    return images;
  }
  public void setImages(Integer images) {
    this.images = images;
  }

    
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

    
  @JsonProperty("size")
  public String getSize() {
    return size;
  }
  public void setSize(String size) {
    this.size = size;
  }

    
  @JsonProperty("characters")
  public Integer getCharacters() {
    return characters;
  }
  public void setCharacters(Integer characters) {
    this.characters = characters;
  }

    
  @JsonProperty("seconds")
  public Integer getSeconds() {
    return seconds;
  }
  public void setSeconds(Integer seconds) {
    this.seconds = seconds;
  }

    
  @JsonProperty("usage_bytes")
  public Integer getUsageBytes() {
    return usageBytes;
  }
  public void setUsageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
  }

    
  @JsonProperty("sessions")
  public Integer getSessions() {
    return sessions;
  }
  public void setSessions(Integer sessions) {
    this.sessions = sessions;
  }

    
  @JsonProperty("amount")
  public CostsResultAmount getAmount() {
    return amount;
  }
  public void setAmount(CostsResultAmount amount) {
    this.amount = amount;
  }

    
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
