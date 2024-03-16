package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateEditRequestModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateEditRequest  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CreateEditRequestModel model;

 /**
  * The input text to use as a starting point for the edit.
  */
  @ApiModelProperty(example = "What day of the wek is it?", value = "The input text to use as a starting point for the edit.")
  private String input = "";

 /**
  * The instruction that tells the model how to edit the prompt.
  */
  @ApiModelProperty(example = "Fix the spelling mistakes.", required = true, value = "The instruction that tells the model how to edit the prompt.")
  private String instruction;

 /**
  * How many edits to generate for the input and instruction.
  */
  @ApiModelProperty(example = "1", value = "How many edits to generate for the input and instruction.")
  private Integer n = 1;

 /**
  * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
  */
  @ApiModelProperty(example = "1", value = "What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. ")
  @Valid
  private BigDecimal temperature = new BigDecimal("1");

 /**
  * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
  */
  @ApiModelProperty(example = "1", value = "An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. ")
  @Valid
  private BigDecimal topP = new BigDecimal("1");
 /**
  * Get model
  * @return model
  */
  @JsonProperty("model")
  @NotNull
  public CreateEditRequestModel getModel() {
    return model;
  }

  /**
   * Sets the <code>model</code> property.
   */
 public void setModel(CreateEditRequestModel model) {
    this.model = model;
  }

  /**
   * Sets the <code>model</code> property.
   */
  public CreateEditRequest model(CreateEditRequestModel model) {
    this.model = model;
    return this;
  }

 /**
  * The input text to use as a starting point for the edit.
  * @return input
  */
  @JsonProperty("input")
  public String getInput() {
    return input;
  }

  /**
   * Sets the <code>input</code> property.
   */
 public void setInput(String input) {
    this.input = input;
  }

  /**
   * Sets the <code>input</code> property.
   */
  public CreateEditRequest input(String input) {
    this.input = input;
    return this;
  }

 /**
  * The instruction that tells the model how to edit the prompt.
  * @return instruction
  */
  @JsonProperty("instruction")
  @NotNull
  public String getInstruction() {
    return instruction;
  }

  /**
   * Sets the <code>instruction</code> property.
   */
 public void setInstruction(String instruction) {
    this.instruction = instruction;
  }

  /**
   * Sets the <code>instruction</code> property.
   */
  public CreateEditRequest instruction(String instruction) {
    this.instruction = instruction;
    return this;
  }

 /**
  * How many edits to generate for the input and instruction.
  * minimum: 1
  * maximum: 20
  * @return n
  */
  @JsonProperty("n")
 @Min(1) @Max(20)  public Integer getN() {
    return n;
  }

  /**
   * Sets the <code>n</code> property.
   */
 public void setN(Integer n) {
    this.n = n;
  }

  /**
   * Sets the <code>n</code> property.
   */
  public CreateEditRequest n(Integer n) {
    this.n = n;
    return this;
  }

 /**
  * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or &#x60;top_p&#x60; but not both. 
  * minimum: 0
  * maximum: 2
  * @return temperature
  */
  @JsonProperty("temperature")
 @DecimalMin("0") @DecimalMax("2")  public BigDecimal getTemperature() {
    return temperature;
  }

  /**
   * Sets the <code>temperature</code> property.
   */
 public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  /**
   * Sets the <code>temperature</code> property.
   */
  public CreateEditRequest temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

 /**
  * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both. 
  * minimum: 0
  * maximum: 1
  * @return topP
  */
  @JsonProperty("top_p")
 @DecimalMin("0") @DecimalMax("1")  public BigDecimal getTopP() {
    return topP;
  }

  /**
   * Sets the <code>topP</code> property.
   */
 public void setTopP(BigDecimal topP) {
    this.topP = topP;
  }

  /**
   * Sets the <code>topP</code> property.
   */
  public CreateEditRequest topP(BigDecimal topP) {
    this.topP = topP;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

