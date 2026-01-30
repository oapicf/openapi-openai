package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.FineTuneSupervisedMethodHyperparameters;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Configuration for the supervised fine-tuning method.
 */
@ApiModel(description = "Configuration for the supervised fine-tuning method.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuneSupervisedMethod   {
  @JsonProperty("hyperparameters")
  private FineTuneSupervisedMethodHyperparameters hyperparameters;

  public FineTuneSupervisedMethod hyperparameters(FineTuneSupervisedMethodHyperparameters hyperparameters) {
    this.hyperparameters = hyperparameters;
    return this;
  }

  /**
   * Get hyperparameters
   * @return hyperparameters
   */
  @ApiModelProperty(value = "")
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

