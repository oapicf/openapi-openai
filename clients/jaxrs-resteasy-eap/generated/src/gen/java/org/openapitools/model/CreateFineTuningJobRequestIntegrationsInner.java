package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CreateFineTuningJobRequestIntegrationsInnerType;
import org.openapitools.model.CreateFineTuningJobRequestIntegrationsInnerWandb;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-11-03T11:08:59.005260670Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateFineTuningJobRequestIntegrationsInner   {
  
  private CreateFineTuningJobRequestIntegrationsInnerType type;
  private CreateFineTuningJobRequestIntegrationsInnerWandb wandb;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  @NotNull
  public CreateFineTuningJobRequestIntegrationsInnerType getType() {
    return type;
  }
  public void setType(CreateFineTuningJobRequestIntegrationsInnerType type) {
    this.type = type;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("wandb")
  @NotNull
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

