package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting. 
 **/
@ApiModel(description="Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting. ")

public class CreateFineTuningJobRequestHyperparametersLearningRateMultiplier  {
    @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFineTuningJobRequestHyperparametersLearningRateMultiplier createFineTuningJobRequestHyperparametersLearningRateMultiplier = (CreateFineTuningJobRequestHyperparametersLearningRateMultiplier) o;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFineTuningJobRequestHyperparametersLearningRateMultiplier {\n");
    
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

