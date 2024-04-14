/*
 * OpenAI API
 *
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

use crate::models;

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CreateEditRequest {
    #[serde(rename = "model")]
    pub model: Box<models::CreateEditRequestModel>,
    /// The input text to use as a starting point for the edit.
    #[serde(rename = "input", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub input: Option<Option<String>>,
    /// The instruction that tells the model how to edit the prompt.
    #[serde(rename = "instruction")]
    pub instruction: String,
    /// How many edits to generate for the input and instruction.
    #[serde(rename = "n", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub n: Option<Option<i32>>,
    /// What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
    #[serde(rename = "temperature", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub temperature: Option<Option<f64>>,
    /// An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
    #[serde(rename = "top_p", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub top_p: Option<Option<f64>>,
}

impl CreateEditRequest {
    pub fn new(model: models::CreateEditRequestModel, instruction: String) -> CreateEditRequest {
        CreateEditRequest {
            model: Box::new(model),
            input: None,
            instruction,
            n: None,
            temperature: None,
            top_p: None,
        }
    }
}
