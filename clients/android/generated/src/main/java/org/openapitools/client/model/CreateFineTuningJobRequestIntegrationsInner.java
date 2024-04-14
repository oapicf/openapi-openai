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

import org.openapitools.client.model.CreateFineTuningJobRequestIntegrationsInnerType;
import org.openapitools.client.model.CreateFineTuningJobRequestIntegrationsInnerWandb;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CreateFineTuningJobRequestIntegrationsInner {
  
  @SerializedName("type")
  private CreateFineTuningJobRequestIntegrationsInnerType type = null;
  @SerializedName("wandb")
  private CreateFineTuningJobRequestIntegrationsInnerWandb wandb = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CreateFineTuningJobRequestIntegrationsInnerType getType() {
    return type;
  }
  public void setType(CreateFineTuningJobRequestIntegrationsInnerType type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CreateFineTuningJobRequestIntegrationsInnerWandb getWandb() {
    return wandb;
  }
  public void setWandb(CreateFineTuningJobRequestIntegrationsInnerWandb wandb) {
    this.wandb = wandb;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFineTuningJobRequestIntegrationsInner createFineTuningJobRequestIntegrationsInner = (CreateFineTuningJobRequestIntegrationsInner) o;
    return (this.type == null ? createFineTuningJobRequestIntegrationsInner.type == null : this.type.equals(createFineTuningJobRequestIntegrationsInner.type)) &&
        (this.wandb == null ? createFineTuningJobRequestIntegrationsInner.wandb == null : this.wandb.equals(createFineTuningJobRequestIntegrationsInner.wandb));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.wandb == null ? 0: this.wandb.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFineTuningJobRequestIntegrationsInner {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  wandb: ").append(wandb).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
