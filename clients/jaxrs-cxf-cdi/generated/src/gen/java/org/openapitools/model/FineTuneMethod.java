package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FineTuneDPOMethod;
import org.openapitools.model.FineTuneSupervisedMethod;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The method used for fine-tuning.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "The method used for fine-tuning.")
public class FineTuneMethod   {
  

public enum TypeEnum {

    @JsonProperty("supervised") SUPERVISED(String.valueOf("supervised")), @JsonProperty("dpo") DPO(String.valueOf("dpo"));


    private String value;

    TypeEnum(String v) {
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

  private TypeEnum type;

  private FineTuneSupervisedMethod supervised;

  private FineTuneDPOMethod dpo;

  /**
   * The type of method. Is either &#x60;supervised&#x60; or &#x60;dpo&#x60;.
   **/
  public FineTuneMethod type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "The type of method. Is either `supervised` or `dpo`.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   **/
  public FineTuneMethod supervised(FineTuneSupervisedMethod supervised) {
    this.supervised = supervised;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("supervised")
  public FineTuneSupervisedMethod getSupervised() {
    return supervised;
  }
  public void setSupervised(FineTuneSupervisedMethod supervised) {
    this.supervised = supervised;
  }


  /**
   **/
  public FineTuneMethod dpo(FineTuneDPOMethod dpo) {
    this.dpo = dpo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dpo")
  public FineTuneDPOMethod getDpo() {
    return dpo;
  }
  public void setDpo(FineTuneDPOMethod dpo) {
    this.dpo = dpo;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

