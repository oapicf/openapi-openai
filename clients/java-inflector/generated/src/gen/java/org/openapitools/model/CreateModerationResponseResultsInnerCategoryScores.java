package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-16T01:12:27.532392463Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateModerationResponseResultsInnerCategoryScores   {
  @JsonProperty("hate")
  private BigDecimal hate;

  @JsonProperty("hate/threatening")
  private BigDecimal hateThreatening;

  @JsonProperty("self-harm")
  private BigDecimal selfHarm;

  @JsonProperty("sexual")
  private BigDecimal sexual;

  @JsonProperty("sexual/minors")
  private BigDecimal sexualMinors;

  @JsonProperty("violence")
  private BigDecimal violence;

  @JsonProperty("violence/graphic")
  private BigDecimal violenceGraphic;

  /**
   **/
  public CreateModerationResponseResultsInnerCategoryScores hate(BigDecimal hate) {
    this.hate = hate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("hate")
  public BigDecimal getHate() {
    return hate;
  }
  public void setHate(BigDecimal hate) {
    this.hate = hate;
  }

  /**
   **/
  public CreateModerationResponseResultsInnerCategoryScores hateThreatening(BigDecimal hateThreatening) {
    this.hateThreatening = hateThreatening;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("hate/threatening")
  public BigDecimal getHateThreatening() {
    return hateThreatening;
  }
  public void setHateThreatening(BigDecimal hateThreatening) {
    this.hateThreatening = hateThreatening;
  }

  /**
   **/
  public CreateModerationResponseResultsInnerCategoryScores selfHarm(BigDecimal selfHarm) {
    this.selfHarm = selfHarm;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("self-harm")
  public BigDecimal getSelfHarm() {
    return selfHarm;
  }
  public void setSelfHarm(BigDecimal selfHarm) {
    this.selfHarm = selfHarm;
  }

  /**
   **/
  public CreateModerationResponseResultsInnerCategoryScores sexual(BigDecimal sexual) {
    this.sexual = sexual;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("sexual")
  public BigDecimal getSexual() {
    return sexual;
  }
  public void setSexual(BigDecimal sexual) {
    this.sexual = sexual;
  }

  /**
   **/
  public CreateModerationResponseResultsInnerCategoryScores sexualMinors(BigDecimal sexualMinors) {
    this.sexualMinors = sexualMinors;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("sexual/minors")
  public BigDecimal getSexualMinors() {
    return sexualMinors;
  }
  public void setSexualMinors(BigDecimal sexualMinors) {
    this.sexualMinors = sexualMinors;
  }

  /**
   **/
  public CreateModerationResponseResultsInnerCategoryScores violence(BigDecimal violence) {
    this.violence = violence;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("violence")
  public BigDecimal getViolence() {
    return violence;
  }
  public void setViolence(BigDecimal violence) {
    this.violence = violence;
  }

  /**
   **/
  public CreateModerationResponseResultsInnerCategoryScores violenceGraphic(BigDecimal violenceGraphic) {
    this.violenceGraphic = violenceGraphic;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("violence/graphic")
  public BigDecimal getViolenceGraphic() {
    return violenceGraphic;
  }
  public void setViolenceGraphic(BigDecimal violenceGraphic) {
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
    CreateModerationResponseResultsInnerCategoryScores createModerationResponseResultsInnerCategoryScores = (CreateModerationResponseResultsInnerCategoryScores) o;
    return Objects.equals(hate, createModerationResponseResultsInnerCategoryScores.hate) &&
        Objects.equals(hateThreatening, createModerationResponseResultsInnerCategoryScores.hateThreatening) &&
        Objects.equals(selfHarm, createModerationResponseResultsInnerCategoryScores.selfHarm) &&
        Objects.equals(sexual, createModerationResponseResultsInnerCategoryScores.sexual) &&
        Objects.equals(sexualMinors, createModerationResponseResultsInnerCategoryScores.sexualMinors) &&
        Objects.equals(violence, createModerationResponseResultsInnerCategoryScores.violence) &&
        Objects.equals(violenceGraphic, createModerationResponseResultsInnerCategoryScores.violenceGraphic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hate, hateThreatening, selfHarm, sexual, sexualMinors, violence, violenceGraphic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationResponseResultsInnerCategoryScores {\n");
    
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

