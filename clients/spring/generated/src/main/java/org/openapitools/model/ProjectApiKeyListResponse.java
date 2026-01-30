package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProjectApiKey;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProjectApiKeyListResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ProjectApiKeyListResponse {

  /**
   * Gets or Sets _object
   */
  public enum ObjectEnum {
    LIST("list");

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

  @Valid
  private List<@Valid ProjectApiKey> data = new ArrayList<>();

  private String firstId;

  private String lastId;

  private Boolean hasMore;

  public ProjectApiKeyListResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProjectApiKeyListResponse(ObjectEnum _object, List<@Valid ProjectApiKey> data, String firstId, String lastId, Boolean hasMore) {
    this._object = _object;
    this.data = data;
    this.firstId = firstId;
    this.lastId = lastId;
    this.hasMore = hasMore;
  }

  public ProjectApiKeyListResponse _object(ObjectEnum _object) {
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

  public ProjectApiKeyListResponse data(List<@Valid ProjectApiKey> data) {
    this.data = data;
    return this;
  }

  public ProjectApiKeyListResponse addDataItem(ProjectApiKey dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @NotNull @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("data")
  public List<@Valid ProjectApiKey> getData() {
    return data;
  }

  public void setData(List<@Valid ProjectApiKey> data) {
    this.data = data;
  }

  public ProjectApiKeyListResponse firstId(String firstId) {
    this.firstId = firstId;
    return this;
  }

  /**
   * Get firstId
   * @return firstId
   */
  @NotNull 
  @Schema(name = "first_id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("first_id")
  public String getFirstId() {
    return firstId;
  }

  public void setFirstId(String firstId) {
    this.firstId = firstId;
  }

  public ProjectApiKeyListResponse lastId(String lastId) {
    this.lastId = lastId;
    return this;
  }

  /**
   * Get lastId
   * @return lastId
   */
  @NotNull 
  @Schema(name = "last_id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("last_id")
  public String getLastId() {
    return lastId;
  }

  public void setLastId(String lastId) {
    this.lastId = lastId;
  }

  public ProjectApiKeyListResponse hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  /**
   * Get hasMore
   * @return hasMore
   */
  @NotNull 
  @Schema(name = "has_more", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("has_more")
  public Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectApiKeyListResponse projectApiKeyListResponse = (ProjectApiKeyListResponse) o;
    return Objects.equals(this._object, projectApiKeyListResponse._object) &&
        Objects.equals(this.data, projectApiKeyListResponse.data) &&
        Objects.equals(this.firstId, projectApiKeyListResponse.firstId) &&
        Objects.equals(this.lastId, projectApiKeyListResponse.lastId) &&
        Objects.equals(this.hasMore, projectApiKeyListResponse.hasMore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, data, firstId, lastId, hasMore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectApiKeyListResponse {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    firstId: ").append(toIndentedString(firstId)).append("\n");
    sb.append("    lastId: ").append(toIndentedString(lastId)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
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

