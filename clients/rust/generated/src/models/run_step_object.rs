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

/// RunStepObject : Represents a step in execution of a run. 
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct RunStepObject {
    /// The identifier of the run step, which can be referenced in API endpoints.
    #[serde(rename = "id")]
    pub id: String,
    /// The object type, which is always `thread.run.step`.
    #[serde(rename = "object")]
    pub object: Object,
    /// The Unix timestamp (in seconds) for when the run step was created.
    #[serde(rename = "created_at")]
    pub created_at: i32,
    /// The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
    #[serde(rename = "assistant_id")]
    pub assistant_id: String,
    /// The ID of the [thread](/docs/api-reference/threads) that was run.
    #[serde(rename = "thread_id")]
    pub thread_id: String,
    /// The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
    #[serde(rename = "run_id")]
    pub run_id: String,
    /// The type of run step, which can be either `message_creation` or `tool_calls`.
    #[serde(rename = "type")]
    pub r#type: Type,
    /// The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
    #[serde(rename = "status")]
    pub status: Status,
    #[serde(rename = "step_details")]
    pub step_details: Box<models::RunStepObjectStepDetails>,
    #[serde(rename = "last_error", deserialize_with = "Option::deserialize")]
    pub last_error: Option<Box<models::RunStepObjectLastError>>,
    /// The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
    #[serde(rename = "expired_at", deserialize_with = "Option::deserialize")]
    pub expired_at: Option<i32>,
    /// The Unix timestamp (in seconds) for when the run step was cancelled.
    #[serde(rename = "cancelled_at", deserialize_with = "Option::deserialize")]
    pub cancelled_at: Option<i32>,
    /// The Unix timestamp (in seconds) for when the run step failed.
    #[serde(rename = "failed_at", deserialize_with = "Option::deserialize")]
    pub failed_at: Option<i32>,
    /// The Unix timestamp (in seconds) for when the run step completed.
    #[serde(rename = "completed_at", deserialize_with = "Option::deserialize")]
    pub completed_at: Option<i32>,
    /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
    #[serde(rename = "metadata", deserialize_with = "Option::deserialize")]
    pub metadata: Option<serde_json::Value>,
    #[serde(rename = "usage", deserialize_with = "Option::deserialize")]
    pub usage: Option<Box<models::RunStepCompletionUsage>>,
}

impl RunStepObject {
    /// Represents a step in execution of a run. 
    pub fn new(id: String, object: Object, created_at: i32, assistant_id: String, thread_id: String, run_id: String, r#type: Type, status: Status, step_details: models::RunStepObjectStepDetails, last_error: Option<models::RunStepObjectLastError>, expired_at: Option<i32>, cancelled_at: Option<i32>, failed_at: Option<i32>, completed_at: Option<i32>, metadata: Option<serde_json::Value>, usage: Option<models::RunStepCompletionUsage>) -> RunStepObject {
        RunStepObject {
            id,
            object,
            created_at,
            assistant_id,
            thread_id,
            run_id,
            r#type,
            status,
            step_details: Box::new(step_details),
            last_error: if let Some(x) = last_error {Some(Box::new(x))} else {None},
            expired_at,
            cancelled_at,
            failed_at,
            completed_at,
            metadata,
            usage: if let Some(x) = usage {Some(Box::new(x))} else {None},
        }
    }
}
/// The object type, which is always `thread.run.step`.
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Object {
    #[serde(rename = "thread.run.step")]
    ThreadPeriodRunPeriodStep,
}

impl Default for Object {
    fn default() -> Object {
        Self::ThreadPeriodRunPeriodStep
    }
}
/// The type of run step, which can be either `message_creation` or `tool_calls`.
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Type {
    #[serde(rename = "message_creation")]
    MessageCreation,
    #[serde(rename = "tool_calls")]
    ToolCalls,
}

impl Default for Type {
    fn default() -> Type {
        Self::MessageCreation
    }
}
/// The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Status {
    #[serde(rename = "in_progress")]
    InProgress,
    #[serde(rename = "cancelled")]
    Cancelled,
    #[serde(rename = "failed")]
    Failed,
    #[serde(rename = "completed")]
    Completed,
    #[serde(rename = "expired")]
    Expired,
}

impl Default for Status {
    fn default() -> Status {
        Self::InProgress
    }
}

