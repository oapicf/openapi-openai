package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.RealtimeResponseStatusDetailsError;

/**
 * Additional details about the status.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealtimeResponseStatusDetails   {
  


  public enum TypeEnum {
    COMPLETED("completed"),
    CANCELLED("cancelled"),
    FAILED("failed"),
    INCOMPLETE("incomplete");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type;


  public enum ReasonEnum {
    TURN_DETECTED("turn_detected"),
    CLIENT_CANCELLED("client_cancelled"),
    MAX_OUTPUT_TOKENS("max_output_tokens"),
    CONTENT_FILTER("content_filter");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ReasonEnum reason;
  private RealtimeResponseStatusDetailsError error;

  public RealtimeResponseStatusDetails () {

  }

  public RealtimeResponseStatusDetails (TypeEnum type, ReasonEnum reason, RealtimeResponseStatusDetailsError error) {
    this.type = type;
    this.reason = reason;
    this.error = error;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
  @JsonProperty("reason")
  public ReasonEnum getReason() {
    return reason;
  }
  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }

    
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
    return Objects.equals(type, realtimeResponseStatusDetails.type) &&
        Objects.equals(reason, realtimeResponseStatusDetails.reason) &&
        Objects.equals(error, realtimeResponseStatusDetails.error);
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
