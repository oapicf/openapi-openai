package org.openapitools.model;

import org.openapitools.model.CreateFineTuningJobRequestIntegrationsInnerWandb;
import org.openapitools.model.FineTuningIntegration;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class FineTuningJobIntegrationsInner  {
  
public enum TypeEnum {

WANDB(String.valueOf("wandb"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "The type of the integration being enabled for the fine-tuning job")
 /**
   * The type of the integration being enabled for the fine-tuning job
  **/
  private TypeEnum type;

  @ApiModelProperty(required = true, value = "")
  private CreateFineTuningJobRequestIntegrationsInnerWandb wandb;
 /**
   * The type of the integration being enabled for the fine-tuning job
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public FineTuningJobIntegrationsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Get wandb
   * @return wandb
  **/
  @JsonProperty("wandb")
  public CreateFineTuningJobRequestIntegrationsInnerWandb getWandb() {
    return wandb;
  }

  public void setWandb(CreateFineTuningJobRequestIntegrationsInnerWandb wandb) {
    this.wandb = wandb;
  }

  public FineTuningJobIntegrationsInner wandb(CreateFineTuningJobRequestIntegrationsInnerWandb wandb) {
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
    FineTuningJobIntegrationsInner fineTuningJobIntegrationsInner = (FineTuningJobIntegrationsInner) o;
    return Objects.equals(this.type, fineTuningJobIntegrationsInner.type) &&
        Objects.equals(this.wandb, fineTuningJobIntegrationsInner.wandb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, wandb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTuningJobIntegrationsInner {\n");
    
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

