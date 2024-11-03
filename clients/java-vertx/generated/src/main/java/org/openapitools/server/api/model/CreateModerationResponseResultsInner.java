package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.CreateModerationResponseResultsInnerCategories;
import org.openapitools.server.api.model.CreateModerationResponseResultsInnerCategoryScores;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateModerationResponseResultsInner   {
  
  private Boolean flagged;
  private CreateModerationResponseResultsInnerCategories categories;
  private CreateModerationResponseResultsInnerCategoryScores categoryScores;

  public CreateModerationResponseResultsInner () {

  }

  public CreateModerationResponseResultsInner (Boolean flagged, CreateModerationResponseResultsInnerCategories categories, CreateModerationResponseResultsInnerCategoryScores categoryScores) {
    this.flagged = flagged;
    this.categories = categories;
    this.categoryScores = categoryScores;
  }

    
  @JsonProperty("flagged")
  public Boolean getFlagged() {
    return flagged;
  }
  public void setFlagged(Boolean flagged) {
    this.flagged = flagged;
  }

    
  @JsonProperty("categories")
  public CreateModerationResponseResultsInnerCategories getCategories() {
    return categories;
  }
  public void setCategories(CreateModerationResponseResultsInnerCategories categories) {
    this.categories = categories;
  }

    
  @JsonProperty("category_scores")
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
    return Objects.equals(flagged, createModerationResponseResultsInner.flagged) &&
        Objects.equals(categories, createModerationResponseResultsInner.categories) &&
        Objects.equals(categoryScores, createModerationResponseResultsInner.categoryScores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flagged, categories, categoryScores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationResponseResultsInner {\n");
    
    sb.append("    flagged: ").append(toIndentedString(flagged)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    categoryScores: ").append(toIndentedString(categoryScores)).append("\n");
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
