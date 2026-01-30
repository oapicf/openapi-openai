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
 * The aggregated vector stores usage details of the specific time bucket.
 */

@Schema(name = "UsageVectorStoresResult", description = "The aggregated vector stores usage details of the specific time bucket.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UsageVectorStoresResult implements UsageTimeBucketResultInner {

  /**
   * Gets or Sets _object
   */
  public enum ObjectEnum {
    ORGANIZATION_USAGE_VECTOR_STORES_RESULT("organization.usage.vector_stores.result");

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

  private Integer usageBytes;

  private JsonNullable<String> projectId = JsonNullable.<String>undefined();

  public UsageVectorStoresResult() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UsageVectorStoresResult(ObjectEnum _object, Integer usageBytes) {
    this._object = _object;
    this.usageBytes = usageBytes;
  }

  public UsageVectorStoresResult _object(ObjectEnum _object) {
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

  public UsageVectorStoresResult usageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
    return this;
  }

  /**
   * The vector stores usage in bytes.
   * @return usageBytes
   */
  @NotNull 
  @Schema(name = "usage_bytes", description = "The vector stores usage in bytes.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("usage_bytes")
  public Integer getUsageBytes() {
    return usageBytes;
  }

  public void setUsageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
  }

  public UsageVectorStoresResult projectId(String projectId) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageVectorStoresResult usageVectorStoresResult = (UsageVectorStoresResult) o;
    return Objects.equals(this._object, usageVectorStoresResult._object) &&
        Objects.equals(this.usageBytes, usageVectorStoresResult.usageBytes) &&
        equalsNullable(this.projectId, usageVectorStoresResult.projectId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, usageBytes, hashCodeNullable(projectId));
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
    sb.append("class UsageVectorStoresResult {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    usageBytes: ").append(toIndentedString(usageBytes)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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

