package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * On an incomplete message, details about why the message is incomplete.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessageObjectIncompleteDetails   {
  


  public enum ReasonEnum {
    CONTENT_FILTER("content_filter"),
    MAX_TOKENS("max_tokens"),
    RUN_CANCELLED("run_cancelled"),
    RUN_EXPIRED("run_expired"),
    RUN_FAILED("run_failed");

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

  public MessageObjectIncompleteDetails () {

  }

  public MessageObjectIncompleteDetails (ReasonEnum reason) {
    this.reason = reason;
  }

    
  @JsonProperty("reason")
  public ReasonEnum getReason() {
    return reason;
  }
  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageObjectIncompleteDetails messageObjectIncompleteDetails = (MessageObjectIncompleteDetails) o;
    return Objects.equals(reason, messageObjectIncompleteDetails.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageObjectIncompleteDetails {\n");
    
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
