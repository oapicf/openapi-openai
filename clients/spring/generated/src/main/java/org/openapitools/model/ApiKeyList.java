package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdminApiKey;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ApiKeyList
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ApiKeyList {

  private @Nullable String _object;

  @Valid
  private List<@Valid AdminApiKey> data = new ArrayList<>();

  private @Nullable Boolean hasMore;

  private @Nullable String firstId;

  private @Nullable String lastId;

  public ApiKeyList _object(@Nullable String _object) {
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
   */
  
  @Schema(name = "object", example = "list", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("object")
  public @Nullable String getObject() {
    return _object;
  }

  public void setObject(@Nullable String _object) {
    this._object = _object;
  }

  public ApiKeyList data(List<@Valid AdminApiKey> data) {
    this.data = data;
    return this;
  }

  public ApiKeyList addDataItem(AdminApiKey dataItem) {
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
  @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public List<@Valid AdminApiKey> getData() {
    return data;
  }

  public void setData(List<@Valid AdminApiKey> data) {
    this.data = data;
  }

  public ApiKeyList hasMore(@Nullable Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  /**
   * Get hasMore
   * @return hasMore
   */
  
  @Schema(name = "has_more", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("has_more")
  public @Nullable Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(@Nullable Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public ApiKeyList firstId(@Nullable String firstId) {
    this.firstId = firstId;
    return this;
  }

  /**
   * Get firstId
   * @return firstId
   */
  
  @Schema(name = "first_id", example = "key_abc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("first_id")
  public @Nullable String getFirstId() {
    return firstId;
  }

  public void setFirstId(@Nullable String firstId) {
    this.firstId = firstId;
  }

  public ApiKeyList lastId(@Nullable String lastId) {
    this.lastId = lastId;
    return this;
  }

  /**
   * Get lastId
   * @return lastId
   */
  
  @Schema(name = "last_id", example = "key_xyz", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_id")
  public @Nullable String getLastId() {
    return lastId;
  }

  public void setLastId(@Nullable String lastId) {
    this.lastId = lastId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKeyList apiKeyList = (ApiKeyList) o;
    return Objects.equals(this._object, apiKeyList._object) &&
        Objects.equals(this.data, apiKeyList.data) &&
        Objects.equals(this.hasMore, apiKeyList.hasMore) &&
        Objects.equals(this.firstId, apiKeyList.firstId) &&
        Objects.equals(this.lastId, apiKeyList.lastId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, data, hasMore, firstId, lastId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyList {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    firstId: ").append(toIndentedString(firstId)).append("\n");
    sb.append("    lastId: ").append(toIndentedString(lastId)).append("\n");
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

