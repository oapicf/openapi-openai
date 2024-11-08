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

/// CreateFineTuningJobRequestHyperparameters : The hyperparameters used for the fine-tuning job.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CreateFineTuningJobRequestHyperparameters {
    #[serde(rename = "batch_size", skip_serializing_if = "Option::is_none")]
    pub batch_size: Option<Box<models::CreateFineTuningJobRequestHyperparametersBatchSize>>,
    #[serde(rename = "learning_rate_multiplier", skip_serializing_if = "Option::is_none")]
    pub learning_rate_multiplier: Option<Box<models::CreateFineTuningJobRequestHyperparametersLearningRateMultiplier>>,
    #[serde(rename = "n_epochs", skip_serializing_if = "Option::is_none")]
    pub n_epochs: Option<Box<models::CreateFineTuningJobRequestHyperparametersNEpochs>>,
}

impl CreateFineTuningJobRequestHyperparameters {
    /// The hyperparameters used for the fine-tuning job.
    pub fn new() -> CreateFineTuningJobRequestHyperparameters {
        CreateFineTuningJobRequestHyperparameters {
            batch_size: None,
            learning_rate_multiplier: None,
            n_epochs: None,
        }
    }
}

