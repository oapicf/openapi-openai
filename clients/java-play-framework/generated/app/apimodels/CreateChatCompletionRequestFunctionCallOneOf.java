package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateChatCompletionRequestFunctionCallOneOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-16T01:12:54.315235707Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateChatCompletionRequestFunctionCallOneOf   {
  @JsonProperty("name")
  @NotNull

  private String name;

  public CreateChatCompletionRequestFunctionCallOneOf name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the function to call.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChatCompletionRequestFunctionCallOneOf createChatCompletionRequestFunctionCallOneOf = (CreateChatCompletionRequestFunctionCallOneOf) o;
    return Objects.equals(name, createChatCompletionRequestFunctionCallOneOf.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionRequestFunctionCallOneOf {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

