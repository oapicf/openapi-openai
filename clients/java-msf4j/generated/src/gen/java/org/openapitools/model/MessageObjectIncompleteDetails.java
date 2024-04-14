package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * On an incomplete message, details about why the message is incomplete.
 */
@ApiModel(description = "On an incomplete message, details about why the message is incomplete.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-04-14T13:38:52.193957698Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MessageObjectIncompleteDetails   {
  /**
   * The reason the message is incomplete.
   */
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
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReasonEnum fromValue(String text) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("reason")
  private ReasonEnum reason;

  public MessageObjectIncompleteDetails reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason the message is incomplete.
   * @return reason
  **/
  @ApiModelProperty(required = true, value = "The reason the message is incomplete.")
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
    return Objects.equals(this.reason, messageObjectIncompleteDetails.reason);
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

