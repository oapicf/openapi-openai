package org.openapitools.model;

import org.openapitools.model.RealtimeResponseStatusDetailsError;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional details about the status.
 */
@ApiModel(description="Additional details about the status.")

public class RealtimeResponseStatusDetails  {
  
public enum TypeEnum {

COMPLETED(String.valueOf("completed")), CANCELLED(String.valueOf("cancelled")), FAILED(String.valueOf("failed")), INCOMPLETE(String.valueOf("incomplete"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`). 
  */
  @ApiModelProperty(value = "The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`). ")

  private TypeEnum type;

public enum ReasonEnum {

TURN_DETECTED(String.valueOf("turn_detected")), CLIENT_CANCELLED(String.valueOf("client_cancelled")), MAX_OUTPUT_TOKENS(String.valueOf("max_output_tokens")), CONTENT_FILTER(String.valueOf("content_filter"));


    private String value;

    ReasonEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReasonEnum fromValue(String value) {
        for (ReasonEnum b : ReasonEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response). 
  */
  @ApiModelProperty(value = "The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response). ")

  private ReasonEnum reason;

  @ApiModelProperty(value = "")

  private RealtimeResponseStatusDetailsError error;
 /**
   * The type of error that caused the response to fail, corresponding  with the &#x60;status&#x60; field (&#x60;completed&#x60;, &#x60;cancelled&#x60;, &#x60;incomplete&#x60;,  &#x60;failed&#x60;). 
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeResponseStatusDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * The reason the Response did not complete. For a &#x60;cancelled&#x60; Response,  one of &#x60;turn_detected&#x60; (the server VAD detected a new start of speech)  or &#x60;client_cancelled&#x60; (the client sent a cancel event). For an  &#x60;incomplete&#x60; Response, one of &#x60;max_output_tokens&#x60; or &#x60;content_filter&#x60;  (the server-side safety filter activated and cut off the response). 
   * @return reason
  **/
  @JsonProperty("reason")
  public String getReason() {
    if (reason == null) {
      return null;
    }
    return reason.value();
  }

  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }

  public RealtimeResponseStatusDetails reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

 /**
   * Get error
   * @return error
  **/
  @JsonProperty("error")
  public RealtimeResponseStatusDetailsError getError() {
    return error;
  }

  public void setError(RealtimeResponseStatusDetailsError error) {
    this.error = error;
  }

  public RealtimeResponseStatusDetails error(RealtimeResponseStatusDetailsError error) {
    this.error = error;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

