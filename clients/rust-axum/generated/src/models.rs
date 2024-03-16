#![allow(unused_qualifications)]

use http::HeaderValue;
use validator::Validate;

#[cfg(feature = "server")]
use crate::header;
use crate::{models, types::*};

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct CancelFineTunePathParams {
            /// The ID of the fine-tune job to cancel 
                pub fine_tune_id: String,
    }


      
      
      
      
      
      
      
      
      
      
      
      
      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct DeleteFilePathParams {
            /// The ID of the file to use for this request
                pub file_id: String,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct DeleteModelPathParams {
            /// The model to delete
                pub model: String,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct DownloadFilePathParams {
            /// The ID of the file to use for this request
                pub file_id: String,
    }


      
      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct ListFineTuneEventsPathParams {
            /// The ID of the fine-tune job to get events for. 
                pub fine_tune_id: String,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct ListFineTuneEventsQueryParams {
            /// Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a `data: [DONE]` message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned. 
                #[serde(rename = "stream")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub stream: Option<bool>,
    }

      
      
      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct RetrieveFilePathParams {
            /// The ID of the file to use for this request
                pub file_id: String,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct RetrieveFineTunePathParams {
            /// The ID of the fine-tune job 
                pub fine_tune_id: String,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct RetrieveModelPathParams {
            /// The ID of the model to use for this request
                pub model: String,
    }







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct ChatCompletionFunctions {
/// The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
    #[serde(rename = "name")]
    pub name: String,

/// The description of what the function does.
    #[serde(rename = "description")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub description: Option<String>,

/// The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/gpt/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.
    #[serde(rename = "parameters")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub parameters: Option<std::collections::HashMap<String, crate::types::Object>>,

}


impl ChatCompletionFunctions {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(name: String, ) -> ChatCompletionFunctions {
        ChatCompletionFunctions {
            name,
            description: None,
            parameters: None,
        }
    }
}

/// Converts the ChatCompletionFunctions value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for ChatCompletionFunctions {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("name".to_string()),
            Some(self.name.to_string()),


            self.description.as_ref().map(|description| {
                [
                    "description".to_string(),
                    description.to_string(),
                ].join(",")
            }),

            // Skipping parameters in query parameter serialization
            // Skipping parameters in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a ChatCompletionFunctions value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for ChatCompletionFunctions {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub name: Vec<String>,
            pub description: Vec<String>,
            pub parameters: Vec<std::collections::HashMap<String, crate::types::Object>>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing ChatCompletionFunctions".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "name" => intermediate_rep.name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "description" => intermediate_rep.description.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "parameters" => return std::result::Result::Err("Parsing a container in this style is not supported in ChatCompletionFunctions".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing ChatCompletionFunctions".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(ChatCompletionFunctions {
            name: intermediate_rep.name.into_iter().next().ok_or_else(|| "name missing in ChatCompletionFunctions".to_string())?,
            description: intermediate_rep.description.into_iter().next(),
            parameters: intermediate_rep.parameters.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<ChatCompletionFunctions> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<ChatCompletionFunctions>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<ChatCompletionFunctions>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for ChatCompletionFunctions - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<ChatCompletionFunctions> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <ChatCompletionFunctions as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into ChatCompletionFunctions - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct ChatCompletionRequestMessage {
/// The role of the messages author. One of `system`, `user`, `assistant`, or `function`.
/// Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "role")]
    pub role: String,

/// The contents of the message. `content` is required for all messages except assistant messages with function calls.
    #[serde(rename = "content")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub content: Option<String>,

/// The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters.
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    #[serde(rename = "function_call")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub function_call: Option<models::ChatCompletionRequestMessageFunctionCall>,

}


impl ChatCompletionRequestMessage {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(role: String, ) -> ChatCompletionRequestMessage {
        ChatCompletionRequestMessage {
            role,
            content: None,
            name: None,
            function_call: None,
        }
    }
}

/// Converts the ChatCompletionRequestMessage value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for ChatCompletionRequestMessage {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("role".to_string()),
            Some(self.role.to_string()),


            self.content.as_ref().map(|content| {
                [
                    "content".to_string(),
                    content.to_string(),
                ].join(",")
            }),


            self.name.as_ref().map(|name| {
                [
                    "name".to_string(),
                    name.to_string(),
                ].join(",")
            }),

            // Skipping function_call in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a ChatCompletionRequestMessage value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for ChatCompletionRequestMessage {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub role: Vec<String>,
            pub content: Vec<String>,
            pub name: Vec<String>,
            pub function_call: Vec<models::ChatCompletionRequestMessageFunctionCall>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing ChatCompletionRequestMessage".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "role" => intermediate_rep.role.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "content" => intermediate_rep.content.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "name" => intermediate_rep.name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "function_call" => intermediate_rep.function_call.push(<models::ChatCompletionRequestMessageFunctionCall as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing ChatCompletionRequestMessage".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(ChatCompletionRequestMessage {
            role: intermediate_rep.role.into_iter().next().ok_or_else(|| "role missing in ChatCompletionRequestMessage".to_string())?,
            content: intermediate_rep.content.into_iter().next(),
            name: intermediate_rep.name.into_iter().next(),
            function_call: intermediate_rep.function_call.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<ChatCompletionRequestMessage> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<ChatCompletionRequestMessage>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<ChatCompletionRequestMessage>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for ChatCompletionRequestMessage - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<ChatCompletionRequestMessage> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <ChatCompletionRequestMessage as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into ChatCompletionRequestMessage - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}




/// The name and arguments of a function that should be called, as generated by the model.



#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct ChatCompletionRequestMessageFunctionCall {
/// The name of the function to call.
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

/// The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
    #[serde(rename = "arguments")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub arguments: Option<String>,

}


impl ChatCompletionRequestMessageFunctionCall {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> ChatCompletionRequestMessageFunctionCall {
        ChatCompletionRequestMessageFunctionCall {
            name: None,
            arguments: None,
        }
    }
}

/// Converts the ChatCompletionRequestMessageFunctionCall value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for ChatCompletionRequestMessageFunctionCall {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.name.as_ref().map(|name| {
                [
                    "name".to_string(),
                    name.to_string(),
                ].join(",")
            }),


            self.arguments.as_ref().map(|arguments| {
                [
                    "arguments".to_string(),
                    arguments.to_string(),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a ChatCompletionRequestMessageFunctionCall value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for ChatCompletionRequestMessageFunctionCall {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub name: Vec<String>,
            pub arguments: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing ChatCompletionRequestMessageFunctionCall".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "name" => intermediate_rep.name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "arguments" => intermediate_rep.arguments.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing ChatCompletionRequestMessageFunctionCall".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(ChatCompletionRequestMessageFunctionCall {
            name: intermediate_rep.name.into_iter().next(),
            arguments: intermediate_rep.arguments.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<ChatCompletionRequestMessageFunctionCall> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<ChatCompletionRequestMessageFunctionCall>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<ChatCompletionRequestMessageFunctionCall>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for ChatCompletionRequestMessageFunctionCall - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<ChatCompletionRequestMessageFunctionCall> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <ChatCompletionRequestMessageFunctionCall as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into ChatCompletionRequestMessageFunctionCall - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct ChatCompletionResponseMessage {
/// The role of the author of this message.
/// Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "role")]
    pub role: String,

/// The contents of the message.
    #[serde(rename = "content")]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub content: Option<Nullable<String>>,

    #[serde(rename = "function_call")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub function_call: Option<models::ChatCompletionRequestMessageFunctionCall>,

}


impl ChatCompletionResponseMessage {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(role: String, ) -> ChatCompletionResponseMessage {
        ChatCompletionResponseMessage {
            role,
            content: None,
            function_call: None,
        }
    }
}

/// Converts the ChatCompletionResponseMessage value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for ChatCompletionResponseMessage {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("role".to_string()),
            Some(self.role.to_string()),


            self.content.as_ref().map(|content| {
                [
                    "content".to_string(),
                    content.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),

            // Skipping function_call in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a ChatCompletionResponseMessage value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for ChatCompletionResponseMessage {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub role: Vec<String>,
            pub content: Vec<String>,
            pub function_call: Vec<models::ChatCompletionRequestMessageFunctionCall>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing ChatCompletionResponseMessage".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "role" => intermediate_rep.role.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "content" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in ChatCompletionResponseMessage".to_string()),
                    #[allow(clippy::redundant_clone)]
                    "function_call" => intermediate_rep.function_call.push(<models::ChatCompletionRequestMessageFunctionCall as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing ChatCompletionResponseMessage".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(ChatCompletionResponseMessage {
            role: intermediate_rep.role.into_iter().next().ok_or_else(|| "role missing in ChatCompletionResponseMessage".to_string())?,
            content: std::result::Result::Err("Nullable types not supported in ChatCompletionResponseMessage".to_string())?,
            function_call: intermediate_rep.function_call.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<ChatCompletionResponseMessage> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<ChatCompletionResponseMessage>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<ChatCompletionResponseMessage>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for ChatCompletionResponseMessage - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<ChatCompletionResponseMessage> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <ChatCompletionResponseMessage as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into ChatCompletionResponseMessage - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct ChatCompletionStreamResponseDelta {
/// The role of the author of this message.
/// Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "role")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub role: Option<String>,

/// The contents of the chunk message.
    #[serde(rename = "content")]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub content: Option<Nullable<String>>,

    #[serde(rename = "function_call")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub function_call: Option<models::ChatCompletionRequestMessageFunctionCall>,

}


impl ChatCompletionStreamResponseDelta {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> ChatCompletionStreamResponseDelta {
        ChatCompletionStreamResponseDelta {
            role: None,
            content: None,
            function_call: None,
        }
    }
}

/// Converts the ChatCompletionStreamResponseDelta value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for ChatCompletionStreamResponseDelta {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.role.as_ref().map(|role| {
                [
                    "role".to_string(),
                    role.to_string(),
                ].join(",")
            }),


            self.content.as_ref().map(|content| {
                [
                    "content".to_string(),
                    content.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),

            // Skipping function_call in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a ChatCompletionStreamResponseDelta value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for ChatCompletionStreamResponseDelta {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub role: Vec<String>,
            pub content: Vec<String>,
            pub function_call: Vec<models::ChatCompletionRequestMessageFunctionCall>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing ChatCompletionStreamResponseDelta".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "role" => intermediate_rep.role.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "content" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in ChatCompletionStreamResponseDelta".to_string()),
                    #[allow(clippy::redundant_clone)]
                    "function_call" => intermediate_rep.function_call.push(<models::ChatCompletionRequestMessageFunctionCall as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing ChatCompletionStreamResponseDelta".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(ChatCompletionStreamResponseDelta {
            role: intermediate_rep.role.into_iter().next(),
            content: std::result::Result::Err("Nullable types not supported in ChatCompletionStreamResponseDelta".to_string())?,
            function_call: intermediate_rep.function_call.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<ChatCompletionStreamResponseDelta> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<ChatCompletionStreamResponseDelta>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<ChatCompletionStreamResponseDelta>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for ChatCompletionStreamResponseDelta - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<ChatCompletionStreamResponseDelta> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <ChatCompletionStreamResponseDelta as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into ChatCompletionStreamResponseDelta - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CreateChatCompletionRequest {
    #[serde(rename = "model")]
    pub model: models::CreateChatCompletionRequestModel,

/// A list of messages comprising the conversation so far. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_format_inputs_to_ChatGPT_models.ipynb).
    #[serde(rename = "messages")]
    #[validate(
            length(min = 1),
        )]
    pub messages: Vec<models::ChatCompletionRequestMessage>,

/// A list of functions the model may generate JSON inputs for.
    #[serde(rename = "functions")]
    #[validate(
            length(min = 1),
        )]
    #[serde(skip_serializing_if="Option::is_none")]
    pub functions: Option<Vec<models::ChatCompletionFunctions>>,

    #[serde(rename = "function_call")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub function_call: Option<models::CreateChatCompletionRequestFunctionCall>,

/// What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
    #[serde(rename = "temperature")]
    #[validate(
            range(min = 0, max = 2),
        )]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub temperature: Option<Nullable<f64>>,

/// An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
    #[serde(rename = "top_p")]
    #[validate(
            range(min = 0, max = 1),
        )]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub top_p: Option<Nullable<f64>>,

/// How many chat completion choices to generate for each input message.
    #[serde(rename = "n")]
    #[validate(
            range(min = 1, max = 128),
        )]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub n: Option<Nullable<u8>>,

/// If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb). 
    #[serde(rename = "stream")]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub stream: Option<Nullable<bool>>,

    #[serde(rename = "stop")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub stop: Option<models::CreateChatCompletionRequestStop>,

/// The maximum number of [tokens](/tokenizer) to generate in the chat completion.  The total length of input tokens and generated tokens is limited by the model's context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. 
    #[serde(rename = "max_tokens")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub max_tokens: Option<i32>,

/// Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
    #[serde(rename = "presence_penalty")]
    #[validate(
            range(min = -2, max = 2),
        )]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub presence_penalty: Option<Nullable<f64>>,

/// Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
    #[serde(rename = "frequency_penalty")]
    #[validate(
            range(min = -2, max = 2),
        )]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub frequency_penalty: Option<Nullable<f64>>,

/// Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. 
    #[serde(rename = "logit_bias")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub logit_bias: Option<crate::types::Object>,

/// A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
    #[serde(rename = "user")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub user: Option<String>,

}


impl CreateChatCompletionRequest {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(model: models::CreateChatCompletionRequestModel, messages: Vec<models::ChatCompletionRequestMessage>, ) -> CreateChatCompletionRequest {
        CreateChatCompletionRequest {
            model,
            messages,
            functions: None,
            function_call: None,
            temperature: Some(Nullable::Present(1)),
            top_p: Some(Nullable::Present(1)),
            n: Some(Nullable::Present(1)),
            stream: Some(Nullable::Present(false)),
            stop: None,
            max_tokens: None,
            presence_penalty: Some(Nullable::Present(0)),
            frequency_penalty: Some(Nullable::Present(0)),
            logit_bias: None,
            user: None,
        }
    }
}

/// Converts the CreateChatCompletionRequest value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for CreateChatCompletionRequest {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![
            // Skipping model in query parameter serialization

            // Skipping messages in query parameter serialization

            // Skipping functions in query parameter serialization

            // Skipping function_call in query parameter serialization


            self.temperature.as_ref().map(|temperature| {
                [
                    "temperature".to_string(),
                    temperature.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),


            self.top_p.as_ref().map(|top_p| {
                [
                    "top_p".to_string(),
                    top_p.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),


            self.n.as_ref().map(|n| {
                [
                    "n".to_string(),
                    n.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),


            self.stream.as_ref().map(|stream| {
                [
                    "stream".to_string(),
                    stream.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),

            // Skipping stop in query parameter serialization


            self.max_tokens.as_ref().map(|max_tokens| {
                [
                    "max_tokens".to_string(),
                    max_tokens.to_string(),
                ].join(",")
            }),


            self.presence_penalty.as_ref().map(|presence_penalty| {
                [
                    "presence_penalty".to_string(),
                    presence_penalty.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),


            self.frequency_penalty.as_ref().map(|frequency_penalty| {
                [
                    "frequency_penalty".to_string(),
                    frequency_penalty.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),

            // Skipping logit_bias in query parameter serialization


            self.user.as_ref().map(|user| {
                [
                    "user".to_string(),
                    user.to_string(),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateChatCompletionRequest value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateChatCompletionRequest {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub model: Vec<models::CreateChatCompletionRequestModel>,
            pub messages: Vec<Vec<models::ChatCompletionRequestMessage>>,
            pub functions: Vec<Vec<models::ChatCompletionFunctions>>,
            pub function_call: Vec<models::CreateChatCompletionRequestFunctionCall>,
            pub temperature: Vec<f64>,
            pub top_p: Vec<f64>,
            pub n: Vec<u8>,
            pub stream: Vec<bool>,
            pub stop: Vec<models::CreateChatCompletionRequestStop>,
            pub max_tokens: Vec<i32>,
            pub presence_penalty: Vec<f64>,
            pub frequency_penalty: Vec<f64>,
            pub logit_bias: Vec<crate::types::Object>,
            pub user: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CreateChatCompletionRequest".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "model" => intermediate_rep.model.push(<models::CreateChatCompletionRequestModel as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "messages" => return std::result::Result::Err("Parsing a container in this style is not supported in CreateChatCompletionRequest".to_string()),
                    "functions" => return std::result::Result::Err("Parsing a container in this style is not supported in CreateChatCompletionRequest".to_string()),
                    #[allow(clippy::redundant_clone)]
                    "function_call" => intermediate_rep.function_call.push(<models::CreateChatCompletionRequestFunctionCall as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "temperature" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateChatCompletionRequest".to_string()),
                    "top_p" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateChatCompletionRequest".to_string()),
                    "n" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateChatCompletionRequest".to_string()),
                    "stream" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateChatCompletionRequest".to_string()),
                    #[allow(clippy::redundant_clone)]
                    "stop" => intermediate_rep.stop.push(<models::CreateChatCompletionRequestStop as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "max_tokens" => intermediate_rep.max_tokens.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "presence_penalty" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateChatCompletionRequest".to_string()),
                    "frequency_penalty" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateChatCompletionRequest".to_string()),
                    #[allow(clippy::redundant_clone)]
                    "logit_bias" => intermediate_rep.logit_bias.push(<crate::types::Object as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "user" => intermediate_rep.user.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing CreateChatCompletionRequest".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CreateChatCompletionRequest {
            model: intermediate_rep.model.into_iter().next().ok_or_else(|| "model missing in CreateChatCompletionRequest".to_string())?,
            messages: intermediate_rep.messages.into_iter().next().ok_or_else(|| "messages missing in CreateChatCompletionRequest".to_string())?,
            functions: intermediate_rep.functions.into_iter().next(),
            function_call: intermediate_rep.function_call.into_iter().next(),
            temperature: std::result::Result::Err("Nullable types not supported in CreateChatCompletionRequest".to_string())?,
            top_p: std::result::Result::Err("Nullable types not supported in CreateChatCompletionRequest".to_string())?,
            n: std::result::Result::Err("Nullable types not supported in CreateChatCompletionRequest".to_string())?,
            stream: std::result::Result::Err("Nullable types not supported in CreateChatCompletionRequest".to_string())?,
            stop: intermediate_rep.stop.into_iter().next(),
            max_tokens: intermediate_rep.max_tokens.into_iter().next(),
            presence_penalty: std::result::Result::Err("Nullable types not supported in CreateChatCompletionRequest".to_string())?,
            frequency_penalty: std::result::Result::Err("Nullable types not supported in CreateChatCompletionRequest".to_string())?,
            logit_bias: intermediate_rep.logit_bias.into_iter().next(),
            user: intermediate_rep.user.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CreateChatCompletionRequest> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<CreateChatCompletionRequest>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CreateChatCompletionRequest>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CreateChatCompletionRequest - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<CreateChatCompletionRequest> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CreateChatCompletionRequest as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CreateChatCompletionRequest - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}




/// Controls how the model responds to function calls. \"none\" means the model does not call a function, and responds to the end-user. \"auto\" means the model can pick between an end-user or calling a function.  Specifying a particular function via `{\"name\":\\ \"my_function\"}` forces the model to call that function. \"none\" is the default when no functions are present. \"auto\" is the default if functions are present.


/// One of:
/// - CreateChatCompletionRequestFunctionCallOneOf
/// - String
#[derive(Debug, Clone, serde::Serialize, serde::Deserialize)]
pub struct CreateChatCompletionRequestFunctionCall(Box<serde_json::value::RawValue>);

impl validator::Validate for CreateChatCompletionRequestFunctionCall
{
    fn validate(&self) -> std::result::Result<(), validator::ValidationErrors> {
        std::result::Result::Ok(())
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateChatCompletionRequestFunctionCall value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateChatCompletionRequestFunctionCall {
    type Err = serde_json::Error;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        serde_json::from_str(s)
    }
}

impl PartialEq for CreateChatCompletionRequestFunctionCall {
    fn eq(&self, other: &Self) -> bool {
        self.0.get() == other.0.get()
    }
}








#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CreateChatCompletionRequestFunctionCallOneOf {
/// The name of the function to call.
    #[serde(rename = "name")]
    pub name: String,

}


impl CreateChatCompletionRequestFunctionCallOneOf {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(name: String, ) -> CreateChatCompletionRequestFunctionCallOneOf {
        CreateChatCompletionRequestFunctionCallOneOf {
            name,
        }
    }
}

/// Converts the CreateChatCompletionRequestFunctionCallOneOf value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for CreateChatCompletionRequestFunctionCallOneOf {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("name".to_string()),
            Some(self.name.to_string()),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateChatCompletionRequestFunctionCallOneOf value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateChatCompletionRequestFunctionCallOneOf {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub name: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CreateChatCompletionRequestFunctionCallOneOf".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "name" => intermediate_rep.name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing CreateChatCompletionRequestFunctionCallOneOf".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CreateChatCompletionRequestFunctionCallOneOf {
            name: intermediate_rep.name.into_iter().next().ok_or_else(|| "name missing in CreateChatCompletionRequestFunctionCallOneOf".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CreateChatCompletionRequestFunctionCallOneOf> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<CreateChatCompletionRequestFunctionCallOneOf>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CreateChatCompletionRequestFunctionCallOneOf>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CreateChatCompletionRequestFunctionCallOneOf - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<CreateChatCompletionRequestFunctionCallOneOf> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CreateChatCompletionRequestFunctionCallOneOf as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CreateChatCompletionRequestFunctionCallOneOf - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}




/// ID of the model to use. See the [model endpoint compatibility](/docs/models/model-endpoint-compatibility) table for details on which models work with the Chat API.


/// One of:
/// - String
#[derive(Debug, Clone, serde::Serialize, serde::Deserialize)]
pub struct CreateChatCompletionRequestModel(Box<serde_json::value::RawValue>);

impl validator::Validate for CreateChatCompletionRequestModel
{
    fn validate(&self) -> std::result::Result<(), validator::ValidationErrors> {
        std::result::Result::Ok(())
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateChatCompletionRequestModel value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateChatCompletionRequestModel {
    type Err = serde_json::Error;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        serde_json::from_str(s)
    }
}

impl PartialEq for CreateChatCompletionRequestModel {
    fn eq(&self, other: &Self) -> bool {
        self.0.get() == other.0.get()
    }
}





/// Up to 4 sequences where the API will stop generating further tokens. 


/// One of:
/// - String
/// - Vec<String>
#[derive(Debug, Clone, serde::Serialize, serde::Deserialize)]
pub struct CreateChatCompletionRequestStop(Box<serde_json::value::RawValue>);

impl validator::Validate for CreateChatCompletionRequestStop
{
    fn validate(&self) -> std::result::Result<(), validator::ValidationErrors> {
        std::result::Result::Ok(())
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateChatCompletionRequestStop value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateChatCompletionRequestStop {
    type Err = serde_json::Error;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        serde_json::from_str(s)
    }
}

impl PartialEq for CreateChatCompletionRequestStop {
    fn eq(&self, other: &Self) -> bool {
        self.0.get() == other.0.get()
    }
}








#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CreateChatCompletionResponse {
    #[serde(rename = "id")]
    pub id: String,

    #[serde(rename = "object")]
    pub object: String,

    #[serde(rename = "created")]
    pub created: i32,

    #[serde(rename = "model")]
    pub model: String,

    #[serde(rename = "choices")]
    pub choices: Vec<models::CreateChatCompletionResponseChoicesInner>,

    #[serde(rename = "usage")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub usage: Option<models::CreateCompletionResponseUsage>,

}


impl CreateChatCompletionResponse {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(id: String, object: String, created: i32, model: String, choices: Vec<models::CreateChatCompletionResponseChoicesInner>, ) -> CreateChatCompletionResponse {
        CreateChatCompletionResponse {
            id,
            object,
            created,
            model,
            choices,
            usage: None,
        }
    }
}

/// Converts the CreateChatCompletionResponse value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for CreateChatCompletionResponse {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("id".to_string()),
            Some(self.id.to_string()),


            Some("object".to_string()),
            Some(self.object.to_string()),


            Some("created".to_string()),
            Some(self.created.to_string()),


            Some("model".to_string()),
            Some(self.model.to_string()),

            // Skipping choices in query parameter serialization

            // Skipping usage in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateChatCompletionResponse value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateChatCompletionResponse {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub id: Vec<String>,
            pub object: Vec<String>,
            pub created: Vec<i32>,
            pub model: Vec<String>,
            pub choices: Vec<Vec<models::CreateChatCompletionResponseChoicesInner>>,
            pub usage: Vec<models::CreateCompletionResponseUsage>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CreateChatCompletionResponse".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "id" => intermediate_rep.id.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "object" => intermediate_rep.object.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "created" => intermediate_rep.created.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "model" => intermediate_rep.model.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "choices" => return std::result::Result::Err("Parsing a container in this style is not supported in CreateChatCompletionResponse".to_string()),
                    #[allow(clippy::redundant_clone)]
                    "usage" => intermediate_rep.usage.push(<models::CreateCompletionResponseUsage as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing CreateChatCompletionResponse".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CreateChatCompletionResponse {
            id: intermediate_rep.id.into_iter().next().ok_or_else(|| "id missing in CreateChatCompletionResponse".to_string())?,
            object: intermediate_rep.object.into_iter().next().ok_or_else(|| "object missing in CreateChatCompletionResponse".to_string())?,
            created: intermediate_rep.created.into_iter().next().ok_or_else(|| "created missing in CreateChatCompletionResponse".to_string())?,
            model: intermediate_rep.model.into_iter().next().ok_or_else(|| "model missing in CreateChatCompletionResponse".to_string())?,
            choices: intermediate_rep.choices.into_iter().next().ok_or_else(|| "choices missing in CreateChatCompletionResponse".to_string())?,
            usage: intermediate_rep.usage.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CreateChatCompletionResponse> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<CreateChatCompletionResponse>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CreateChatCompletionResponse>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CreateChatCompletionResponse - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<CreateChatCompletionResponse> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CreateChatCompletionResponse as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CreateChatCompletionResponse - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CreateChatCompletionResponseChoicesInner {
    #[serde(rename = "index")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub index: Option<i32>,

    #[serde(rename = "message")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub message: Option<models::ChatCompletionResponseMessage>,

/// Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "finish_reason")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub finish_reason: Option<String>,

}


impl CreateChatCompletionResponseChoicesInner {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> CreateChatCompletionResponseChoicesInner {
        CreateChatCompletionResponseChoicesInner {
            index: None,
            message: None,
            finish_reason: None,
        }
    }
}

/// Converts the CreateChatCompletionResponseChoicesInner value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for CreateChatCompletionResponseChoicesInner {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.index.as_ref().map(|index| {
                [
                    "index".to_string(),
                    index.to_string(),
                ].join(",")
            }),

            // Skipping message in query parameter serialization


            self.finish_reason.as_ref().map(|finish_reason| {
                [
                    "finish_reason".to_string(),
                    finish_reason.to_string(),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateChatCompletionResponseChoicesInner value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateChatCompletionResponseChoicesInner {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub index: Vec<i32>,
            pub message: Vec<models::ChatCompletionResponseMessage>,
            pub finish_reason: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CreateChatCompletionResponseChoicesInner".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "index" => intermediate_rep.index.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "message" => intermediate_rep.message.push(<models::ChatCompletionResponseMessage as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "finish_reason" => intermediate_rep.finish_reason.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing CreateChatCompletionResponseChoicesInner".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CreateChatCompletionResponseChoicesInner {
            index: intermediate_rep.index.into_iter().next(),
            message: intermediate_rep.message.into_iter().next(),
            finish_reason: intermediate_rep.finish_reason.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CreateChatCompletionResponseChoicesInner> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<CreateChatCompletionResponseChoicesInner>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CreateChatCompletionResponseChoicesInner>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CreateChatCompletionResponseChoicesInner - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<CreateChatCompletionResponseChoicesInner> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CreateChatCompletionResponseChoicesInner as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CreateChatCompletionResponseChoicesInner - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CreateChatCompletionStreamResponse {
    #[serde(rename = "id")]
    pub id: String,

    #[serde(rename = "object")]
    pub object: String,

    #[serde(rename = "created")]
    pub created: i32,

    #[serde(rename = "model")]
    pub model: String,

    #[serde(rename = "choices")]
    pub choices: Vec<models::CreateChatCompletionStreamResponseChoicesInner>,

}


impl CreateChatCompletionStreamResponse {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(id: String, object: String, created: i32, model: String, choices: Vec<models::CreateChatCompletionStreamResponseChoicesInner>, ) -> CreateChatCompletionStreamResponse {
        CreateChatCompletionStreamResponse {
            id,
            object,
            created,
            model,
            choices,
        }
    }
}

/// Converts the CreateChatCompletionStreamResponse value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for CreateChatCompletionStreamResponse {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("id".to_string()),
            Some(self.id.to_string()),


            Some("object".to_string()),
            Some(self.object.to_string()),


            Some("created".to_string()),
            Some(self.created.to_string()),


            Some("model".to_string()),
            Some(self.model.to_string()),

            // Skipping choices in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateChatCompletionStreamResponse value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateChatCompletionStreamResponse {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub id: Vec<String>,
            pub object: Vec<String>,
            pub created: Vec<i32>,
            pub model: Vec<String>,
            pub choices: Vec<Vec<models::CreateChatCompletionStreamResponseChoicesInner>>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CreateChatCompletionStreamResponse".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "id" => intermediate_rep.id.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "object" => intermediate_rep.object.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "created" => intermediate_rep.created.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "model" => intermediate_rep.model.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "choices" => return std::result::Result::Err("Parsing a container in this style is not supported in CreateChatCompletionStreamResponse".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing CreateChatCompletionStreamResponse".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CreateChatCompletionStreamResponse {
            id: intermediate_rep.id.into_iter().next().ok_or_else(|| "id missing in CreateChatCompletionStreamResponse".to_string())?,
            object: intermediate_rep.object.into_iter().next().ok_or_else(|| "object missing in CreateChatCompletionStreamResponse".to_string())?,
            created: intermediate_rep.created.into_iter().next().ok_or_else(|| "created missing in CreateChatCompletionStreamResponse".to_string())?,
            model: intermediate_rep.model.into_iter().next().ok_or_else(|| "model missing in CreateChatCompletionStreamResponse".to_string())?,
            choices: intermediate_rep.choices.into_iter().next().ok_or_else(|| "choices missing in CreateChatCompletionStreamResponse".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CreateChatCompletionStreamResponse> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<CreateChatCompletionStreamResponse>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CreateChatCompletionStreamResponse>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CreateChatCompletionStreamResponse - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<CreateChatCompletionStreamResponse> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CreateChatCompletionStreamResponse as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CreateChatCompletionStreamResponse - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CreateChatCompletionStreamResponseChoicesInner {
    #[serde(rename = "index")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub index: Option<i32>,

    #[serde(rename = "delta")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub delta: Option<models::ChatCompletionStreamResponseDelta>,

/// Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "finish_reason")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub finish_reason: Option<String>,

}


impl CreateChatCompletionStreamResponseChoicesInner {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> CreateChatCompletionStreamResponseChoicesInner {
        CreateChatCompletionStreamResponseChoicesInner {
            index: None,
            delta: None,
            finish_reason: None,
        }
    }
}

/// Converts the CreateChatCompletionStreamResponseChoicesInner value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for CreateChatCompletionStreamResponseChoicesInner {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.index.as_ref().map(|index| {
                [
                    "index".to_string(),
                    index.to_string(),
                ].join(",")
            }),

            // Skipping delta in query parameter serialization


            self.finish_reason.as_ref().map(|finish_reason| {
                [
                    "finish_reason".to_string(),
                    finish_reason.to_string(),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateChatCompletionStreamResponseChoicesInner value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateChatCompletionStreamResponseChoicesInner {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub index: Vec<i32>,
            pub delta: Vec<models::ChatCompletionStreamResponseDelta>,
            pub finish_reason: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CreateChatCompletionStreamResponseChoicesInner".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "index" => intermediate_rep.index.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "delta" => intermediate_rep.delta.push(<models::ChatCompletionStreamResponseDelta as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "finish_reason" => intermediate_rep.finish_reason.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing CreateChatCompletionStreamResponseChoicesInner".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CreateChatCompletionStreamResponseChoicesInner {
            index: intermediate_rep.index.into_iter().next(),
            delta: intermediate_rep.delta.into_iter().next(),
            finish_reason: intermediate_rep.finish_reason.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CreateChatCompletionStreamResponseChoicesInner> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<CreateChatCompletionStreamResponseChoicesInner>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CreateChatCompletionStreamResponseChoicesInner>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CreateChatCompletionStreamResponseChoicesInner - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<CreateChatCompletionStreamResponseChoicesInner> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CreateChatCompletionStreamResponseChoicesInner as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CreateChatCompletionStreamResponseChoicesInner - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CreateCompletionRequest {
    #[serde(rename = "model")]
    pub model: models::CreateCompletionRequestModel,

    #[serde(rename = "prompt")]
    pub prompt: Nullable<models::CreateCompletionRequestPrompt>,

/// The suffix that comes after a completion of inserted text.
    #[serde(rename = "suffix")]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub suffix: Option<Nullable<String>>,

/// The maximum number of [tokens](/tokenizer) to generate in the completion.  The token count of your prompt plus `max_tokens` cannot exceed the model's context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. 
    #[serde(rename = "max_tokens")]
    #[validate(
            range(min = 0),
        )]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub max_tokens: Option<Nullable<u32>>,

/// What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
    #[serde(rename = "temperature")]
    #[validate(
            range(min = 0, max = 2),
        )]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub temperature: Option<Nullable<f64>>,

/// An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
    #[serde(rename = "top_p")]
    #[validate(
            range(min = 0, max = 1),
        )]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub top_p: Option<Nullable<f64>>,

/// How many completions to generate for each prompt.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. 
    #[serde(rename = "n")]
    #[validate(
            range(min = 1, max = 128),
        )]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub n: Option<Nullable<u8>>,

/// Whether to stream back partial progress. If set, tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb). 
    #[serde(rename = "stream")]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub stream: Option<Nullable<bool>>,

/// Include the log probabilities on the `logprobs` most likely tokens, as well the chosen tokens. For example, if `logprobs` is 5, the API will return a list of the 5 most likely tokens. The API will always return the `logprob` of the sampled token, so there may be up to `logprobs+1` elements in the response.  The maximum value for `logprobs` is 5. 
    #[serde(rename = "logprobs")]
    #[validate(
            range(min = 0, max = 5),
        )]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub logprobs: Option<Nullable<u8>>,

/// Echo back the prompt in addition to the completion 
    #[serde(rename = "echo")]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub echo: Option<Nullable<bool>>,

    #[serde(rename = "stop")]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub stop: Option<Nullable<models::CreateCompletionRequestStop>>,

/// Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
    #[serde(rename = "presence_penalty")]
    #[validate(
            range(min = -2, max = 2),
        )]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub presence_penalty: Option<Nullable<f64>>,

/// Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
    #[serde(rename = "frequency_penalty")]
    #[validate(
            range(min = -2, max = 2),
        )]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub frequency_penalty: Option<Nullable<f64>>,

/// Generates `best_of` completions server-side and returns the \"best\" (the one with the highest log probability per token). Results cannot be streamed.  When used with `n`, `best_of` controls the number of candidate completions and `n` specifies how many to return – `best_of` must be greater than `n`.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. 
    #[serde(rename = "best_of")]
    #[validate(
            range(min = 0, max = 20),
        )]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub best_of: Option<Nullable<u8>>,

/// Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the GPT tokenizer) to an associated bias value from -100 to 100. You can use this [tokenizer tool](/tokenizer?view=bpe) (which works for both GPT-2 and GPT-3) to convert text to token IDs. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  As an example, you can pass `{\"50256\": -100}` to prevent the <|endoftext|> token from being generated. 
    #[serde(rename = "logit_bias")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub logit_bias: Option<crate::types::Object>,

/// A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
    #[serde(rename = "user")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub user: Option<String>,

}


impl CreateCompletionRequest {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(model: models::CreateCompletionRequestModel, prompt: Nullable<models::CreateCompletionRequestPrompt>, ) -> CreateCompletionRequest {
        CreateCompletionRequest {
            model,
            prompt,
            suffix: None,
            max_tokens: Some(Nullable::Present(16)),
            temperature: Some(Nullable::Present(1)),
            top_p: Some(Nullable::Present(1)),
            n: Some(Nullable::Present(1)),
            stream: Some(Nullable::Present(false)),
            logprobs: None,
            echo: Some(Nullable::Present(false)),
            stop: None,
            presence_penalty: Some(Nullable::Present(0)),
            frequency_penalty: Some(Nullable::Present(0)),
            best_of: Some(Nullable::Present(1)),
            logit_bias: None,
            user: None,
        }
    }
}

/// Converts the CreateCompletionRequest value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for CreateCompletionRequest {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![
            // Skipping model in query parameter serialization

            // Skipping prompt in query parameter serialization


            self.suffix.as_ref().map(|suffix| {
                [
                    "suffix".to_string(),
                    suffix.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),


            self.max_tokens.as_ref().map(|max_tokens| {
                [
                    "max_tokens".to_string(),
                    max_tokens.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),


            self.temperature.as_ref().map(|temperature| {
                [
                    "temperature".to_string(),
                    temperature.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),


            self.top_p.as_ref().map(|top_p| {
                [
                    "top_p".to_string(),
                    top_p.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),


            self.n.as_ref().map(|n| {
                [
                    "n".to_string(),
                    n.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),


            self.stream.as_ref().map(|stream| {
                [
                    "stream".to_string(),
                    stream.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),


            self.logprobs.as_ref().map(|logprobs| {
                [
                    "logprobs".to_string(),
                    logprobs.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),


            self.echo.as_ref().map(|echo| {
                [
                    "echo".to_string(),
                    echo.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),

            // Skipping stop in query parameter serialization


            self.presence_penalty.as_ref().map(|presence_penalty| {
                [
                    "presence_penalty".to_string(),
                    presence_penalty.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),


            self.frequency_penalty.as_ref().map(|frequency_penalty| {
                [
                    "frequency_penalty".to_string(),
                    frequency_penalty.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),


            self.best_of.as_ref().map(|best_of| {
                [
                    "best_of".to_string(),
                    best_of.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),

            // Skipping logit_bias in query parameter serialization


            self.user.as_ref().map(|user| {
                [
                    "user".to_string(),
                    user.to_string(),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateCompletionRequest value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateCompletionRequest {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub model: Vec<models::CreateCompletionRequestModel>,
            pub prompt: Vec<models::CreateCompletionRequestPrompt>,
            pub suffix: Vec<String>,
            pub max_tokens: Vec<u32>,
            pub temperature: Vec<f64>,
            pub top_p: Vec<f64>,
            pub n: Vec<u8>,
            pub stream: Vec<bool>,
            pub logprobs: Vec<u8>,
            pub echo: Vec<bool>,
            pub stop: Vec<models::CreateCompletionRequestStop>,
            pub presence_penalty: Vec<f64>,
            pub frequency_penalty: Vec<f64>,
            pub best_of: Vec<u8>,
            pub logit_bias: Vec<crate::types::Object>,
            pub user: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CreateCompletionRequest".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "model" => intermediate_rep.model.push(<models::CreateCompletionRequestModel as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "prompt" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateCompletionRequest".to_string()),
                    "suffix" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateCompletionRequest".to_string()),
                    "max_tokens" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateCompletionRequest".to_string()),
                    "temperature" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateCompletionRequest".to_string()),
                    "top_p" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateCompletionRequest".to_string()),
                    "n" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateCompletionRequest".to_string()),
                    "stream" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateCompletionRequest".to_string()),
                    "logprobs" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateCompletionRequest".to_string()),
                    "echo" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateCompletionRequest".to_string()),
                    "stop" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateCompletionRequest".to_string()),
                    "presence_penalty" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateCompletionRequest".to_string()),
                    "frequency_penalty" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateCompletionRequest".to_string()),
                    "best_of" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateCompletionRequest".to_string()),
                    #[allow(clippy::redundant_clone)]
                    "logit_bias" => intermediate_rep.logit_bias.push(<crate::types::Object as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "user" => intermediate_rep.user.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing CreateCompletionRequest".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CreateCompletionRequest {
            model: intermediate_rep.model.into_iter().next().ok_or_else(|| "model missing in CreateCompletionRequest".to_string())?,
            prompt: std::result::Result::Err("Nullable types not supported in CreateCompletionRequest".to_string())?,
            suffix: std::result::Result::Err("Nullable types not supported in CreateCompletionRequest".to_string())?,
            max_tokens: std::result::Result::Err("Nullable types not supported in CreateCompletionRequest".to_string())?,
            temperature: std::result::Result::Err("Nullable types not supported in CreateCompletionRequest".to_string())?,
            top_p: std::result::Result::Err("Nullable types not supported in CreateCompletionRequest".to_string())?,
            n: std::result::Result::Err("Nullable types not supported in CreateCompletionRequest".to_string())?,
            stream: std::result::Result::Err("Nullable types not supported in CreateCompletionRequest".to_string())?,
            logprobs: std::result::Result::Err("Nullable types not supported in CreateCompletionRequest".to_string())?,
            echo: std::result::Result::Err("Nullable types not supported in CreateCompletionRequest".to_string())?,
            stop: std::result::Result::Err("Nullable types not supported in CreateCompletionRequest".to_string())?,
            presence_penalty: std::result::Result::Err("Nullable types not supported in CreateCompletionRequest".to_string())?,
            frequency_penalty: std::result::Result::Err("Nullable types not supported in CreateCompletionRequest".to_string())?,
            best_of: std::result::Result::Err("Nullable types not supported in CreateCompletionRequest".to_string())?,
            logit_bias: intermediate_rep.logit_bias.into_iter().next(),
            user: intermediate_rep.user.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CreateCompletionRequest> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<CreateCompletionRequest>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CreateCompletionRequest>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CreateCompletionRequest - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<CreateCompletionRequest> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CreateCompletionRequest as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CreateCompletionRequest - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}




/// ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 


/// One of:
/// - String
#[derive(Debug, Clone, serde::Serialize, serde::Deserialize)]
pub struct CreateCompletionRequestModel(Box<serde_json::value::RawValue>);

impl validator::Validate for CreateCompletionRequestModel
{
    fn validate(&self) -> std::result::Result<(), validator::ValidationErrors> {
        std::result::Result::Ok(())
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateCompletionRequestModel value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateCompletionRequestModel {
    type Err = serde_json::Error;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        serde_json::from_str(s)
    }
}

impl PartialEq for CreateCompletionRequestModel {
    fn eq(&self, other: &Self) -> bool {
        self.0.get() == other.0.get()
    }
}





/// The prompt(s) to generate completions for, encoded as a string, array of strings, array of tokens, or array of token arrays.  Note that <|endoftext|> is the document separator that the model sees during training, so if a prompt is not specified the model will generate as if from the beginning of a new document. 


/// One of:
/// - String
/// - Vec<String>
/// - Vec<Vec<i32>>
/// - Vec<i32>
#[derive(Debug, Clone, serde::Serialize, serde::Deserialize)]
pub struct CreateCompletionRequestPrompt(Box<serde_json::value::RawValue>);

impl validator::Validate for CreateCompletionRequestPrompt
{
    fn validate(&self) -> std::result::Result<(), validator::ValidationErrors> {
        std::result::Result::Ok(())
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateCompletionRequestPrompt value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateCompletionRequestPrompt {
    type Err = serde_json::Error;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        serde_json::from_str(s)
    }
}

impl PartialEq for CreateCompletionRequestPrompt {
    fn eq(&self, other: &Self) -> bool {
        self.0.get() == other.0.get()
    }
}





/// Up to 4 sequences where the API will stop generating further tokens. The returned text will not contain the stop sequence. 


/// One of:
/// - String
/// - Vec<String>
#[derive(Debug, Clone, serde::Serialize, serde::Deserialize)]
pub struct CreateCompletionRequestStop(Box<serde_json::value::RawValue>);

impl validator::Validate for CreateCompletionRequestStop
{
    fn validate(&self) -> std::result::Result<(), validator::ValidationErrors> {
        std::result::Result::Ok(())
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateCompletionRequestStop value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateCompletionRequestStop {
    type Err = serde_json::Error;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        serde_json::from_str(s)
    }
}

impl PartialEq for CreateCompletionRequestStop {
    fn eq(&self, other: &Self) -> bool {
        self.0.get() == other.0.get()
    }
}








#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CreateCompletionResponse {
    #[serde(rename = "id")]
    pub id: String,

    #[serde(rename = "object")]
    pub object: String,

    #[serde(rename = "created")]
    pub created: i32,

    #[serde(rename = "model")]
    pub model: String,

    #[serde(rename = "choices")]
    pub choices: Vec<models::CreateCompletionResponseChoicesInner>,

    #[serde(rename = "usage")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub usage: Option<models::CreateCompletionResponseUsage>,

}


impl CreateCompletionResponse {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(id: String, object: String, created: i32, model: String, choices: Vec<models::CreateCompletionResponseChoicesInner>, ) -> CreateCompletionResponse {
        CreateCompletionResponse {
            id,
            object,
            created,
            model,
            choices,
            usage: None,
        }
    }
}

/// Converts the CreateCompletionResponse value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for CreateCompletionResponse {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("id".to_string()),
            Some(self.id.to_string()),


            Some("object".to_string()),
            Some(self.object.to_string()),


            Some("created".to_string()),
            Some(self.created.to_string()),


            Some("model".to_string()),
            Some(self.model.to_string()),

            // Skipping choices in query parameter serialization

            // Skipping usage in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateCompletionResponse value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateCompletionResponse {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub id: Vec<String>,
            pub object: Vec<String>,
            pub created: Vec<i32>,
            pub model: Vec<String>,
            pub choices: Vec<Vec<models::CreateCompletionResponseChoicesInner>>,
            pub usage: Vec<models::CreateCompletionResponseUsage>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CreateCompletionResponse".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "id" => intermediate_rep.id.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "object" => intermediate_rep.object.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "created" => intermediate_rep.created.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "model" => intermediate_rep.model.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "choices" => return std::result::Result::Err("Parsing a container in this style is not supported in CreateCompletionResponse".to_string()),
                    #[allow(clippy::redundant_clone)]
                    "usage" => intermediate_rep.usage.push(<models::CreateCompletionResponseUsage as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing CreateCompletionResponse".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CreateCompletionResponse {
            id: intermediate_rep.id.into_iter().next().ok_or_else(|| "id missing in CreateCompletionResponse".to_string())?,
            object: intermediate_rep.object.into_iter().next().ok_or_else(|| "object missing in CreateCompletionResponse".to_string())?,
            created: intermediate_rep.created.into_iter().next().ok_or_else(|| "created missing in CreateCompletionResponse".to_string())?,
            model: intermediate_rep.model.into_iter().next().ok_or_else(|| "model missing in CreateCompletionResponse".to_string())?,
            choices: intermediate_rep.choices.into_iter().next().ok_or_else(|| "choices missing in CreateCompletionResponse".to_string())?,
            usage: intermediate_rep.usage.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CreateCompletionResponse> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<CreateCompletionResponse>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CreateCompletionResponse>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CreateCompletionResponse - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<CreateCompletionResponse> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CreateCompletionResponse as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CreateCompletionResponse - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CreateCompletionResponseChoicesInner {
    #[serde(rename = "text")]
    pub text: String,

    #[serde(rename = "index")]
    pub index: i32,

    #[serde(rename = "logprobs")]
    pub logprobs: Nullable<models::CreateCompletionResponseChoicesInnerLogprobs>,

/// Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "finish_reason")]
    pub finish_reason: String,

}


impl CreateCompletionResponseChoicesInner {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(text: String, index: i32, logprobs: Nullable<models::CreateCompletionResponseChoicesInnerLogprobs>, finish_reason: String, ) -> CreateCompletionResponseChoicesInner {
        CreateCompletionResponseChoicesInner {
            text,
            index,
            logprobs,
            finish_reason,
        }
    }
}

/// Converts the CreateCompletionResponseChoicesInner value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for CreateCompletionResponseChoicesInner {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("text".to_string()),
            Some(self.text.to_string()),


            Some("index".to_string()),
            Some(self.index.to_string()),

            // Skipping logprobs in query parameter serialization


            Some("finish_reason".to_string()),
            Some(self.finish_reason.to_string()),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateCompletionResponseChoicesInner value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateCompletionResponseChoicesInner {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub text: Vec<String>,
            pub index: Vec<i32>,
            pub logprobs: Vec<models::CreateCompletionResponseChoicesInnerLogprobs>,
            pub finish_reason: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CreateCompletionResponseChoicesInner".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "text" => intermediate_rep.text.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "index" => intermediate_rep.index.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "logprobs" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateCompletionResponseChoicesInner".to_string()),
                    #[allow(clippy::redundant_clone)]
                    "finish_reason" => intermediate_rep.finish_reason.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing CreateCompletionResponseChoicesInner".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CreateCompletionResponseChoicesInner {
            text: intermediate_rep.text.into_iter().next().ok_or_else(|| "text missing in CreateCompletionResponseChoicesInner".to_string())?,
            index: intermediate_rep.index.into_iter().next().ok_or_else(|| "index missing in CreateCompletionResponseChoicesInner".to_string())?,
            logprobs: std::result::Result::Err("Nullable types not supported in CreateCompletionResponseChoicesInner".to_string())?,
            finish_reason: intermediate_rep.finish_reason.into_iter().next().ok_or_else(|| "finish_reason missing in CreateCompletionResponseChoicesInner".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CreateCompletionResponseChoicesInner> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<CreateCompletionResponseChoicesInner>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CreateCompletionResponseChoicesInner>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CreateCompletionResponseChoicesInner - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<CreateCompletionResponseChoicesInner> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CreateCompletionResponseChoicesInner as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CreateCompletionResponseChoicesInner - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CreateCompletionResponseChoicesInnerLogprobs {
    #[serde(rename = "tokens")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub tokens: Option<Vec<String>>,

    #[serde(rename = "token_logprobs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub token_logprobs: Option<Vec<f64>>,

    #[serde(rename = "top_logprobs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub top_logprobs: Option<Vec<crate::types::Object>>,

    #[serde(rename = "text_offset")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub text_offset: Option<Vec<i32>>,

}


impl CreateCompletionResponseChoicesInnerLogprobs {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> CreateCompletionResponseChoicesInnerLogprobs {
        CreateCompletionResponseChoicesInnerLogprobs {
            tokens: None,
            token_logprobs: None,
            top_logprobs: None,
            text_offset: None,
        }
    }
}

/// Converts the CreateCompletionResponseChoicesInnerLogprobs value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for CreateCompletionResponseChoicesInnerLogprobs {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.tokens.as_ref().map(|tokens| {
                [
                    "tokens".to_string(),
                    tokens.iter().map(|x| x.to_string()).collect::<Vec<_>>().join(","),
                ].join(",")
            }),


            self.token_logprobs.as_ref().map(|token_logprobs| {
                [
                    "token_logprobs".to_string(),
                    token_logprobs.iter().map(|x| x.to_string()).collect::<Vec<_>>().join(","),
                ].join(",")
            }),

            // Skipping top_logprobs in query parameter serialization


            self.text_offset.as_ref().map(|text_offset| {
                [
                    "text_offset".to_string(),
                    text_offset.iter().map(|x| x.to_string()).collect::<Vec<_>>().join(","),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateCompletionResponseChoicesInnerLogprobs value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateCompletionResponseChoicesInnerLogprobs {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub tokens: Vec<Vec<String>>,
            pub token_logprobs: Vec<Vec<f64>>,
            pub top_logprobs: Vec<Vec<crate::types::Object>>,
            pub text_offset: Vec<Vec<i32>>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CreateCompletionResponseChoicesInnerLogprobs".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    "tokens" => return std::result::Result::Err("Parsing a container in this style is not supported in CreateCompletionResponseChoicesInnerLogprobs".to_string()),
                    "token_logprobs" => return std::result::Result::Err("Parsing a container in this style is not supported in CreateCompletionResponseChoicesInnerLogprobs".to_string()),
                    "top_logprobs" => return std::result::Result::Err("Parsing a container in this style is not supported in CreateCompletionResponseChoicesInnerLogprobs".to_string()),
                    "text_offset" => return std::result::Result::Err("Parsing a container in this style is not supported in CreateCompletionResponseChoicesInnerLogprobs".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing CreateCompletionResponseChoicesInnerLogprobs".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CreateCompletionResponseChoicesInnerLogprobs {
            tokens: intermediate_rep.tokens.into_iter().next(),
            token_logprobs: intermediate_rep.token_logprobs.into_iter().next(),
            top_logprobs: intermediate_rep.top_logprobs.into_iter().next(),
            text_offset: intermediate_rep.text_offset.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CreateCompletionResponseChoicesInnerLogprobs> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<CreateCompletionResponseChoicesInnerLogprobs>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CreateCompletionResponseChoicesInnerLogprobs>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CreateCompletionResponseChoicesInnerLogprobs - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<CreateCompletionResponseChoicesInnerLogprobs> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CreateCompletionResponseChoicesInnerLogprobs as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CreateCompletionResponseChoicesInnerLogprobs - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CreateCompletionResponseUsage {
    #[serde(rename = "prompt_tokens")]
    pub prompt_tokens: i32,

    #[serde(rename = "completion_tokens")]
    pub completion_tokens: i32,

    #[serde(rename = "total_tokens")]
    pub total_tokens: i32,

}


impl CreateCompletionResponseUsage {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(prompt_tokens: i32, completion_tokens: i32, total_tokens: i32, ) -> CreateCompletionResponseUsage {
        CreateCompletionResponseUsage {
            prompt_tokens,
            completion_tokens,
            total_tokens,
        }
    }
}

/// Converts the CreateCompletionResponseUsage value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for CreateCompletionResponseUsage {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("prompt_tokens".to_string()),
            Some(self.prompt_tokens.to_string()),


            Some("completion_tokens".to_string()),
            Some(self.completion_tokens.to_string()),


            Some("total_tokens".to_string()),
            Some(self.total_tokens.to_string()),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateCompletionResponseUsage value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateCompletionResponseUsage {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub prompt_tokens: Vec<i32>,
            pub completion_tokens: Vec<i32>,
            pub total_tokens: Vec<i32>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CreateCompletionResponseUsage".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "prompt_tokens" => intermediate_rep.prompt_tokens.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "completion_tokens" => intermediate_rep.completion_tokens.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "total_tokens" => intermediate_rep.total_tokens.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing CreateCompletionResponseUsage".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CreateCompletionResponseUsage {
            prompt_tokens: intermediate_rep.prompt_tokens.into_iter().next().ok_or_else(|| "prompt_tokens missing in CreateCompletionResponseUsage".to_string())?,
            completion_tokens: intermediate_rep.completion_tokens.into_iter().next().ok_or_else(|| "completion_tokens missing in CreateCompletionResponseUsage".to_string())?,
            total_tokens: intermediate_rep.total_tokens.into_iter().next().ok_or_else(|| "total_tokens missing in CreateCompletionResponseUsage".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CreateCompletionResponseUsage> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<CreateCompletionResponseUsage>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CreateCompletionResponseUsage>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CreateCompletionResponseUsage - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<CreateCompletionResponseUsage> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CreateCompletionResponseUsage as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CreateCompletionResponseUsage - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CreateEditRequest {
    #[serde(rename = "model")]
    pub model: models::CreateEditRequestModel,

/// The input text to use as a starting point for the edit.
    #[serde(rename = "input")]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub input: Option<Nullable<String>>,

/// The instruction that tells the model how to edit the prompt.
    #[serde(rename = "instruction")]
    pub instruction: String,

/// How many edits to generate for the input and instruction.
    #[serde(rename = "n")]
    #[validate(
            range(min = 1, max = 20),
        )]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub n: Option<Nullable<u8>>,

/// What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
    #[serde(rename = "temperature")]
    #[validate(
            range(min = 0, max = 2),
        )]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub temperature: Option<Nullable<f64>>,

/// An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
    #[serde(rename = "top_p")]
    #[validate(
            range(min = 0, max = 1),
        )]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub top_p: Option<Nullable<f64>>,

}


impl CreateEditRequest {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(model: models::CreateEditRequestModel, instruction: String, ) -> CreateEditRequest {
        CreateEditRequest {
            model,
            input: Some(Nullable::Present("".to_string())),
            instruction,
            n: Some(Nullable::Present(1)),
            temperature: Some(Nullable::Present(1)),
            top_p: Some(Nullable::Present(1)),
        }
    }
}

/// Converts the CreateEditRequest value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for CreateEditRequest {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![
            // Skipping model in query parameter serialization


            self.input.as_ref().map(|input| {
                [
                    "input".to_string(),
                    input.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),


            Some("instruction".to_string()),
            Some(self.instruction.to_string()),


            self.n.as_ref().map(|n| {
                [
                    "n".to_string(),
                    n.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),


            self.temperature.as_ref().map(|temperature| {
                [
                    "temperature".to_string(),
                    temperature.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),


            self.top_p.as_ref().map(|top_p| {
                [
                    "top_p".to_string(),
                    top_p.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateEditRequest value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateEditRequest {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub model: Vec<models::CreateEditRequestModel>,
            pub input: Vec<String>,
            pub instruction: Vec<String>,
            pub n: Vec<u8>,
            pub temperature: Vec<f64>,
            pub top_p: Vec<f64>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CreateEditRequest".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "model" => intermediate_rep.model.push(<models::CreateEditRequestModel as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "input" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateEditRequest".to_string()),
                    #[allow(clippy::redundant_clone)]
                    "instruction" => intermediate_rep.instruction.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "n" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateEditRequest".to_string()),
                    "temperature" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateEditRequest".to_string()),
                    "top_p" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateEditRequest".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing CreateEditRequest".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CreateEditRequest {
            model: intermediate_rep.model.into_iter().next().ok_or_else(|| "model missing in CreateEditRequest".to_string())?,
            input: std::result::Result::Err("Nullable types not supported in CreateEditRequest".to_string())?,
            instruction: intermediate_rep.instruction.into_iter().next().ok_or_else(|| "instruction missing in CreateEditRequest".to_string())?,
            n: std::result::Result::Err("Nullable types not supported in CreateEditRequest".to_string())?,
            temperature: std::result::Result::Err("Nullable types not supported in CreateEditRequest".to_string())?,
            top_p: std::result::Result::Err("Nullable types not supported in CreateEditRequest".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CreateEditRequest> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<CreateEditRequest>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CreateEditRequest>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CreateEditRequest - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<CreateEditRequest> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CreateEditRequest as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CreateEditRequest - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}




/// ID of the model to use. You can use the `text-davinci-edit-001` or `code-davinci-edit-001` model with this endpoint.


/// One of:
/// - String
#[derive(Debug, Clone, serde::Serialize, serde::Deserialize)]
pub struct CreateEditRequestModel(Box<serde_json::value::RawValue>);

impl validator::Validate for CreateEditRequestModel
{
    fn validate(&self) -> std::result::Result<(), validator::ValidationErrors> {
        std::result::Result::Ok(())
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateEditRequestModel value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateEditRequestModel {
    type Err = serde_json::Error;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        serde_json::from_str(s)
    }
}

impl PartialEq for CreateEditRequestModel {
    fn eq(&self, other: &Self) -> bool {
        self.0.get() == other.0.get()
    }
}








#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CreateEditResponse {
    #[serde(rename = "object")]
    pub object: String,

    #[serde(rename = "created")]
    pub created: i32,

    #[serde(rename = "choices")]
    pub choices: Vec<models::CreateEditResponseChoicesInner>,

    #[serde(rename = "usage")]
    pub usage: models::CreateCompletionResponseUsage,

}


impl CreateEditResponse {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(object: String, created: i32, choices: Vec<models::CreateEditResponseChoicesInner>, usage: models::CreateCompletionResponseUsage, ) -> CreateEditResponse {
        CreateEditResponse {
            object,
            created,
            choices,
            usage,
        }
    }
}

/// Converts the CreateEditResponse value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for CreateEditResponse {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("object".to_string()),
            Some(self.object.to_string()),


            Some("created".to_string()),
            Some(self.created.to_string()),

            // Skipping choices in query parameter serialization

            // Skipping usage in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateEditResponse value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateEditResponse {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub object: Vec<String>,
            pub created: Vec<i32>,
            pub choices: Vec<Vec<models::CreateEditResponseChoicesInner>>,
            pub usage: Vec<models::CreateCompletionResponseUsage>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CreateEditResponse".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "object" => intermediate_rep.object.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "created" => intermediate_rep.created.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "choices" => return std::result::Result::Err("Parsing a container in this style is not supported in CreateEditResponse".to_string()),
                    #[allow(clippy::redundant_clone)]
                    "usage" => intermediate_rep.usage.push(<models::CreateCompletionResponseUsage as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing CreateEditResponse".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CreateEditResponse {
            object: intermediate_rep.object.into_iter().next().ok_or_else(|| "object missing in CreateEditResponse".to_string())?,
            created: intermediate_rep.created.into_iter().next().ok_or_else(|| "created missing in CreateEditResponse".to_string())?,
            choices: intermediate_rep.choices.into_iter().next().ok_or_else(|| "choices missing in CreateEditResponse".to_string())?,
            usage: intermediate_rep.usage.into_iter().next().ok_or_else(|| "usage missing in CreateEditResponse".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CreateEditResponse> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<CreateEditResponse>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CreateEditResponse>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CreateEditResponse - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<CreateEditResponse> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CreateEditResponse as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CreateEditResponse - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CreateEditResponseChoicesInner {
    #[serde(rename = "text")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub text: Option<String>,

    #[serde(rename = "index")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub index: Option<i32>,

    #[serde(rename = "logprobs")]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub logprobs: Option<Nullable<models::CreateCompletionResponseChoicesInnerLogprobs>>,

/// Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "finish_reason")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub finish_reason: Option<String>,

}


impl CreateEditResponseChoicesInner {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> CreateEditResponseChoicesInner {
        CreateEditResponseChoicesInner {
            text: None,
            index: None,
            logprobs: None,
            finish_reason: None,
        }
    }
}

/// Converts the CreateEditResponseChoicesInner value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for CreateEditResponseChoicesInner {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.text.as_ref().map(|text| {
                [
                    "text".to_string(),
                    text.to_string(),
                ].join(",")
            }),


            self.index.as_ref().map(|index| {
                [
                    "index".to_string(),
                    index.to_string(),
                ].join(",")
            }),

            // Skipping logprobs in query parameter serialization


            self.finish_reason.as_ref().map(|finish_reason| {
                [
                    "finish_reason".to_string(),
                    finish_reason.to_string(),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateEditResponseChoicesInner value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateEditResponseChoicesInner {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub text: Vec<String>,
            pub index: Vec<i32>,
            pub logprobs: Vec<models::CreateCompletionResponseChoicesInnerLogprobs>,
            pub finish_reason: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CreateEditResponseChoicesInner".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "text" => intermediate_rep.text.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "index" => intermediate_rep.index.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "logprobs" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateEditResponseChoicesInner".to_string()),
                    #[allow(clippy::redundant_clone)]
                    "finish_reason" => intermediate_rep.finish_reason.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing CreateEditResponseChoicesInner".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CreateEditResponseChoicesInner {
            text: intermediate_rep.text.into_iter().next(),
            index: intermediate_rep.index.into_iter().next(),
            logprobs: std::result::Result::Err("Nullable types not supported in CreateEditResponseChoicesInner".to_string())?,
            finish_reason: intermediate_rep.finish_reason.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CreateEditResponseChoicesInner> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<CreateEditResponseChoicesInner>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CreateEditResponseChoicesInner>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CreateEditResponseChoicesInner - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<CreateEditResponseChoicesInner> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CreateEditResponseChoicesInner as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CreateEditResponseChoicesInner - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CreateEmbeddingRequest {
    #[serde(rename = "model")]
    pub model: models::CreateEmbeddingRequestModel,

    #[serde(rename = "input")]
    pub input: models::CreateEmbeddingRequestInput,

/// A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
    #[serde(rename = "user")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub user: Option<String>,

}


impl CreateEmbeddingRequest {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(model: models::CreateEmbeddingRequestModel, input: models::CreateEmbeddingRequestInput, ) -> CreateEmbeddingRequest {
        CreateEmbeddingRequest {
            model,
            input,
            user: None,
        }
    }
}

/// Converts the CreateEmbeddingRequest value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for CreateEmbeddingRequest {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![
            // Skipping model in query parameter serialization

            // Skipping input in query parameter serialization


            self.user.as_ref().map(|user| {
                [
                    "user".to_string(),
                    user.to_string(),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateEmbeddingRequest value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateEmbeddingRequest {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub model: Vec<models::CreateEmbeddingRequestModel>,
            pub input: Vec<models::CreateEmbeddingRequestInput>,
            pub user: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CreateEmbeddingRequest".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "model" => intermediate_rep.model.push(<models::CreateEmbeddingRequestModel as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "input" => intermediate_rep.input.push(<models::CreateEmbeddingRequestInput as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "user" => intermediate_rep.user.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing CreateEmbeddingRequest".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CreateEmbeddingRequest {
            model: intermediate_rep.model.into_iter().next().ok_or_else(|| "model missing in CreateEmbeddingRequest".to_string())?,
            input: intermediate_rep.input.into_iter().next().ok_or_else(|| "input missing in CreateEmbeddingRequest".to_string())?,
            user: intermediate_rep.user.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CreateEmbeddingRequest> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<CreateEmbeddingRequest>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CreateEmbeddingRequest>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CreateEmbeddingRequest - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<CreateEmbeddingRequest> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CreateEmbeddingRequest as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CreateEmbeddingRequest - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}




/// Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in a single request, pass an array of strings or array of token arrays. Each input must not exceed the max input tokens for the model (8191 tokens for `text-embedding-ada-002`). [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. 


/// One of:
/// - String
/// - Vec<String>
/// - Vec<Vec<i32>>
/// - Vec<i32>
#[derive(Debug, Clone, serde::Serialize, serde::Deserialize)]
pub struct CreateEmbeddingRequestInput(Box<serde_json::value::RawValue>);

impl validator::Validate for CreateEmbeddingRequestInput
{
    fn validate(&self) -> std::result::Result<(), validator::ValidationErrors> {
        std::result::Result::Ok(())
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateEmbeddingRequestInput value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateEmbeddingRequestInput {
    type Err = serde_json::Error;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        serde_json::from_str(s)
    }
}

impl PartialEq for CreateEmbeddingRequestInput {
    fn eq(&self, other: &Self) -> bool {
        self.0.get() == other.0.get()
    }
}





/// ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 


/// One of:
/// - String
#[derive(Debug, Clone, serde::Serialize, serde::Deserialize)]
pub struct CreateEmbeddingRequestModel(Box<serde_json::value::RawValue>);

impl validator::Validate for CreateEmbeddingRequestModel
{
    fn validate(&self) -> std::result::Result<(), validator::ValidationErrors> {
        std::result::Result::Ok(())
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateEmbeddingRequestModel value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateEmbeddingRequestModel {
    type Err = serde_json::Error;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        serde_json::from_str(s)
    }
}

impl PartialEq for CreateEmbeddingRequestModel {
    fn eq(&self, other: &Self) -> bool {
        self.0.get() == other.0.get()
    }
}








#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CreateEmbeddingResponse {
    #[serde(rename = "object")]
    pub object: String,

    #[serde(rename = "model")]
    pub model: String,

    #[serde(rename = "data")]
    pub data: Vec<models::CreateEmbeddingResponseDataInner>,

    #[serde(rename = "usage")]
    pub usage: models::CreateEmbeddingResponseUsage,

}


impl CreateEmbeddingResponse {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(object: String, model: String, data: Vec<models::CreateEmbeddingResponseDataInner>, usage: models::CreateEmbeddingResponseUsage, ) -> CreateEmbeddingResponse {
        CreateEmbeddingResponse {
            object,
            model,
            data,
            usage,
        }
    }
}

/// Converts the CreateEmbeddingResponse value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for CreateEmbeddingResponse {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("object".to_string()),
            Some(self.object.to_string()),


            Some("model".to_string()),
            Some(self.model.to_string()),

            // Skipping data in query parameter serialization

            // Skipping usage in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateEmbeddingResponse value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateEmbeddingResponse {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub object: Vec<String>,
            pub model: Vec<String>,
            pub data: Vec<Vec<models::CreateEmbeddingResponseDataInner>>,
            pub usage: Vec<models::CreateEmbeddingResponseUsage>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CreateEmbeddingResponse".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "object" => intermediate_rep.object.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "model" => intermediate_rep.model.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "data" => return std::result::Result::Err("Parsing a container in this style is not supported in CreateEmbeddingResponse".to_string()),
                    #[allow(clippy::redundant_clone)]
                    "usage" => intermediate_rep.usage.push(<models::CreateEmbeddingResponseUsage as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing CreateEmbeddingResponse".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CreateEmbeddingResponse {
            object: intermediate_rep.object.into_iter().next().ok_or_else(|| "object missing in CreateEmbeddingResponse".to_string())?,
            model: intermediate_rep.model.into_iter().next().ok_or_else(|| "model missing in CreateEmbeddingResponse".to_string())?,
            data: intermediate_rep.data.into_iter().next().ok_or_else(|| "data missing in CreateEmbeddingResponse".to_string())?,
            usage: intermediate_rep.usage.into_iter().next().ok_or_else(|| "usage missing in CreateEmbeddingResponse".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CreateEmbeddingResponse> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<CreateEmbeddingResponse>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CreateEmbeddingResponse>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CreateEmbeddingResponse - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<CreateEmbeddingResponse> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CreateEmbeddingResponse as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CreateEmbeddingResponse - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CreateEmbeddingResponseDataInner {
    #[serde(rename = "index")]
    pub index: i32,

    #[serde(rename = "object")]
    pub object: String,

    #[serde(rename = "embedding")]
    pub embedding: Vec<f64>,

}


impl CreateEmbeddingResponseDataInner {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(index: i32, object: String, embedding: Vec<f64>, ) -> CreateEmbeddingResponseDataInner {
        CreateEmbeddingResponseDataInner {
            index,
            object,
            embedding,
        }
    }
}

/// Converts the CreateEmbeddingResponseDataInner value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for CreateEmbeddingResponseDataInner {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("index".to_string()),
            Some(self.index.to_string()),


            Some("object".to_string()),
            Some(self.object.to_string()),


            Some("embedding".to_string()),
            Some(self.embedding.iter().map(|x| x.to_string()).collect::<Vec<_>>().join(",")),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateEmbeddingResponseDataInner value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateEmbeddingResponseDataInner {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub index: Vec<i32>,
            pub object: Vec<String>,
            pub embedding: Vec<Vec<f64>>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CreateEmbeddingResponseDataInner".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "index" => intermediate_rep.index.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "object" => intermediate_rep.object.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "embedding" => return std::result::Result::Err("Parsing a container in this style is not supported in CreateEmbeddingResponseDataInner".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing CreateEmbeddingResponseDataInner".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CreateEmbeddingResponseDataInner {
            index: intermediate_rep.index.into_iter().next().ok_or_else(|| "index missing in CreateEmbeddingResponseDataInner".to_string())?,
            object: intermediate_rep.object.into_iter().next().ok_or_else(|| "object missing in CreateEmbeddingResponseDataInner".to_string())?,
            embedding: intermediate_rep.embedding.into_iter().next().ok_or_else(|| "embedding missing in CreateEmbeddingResponseDataInner".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CreateEmbeddingResponseDataInner> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<CreateEmbeddingResponseDataInner>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CreateEmbeddingResponseDataInner>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CreateEmbeddingResponseDataInner - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<CreateEmbeddingResponseDataInner> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CreateEmbeddingResponseDataInner as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CreateEmbeddingResponseDataInner - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CreateEmbeddingResponseUsage {
    #[serde(rename = "prompt_tokens")]
    pub prompt_tokens: i32,

    #[serde(rename = "total_tokens")]
    pub total_tokens: i32,

}


impl CreateEmbeddingResponseUsage {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(prompt_tokens: i32, total_tokens: i32, ) -> CreateEmbeddingResponseUsage {
        CreateEmbeddingResponseUsage {
            prompt_tokens,
            total_tokens,
        }
    }
}

/// Converts the CreateEmbeddingResponseUsage value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for CreateEmbeddingResponseUsage {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("prompt_tokens".to_string()),
            Some(self.prompt_tokens.to_string()),


            Some("total_tokens".to_string()),
            Some(self.total_tokens.to_string()),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateEmbeddingResponseUsage value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateEmbeddingResponseUsage {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub prompt_tokens: Vec<i32>,
            pub total_tokens: Vec<i32>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CreateEmbeddingResponseUsage".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "prompt_tokens" => intermediate_rep.prompt_tokens.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "total_tokens" => intermediate_rep.total_tokens.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing CreateEmbeddingResponseUsage".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CreateEmbeddingResponseUsage {
            prompt_tokens: intermediate_rep.prompt_tokens.into_iter().next().ok_or_else(|| "prompt_tokens missing in CreateEmbeddingResponseUsage".to_string())?,
            total_tokens: intermediate_rep.total_tokens.into_iter().next().ok_or_else(|| "total_tokens missing in CreateEmbeddingResponseUsage".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CreateEmbeddingResponseUsage> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<CreateEmbeddingResponseUsage>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CreateEmbeddingResponseUsage>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CreateEmbeddingResponseUsage - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<CreateEmbeddingResponseUsage> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CreateEmbeddingResponseUsage as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CreateEmbeddingResponseUsage - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CreateFineTuneRequest {
/// The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file, where each training example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. 
    #[serde(rename = "training_file")]
    pub training_file: String,

/// The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the [fine-tuning results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model). Your train and validation data should be mutually exclusive.  Your dataset must be formatted as a JSONL file, where each validation example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. 
    #[serde(rename = "validation_file")]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub validation_file: Option<Nullable<String>>,

    #[serde(rename = "model")]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub model: Option<Nullable<models::CreateFineTuneRequestModel>>,

/// The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
    #[serde(rename = "n_epochs")]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub n_epochs: Option<Nullable<i32>>,

/// The batch size to use for training. The batch size is the number of training examples used to train a single forward and backward pass.  By default, the batch size will be dynamically configured to be ~0.2% of the number of examples in the training set, capped at 256 - in general, we've found that larger batch sizes tend to work better for larger datasets. 
    #[serde(rename = "batch_size")]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub batch_size: Option<Nullable<i32>>,

/// The learning rate multiplier to use for training. The fine-tuning learning rate is the original learning rate used for pretraining multiplied by this value.  By default, the learning rate multiplier is the 0.05, 0.1, or 0.2 depending on final `batch_size` (larger learning rates tend to perform better with larger batch sizes). We recommend experimenting with values in the range 0.02 to 0.2 to see what produces the best results. 
    #[serde(rename = "learning_rate_multiplier")]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub learning_rate_multiplier: Option<Nullable<f64>>,

/// The weight to use for loss on the prompt tokens. This controls how much the model tries to learn to generate the prompt (as compared to the completion which always has a weight of 1.0), and can add a stabilizing effect to training when completions are short.  If prompts are extremely long (relative to completions), it may make sense to reduce this weight so as to avoid over-prioritizing learning the prompt. 
    #[serde(rename = "prompt_loss_weight")]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub prompt_loss_weight: Option<Nullable<f64>>,

/// If set, we calculate classification-specific metrics such as accuracy and F-1 score using the validation set at the end of every epoch. These metrics can be viewed in the [results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model).  In order to compute classification metrics, you must provide a `validation_file`. Additionally, you must specify `classification_n_classes` for multiclass classification or `classification_positive_class` for binary classification. 
    #[serde(rename = "compute_classification_metrics")]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub compute_classification_metrics: Option<Nullable<bool>>,

/// The number of classes in a classification task.  This parameter is required for multiclass classification. 
    #[serde(rename = "classification_n_classes")]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub classification_n_classes: Option<Nullable<i32>>,

/// The positive class in binary classification.  This parameter is needed to generate precision, recall, and F1 metrics when doing binary classification. 
    #[serde(rename = "classification_positive_class")]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub classification_positive_class: Option<Nullable<String>>,

/// If this is provided, we calculate F-beta scores at the specified beta values. The F-beta score is a generalization of F-1 score. This is only used for binary classification.  With a beta of 1 (i.e. the F-1 score), precision and recall are given the same weight. A larger beta score puts more weight on recall and less on precision. A smaller beta score puts more weight on precision and less on recall. 
    #[serde(rename = "classification_betas")]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub classification_betas: Option<Nullable<Vec<f64>>>,

/// A string of up to 40 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ada:ft-your-org:custom-model-name-2022-02-15-04-21-04`. 
    #[serde(rename = "suffix")]
    #[validate(
            length(min = 1, max = 40),
        )]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub suffix: Option<Nullable<String>>,

}


impl CreateFineTuneRequest {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(training_file: String, ) -> CreateFineTuneRequest {
        CreateFineTuneRequest {
            training_file,
            validation_file: None,
            model: None,
            n_epochs: Some(Nullable::Present(4)),
            batch_size: None,
            learning_rate_multiplier: None,
            prompt_loss_weight: Some(Nullable::Present(0.01)),
            compute_classification_metrics: Some(Nullable::Present(false)),
            classification_n_classes: None,
            classification_positive_class: None,
            classification_betas: None,
            suffix: None,
        }
    }
}

/// Converts the CreateFineTuneRequest value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for CreateFineTuneRequest {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("training_file".to_string()),
            Some(self.training_file.to_string()),


            self.validation_file.as_ref().map(|validation_file| {
                [
                    "validation_file".to_string(),
                    validation_file.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),

            // Skipping model in query parameter serialization


            self.n_epochs.as_ref().map(|n_epochs| {
                [
                    "n_epochs".to_string(),
                    n_epochs.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),


            self.batch_size.as_ref().map(|batch_size| {
                [
                    "batch_size".to_string(),
                    batch_size.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),


            self.learning_rate_multiplier.as_ref().map(|learning_rate_multiplier| {
                [
                    "learning_rate_multiplier".to_string(),
                    learning_rate_multiplier.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),


            self.prompt_loss_weight.as_ref().map(|prompt_loss_weight| {
                [
                    "prompt_loss_weight".to_string(),
                    prompt_loss_weight.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),


            self.compute_classification_metrics.as_ref().map(|compute_classification_metrics| {
                [
                    "compute_classification_metrics".to_string(),
                    compute_classification_metrics.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),


            self.classification_n_classes.as_ref().map(|classification_n_classes| {
                [
                    "classification_n_classes".to_string(),
                    classification_n_classes.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),


            self.classification_positive_class.as_ref().map(|classification_positive_class| {
                [
                    "classification_positive_class".to_string(),
                    classification_positive_class.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),


            self.classification_betas.as_ref().map(|classification_betas| {
                [
                    "classification_betas".to_string(),
                    classification_betas.as_ref().map_or("null".to_string(), |x| x.iter().map(|x| x.to_string()).collect::<Vec<_>>().join(",")),
                ].join(",")
            }),


            self.suffix.as_ref().map(|suffix| {
                [
                    "suffix".to_string(),
                    suffix.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateFineTuneRequest value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateFineTuneRequest {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub training_file: Vec<String>,
            pub validation_file: Vec<String>,
            pub model: Vec<models::CreateFineTuneRequestModel>,
            pub n_epochs: Vec<i32>,
            pub batch_size: Vec<i32>,
            pub learning_rate_multiplier: Vec<f64>,
            pub prompt_loss_weight: Vec<f64>,
            pub compute_classification_metrics: Vec<bool>,
            pub classification_n_classes: Vec<i32>,
            pub classification_positive_class: Vec<String>,
            pub classification_betas: Vec<Vec<f64>>,
            pub suffix: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CreateFineTuneRequest".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "training_file" => intermediate_rep.training_file.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "validation_file" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateFineTuneRequest".to_string()),
                    "model" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateFineTuneRequest".to_string()),
                    "n_epochs" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateFineTuneRequest".to_string()),
                    "batch_size" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateFineTuneRequest".to_string()),
                    "learning_rate_multiplier" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateFineTuneRequest".to_string()),
                    "prompt_loss_weight" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateFineTuneRequest".to_string()),
                    "compute_classification_metrics" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateFineTuneRequest".to_string()),
                    "classification_n_classes" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateFineTuneRequest".to_string()),
                    "classification_positive_class" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateFineTuneRequest".to_string()),
                    "classification_betas" => return std::result::Result::Err("Parsing a container in this style is not supported in CreateFineTuneRequest".to_string()),
                    "suffix" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateFineTuneRequest".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing CreateFineTuneRequest".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CreateFineTuneRequest {
            training_file: intermediate_rep.training_file.into_iter().next().ok_or_else(|| "training_file missing in CreateFineTuneRequest".to_string())?,
            validation_file: std::result::Result::Err("Nullable types not supported in CreateFineTuneRequest".to_string())?,
            model: std::result::Result::Err("Nullable types not supported in CreateFineTuneRequest".to_string())?,
            n_epochs: std::result::Result::Err("Nullable types not supported in CreateFineTuneRequest".to_string())?,
            batch_size: std::result::Result::Err("Nullable types not supported in CreateFineTuneRequest".to_string())?,
            learning_rate_multiplier: std::result::Result::Err("Nullable types not supported in CreateFineTuneRequest".to_string())?,
            prompt_loss_weight: std::result::Result::Err("Nullable types not supported in CreateFineTuneRequest".to_string())?,
            compute_classification_metrics: std::result::Result::Err("Nullable types not supported in CreateFineTuneRequest".to_string())?,
            classification_n_classes: std::result::Result::Err("Nullable types not supported in CreateFineTuneRequest".to_string())?,
            classification_positive_class: std::result::Result::Err("Nullable types not supported in CreateFineTuneRequest".to_string())?,
            classification_betas: std::result::Result::Err("Nullable types not supported in CreateFineTuneRequest".to_string())?,
            suffix: std::result::Result::Err("Nullable types not supported in CreateFineTuneRequest".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CreateFineTuneRequest> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<CreateFineTuneRequest>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CreateFineTuneRequest>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CreateFineTuneRequest - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<CreateFineTuneRequest> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CreateFineTuneRequest as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CreateFineTuneRequest - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}




/// The name of the base model to fine-tune. You can select one of \"ada\", \"babbage\", \"curie\", \"davinci\", or a fine-tuned model created after 2022-04-21. To learn more about these models, see the [Models](https://platform.openai.com/docs/models) documentation. 


/// One of:
/// - String
#[derive(Debug, Clone, serde::Serialize, serde::Deserialize)]
pub struct CreateFineTuneRequestModel(Box<serde_json::value::RawValue>);

impl validator::Validate for CreateFineTuneRequestModel
{
    fn validate(&self) -> std::result::Result<(), validator::ValidationErrors> {
        std::result::Result::Ok(())
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateFineTuneRequestModel value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateFineTuneRequestModel {
    type Err = serde_json::Error;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        serde_json::from_str(s)
    }
}

impl PartialEq for CreateFineTuneRequestModel {
    fn eq(&self, other: &Self) -> bool {
        self.0.get() == other.0.get()
    }
}








#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CreateImageRequest {
/// A text description of the desired image(s). The maximum length is 1000 characters.
    #[serde(rename = "prompt")]
    pub prompt: String,

/// The number of images to generate. Must be between 1 and 10.
    #[serde(rename = "n")]
    #[validate(
            range(min = 1, max = 10),
        )]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub n: Option<Nullable<u8>>,

/// The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
/// Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "size")]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub size: Option<Nullable<String>>,

/// The format in which the generated images are returned. Must be one of `url` or `b64_json`.
/// Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "response_format")]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub response_format: Option<Nullable<String>>,

/// A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
    #[serde(rename = "user")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub user: Option<String>,

}


impl CreateImageRequest {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(prompt: String, ) -> CreateImageRequest {
        CreateImageRequest {
            prompt,
            n: Some(Nullable::Present(1)),
            size: Some(Nullable::Present("1024x1024".to_string())),
            response_format: Some(Nullable::Present("url".to_string())),
            user: None,
        }
    }
}

/// Converts the CreateImageRequest value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for CreateImageRequest {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("prompt".to_string()),
            Some(self.prompt.to_string()),


            self.n.as_ref().map(|n| {
                [
                    "n".to_string(),
                    n.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),


            self.size.as_ref().map(|size| {
                [
                    "size".to_string(),
                    size.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),


            self.response_format.as_ref().map(|response_format| {
                [
                    "response_format".to_string(),
                    response_format.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),


            self.user.as_ref().map(|user| {
                [
                    "user".to_string(),
                    user.to_string(),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateImageRequest value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateImageRequest {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub prompt: Vec<String>,
            pub n: Vec<u8>,
            pub size: Vec<String>,
            pub response_format: Vec<String>,
            pub user: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CreateImageRequest".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "prompt" => intermediate_rep.prompt.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "n" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateImageRequest".to_string()),
                    "size" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateImageRequest".to_string()),
                    "response_format" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CreateImageRequest".to_string()),
                    #[allow(clippy::redundant_clone)]
                    "user" => intermediate_rep.user.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing CreateImageRequest".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CreateImageRequest {
            prompt: intermediate_rep.prompt.into_iter().next().ok_or_else(|| "prompt missing in CreateImageRequest".to_string())?,
            n: std::result::Result::Err("Nullable types not supported in CreateImageRequest".to_string())?,
            size: std::result::Result::Err("Nullable types not supported in CreateImageRequest".to_string())?,
            response_format: std::result::Result::Err("Nullable types not supported in CreateImageRequest".to_string())?,
            user: intermediate_rep.user.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CreateImageRequest> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<CreateImageRequest>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CreateImageRequest>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CreateImageRequest - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<CreateImageRequest> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CreateImageRequest as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CreateImageRequest - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CreateModerationRequest {
    #[serde(rename = "input")]
    pub input: models::CreateModerationRequestInput,

    #[serde(rename = "model")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub model: Option<models::CreateModerationRequestModel>,

}


impl CreateModerationRequest {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(input: models::CreateModerationRequestInput, ) -> CreateModerationRequest {
        CreateModerationRequest {
            input,
            model: None,
        }
    }
}

/// Converts the CreateModerationRequest value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for CreateModerationRequest {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![
            // Skipping input in query parameter serialization

            // Skipping model in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateModerationRequest value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateModerationRequest {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub input: Vec<models::CreateModerationRequestInput>,
            pub model: Vec<models::CreateModerationRequestModel>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CreateModerationRequest".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "input" => intermediate_rep.input.push(<models::CreateModerationRequestInput as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "model" => intermediate_rep.model.push(<models::CreateModerationRequestModel as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing CreateModerationRequest".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CreateModerationRequest {
            input: intermediate_rep.input.into_iter().next().ok_or_else(|| "input missing in CreateModerationRequest".to_string())?,
            model: intermediate_rep.model.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CreateModerationRequest> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<CreateModerationRequest>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CreateModerationRequest>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CreateModerationRequest - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<CreateModerationRequest> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CreateModerationRequest as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CreateModerationRequest - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}




/// The input text to classify


/// One of:
/// - String
/// - Vec<String>
#[derive(Debug, Clone, serde::Serialize, serde::Deserialize)]
pub struct CreateModerationRequestInput(Box<serde_json::value::RawValue>);

impl validator::Validate for CreateModerationRequestInput
{
    fn validate(&self) -> std::result::Result<(), validator::ValidationErrors> {
        std::result::Result::Ok(())
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateModerationRequestInput value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateModerationRequestInput {
    type Err = serde_json::Error;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        serde_json::from_str(s)
    }
}

impl PartialEq for CreateModerationRequestInput {
    fn eq(&self, other: &Self) -> bool {
        self.0.get() == other.0.get()
    }
}





/// Two content moderations models are available: `text-moderation-stable` and `text-moderation-latest`.  The default is `text-moderation-latest` which will be automatically upgraded over time. This ensures you are always using our most accurate model. If you use `text-moderation-stable`, we will provide advanced notice before updating the model. Accuracy of `text-moderation-stable` may be slightly lower than for `text-moderation-latest`. 


/// One of:
/// - String
#[derive(Debug, Clone, serde::Serialize, serde::Deserialize)]
pub struct CreateModerationRequestModel(Box<serde_json::value::RawValue>);

impl validator::Validate for CreateModerationRequestModel
{
    fn validate(&self) -> std::result::Result<(), validator::ValidationErrors> {
        std::result::Result::Ok(())
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateModerationRequestModel value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateModerationRequestModel {
    type Err = serde_json::Error;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        serde_json::from_str(s)
    }
}

impl PartialEq for CreateModerationRequestModel {
    fn eq(&self, other: &Self) -> bool {
        self.0.get() == other.0.get()
    }
}








#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CreateModerationResponse {
    #[serde(rename = "id")]
    pub id: String,

    #[serde(rename = "model")]
    pub model: String,

    #[serde(rename = "results")]
    pub results: Vec<models::CreateModerationResponseResultsInner>,

}


impl CreateModerationResponse {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(id: String, model: String, results: Vec<models::CreateModerationResponseResultsInner>, ) -> CreateModerationResponse {
        CreateModerationResponse {
            id,
            model,
            results,
        }
    }
}

/// Converts the CreateModerationResponse value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for CreateModerationResponse {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("id".to_string()),
            Some(self.id.to_string()),


            Some("model".to_string()),
            Some(self.model.to_string()),

            // Skipping results in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateModerationResponse value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateModerationResponse {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub id: Vec<String>,
            pub model: Vec<String>,
            pub results: Vec<Vec<models::CreateModerationResponseResultsInner>>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CreateModerationResponse".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "id" => intermediate_rep.id.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "model" => intermediate_rep.model.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "results" => return std::result::Result::Err("Parsing a container in this style is not supported in CreateModerationResponse".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing CreateModerationResponse".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CreateModerationResponse {
            id: intermediate_rep.id.into_iter().next().ok_or_else(|| "id missing in CreateModerationResponse".to_string())?,
            model: intermediate_rep.model.into_iter().next().ok_or_else(|| "model missing in CreateModerationResponse".to_string())?,
            results: intermediate_rep.results.into_iter().next().ok_or_else(|| "results missing in CreateModerationResponse".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CreateModerationResponse> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<CreateModerationResponse>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CreateModerationResponse>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CreateModerationResponse - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<CreateModerationResponse> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CreateModerationResponse as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CreateModerationResponse - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CreateModerationResponseResultsInner {
    #[serde(rename = "flagged")]
    pub flagged: bool,

    #[serde(rename = "categories")]
    pub categories: models::CreateModerationResponseResultsInnerCategories,

    #[serde(rename = "category_scores")]
    pub category_scores: models::CreateModerationResponseResultsInnerCategoryScores,

}


impl CreateModerationResponseResultsInner {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(flagged: bool, categories: models::CreateModerationResponseResultsInnerCategories, category_scores: models::CreateModerationResponseResultsInnerCategoryScores, ) -> CreateModerationResponseResultsInner {
        CreateModerationResponseResultsInner {
            flagged,
            categories,
            category_scores,
        }
    }
}

/// Converts the CreateModerationResponseResultsInner value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for CreateModerationResponseResultsInner {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("flagged".to_string()),
            Some(self.flagged.to_string()),

            // Skipping categories in query parameter serialization

            // Skipping category_scores in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateModerationResponseResultsInner value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateModerationResponseResultsInner {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub flagged: Vec<bool>,
            pub categories: Vec<models::CreateModerationResponseResultsInnerCategories>,
            pub category_scores: Vec<models::CreateModerationResponseResultsInnerCategoryScores>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CreateModerationResponseResultsInner".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "flagged" => intermediate_rep.flagged.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "categories" => intermediate_rep.categories.push(<models::CreateModerationResponseResultsInnerCategories as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "category_scores" => intermediate_rep.category_scores.push(<models::CreateModerationResponseResultsInnerCategoryScores as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing CreateModerationResponseResultsInner".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CreateModerationResponseResultsInner {
            flagged: intermediate_rep.flagged.into_iter().next().ok_or_else(|| "flagged missing in CreateModerationResponseResultsInner".to_string())?,
            categories: intermediate_rep.categories.into_iter().next().ok_or_else(|| "categories missing in CreateModerationResponseResultsInner".to_string())?,
            category_scores: intermediate_rep.category_scores.into_iter().next().ok_or_else(|| "category_scores missing in CreateModerationResponseResultsInner".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CreateModerationResponseResultsInner> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<CreateModerationResponseResultsInner>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CreateModerationResponseResultsInner>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CreateModerationResponseResultsInner - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<CreateModerationResponseResultsInner> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CreateModerationResponseResultsInner as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CreateModerationResponseResultsInner - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CreateModerationResponseResultsInnerCategories {
    #[serde(rename = "hate")]
    pub hate: bool,

    #[serde(rename = "hate/threatening")]
    pub hate_slash_threatening: bool,

    #[serde(rename = "self-harm")]
    pub self_harm: bool,

    #[serde(rename = "sexual")]
    pub sexual: bool,

    #[serde(rename = "sexual/minors")]
    pub sexual_slash_minors: bool,

    #[serde(rename = "violence")]
    pub violence: bool,

    #[serde(rename = "violence/graphic")]
    pub violence_slash_graphic: bool,

}


impl CreateModerationResponseResultsInnerCategories {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(hate: bool, hate_slash_threatening: bool, self_harm: bool, sexual: bool, sexual_slash_minors: bool, violence: bool, violence_slash_graphic: bool, ) -> CreateModerationResponseResultsInnerCategories {
        CreateModerationResponseResultsInnerCategories {
            hate,
            hate_slash_threatening,
            self_harm,
            sexual,
            sexual_slash_minors,
            violence,
            violence_slash_graphic,
        }
    }
}

/// Converts the CreateModerationResponseResultsInnerCategories value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for CreateModerationResponseResultsInnerCategories {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("hate".to_string()),
            Some(self.hate.to_string()),


            Some("hate/threatening".to_string()),
            Some(self.hate_slash_threatening.to_string()),


            Some("self-harm".to_string()),
            Some(self.self_harm.to_string()),


            Some("sexual".to_string()),
            Some(self.sexual.to_string()),


            Some("sexual/minors".to_string()),
            Some(self.sexual_slash_minors.to_string()),


            Some("violence".to_string()),
            Some(self.violence.to_string()),


            Some("violence/graphic".to_string()),
            Some(self.violence_slash_graphic.to_string()),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateModerationResponseResultsInnerCategories value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateModerationResponseResultsInnerCategories {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub hate: Vec<bool>,
            pub hate_slash_threatening: Vec<bool>,
            pub self_harm: Vec<bool>,
            pub sexual: Vec<bool>,
            pub sexual_slash_minors: Vec<bool>,
            pub violence: Vec<bool>,
            pub violence_slash_graphic: Vec<bool>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CreateModerationResponseResultsInnerCategories".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "hate" => intermediate_rep.hate.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "hate/threatening" => intermediate_rep.hate_slash_threatening.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "self-harm" => intermediate_rep.self_harm.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "sexual" => intermediate_rep.sexual.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "sexual/minors" => intermediate_rep.sexual_slash_minors.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "violence" => intermediate_rep.violence.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "violence/graphic" => intermediate_rep.violence_slash_graphic.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing CreateModerationResponseResultsInnerCategories".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CreateModerationResponseResultsInnerCategories {
            hate: intermediate_rep.hate.into_iter().next().ok_or_else(|| "hate missing in CreateModerationResponseResultsInnerCategories".to_string())?,
            hate_slash_threatening: intermediate_rep.hate_slash_threatening.into_iter().next().ok_or_else(|| "hate/threatening missing in CreateModerationResponseResultsInnerCategories".to_string())?,
            self_harm: intermediate_rep.self_harm.into_iter().next().ok_or_else(|| "self-harm missing in CreateModerationResponseResultsInnerCategories".to_string())?,
            sexual: intermediate_rep.sexual.into_iter().next().ok_or_else(|| "sexual missing in CreateModerationResponseResultsInnerCategories".to_string())?,
            sexual_slash_minors: intermediate_rep.sexual_slash_minors.into_iter().next().ok_or_else(|| "sexual/minors missing in CreateModerationResponseResultsInnerCategories".to_string())?,
            violence: intermediate_rep.violence.into_iter().next().ok_or_else(|| "violence missing in CreateModerationResponseResultsInnerCategories".to_string())?,
            violence_slash_graphic: intermediate_rep.violence_slash_graphic.into_iter().next().ok_or_else(|| "violence/graphic missing in CreateModerationResponseResultsInnerCategories".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CreateModerationResponseResultsInnerCategories> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<CreateModerationResponseResultsInnerCategories>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CreateModerationResponseResultsInnerCategories>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CreateModerationResponseResultsInnerCategories - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<CreateModerationResponseResultsInnerCategories> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CreateModerationResponseResultsInnerCategories as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CreateModerationResponseResultsInnerCategories - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CreateModerationResponseResultsInnerCategoryScores {
    #[serde(rename = "hate")]
    pub hate: f64,

    #[serde(rename = "hate/threatening")]
    pub hate_slash_threatening: f64,

    #[serde(rename = "self-harm")]
    pub self_harm: f64,

    #[serde(rename = "sexual")]
    pub sexual: f64,

    #[serde(rename = "sexual/minors")]
    pub sexual_slash_minors: f64,

    #[serde(rename = "violence")]
    pub violence: f64,

    #[serde(rename = "violence/graphic")]
    pub violence_slash_graphic: f64,

}


impl CreateModerationResponseResultsInnerCategoryScores {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(hate: f64, hate_slash_threatening: f64, self_harm: f64, sexual: f64, sexual_slash_minors: f64, violence: f64, violence_slash_graphic: f64, ) -> CreateModerationResponseResultsInnerCategoryScores {
        CreateModerationResponseResultsInnerCategoryScores {
            hate,
            hate_slash_threatening,
            self_harm,
            sexual,
            sexual_slash_minors,
            violence,
            violence_slash_graphic,
        }
    }
}

/// Converts the CreateModerationResponseResultsInnerCategoryScores value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for CreateModerationResponseResultsInnerCategoryScores {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("hate".to_string()),
            Some(self.hate.to_string()),


            Some("hate/threatening".to_string()),
            Some(self.hate_slash_threatening.to_string()),


            Some("self-harm".to_string()),
            Some(self.self_harm.to_string()),


            Some("sexual".to_string()),
            Some(self.sexual.to_string()),


            Some("sexual/minors".to_string()),
            Some(self.sexual_slash_minors.to_string()),


            Some("violence".to_string()),
            Some(self.violence.to_string()),


            Some("violence/graphic".to_string()),
            Some(self.violence_slash_graphic.to_string()),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateModerationResponseResultsInnerCategoryScores value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateModerationResponseResultsInnerCategoryScores {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub hate: Vec<f64>,
            pub hate_slash_threatening: Vec<f64>,
            pub self_harm: Vec<f64>,
            pub sexual: Vec<f64>,
            pub sexual_slash_minors: Vec<f64>,
            pub violence: Vec<f64>,
            pub violence_slash_graphic: Vec<f64>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CreateModerationResponseResultsInnerCategoryScores".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "hate" => intermediate_rep.hate.push(<f64 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "hate/threatening" => intermediate_rep.hate_slash_threatening.push(<f64 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "self-harm" => intermediate_rep.self_harm.push(<f64 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "sexual" => intermediate_rep.sexual.push(<f64 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "sexual/minors" => intermediate_rep.sexual_slash_minors.push(<f64 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "violence" => intermediate_rep.violence.push(<f64 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "violence/graphic" => intermediate_rep.violence_slash_graphic.push(<f64 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing CreateModerationResponseResultsInnerCategoryScores".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CreateModerationResponseResultsInnerCategoryScores {
            hate: intermediate_rep.hate.into_iter().next().ok_or_else(|| "hate missing in CreateModerationResponseResultsInnerCategoryScores".to_string())?,
            hate_slash_threatening: intermediate_rep.hate_slash_threatening.into_iter().next().ok_or_else(|| "hate/threatening missing in CreateModerationResponseResultsInnerCategoryScores".to_string())?,
            self_harm: intermediate_rep.self_harm.into_iter().next().ok_or_else(|| "self-harm missing in CreateModerationResponseResultsInnerCategoryScores".to_string())?,
            sexual: intermediate_rep.sexual.into_iter().next().ok_or_else(|| "sexual missing in CreateModerationResponseResultsInnerCategoryScores".to_string())?,
            sexual_slash_minors: intermediate_rep.sexual_slash_minors.into_iter().next().ok_or_else(|| "sexual/minors missing in CreateModerationResponseResultsInnerCategoryScores".to_string())?,
            violence: intermediate_rep.violence.into_iter().next().ok_or_else(|| "violence missing in CreateModerationResponseResultsInnerCategoryScores".to_string())?,
            violence_slash_graphic: intermediate_rep.violence_slash_graphic.into_iter().next().ok_or_else(|| "violence/graphic missing in CreateModerationResponseResultsInnerCategoryScores".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CreateModerationResponseResultsInnerCategoryScores> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<CreateModerationResponseResultsInnerCategoryScores>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CreateModerationResponseResultsInnerCategoryScores>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CreateModerationResponseResultsInnerCategoryScores - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<CreateModerationResponseResultsInnerCategoryScores> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CreateModerationResponseResultsInnerCategoryScores as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CreateModerationResponseResultsInnerCategoryScores - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}




/// ID of the model to use. Only `whisper-1` is currently available. 


/// One of:
/// - String
#[derive(Debug, Clone, serde::Serialize, serde::Deserialize)]
pub struct CreateTranscriptionRequestModel(Box<serde_json::value::RawValue>);

impl validator::Validate for CreateTranscriptionRequestModel
{
    fn validate(&self) -> std::result::Result<(), validator::ValidationErrors> {
        std::result::Result::Ok(())
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateTranscriptionRequestModel value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateTranscriptionRequestModel {
    type Err = serde_json::Error;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        serde_json::from_str(s)
    }
}

impl PartialEq for CreateTranscriptionRequestModel {
    fn eq(&self, other: &Self) -> bool {
        self.0.get() == other.0.get()
    }
}








#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CreateTranscriptionResponse {
    #[serde(rename = "text")]
    pub text: String,

}


impl CreateTranscriptionResponse {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(text: String, ) -> CreateTranscriptionResponse {
        CreateTranscriptionResponse {
            text,
        }
    }
}

/// Converts the CreateTranscriptionResponse value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for CreateTranscriptionResponse {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("text".to_string()),
            Some(self.text.to_string()),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateTranscriptionResponse value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateTranscriptionResponse {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub text: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CreateTranscriptionResponse".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "text" => intermediate_rep.text.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing CreateTranscriptionResponse".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CreateTranscriptionResponse {
            text: intermediate_rep.text.into_iter().next().ok_or_else(|| "text missing in CreateTranscriptionResponse".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CreateTranscriptionResponse> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<CreateTranscriptionResponse>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CreateTranscriptionResponse>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CreateTranscriptionResponse - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<CreateTranscriptionResponse> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CreateTranscriptionResponse as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CreateTranscriptionResponse - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CreateTranslationResponse {
    #[serde(rename = "text")]
    pub text: String,

}


impl CreateTranslationResponse {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(text: String, ) -> CreateTranslationResponse {
        CreateTranslationResponse {
            text,
        }
    }
}

/// Converts the CreateTranslationResponse value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for CreateTranslationResponse {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("text".to_string()),
            Some(self.text.to_string()),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CreateTranslationResponse value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CreateTranslationResponse {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub text: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CreateTranslationResponse".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "text" => intermediate_rep.text.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing CreateTranslationResponse".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CreateTranslationResponse {
            text: intermediate_rep.text.into_iter().next().ok_or_else(|| "text missing in CreateTranslationResponse".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CreateTranslationResponse> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<CreateTranslationResponse>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CreateTranslationResponse>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CreateTranslationResponse - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<CreateTranslationResponse> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CreateTranslationResponse as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CreateTranslationResponse - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct DeleteFileResponse {
    #[serde(rename = "id")]
    pub id: String,

    #[serde(rename = "object")]
    pub object: String,

    #[serde(rename = "deleted")]
    pub deleted: bool,

}


impl DeleteFileResponse {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(id: String, object: String, deleted: bool, ) -> DeleteFileResponse {
        DeleteFileResponse {
            id,
            object,
            deleted,
        }
    }
}

/// Converts the DeleteFileResponse value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for DeleteFileResponse {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("id".to_string()),
            Some(self.id.to_string()),


            Some("object".to_string()),
            Some(self.object.to_string()),


            Some("deleted".to_string()),
            Some(self.deleted.to_string()),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a DeleteFileResponse value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for DeleteFileResponse {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub id: Vec<String>,
            pub object: Vec<String>,
            pub deleted: Vec<bool>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing DeleteFileResponse".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "id" => intermediate_rep.id.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "object" => intermediate_rep.object.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "deleted" => intermediate_rep.deleted.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing DeleteFileResponse".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(DeleteFileResponse {
            id: intermediate_rep.id.into_iter().next().ok_or_else(|| "id missing in DeleteFileResponse".to_string())?,
            object: intermediate_rep.object.into_iter().next().ok_or_else(|| "object missing in DeleteFileResponse".to_string())?,
            deleted: intermediate_rep.deleted.into_iter().next().ok_or_else(|| "deleted missing in DeleteFileResponse".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<DeleteFileResponse> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<DeleteFileResponse>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<DeleteFileResponse>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for DeleteFileResponse - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<DeleteFileResponse> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <DeleteFileResponse as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into DeleteFileResponse - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct DeleteModelResponse {
    #[serde(rename = "id")]
    pub id: String,

    #[serde(rename = "object")]
    pub object: String,

    #[serde(rename = "deleted")]
    pub deleted: bool,

}


impl DeleteModelResponse {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(id: String, object: String, deleted: bool, ) -> DeleteModelResponse {
        DeleteModelResponse {
            id,
            object,
            deleted,
        }
    }
}

/// Converts the DeleteModelResponse value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for DeleteModelResponse {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("id".to_string()),
            Some(self.id.to_string()),


            Some("object".to_string()),
            Some(self.object.to_string()),


            Some("deleted".to_string()),
            Some(self.deleted.to_string()),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a DeleteModelResponse value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for DeleteModelResponse {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub id: Vec<String>,
            pub object: Vec<String>,
            pub deleted: Vec<bool>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing DeleteModelResponse".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "id" => intermediate_rep.id.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "object" => intermediate_rep.object.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "deleted" => intermediate_rep.deleted.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing DeleteModelResponse".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(DeleteModelResponse {
            id: intermediate_rep.id.into_iter().next().ok_or_else(|| "id missing in DeleteModelResponse".to_string())?,
            object: intermediate_rep.object.into_iter().next().ok_or_else(|| "object missing in DeleteModelResponse".to_string())?,
            deleted: intermediate_rep.deleted.into_iter().next().ok_or_else(|| "deleted missing in DeleteModelResponse".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<DeleteModelResponse> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<DeleteModelResponse>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<DeleteModelResponse>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for DeleteModelResponse - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<DeleteModelResponse> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <DeleteModelResponse as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into DeleteModelResponse - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct Error {
    #[serde(rename = "type")]
    pub r#type: String,

    #[serde(rename = "message")]
    pub message: String,

    #[serde(rename = "param")]
    pub param: Nullable<String>,

    #[serde(rename = "code")]
    pub code: Nullable<String>,

}


impl Error {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(r#type: String, message: String, param: Nullable<String>, code: Nullable<String>, ) -> Error {
        Error {
            r#type,
            message,
            param,
            code,
        }
    }
}

/// Converts the Error value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for Error {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("type".to_string()),
            Some(self.r#type.to_string()),


            Some("message".to_string()),
            Some(self.message.to_string()),


            Some("param".to_string()),
            Some(self.param.as_ref().map_or("null".to_string(), |x| x.to_string())),


            Some("code".to_string()),
            Some(self.code.as_ref().map_or("null".to_string(), |x| x.to_string())),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a Error value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for Error {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub r#type: Vec<String>,
            pub message: Vec<String>,
            pub param: Vec<String>,
            pub code: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing Error".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "type" => intermediate_rep.r#type.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "message" => intermediate_rep.message.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "param" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Error".to_string()),
                    "code" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Error".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing Error".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(Error {
            r#type: intermediate_rep.r#type.into_iter().next().ok_or_else(|| "type missing in Error".to_string())?,
            message: intermediate_rep.message.into_iter().next().ok_or_else(|| "message missing in Error".to_string())?,
            param: std::result::Result::Err("Nullable types not supported in Error".to_string())?,
            code: std::result::Result::Err("Nullable types not supported in Error".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<Error> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<Error>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<Error>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for Error - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<Error> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <Error as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into Error - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct ErrorResponse {
    #[serde(rename = "error")]
    pub error: models::Error,

}


impl ErrorResponse {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(error: models::Error, ) -> ErrorResponse {
        ErrorResponse {
            error,
        }
    }
}

/// Converts the ErrorResponse value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for ErrorResponse {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![
            // Skipping error in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a ErrorResponse value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for ErrorResponse {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub error: Vec<models::Error>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing ErrorResponse".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "error" => intermediate_rep.error.push(<models::Error as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing ErrorResponse".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(ErrorResponse {
            error: intermediate_rep.error.into_iter().next().ok_or_else(|| "error missing in ErrorResponse".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<ErrorResponse> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<ErrorResponse>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<ErrorResponse>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for ErrorResponse - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<ErrorResponse> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <ErrorResponse as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into ErrorResponse - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct FineTune {
    #[serde(rename = "id")]
    pub id: String,

    #[serde(rename = "object")]
    pub object: String,

    #[serde(rename = "created_at")]
    pub created_at: i32,

    #[serde(rename = "updated_at")]
    pub updated_at: i32,

    #[serde(rename = "model")]
    pub model: String,

    #[serde(rename = "fine_tuned_model")]
    pub fine_tuned_model: Nullable<String>,

    #[serde(rename = "organization_id")]
    pub organization_id: String,

    #[serde(rename = "status")]
    pub status: String,

    #[serde(rename = "hyperparams")]
    pub hyperparams: crate::types::Object,

    #[serde(rename = "training_files")]
    pub training_files: Vec<models::OpenAiFile>,

    #[serde(rename = "validation_files")]
    pub validation_files: Vec<models::OpenAiFile>,

    #[serde(rename = "result_files")]
    pub result_files: Vec<models::OpenAiFile>,

    #[serde(rename = "events")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub events: Option<Vec<models::FineTuneEvent>>,

}


impl FineTune {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(id: String, object: String, created_at: i32, updated_at: i32, model: String, fine_tuned_model: Nullable<String>, organization_id: String, status: String, hyperparams: crate::types::Object, training_files: Vec<models::OpenAiFile>, validation_files: Vec<models::OpenAiFile>, result_files: Vec<models::OpenAiFile>, ) -> FineTune {
        FineTune {
            id,
            object,
            created_at,
            updated_at,
            model,
            fine_tuned_model,
            organization_id,
            status,
            hyperparams,
            training_files,
            validation_files,
            result_files,
            events: None,
        }
    }
}

/// Converts the FineTune value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for FineTune {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("id".to_string()),
            Some(self.id.to_string()),


            Some("object".to_string()),
            Some(self.object.to_string()),


            Some("created_at".to_string()),
            Some(self.created_at.to_string()),


            Some("updated_at".to_string()),
            Some(self.updated_at.to_string()),


            Some("model".to_string()),
            Some(self.model.to_string()),


            Some("fine_tuned_model".to_string()),
            Some(self.fine_tuned_model.as_ref().map_or("null".to_string(), |x| x.to_string())),


            Some("organization_id".to_string()),
            Some(self.organization_id.to_string()),


            Some("status".to_string()),
            Some(self.status.to_string()),

            // Skipping hyperparams in query parameter serialization

            // Skipping training_files in query parameter serialization

            // Skipping validation_files in query parameter serialization

            // Skipping result_files in query parameter serialization

            // Skipping events in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a FineTune value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for FineTune {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub id: Vec<String>,
            pub object: Vec<String>,
            pub created_at: Vec<i32>,
            pub updated_at: Vec<i32>,
            pub model: Vec<String>,
            pub fine_tuned_model: Vec<String>,
            pub organization_id: Vec<String>,
            pub status: Vec<String>,
            pub hyperparams: Vec<crate::types::Object>,
            pub training_files: Vec<Vec<models::OpenAiFile>>,
            pub validation_files: Vec<Vec<models::OpenAiFile>>,
            pub result_files: Vec<Vec<models::OpenAiFile>>,
            pub events: Vec<Vec<models::FineTuneEvent>>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing FineTune".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "id" => intermediate_rep.id.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "object" => intermediate_rep.object.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "created_at" => intermediate_rep.created_at.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "updated_at" => intermediate_rep.updated_at.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "model" => intermediate_rep.model.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "fine_tuned_model" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in FineTune".to_string()),
                    #[allow(clippy::redundant_clone)]
                    "organization_id" => intermediate_rep.organization_id.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "status" => intermediate_rep.status.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "hyperparams" => intermediate_rep.hyperparams.push(<crate::types::Object as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "training_files" => return std::result::Result::Err("Parsing a container in this style is not supported in FineTune".to_string()),
                    "validation_files" => return std::result::Result::Err("Parsing a container in this style is not supported in FineTune".to_string()),
                    "result_files" => return std::result::Result::Err("Parsing a container in this style is not supported in FineTune".to_string()),
                    "events" => return std::result::Result::Err("Parsing a container in this style is not supported in FineTune".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing FineTune".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(FineTune {
            id: intermediate_rep.id.into_iter().next().ok_or_else(|| "id missing in FineTune".to_string())?,
            object: intermediate_rep.object.into_iter().next().ok_or_else(|| "object missing in FineTune".to_string())?,
            created_at: intermediate_rep.created_at.into_iter().next().ok_or_else(|| "created_at missing in FineTune".to_string())?,
            updated_at: intermediate_rep.updated_at.into_iter().next().ok_or_else(|| "updated_at missing in FineTune".to_string())?,
            model: intermediate_rep.model.into_iter().next().ok_or_else(|| "model missing in FineTune".to_string())?,
            fine_tuned_model: std::result::Result::Err("Nullable types not supported in FineTune".to_string())?,
            organization_id: intermediate_rep.organization_id.into_iter().next().ok_or_else(|| "organization_id missing in FineTune".to_string())?,
            status: intermediate_rep.status.into_iter().next().ok_or_else(|| "status missing in FineTune".to_string())?,
            hyperparams: intermediate_rep.hyperparams.into_iter().next().ok_or_else(|| "hyperparams missing in FineTune".to_string())?,
            training_files: intermediate_rep.training_files.into_iter().next().ok_or_else(|| "training_files missing in FineTune".to_string())?,
            validation_files: intermediate_rep.validation_files.into_iter().next().ok_or_else(|| "validation_files missing in FineTune".to_string())?,
            result_files: intermediate_rep.result_files.into_iter().next().ok_or_else(|| "result_files missing in FineTune".to_string())?,
            events: intermediate_rep.events.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<FineTune> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<FineTune>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<FineTune>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for FineTune - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<FineTune> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <FineTune as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into FineTune - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct FineTuneEvent {
    #[serde(rename = "object")]
    pub object: String,

    #[serde(rename = "created_at")]
    pub created_at: i32,

    #[serde(rename = "level")]
    pub level: String,

    #[serde(rename = "message")]
    pub message: String,

}


impl FineTuneEvent {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(object: String, created_at: i32, level: String, message: String, ) -> FineTuneEvent {
        FineTuneEvent {
            object,
            created_at,
            level,
            message,
        }
    }
}

/// Converts the FineTuneEvent value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for FineTuneEvent {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("object".to_string()),
            Some(self.object.to_string()),


            Some("created_at".to_string()),
            Some(self.created_at.to_string()),


            Some("level".to_string()),
            Some(self.level.to_string()),


            Some("message".to_string()),
            Some(self.message.to_string()),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a FineTuneEvent value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for FineTuneEvent {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub object: Vec<String>,
            pub created_at: Vec<i32>,
            pub level: Vec<String>,
            pub message: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing FineTuneEvent".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "object" => intermediate_rep.object.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "created_at" => intermediate_rep.created_at.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "level" => intermediate_rep.level.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "message" => intermediate_rep.message.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing FineTuneEvent".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(FineTuneEvent {
            object: intermediate_rep.object.into_iter().next().ok_or_else(|| "object missing in FineTuneEvent".to_string())?,
            created_at: intermediate_rep.created_at.into_iter().next().ok_or_else(|| "created_at missing in FineTuneEvent".to_string())?,
            level: intermediate_rep.level.into_iter().next().ok_or_else(|| "level missing in FineTuneEvent".to_string())?,
            message: intermediate_rep.message.into_iter().next().ok_or_else(|| "message missing in FineTuneEvent".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<FineTuneEvent> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<FineTuneEvent>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<FineTuneEvent>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for FineTuneEvent - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<FineTuneEvent> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <FineTuneEvent as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into FineTuneEvent - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct ImagesResponse {
    #[serde(rename = "created")]
    pub created: i32,

    #[serde(rename = "data")]
    pub data: Vec<models::ImagesResponseDataInner>,

}


impl ImagesResponse {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(created: i32, data: Vec<models::ImagesResponseDataInner>, ) -> ImagesResponse {
        ImagesResponse {
            created,
            data,
        }
    }
}

/// Converts the ImagesResponse value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for ImagesResponse {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("created".to_string()),
            Some(self.created.to_string()),

            // Skipping data in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a ImagesResponse value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for ImagesResponse {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub created: Vec<i32>,
            pub data: Vec<Vec<models::ImagesResponseDataInner>>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing ImagesResponse".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "created" => intermediate_rep.created.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "data" => return std::result::Result::Err("Parsing a container in this style is not supported in ImagesResponse".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing ImagesResponse".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(ImagesResponse {
            created: intermediate_rep.created.into_iter().next().ok_or_else(|| "created missing in ImagesResponse".to_string())?,
            data: intermediate_rep.data.into_iter().next().ok_or_else(|| "data missing in ImagesResponse".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<ImagesResponse> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<ImagesResponse>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<ImagesResponse>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for ImagesResponse - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<ImagesResponse> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <ImagesResponse as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into ImagesResponse - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct ImagesResponseDataInner {
    #[serde(rename = "url")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub url: Option<String>,

    #[serde(rename = "b64_json")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub b64_json: Option<String>,

}


impl ImagesResponseDataInner {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> ImagesResponseDataInner {
        ImagesResponseDataInner {
            url: None,
            b64_json: None,
        }
    }
}

/// Converts the ImagesResponseDataInner value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for ImagesResponseDataInner {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.url.as_ref().map(|url| {
                [
                    "url".to_string(),
                    url.to_string(),
                ].join(",")
            }),


            self.b64_json.as_ref().map(|b64_json| {
                [
                    "b64_json".to_string(),
                    b64_json.to_string(),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a ImagesResponseDataInner value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for ImagesResponseDataInner {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub url: Vec<String>,
            pub b64_json: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing ImagesResponseDataInner".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "url" => intermediate_rep.url.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "b64_json" => intermediate_rep.b64_json.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing ImagesResponseDataInner".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(ImagesResponseDataInner {
            url: intermediate_rep.url.into_iter().next(),
            b64_json: intermediate_rep.b64_json.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<ImagesResponseDataInner> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<ImagesResponseDataInner>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<ImagesResponseDataInner>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for ImagesResponseDataInner - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<ImagesResponseDataInner> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <ImagesResponseDataInner as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into ImagesResponseDataInner - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct ListFilesResponse {
    #[serde(rename = "object")]
    pub object: String,

    #[serde(rename = "data")]
    pub data: Vec<models::OpenAiFile>,

}


impl ListFilesResponse {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(object: String, data: Vec<models::OpenAiFile>, ) -> ListFilesResponse {
        ListFilesResponse {
            object,
            data,
        }
    }
}

/// Converts the ListFilesResponse value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for ListFilesResponse {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("object".to_string()),
            Some(self.object.to_string()),

            // Skipping data in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a ListFilesResponse value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for ListFilesResponse {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub object: Vec<String>,
            pub data: Vec<Vec<models::OpenAiFile>>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing ListFilesResponse".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "object" => intermediate_rep.object.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "data" => return std::result::Result::Err("Parsing a container in this style is not supported in ListFilesResponse".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing ListFilesResponse".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(ListFilesResponse {
            object: intermediate_rep.object.into_iter().next().ok_or_else(|| "object missing in ListFilesResponse".to_string())?,
            data: intermediate_rep.data.into_iter().next().ok_or_else(|| "data missing in ListFilesResponse".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<ListFilesResponse> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<ListFilesResponse>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<ListFilesResponse>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for ListFilesResponse - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<ListFilesResponse> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <ListFilesResponse as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into ListFilesResponse - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct ListFineTuneEventsResponse {
    #[serde(rename = "object")]
    pub object: String,

    #[serde(rename = "data")]
    pub data: Vec<models::FineTuneEvent>,

}


impl ListFineTuneEventsResponse {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(object: String, data: Vec<models::FineTuneEvent>, ) -> ListFineTuneEventsResponse {
        ListFineTuneEventsResponse {
            object,
            data,
        }
    }
}

/// Converts the ListFineTuneEventsResponse value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for ListFineTuneEventsResponse {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("object".to_string()),
            Some(self.object.to_string()),

            // Skipping data in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a ListFineTuneEventsResponse value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for ListFineTuneEventsResponse {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub object: Vec<String>,
            pub data: Vec<Vec<models::FineTuneEvent>>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing ListFineTuneEventsResponse".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "object" => intermediate_rep.object.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "data" => return std::result::Result::Err("Parsing a container in this style is not supported in ListFineTuneEventsResponse".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing ListFineTuneEventsResponse".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(ListFineTuneEventsResponse {
            object: intermediate_rep.object.into_iter().next().ok_or_else(|| "object missing in ListFineTuneEventsResponse".to_string())?,
            data: intermediate_rep.data.into_iter().next().ok_or_else(|| "data missing in ListFineTuneEventsResponse".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<ListFineTuneEventsResponse> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<ListFineTuneEventsResponse>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<ListFineTuneEventsResponse>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for ListFineTuneEventsResponse - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<ListFineTuneEventsResponse> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <ListFineTuneEventsResponse as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into ListFineTuneEventsResponse - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct ListFineTunesResponse {
    #[serde(rename = "object")]
    pub object: String,

    #[serde(rename = "data")]
    pub data: Vec<models::FineTune>,

}


impl ListFineTunesResponse {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(object: String, data: Vec<models::FineTune>, ) -> ListFineTunesResponse {
        ListFineTunesResponse {
            object,
            data,
        }
    }
}

/// Converts the ListFineTunesResponse value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for ListFineTunesResponse {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("object".to_string()),
            Some(self.object.to_string()),

            // Skipping data in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a ListFineTunesResponse value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for ListFineTunesResponse {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub object: Vec<String>,
            pub data: Vec<Vec<models::FineTune>>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing ListFineTunesResponse".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "object" => intermediate_rep.object.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "data" => return std::result::Result::Err("Parsing a container in this style is not supported in ListFineTunesResponse".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing ListFineTunesResponse".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(ListFineTunesResponse {
            object: intermediate_rep.object.into_iter().next().ok_or_else(|| "object missing in ListFineTunesResponse".to_string())?,
            data: intermediate_rep.data.into_iter().next().ok_or_else(|| "data missing in ListFineTunesResponse".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<ListFineTunesResponse> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<ListFineTunesResponse>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<ListFineTunesResponse>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for ListFineTunesResponse - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<ListFineTunesResponse> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <ListFineTunesResponse as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into ListFineTunesResponse - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct ListModelsResponse {
    #[serde(rename = "object")]
    pub object: String,

    #[serde(rename = "data")]
    pub data: Vec<models::Model>,

}


impl ListModelsResponse {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(object: String, data: Vec<models::Model>, ) -> ListModelsResponse {
        ListModelsResponse {
            object,
            data,
        }
    }
}

/// Converts the ListModelsResponse value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for ListModelsResponse {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("object".to_string()),
            Some(self.object.to_string()),

            // Skipping data in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a ListModelsResponse value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for ListModelsResponse {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub object: Vec<String>,
            pub data: Vec<Vec<models::Model>>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing ListModelsResponse".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "object" => intermediate_rep.object.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "data" => return std::result::Result::Err("Parsing a container in this style is not supported in ListModelsResponse".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing ListModelsResponse".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(ListModelsResponse {
            object: intermediate_rep.object.into_iter().next().ok_or_else(|| "object missing in ListModelsResponse".to_string())?,
            data: intermediate_rep.data.into_iter().next().ok_or_else(|| "data missing in ListModelsResponse".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<ListModelsResponse> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<ListModelsResponse>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<ListModelsResponse>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for ListModelsResponse - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<ListModelsResponse> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <ListModelsResponse as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into ListModelsResponse - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct Model {
    #[serde(rename = "id")]
    pub id: String,

    #[serde(rename = "object")]
    pub object: String,

    #[serde(rename = "created")]
    pub created: i32,

    #[serde(rename = "owned_by")]
    pub owned_by: String,

}


impl Model {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(id: String, object: String, created: i32, owned_by: String, ) -> Model {
        Model {
            id,
            object,
            created,
            owned_by,
        }
    }
}

/// Converts the Model value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for Model {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("id".to_string()),
            Some(self.id.to_string()),


            Some("object".to_string()),
            Some(self.object.to_string()),


            Some("created".to_string()),
            Some(self.created.to_string()),


            Some("owned_by".to_string()),
            Some(self.owned_by.to_string()),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a Model value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for Model {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub id: Vec<String>,
            pub object: Vec<String>,
            pub created: Vec<i32>,
            pub owned_by: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing Model".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "id" => intermediate_rep.id.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "object" => intermediate_rep.object.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "created" => intermediate_rep.created.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "owned_by" => intermediate_rep.owned_by.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing Model".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(Model {
            id: intermediate_rep.id.into_iter().next().ok_or_else(|| "id missing in Model".to_string())?,
            object: intermediate_rep.object.into_iter().next().ok_or_else(|| "object missing in Model".to_string())?,
            created: intermediate_rep.created.into_iter().next().ok_or_else(|| "created missing in Model".to_string())?,
            owned_by: intermediate_rep.owned_by.into_iter().next().ok_or_else(|| "owned_by missing in Model".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<Model> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<Model>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<Model>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for Model - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<Model> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <Model as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into Model - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct OpenAiFile {
    #[serde(rename = "id")]
    pub id: String,

    #[serde(rename = "object")]
    pub object: String,

    #[serde(rename = "bytes")]
    pub bytes: i32,

    #[serde(rename = "created_at")]
    pub created_at: i32,

    #[serde(rename = "filename")]
    pub filename: String,

    #[serde(rename = "purpose")]
    pub purpose: String,

    #[serde(rename = "status")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub status: Option<String>,

    #[serde(rename = "status_details")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub status_details: Option<crate::types::Object>,

}


impl OpenAiFile {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(id: String, object: String, bytes: i32, created_at: i32, filename: String, purpose: String, ) -> OpenAiFile {
        OpenAiFile {
            id,
            object,
            bytes,
            created_at,
            filename,
            purpose,
            status: None,
            status_details: None,
        }
    }
}

/// Converts the OpenAiFile value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for OpenAiFile {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("id".to_string()),
            Some(self.id.to_string()),


            Some("object".to_string()),
            Some(self.object.to_string()),


            Some("bytes".to_string()),
            Some(self.bytes.to_string()),


            Some("created_at".to_string()),
            Some(self.created_at.to_string()),


            Some("filename".to_string()),
            Some(self.filename.to_string()),


            Some("purpose".to_string()),
            Some(self.purpose.to_string()),


            self.status.as_ref().map(|status| {
                [
                    "status".to_string(),
                    status.to_string(),
                ].join(",")
            }),

            // Skipping status_details in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a OpenAiFile value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for OpenAiFile {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub id: Vec<String>,
            pub object: Vec<String>,
            pub bytes: Vec<i32>,
            pub created_at: Vec<i32>,
            pub filename: Vec<String>,
            pub purpose: Vec<String>,
            pub status: Vec<String>,
            pub status_details: Vec<crate::types::Object>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing OpenAiFile".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "id" => intermediate_rep.id.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "object" => intermediate_rep.object.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "bytes" => intermediate_rep.bytes.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "created_at" => intermediate_rep.created_at.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "filename" => intermediate_rep.filename.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "purpose" => intermediate_rep.purpose.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "status" => intermediate_rep.status.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "status_details" => intermediate_rep.status_details.push(<crate::types::Object as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing OpenAiFile".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(OpenAiFile {
            id: intermediate_rep.id.into_iter().next().ok_or_else(|| "id missing in OpenAiFile".to_string())?,
            object: intermediate_rep.object.into_iter().next().ok_or_else(|| "object missing in OpenAiFile".to_string())?,
            bytes: intermediate_rep.bytes.into_iter().next().ok_or_else(|| "bytes missing in OpenAiFile".to_string())?,
            created_at: intermediate_rep.created_at.into_iter().next().ok_or_else(|| "created_at missing in OpenAiFile".to_string())?,
            filename: intermediate_rep.filename.into_iter().next().ok_or_else(|| "filename missing in OpenAiFile".to_string())?,
            purpose: intermediate_rep.purpose.into_iter().next().ok_or_else(|| "purpose missing in OpenAiFile".to_string())?,
            status: intermediate_rep.status.into_iter().next(),
            status_details: intermediate_rep.status_details.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<OpenAiFile> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<OpenAiFile>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<OpenAiFile>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for OpenAiFile - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<OpenAiFile> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <OpenAiFile as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into OpenAiFile - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}



