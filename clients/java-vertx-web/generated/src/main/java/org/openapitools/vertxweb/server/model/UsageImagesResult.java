package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The aggregated images usage details of the specific time bucket.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsageImagesResult   {
  


  public enum ObjectEnum {
    ORGANIZATION_USAGE_IMAGES_RESULT("organization.usage.images.result");

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
  private Integer images;
  private Integer numModelRequests;
  private String source;
  private String size;
  private String projectId;
  private String userId;
  private String apiKeyId;
  private String model;

  public UsageImagesResult () {

  }

  public UsageImagesResult (ObjectEnum _object, Integer images, Integer numModelRequests, String source, String size, String projectId, String userId, String apiKeyId, String model) {
    this._object = _object;
    this.images = images;
    this.numModelRequests = numModelRequests;
    this.source = source;
    this.size = size;
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

    
  @JsonProperty("images")
  public Integer getImages() {
    return images;
  }
  public void setImages(Integer images) {
    this.images = images;
  }

    
  @JsonProperty("num_model_requests")
  public Integer getNumModelRequests() {
    return numModelRequests;
  }
  public void setNumModelRequests(Integer numModelRequests) {
    this.numModelRequests = numModelRequests;
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
    UsageImagesResult usageImagesResult = (UsageImagesResult) o;
    return Objects.equals(_object, usageImagesResult._object) &&
        Objects.equals(images, usageImagesResult.images) &&
        Objects.equals(numModelRequests, usageImagesResult.numModelRequests) &&
        Objects.equals(source, usageImagesResult.source) &&
        Objects.equals(size, usageImagesResult.size) &&
        Objects.equals(projectId, usageImagesResult.projectId) &&
        Objects.equals(userId, usageImagesResult.userId) &&
        Objects.equals(apiKeyId, usageImagesResult.apiKeyId) &&
        Objects.equals(model, usageImagesResult.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, images, numModelRequests, source, size, projectId, userId, apiKeyId, model);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageImagesResult {\n");
    
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    numModelRequests: ").append(toIndentedString(numModelRequests)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
