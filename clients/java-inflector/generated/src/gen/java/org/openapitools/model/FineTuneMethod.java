package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FineTuneDPOMethod;
import org.openapitools.model.FineTuneSupervisedMethod;



/**
 * The method used for fine-tuning.
 **/

@ApiModel(description = "The method used for fine-tuning.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuneMethod   {
  /**
   * The type of method. Is either `supervised` or `dpo`.
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

  @JsonProperty("supervised")
  private FineTuneSupervisedMethod supervised;

  @JsonProperty("dpo")
  private FineTuneDPOMethod dpo;

  /**
   * The type of method. Is either `supervised` or `dpo`.
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
    return Objects.equals(type, fineTuneMethod.type) &&
        Objects.equals(supervised, fineTuneMethod.supervised) &&
        Objects.equals(dpo, fineTuneMethod.dpo);
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

