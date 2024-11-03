package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Details on why the run is incomplete. Will be &#x60;null&#x60; if the run is not incomplete.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RunObjectIncompleteDetails   {
  


  public enum ReasonEnum {
    COMPLETION_TOKENS("max_completion_tokens"),
    PROMPT_TOKENS("max_prompt_tokens");

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

  public RunObjectIncompleteDetails () {

  }

  public RunObjectIncompleteDetails (ReasonEnum reason) {
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
    RunObjectIncompleteDetails runObjectIncompleteDetails = (RunObjectIncompleteDetails) o;
    return Objects.equals(reason, runObjectIncompleteDetails.reason);
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
