/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */


use reqwest;

use crate::{apis::ResponseContent, models};
use super::{Error, configuration};


/// struct for typed errors of method [`create_image`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum CreateImageError {
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`create_image_edit`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum CreateImageEditError {
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`create_image_variation`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum CreateImageVariationError {
    UnknownValue(serde_json::Value),
}


pub async fn create_image(configuration: &configuration::Configuration, create_image_request: models::CreateImageRequest) -> Result<models::ImagesResponse, Error<CreateImageError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/images/generations", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    local_var_req_builder = local_var_req_builder.json(&create_image_request);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<CreateImageError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

pub async fn create_image_edit(configuration: &configuration::Configuration, image: std::path::PathBuf, prompt: &str, mask: Option<std::path::PathBuf>, model: Option<models::models::CreateImageEditRequestModel>, n: Option<i32>, size: Option<&str>, response_format: Option<&str>, user: Option<&str>) -> Result<models::ImagesResponse, Error<CreateImageEditError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/images/edits", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    let mut local_var_form = reqwest::multipart::Form::new();
    // TODO: support file upload for 'image' parameter
    local_var_form = local_var_form.text("prompt", prompt.to_string());
    // TODO: support file upload for 'mask' parameter
    if let Some(local_var_param_value) = model {
        local_var_form = local_var_form.text("model", local_var_param_value.to_string());
    }
    if let Some(local_var_param_value) = n {
        local_var_form = local_var_form.text("n", local_var_param_value.to_string());
    }
    if let Some(local_var_param_value) = size {
        local_var_form = local_var_form.text("size", local_var_param_value.to_string());
    }
    if let Some(local_var_param_value) = response_format {
        local_var_form = local_var_form.text("response_format", local_var_param_value.to_string());
    }
    if let Some(local_var_param_value) = user {
        local_var_form = local_var_form.text("user", local_var_param_value.to_string());
    }
    local_var_req_builder = local_var_req_builder.multipart(local_var_form);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<CreateImageEditError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

pub async fn create_image_variation(configuration: &configuration::Configuration, image: std::path::PathBuf, model: Option<models::models::CreateImageEditRequestModel>, n: Option<i32>, response_format: Option<&str>, size: Option<&str>, user: Option<&str>) -> Result<models::ImagesResponse, Error<CreateImageVariationError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/images/variations", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    let mut local_var_form = reqwest::multipart::Form::new();
    // TODO: support file upload for 'image' parameter
    if let Some(local_var_param_value) = model {
        local_var_form = local_var_form.text("model", local_var_param_value.to_string());
    }
    if let Some(local_var_param_value) = n {
        local_var_form = local_var_form.text("n", local_var_param_value.to_string());
    }
    if let Some(local_var_param_value) = response_format {
        local_var_form = local_var_form.text("response_format", local_var_param_value.to_string());
    }
    if let Some(local_var_param_value) = size {
        local_var_form = local_var_form.text("size", local_var_param_value.to_string());
    }
    if let Some(local_var_param_value) = user {
        local_var_form = local_var_form.text("user", local_var_param_value.to_string());
    }
    local_var_req_builder = local_var_req_builder.multipart(local_var_form);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<CreateImageVariationError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}
