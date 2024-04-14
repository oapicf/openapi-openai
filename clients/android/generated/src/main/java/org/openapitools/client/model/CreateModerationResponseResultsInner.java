/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.CreateModerationResponseResultsInnerCategories;
import org.openapitools.client.model.CreateModerationResponseResultsInnerCategoryScores;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CreateModerationResponseResultsInner {
  
  @SerializedName("flagged")
  private Boolean flagged = null;
  @SerializedName("categories")
  private CreateModerationResponseResultsInnerCategories categories = null;
  @SerializedName("category_scores")
  private CreateModerationResponseResultsInnerCategoryScores categoryScores = null;

  /**
   * Whether any of the below categories are flagged.
   **/
  @ApiModelProperty(required = true, value = "Whether any of the below categories are flagged.")
  public Boolean getFlagged() {
    return flagged;
  }
  public void setFlagged(Boolean flagged) {
    this.flagged = flagged;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CreateModerationResponseResultsInnerCategories getCategories() {
    return categories;
  }
  public void setCategories(CreateModerationResponseResultsInnerCategories categories) {
    this.categories = categories;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CreateModerationResponseResultsInnerCategoryScores getCategoryScores() {
    return categoryScores;
  }
  public void setCategoryScores(CreateModerationResponseResultsInnerCategoryScores categoryScores) {
    this.categoryScores = categoryScores;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateModerationResponseResultsInner createModerationResponseResultsInner = (CreateModerationResponseResultsInner) o;
    return (this.flagged == null ? createModerationResponseResultsInner.flagged == null : this.flagged.equals(createModerationResponseResultsInner.flagged)) &&
        (this.categories == null ? createModerationResponseResultsInner.categories == null : this.categories.equals(createModerationResponseResultsInner.categories)) &&
        (this.categoryScores == null ? createModerationResponseResultsInner.categoryScores == null : this.categoryScores.equals(createModerationResponseResultsInner.categoryScores));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.flagged == null ? 0: this.flagged.hashCode());
    result = 31 * result + (this.categories == null ? 0: this.categories.hashCode());
    result = 31 * result + (this.categoryScores == null ? 0: this.categoryScores.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationResponseResultsInner {\n");
    
    sb.append("  flagged: ").append(flagged).append("\n");
    sb.append("  categories: ").append(categories).append("\n");
    sb.append("  categoryScores: ").append(categoryScores).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
