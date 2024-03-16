package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateEditRequestModel;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateEditRequest
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-16T01:13:12.257183065Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateEditRequest {

  private CreateEditRequestModel model;

  private JsonNullable<String> input = JsonNullable.<String>undefined();

  private String instruction;

  private JsonNullable<@Min(1) @Max(20) Integer> n = JsonNullable.<Integer>undefined();

  private JsonNullable<@DecimalMin("0") @DecimalMax("2") BigDecimal> temperature = JsonNullable.<BigDecimal>undefined();

  private JsonNullable<@DecimalMin("0") @DecimalMax("1") BigDecimal> topP = JsonNullable.<BigDecimal>undefined();

  public CreateEditRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateEditRequest(CreateEditRequestModel model, String instruction) {
    this.model = model;
    this.instruction = instruction;
  }

  public CreateEditRequest model(CreateEditRequestModel model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
  */
  @NotNull @Valid 
  @Schema(name = "model", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("model")
  public CreateEditRequestModel getModel() {
    return model;
  }

  public void setModel(CreateEditRequestModel model) {
    this.model = model;
  }

  public CreateEditRequest input(String input) {
    this.input = JsonNullable.of(input);
    return this;
  }

  /**
   * The input text to use as a starting point for the edit.
   * @return input
  */
  
  @Schema(name = "input", example = "What day of the wek is it?", description = "The input text to use as a starting point for the edit.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("input")
  public JsonNullable<String> getInput() {
    return input;
  }

  public void setInput(JsonNullable<String> input) {
    this.input = input;
  }

  public CreateEditRequest instruction(String instruction) {
    this.instruction = instruction;
    return this;
  }

  /**
   * The instruction that tells the model how to edit the prompt.
   * @return instruction
  */
  @NotNull 
  @Schema(name = "instruction", example = "Fix the spelling mistakes.", description = "The instruction that tells the model how to edit the prompt.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("instruction")
  public String getInstruction() {
    return instruction;
  }

  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }

  public CreateEditRequest n(Integer n) {
    this.n = JsonNullable.of(n);
    return this;
  }

  /**
   * How many edits to generate for the input and instruction.
   * minimum: 1
   * maximum: 20
   * @return n
  */
  @Min(1) @Max(20) 
  @Schema(name = "n", example = "1", description = "How many edits to generate for the input and instruction.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("n")
  public JsonNullable<@Min(1) @Max(20) Integer> getN() {
    return n;
  }

  public void setN(JsonNullable<Integer> n) {
    this.n = n;
  }

  public CreateEditRequest temperature(BigDecimal temperature) {
    this.temperature = JsonNullable.of(temperature);
    return this;
  }

  /**
   * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
   * minimum: 0
   * maximum: 2
   * @return temperature
  */
  @Valid @DecimalMin("0") @DecimalMax("2") 
  @Schema(name = "temperature", example = "1", description = "What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("temperature")
  public JsonNullable<@DecimalMin("0") @DecimalMax("2") BigDecimal> getTemperature() {
    return temperature;
  }

  public void setTemperature(JsonNullable<BigDecimal> temperature) {
    this.temperature = temperature;
  }

  public CreateEditRequest topP(BigDecimal topP) {
    this.topP = JsonNullable.of(topP);
    return this;
  }

  /**
   * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
   * minimum: 0
   * maximum: 1
   * @return topP
  */
  @Valid @DecimalMin("0") @DecimalMax("1") 
  @Schema(name = "top_p", example = "1", description = "An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("top_p")
  public JsonNullable<@DecimalMin("0") @DecimalMax("1") BigDecimal> getTopP() {
    return topP;
  }

  public void setTopP(JsonNullable<BigDecimal> topP) {
    this.topP = topP;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEditRequest createEditRequest = (CreateEditRequest) o;
    return Objects.equals(this.model, createEditRequest.model) &&
        equalsNullable(this.input, createEditRequest.input) &&
        Objects.equals(this.instruction, createEditRequest.instruction) &&
        equalsNullable(this.n, createEditRequest.n) &&
        equalsNullable(this.temperature, createEditRequest.temperature) &&
        equalsNullable(this.topP, createEditRequest.topP);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, hashCodeNullable(input), instruction, hashCodeNullable(n), hashCodeNullable(temperature), hashCodeNullable(topP));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEditRequest {\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
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

