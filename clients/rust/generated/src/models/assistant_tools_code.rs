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
pub struct AssistantToolsCode {
    /// The type of tool being defined: `code_interpreter`
    #[serde(rename = "type")]
    pub r#type: Type,
}

impl AssistantToolsCode {
    pub fn new(r#type: Type) -> AssistantToolsCode {
        AssistantToolsCode {
            r#type,
        }
    }
}
/// The type of tool being defined: `code_interpreter`
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Type {
    #[serde(rename = "code_interpreter")]
    CodeInterpreter,
}

impl Default for Type {
    fn default() -> Type {
        Self::CodeInterpreter
    }
}

