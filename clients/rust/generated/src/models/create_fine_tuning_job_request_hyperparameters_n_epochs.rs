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

/// CreateFineTuningJobRequestHyperparametersNEpochs : The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
/// The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
#[serde(untagged)]
pub enum CreateFineTuningJobRequestHyperparametersNEpochs {
    String(String),
    Integer(i32),
}

impl Default for CreateFineTuningJobRequestHyperparametersNEpochs {
    fn default() -> Self {
        Self::String(Default::default())
    }
}

