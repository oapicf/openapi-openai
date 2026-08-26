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
 * Ephemeral key returned by the API.
 */

@Schema(name = "RealtimeSessionCreateResponse_client_secret", description = "Ephemeral key returned by the API.")
@JsonTypeName("RealtimeSessionCreateResponse_client_secret")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-26T05:22:24.124939009Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class RealtimeSessionCreateResponseClientSecret {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String value;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer expiresAt;

  public RealtimeSessionCreateResponseClientSecret value(@Nullable String value) {
    this.value = value;
    return this;
  }

  /**
   * Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side. 
   * @return value
   */
  
  @Schema(name = "value", description = "Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public @Nullable String getValue() {
    return value;
  }

  @JsonProperty("value")
  public void setValue(@Nullable String value) {
    this.value = value;
  }

  public RealtimeSessionCreateResponseClientSecret expiresAt(@Nullable Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Timestamp for when the token expires. Currently, all tokens expire after one minute. 
   * @return expiresAt
   */
  
  @Schema(name = "expires_at", description = "Timestamp for when the token expires. Currently, all tokens expire after one minute. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expires_at")
  public @Nullable Integer getExpiresAt() {
    return expiresAt;
  }

  @JsonProperty("expires_at")
  public void setExpiresAt(@Nullable Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeSessionCreateResponseClientSecret realtimeSessionCreateResponseClientSecret = (RealtimeSessionCreateResponseClientSecret) o;
    return Objects.equals(this.value, realtimeSessionCreateResponseClientSecret.value) &&
        Objects.equals(this.expiresAt, realtimeSessionCreateResponseClientSecret.expiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, expiresAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeSessionCreateResponseClientSecret {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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

