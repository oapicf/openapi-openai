package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RealtimeResponseStatusDetailsError;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Additional details about the status.
 */

@Schema(name = "RealtimeResponse_status_details", description = "Additional details about the status.")
@JsonTypeName("RealtimeResponse_status_details")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeResponseStatusDetails {

  /**
   * The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`). 
   */
  public enum TypeEnum {
    COMPLETED("completed"),
    
    CANCELLED("cancelled"),
    
    FAILED("failed"),
    
    INCOMPLETE("incomplete");

    private final String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  /**
   * The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response). 
   */
  public enum ReasonEnum {
    TURN_DETECTED("turn_detected"),
    
    CLIENT_CANCELLED("client_cancelled"),
    
    MAX_OUTPUT_TOKENS("max_output_tokens"),
    
    CONTENT_FILTER("content_filter");

    private final String value;

    ReasonEnum(String value) {
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
    public static ReasonEnum fromValue(String value) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ReasonEnum reason;

  private RealtimeResponseStatusDetailsError error;

  public RealtimeResponseStatusDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`). 
   * @return type
   */
  
  @Schema(name = "type", description = "The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeResponseStatusDetails reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

  /**
   * The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response). 
   * @return reason
   */
  
  @Schema(name = "reason", description = "The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reason")
  public ReasonEnum getReason() {
    return reason;
  }

  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }

  public RealtimeResponseStatusDetails error(RealtimeResponseStatusDetailsError error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  @Valid 
  @Schema(name = "error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error")
  public RealtimeResponseStatusDetailsError getError() {
    return error;
  }

  public void setError(RealtimeResponseStatusDetailsError error) {
    this.error = error;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeResponseStatusDetails realtimeResponseStatusDetails = (RealtimeResponseStatusDetails) o;
    return Objects.equals(this.type, realtimeResponseStatusDetails.type) &&
        Objects.equals(this.reason, realtimeResponseStatusDetails.reason) &&
        Objects.equals(this.error, realtimeResponseStatusDetails.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, reason, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeResponseStatusDetails {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

