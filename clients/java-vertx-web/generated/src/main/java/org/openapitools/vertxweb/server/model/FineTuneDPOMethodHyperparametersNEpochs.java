package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FineTuneDPOMethodHyperparametersNEpochs   {
  

  public FineTuneDPOMethodHyperparametersNEpochs () {

  }

  public FineTuneDPOMethodHyperparametersNEpochs () {
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FineTuneDPOMethodHyperparametersNEpochs fineTuneDPOMethodHyperparametersNEpochs = (FineTuneDPOMethodHyperparametersNEpochs) o;return true;
  }

  @Override
  public int hashCode() {
    return 1;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTuneDPOMethodHyperparametersNEpochs {\n");
    
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
