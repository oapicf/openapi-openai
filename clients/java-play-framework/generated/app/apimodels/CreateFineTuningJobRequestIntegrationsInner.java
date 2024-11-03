package apimodels;

import apimodels.CreateFineTuningJobRequestIntegrationsInnerType;
import apimodels.CreateFineTuningJobRequestIntegrationsInnerWandb;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateFineTuningJobRequestIntegrationsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-03T11:07:27.411323426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateFineTuningJobRequestIntegrationsInner   {
  @JsonProperty("type")
  @NotNull
@Valid

  private CreateFineTuningJobRequestIntegrationsInnerType type;

  @JsonProperty("wandb")
  @NotNull
@Valid

  private CreateFineTuningJobRequestIntegrationsInnerWandb wandb;

  public CreateFineTuningJobRequestIntegrationsInner type(CreateFineTuningJobRequestIntegrationsInnerType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public CreateFineTuningJobRequestIntegrationsInnerType getType() {
    return type;
  }

  public void setType(CreateFineTuningJobRequestIntegrationsInnerType type) {
    this.type = type;
  }

  public CreateFineTuningJobRequestIntegrationsInner wandb(CreateFineTuningJobRequestIntegrationsInnerWandb wandb) {
    this.wandb = wandb;
    return this;
  }

   /**
   * Get wandb
   * @return wandb
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

