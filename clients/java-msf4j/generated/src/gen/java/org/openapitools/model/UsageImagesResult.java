package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The aggregated images usage details of the specific time bucket.
 */
@ApiModel(description = "The aggregated images usage details of the specific time bucket.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UsageImagesResult   {
  /**
   * Gets or Sets _object
   */
  public enum ObjectEnum {
    ORGANIZATION_USAGE_IMAGES_RESULT("organization.usage.images.result");

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

  @JsonProperty("images")
  private Integer images;

  @JsonProperty("num_model_requests")
  private Integer numModelRequests;

  @JsonProperty("source")
  private String source;

  @JsonProperty("size")
  private String size;

  @JsonProperty("project_id")
  private String projectId;

  @JsonProperty("user_id")
  private String userId;

  @JsonProperty("api_key_id")
  private String apiKeyId;

  @JsonProperty("model")
  private String model;

  public UsageImagesResult _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @ApiModelProperty(required = true, value = "")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public UsageImagesResult images(Integer images) {
    this.images = images;
    return this;
  }

   /**
   * The number of images processed.
   * @return images
  **/
  @ApiModelProperty(required = true, value = "The number of images processed.")
  public Integer getImages() {
    return images;
  }

  public void setImages(Integer images) {
    this.images = images;
  }

  public UsageImagesResult numModelRequests(Integer numModelRequests) {
    this.numModelRequests = numModelRequests;
    return this;
  }

   /**
   * The count of requests made to the model.
   * @return numModelRequests
  **/
  @ApiModelProperty(required = true, value = "The count of requests made to the model.")
  public Integer getNumModelRequests() {
    return numModelRequests;
  }

  public void setNumModelRequests(Integer numModelRequests) {
    this.numModelRequests = numModelRequests;
  }

  public UsageImagesResult source(String source) {
    this.source = source;
    return this;
  }

   /**
   * When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
   * @return source
  **/
  @ApiModelProperty(value = "When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public UsageImagesResult size(String size) {
    this.size = size;
    return this;
  }

   /**
   * When `group_by=size`, this field provides the image size of the grouped usage result.
   * @return size
  **/
  @ApiModelProperty(value = "When `group_by=size`, this field provides the image size of the grouped usage result.")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public UsageImagesResult projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * When `group_by=project_id`, this field provides the project ID of the grouped usage result.
   * @return projectId
  **/
  @ApiModelProperty(value = "When `group_by=project_id`, this field provides the project ID of the grouped usage result.")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public UsageImagesResult userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * When `group_by=user_id`, this field provides the user ID of the grouped usage result.
   * @return userId
  **/
  @ApiModelProperty(value = "When `group_by=user_id`, this field provides the user ID of the grouped usage result.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public UsageImagesResult apiKeyId(String apiKeyId) {
    this.apiKeyId = apiKeyId;
    return this;
  }

   /**
   * When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
   * @return apiKeyId
  **/
  @ApiModelProperty(value = "When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.")
  public String getApiKeyId() {
    return apiKeyId;
  }

  public void setApiKeyId(String apiKeyId) {
    this.apiKeyId = apiKeyId;
  }

  public UsageImagesResult model(String model) {
    this.model = model;
    return this;
  }

   /**
   * When `group_by=model`, this field provides the model name of the grouped usage result.
   * @return model
  **/
  @ApiModelProperty(value = "When `group_by=model`, this field provides the model name of the grouped usage result.")
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
    return Objects.equals(this._object, usageImagesResult._object) &&
        Objects.equals(this.images, usageImagesResult.images) &&
        Objects.equals(this.numModelRequests, usageImagesResult.numModelRequests) &&
        Objects.equals(this.source, usageImagesResult.source) &&
        Objects.equals(this.size, usageImagesResult.size) &&
        Objects.equals(this.projectId, usageImagesResult.projectId) &&
        Objects.equals(this.userId, usageImagesResult.userId) &&
        Objects.equals(this.apiKeyId, usageImagesResult.apiKeyId) &&
        Objects.equals(this.model, usageImagesResult.model);
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

