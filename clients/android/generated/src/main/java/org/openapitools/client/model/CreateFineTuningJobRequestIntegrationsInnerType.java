/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The type of integration to enable. Currently, only \&quot;wandb\&quot; (Weights and Biases) is supported. 
 **/
@ApiModel(description = "The type of integration to enable. Currently, only \"wandb\" (Weights and Biases) is supported. ")
public class CreateFineTuningJobRequestIntegrationsInnerType {
  


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFineTuningJobRequestIntegrationsInnerType createFineTuningJobRequestIntegrationsInnerType = (CreateFineTuningJobRequestIntegrationsInnerType) o;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 17;
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFineTuningJobRequestIntegrationsInnerType {\n");
    
    sb.append("}\n");
    return sb.toString();
  }
}