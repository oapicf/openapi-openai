package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.CreateFineTuningJobRequestIntegrationsInnerWandb;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateFineTuningJobRequestIntegrationsInner
 */

@JsonTypeName("CreateFineTuningJobRequest_integrations_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T10:48:36.973220935Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateFineTuningJobRequestIntegrationsInner {

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    WANDB("wandb");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private CreateFineTuningJobRequestIntegrationsInnerWandb wandb;

  public CreateFineTuningJobRequestIntegrationsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateFineTuningJobRequestIntegrationsInner(TypeEnum type, CreateFineTuningJobRequestIntegrationsInnerWandb wandb) {
    this.type = type;
    this.wandb = wandb;
  }

  public CreateFineTuningJobRequestIntegrationsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @NotNull 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
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
  @NotNull @Valid 
  @Schema(name = "wandb", requiredMode = Schema.RequiredMode.REQUIRED)
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

