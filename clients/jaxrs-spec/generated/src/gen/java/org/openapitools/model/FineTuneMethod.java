package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FineTuneDPOMethod;
import org.openapitools.model.FineTuneSupervisedMethod;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The method used for fine-tuning.
 **/
@ApiModel(description = "The method used for fine-tuning.")
@JsonTypeName("FineTuneMethod")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuneMethod   {
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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static TypeEnum fromString(String s) {
        for (TypeEnum b : TypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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
  private FineTuneSupervisedMethod supervised;
  private FineTuneDPOMethod dpo;

  public FineTuneMethod() {
  }

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

  @JsonProperty("type")
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
  @Valid public FineTuneSupervisedMethod getSupervised() {
    return supervised;
  }

  @JsonProperty("supervised")
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
  @Valid public FineTuneDPOMethod getDpo() {
    return dpo;
  }

  @JsonProperty("dpo")
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

