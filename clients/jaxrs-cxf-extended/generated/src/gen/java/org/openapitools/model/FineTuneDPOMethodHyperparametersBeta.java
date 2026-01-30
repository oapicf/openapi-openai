package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The beta value for the DPO method. A higher beta value will increase the weight of the penalty between the policy and reference model. 
 */
@ApiModel(description="The beta value for the DPO method. A higher beta value will increase the weight of the penalty between the policy and reference model. ")

public class FineTuneDPOMethodHyperparametersBeta  {
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FineTuneDPOMethodHyperparametersBeta fineTuneDPOMethodHyperparametersBeta = (FineTuneDPOMethodHyperparametersBeta) o;return true;
  }

  @Override
  public int hashCode() {
    return 1;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTuneDPOMethodHyperparametersBeta {\n");
    
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

