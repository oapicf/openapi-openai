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

/// FineTuningJob : The `fine_tuning.job` object represents a fine-tuning job that has been created through the API. 
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct FineTuningJob {
    /// The object identifier, which can be referenced in the API endpoints.
    #[serde(rename = "id")]
    pub id: String,
    /// The Unix timestamp (in seconds) for when the fine-tuning job was created.
    #[serde(rename = "created_at")]
    pub created_at: i32,
    #[serde(rename = "error", deserialize_with = "Option::deserialize")]
    pub error: Option<Box<models::FineTuningJobError>>,
    /// The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
    #[serde(rename = "fine_tuned_model", deserialize_with = "Option::deserialize")]
    pub fine_tuned_model: Option<String>,
    /// The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
    #[serde(rename = "finished_at", deserialize_with = "Option::deserialize")]
    pub finished_at: Option<i32>,
    #[serde(rename = "hyperparameters")]
    pub hyperparameters: Box<models::FineTuningJobHyperparameters>,
    /// The base model that is being fine-tuned.
    #[serde(rename = "model")]
    pub model: String,
    /// The object type, which is always \"fine_tuning.job\".
    #[serde(rename = "object")]
    pub object: Object,
    /// The organization that owns the fine-tuning job.
    #[serde(rename = "organization_id")]
    pub organization_id: String,
    /// The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
    #[serde(rename = "result_files")]
    pub result_files: Vec<String>,
    /// The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
    #[serde(rename = "status")]
    pub status: Status,
    /// The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
    #[serde(rename = "trained_tokens", deserialize_with = "Option::deserialize")]
    pub trained_tokens: Option<i32>,
    /// The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
    #[serde(rename = "training_file")]
    pub training_file: String,
    /// The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
    #[serde(rename = "validation_file", deserialize_with = "Option::deserialize")]
    pub validation_file: Option<String>,
    /// A list of integrations to enable for this fine-tuning job.
    #[serde(rename = "integrations", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub integrations: Option<Option<Vec<models::FineTuningJobIntegrationsInner>>>,
    /// The seed used for the fine-tuning job.
    #[serde(rename = "seed")]
    pub seed: i32,
}

impl FineTuningJob {
    /// The `fine_tuning.job` object represents a fine-tuning job that has been created through the API. 
    pub fn new(id: String, created_at: i32, error: Option<models::FineTuningJobError>, fine_tuned_model: Option<String>, finished_at: Option<i32>, hyperparameters: models::FineTuningJobHyperparameters, model: String, object: Object, organization_id: String, result_files: Vec<String>, status: Status, trained_tokens: Option<i32>, training_file: String, validation_file: Option<String>, seed: i32) -> FineTuningJob {
        FineTuningJob {
            id,
            created_at,
            error: if let Some(x) = error {Some(Box::new(x))} else {None},
            fine_tuned_model,
            finished_at,
            hyperparameters: Box::new(hyperparameters),
            model,
            object,
            organization_id,
            result_files,
            status,
            trained_tokens,
            training_file,
            validation_file,
            integrations: None,
            seed,
        }
    }
}
/// The object type, which is always \"fine_tuning.job\".
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Object {
    #[serde(rename = "fine_tuning.job")]
    FineTuningPeriodJob,
}

impl Default for Object {
    fn default() -> Object {
        Self::FineTuningPeriodJob
    }
}
/// The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Status {
    #[serde(rename = "validating_files")]
    ValidatingFiles,
    #[serde(rename = "queued")]
    Queued,
    #[serde(rename = "running")]
    Running,
    #[serde(rename = "succeeded")]
    Succeeded,
    #[serde(rename = "failed")]
    Failed,
    #[serde(rename = "cancelled")]
    Cancelled,
}

impl Default for Status {
    fn default() -> Status {
        Self::ValidatingFiles
    }
}

