package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * On an incomplete message, details about why the message is incomplete.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "On an incomplete message, details about why the message is incomplete.")
public class MessageObjectIncompleteDetails   {
  

public enum ReasonEnum {

    @JsonProperty("content_filter") CONTENT_FILTER(String.valueOf("content_filter")), @JsonProperty("max_tokens") MAX_TOKENS(String.valueOf("max_tokens")), @JsonProperty("run_cancelled") RUN_CANCELLED(String.valueOf("run_cancelled")), @JsonProperty("run_expired") RUN_EXPIRED(String.valueOf("run_expired")), @JsonProperty("run_failed") RUN_FAILED(String.valueOf("run_failed"));


    private String value;

    ReasonEnum(String v) {
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

  private ReasonEnum reason;

  /**
   * The reason the message is incomplete.
   **/
  public MessageObjectIncompleteDetails reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The reason the message is incomplete.")
  @JsonProperty("reason")
  @NotNull
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

