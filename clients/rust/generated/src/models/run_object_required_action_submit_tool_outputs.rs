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

/// RunObjectRequiredActionSubmitToolOutputs : Details on the tool outputs needed for this run to continue.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct RunObjectRequiredActionSubmitToolOutputs {
    /// A list of the relevant tool calls.
    #[serde(rename = "tool_calls")]
    pub tool_calls: Vec<models::RunToolCallObject>,
}

impl RunObjectRequiredActionSubmitToolOutputs {
    /// Details on the tool outputs needed for this run to continue.
    pub fn new(tool_calls: Vec<models::RunToolCallObject>) -> RunObjectRequiredActionSubmitToolOutputs {
        RunObjectRequiredActionSubmitToolOutputs {
            tool_calls,
        }
    }
}

