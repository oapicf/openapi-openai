/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CreateModerationResponseResultsInner {
    /// Whether any of the below categories are flagged.
    #[serde(rename = "flagged")]
    pub flagged: bool,
    #[serde(rename = "categories")]
    pub categories: Box<models::CreateModerationResponseResultsInnerCategories>,
    #[serde(rename = "category_scores")]
    pub category_scores: Box<models::CreateModerationResponseResultsInnerCategoryScores>,
}

impl CreateModerationResponseResultsInner {
    pub fn new(flagged: bool, categories: models::CreateModerationResponseResultsInnerCategories, category_scores: models::CreateModerationResponseResultsInnerCategoryScores) -> CreateModerationResponseResultsInner {
        CreateModerationResponseResultsInner {
            flagged,
            categories: Box::new(categories),
            category_scores: Box::new(category_scores),
        }
    }
}

