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
 * The aggregated images usage details of the specific time bucket.
 **/
@ApiModel(description = "The aggregated images usage details of the specific time bucket.")
@JsonTypeName("UsageImagesResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UsageImagesResult   {
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
  private Integer images;
  private Integer numModelRequests;
  private String source;
  private String size;
  private String projectId;
  private String userId;
  private String apiKeyId;
  private String model;

  public UsageImagesResult() {
  }

  @JsonCreator
  public UsageImagesResult(
    @JsonProperty(required = true, value = "object") ObjectEnum _object,
    @JsonProperty(required = true, value = "images") Integer images,
    @JsonProperty(required = true, value = "num_model_requests") Integer numModelRequests
  ) {
    this._object = _object;
    this.images = images;
    this.numModelRequests = numModelRequests;
  }

  /**
   **/
  public UsageImagesResult _object(ObjectEnum _object) {
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
   * The number of images processed.
   **/
  public UsageImagesResult images(Integer images) {
    this.images = images;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The number of images processed.")
  @JsonProperty(required = true, value = "images")
  @NotNull public Integer getImages() {
    return images;
  }

  @JsonProperty(required = true, value = "images")
  public void setImages(Integer images) {
    this.images = images;
  }

  /**
   * The count of requests made to the model.
   **/
  public UsageImagesResult numModelRequests(Integer numModelRequests) {
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
   * When &#x60;group_by&#x3D;source&#x60;, this field provides the source of the grouped usage result, possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60;.
   **/
  public UsageImagesResult source(String source) {
    this.source = source;
    return this;
  }

  
  @ApiModelProperty(value = "When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }

  @JsonProperty("source")
  public void setSource(String source) {
    this.source = source;
  }

  /**
   * When &#x60;group_by&#x3D;size&#x60;, this field provides the image size of the grouped usage result.
   **/
  public UsageImagesResult size(String size) {
    this.size = size;
    return this;
  }

  
  @ApiModelProperty(value = "When `group_by=size`, this field provides the image size of the grouped usage result.")
  @JsonProperty("size")
  public String getSize() {
    return size;
  }

  @JsonProperty("size")
  public void setSize(String size) {
    this.size = size;
  }

  /**
   * When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result.
   **/
  public UsageImagesResult projectId(String projectId) {
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
  public UsageImagesResult userId(String userId) {
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
  public UsageImagesResult apiKeyId(String apiKeyId) {
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
  public UsageImagesResult model(String model) {
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

