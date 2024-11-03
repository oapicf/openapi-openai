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

/// RunToolCallObjectFunction : The function definition.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct RunToolCallObjectFunction {
    /// The name of the function.
    #[serde(rename = "name")]
    pub name: String,
    /// The arguments that the model expects you to pass to the function.
    #[serde(rename = "arguments")]
    pub arguments: String,
}

impl RunToolCallObjectFunction {
    /// The function definition.
    pub fn new(name: String, arguments: String) -> RunToolCallObjectFunction {
        RunToolCallObjectFunction {
            name,
            arguments,
        }
    }
}

