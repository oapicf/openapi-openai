package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * The name of the model to fine-tune. You can select one of the [supported models](/docs/guides/fine-tuning#which-models-can-be-fine-tuned). 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateFineTuningJobRequestModel   {
  

  public CreateFineTuningJobRequestModel () {

  }

  public CreateFineTuningJobRequestModel () {
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFineTuningJobRequestModel createFineTuningJobRequestModel = (CreateFineTuningJobRequestModel) o;return true;
  }

  @Override
  public int hashCode() {
    return 1;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFineTuningJobRequestModel {\n");
    
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
