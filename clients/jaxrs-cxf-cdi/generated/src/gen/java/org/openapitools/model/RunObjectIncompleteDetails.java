package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Details on why the run is incomplete. Will be &#x60;null&#x60; if the run is not incomplete.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Details on why the run is incomplete. Will be `null` if the run is not incomplete.")
public class RunObjectIncompleteDetails   {
  

public enum ReasonEnum {

    @JsonProperty("max_completion_tokens") COMPLETION_TOKENS(String.valueOf("max_completion_tokens")), @JsonProperty("max_prompt_tokens") PROMPT_TOKENS(String.valueOf("max_prompt_tokens"));


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
   * The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
   **/
  public RunObjectIncompleteDetails reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

  
  @ApiModelProperty(value = "The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.")
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
    RunObjectIncompleteDetails runObjectIncompleteDetails = (RunObjectIncompleteDetails) o;
    return Objects.equals(this.reason, runObjectIncompleteDetails.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunObjectIncompleteDetails {\n");
    
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

