package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FineTuneDPOMethodHyperparameters;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Configuration for the DPO fine-tuning method.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuneDPOMethod   {
  
  private FineTuneDPOMethodHyperparameters hyperparameters;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hyperparameters")
  public FineTuneDPOMethodHyperparameters getHyperparameters() {
    return hyperparameters;
  }
  public void setHyperparameters(FineTuneDPOMethodHyperparameters hyperparameters) {
    this.hyperparameters = hyperparameters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FineTuneDPOMethod fineTuneDPOMethod = (FineTuneDPOMethod) o;
    return Objects.equals(this.hyperparameters, fineTuneDPOMethod.hyperparameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hyperparameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTuneDPOMethod {\n");
    
    sb.append("    hyperparameters: ").append(toIndentedString(hyperparameters)).append("\n");
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

