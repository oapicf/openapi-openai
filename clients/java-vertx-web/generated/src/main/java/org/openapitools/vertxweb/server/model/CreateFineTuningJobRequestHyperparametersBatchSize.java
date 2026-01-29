package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateFineTuningJobRequestHyperparametersBatchSize   {
  

  public CreateFineTuningJobRequestHyperparametersBatchSize () {

  }

  public CreateFineTuningJobRequestHyperparametersBatchSize () {
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFineTuningJobRequestHyperparametersBatchSize createFineTuningJobRequestHyperparametersBatchSize = (CreateFineTuningJobRequestHyperparametersBatchSize) o;return true;
  }

  @Override
  public int hashCode() {
    return 1;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFineTuningJobRequestHyperparametersBatchSize {\n");
    
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
