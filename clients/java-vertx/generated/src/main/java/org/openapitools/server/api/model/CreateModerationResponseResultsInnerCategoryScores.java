package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateModerationResponseResultsInnerCategoryScores   {
  
  private BigDecimal hate;
  private BigDecimal hateThreatening;
  private BigDecimal selfHarm;
  private BigDecimal sexual;
  private BigDecimal sexualMinors;
  private BigDecimal violence;
  private BigDecimal violenceGraphic;

  public CreateModerationResponseResultsInnerCategoryScores () {

  }

  public CreateModerationResponseResultsInnerCategoryScores (BigDecimal hate, BigDecimal hateThreatening, BigDecimal selfHarm, BigDecimal sexual, BigDecimal sexualMinors, BigDecimal violence, BigDecimal violenceGraphic) {
    this.hate = hate;
    this.hateThreatening = hateThreatening;
    this.selfHarm = selfHarm;
    this.sexual = sexual;
    this.sexualMinors = sexualMinors;
    this.violence = violence;
    this.violenceGraphic = violenceGraphic;
  }

    
  @JsonProperty("hate")
  public BigDecimal getHate() {
    return hate;
  }
  public void setHate(BigDecimal hate) {
    this.hate = hate;
  }

    
  @JsonProperty("hate/threatening")
  public BigDecimal getHateThreatening() {
    return hateThreatening;
  }
  public void setHateThreatening(BigDecimal hateThreatening) {
    this.hateThreatening = hateThreatening;
  }

    
  @JsonProperty("self-harm")
  public BigDecimal getSelfHarm() {
    return selfHarm;
  }
  public void setSelfHarm(BigDecimal selfHarm) {
    this.selfHarm = selfHarm;
  }

    
  @JsonProperty("sexual")
  public BigDecimal getSexual() {
    return sexual;
  }
  public void setSexual(BigDecimal sexual) {
    this.sexual = sexual;
  }

    
  @JsonProperty("sexual/minors")
  public BigDecimal getSexualMinors() {
    return sexualMinors;
  }
  public void setSexualMinors(BigDecimal sexualMinors) {
    this.sexualMinors = sexualMinors;
  }

    
  @JsonProperty("violence")
  public BigDecimal getViolence() {
    return violence;
  }
  public void setViolence(BigDecimal violence) {
    this.violence = violence;
  }

    
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
