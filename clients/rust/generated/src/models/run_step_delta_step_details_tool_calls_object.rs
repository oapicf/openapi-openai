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

/// RunStepDeltaStepDetailsToolCallsObject : Details of the tool call.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct RunStepDeltaStepDetailsToolCallsObject {
    /// Always `tool_calls`.
    #[serde(rename = "type")]
    pub r#type: Type,
    /// An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. 
    #[serde(rename = "tool_calls", skip_serializing_if = "Option::is_none")]
    pub tool_calls: Option<Vec<models::RunStepDeltaStepDetailsToolCallsObjectToolCallsInner>>,
}

impl RunStepDeltaStepDetailsToolCallsObject {
    /// Details of the tool call.
    pub fn new(r#type: Type) -> RunStepDeltaStepDetailsToolCallsObject {
        RunStepDeltaStepDetailsToolCallsObject {
            r#type,
            tool_calls: None,
        }
    }
}
/// Always `tool_calls`.
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Type {
    #[serde(rename = "tool_calls")]
    ToolCalls,
}

impl Default for Type {
    fn default() -> Type {
        Self::ToolCalls
    }
}

