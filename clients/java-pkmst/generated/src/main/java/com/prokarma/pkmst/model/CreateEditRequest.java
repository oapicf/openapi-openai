package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.CreateEditRequestModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CreateEditRequest
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-16T01:12:49.513446343Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateEditRequest   {
  @JsonProperty("model")
  private CreateEditRequestModel model;

  @JsonProperty("input")
  private String input = "";

  @JsonProperty("instruction")
  private String instruction;

  @JsonProperty("n")
  private Integer n = 1;

  @JsonProperty("temperature")
  private BigDecimal temperature = new BigDecimal("1");

  @JsonProperty("top_p")
  private BigDecimal topP = new BigDecimal("1");

  public CreateEditRequest model(CreateEditRequestModel model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @ApiModelProperty(required = true, value = "")
  public CreateEditRequestModel getModel() {
    return model;
  }

  public void setModel(CreateEditRequestModel model) {
    this.model = model;
  }

  public CreateEditRequest input(String input) {
    this.input = input;
    return this;
  }

   /**
   * The input text to use as a starting point for the edit.
   * @return input
  **/
  @ApiModelProperty(example = "What day of the wek is it?", value = "The input text to use as a starting point for the edit.")
  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

  public CreateEditRequest instruction(String instruction) {
    this.instruction = instruction;
    return this;
  }

   /**
   * The instruction that tells the model how to edit the prompt.
   * @return instruction
  **/
  @ApiModelProperty(example = "Fix the spelling mistakes.", required = true, value = "The instruction that tells the model how to edit the prompt.")
  public String getInstruction() {
    return instruction;
  }

  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }

  public CreateEditRequest n(Integer n) {
    this.n = n;
    return this;
  }

   /**
   * How many edits to generate for the input and instruction.
   * minimum: 1
   * maximum: 20
   * @return n
  **/
  @ApiModelProperty(example = "1", value = "How many edits to generate for the input and instruction.")
  public Integer getN() {
    return n;
  }

  public void setN(Integer n) {
    this.n = n;
  }

  public CreateEditRequest temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

   /**
   * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
   * minimum: 0
   * maximum: 2
   * @return temperature
  **/
  @ApiModelProperty(example = "1", value = "What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. ")
  public BigDecimal getTemperature() {
    return temperature;
  }

  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  public CreateEditRequest topP(BigDecimal topP) {
    this.topP = topP;
    return this;
  }

   /**
   * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
   * minimum: 0
   * maximum: 1
   * @return topP
  **/
  @ApiModelProperty(example = "1", value = "An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. ")
  public BigDecimal getTopP() {
    return topP;
  }

  public void setTopP(BigDecimal topP) {
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
        Objects.equals(this.input, createEditRequest.input) &&
        Objects.equals(this.instruction, createEditRequest.instruction) &&
        Objects.equals(this.n, createEditRequest.n) &&
        Objects.equals(this.temperature, createEditRequest.temperature) &&
        Objects.equals(this.topP, createEditRequest.topP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, input, instruction, n, temperature, topP);
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

