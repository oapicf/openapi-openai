package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RealtimeResponseStatusDetailsError;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Additional details about the status.
 */
@ApiModel(description="Additional details about the status.")

public class RealtimeResponseStatusDetails  {
  
public enum TypeEnum {

    @JsonProperty("completed") COMPLETED(String.valueOf("completed")),
    @JsonProperty("cancelled") CANCELLED(String.valueOf("cancelled")),
    @JsonProperty("failed") FAILED(String.valueOf("failed")),
    @JsonProperty("incomplete") INCOMPLETE(String.valueOf("incomplete"));

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

    @JsonProperty("turn_detected") TURN_DETECTED(String.valueOf("turn_detected")),
    @JsonProperty("client_cancelled") CLIENT_CANCELLED(String.valueOf("client_cancelled")),
    @JsonProperty("max_output_tokens") MAX_OUTPUT_TOKENS(String.valueOf("max_output_tokens")),
    @JsonProperty("content_filter") CONTENT_FILTER(String.valueOf("content_filter"));

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
  @Valid
  private RealtimeResponseStatusDetailsError error;
 /**
  * The type of error that caused the response to fail, corresponding  with the &#x60;status&#x60; field (&#x60;completed&#x60;, &#x60;cancelled&#x60;, &#x60;incomplete&#x60;,  &#x60;failed&#x60;). 
  * @return type
  */
  @JsonProperty("type")
  public String getType() {
    return type == null ? null : type.value();
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public RealtimeResponseStatusDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * The reason the Response did not complete. For a &#x60;cancelled&#x60; Response,  one of &#x60;turn_detected&#x60; (the server VAD detected a new start of speech)  or &#x60;client_cancelled&#x60; (the client sent a cancel event). For an  &#x60;incomplete&#x60; Response, one of &#x60;max_output_tokens&#x60; or &#x60;content_filter&#x60;  (the server-side safety filter activated and cut off the response). 
  * @return reason
  */
  @JsonProperty("reason")
  public String getReason() {
    return reason == null ? null : reason.value();
  }

  /**
   * Sets the <code>reason</code> property.
   */
 public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }

  /**
   * Sets the <code>reason</code> property.
   */
  public RealtimeResponseStatusDetails reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

 /**
  * Get error
  * @return error
  */
  @JsonProperty("error")
  public RealtimeResponseStatusDetailsError getError() {
    return error;
  }

  /**
   * Sets the <code>error</code> property.
   */
 public void setError(RealtimeResponseStatusDetailsError error) {
    this.error = error;
  }

  /**
   * Sets the <code>error</code> property.
   */
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

