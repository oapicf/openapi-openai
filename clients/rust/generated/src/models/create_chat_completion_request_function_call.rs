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

/// CreateChatCompletionRequestFunctionCall : Deprecated in favor of `tool_choice`.  Controls which (if any) function is called by the model. `none` means the model will not call a function and instead generates a message. `auto` means the model can pick between generating a message or calling a function. Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function.  `none` is the default when no functions are present. `auto` is the default if functions are present. 
/// Deprecated in favor of `tool_choice`.  Controls which (if any) function is called by the model. `none` means the model will not call a function and instead generates a message. `auto` means the model can pick between generating a message or calling a function. Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function.  `none` is the default when no functions are present. `auto` is the default if functions are present. 
#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
#[serde(untagged)]
pub enum CreateChatCompletionRequestFunctionCall {
    /// `none` means the model will not call a function and instead generates a message. `auto` means the model can pick between generating a message or calling a function. 
    String(String),
    ChatCompletionFunctionCallOption(Box<models::ChatCompletionFunctionCallOption>),
}

impl Default for CreateChatCompletionRequestFunctionCall {
    fn default() -> Self {
        Self::String(Default::default())
    }
}

