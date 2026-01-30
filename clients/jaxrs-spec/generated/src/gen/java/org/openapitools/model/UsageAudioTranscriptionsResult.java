package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The aggregated audio transcriptions usage details of the specific time bucket.
 **/
@ApiModel(description = "The aggregated audio transcriptions usage details of the specific time bucket.")
@JsonTypeName("UsageAudioTranscriptionsResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UsageAudioTranscriptionsResult   {
  public enum ObjectEnum {

    ORGANIZATION_USAGE_AUDIO_TRANSCRIPTIONS_RESULT(String.valueOf("organization.usage.audio_transcriptions.result"));


    private String value;

    ObjectEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ObjectEnum fromString(String s) {
        for (ObjectEnum b : ObjectEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private ObjectEnum _object;
  private Integer seconds;
  private Integer numModelRequests;
  private String projectId;
  private String userId;
  private String apiKeyId;
  private String model;

  public UsageAudioTranscriptionsResult() {
  }

  @JsonCreator
  public UsageAudioTranscriptionsResult(
    @JsonProperty(required = true, value = "object") ObjectEnum _object,
    @JsonProperty(required = true, value = "seconds") Integer seconds,
    @JsonProperty(required = true, value = "num_model_requests") Integer numModelRequests
  ) {
    this._object = _object;
    this.seconds = seconds;
    this.numModelRequests = numModelRequests;
  }

  /**
   **/
  public UsageAudioTranscriptionsResult _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "object")
  @NotNull public ObjectEnum getObject() {
    return _object;
  }

  @JsonProperty(required = true, value = "object")
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * The number of seconds processed.
   **/
  public UsageAudioTranscriptionsResult seconds(Integer seconds) {
    this.seconds = seconds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The number of seconds processed.")
  @JsonProperty(required = true, value = "seconds")
  @NotNull public Integer getSeconds() {
    return seconds;
  }

  @JsonProperty(required = true, value = "seconds")
  public void setSeconds(Integer seconds) {
    this.seconds = seconds;
  }

  /**
   * The count of requests made to the model.
   **/
  public UsageAudioTranscriptionsResult numModelRequests(Integer numModelRequests) {
    this.numModelRequests = numModelRequests;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The count of requests made to the model.")
  @JsonProperty(required = true, value = "num_model_requests")
  @NotNull public Integer getNumModelRequests() {
    return numModelRequests;
  }

  @JsonProperty(required = true, value = "num_model_requests")
  public void setNumModelRequests(Integer numModelRequests) {
    this.numModelRequests = numModelRequests;
  }

  /**
   * When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result.
   **/
  public UsageAudioTranscriptionsResult projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  
  @ApiModelProperty(value = "When `group_by=project_id`, this field provides the project ID of the grouped usage result.")
  @JsonProperty("project_id")
  public String getProjectId() {
    return projectId;
  }

  @JsonProperty("project_id")
  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  /**
   * When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result.
   **/
  public UsageAudioTranscriptionsResult userId(String userId) {
    this.userId = userId;
    return this;
  }

  
  @ApiModelProperty(value = "When `group_by=user_id`, this field provides the user ID of the grouped usage result.")
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }

  @JsonProperty("user_id")
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   * When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result.
   **/
  public UsageAudioTranscriptionsResult apiKeyId(String apiKeyId) {
    this.apiKeyId = apiKeyId;
    return this;
  }

  
  @ApiModelProperty(value = "When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.")
  @JsonProperty("api_key_id")
  public String getApiKeyId() {
    return apiKeyId;
  }

  @JsonProperty("api_key_id")
  public void setApiKeyId(String apiKeyId) {
    this.apiKeyId = apiKeyId;
  }

  /**
   * When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result.
   **/
  public UsageAudioTranscriptionsResult model(String model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(value = "When `group_by=model`, this field provides the model name of the grouped usage result.")
  @JsonProperty("model")
  public String getModel() {
    return model;
  }

  @JsonProperty("model")
  public void setModel(String model) {
    this.model = model;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageAudioTranscriptionsResult usageAudioTranscriptionsResult = (UsageAudioTranscriptionsResult) o;
    return Objects.equals(this._object, usageAudioTranscriptionsResult._object) &&
        Objects.equals(this.seconds, usageAudioTranscriptionsResult.seconds) &&
        Objects.equals(this.numModelRequests, usageAudioTranscriptionsResult.numModelRequests) &&
        Objects.equals(this.projectId, usageAudioTranscriptionsResult.projectId) &&
        Objects.equals(this.userId, usageAudioTranscriptionsResult.userId) &&
        Objects.equals(this.apiKeyId, usageAudioTranscriptionsResult.apiKeyId) &&
        Objects.equals(this.model, usageAudioTranscriptionsResult.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, seconds, numModelRequests, projectId, userId, apiKeyId, model);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageAudioTranscriptionsResult {\n");
    
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
    sb.append("    numModelRequests: ").append(toIndentedString(numModelRequests)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    apiKeyId: ").append(toIndentedString(apiKeyId)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
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

