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
pub struct CreateAssistantRequest {
    #[serde(rename = "model")]
    pub model: Box<models::CreateAssistantRequestModel>,
    /// The name of the assistant. The maximum length is 256 characters. 
    #[serde(rename = "name", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub name: Option<Option<String>>,
    /// The description of the assistant. The maximum length is 512 characters. 
    #[serde(rename = "description", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub description: Option<Option<String>>,
    /// The system instructions that the assistant uses. The maximum length is 256,000 characters. 
    #[serde(rename = "instructions", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub instructions: Option<Option<String>>,
    /// A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 
    #[serde(rename = "tools", skip_serializing_if = "Option::is_none")]
    pub tools: Option<Vec<models::AssistantObjectToolsInner>>,
    /// A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. 
    #[serde(rename = "file_ids", skip_serializing_if = "Option::is_none")]
    pub file_ids: Option<Vec<String>>,
    /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
    #[serde(rename = "metadata", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub metadata: Option<Option<serde_json::Value>>,
}

impl CreateAssistantRequest {
    pub fn new(model: models::CreateAssistantRequestModel) -> CreateAssistantRequest {
        CreateAssistantRequest {
            model: Box::new(model),
            name: None,
            description: None,
            instructions: None,
            tools: None,
            file_ids: None,
            metadata: None,
        }
    }
}

