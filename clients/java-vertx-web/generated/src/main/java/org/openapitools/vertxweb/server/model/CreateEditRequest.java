package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CreateEditRequestModel;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateEditRequest   {
  
  private CreateEditRequestModel model;
  private String input = "";
  private String instruction;
  private Integer n = 1;
  private BigDecimal temperature = new BigDecimal("1");
  private BigDecimal topP = new BigDecimal("1");

  public CreateEditRequest () {

  }

  public CreateEditRequest (CreateEditRequestModel model, String input, String instruction, Integer n, BigDecimal temperature, BigDecimal topP) {
    this.model = model;
    this.input = input;
    this.instruction = instruction;
    this.n = n;
    this.temperature = temperature;
    this.topP = topP;
  }

    
  @JsonProperty("model")
  public CreateEditRequestModel getModel() {
    return model;
  }
  public void setModel(CreateEditRequestModel model) {
    this.model = model;
  }

    
  @JsonProperty("input")
  public String getInput() {
    return input;
  }
  public void setInput(String input) {
    this.input = input;
  }

    
  @JsonProperty("instruction")
  public String getInstruction() {
    return instruction;
  }
  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }

    
  @JsonProperty("n")
  public Integer getN() {
    return n;
  }
  public void setN(Integer n) {
    this.n = n;
  }

    
  @JsonProperty("temperature")
  public BigDecimal getTemperature() {
    return temperature;
  }
  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

    
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
