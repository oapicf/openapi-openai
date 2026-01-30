package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;



/**
 * The aggregated moderations usage details of the specific time bucket.
 **/

@ApiModel(description = "The aggregated moderations usage details of the specific time bucket.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UsageModerationsResult   {
  /**
   * Gets or Sets _object
   */
  public enum ObjectEnum {
    ORGANIZATION_USAGE_MODERATIONS_RESULT("organization.usage.moderations.result");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ObjectEnum fromValue(String text) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("object")
  private ObjectEnum _object;

  @JsonProperty("input_tokens")
  private Integer inputTokens;

  @JsonProperty("num_model_requests")
  private Integer numModelRequests;

  @JsonProperty("project_id")
  private String projectId;

  @JsonProperty("user_id")
  private String userId;

  @JsonProperty("api_key_id")
  private String apiKeyId;

  @JsonProperty("model")
  private String model;

  /**
   **/
  public UsageModerationsResult _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * The aggregated number of input tokens used.
   **/
  public UsageModerationsResult inputTokens(Integer inputTokens) {
    this.inputTokens = inputTokens;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The aggregated number of input tokens used.")
  @JsonProperty("input_tokens")
  public Integer getInputTokens() {
    return inputTokens;
  }
  public void setInputTokens(Integer inputTokens) {
    this.inputTokens = inputTokens;
  }

  /**
   * The count of requests made to the model.
   **/
  public UsageModerationsResult numModelRequests(Integer numModelRequests) {
    this.numModelRequests = numModelRequests;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The count of requests made to the model.")
  @JsonProperty("num_model_requests")
  public Integer getNumModelRequests() {
    return numModelRequests;
  }
  public void setNumModelRequests(Integer numModelRequests) {
    this.numModelRequests = numModelRequests;
  }

  /**
   * When `group_by=project_id`, this field provides the project ID of the grouped usage result.
   **/
  public UsageModerationsResult projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  
  @ApiModelProperty(value = "When `group_by=project_id`, this field provides the project ID of the grouped usage result.")
  @JsonProperty("project_id")
  public String getProjectId() {
    return projectId;
  }
  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  /**
   * When `group_by=user_id`, this field provides the user ID of the grouped usage result.
   **/
  public UsageModerationsResult userId(String userId) {
    this.userId = userId;
    return this;
  }

  
  @ApiModelProperty(value = "When `group_by=user_id`, this field provides the user ID of the grouped usage result.")
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   * When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
   **/
  public UsageModerationsResult apiKeyId(String apiKeyId) {
    this.apiKeyId = apiKeyId;
    return this;
  }

  
  @ApiModelProperty(value = "When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.")
  @JsonProperty("api_key_id")
  public String getApiKeyId() {
    return apiKeyId;
  }
  public void setApiKeyId(String apiKeyId) {
    this.apiKeyId = apiKeyId;
  }

  /**
   * When `group_by=model`, this field provides the model name of the grouped usage result.
   **/
  public UsageModerationsResult model(String model) {
    this.model = model;
    return this;
  }

  
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
    UsageModerationsResult usageModerationsResult = (UsageModerationsResult) o;
    return Objects.equals(_object, usageModerationsResult._object) &&
        Objects.equals(inputTokens, usageModerationsResult.inputTokens) &&
        Objects.equals(numModelRequests, usageModerationsResult.numModelRequests) &&
        Objects.equals(projectId, usageModerationsResult.projectId) &&
        Objects.equals(userId, usageModerationsResult.userId) &&
        Objects.equals(apiKeyId, usageModerationsResult.apiKeyId) &&
        Objects.equals(model, usageModerationsResult.model);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

