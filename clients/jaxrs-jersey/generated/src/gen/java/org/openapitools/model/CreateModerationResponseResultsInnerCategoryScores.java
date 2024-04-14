/*
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * CreateModerationResponseResultsInnerCategoryScores
 */
@JsonPropertyOrder({
  CreateModerationResponseResultsInnerCategoryScores.JSON_PROPERTY_HATE,
  CreateModerationResponseResultsInnerCategoryScores.JSON_PROPERTY_HATE_THREATENING,
  CreateModerationResponseResultsInnerCategoryScores.JSON_PROPERTY_SELF_HARM,
  CreateModerationResponseResultsInnerCategoryScores.JSON_PROPERTY_SEXUAL,
  CreateModerationResponseResultsInnerCategoryScores.JSON_PROPERTY_SEXUAL_MINORS,
  CreateModerationResponseResultsInnerCategoryScores.JSON_PROPERTY_VIOLENCE,
  CreateModerationResponseResultsInnerCategoryScores.JSON_PROPERTY_VIOLENCE_GRAPHIC
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-16T01:13:32.134709667Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateModerationResponseResultsInnerCategoryScores   {
  public static final String JSON_PROPERTY_HATE = "hate";
  @JsonProperty(JSON_PROPERTY_HATE)
  private BigDecimal hate;

  public static final String JSON_PROPERTY_HATE_THREATENING = "hate/threatening";
  @JsonProperty(JSON_PROPERTY_HATE_THREATENING)
  private BigDecimal hateThreatening;

  public static final String JSON_PROPERTY_SELF_HARM = "self-harm";
  @JsonProperty(JSON_PROPERTY_SELF_HARM)
  private BigDecimal selfHarm;

  public static final String JSON_PROPERTY_SEXUAL = "sexual";
  @JsonProperty(JSON_PROPERTY_SEXUAL)
  private BigDecimal sexual;

  public static final String JSON_PROPERTY_SEXUAL_MINORS = "sexual/minors";
  @JsonProperty(JSON_PROPERTY_SEXUAL_MINORS)
  private BigDecimal sexualMinors;

  public static final String JSON_PROPERTY_VIOLENCE = "violence";
  @JsonProperty(JSON_PROPERTY_VIOLENCE)
  private BigDecimal violence;

  public static final String JSON_PROPERTY_VIOLENCE_GRAPHIC = "violence/graphic";
  @JsonProperty(JSON_PROPERTY_VIOLENCE_GRAPHIC)
  private BigDecimal violenceGraphic;

  public CreateModerationResponseResultsInnerCategoryScores hate(BigDecimal hate) {
    this.hate = hate;
    return this;
  }

  /**
   * Get hate
   * @return hate
   **/
  @JsonProperty(value = "hate")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
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
  @JsonProperty(value = "hate/threatening")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
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
  @JsonProperty(value = "self-harm")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
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
  @JsonProperty(value = "sexual")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
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
  @JsonProperty(value = "sexual/minors")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
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
  @JsonProperty(value = "violence")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
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
  @JsonProperty(value = "violence/graphic")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
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
    return Objects.equals(this.hate, createModerationResponseResultsInnerCategoryScores.hate) &&
        Objects.equals(this.hateThreatening, createModerationResponseResultsInnerCategoryScores.hateThreatening) &&
        Objects.equals(this.selfHarm, createModerationResponseResultsInnerCategoryScores.selfHarm) &&
        Objects.equals(this.sexual, createModerationResponseResultsInnerCategoryScores.sexual) &&
        Objects.equals(this.sexualMinors, createModerationResponseResultsInnerCategoryScores.sexualMinors) &&
        Objects.equals(this.violence, createModerationResponseResultsInnerCategoryScores.violence) &&
        Objects.equals(this.violenceGraphic, createModerationResponseResultsInnerCategoryScores.violenceGraphic);
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
