package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-16T01:12:27.532392463Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateModerationResponseResultsInnerCategories   {
  @JsonProperty("hate")
  private Boolean hate;

  @JsonProperty("hate/threatening")
  private Boolean hateThreatening;

  @JsonProperty("self-harm")
  private Boolean selfHarm;

  @JsonProperty("sexual")
  private Boolean sexual;

  @JsonProperty("sexual/minors")
  private Boolean sexualMinors;

  @JsonProperty("violence")
  private Boolean violence;

  @JsonProperty("violence/graphic")
  private Boolean violenceGraphic;

  /**
   **/
  public CreateModerationResponseResultsInnerCategories hate(Boolean hate) {
    this.hate = hate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("hate")
  public Boolean getHate() {
    return hate;
  }
  public void setHate(Boolean hate) {
    this.hate = hate;
  }

  /**
   **/
  public CreateModerationResponseResultsInnerCategories hateThreatening(Boolean hateThreatening) {
    this.hateThreatening = hateThreatening;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("hate/threatening")
  public Boolean getHateThreatening() {
    return hateThreatening;
  }
  public void setHateThreatening(Boolean hateThreatening) {
    this.hateThreatening = hateThreatening;
  }

  /**
   **/
  public CreateModerationResponseResultsInnerCategories selfHarm(Boolean selfHarm) {
    this.selfHarm = selfHarm;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("self-harm")
  public Boolean getSelfHarm() {
    return selfHarm;
  }
  public void setSelfHarm(Boolean selfHarm) {
    this.selfHarm = selfHarm;
  }

  /**
   **/
  public CreateModerationResponseResultsInnerCategories sexual(Boolean sexual) {
    this.sexual = sexual;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("sexual")
  public Boolean getSexual() {
    return sexual;
  }
  public void setSexual(Boolean sexual) {
    this.sexual = sexual;
  }

  /**
   **/
  public CreateModerationResponseResultsInnerCategories sexualMinors(Boolean sexualMinors) {
    this.sexualMinors = sexualMinors;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("sexual/minors")
  public Boolean getSexualMinors() {
    return sexualMinors;
  }
  public void setSexualMinors(Boolean sexualMinors) {
    this.sexualMinors = sexualMinors;
  }

  /**
   **/
  public CreateModerationResponseResultsInnerCategories violence(Boolean violence) {
    this.violence = violence;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("violence")
  public Boolean getViolence() {
    return violence;
  }
  public void setViolence(Boolean violence) {
    this.violence = violence;
  }

  /**
   **/
  public CreateModerationResponseResultsInnerCategories violenceGraphic(Boolean violenceGraphic) {
    this.violenceGraphic = violenceGraphic;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("violence/graphic")
  public Boolean getViolenceGraphic() {
    return violenceGraphic;
  }
  public void setViolenceGraphic(Boolean violenceGraphic) {
    this.violenceGraphic = violenceGraphic;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateModerationResponseResultsInnerCategories createModerationResponseResultsInnerCategories = (CreateModerationResponseResultsInnerCategories) o;
    return Objects.equals(hate, createModerationResponseResultsInnerCategories.hate) &&
        Objects.equals(hateThreatening, createModerationResponseResultsInnerCategories.hateThreatening) &&
        Objects.equals(selfHarm, createModerationResponseResultsInnerCategories.selfHarm) &&
        Objects.equals(sexual, createModerationResponseResultsInnerCategories.sexual) &&
        Objects.equals(sexualMinors, createModerationResponseResultsInnerCategories.sexualMinors) &&
        Objects.equals(violence, createModerationResponseResultsInnerCategories.violence) &&
        Objects.equals(violenceGraphic, createModerationResponseResultsInnerCategories.violenceGraphic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hate, hateThreatening, selfHarm, sexual, sexualMinors, violence, violenceGraphic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationResponseResultsInnerCategories {\n");
    
    sb.append("    hate: ").append(toIndentedString(hate)).append("\n");
    sb.append("    hateThreatening: ").append(toIndentedString(hateThreatening)).append("\n");
    sb.append("    selfHarm: ").append(toIndentedString(selfHarm)).append("\n");
    sb.append("    sexual: ").append(toIndentedString(sexual)).append("\n");
    sb.append("    sexualMinors: ").append(toIndentedString(sexualMinors)).append("\n");
    sb.append("    violence: ").append(toIndentedString(violence)).append("\n");
    sb.append("    violenceGraphic: ").append(toIndentedString(violenceGraphic)).append("\n");
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

