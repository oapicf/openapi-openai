package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.FineTuneDPOMethod;
import org.openapitools.vertxweb.server.model.FineTuneSupervisedMethod;

/**
 * The method used for fine-tuning.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FineTuneMethod   {
  


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
      return value;
    }
  }

  private TypeEnum type;
  private FineTuneSupervisedMethod supervised;
  private FineTuneDPOMethod dpo;

  public FineTuneMethod () {

  }

  public FineTuneMethod (TypeEnum type, FineTuneSupervisedMethod supervised, FineTuneDPOMethod dpo) {
    this.type = type;
    this.supervised = supervised;
    this.dpo = dpo;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
  @JsonProperty("supervised")
  public FineTuneSupervisedMethod getSupervised() {
    return supervised;
  }
  public void setSupervised(FineTuneSupervisedMethod supervised) {
    this.supervised = supervised;
  }

    
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
