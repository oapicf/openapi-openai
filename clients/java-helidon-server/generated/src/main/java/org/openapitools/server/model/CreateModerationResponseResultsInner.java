package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.CreateModerationResponseResultsInnerCategories;
import org.openapitools.server.model.CreateModerationResponseResultsInnerCategoryAppliedInputTypes;
import org.openapitools.server.model.CreateModerationResponseResultsInnerCategoryScores;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CreateModerationResponseResultsInner   {

    private Boolean flagged;
    private CreateModerationResponseResultsInnerCategories categories;
    private CreateModerationResponseResultsInnerCategoryScores categoryScores;
    private CreateModerationResponseResultsInnerCategoryAppliedInputTypes categoryAppliedInputTypes;

    /**
     * Default constructor.
     */
    public CreateModerationResponseResultsInner() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateModerationResponseResultsInner.
     *
     * @param flagged Whether any of the below categories are flagged.
     * @param categories categories
     * @param categoryScores categoryScores
     * @param categoryAppliedInputTypes categoryAppliedInputTypes
     */
    public CreateModerationResponseResultsInner(
        Boolean flagged, 
        CreateModerationResponseResultsInnerCategories categories, 
        CreateModerationResponseResultsInnerCategoryScores categoryScores, 
        CreateModerationResponseResultsInnerCategoryAppliedInputTypes categoryAppliedInputTypes
    ) {
        this.flagged = flagged;
        this.categories = categories;
        this.categoryScores = categoryScores;
        this.categoryAppliedInputTypes = categoryAppliedInputTypes;
    }



    /**
     * Whether any of the below categories are flagged.
     * @return flagged
     */
    public Boolean getFlagged() {
        return flagged;
    }

    public void setFlagged(Boolean flagged) {
        this.flagged = flagged;
    }

    /**
     * Get categories
     * @return categories
     */
    public CreateModerationResponseResultsInnerCategories getCategories() {
        return categories;
    }

    public void setCategories(CreateModerationResponseResultsInnerCategories categories) {
        this.categories = categories;
    }

    /**
     * Get categoryScores
     * @return categoryScores
     */
    public CreateModerationResponseResultsInnerCategoryScores getCategoryScores() {
        return categoryScores;
    }

    public void setCategoryScores(CreateModerationResponseResultsInnerCategoryScores categoryScores) {
        this.categoryScores = categoryScores;
    }

    /**
     * Get categoryAppliedInputTypes
     * @return categoryAppliedInputTypes
     */
    public CreateModerationResponseResultsInnerCategoryAppliedInputTypes getCategoryAppliedInputTypes() {
        return categoryAppliedInputTypes;
    }

    public void setCategoryAppliedInputTypes(CreateModerationResponseResultsInnerCategoryAppliedInputTypes categoryAppliedInputTypes) {
        this.categoryAppliedInputTypes = categoryAppliedInputTypes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateModerationResponseResultsInner {\n");
        
        sb.append("    flagged: ").append(toIndentedString(flagged)).append("\n");
        sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
        sb.append("    categoryScores: ").append(toIndentedString(categoryScores)).append("\n");
        sb.append("    categoryAppliedInputTypes: ").append(toIndentedString(categoryAppliedInputTypes)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

