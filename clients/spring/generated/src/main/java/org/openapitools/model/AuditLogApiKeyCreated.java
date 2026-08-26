package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AuditLogApiKeyCreatedData;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The details for events with this &#x60;type&#x60;.
 */

@Schema(name = "AuditLog_api_key_created", description = "The details for events with this `type`.")
@JsonTypeName("AuditLog_api_key_created")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-26T05:22:24.124939009Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AuditLogApiKeyCreated {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String id;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable AuditLogApiKeyCreatedData data;

  public AuditLogApiKeyCreated id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * The tracking ID of the API key.
   * @return id
   */
  
  @Schema(name = "id", description = "The tracking ID of the API key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(@Nullable String id) {
    this.id = id;
  }

  public AuditLogApiKeyCreated data(@Nullable AuditLogApiKeyCreatedData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public @Nullable AuditLogApiKeyCreatedData getData() {
    return data;
  }

  @JsonProperty("data")
  public void setData(@Nullable AuditLogApiKeyCreatedData data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogApiKeyCreated auditLogApiKeyCreated = (AuditLogApiKeyCreated) o;
    return Objects.equals(this.id, auditLogApiKeyCreated.id) &&
        Objects.equals(this.data, auditLogApiKeyCreated.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogApiKeyCreated {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

