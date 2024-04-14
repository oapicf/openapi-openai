/*
 * OpenAI API
 *
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

use crate::models;

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CreateModerationResponseResultsInnerCategoryScores {
    #[serde(rename = "hate")]
    pub hate: f64,
    #[serde(rename = "hate/threatening")]
    pub hate_slash_threatening: f64,
    #[serde(rename = "self-harm")]
    pub self_harm: f64,
    #[serde(rename = "sexual")]
    pub sexual: f64,
    #[serde(rename = "sexual/minors")]
    pub sexual_slash_minors: f64,
    #[serde(rename = "violence")]
    pub violence: f64,
    #[serde(rename = "violence/graphic")]
    pub violence_slash_graphic: f64,
}

impl CreateModerationResponseResultsInnerCategoryScores {
    pub fn new(hate: f64, hate_slash_threatening: f64, self_harm: f64, sexual: f64, sexual_slash_minors: f64, violence: f64, violence_slash_graphic: f64) -> CreateModerationResponseResultsInnerCategoryScores {
        CreateModerationResponseResultsInnerCategoryScores {
            hate,
            hate_slash_threatening,
            self_harm,
            sexual,
            sexual_slash_minors,
            violence,
            violence_slash_graphic,
        }
    }
}
