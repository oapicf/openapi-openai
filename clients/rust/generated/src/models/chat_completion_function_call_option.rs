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

/// ChatCompletionFunctionCallOption : Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function. 
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ChatCompletionFunctionCallOption {
    /// The name of the function to call.
    #[serde(rename = "name")]
    pub name: String,
}

impl ChatCompletionFunctionCallOption {
    /// Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function. 
    pub fn new(name: String) -> ChatCompletionFunctionCallOption {
        ChatCompletionFunctionCallOption {
            name,
        }
    }
}

