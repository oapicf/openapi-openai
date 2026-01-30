package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The aggregated images usage details of the specific time bucket.
 */
@ApiModel(description="The aggregated images usage details of the specific time bucket.")

public class UsageImagesResult  {
  
public enum ObjectEnum {

ORGANIZATION_USAGE_IMAGES_RESULT(String.valueOf("organization.usage.images.result"));


    private String value;

    ObjectEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

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
  * The number of images processed.
  */
  @ApiModelProperty(required = true, value = "The number of images processed.")

  private Integer images;

 /**
  * The count of requests made to the model.
  */
  @ApiModelProperty(required = true, value = "The count of requests made to the model.")

  private Integer numModelRequests;

 /**
  * When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
  */
  @ApiModelProperty(value = "When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.")

  private String source;

 /**
  * When `group_by=size`, this field provides the image size of the grouped usage result.
  */
  @ApiModelProperty(value = "When `group_by=size`, this field provides the image size of the grouped usage result.")

  private String size;

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
  public String getObject() {
    if (_object == null) {
      return null;
    }
    return _object.value();
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public UsageImagesResult _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
   * The number of images processed.
   * @return images
  **/
  @JsonProperty("images")
  public Integer getImages() {
    return images;
  }

  public void setImages(Integer images) {
    this.images = images;
  }

  public UsageImagesResult images(Integer images) {
    this.images = images;
    return this;
  }

 /**
   * The count of requests made to the model.
   * @return numModelRequests
  **/
  @JsonProperty("num_model_requests")
  public Integer getNumModelRequests() {
    return numModelRequests;
  }

  public void setNumModelRequests(Integer numModelRequests) {
    this.numModelRequests = numModelRequests;
  }

  public UsageImagesResult numModelRequests(Integer numModelRequests) {
    this.numModelRequests = numModelRequests;
    return this;
  }

 /**
   * When &#x60;group_by&#x3D;source&#x60;, this field provides the source of the grouped usage result, possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60;.
   * @return source
  **/
  @JsonProperty("source")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public UsageImagesResult source(String source) {
    this.source = source;
    return this;
  }

 /**
   * When &#x60;group_by&#x3D;size&#x60;, this field provides the image size of the grouped usage result.
   * @return size
  **/
  @JsonProperty("size")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public UsageImagesResult size(String size) {
    this.size = size;
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

  public UsageImagesResult projectId(String projectId) {
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

  public UsageImagesResult userId(String userId) {
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

  public UsageImagesResult apiKeyId(String apiKeyId) {
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

  public UsageImagesResult model(String model) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

