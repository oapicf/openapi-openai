package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FineTuneSupervisedMethodHyperparameters;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Configuration for the supervised fine-tuning method.
 **/
@ApiModel(description = "Configuration for the supervised fine-tuning method.")
@JsonTypeName("FineTuneSupervisedMethod")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuneSupervisedMethod   {
  private FineTuneSupervisedMethodHyperparameters hyperparameters;

  public FineTuneSupervisedMethod() {
  }

  /**
   **/
  public FineTuneSupervisedMethod hyperparameters(FineTuneSupervisedMethodHyperparameters hyperparameters) {
    this.hyperparameters = hyperparameters;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("hyperparameters")
  @Valid public FineTuneSupervisedMethodHyperparameters getHyperparameters() {
    return hyperparameters;
  }

  @JsonProperty("hyperparameters")
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

