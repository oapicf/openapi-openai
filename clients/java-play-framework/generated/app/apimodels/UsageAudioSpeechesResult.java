package apimodels;

import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * The aggregated audio speeches usage details of the specific time bucket.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UsageAudioSpeechesResult   {
  /**
   * Gets or Sets _object
   */
  public enum ObjectEnum {
    ORGANIZATION_USAGE_AUDIO_SPEECHES_RESULT("organization.usage.audio_speeches.result");

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

  @JsonProperty("characters")
  @NotNull

  private Integer characters;

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

  public UsageAudioSpeechesResult _object(ObjectEnum _object) {
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

  public UsageAudioSpeechesResult characters(Integer characters) {
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

  public UsageAudioSpeechesResult numModelRequests(Integer numModelRequests) {
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

  public UsageAudioSpeechesResult projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * When `group_by=project_id`, this field provides the project ID of the grouped usage result.
   * @return projectId
  **/
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public UsageAudioSpeechesResult userId(String userId) {
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

  public UsageAudioSpeechesResult apiKeyId(String apiKeyId) {
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

  public UsageAudioSpeechesResult model(String model) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

