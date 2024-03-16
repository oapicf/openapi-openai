package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("CreateModerationResponse_results_inner_categories")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-16T01:13:46.302927795Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateModerationResponseResultsInnerCategories   {
  private @Valid Boolean hate;
  private @Valid Boolean hateThreatening;
  private @Valid Boolean selfHarm;
  private @Valid Boolean sexual;
  private @Valid Boolean sexualMinors;
  private @Valid Boolean violence;
  private @Valid Boolean violenceGraphic;

  /**
   **/
  public CreateModerationResponseResultsInnerCategories hate(Boolean hate) {
    this.hate = hate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("hate")
  @NotNull
  public Boolean getHate() {
    return hate;
  }

  @JsonProperty("hate")
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
  @NotNull
  public Boolean getHateThreatening() {
    return hateThreatening;
  }

  @JsonProperty("hate/threatening")
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
  @NotNull
  public Boolean getSelfHarm() {
    return selfHarm;
  }

  @JsonProperty("self-harm")
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
  @NotNull
  public Boolean getSexual() {
    return sexual;
  }

  @JsonProperty("sexual")
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
  @NotNull
  public Boolean getSexualMinors() {
    return sexualMinors;
  }

  @JsonProperty("sexual/minors")
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
  @NotNull
  public Boolean getViolence() {
    return violence;
  }

  @JsonProperty("violence")
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
  @NotNull
  public Boolean getViolenceGraphic() {
    return violenceGraphic;
  }

  @JsonProperty("violence/graphic")
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
    return Objects.equals(this.hate, createModerationResponseResultsInnerCategories.hate) &&
        Objects.equals(this.hateThreatening, createModerationResponseResultsInnerCategories.hateThreatening) &&
        Objects.equals(this.selfHarm, createModerationResponseResultsInnerCategories.selfHarm) &&
        Objects.equals(this.sexual, createModerationResponseResultsInnerCategories.sexual) &&
        Objects.equals(this.sexualMinors, createModerationResponseResultsInnerCategories.sexualMinors) &&
        Objects.equals(this.violence, createModerationResponseResultsInnerCategories.violence) &&
        Objects.equals(this.violenceGraphic, createModerationResponseResultsInnerCategories.violenceGraphic);
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

