package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="The aggregated audio transcriptions usage details of the specific time bucket.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UsageAudioTranscriptionsResult   {
  

  /**
   * Gets or Sets _object
   */
  public enum ObjectEnum {
    ORGANIZATION_USAGE_AUDIO_TRANSCRIPTIONS_RESULT("organization.usage.audio_transcriptions.result");
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
  private Integer seconds;
  private Integer numModelRequests;
  private String projectId;
  private String userId;
  private String apiKeyId;
  private String model;

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
   * When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result.
   **/
  
  @ApiModelProperty(value = "When `group_by=project_id`, this field provides the project ID of the grouped usage result.")
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

