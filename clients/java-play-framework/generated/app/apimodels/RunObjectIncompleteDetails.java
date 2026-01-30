package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Details on why the run is incomplete. Will be &#x60;null&#x60; if the run is not incomplete.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RunObjectIncompleteDetails   {
  /**
   * The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
   */
  public enum ReasonEnum {
    MAX_COMPLETION_TOKENS("max_completion_tokens"),
    
    MAX_PROMPT_TOKENS("max_prompt_tokens");

    private final String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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

  @JsonProperty("reason")
  
  private ReasonEnum reason;

  public RunObjectIncompleteDetails reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
   * @return reason
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

