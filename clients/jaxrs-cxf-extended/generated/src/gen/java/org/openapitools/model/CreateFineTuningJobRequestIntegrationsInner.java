package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.CreateFineTuningJobRequestIntegrationsInnerType;
import org.openapitools.model.CreateFineTuningJobRequestIntegrationsInnerWandb;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateFineTuningJobRequestIntegrationsInner  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CreateFineTuningJobRequestIntegrationsInnerType type;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CreateFineTuningJobRequestIntegrationsInnerWandb wandb;
 /**
  * Get type
  * @return type
  */
  @JsonProperty("type")
  @NotNull
  public CreateFineTuningJobRequestIntegrationsInnerType getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(CreateFineTuningJobRequestIntegrationsInnerType type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public CreateFineTuningJobRequestIntegrationsInner type(CreateFineTuningJobRequestIntegrationsInnerType type) {
    this.type = type;
    return this;
  }

 /**
  * Get wandb
  * @return wandb
  */
  @JsonProperty("wandb")
  @NotNull
  public CreateFineTuningJobRequestIntegrationsInnerWandb getWandb() {
    return wandb;
  }

  /**
   * Sets the <code>wandb</code> property.
   */
 public void setWandb(CreateFineTuningJobRequestIntegrationsInnerWandb wandb) {
    this.wandb = wandb;
  }

  /**
   * Sets the <code>wandb</code> property.
   */
  public CreateFineTuningJobRequestIntegrationsInner wandb(CreateFineTuningJobRequestIntegrationsInnerWandb wandb) {
    this.wandb = wandb;
    return this;
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
    return Objects.equals(this.type, createFineTuningJobRequestIntegrationsInner.type) &&
        Objects.equals(this.wandb, createFineTuningJobRequestIntegrationsInner.wandb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, wandb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFineTuningJobRequestIntegrationsInner {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    wandb: ").append(toIndentedString(wandb)).append("\n");
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

