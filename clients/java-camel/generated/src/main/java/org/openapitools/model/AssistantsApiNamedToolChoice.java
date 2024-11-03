package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ChatCompletionNamedToolChoiceFunction;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Specifies a tool the model should use. Use to force the model to call a specific tool.
 */

@Schema(name = "AssistantsApiNamedToolChoice", description = "Specifies a tool the model should use. Use to force the model to call a specific tool.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-03T11:08:01.261160233Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AssistantsApiNamedToolChoice implements AssistantsApiToolChoiceOption {

  /**
   * The type of the tool. If type is `function`, the function name must be set
   */
  public enum TypeEnum {
    FUNCTION("function"),
    
    CODE_INTERPRETER("code_interpreter"),
    
    RETRIEVAL("retrieval");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private ChatCompletionNamedToolChoiceFunction function;

  public AssistantsApiNamedToolChoice() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AssistantsApiNamedToolChoice(TypeEnum type) {
    this.type = type;
  }

  public AssistantsApiNamedToolChoice type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the tool. If type is `function`, the function name must be set
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "The type of the tool. If type is `function`, the function name must be set", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public AssistantsApiNamedToolChoice function(ChatCompletionNamedToolChoiceFunction function) {
    this.function = function;
    return this;
  }

  /**
   * Get function
   * @return function
   */
  @Valid 
  @Schema(name = "function", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("function")
  public ChatCompletionNamedToolChoiceFunction getFunction() {
    return function;
  }

  public void setFunction(ChatCompletionNamedToolChoiceFunction function) {
    this.function = function;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssistantsApiNamedToolChoice assistantsApiNamedToolChoice = (AssistantsApiNamedToolChoice) o;
    return Objects.equals(this.type, assistantsApiNamedToolChoice.type) &&
        Objects.equals(this.function, assistantsApiNamedToolChoice.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, function);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssistantsApiNamedToolChoice {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
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

