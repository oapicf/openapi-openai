package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FineTuneDPOMethodHyperparameters;

/**
 * Configuration for the DPO fine-tuning method.
 */
@ApiModel(description = "Configuration for the DPO fine-tuning method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuneDPOMethod   {
  @JsonProperty("hyperparameters")
  private FineTuneDPOMethodHyperparameters hyperparameters;

  public FineTuneDPOMethod hyperparameters(FineTuneDPOMethodHyperparameters hyperparameters) {
    this.hyperparameters = hyperparameters;
    return this;
  }

   /**
   * Get hyperparameters
   * @return hyperparameters
  **/
  @ApiModelProperty(value = "")
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

