package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;



/**
 * The type of integration to enable. Currently, only \&quot;wandb\&quot; (Weights and Biases) is supported. 
 **/

@ApiModel(description = "The type of integration to enable. Currently, only \"wandb\" (Weights and Biases) is supported. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-03T11:06:32.740431132Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateFineTuningJobRequestIntegrationsInnerType   {

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFineTuningJobRequestIntegrationsInnerType createFineTuningJobRequestIntegrationsInnerType = (CreateFineTuningJobRequestIntegrationsInnerType) o;return true;
  }

  @Override
  public int hashCode() {
    return 1;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFineTuningJobRequestIntegrationsInnerType {\n");
    
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

