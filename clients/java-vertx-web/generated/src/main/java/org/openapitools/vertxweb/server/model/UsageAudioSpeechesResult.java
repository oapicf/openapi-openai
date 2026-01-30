package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The aggregated audio speeches usage details of the specific time bucket.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsageAudioSpeechesResult   {
  


  public enum ObjectEnum {
    ORGANIZATION_USAGE_AUDIO_SPEECHES_RESULT("organization.usage.audio_speeches.result");

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
  private Integer characters;
  private Integer numModelRequests;
  private String projectId;
  private String userId;
  private String apiKeyId;
  private String model;

  public UsageAudioSpeechesResult () {

  }

  public UsageAudioSpeechesResult (ObjectEnum _object, Integer characters, Integer numModelRequests, String projectId, String userId, String apiKeyId, String model) {
    this._object = _object;
    this.characters = characters;
    this.numModelRequests = numModelRequests;
    this.projectId = projectId;
    this.userId = userId;
    this.apiKeyId = apiKeyId;
    this.model = model;
  }

    
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

    
  @JsonProperty("characters")
  public Integer getCharacters() {
    return characters;
  }
  public void setCharacters(Integer characters) {
    this.characters = characters;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageAudioSpeechesResult usageAudioSpeechesResult = (UsageAudioSpeechesResult) o;
    return Objects.equals(_object, usageAudioSpeechesResult._object) &&
        Objects.equals(characters, usageAudioSpeechesResult.characters) &&
        Objects.equals(numModelRequests, usageAudioSpeechesResult.numModelRequests) &&
        Objects.equals(projectId, usageAudioSpeechesResult.projectId) &&
        Objects.equals(userId, usageAudioSpeechesResult.userId) &&
        Objects.equals(apiKeyId, usageAudioSpeechesResult.apiKeyId) &&
        Objects.equals(model, usageAudioSpeechesResult.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, characters, numModelRequests, projectId, userId, apiKeyId, model);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageAudioSpeechesResult {\n");
    
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    characters: ").append(toIndentedString(characters)).append("\n");
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
