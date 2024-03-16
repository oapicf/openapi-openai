/*
 * OpenAI API
 *
 * APIs for sampling from and fine-tuning language models
 *
 * OpenAPI document version: 2.0.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateEditRequestModel;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-03-16T01:12:58.923191288Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateEditRequest   {
  
  private CreateEditRequestModel model;
  private String input = "";
  private String instruction;
  private Integer n = 1;
  private BigDecimal temperature = new BigDecimal("1");
  private BigDecimal topP = new BigDecimal("1");

  /**
   */
  public CreateEditRequest model(CreateEditRequestModel model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("model")
  public CreateEditRequestModel getModel() {
    return model;
  }
  public void setModel(CreateEditRequestModel model) {
    this.model = model;
  }

  /**
   * The input text to use as a starting point for the edit.
   */
  public CreateEditRequest input(String input) {
    this.input = input;
    return this;
  }

  
  @ApiModelProperty(example = "What day of the wek is it?", value = "The input text to use as a starting point for the edit.")
  @JsonProperty("input")
  public String getInput() {
    return input;
  }
  public void setInput(String input) {
    this.input = input;
  }

  /**
   * The instruction that tells the model how to edit the prompt.
   */
  public CreateEditRequest instruction(String instruction) {
    this.instruction = instruction;
    return this;
  }

  
  @ApiModelProperty(example = "Fix the spelling mistakes.", required = true, value = "The instruction that tells the model how to edit the prompt.")
  @JsonProperty("instruction")
  public String getInstruction() {
    return instruction;
  }
  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }

  /**
   * How many edits to generate for the input and instruction.
   * minimum: 1
   * maximum: 20
   */
  public CreateEditRequest n(Integer n) {
    this.n = n;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "How many edits to generate for the input and instruction.")
  @JsonProperty("n")
  public Integer getN() {
    return n;
  }
  public void setN(Integer n) {
    this.n = n;
  }

  /**
   * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
   * minimum: 0
   * maximum: 2
   */
  public CreateEditRequest temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. ")
  @JsonProperty("temperature")
  public BigDecimal getTemperature() {
    return temperature;
  }
  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  /**
   * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
   * minimum: 0
   * maximum: 1
   */
  public CreateEditRequest topP(BigDecimal topP) {
    this.topP = topP;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. ")
  @JsonProperty("top_p")
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
    return Objects.equals(model, createEditRequest.model) &&
        Objects.equals(input, createEditRequest.input) &&
        Objects.equals(instruction, createEditRequest.instruction) &&
        Objects.equals(n, createEditRequest.n) &&
        Objects.equals(temperature, createEditRequest.temperature) &&
        Objects.equals(topP, createEditRequest.topP);
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

