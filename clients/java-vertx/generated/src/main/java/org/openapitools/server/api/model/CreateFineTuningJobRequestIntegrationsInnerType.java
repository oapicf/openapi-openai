package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * The type of integration to enable. Currently, only \&quot;wandb\&quot; (Weights and Biases) is supported. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateFineTuningJobRequestIntegrationsInnerType   {
  

  public CreateFineTuningJobRequestIntegrationsInnerType () {

  }

  public CreateFineTuningJobRequestIntegrationsInnerType () {
  }


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
