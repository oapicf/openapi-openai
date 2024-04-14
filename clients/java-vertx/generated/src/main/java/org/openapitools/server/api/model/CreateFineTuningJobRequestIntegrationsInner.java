package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.CreateFineTuningJobRequestIntegrationsInnerType;
import org.openapitools.server.api.model.CreateFineTuningJobRequestIntegrationsInnerWandb;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateFineTuningJobRequestIntegrationsInner   {
  
  private CreateFineTuningJobRequestIntegrationsInnerType type;
  private CreateFineTuningJobRequestIntegrationsInnerWandb wandb;

  public CreateFineTuningJobRequestIntegrationsInner () {

  }

  public CreateFineTuningJobRequestIntegrationsInner (CreateFineTuningJobRequestIntegrationsInnerType type, CreateFineTuningJobRequestIntegrationsInnerWandb wandb) {
    this.type = type;
    this.wandb = wandb;
  }

    
  @JsonProperty("type")
  public CreateFineTuningJobRequestIntegrationsInnerType getType() {
    return type;
  }
  public void setType(CreateFineTuningJobRequestIntegrationsInnerType type) {
    this.type = type;
  }

    
  @JsonProperty("wandb")
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
    return Objects.equals(type, createFineTuningJobRequestIntegrationsInner.type) &&
        Objects.equals(wandb, createFineTuningJobRequestIntegrationsInner.wandb);
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
