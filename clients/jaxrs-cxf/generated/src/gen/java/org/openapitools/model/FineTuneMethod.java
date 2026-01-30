package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.FineTuneDPOMethod;
import org.openapitools.model.FineTuneSupervisedMethod;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The method used for fine-tuning.
 */
@ApiModel(description="The method used for fine-tuning.")

public class FineTuneMethod  {
  
public enum TypeEnum {

SUPERVISED(String.valueOf("supervised")), DPO(String.valueOf("dpo"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

 /**
  * The type of method. Is either `supervised` or `dpo`.
  */
  @ApiModelProperty(value = "The type of method. Is either `supervised` or `dpo`.")

  private TypeEnum type;

  @ApiModelProperty(value = "")

  @Valid

  private FineTuneSupervisedMethod supervised;

  @ApiModelProperty(value = "")

  @Valid

  private FineTuneDPOMethod dpo;
 /**
   * The type of method. Is either &#x60;supervised&#x60; or &#x60;dpo&#x60;.
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

  public FineTuneMethod type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Get supervised
   * @return supervised
  **/
  @JsonProperty("supervised")
  public FineTuneSupervisedMethod getSupervised() {
    return supervised;
  }

  public void setSupervised(FineTuneSupervisedMethod supervised) {
    this.supervised = supervised;
  }

  public FineTuneMethod supervised(FineTuneSupervisedMethod supervised) {
    this.supervised = supervised;
    return this;
  }

 /**
   * Get dpo
   * @return dpo
  **/
  @JsonProperty("dpo")
  public FineTuneDPOMethod getDpo() {
    return dpo;
  }

  public void setDpo(FineTuneDPOMethod dpo) {
    this.dpo = dpo;
  }

  public FineTuneMethod dpo(FineTuneDPOMethod dpo) {
    this.dpo = dpo;
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
    FineTuneMethod fineTuneMethod = (FineTuneMethod) o;
    return Objects.equals(this.type, fineTuneMethod.type) &&
        Objects.equals(this.supervised, fineTuneMethod.supervised) &&
        Objects.equals(this.dpo, fineTuneMethod.dpo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, supervised, dpo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTuneMethod {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    supervised: ").append(toIndentedString(supervised)).append("\n");
    sb.append("    dpo: ").append(toIndentedString(dpo)).append("\n");
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

