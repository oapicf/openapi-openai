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

/// CreateChatCompletionRequestModel : ID of the model to use. See the [model endpoint compatibility](/docs/models/model-endpoint-compatibility) table for details on which models work with the Chat API.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CreateChatCompletionRequestModel {
}

impl CreateChatCompletionRequestModel {
    /// ID of the model to use. See the [model endpoint compatibility](/docs/models/model-endpoint-compatibility) table for details on which models work with the Chat API.
    pub fn new() -> CreateChatCompletionRequestModel {
        CreateChatCompletionRequestModel {
        }
    }
}

