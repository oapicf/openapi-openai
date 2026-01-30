package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.FineTuneDPOMethodHyperparameters;

/**
 * Configuration for the DPO fine-tuning method.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FineTuneDPOMethod   {
  
  private FineTuneDPOMethodHyperparameters hyperparameters;

  public FineTuneDPOMethod () {

  }

  public FineTuneDPOMethod (FineTuneDPOMethodHyperparameters hyperparameters) {
    this.hyperparameters = hyperparameters;
  }

    
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
    return Objects.equals(hyperparameters, fineTuneDPOMethod.hyperparameters);
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
