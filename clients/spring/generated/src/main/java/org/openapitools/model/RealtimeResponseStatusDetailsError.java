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
 * A description of the error that caused the response to fail,  populated when the &#x60;status&#x60; is &#x60;failed&#x60;. 
 */

@Schema(name = "RealtimeResponse_status_details_error", description = "A description of the error that caused the response to fail,  populated when the `status` is `failed`. ")
@JsonTypeName("RealtimeResponse_status_details_error")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-26T05:22:24.124939009Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class RealtimeResponseStatusDetailsError {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String type;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String code;

  public RealtimeResponseStatusDetailsError type(@Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of error.
   * @return type
   */
  
  @Schema(name = "type", description = "The type of error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(@Nullable String type) {
    this.type = type;
  }

  public RealtimeResponseStatusDetailsError code(@Nullable String code) {
    this.code = code;
    return this;
  }

  /**
   * Error code, if any.
   * @return code
   */
  
  @Schema(name = "code", description = "Error code, if any.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public @Nullable String getCode() {
    return code;
  }

  @JsonProperty("code")
  public void setCode(@Nullable String code) {
    this.code = code;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeResponseStatusDetailsError realtimeResponseStatusDetailsError = (RealtimeResponseStatusDetailsError) o;
    return Objects.equals(this.type, realtimeResponseStatusDetailsError.type) &&
        Objects.equals(this.code, realtimeResponseStatusDetailsError.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeResponseStatusDetailsError {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

