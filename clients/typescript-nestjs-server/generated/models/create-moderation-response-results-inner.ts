import { CreateModerationResponseResultsInnerCategoryAppliedInputTypes } from './create-moderation-response-results-inner-category-applied-input-types';
import { CreateModerationResponseResultsInnerCategoryScores } from './create-moderation-response-results-inner-category-scores';
import { CreateModerationResponseResultsInnerCategories } from './create-moderation-response-results-inner-categories';


export interface CreateModerationResponseResultsInner { 
  /**
   * Whether any of the below categories are flagged.
   */
  flagged: boolean;
  categories: CreateModerationResponseResultsInnerCategories;
  category_scores: CreateModerationResponseResultsInnerCategoryScores;
  category_applied_input_types: CreateModerationResponseResultsInnerCategoryAppliedInputTypes;
}

