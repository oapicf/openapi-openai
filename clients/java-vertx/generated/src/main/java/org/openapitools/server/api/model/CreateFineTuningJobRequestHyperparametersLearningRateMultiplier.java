package org.openapitools.server.api.model;

import java.util.Objects;
import java.math.BigDecimal;

/**
 * Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateFineTuningJobRequestHyperparametersLearningRateMultiplier   {
  

  public CreateFineTuningJobRequestHyperparametersLearningRateMultiplier () {

  }

  public CreateFineTuningJobRequestHyperparametersLearningRateMultiplier () {
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFineTuningJobRequestHyperparametersLearningRateMultiplier createFineTuningJobRequestHyperparametersLearningRateMultiplier = (CreateFineTuningJobRequestHyperparametersLearningRateMultiplier) o;return true;
  }

  @Override
  public int hashCode() {
    return 1;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
