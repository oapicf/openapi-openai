package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FineTuneSupervisedMethodHyperparameters;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Configuration for the supervised fine-tuning method.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Configuration for the supervised fine-tuning method.")
public class FineTuneSupervisedMethod   {
  
  private FineTuneSupervisedMethodHyperparameters hyperparameters;

  /**
   **/
  public FineTuneSupervisedMethod hyperparameters(FineTuneSupervisedMethodHyperparameters hyperparameters) {
    this.hyperparameters = hyperparameters;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("hyperparameters")
  public FineTuneSupervisedMethodHyperparameters getHyperparameters() {
    return hyperparameters;
  }
  public void setHyperparameters(FineTuneSupervisedMethodHyperparameters hyperparameters) {
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
    FineTuneSupervisedMethod fineTuneSupervisedMethod = (FineTuneSupervisedMethod) o;
    return Objects.equals(this.hyperparameters, fineTuneSupervisedMethod.hyperparameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hyperparameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTuneSupervisedMethod {\n");
    
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

