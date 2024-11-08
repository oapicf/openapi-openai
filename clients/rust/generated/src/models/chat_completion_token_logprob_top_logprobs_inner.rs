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
pub struct ChatCompletionTokenLogprobTopLogprobsInner {
    /// The token.
    #[serde(rename = "token")]
    pub token: String,
    /// The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
    #[serde(rename = "logprob")]
    pub logprob: f64,
    /// A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
    #[serde(rename = "bytes", deserialize_with = "Option::deserialize")]
    pub bytes: Option<Vec<i32>>,
}

impl ChatCompletionTokenLogprobTopLogprobsInner {
    pub fn new(token: String, logprob: f64, bytes: Option<Vec<i32>>) -> ChatCompletionTokenLogprobTopLogprobsInner {
        ChatCompletionTokenLogprobTopLogprobsInner {
            token,
            logprob,
            bytes,
        }
    }
}

