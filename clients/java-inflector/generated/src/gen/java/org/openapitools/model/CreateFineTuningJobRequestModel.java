package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;



/**
 * The name of the model to fine-tune. You can select one of the [supported models](/docs/guides/fine-tuning/what-models-can-be-fine-tuned). 
 **/

@ApiModel(description = "The name of the model to fine-tune. You can select one of the [supported models](/docs/guides/fine-tuning/what-models-can-be-fine-tuned). ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-03T11:06:32.740431132Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateFineTuningJobRequestModel   {

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

