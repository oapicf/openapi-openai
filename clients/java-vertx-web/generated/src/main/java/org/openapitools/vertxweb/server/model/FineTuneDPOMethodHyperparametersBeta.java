package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import java.math.BigDecimal;

/**
 * The beta value for the DPO method. A higher beta value will increase the weight of the penalty between the policy and reference model. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FineTuneDPOMethodHyperparametersBeta   {
  

  public FineTuneDPOMethodHyperparametersBeta () {

  }

  public FineTuneDPOMethodHyperparametersBeta () {
  }


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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
