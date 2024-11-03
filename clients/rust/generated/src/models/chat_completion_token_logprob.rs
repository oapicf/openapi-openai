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
pub struct ChatCompletionTokenLogprob {
    /// The token.
    #[serde(rename = "token")]
    pub token: String,
    /// The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
    #[serde(rename = "logprob")]
    pub logprob: f64,
    /// A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
    #[serde(rename = "bytes", deserialize_with = "Option::deserialize")]
    pub bytes: Option<Vec<i32>>,
    /// List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned.
    #[serde(rename = "top_logprobs")]
    pub top_logprobs: Vec<models::ChatCompletionTokenLogprobTopLogprobsInner>,
}

impl ChatCompletionTokenLogprob {
    pub fn new(token: String, logprob: f64, bytes: Option<Vec<i32>>, top_logprobs: Vec<models::ChatCompletionTokenLogprobTopLogprobsInner>) -> ChatCompletionTokenLogprob {
        ChatCompletionTokenLogprob {
            token,
            logprob,
            bytes,
            top_logprobs,
        }
    }
}

