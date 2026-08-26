package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AdminApiKeysDelete200Response
 */

@JsonTypeName("admin_api_keys_delete_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-26T05:22:24.124939009Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdminApiKeysDelete200Response {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String id;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String _object;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean deleted;

  public AdminApiKeysDelete200Response id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", example = "key_abc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(@Nullable String id) {
    this.id = id;
  }

  public AdminApiKeysDelete200Response _object(@Nullable String _object) {
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
   */
  
  @Schema(name = "object", example = "organization.admin_api_key.deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("object")
  public @Nullable String getObject() {
    return _object;
  }

  @JsonProperty("object")
  public void setObject(@Nullable String _object) {
    this._object = _object;
  }

  public AdminApiKeysDelete200Response deleted(@Nullable Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * Get deleted
   * @return deleted
   */
  
  @Schema(name = "deleted", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deleted")
  public @Nullable Boolean getDeleted() {
    return deleted;
  }

  @JsonProperty("deleted")
  public void setDeleted(@Nullable Boolean deleted) {
    this.deleted = deleted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminApiKeysDelete200Response adminApiKeysDelete200Response = (AdminApiKeysDelete200Response) o;
    return Objects.equals(this.id, adminApiKeysDelete200Response.id) &&
        Objects.equals(this._object, adminApiKeysDelete200Response._object) &&
        Objects.equals(this.deleted, adminApiKeysDelete200Response.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, deleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminApiKeysDelete200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

