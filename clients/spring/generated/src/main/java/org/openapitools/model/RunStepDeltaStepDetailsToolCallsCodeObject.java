package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of the Code Interpreter tool call the run step was involved in.
 */

@Schema(name = "RunStepDeltaStepDetailsToolCallsCodeObject", description = "Details of the Code Interpreter tool call the run step was involved in.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T10:48:36.973220935Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepDeltaStepDetailsToolCallsCodeObject implements RunStepDeltaStepDetailsToolCallsObjectToolCallsInner {

  private Integer index;

  private @Nullable String id;

  /**
   * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
   */
  public enum TypeEnum {
    CODE_INTERPRETER("code_interpreter");

    private final String value;

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

  private @Nullable RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter;

  public RunStepDeltaStepDetailsToolCallsCodeObject() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RunStepDeltaStepDetailsToolCallsCodeObject(Integer index, TypeEnum type) {
    this.index = index;
    this.type = type;
  }

  public RunStepDeltaStepDetailsToolCallsCodeObject index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * The index of the tool call in the tool calls array.
   * @return index
   */
  @NotNull 
  @Schema(name = "index", description = "The index of the tool call in the tool calls array.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public RunStepDeltaStepDetailsToolCallsCodeObject id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the tool call.
   * @return id
   */
  
  @Schema(name = "id", description = "The ID of the tool call.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public RunStepDeltaStepDetailsToolCallsCodeObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "The type of tool call. This is always going to be `code_interpreter` for this type of tool call.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RunStepDeltaStepDetailsToolCallsCodeObject codeInterpreter(@Nullable RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
    return this;
  }

  /**
   * Get codeInterpreter
   * @return codeInterpreter
   */
  @Valid 
  @Schema(name = "code_interpreter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code_interpreter")
  public @Nullable RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter getCodeInterpreter() {
    return codeInterpreter;
  }

  public void setCodeInterpreter(@Nullable RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDeltaStepDetailsToolCallsCodeObject runStepDeltaStepDetailsToolCallsCodeObject = (RunStepDeltaStepDetailsToolCallsCodeObject) o;
    return Objects.equals(this.index, runStepDeltaStepDetailsToolCallsCodeObject.index) &&
        Objects.equals(this.id, runStepDeltaStepDetailsToolCallsCodeObject.id) &&
        Objects.equals(this.type, runStepDeltaStepDetailsToolCallsCodeObject.type) &&
        Objects.equals(this.codeInterpreter, runStepDeltaStepDetailsToolCallsCodeObject.codeInterpreter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, id, type, codeInterpreter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDeltaStepDetailsToolCallsCodeObject {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    codeInterpreter: ").append(toIndentedString(codeInterpreter)).append("\n");
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

