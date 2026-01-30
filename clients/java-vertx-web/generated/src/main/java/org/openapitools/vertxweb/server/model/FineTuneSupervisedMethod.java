package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.FineTuneSupervisedMethodHyperparameters;

/**
 * Configuration for the supervised fine-tuning method.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FineTuneSupervisedMethod   {
  
  private FineTuneSupervisedMethodHyperparameters hyperparameters;

  public FineTuneSupervisedMethod () {

  }

  public FineTuneSupervisedMethod (FineTuneSupervisedMethodHyperparameters hyperparameters) {
    this.hyperparameters = hyperparameters;
  }

    
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
    return Objects.equals(hyperparameters, fineTuneSupervisedMethod.hyperparameters);
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
