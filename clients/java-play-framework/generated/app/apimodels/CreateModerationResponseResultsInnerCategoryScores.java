package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateModerationResponseResultsInnerCategoryScores
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-16T01:12:54.315235707Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateModerationResponseResultsInnerCategoryScores   {
  @JsonProperty("hate")
  @NotNull
@Valid

  private BigDecimal hate;

  @JsonProperty("hate/threatening")
  @NotNull
@Valid

  private BigDecimal hateThreatening;

  @JsonProperty("self-harm")
  @NotNull
@Valid

  private BigDecimal selfHarm;

  @JsonProperty("sexual")
  @NotNull
@Valid

  private BigDecimal sexual;

  @JsonProperty("sexual/minors")
  @NotNull
@Valid

  private BigDecimal sexualMinors;

  @JsonProperty("violence")
  @NotNull
@Valid

  private BigDecimal violence;

  @JsonProperty("violence/graphic")
  @NotNull
@Valid

  private BigDecimal violenceGraphic;

  public CreateModerationResponseResultsInnerCategoryScores hate(BigDecimal hate) {
    this.hate = hate;
    return this;
  }

   /**
   * Get hate
   * @return hate
  **/
  public BigDecimal getHate() {
    return hate;
  }

  public void setHate(BigDecimal hate) {
    this.hate = hate;
  }

  public CreateModerationResponseResultsInnerCategoryScores hateThreatening(BigDecimal hateThreatening) {
    this.hateThreatening = hateThreatening;
    return this;
  }

   /**
   * Get hateThreatening
   * @return hateThreatening
  **/
  public BigDecimal getHateThreatening() {
    return hateThreatening;
  }

  public void setHateThreatening(BigDecimal hateThreatening) {
    this.hateThreatening = hateThreatening;
  }

  public CreateModerationResponseResultsInnerCategoryScores selfHarm(BigDecimal selfHarm) {
    this.selfHarm = selfHarm;
    return this;
  }

   /**
   * Get selfHarm
   * @return selfHarm
  **/
  public BigDecimal getSelfHarm() {
    return selfHarm;
  }

  public void setSelfHarm(BigDecimal selfHarm) {
    this.selfHarm = selfHarm;
  }

  public CreateModerationResponseResultsInnerCategoryScores sexual(BigDecimal sexual) {
    this.sexual = sexual;
    return this;
  }

   /**
   * Get sexual
   * @return sexual
  **/
  public BigDecimal getSexual() {
    return sexual;
  }

  public void setSexual(BigDecimal sexual) {
    this.sexual = sexual;
  }

  public CreateModerationResponseResultsInnerCategoryScores sexualMinors(BigDecimal sexualMinors) {
    this.sexualMinors = sexualMinors;
    return this;
  }

   /**
   * Get sexualMinors
   * @return sexualMinors
  **/
  public BigDecimal getSexualMinors() {
    return sexualMinors;
  }

  public void setSexualMinors(BigDecimal sexualMinors) {
    this.sexualMinors = sexualMinors;
  }

  public CreateModerationResponseResultsInnerCategoryScores violence(BigDecimal violence) {
    this.violence = violence;
    return this;
  }

   /**
   * Get violence
   * @return violence
  **/
  public BigDecimal getViolence() {
    return violence;
  }

  public void setViolence(BigDecimal violence) {
    this.violence = violence;
  }

  public CreateModerationResponseResultsInnerCategoryScores violenceGraphic(BigDecimal violenceGraphic) {
    this.violenceGraphic = violenceGraphic;
    return this;
  }

   /**
   * Get violenceGraphic
   * @return violenceGraphic
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

