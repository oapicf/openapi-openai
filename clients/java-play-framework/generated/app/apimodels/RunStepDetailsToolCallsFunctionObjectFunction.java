package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * The definition of the function that was called.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RunStepDetailsToolCallsFunctionObjectFunction   {
  @JsonProperty("name")
  @NotNull

  private String name;

  @JsonProperty("arguments")
  @NotNull

  private String arguments;

  @JsonProperty("output")
  @NotNull

  private String output;

  public RunStepDetailsToolCallsFunctionObjectFunction name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the function.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RunStepDetailsToolCallsFunctionObjectFunction arguments(String arguments) {
    this.arguments = arguments;
    return this;
  }

   /**
   * The arguments passed to the function.
   * @return arguments
  **/
  public String getArguments() {
    return arguments;
  }

  public void setArguments(String arguments) {
    this.arguments = arguments;
  }

  public RunStepDetailsToolCallsFunctionObjectFunction output(String output) {
    this.output = output;
    return this;
  }

   /**
   * The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
   * @return output
  **/
  public String getOutput() {
    return output;
  }

  public void setOutput(String output) {
    this.output = output;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDetailsToolCallsFunctionObjectFunction runStepDetailsToolCallsFunctionObjectFunction = (RunStepDetailsToolCallsFunctionObjectFunction) o;
    return Objects.equals(name, runStepDetailsToolCallsFunctionObjectFunction.name) &&
        Objects.equals(arguments, runStepDetailsToolCallsFunctionObjectFunction.arguments) &&
        Objects.equals(output, runStepDetailsToolCallsFunctionObjectFunction.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, arguments, output);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsToolCallsFunctionObjectFunction {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
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

