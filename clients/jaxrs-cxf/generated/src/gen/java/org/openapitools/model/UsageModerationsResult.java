package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The aggregated moderations usage details of the specific time bucket.
 */
@ApiModel(description="The aggregated moderations usage details of the specific time bucket.")

public class UsageModerationsResult  {
  
public enum ObjectEnum {

ORGANIZATION_USAGE_MODERATIONS_RESULT(String.valueOf("organization.usage.moderations.result"));


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

  @ApiModelProperty(required = true, value = "")

  private ObjectEnum _object;

 /**
  * The aggregated number of input tokens used.
  */
  @ApiModelProperty(required = true, value = "The aggregated number of input tokens used.")

  private Integer inputTokens;

 /**
  * The count of requests made to the model.
  */
  @ApiModelProperty(required = true, value = "The count of requests made to the model.")

  private Integer numModelRequests;

 /**
  * When `group_by=project_id`, this field provides the project ID of the grouped usage result.
  */
  @ApiModelProperty(value = "When `group_by=project_id`, this field provides the project ID of the grouped usage result.")

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
   * Get _object
   * @return _object
  **/
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    if (_object == null) {
      return null;
    }
    return _object.value();
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public UsageModerationsResult _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
   * The aggregated number of input tokens used.
   * @return inputTokens
  **/
  @JsonProperty("input_tokens")
  @NotNull
  public Integer getInputTokens() {
    return inputTokens;
  }

  public void setInputTokens(Integer inputTokens) {
    this.inputTokens = inputTokens;
  }

  public UsageModerationsResult inputTokens(Integer inputTokens) {
    this.inputTokens = inputTokens;
    return this;
  }

 /**
   * The count of requests made to the model.
   * @return numModelRequests
  **/
  @JsonProperty("num_model_requests")
  @NotNull
  public Integer getNumModelRequests() {
    return numModelRequests;
  }

  public void setNumModelRequests(Integer numModelRequests) {
    this.numModelRequests = numModelRequests;
  }

  public UsageModerationsResult numModelRequests(Integer numModelRequests) {
    this.numModelRequests = numModelRequests;
    return this;
  }

 /**
   * When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result.
   * @return projectId
  **/
  @JsonProperty("project_id")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public UsageModerationsResult projectId(String projectId) {
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

  public UsageModerationsResult userId(String userId) {
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

  public UsageModerationsResult apiKeyId(String apiKeyId) {
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

  public UsageModerationsResult model(String model) {
    this.model = model;
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
    UsageModerationsResult usageModerationsResult = (UsageModerationsResult) o;
    return Objects.equals(this._object, usageModerationsResult._object) &&
        Objects.equals(this.inputTokens, usageModerationsResult.inputTokens) &&
        Objects.equals(this.numModelRequests, usageModerationsResult.numModelRequests) &&
        Objects.equals(this.projectId, usageModerationsResult.projectId) &&
        Objects.equals(this.userId, usageModerationsResult.userId) &&
        Objects.equals(this.apiKeyId, usageModerationsResult.apiKeyId) &&
        Objects.equals(this.model, usageModerationsResult.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, inputTokens, numModelRequests, projectId, userId, apiKeyId, model);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageModerationsResult {\n");
    
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    inputTokens: ").append(toIndentedString(inputTokens)).append("\n");
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

