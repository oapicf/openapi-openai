package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The aggregated images usage details of the specific time bucket.
 */

@Schema(name = "UsageImagesResult", description = "The aggregated images usage details of the specific time bucket.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UsageImagesResult implements UsageTimeBucketResultInner {

  /**
   * Gets or Sets _object
   */
  public enum ObjectEnum {
    ORGANIZATION_USAGE_IMAGES_RESULT("organization.usage.images.result");

    private final String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private ObjectEnum _object;

  private Integer images;

  private Integer numModelRequests;

  private JsonNullable<String> source = JsonNullable.<String>undefined();

  private JsonNullable<String> size = JsonNullable.<String>undefined();

  private JsonNullable<String> projectId = JsonNullable.<String>undefined();

  private JsonNullable<String> userId = JsonNullable.<String>undefined();

  private JsonNullable<String> apiKeyId = JsonNullable.<String>undefined();

  private JsonNullable<String> model = JsonNullable.<String>undefined();

  public UsageImagesResult() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UsageImagesResult(ObjectEnum _object, Integer images, Integer numModelRequests) {
    this._object = _object;
    this.images = images;
    this.numModelRequests = numModelRequests;
  }

  public UsageImagesResult _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
   */
  @NotNull 
  @Schema(name = "object", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("object")
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
   */
  @NotNull 
  @Schema(name = "images", description = "The number of images processed.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("images")
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
   */
  @NotNull 
  @Schema(name = "num_model_requests", description = "The count of requests made to the model.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("num_model_requests")
  public Integer getNumModelRequests() {
    return numModelRequests;
  }

  public void setNumModelRequests(Integer numModelRequests) {
    this.numModelRequests = numModelRequests;
  }

  public UsageImagesResult source(String source) {
    this.source = JsonNullable.of(source);
    return this;
  }

  /**
   * When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
   * @return source
   */
  
  @Schema(name = "source", description = "When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("source")
  public JsonNullable<String> getSource() {
    return source;
  }

  public void setSource(JsonNullable<String> source) {
    this.source = source;
  }

  public UsageImagesResult size(String size) {
    this.size = JsonNullable.of(size);
    return this;
  }

  /**
   * When `group_by=size`, this field provides the image size of the grouped usage result.
   * @return size
   */
  
  @Schema(name = "size", description = "When `group_by=size`, this field provides the image size of the grouped usage result.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public JsonNullable<String> getSize() {
    return size;
  }

  public void setSize(JsonNullable<String> size) {
    this.size = size;
  }

  public UsageImagesResult projectId(String projectId) {
    this.projectId = JsonNullable.of(projectId);
    return this;
  }

  /**
   * When `group_by=project_id`, this field provides the project ID of the grouped usage result.
   * @return projectId
   */
  
  @Schema(name = "project_id", description = "When `group_by=project_id`, this field provides the project ID of the grouped usage result.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("project_id")
  public JsonNullable<String> getProjectId() {
    return projectId;
  }

  public void setProjectId(JsonNullable<String> projectId) {
    this.projectId = projectId;
  }

  public UsageImagesResult userId(String userId) {
    this.userId = JsonNullable.of(userId);
    return this;
  }

  /**
   * When `group_by=user_id`, this field provides the user ID of the grouped usage result.
   * @return userId
   */
  
  @Schema(name = "user_id", description = "When `group_by=user_id`, this field provides the user ID of the grouped usage result.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_id")
  public JsonNullable<String> getUserId() {
    return userId;
  }

  public void setUserId(JsonNullable<String> userId) {
    this.userId = userId;
  }

  public UsageImagesResult apiKeyId(String apiKeyId) {
    this.apiKeyId = JsonNullable.of(apiKeyId);
    return this;
  }

  /**
   * When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
   * @return apiKeyId
   */
  
  @Schema(name = "api_key_id", description = "When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("api_key_id")
  public JsonNullable<String> getApiKeyId() {
    return apiKeyId;
  }

  public void setApiKeyId(JsonNullable<String> apiKeyId) {
    this.apiKeyId = apiKeyId;
  }

  public UsageImagesResult model(String model) {
    this.model = JsonNullable.of(model);
    return this;
  }

  /**
   * When `group_by=model`, this field provides the model name of the grouped usage result.
   * @return model
   */
  
  @Schema(name = "model", description = "When `group_by=model`, this field provides the model name of the grouped usage result.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("model")
  public JsonNullable<String> getModel() {
    return model;
  }

  public void setModel(JsonNullable<String> model) {
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
        equalsNullable(this.source, usageImagesResult.source) &&
        equalsNullable(this.size, usageImagesResult.size) &&
        equalsNullable(this.projectId, usageImagesResult.projectId) &&
        equalsNullable(this.userId, usageImagesResult.userId) &&
        equalsNullable(this.apiKeyId, usageImagesResult.apiKeyId) &&
        equalsNullable(this.model, usageImagesResult.model);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, images, numModelRequests, hashCodeNullable(source), hashCodeNullable(size), hashCodeNullable(projectId), hashCodeNullable(userId), hashCodeNullable(apiKeyId), hashCodeNullable(model));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

