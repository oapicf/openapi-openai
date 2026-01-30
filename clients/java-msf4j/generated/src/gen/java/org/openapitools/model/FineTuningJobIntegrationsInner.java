package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CreateFineTuningJobRequestIntegrationsInnerWandb;
import org.openapitools.model.FineTuningIntegration;

/**
 * FineTuningJobIntegrationsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuningJobIntegrationsInner   {
  /**
   * The type of the integration being enabled for the fine-tuning job
   */
  public enum TypeEnum {
    WANDB("wandb");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("wandb")
  private CreateFineTuningJobRequestIntegrationsInnerWandb wandb;

  public FineTuningJobIntegrationsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the integration being enabled for the fine-tuning job
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of the integration being enabled for the fine-tuning job")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public FineTuningJobIntegrationsInner wandb(CreateFineTuningJobRequestIntegrationsInnerWandb wandb) {
    this.wandb = wandb;
    return this;
  }

   /**
   * Get wandb
   * @return wandb
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

