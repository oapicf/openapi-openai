package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FineTuneDPOMethod;
import org.openapitools.model.FineTuneSupervisedMethod;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="The method used for fine-tuning.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuneMethod   {
  

  /**
   * The type of method. Is either &#x60;supervised&#x60; or &#x60;dpo&#x60;.
   */
  public enum TypeEnum {
    SUPERVISED("supervised"),

        DPO("dpo");
    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TypeEnum type;
  private FineTuneSupervisedMethod supervised;
  private FineTuneDPOMethod dpo;

  /**
   * The type of method. Is either &#x60;supervised&#x60; or &#x60;dpo&#x60;.
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("supervised")
  @Valid
  public FineTuneSupervisedMethod getSupervised() {
    return supervised;
  }
  public void setSupervised(FineTuneSupervisedMethod supervised) {
    this.supervised = supervised;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dpo")
  @Valid
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

