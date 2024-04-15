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

/// FineTuningJobHyperparameters : The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct FineTuningJobHyperparameters {
    #[serde(rename = "n_epochs")]
    pub n_epochs: Box<models::FineTuningJobHyperparametersNEpochs>,
}

impl FineTuningJobHyperparameters {
    /// The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
    pub fn new(n_epochs: models::FineTuningJobHyperparametersNEpochs) -> FineTuningJobHyperparameters {
        FineTuningJobHyperparameters {
            n_epochs: Box::new(n_epochs),
        }
    }
}
