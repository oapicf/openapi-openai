package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateChatCompletionRequestFunctionCallOneOf
 */

@JsonTypeName("CreateChatCompletionRequest_function_call_oneOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-16T01:17:43.141820780Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateChatCompletionRequestFunctionCallOneOf implements CreateChatCompletionRequestFunctionCall {

  private String name;

  public CreateChatCompletionRequestFunctionCallOneOf() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateChatCompletionRequestFunctionCallOneOf(String name) {
    this.name = name;
  }

  public CreateChatCompletionRequestFunctionCallOneOf name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the function to call.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The name of the function to call.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
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
    return Objects.equals(this.name, createChatCompletionRequestFunctionCallOneOf.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

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

