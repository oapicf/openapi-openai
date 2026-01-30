package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.CreateFineTuningJobRequestIntegrationsInnerWandb;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CreateFineTuningJobRequestIntegrationsInner
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateFineTuningJobRequestIntegrationsInner   {
  /**
   * Gets or Sets type
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

  public CreateFineTuningJobRequestIntegrationsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @ApiModelProperty(required = true, value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public CreateFineTuningJobRequestIntegrationsInner wandb(CreateFineTuningJobRequestIntegrationsInnerWandb wandb) {
    this.wandb = wandb;
    return this;
  }

  /**
   * Get wandb
   * @return wandb
   */
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

