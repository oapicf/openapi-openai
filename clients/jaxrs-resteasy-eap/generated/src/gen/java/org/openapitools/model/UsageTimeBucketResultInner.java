package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("object")
  @NotNull
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * The aggregated number of input tokens used.
   **/
  
  @ApiModelProperty(required = true, value = "The aggregated number of input tokens used.")
  @JsonProperty("input_tokens")
  @NotNull
  public Integer getInputTokens() {
    return inputTokens;
  }
  public void setInputTokens(Integer inputTokens) {
    this.inputTokens = inputTokens;
  }

  /**
   * The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
   **/
  
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
   **/
  
  @ApiModelProperty(required = true, value = "The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.")
  @JsonProperty("output_tokens")
  @NotNull
  public Integer getOutputTokens() {
    return outputTokens;
  }
  public void setOutputTokens(Integer outputTokens) {
    this.outputTokens = outputTokens;
  }

  /**
   * The aggregated number of audio input tokens used, including cached tokens.
   **/
  
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
   **/
  
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
   **/
  
  @ApiModelProperty(required = true, value = "The count of requests made to the model.")
  @JsonProperty("num_model_requests")
  @NotNull
  public Integer getNumModelRequests() {
    return numModelRequests;
  }
  public void setNumModelRequests(Integer numModelRequests) {
    this.numModelRequests = numModelRequests;
  }

  /**
   * When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped costs result.
   **/
  
  @ApiModelProperty(value = "When `group_by=project_id`, this field provides the project ID of the grouped costs result.")
  @JsonProperty("project_id")
  public String getProjectId() {
    return projectId;
  }
  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  /**
   * When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result.
   **/
  
  @ApiModelProperty(value = "When `group_by=user_id`, this field provides the user ID of the grouped usage result.")
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   * When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result.
   **/
  
  @ApiModelProperty(value = "When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.")
  @JsonProperty("api_key_id")
  public String getApiKeyId() {
    return apiKeyId;
  }
  public void setApiKeyId(String apiKeyId) {
    this.apiKeyId = apiKeyId;
  }

  /**
   * When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result.
   **/
  
  @ApiModelProperty(value = "When `group_by=model`, this field provides the model name of the grouped usage result.")
  @JsonProperty("model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  /**
   * When &#x60;group_by&#x3D;batch&#x60;, this field tells whether the grouped usage result is batch or not.
   **/
  
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
   **/
  
  @ApiModelProperty(required = true, value = "The number of images processed.")
  @JsonProperty("images")
  @NotNull
  public Integer getImages() {
    return images;
  }
  public void setImages(Integer images) {
    this.images = images;
  }

  /**
   * When &#x60;group_by&#x3D;source&#x60;, this field provides the source of the grouped usage result, possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60;.
   **/
  
  @ApiModelProperty(value = "When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  /**
   * When &#x60;group_by&#x3D;size&#x60;, this field provides the image size of the grouped usage result.
   **/
  
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
   **/
  
  @ApiModelProperty(required = true, value = "The number of characters processed.")
  @JsonProperty("characters")
  @NotNull
  public Integer getCharacters() {
    return characters;
  }
  public void setCharacters(Integer characters) {
    this.characters = characters;
  }

  /**
   * The number of seconds processed.
   **/
  
  @ApiModelProperty(required = true, value = "The number of seconds processed.")
  @JsonProperty("seconds")
  @NotNull
  public Integer getSeconds() {
    return seconds;
  }
  public void setSeconds(Integer seconds) {
    this.seconds = seconds;
  }

  /**
   * The vector stores usage in bytes.
   **/
  
  @ApiModelProperty(required = true, value = "The vector stores usage in bytes.")
  @JsonProperty("usage_bytes")
  @NotNull
  public Integer getUsageBytes() {
    return usageBytes;
  }
  public void setUsageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
  }

  /**
   * The number of code interpreter sessions.
   **/
  
  @ApiModelProperty(required = true, value = "The number of code interpreter sessions.")
  @JsonProperty("sessions")
  @NotNull
  public Integer getSessions() {
    return sessions;
  }
  public void setSessions(Integer sessions) {
    this.sessions = sessions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("amount")
  public CostsResultAmount getAmount() {
    return amount;
  }
  public void setAmount(CostsResultAmount amount) {
    this.amount = amount;
  }

  /**
   * When &#x60;group_by&#x3D;line_item&#x60;, this field provides the line item of the grouped costs result.
   **/
  
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

