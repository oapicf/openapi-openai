use std::collections::HashMap;

use axum::{body::Body, extract::*, response::Response, routing::*};
use axum_extra::extract::{CookieJar, Host, Query as QueryExtra};
use bytes::Bytes;
use http::{header::CONTENT_TYPE, HeaderMap, HeaderName, HeaderValue, Method, StatusCode};
use tracing::error;
use validator::{Validate, ValidationErrors};

use crate::{header, types::*};

#[allow(unused_imports)]
use crate::{apis, models};

#[allow(unused_imports)]
use crate::{models::check_xss_string, models::check_xss_vec_string, models::check_xss_map_string, models::check_xss_map_nested, models::check_xss_map};


/// Setup API Server.
pub fn new<I, A, E, C>(api_impl: I) -> Router
where
    I: AsRef<A> + Clone + Send + Sync + 'static,
    A: apis::assistants::Assistants<E, Claims = C> + apis::audio::Audio<E, Claims = C> + apis::audit_logs::AuditLogs<E, Claims = C> + apis::batch::Batch<E, Claims = C> + apis::chat::Chat<E, Claims = C> + apis::completions::Completions<E, Claims = C> + apis::default::Default<E, Claims = C> + apis::embeddings::Embeddings<E, Claims = C> + apis::files::Files<E, Claims = C> + apis::fine_tuning::FineTuning<E, Claims = C> + apis::images::Images<E, Claims = C> + apis::invites::Invites<E, Claims = C> + apis::models::Models<E, Claims = C> + apis::moderations::Moderations<E, Claims = C> + apis::projects::Projects<E, Claims = C> + apis::realtime::Realtime<E, Claims = C> + apis::uploads::Uploads<E, Claims = C> + apis::usage::Usage<E, Claims = C> + apis::users::Users<E, Claims = C> + apis::vector_stores::VectorStores<E, Claims = C> + apis::ApiAuthBasic<Claims = C> + Send + Sync + 'static,
    E: std::fmt::Debug + Send + Sync + 'static,
    C: Send + Sync + 'static,
{
    // build our application with a route
    Router::new()
        .route("/v1/assistants",
            get(list_assistants::<I, A, E, C>).post(create_assistant::<I, A, E, C>)
        )
        .route("/v1/assistants/{assistant_id}",
            delete(delete_assistant::<I, A, E, C>).get(get_assistant::<I, A, E, C>).post(modify_assistant::<I, A, E, C>)
        )
        .route("/v1/audio/speech",
            post(create_speech::<I, A, E, C>)
        )
        .route("/v1/audio/transcriptions",
            post(create_transcription::<I, A, E, C>)
        )
        .route("/v1/audio/translations",
            post(create_translation::<I, A, E, C>)
        )
        .route("/v1/batches",
            get(list_batches::<I, A, E, C>).post(create_batch::<I, A, E, C>)
        )
        .route("/v1/batches/{batch_id}",
            get(retrieve_batch::<I, A, E, C>)
        )
        .route("/v1/batches/{batch_id}/cancel",
            post(cancel_batch::<I, A, E, C>)
        )
        .route("/v1/chat/completions",
            post(create_chat_completion::<I, A, E, C>)
        )
        .route("/v1/completions",
            post(create_completion::<I, A, E, C>)
        )
        .route("/v1/embeddings",
            post(create_embedding::<I, A, E, C>)
        )
        .route("/v1/files",
            get(list_files::<I, A, E, C>).post(create_file::<I, A, E, C>)
        )
        .route("/v1/files/{file_id}",
            delete(delete_file::<I, A, E, C>).get(retrieve_file::<I, A, E, C>)
        )
        .route("/v1/files/{file_id}/content",
            get(download_file::<I, A, E, C>)
        )
        .route("/v1/fine_tuning/jobs",
            get(list_paginated_fine_tuning_jobs::<I, A, E, C>).post(create_fine_tuning_job::<I, A, E, C>)
        )
        .route("/v1/fine_tuning/jobs/{fine_tuning_job_id}",
            get(retrieve_fine_tuning_job::<I, A, E, C>)
        )
        .route("/v1/fine_tuning/jobs/{fine_tuning_job_id}/cancel",
            post(cancel_fine_tuning_job::<I, A, E, C>)
        )
        .route("/v1/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints",
            get(list_fine_tuning_job_checkpoints::<I, A, E, C>)
        )
        .route("/v1/fine_tuning/jobs/{fine_tuning_job_id}/events",
            get(list_fine_tuning_events::<I, A, E, C>)
        )
        .route("/v1/images/edits",
            post(create_image_edit::<I, A, E, C>)
        )
        .route("/v1/images/generations",
            post(create_image::<I, A, E, C>)
        )
        .route("/v1/images/variations",
            post(create_image_variation::<I, A, E, C>)
        )
        .route("/v1/models",
            get(list_models::<I, A, E, C>)
        )
        .route("/v1/models/{model}",
            delete(delete_model::<I, A, E, C>).get(retrieve_model::<I, A, E, C>)
        )
        .route("/v1/moderations",
            post(create_moderation::<I, A, E, C>)
        )
        .route("/v1/organization/admin_api_keys",
            get(admin_api_keys_list::<I, A, E, C>).post(admin_api_keys_create::<I, A, E, C>)
        )
        .route("/v1/organization/admin_api_keys/{key_id}",
            delete(admin_api_keys_delete::<I, A, E, C>).get(admin_api_keys_get::<I, A, E, C>)
        )
        .route("/v1/organization/audit_logs",
            get(list_audit_logs::<I, A, E, C>)
        )
        .route("/v1/organization/costs",
            get(usage_costs::<I, A, E, C>)
        )
        .route("/v1/organization/invites",
            get(list_invites::<I, A, E, C>).post(invite_user::<I, A, E, C>)
        )
        .route("/v1/organization/invites/{invite_id}",
            delete(delete_invite::<I, A, E, C>).get(retrieve_invite::<I, A, E, C>)
        )
        .route("/v1/organization/projects",
            get(list_projects::<I, A, E, C>).post(create_project::<I, A, E, C>)
        )
        .route("/v1/organization/projects/{project_id}",
            get(retrieve_project::<I, A, E, C>).post(modify_project::<I, A, E, C>)
        )
        .route("/v1/organization/projects/{project_id}/api_keys",
            get(list_project_api_keys::<I, A, E, C>)
        )
        .route("/v1/organization/projects/{project_id}/api_keys/{key_id}",
            delete(delete_project_api_key::<I, A, E, C>).get(retrieve_project_api_key::<I, A, E, C>)
        )
        .route("/v1/organization/projects/{project_id}/archive",
            post(archive_project::<I, A, E, C>)
        )
        .route("/v1/organization/projects/{project_id}/rate_limits",
            get(list_project_rate_limits::<I, A, E, C>)
        )
        .route("/v1/organization/projects/{project_id}/rate_limits/{rate_limit_id}",
            post(update_project_rate_limits::<I, A, E, C>)
        )
        .route("/v1/organization/projects/{project_id}/service_accounts",
            get(list_project_service_accounts::<I, A, E, C>).post(create_project_service_account::<I, A, E, C>)
        )
        .route("/v1/organization/projects/{project_id}/service_accounts/{service_account_id}",
            delete(delete_project_service_account::<I, A, E, C>).get(retrieve_project_service_account::<I, A, E, C>)
        )
        .route("/v1/organization/projects/{project_id}/users",
            get(list_project_users::<I, A, E, C>).post(create_project_user::<I, A, E, C>)
        )
        .route("/v1/organization/projects/{project_id}/users/{user_id}",
            delete(delete_project_user::<I, A, E, C>).get(retrieve_project_user::<I, A, E, C>).post(modify_project_user::<I, A, E, C>)
        )
        .route("/v1/organization/usage/audio_speeches",
            get(usage_audio_speeches::<I, A, E, C>)
        )
        .route("/v1/organization/usage/audio_transcriptions",
            get(usage_audio_transcriptions::<I, A, E, C>)
        )
        .route("/v1/organization/usage/code_interpreter_sessions",
            get(usage_code_interpreter_sessions::<I, A, E, C>)
        )
        .route("/v1/organization/usage/completions",
            get(usage_completions::<I, A, E, C>)
        )
        .route("/v1/organization/usage/embeddings",
            get(usage_embeddings::<I, A, E, C>)
        )
        .route("/v1/organization/usage/images",
            get(usage_images::<I, A, E, C>)
        )
        .route("/v1/organization/usage/moderations",
            get(usage_moderations::<I, A, E, C>)
        )
        .route("/v1/organization/usage/vector_stores",
            get(usage_vector_stores::<I, A, E, C>)
        )
        .route("/v1/organization/users",
            get(list_users::<I, A, E, C>)
        )
        .route("/v1/organization/users/{user_id}",
            delete(delete_user::<I, A, E, C>).get(retrieve_user::<I, A, E, C>).post(modify_user::<I, A, E, C>)
        )
        .route("/v1/realtime/sessions",
            post(create_realtime_session::<I, A, E, C>)
        )
        .route("/v1/threads",
            post(create_thread::<I, A, E, C>)
        )
        .route("/v1/threads/runs",
            post(create_thread_and_run::<I, A, E, C>)
        )
        .route("/v1/threads/{thread_id}",
            delete(delete_thread::<I, A, E, C>).get(get_thread::<I, A, E, C>).post(modify_thread::<I, A, E, C>)
        )
        .route("/v1/threads/{thread_id}/messages",
            get(list_messages::<I, A, E, C>).post(create_message::<I, A, E, C>)
        )
        .route("/v1/threads/{thread_id}/messages/{message_id}",
            delete(delete_message::<I, A, E, C>).get(get_message::<I, A, E, C>).post(modify_message::<I, A, E, C>)
        )
        .route("/v1/threads/{thread_id}/runs",
            get(list_runs::<I, A, E, C>).post(create_run::<I, A, E, C>)
        )
        .route("/v1/threads/{thread_id}/runs/{run_id}",
            get(get_run::<I, A, E, C>).post(modify_run::<I, A, E, C>)
        )
        .route("/v1/threads/{thread_id}/runs/{run_id}/cancel",
            post(cancel_run::<I, A, E, C>)
        )
        .route("/v1/threads/{thread_id}/runs/{run_id}/steps",
            get(list_run_steps::<I, A, E, C>)
        )
        .route("/v1/threads/{thread_id}/runs/{run_id}/steps/{step_id}",
            get(get_run_step::<I, A, E, C>)
        )
        .route("/v1/threads/{thread_id}/runs/{run_id}/submit_tool_outputs",
            post(submit_tool_ouputs_to_run::<I, A, E, C>)
        )
        .route("/v1/uploads",
            post(create_upload::<I, A, E, C>)
        )
        .route("/v1/uploads/{upload_id}/cancel",
            post(cancel_upload::<I, A, E, C>)
        )
        .route("/v1/uploads/{upload_id}/complete",
            post(complete_upload::<I, A, E, C>)
        )
        .route("/v1/uploads/{upload_id}/parts",
            post(add_upload_part::<I, A, E, C>)
        )
        .route("/v1/vector_stores",
            get(list_vector_stores::<I, A, E, C>).post(create_vector_store::<I, A, E, C>)
        )
        .route("/v1/vector_stores/{vector_store_id}",
            delete(delete_vector_store::<I, A, E, C>).get(get_vector_store::<I, A, E, C>).post(modify_vector_store::<I, A, E, C>)
        )
        .route("/v1/vector_stores/{vector_store_id}/file_batches",
            post(create_vector_store_file_batch::<I, A, E, C>)
        )
        .route("/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}",
            get(get_vector_store_file_batch::<I, A, E, C>)
        )
        .route("/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel",
            post(cancel_vector_store_file_batch::<I, A, E, C>)
        )
        .route("/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}/files",
            get(list_files_in_vector_store_batch::<I, A, E, C>)
        )
        .route("/v1/vector_stores/{vector_store_id}/files",
            get(list_vector_store_files::<I, A, E, C>).post(create_vector_store_file::<I, A, E, C>)
        )
        .route("/v1/vector_stores/{vector_store_id}/files/{file_id}",
            delete(delete_vector_store_file::<I, A, E, C>).get(get_vector_store_file::<I, A, E, C>)
        )
        .with_state(api_impl)
}


#[tracing::instrument(skip_all)]
fn cancel_run_validation(
  path_params: models::CancelRunPathParams,
) -> std::result::Result<(
  models::CancelRunPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// CancelRun - POST /v1/threads/{thread_id}/runs/{run_id}/cancel
#[tracing::instrument(skip_all)]
async fn cancel_run<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::CancelRunPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::assistants::Assistants<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    cancel_run_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().cancel_run(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::assistants::CancelRunResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct CreateAssistantBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::CreateAssistantRequest,
    }


#[tracing::instrument(skip_all)]
fn create_assistant_validation(
        body: models::CreateAssistantRequest,
) -> std::result::Result<(
        models::CreateAssistantRequest,
), ValidationErrors>
{
              let b = CreateAssistantBodyValidator { body: &body };
              b.validate()?;

Ok((
    body,
))
}
/// CreateAssistant - POST /v1/assistants
#[tracing::instrument(skip_all)]
async fn create_assistant<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
          Json(body): Json<models::CreateAssistantRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::assistants::Assistants<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    create_assistant_validation(
          body,
    )
  ).await.unwrap();

  let Ok((
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().create_assistant(
      
      &method,
      &host,
      &cookies,
        &claims,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::assistants::CreateAssistantResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct CreateMessageBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::CreateMessageRequest,
    }


#[tracing::instrument(skip_all)]
fn create_message_validation(
  path_params: models::CreateMessagePathParams,
        body: models::CreateMessageRequest,
) -> std::result::Result<(
  models::CreateMessagePathParams,
        models::CreateMessageRequest,
), ValidationErrors>
{
  path_params.validate()?;
              let b = CreateMessageBodyValidator { body: &body };
              b.validate()?;

Ok((
  path_params,
    body,
))
}
/// CreateMessage - POST /v1/threads/{thread_id}/messages
#[tracing::instrument(skip_all)]
async fn create_message<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::CreateMessagePathParams>,
 State(api_impl): State<I>,
          Json(body): Json<models::CreateMessageRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::assistants::Assistants<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    create_message_validation(
        path_params,
          body,
    )
  ).await.unwrap();

  let Ok((
    path_params,
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().create_message(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::assistants::CreateMessageResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct CreateRunBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::CreateRunRequest,
    }


#[tracing::instrument(skip_all)]
fn create_run_validation(
  path_params: models::CreateRunPathParams,
  query_params: models::CreateRunQueryParams,
        body: models::CreateRunRequest,
) -> std::result::Result<(
  models::CreateRunPathParams,
  models::CreateRunQueryParams,
        models::CreateRunRequest,
), ValidationErrors>
{
  path_params.validate()?;
  query_params.validate()?;
              let b = CreateRunBodyValidator { body: &body };
              b.validate()?;

Ok((
  path_params,
  query_params,
    body,
))
}
/// CreateRun - POST /v1/threads/{thread_id}/runs
#[tracing::instrument(skip_all)]
async fn create_run<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::CreateRunPathParams>,
  QueryExtra(query_params): QueryExtra<models::CreateRunQueryParams>,
 State(api_impl): State<I>,
          Json(body): Json<models::CreateRunRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::assistants::Assistants<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    create_run_validation(
        path_params,
        query_params,
          body,
    )
  ).await.unwrap();

  let Ok((
    path_params,
    query_params,
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().create_run(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
        &query_params,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::assistants::CreateRunResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct CreateThreadBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::CreateThreadRequest,
    }


#[tracing::instrument(skip_all)]
fn create_thread_validation(
        body: Option<models::CreateThreadRequest>,
) -> std::result::Result<(
        Option<models::CreateThreadRequest>,
), ValidationErrors>
{
            if let Some(body) = &body {
              let b = CreateThreadBodyValidator { body };
              b.validate()?;
            }

Ok((
    body,
))
}
/// CreateThread - POST /v1/threads
#[tracing::instrument(skip_all)]
async fn create_thread<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
          Json(body): Json<Option<models::CreateThreadRequest>>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::assistants::Assistants<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    create_thread_validation(
          body,
    )
  ).await.unwrap();

  let Ok((
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().create_thread(
      
      &method,
      &host,
      &cookies,
        &claims,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::assistants::CreateThreadResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct CreateThreadAndRunBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::CreateThreadAndRunRequest,
    }


#[tracing::instrument(skip_all)]
fn create_thread_and_run_validation(
        body: models::CreateThreadAndRunRequest,
) -> std::result::Result<(
        models::CreateThreadAndRunRequest,
), ValidationErrors>
{
              let b = CreateThreadAndRunBodyValidator { body: &body };
              b.validate()?;

Ok((
    body,
))
}
/// CreateThreadAndRun - POST /v1/threads/runs
#[tracing::instrument(skip_all)]
async fn create_thread_and_run<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
          Json(body): Json<models::CreateThreadAndRunRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::assistants::Assistants<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    create_thread_and_run_validation(
          body,
    )
  ).await.unwrap();

  let Ok((
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().create_thread_and_run(
      
      &method,
      &host,
      &cookies,
        &claims,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::assistants::CreateThreadAndRunResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn delete_assistant_validation(
  path_params: models::DeleteAssistantPathParams,
) -> std::result::Result<(
  models::DeleteAssistantPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// DeleteAssistant - DELETE /v1/assistants/{assistant_id}
#[tracing::instrument(skip_all)]
async fn delete_assistant<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::DeleteAssistantPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::assistants::Assistants<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    delete_assistant_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().delete_assistant(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::assistants::DeleteAssistantResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn delete_message_validation(
  path_params: models::DeleteMessagePathParams,
) -> std::result::Result<(
  models::DeleteMessagePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// DeleteMessage - DELETE /v1/threads/{thread_id}/messages/{message_id}
#[tracing::instrument(skip_all)]
async fn delete_message<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::DeleteMessagePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::assistants::Assistants<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    delete_message_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().delete_message(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::assistants::DeleteMessageResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn delete_thread_validation(
  path_params: models::DeleteThreadPathParams,
) -> std::result::Result<(
  models::DeleteThreadPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// DeleteThread - DELETE /v1/threads/{thread_id}
#[tracing::instrument(skip_all)]
async fn delete_thread<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::DeleteThreadPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::assistants::Assistants<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    delete_thread_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().delete_thread(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::assistants::DeleteThreadResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn get_assistant_validation(
  path_params: models::GetAssistantPathParams,
) -> std::result::Result<(
  models::GetAssistantPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// GetAssistant - GET /v1/assistants/{assistant_id}
#[tracing::instrument(skip_all)]
async fn get_assistant<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::GetAssistantPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::assistants::Assistants<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    get_assistant_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().get_assistant(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::assistants::GetAssistantResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn get_message_validation(
  path_params: models::GetMessagePathParams,
) -> std::result::Result<(
  models::GetMessagePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// GetMessage - GET /v1/threads/{thread_id}/messages/{message_id}
#[tracing::instrument(skip_all)]
async fn get_message<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::GetMessagePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::assistants::Assistants<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    get_message_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().get_message(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::assistants::GetMessageResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn get_run_validation(
  path_params: models::GetRunPathParams,
) -> std::result::Result<(
  models::GetRunPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// GetRun - GET /v1/threads/{thread_id}/runs/{run_id}
#[tracing::instrument(skip_all)]
async fn get_run<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::GetRunPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::assistants::Assistants<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    get_run_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().get_run(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::assistants::GetRunResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn get_run_step_validation(
  path_params: models::GetRunStepPathParams,
  query_params: models::GetRunStepQueryParams,
) -> std::result::Result<(
  models::GetRunStepPathParams,
  models::GetRunStepQueryParams,
), ValidationErrors>
{
  path_params.validate()?;
  query_params.validate()?;

Ok((
  path_params,
  query_params,
))
}
/// GetRunStep - GET /v1/threads/{thread_id}/runs/{run_id}/steps/{step_id}
#[tracing::instrument(skip_all)]
async fn get_run_step<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::GetRunStepPathParams>,
  QueryExtra(query_params): QueryExtra<models::GetRunStepQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::assistants::Assistants<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    get_run_step_validation(
        path_params,
        query_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().get_run_step(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::assistants::GetRunStepResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn get_thread_validation(
  path_params: models::GetThreadPathParams,
) -> std::result::Result<(
  models::GetThreadPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// GetThread - GET /v1/threads/{thread_id}
#[tracing::instrument(skip_all)]
async fn get_thread<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::GetThreadPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::assistants::Assistants<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    get_thread_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().get_thread(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::assistants::GetThreadResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn list_assistants_validation(
  query_params: models::ListAssistantsQueryParams,
) -> std::result::Result<(
  models::ListAssistantsQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// ListAssistants - GET /v1/assistants
#[tracing::instrument(skip_all)]
async fn list_assistants<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::ListAssistantsQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::assistants::Assistants<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    list_assistants_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().list_assistants(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::assistants::ListAssistantsResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn list_messages_validation(
  path_params: models::ListMessagesPathParams,
  query_params: models::ListMessagesQueryParams,
) -> std::result::Result<(
  models::ListMessagesPathParams,
  models::ListMessagesQueryParams,
), ValidationErrors>
{
  path_params.validate()?;
  query_params.validate()?;

Ok((
  path_params,
  query_params,
))
}
/// ListMessages - GET /v1/threads/{thread_id}/messages
#[tracing::instrument(skip_all)]
async fn list_messages<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::ListMessagesPathParams>,
  QueryExtra(query_params): QueryExtra<models::ListMessagesQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::assistants::Assistants<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    list_messages_validation(
        path_params,
        query_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().list_messages(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::assistants::ListMessagesResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn list_run_steps_validation(
  path_params: models::ListRunStepsPathParams,
  query_params: models::ListRunStepsQueryParams,
) -> std::result::Result<(
  models::ListRunStepsPathParams,
  models::ListRunStepsQueryParams,
), ValidationErrors>
{
  path_params.validate()?;
  query_params.validate()?;

Ok((
  path_params,
  query_params,
))
}
/// ListRunSteps - GET /v1/threads/{thread_id}/runs/{run_id}/steps
#[tracing::instrument(skip_all)]
async fn list_run_steps<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::ListRunStepsPathParams>,
  QueryExtra(query_params): QueryExtra<models::ListRunStepsQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::assistants::Assistants<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    list_run_steps_validation(
        path_params,
        query_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().list_run_steps(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::assistants::ListRunStepsResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn list_runs_validation(
  path_params: models::ListRunsPathParams,
  query_params: models::ListRunsQueryParams,
) -> std::result::Result<(
  models::ListRunsPathParams,
  models::ListRunsQueryParams,
), ValidationErrors>
{
  path_params.validate()?;
  query_params.validate()?;

Ok((
  path_params,
  query_params,
))
}
/// ListRuns - GET /v1/threads/{thread_id}/runs
#[tracing::instrument(skip_all)]
async fn list_runs<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::ListRunsPathParams>,
  QueryExtra(query_params): QueryExtra<models::ListRunsQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::assistants::Assistants<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    list_runs_validation(
        path_params,
        query_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().list_runs(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::assistants::ListRunsResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct ModifyAssistantBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::ModifyAssistantRequest,
    }


#[tracing::instrument(skip_all)]
fn modify_assistant_validation(
  path_params: models::ModifyAssistantPathParams,
        body: models::ModifyAssistantRequest,
) -> std::result::Result<(
  models::ModifyAssistantPathParams,
        models::ModifyAssistantRequest,
), ValidationErrors>
{
  path_params.validate()?;
              let b = ModifyAssistantBodyValidator { body: &body };
              b.validate()?;

Ok((
  path_params,
    body,
))
}
/// ModifyAssistant - POST /v1/assistants/{assistant_id}
#[tracing::instrument(skip_all)]
async fn modify_assistant<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::ModifyAssistantPathParams>,
 State(api_impl): State<I>,
          Json(body): Json<models::ModifyAssistantRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::assistants::Assistants<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    modify_assistant_validation(
        path_params,
          body,
    )
  ).await.unwrap();

  let Ok((
    path_params,
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().modify_assistant(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::assistants::ModifyAssistantResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct ModifyMessageBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::ModifyMessageRequest,
    }


#[tracing::instrument(skip_all)]
fn modify_message_validation(
  path_params: models::ModifyMessagePathParams,
        body: models::ModifyMessageRequest,
) -> std::result::Result<(
  models::ModifyMessagePathParams,
        models::ModifyMessageRequest,
), ValidationErrors>
{
  path_params.validate()?;
              let b = ModifyMessageBodyValidator { body: &body };
              b.validate()?;

Ok((
  path_params,
    body,
))
}
/// ModifyMessage - POST /v1/threads/{thread_id}/messages/{message_id}
#[tracing::instrument(skip_all)]
async fn modify_message<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::ModifyMessagePathParams>,
 State(api_impl): State<I>,
          Json(body): Json<models::ModifyMessageRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::assistants::Assistants<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    modify_message_validation(
        path_params,
          body,
    )
  ).await.unwrap();

  let Ok((
    path_params,
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().modify_message(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::assistants::ModifyMessageResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct ModifyRunBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::ModifyRunRequest,
    }


#[tracing::instrument(skip_all)]
fn modify_run_validation(
  path_params: models::ModifyRunPathParams,
        body: models::ModifyRunRequest,
) -> std::result::Result<(
  models::ModifyRunPathParams,
        models::ModifyRunRequest,
), ValidationErrors>
{
  path_params.validate()?;
              let b = ModifyRunBodyValidator { body: &body };
              b.validate()?;

Ok((
  path_params,
    body,
))
}
/// ModifyRun - POST /v1/threads/{thread_id}/runs/{run_id}
#[tracing::instrument(skip_all)]
async fn modify_run<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::ModifyRunPathParams>,
 State(api_impl): State<I>,
          Json(body): Json<models::ModifyRunRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::assistants::Assistants<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    modify_run_validation(
        path_params,
          body,
    )
  ).await.unwrap();

  let Ok((
    path_params,
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().modify_run(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::assistants::ModifyRunResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct ModifyThreadBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::ModifyThreadRequest,
    }


#[tracing::instrument(skip_all)]
fn modify_thread_validation(
  path_params: models::ModifyThreadPathParams,
        body: models::ModifyThreadRequest,
) -> std::result::Result<(
  models::ModifyThreadPathParams,
        models::ModifyThreadRequest,
), ValidationErrors>
{
  path_params.validate()?;
              let b = ModifyThreadBodyValidator { body: &body };
              b.validate()?;

Ok((
  path_params,
    body,
))
}
/// ModifyThread - POST /v1/threads/{thread_id}
#[tracing::instrument(skip_all)]
async fn modify_thread<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::ModifyThreadPathParams>,
 State(api_impl): State<I>,
          Json(body): Json<models::ModifyThreadRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::assistants::Assistants<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    modify_thread_validation(
        path_params,
          body,
    )
  ).await.unwrap();

  let Ok((
    path_params,
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().modify_thread(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::assistants::ModifyThreadResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct SubmitToolOuputsToRunBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::SubmitToolOutputsRunRequest,
    }


#[tracing::instrument(skip_all)]
fn submit_tool_ouputs_to_run_validation(
  path_params: models::SubmitToolOuputsToRunPathParams,
        body: models::SubmitToolOutputsRunRequest,
) -> std::result::Result<(
  models::SubmitToolOuputsToRunPathParams,
        models::SubmitToolOutputsRunRequest,
), ValidationErrors>
{
  path_params.validate()?;
              let b = SubmitToolOuputsToRunBodyValidator { body: &body };
              b.validate()?;

Ok((
  path_params,
    body,
))
}
/// SubmitToolOuputsToRun - POST /v1/threads/{thread_id}/runs/{run_id}/submit_tool_outputs
#[tracing::instrument(skip_all)]
async fn submit_tool_ouputs_to_run<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::SubmitToolOuputsToRunPathParams>,
 State(api_impl): State<I>,
          Json(body): Json<models::SubmitToolOutputsRunRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::assistants::Assistants<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    submit_tool_ouputs_to_run_validation(
        path_params,
          body,
    )
  ).await.unwrap();

  let Ok((
    path_params,
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().submit_tool_ouputs_to_run(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::assistants::SubmitToolOuputsToRunResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct CreateSpeechBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::CreateSpeechRequest,
    }


#[tracing::instrument(skip_all)]
fn create_speech_validation(
        body: models::CreateSpeechRequest,
) -> std::result::Result<(
        models::CreateSpeechRequest,
), ValidationErrors>
{
              let b = CreateSpeechBodyValidator { body: &body };
              b.validate()?;

Ok((
    body,
))
}
/// CreateSpeech - POST /v1/audio/speech
#[tracing::instrument(skip_all)]
async fn create_speech<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
          Json(body): Json<models::CreateSpeechRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::audio::Audio<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    create_speech_validation(
          body,
    )
  ).await.unwrap();

  let Ok((
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().create_speech(
      
      &method,
      &host,
      &cookies,
        &claims,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::audio::CreateSpeechResponse::Status200_OK
                                                    {
                                                        body,
                                                        transfer_encoding
                                                    }
                                                => {
                                                    if let Some(transfer_encoding) = transfer_encoding {
                                                    let transfer_encoding = match header::IntoHeaderValue(transfer_encoding).try_into() {
                                                        Ok(val) => val,
                                                        Err(e) => {
                                                            return Response::builder()
                                                                    .status(StatusCode::INTERNAL_SERVER_ERROR)
                                                                    .body(Body::from(format!("An internal server error occurred handling transfer_encoding header - {e}"))).map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR });
                                                        }
                                                    };


                                                    {
                                                      let mut response_headers = response.headers_mut().unwrap();
                                                      response_headers.insert(
                                                          HeaderName::from_static("transfer-encoding"),
                                                          transfer_encoding
                                                      );
                                                    }
                                                    }
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/octet-stream"));
                                                  }

                                                  let body_content = body.0;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn create_transcription_validation(
) -> std::result::Result<(
), ValidationErrors>
{

Ok((
))
}
/// CreateTranscription - POST /v1/audio/transcriptions
#[tracing::instrument(skip_all)]
async fn create_transcription<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
  body: Multipart,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::audio::Audio<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    create_transcription_validation(
    )
  ).await.unwrap();

  let Ok((
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().create_transcription(
      
      &method,
      &host,
      &cookies,
        &claims,
          body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::audio::CreateTranscriptionResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn create_translation_validation(
) -> std::result::Result<(
), ValidationErrors>
{

Ok((
))
}
/// CreateTranslation - POST /v1/audio/translations
#[tracing::instrument(skip_all)]
async fn create_translation<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
  body: Multipart,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::audio::Audio<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    create_translation_validation(
    )
  ).await.unwrap();

  let Ok((
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().create_translation(
      
      &method,
      &host,
      &cookies,
        &claims,
          body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::audio::CreateTranslationResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn list_audit_logs_validation(
  query_params: models::ListAuditLogsQueryParams,
) -> std::result::Result<(
  models::ListAuditLogsQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// ListAuditLogs - GET /v1/organization/audit_logs
#[tracing::instrument(skip_all)]
async fn list_audit_logs<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::ListAuditLogsQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::audit_logs::AuditLogs<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    list_audit_logs_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().list_audit_logs(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::audit_logs::ListAuditLogsResponse::Status200_AuditLogsListedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn cancel_batch_validation(
  path_params: models::CancelBatchPathParams,
) -> std::result::Result<(
  models::CancelBatchPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// CancelBatch - POST /v1/batches/{batch_id}/cancel
#[tracing::instrument(skip_all)]
async fn cancel_batch<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::CancelBatchPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::batch::Batch<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    cancel_batch_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().cancel_batch(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::batch::CancelBatchResponse::Status200_BatchIsCancelling
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct CreateBatchBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::CreateBatchRequest,
    }


#[tracing::instrument(skip_all)]
fn create_batch_validation(
        body: models::CreateBatchRequest,
) -> std::result::Result<(
        models::CreateBatchRequest,
), ValidationErrors>
{
              let b = CreateBatchBodyValidator { body: &body };
              b.validate()?;

Ok((
    body,
))
}
/// CreateBatch - POST /v1/batches
#[tracing::instrument(skip_all)]
async fn create_batch<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
          Json(body): Json<models::CreateBatchRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::batch::Batch<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    create_batch_validation(
          body,
    )
  ).await.unwrap();

  let Ok((
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().create_batch(
      
      &method,
      &host,
      &cookies,
        &claims,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::batch::CreateBatchResponse::Status200_BatchCreatedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn list_batches_validation(
  query_params: models::ListBatchesQueryParams,
) -> std::result::Result<(
  models::ListBatchesQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// ListBatches - GET /v1/batches
#[tracing::instrument(skip_all)]
async fn list_batches<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::ListBatchesQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::batch::Batch<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    list_batches_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().list_batches(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::batch::ListBatchesResponse::Status200_BatchListedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn retrieve_batch_validation(
  path_params: models::RetrieveBatchPathParams,
) -> std::result::Result<(
  models::RetrieveBatchPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// RetrieveBatch - GET /v1/batches/{batch_id}
#[tracing::instrument(skip_all)]
async fn retrieve_batch<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::RetrieveBatchPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::batch::Batch<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    retrieve_batch_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().retrieve_batch(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::batch::RetrieveBatchResponse::Status200_BatchRetrievedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct CreateChatCompletionBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::CreateChatCompletionRequest,
    }


#[tracing::instrument(skip_all)]
fn create_chat_completion_validation(
        body: models::CreateChatCompletionRequest,
) -> std::result::Result<(
        models::CreateChatCompletionRequest,
), ValidationErrors>
{
              let b = CreateChatCompletionBodyValidator { body: &body };
              b.validate()?;

Ok((
    body,
))
}
/// CreateChatCompletion - POST /v1/chat/completions
#[tracing::instrument(skip_all)]
async fn create_chat_completion<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
          Json(body): Json<models::CreateChatCompletionRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::chat::Chat<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    create_chat_completion_validation(
          body,
    )
  ).await.unwrap();

  let Ok((
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().create_chat_completion(
      
      &method,
      &host,
      &cookies,
        &claims,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::chat::CreateChatCompletionResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct CreateCompletionBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::CreateCompletionRequest,
    }


#[tracing::instrument(skip_all)]
fn create_completion_validation(
        body: models::CreateCompletionRequest,
) -> std::result::Result<(
        models::CreateCompletionRequest,
), ValidationErrors>
{
              let b = CreateCompletionBodyValidator { body: &body };
              b.validate()?;

Ok((
    body,
))
}
/// CreateCompletion - POST /v1/completions
#[tracing::instrument(skip_all)]
async fn create_completion<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
          Json(body): Json<models::CreateCompletionRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::completions::Completions<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    create_completion_validation(
          body,
    )
  ).await.unwrap();

  let Ok((
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().create_completion(
      
      &method,
      &host,
      &cookies,
        &claims,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::completions::CreateCompletionResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct AdminApiKeysCreateBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::AdminApiKeysCreateRequest,
    }


#[tracing::instrument(skip_all)]
fn admin_api_keys_create_validation(
        body: models::AdminApiKeysCreateRequest,
) -> std::result::Result<(
        models::AdminApiKeysCreateRequest,
), ValidationErrors>
{
              let b = AdminApiKeysCreateBodyValidator { body: &body };
              b.validate()?;

Ok((
    body,
))
}
/// AdminApiKeysCreate - POST /v1/organization/admin_api_keys
#[tracing::instrument(skip_all)]
async fn admin_api_keys_create<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
          Json(body): Json<models::AdminApiKeysCreateRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::default::Default<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    admin_api_keys_create_validation(
          body,
    )
  ).await.unwrap();

  let Ok((
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().admin_api_keys_create(
      
      &method,
      &host,
      &cookies,
        &claims,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::default::AdminApiKeysCreateResponse::Status200_TheNewlyCreatedAdminAPIKey
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn admin_api_keys_delete_validation(
  path_params: models::AdminApiKeysDeletePathParams,
) -> std::result::Result<(
  models::AdminApiKeysDeletePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// AdminApiKeysDelete - DELETE /v1/organization/admin_api_keys/{key_id}
#[tracing::instrument(skip_all)]
async fn admin_api_keys_delete<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::AdminApiKeysDeletePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::default::Default<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    admin_api_keys_delete_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().admin_api_keys_delete(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::default::AdminApiKeysDeleteResponse::Status200_ConfirmationThatTheAPIKeyWasDeleted
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn admin_api_keys_get_validation(
  path_params: models::AdminApiKeysGetPathParams,
) -> std::result::Result<(
  models::AdminApiKeysGetPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// AdminApiKeysGet - GET /v1/organization/admin_api_keys/{key_id}
#[tracing::instrument(skip_all)]
async fn admin_api_keys_get<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::AdminApiKeysGetPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::default::Default<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    admin_api_keys_get_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().admin_api_keys_get(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::default::AdminApiKeysGetResponse::Status200_DetailsOfTheRequestedAPIKey
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn admin_api_keys_list_validation(
  query_params: models::AdminApiKeysListQueryParams,
) -> std::result::Result<(
  models::AdminApiKeysListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// AdminApiKeysList - GET /v1/organization/admin_api_keys
#[tracing::instrument(skip_all)]
async fn admin_api_keys_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::AdminApiKeysListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::default::Default<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    admin_api_keys_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().admin_api_keys_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::default::AdminApiKeysListResponse::Status200_AListOfOrganizationAPIKeys
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct CreateEmbeddingBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::CreateEmbeddingRequest,
    }


#[tracing::instrument(skip_all)]
fn create_embedding_validation(
        body: models::CreateEmbeddingRequest,
) -> std::result::Result<(
        models::CreateEmbeddingRequest,
), ValidationErrors>
{
              let b = CreateEmbeddingBodyValidator { body: &body };
              b.validate()?;

Ok((
    body,
))
}
/// CreateEmbedding - POST /v1/embeddings
#[tracing::instrument(skip_all)]
async fn create_embedding<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
          Json(body): Json<models::CreateEmbeddingRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::embeddings::Embeddings<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    create_embedding_validation(
          body,
    )
  ).await.unwrap();

  let Ok((
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().create_embedding(
      
      &method,
      &host,
      &cookies,
        &claims,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::embeddings::CreateEmbeddingResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn create_file_validation(
) -> std::result::Result<(
), ValidationErrors>
{

Ok((
))
}
/// CreateFile - POST /v1/files
#[tracing::instrument(skip_all)]
async fn create_file<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
  body: Multipart,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::files::Files<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    create_file_validation(
    )
  ).await.unwrap();

  let Ok((
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().create_file(
      
      &method,
      &host,
      &cookies,
        &claims,
          body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::files::CreateFileResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn delete_file_validation(
  path_params: models::DeleteFilePathParams,
) -> std::result::Result<(
  models::DeleteFilePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// DeleteFile - DELETE /v1/files/{file_id}
#[tracing::instrument(skip_all)]
async fn delete_file<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::DeleteFilePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::files::Files<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    delete_file_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().delete_file(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::files::DeleteFileResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn download_file_validation(
  path_params: models::DownloadFilePathParams,
) -> std::result::Result<(
  models::DownloadFilePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// DownloadFile - GET /v1/files/{file_id}/content
#[tracing::instrument(skip_all)]
async fn download_file<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::DownloadFilePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::files::Files<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    download_file_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().download_file(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::files::DownloadFileResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn list_files_validation(
  query_params: models::ListFilesQueryParams,
) -> std::result::Result<(
  models::ListFilesQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// ListFiles - GET /v1/files
#[tracing::instrument(skip_all)]
async fn list_files<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::ListFilesQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::files::Files<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    list_files_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().list_files(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::files::ListFilesResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn retrieve_file_validation(
  path_params: models::RetrieveFilePathParams,
) -> std::result::Result<(
  models::RetrieveFilePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// RetrieveFile - GET /v1/files/{file_id}
#[tracing::instrument(skip_all)]
async fn retrieve_file<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::RetrieveFilePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::files::Files<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    retrieve_file_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().retrieve_file(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::files::RetrieveFileResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn cancel_fine_tuning_job_validation(
  path_params: models::CancelFineTuningJobPathParams,
) -> std::result::Result<(
  models::CancelFineTuningJobPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// CancelFineTuningJob - POST /v1/fine_tuning/jobs/{fine_tuning_job_id}/cancel
#[tracing::instrument(skip_all)]
async fn cancel_fine_tuning_job<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::CancelFineTuningJobPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::fine_tuning::FineTuning<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    cancel_fine_tuning_job_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().cancel_fine_tuning_job(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::fine_tuning::CancelFineTuningJobResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct CreateFineTuningJobBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::CreateFineTuningJobRequest,
    }


#[tracing::instrument(skip_all)]
fn create_fine_tuning_job_validation(
        body: models::CreateFineTuningJobRequest,
) -> std::result::Result<(
        models::CreateFineTuningJobRequest,
), ValidationErrors>
{
              let b = CreateFineTuningJobBodyValidator { body: &body };
              b.validate()?;

Ok((
    body,
))
}
/// CreateFineTuningJob - POST /v1/fine_tuning/jobs
#[tracing::instrument(skip_all)]
async fn create_fine_tuning_job<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
          Json(body): Json<models::CreateFineTuningJobRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::fine_tuning::FineTuning<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    create_fine_tuning_job_validation(
          body,
    )
  ).await.unwrap();

  let Ok((
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().create_fine_tuning_job(
      
      &method,
      &host,
      &cookies,
        &claims,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::fine_tuning::CreateFineTuningJobResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn list_fine_tuning_events_validation(
  path_params: models::ListFineTuningEventsPathParams,
  query_params: models::ListFineTuningEventsQueryParams,
) -> std::result::Result<(
  models::ListFineTuningEventsPathParams,
  models::ListFineTuningEventsQueryParams,
), ValidationErrors>
{
  path_params.validate()?;
  query_params.validate()?;

Ok((
  path_params,
  query_params,
))
}
/// ListFineTuningEvents - GET /v1/fine_tuning/jobs/{fine_tuning_job_id}/events
#[tracing::instrument(skip_all)]
async fn list_fine_tuning_events<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::ListFineTuningEventsPathParams>,
  QueryExtra(query_params): QueryExtra<models::ListFineTuningEventsQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::fine_tuning::FineTuning<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    list_fine_tuning_events_validation(
        path_params,
        query_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().list_fine_tuning_events(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::fine_tuning::ListFineTuningEventsResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn list_fine_tuning_job_checkpoints_validation(
  path_params: models::ListFineTuningJobCheckpointsPathParams,
  query_params: models::ListFineTuningJobCheckpointsQueryParams,
) -> std::result::Result<(
  models::ListFineTuningJobCheckpointsPathParams,
  models::ListFineTuningJobCheckpointsQueryParams,
), ValidationErrors>
{
  path_params.validate()?;
  query_params.validate()?;

Ok((
  path_params,
  query_params,
))
}
/// ListFineTuningJobCheckpoints - GET /v1/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints
#[tracing::instrument(skip_all)]
async fn list_fine_tuning_job_checkpoints<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::ListFineTuningJobCheckpointsPathParams>,
  QueryExtra(query_params): QueryExtra<models::ListFineTuningJobCheckpointsQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::fine_tuning::FineTuning<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    list_fine_tuning_job_checkpoints_validation(
        path_params,
        query_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().list_fine_tuning_job_checkpoints(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::fine_tuning::ListFineTuningJobCheckpointsResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn list_paginated_fine_tuning_jobs_validation(
  query_params: models::ListPaginatedFineTuningJobsQueryParams,
) -> std::result::Result<(
  models::ListPaginatedFineTuningJobsQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// ListPaginatedFineTuningJobs - GET /v1/fine_tuning/jobs
#[tracing::instrument(skip_all)]
async fn list_paginated_fine_tuning_jobs<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::ListPaginatedFineTuningJobsQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::fine_tuning::FineTuning<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    list_paginated_fine_tuning_jobs_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().list_paginated_fine_tuning_jobs(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::fine_tuning::ListPaginatedFineTuningJobsResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn retrieve_fine_tuning_job_validation(
  path_params: models::RetrieveFineTuningJobPathParams,
) -> std::result::Result<(
  models::RetrieveFineTuningJobPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// RetrieveFineTuningJob - GET /v1/fine_tuning/jobs/{fine_tuning_job_id}
#[tracing::instrument(skip_all)]
async fn retrieve_fine_tuning_job<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::RetrieveFineTuningJobPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::fine_tuning::FineTuning<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    retrieve_fine_tuning_job_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().retrieve_fine_tuning_job(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::fine_tuning::RetrieveFineTuningJobResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct CreateImageBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::CreateImageRequest,
    }


#[tracing::instrument(skip_all)]
fn create_image_validation(
        body: models::CreateImageRequest,
) -> std::result::Result<(
        models::CreateImageRequest,
), ValidationErrors>
{
              let b = CreateImageBodyValidator { body: &body };
              b.validate()?;

Ok((
    body,
))
}
/// CreateImage - POST /v1/images/generations
#[tracing::instrument(skip_all)]
async fn create_image<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
          Json(body): Json<models::CreateImageRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::images::Images<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    create_image_validation(
          body,
    )
  ).await.unwrap();

  let Ok((
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().create_image(
      
      &method,
      &host,
      &cookies,
        &claims,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::images::CreateImageResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn create_image_edit_validation(
) -> std::result::Result<(
), ValidationErrors>
{

Ok((
))
}
/// CreateImageEdit - POST /v1/images/edits
#[tracing::instrument(skip_all)]
async fn create_image_edit<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
  body: Multipart,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::images::Images<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    create_image_edit_validation(
    )
  ).await.unwrap();

  let Ok((
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().create_image_edit(
      
      &method,
      &host,
      &cookies,
        &claims,
          body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::images::CreateImageEditResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn create_image_variation_validation(
) -> std::result::Result<(
), ValidationErrors>
{

Ok((
))
}
/// CreateImageVariation - POST /v1/images/variations
#[tracing::instrument(skip_all)]
async fn create_image_variation<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
  body: Multipart,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::images::Images<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    create_image_variation_validation(
    )
  ).await.unwrap();

  let Ok((
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().create_image_variation(
      
      &method,
      &host,
      &cookies,
        &claims,
          body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::images::CreateImageVariationResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn delete_invite_validation(
  path_params: models::DeleteInvitePathParams,
) -> std::result::Result<(
  models::DeleteInvitePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// DeleteInvite - DELETE /v1/organization/invites/{invite_id}
#[tracing::instrument(skip_all)]
async fn delete_invite<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::DeleteInvitePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::invites::Invites<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    delete_invite_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().delete_invite(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::invites::DeleteInviteResponse::Status200_InviteDeletedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct InviteUserBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::InviteRequest,
    }


#[tracing::instrument(skip_all)]
fn invite_user_validation(
        body: models::InviteRequest,
) -> std::result::Result<(
        models::InviteRequest,
), ValidationErrors>
{
              let b = InviteUserBodyValidator { body: &body };
              b.validate()?;

Ok((
    body,
))
}
/// InviteUser - POST /v1/organization/invites
#[tracing::instrument(skip_all)]
async fn invite_user<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
          Json(body): Json<models::InviteRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::invites::Invites<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    invite_user_validation(
          body,
    )
  ).await.unwrap();

  let Ok((
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().invite_user(
      
      &method,
      &host,
      &cookies,
        &claims,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::invites::InviteUserResponse::Status200_UserInvitedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn list_invites_validation(
  query_params: models::ListInvitesQueryParams,
) -> std::result::Result<(
  models::ListInvitesQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// ListInvites - GET /v1/organization/invites
#[tracing::instrument(skip_all)]
async fn list_invites<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::ListInvitesQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::invites::Invites<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    list_invites_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().list_invites(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::invites::ListInvitesResponse::Status200_InvitesListedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn retrieve_invite_validation(
  path_params: models::RetrieveInvitePathParams,
) -> std::result::Result<(
  models::RetrieveInvitePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// RetrieveInvite - GET /v1/organization/invites/{invite_id}
#[tracing::instrument(skip_all)]
async fn retrieve_invite<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::RetrieveInvitePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::invites::Invites<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    retrieve_invite_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().retrieve_invite(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::invites::RetrieveInviteResponse::Status200_InviteRetrievedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn delete_model_validation(
  path_params: models::DeleteModelPathParams,
) -> std::result::Result<(
  models::DeleteModelPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// DeleteModel - DELETE /v1/models/{model}
#[tracing::instrument(skip_all)]
async fn delete_model<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::DeleteModelPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::models::Models<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    delete_model_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().delete_model(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::models::DeleteModelResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn list_models_validation(
) -> std::result::Result<(
), ValidationErrors>
{

Ok((
))
}
/// ListModels - GET /v1/models
#[tracing::instrument(skip_all)]
async fn list_models<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::models::Models<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    list_models_validation(
    )
  ).await.unwrap();

  let Ok((
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().list_models(
      
      &method,
      &host,
      &cookies,
        &claims,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::models::ListModelsResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn retrieve_model_validation(
  path_params: models::RetrieveModelPathParams,
) -> std::result::Result<(
  models::RetrieveModelPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// RetrieveModel - GET /v1/models/{model}
#[tracing::instrument(skip_all)]
async fn retrieve_model<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::RetrieveModelPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::models::Models<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    retrieve_model_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().retrieve_model(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::models::RetrieveModelResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct CreateModerationBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::CreateModerationRequest,
    }


#[tracing::instrument(skip_all)]
fn create_moderation_validation(
        body: models::CreateModerationRequest,
) -> std::result::Result<(
        models::CreateModerationRequest,
), ValidationErrors>
{
              let b = CreateModerationBodyValidator { body: &body };
              b.validate()?;

Ok((
    body,
))
}
/// CreateModeration - POST /v1/moderations
#[tracing::instrument(skip_all)]
async fn create_moderation<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
          Json(body): Json<models::CreateModerationRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::moderations::Moderations<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    create_moderation_validation(
          body,
    )
  ).await.unwrap();

  let Ok((
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().create_moderation(
      
      &method,
      &host,
      &cookies,
        &claims,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::moderations::CreateModerationResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn archive_project_validation(
  path_params: models::ArchiveProjectPathParams,
) -> std::result::Result<(
  models::ArchiveProjectPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// ArchiveProject - POST /v1/organization/projects/{project_id}/archive
#[tracing::instrument(skip_all)]
async fn archive_project<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::ArchiveProjectPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::projects::Projects<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    archive_project_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().archive_project(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::projects::ArchiveProjectResponse::Status200_ProjectArchivedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct CreateProjectBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::ProjectCreateRequest,
    }


#[tracing::instrument(skip_all)]
fn create_project_validation(
        body: models::ProjectCreateRequest,
) -> std::result::Result<(
        models::ProjectCreateRequest,
), ValidationErrors>
{
              let b = CreateProjectBodyValidator { body: &body };
              b.validate()?;

Ok((
    body,
))
}
/// CreateProject - POST /v1/organization/projects
#[tracing::instrument(skip_all)]
async fn create_project<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
          Json(body): Json<models::ProjectCreateRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::projects::Projects<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    create_project_validation(
          body,
    )
  ).await.unwrap();

  let Ok((
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().create_project(
      
      &method,
      &host,
      &cookies,
        &claims,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::projects::CreateProjectResponse::Status200_ProjectCreatedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct CreateProjectServiceAccountBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::ProjectServiceAccountCreateRequest,
    }


#[tracing::instrument(skip_all)]
fn create_project_service_account_validation(
  path_params: models::CreateProjectServiceAccountPathParams,
        body: models::ProjectServiceAccountCreateRequest,
) -> std::result::Result<(
  models::CreateProjectServiceAccountPathParams,
        models::ProjectServiceAccountCreateRequest,
), ValidationErrors>
{
  path_params.validate()?;
              let b = CreateProjectServiceAccountBodyValidator { body: &body };
              b.validate()?;

Ok((
  path_params,
    body,
))
}
/// CreateProjectServiceAccount - POST /v1/organization/projects/{project_id}/service_accounts
#[tracing::instrument(skip_all)]
async fn create_project_service_account<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::CreateProjectServiceAccountPathParams>,
 State(api_impl): State<I>,
          Json(body): Json<models::ProjectServiceAccountCreateRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::projects::Projects<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    create_project_service_account_validation(
        path_params,
          body,
    )
  ).await.unwrap();

  let Ok((
    path_params,
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().create_project_service_account(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::projects::CreateProjectServiceAccountResponse::Status200_ProjectServiceAccountCreatedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                                apis::projects::CreateProjectServiceAccountResponse::Status400_ErrorResponseWhenProjectIsArchived
                                                    (body)
                                                => {
                                                  let mut response = response.status(400);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct CreateProjectUserBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::ProjectUserCreateRequest,
    }


#[tracing::instrument(skip_all)]
fn create_project_user_validation(
  path_params: models::CreateProjectUserPathParams,
        body: models::ProjectUserCreateRequest,
) -> std::result::Result<(
  models::CreateProjectUserPathParams,
        models::ProjectUserCreateRequest,
), ValidationErrors>
{
  path_params.validate()?;
              let b = CreateProjectUserBodyValidator { body: &body };
              b.validate()?;

Ok((
  path_params,
    body,
))
}
/// CreateProjectUser - POST /v1/organization/projects/{project_id}/users
#[tracing::instrument(skip_all)]
async fn create_project_user<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::CreateProjectUserPathParams>,
 State(api_impl): State<I>,
          Json(body): Json<models::ProjectUserCreateRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::projects::Projects<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    create_project_user_validation(
        path_params,
          body,
    )
  ).await.unwrap();

  let Ok((
    path_params,
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().create_project_user(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::projects::CreateProjectUserResponse::Status200_UserAddedToProjectSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                                apis::projects::CreateProjectUserResponse::Status400_ErrorResponseForVariousConditions
                                                    (body)
                                                => {
                                                  let mut response = response.status(400);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn delete_project_api_key_validation(
  path_params: models::DeleteProjectApiKeyPathParams,
) -> std::result::Result<(
  models::DeleteProjectApiKeyPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// DeleteProjectApiKey - DELETE /v1/organization/projects/{project_id}/api_keys/{key_id}
#[tracing::instrument(skip_all)]
async fn delete_project_api_key<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::DeleteProjectApiKeyPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::projects::Projects<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    delete_project_api_key_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().delete_project_api_key(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::projects::DeleteProjectApiKeyResponse::Status200_ProjectAPIKeyDeletedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                                apis::projects::DeleteProjectApiKeyResponse::Status400_ErrorResponseForVariousConditions
                                                    (body)
                                                => {
                                                  let mut response = response.status(400);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn delete_project_service_account_validation(
  path_params: models::DeleteProjectServiceAccountPathParams,
) -> std::result::Result<(
  models::DeleteProjectServiceAccountPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// DeleteProjectServiceAccount - DELETE /v1/organization/projects/{project_id}/service_accounts/{service_account_id}
#[tracing::instrument(skip_all)]
async fn delete_project_service_account<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::DeleteProjectServiceAccountPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::projects::Projects<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    delete_project_service_account_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().delete_project_service_account(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::projects::DeleteProjectServiceAccountResponse::Status200_ProjectServiceAccountDeletedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn delete_project_user_validation(
  path_params: models::DeleteProjectUserPathParams,
) -> std::result::Result<(
  models::DeleteProjectUserPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// DeleteProjectUser - DELETE /v1/organization/projects/{project_id}/users/{user_id}
#[tracing::instrument(skip_all)]
async fn delete_project_user<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::DeleteProjectUserPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::projects::Projects<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    delete_project_user_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().delete_project_user(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::projects::DeleteProjectUserResponse::Status200_ProjectUserDeletedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                                apis::projects::DeleteProjectUserResponse::Status400_ErrorResponseForVariousConditions
                                                    (body)
                                                => {
                                                  let mut response = response.status(400);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn list_project_api_keys_validation(
  path_params: models::ListProjectApiKeysPathParams,
  query_params: models::ListProjectApiKeysQueryParams,
) -> std::result::Result<(
  models::ListProjectApiKeysPathParams,
  models::ListProjectApiKeysQueryParams,
), ValidationErrors>
{
  path_params.validate()?;
  query_params.validate()?;

Ok((
  path_params,
  query_params,
))
}
/// ListProjectApiKeys - GET /v1/organization/projects/{project_id}/api_keys
#[tracing::instrument(skip_all)]
async fn list_project_api_keys<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::ListProjectApiKeysPathParams>,
  QueryExtra(query_params): QueryExtra<models::ListProjectApiKeysQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::projects::Projects<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    list_project_api_keys_validation(
        path_params,
        query_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().list_project_api_keys(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::projects::ListProjectApiKeysResponse::Status200_ProjectAPIKeysListedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn list_project_rate_limits_validation(
  path_params: models::ListProjectRateLimitsPathParams,
  query_params: models::ListProjectRateLimitsQueryParams,
) -> std::result::Result<(
  models::ListProjectRateLimitsPathParams,
  models::ListProjectRateLimitsQueryParams,
), ValidationErrors>
{
  path_params.validate()?;
  query_params.validate()?;

Ok((
  path_params,
  query_params,
))
}
/// ListProjectRateLimits - GET /v1/organization/projects/{project_id}/rate_limits
#[tracing::instrument(skip_all)]
async fn list_project_rate_limits<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::ListProjectRateLimitsPathParams>,
  QueryExtra(query_params): QueryExtra<models::ListProjectRateLimitsQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::projects::Projects<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    list_project_rate_limits_validation(
        path_params,
        query_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().list_project_rate_limits(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::projects::ListProjectRateLimitsResponse::Status200_ProjectRateLimitsListedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn list_project_service_accounts_validation(
  path_params: models::ListProjectServiceAccountsPathParams,
  query_params: models::ListProjectServiceAccountsQueryParams,
) -> std::result::Result<(
  models::ListProjectServiceAccountsPathParams,
  models::ListProjectServiceAccountsQueryParams,
), ValidationErrors>
{
  path_params.validate()?;
  query_params.validate()?;

Ok((
  path_params,
  query_params,
))
}
/// ListProjectServiceAccounts - GET /v1/organization/projects/{project_id}/service_accounts
#[tracing::instrument(skip_all)]
async fn list_project_service_accounts<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::ListProjectServiceAccountsPathParams>,
  QueryExtra(query_params): QueryExtra<models::ListProjectServiceAccountsQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::projects::Projects<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    list_project_service_accounts_validation(
        path_params,
        query_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().list_project_service_accounts(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::projects::ListProjectServiceAccountsResponse::Status200_ProjectServiceAccountsListedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                                apis::projects::ListProjectServiceAccountsResponse::Status400_ErrorResponseWhenProjectIsArchived
                                                    (body)
                                                => {
                                                  let mut response = response.status(400);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn list_project_users_validation(
  path_params: models::ListProjectUsersPathParams,
  query_params: models::ListProjectUsersQueryParams,
) -> std::result::Result<(
  models::ListProjectUsersPathParams,
  models::ListProjectUsersQueryParams,
), ValidationErrors>
{
  path_params.validate()?;
  query_params.validate()?;

Ok((
  path_params,
  query_params,
))
}
/// ListProjectUsers - GET /v1/organization/projects/{project_id}/users
#[tracing::instrument(skip_all)]
async fn list_project_users<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::ListProjectUsersPathParams>,
  QueryExtra(query_params): QueryExtra<models::ListProjectUsersQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::projects::Projects<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    list_project_users_validation(
        path_params,
        query_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().list_project_users(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::projects::ListProjectUsersResponse::Status200_ProjectUsersListedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                                apis::projects::ListProjectUsersResponse::Status400_ErrorResponseWhenProjectIsArchived
                                                    (body)
                                                => {
                                                  let mut response = response.status(400);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn list_projects_validation(
  query_params: models::ListProjectsQueryParams,
) -> std::result::Result<(
  models::ListProjectsQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// ListProjects - GET /v1/organization/projects
#[tracing::instrument(skip_all)]
async fn list_projects<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::ListProjectsQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::projects::Projects<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    list_projects_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().list_projects(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::projects::ListProjectsResponse::Status200_ProjectsListedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct ModifyProjectBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::ProjectUpdateRequest,
    }


#[tracing::instrument(skip_all)]
fn modify_project_validation(
  path_params: models::ModifyProjectPathParams,
        body: models::ProjectUpdateRequest,
) -> std::result::Result<(
  models::ModifyProjectPathParams,
        models::ProjectUpdateRequest,
), ValidationErrors>
{
  path_params.validate()?;
              let b = ModifyProjectBodyValidator { body: &body };
              b.validate()?;

Ok((
  path_params,
    body,
))
}
/// ModifyProject - POST /v1/organization/projects/{project_id}
#[tracing::instrument(skip_all)]
async fn modify_project<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::ModifyProjectPathParams>,
 State(api_impl): State<I>,
          Json(body): Json<models::ProjectUpdateRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::projects::Projects<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    modify_project_validation(
        path_params,
          body,
    )
  ).await.unwrap();

  let Ok((
    path_params,
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().modify_project(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::projects::ModifyProjectResponse::Status200_ProjectUpdatedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                                apis::projects::ModifyProjectResponse::Status400_ErrorResponseWhenUpdatingTheDefaultProject
                                                    (body)
                                                => {
                                                  let mut response = response.status(400);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct ModifyProjectUserBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::ProjectUserUpdateRequest,
    }


#[tracing::instrument(skip_all)]
fn modify_project_user_validation(
  path_params: models::ModifyProjectUserPathParams,
        body: models::ProjectUserUpdateRequest,
) -> std::result::Result<(
  models::ModifyProjectUserPathParams,
        models::ProjectUserUpdateRequest,
), ValidationErrors>
{
  path_params.validate()?;
              let b = ModifyProjectUserBodyValidator { body: &body };
              b.validate()?;

Ok((
  path_params,
    body,
))
}
/// ModifyProjectUser - POST /v1/organization/projects/{project_id}/users/{user_id}
#[tracing::instrument(skip_all)]
async fn modify_project_user<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::ModifyProjectUserPathParams>,
 State(api_impl): State<I>,
          Json(body): Json<models::ProjectUserUpdateRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::projects::Projects<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    modify_project_user_validation(
        path_params,
          body,
    )
  ).await.unwrap();

  let Ok((
    path_params,
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().modify_project_user(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::projects::ModifyProjectUserResponse::Status200_ProjectUser
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                                apis::projects::ModifyProjectUserResponse::Status400_ErrorResponseForVariousConditions
                                                    (body)
                                                => {
                                                  let mut response = response.status(400);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn retrieve_project_validation(
  path_params: models::RetrieveProjectPathParams,
) -> std::result::Result<(
  models::RetrieveProjectPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// RetrieveProject - GET /v1/organization/projects/{project_id}
#[tracing::instrument(skip_all)]
async fn retrieve_project<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::RetrieveProjectPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::projects::Projects<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    retrieve_project_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().retrieve_project(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::projects::RetrieveProjectResponse::Status200_ProjectRetrievedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn retrieve_project_api_key_validation(
  path_params: models::RetrieveProjectApiKeyPathParams,
) -> std::result::Result<(
  models::RetrieveProjectApiKeyPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// RetrieveProjectApiKey - GET /v1/organization/projects/{project_id}/api_keys/{key_id}
#[tracing::instrument(skip_all)]
async fn retrieve_project_api_key<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::RetrieveProjectApiKeyPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::projects::Projects<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    retrieve_project_api_key_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().retrieve_project_api_key(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::projects::RetrieveProjectApiKeyResponse::Status200_ProjectAPIKeyRetrievedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn retrieve_project_service_account_validation(
  path_params: models::RetrieveProjectServiceAccountPathParams,
) -> std::result::Result<(
  models::RetrieveProjectServiceAccountPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// RetrieveProjectServiceAccount - GET /v1/organization/projects/{project_id}/service_accounts/{service_account_id}
#[tracing::instrument(skip_all)]
async fn retrieve_project_service_account<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::RetrieveProjectServiceAccountPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::projects::Projects<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    retrieve_project_service_account_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().retrieve_project_service_account(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::projects::RetrieveProjectServiceAccountResponse::Status200_ProjectServiceAccountRetrievedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn retrieve_project_user_validation(
  path_params: models::RetrieveProjectUserPathParams,
) -> std::result::Result<(
  models::RetrieveProjectUserPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// RetrieveProjectUser - GET /v1/organization/projects/{project_id}/users/{user_id}
#[tracing::instrument(skip_all)]
async fn retrieve_project_user<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::RetrieveProjectUserPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::projects::Projects<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    retrieve_project_user_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().retrieve_project_user(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::projects::RetrieveProjectUserResponse::Status200_ProjectUserRetrievedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct UpdateProjectRateLimitsBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::ProjectRateLimitUpdateRequest,
    }


#[tracing::instrument(skip_all)]
fn update_project_rate_limits_validation(
  path_params: models::UpdateProjectRateLimitsPathParams,
        body: models::ProjectRateLimitUpdateRequest,
) -> std::result::Result<(
  models::UpdateProjectRateLimitsPathParams,
        models::ProjectRateLimitUpdateRequest,
), ValidationErrors>
{
  path_params.validate()?;
              let b = UpdateProjectRateLimitsBodyValidator { body: &body };
              b.validate()?;

Ok((
  path_params,
    body,
))
}
/// UpdateProjectRateLimits - POST /v1/organization/projects/{project_id}/rate_limits/{rate_limit_id}
#[tracing::instrument(skip_all)]
async fn update_project_rate_limits<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::UpdateProjectRateLimitsPathParams>,
 State(api_impl): State<I>,
          Json(body): Json<models::ProjectRateLimitUpdateRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::projects::Projects<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    update_project_rate_limits_validation(
        path_params,
          body,
    )
  ).await.unwrap();

  let Ok((
    path_params,
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().update_project_rate_limits(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::projects::UpdateProjectRateLimitsResponse::Status200_ProjectRateLimitUpdatedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                                apis::projects::UpdateProjectRateLimitsResponse::Status400_ErrorResponseForVariousConditions
                                                    (body)
                                                => {
                                                  let mut response = response.status(400);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct CreateRealtimeSessionBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::RealtimeSessionCreateRequest,
    }


#[tracing::instrument(skip_all)]
fn create_realtime_session_validation(
        body: models::RealtimeSessionCreateRequest,
) -> std::result::Result<(
        models::RealtimeSessionCreateRequest,
), ValidationErrors>
{
              let b = CreateRealtimeSessionBodyValidator { body: &body };
              b.validate()?;

Ok((
    body,
))
}
/// CreateRealtimeSession - POST /v1/realtime/sessions
#[tracing::instrument(skip_all)]
async fn create_realtime_session<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
          Json(body): Json<models::RealtimeSessionCreateRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::realtime::Realtime<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    create_realtime_session_validation(
          body,
    )
  ).await.unwrap();

  let Ok((
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().create_realtime_session(
      
      &method,
      &host,
      &cookies,
        &claims,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::realtime::CreateRealtimeSessionResponse::Status200_SessionCreatedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn add_upload_part_validation(
  path_params: models::AddUploadPartPathParams,
) -> std::result::Result<(
  models::AddUploadPartPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// AddUploadPart - POST /v1/uploads/{upload_id}/parts
#[tracing::instrument(skip_all)]
async fn add_upload_part<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::AddUploadPartPathParams>,
 State(api_impl): State<I>,
  body: Multipart,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::uploads::Uploads<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    add_upload_part_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().add_upload_part(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
          body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::uploads::AddUploadPartResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn cancel_upload_validation(
  path_params: models::CancelUploadPathParams,
) -> std::result::Result<(
  models::CancelUploadPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// CancelUpload - POST /v1/uploads/{upload_id}/cancel
#[tracing::instrument(skip_all)]
async fn cancel_upload<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::CancelUploadPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::uploads::Uploads<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    cancel_upload_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().cancel_upload(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::uploads::CancelUploadResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct CompleteUploadBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::CompleteUploadRequest,
    }


#[tracing::instrument(skip_all)]
fn complete_upload_validation(
  path_params: models::CompleteUploadPathParams,
        body: models::CompleteUploadRequest,
) -> std::result::Result<(
  models::CompleteUploadPathParams,
        models::CompleteUploadRequest,
), ValidationErrors>
{
  path_params.validate()?;
              let b = CompleteUploadBodyValidator { body: &body };
              b.validate()?;

Ok((
  path_params,
    body,
))
}
/// CompleteUpload - POST /v1/uploads/{upload_id}/complete
#[tracing::instrument(skip_all)]
async fn complete_upload<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::CompleteUploadPathParams>,
 State(api_impl): State<I>,
          Json(body): Json<models::CompleteUploadRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::uploads::Uploads<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    complete_upload_validation(
        path_params,
          body,
    )
  ).await.unwrap();

  let Ok((
    path_params,
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().complete_upload(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::uploads::CompleteUploadResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct CreateUploadBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::CreateUploadRequest,
    }


#[tracing::instrument(skip_all)]
fn create_upload_validation(
        body: models::CreateUploadRequest,
) -> std::result::Result<(
        models::CreateUploadRequest,
), ValidationErrors>
{
              let b = CreateUploadBodyValidator { body: &body };
              b.validate()?;

Ok((
    body,
))
}
/// CreateUpload - POST /v1/uploads
#[tracing::instrument(skip_all)]
async fn create_upload<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
          Json(body): Json<models::CreateUploadRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::uploads::Uploads<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    create_upload_validation(
          body,
    )
  ).await.unwrap();

  let Ok((
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().create_upload(
      
      &method,
      &host,
      &cookies,
        &claims,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::uploads::CreateUploadResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn usage_audio_speeches_validation(
  query_params: models::UsageAudioSpeechesQueryParams,
) -> std::result::Result<(
  models::UsageAudioSpeechesQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// UsageAudioSpeeches - GET /v1/organization/usage/audio_speeches
#[tracing::instrument(skip_all)]
async fn usage_audio_speeches<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::UsageAudioSpeechesQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::usage::Usage<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    usage_audio_speeches_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().usage_audio_speeches(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::usage::UsageAudioSpeechesResponse::Status200_UsageDataRetrievedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn usage_audio_transcriptions_validation(
  query_params: models::UsageAudioTranscriptionsQueryParams,
) -> std::result::Result<(
  models::UsageAudioTranscriptionsQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// UsageAudioTranscriptions - GET /v1/organization/usage/audio_transcriptions
#[tracing::instrument(skip_all)]
async fn usage_audio_transcriptions<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::UsageAudioTranscriptionsQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::usage::Usage<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    usage_audio_transcriptions_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().usage_audio_transcriptions(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::usage::UsageAudioTranscriptionsResponse::Status200_UsageDataRetrievedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn usage_code_interpreter_sessions_validation(
  query_params: models::UsageCodeInterpreterSessionsQueryParams,
) -> std::result::Result<(
  models::UsageCodeInterpreterSessionsQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// UsageCodeInterpreterSessions - GET /v1/organization/usage/code_interpreter_sessions
#[tracing::instrument(skip_all)]
async fn usage_code_interpreter_sessions<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::UsageCodeInterpreterSessionsQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::usage::Usage<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    usage_code_interpreter_sessions_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().usage_code_interpreter_sessions(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::usage::UsageCodeInterpreterSessionsResponse::Status200_UsageDataRetrievedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn usage_completions_validation(
  query_params: models::UsageCompletionsQueryParams,
) -> std::result::Result<(
  models::UsageCompletionsQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// UsageCompletions - GET /v1/organization/usage/completions
#[tracing::instrument(skip_all)]
async fn usage_completions<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::UsageCompletionsQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::usage::Usage<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    usage_completions_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().usage_completions(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::usage::UsageCompletionsResponse::Status200_UsageDataRetrievedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn usage_costs_validation(
  query_params: models::UsageCostsQueryParams,
) -> std::result::Result<(
  models::UsageCostsQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// UsageCosts - GET /v1/organization/costs
#[tracing::instrument(skip_all)]
async fn usage_costs<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::UsageCostsQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::usage::Usage<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    usage_costs_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().usage_costs(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::usage::UsageCostsResponse::Status200_CostsDataRetrievedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn usage_embeddings_validation(
  query_params: models::UsageEmbeddingsQueryParams,
) -> std::result::Result<(
  models::UsageEmbeddingsQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// UsageEmbeddings - GET /v1/organization/usage/embeddings
#[tracing::instrument(skip_all)]
async fn usage_embeddings<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::UsageEmbeddingsQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::usage::Usage<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    usage_embeddings_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().usage_embeddings(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::usage::UsageEmbeddingsResponse::Status200_UsageDataRetrievedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn usage_images_validation(
  query_params: models::UsageImagesQueryParams,
) -> std::result::Result<(
  models::UsageImagesQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// UsageImages - GET /v1/organization/usage/images
#[tracing::instrument(skip_all)]
async fn usage_images<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::UsageImagesQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::usage::Usage<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    usage_images_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().usage_images(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::usage::UsageImagesResponse::Status200_UsageDataRetrievedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn usage_moderations_validation(
  query_params: models::UsageModerationsQueryParams,
) -> std::result::Result<(
  models::UsageModerationsQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// UsageModerations - GET /v1/organization/usage/moderations
#[tracing::instrument(skip_all)]
async fn usage_moderations<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::UsageModerationsQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::usage::Usage<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    usage_moderations_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().usage_moderations(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::usage::UsageModerationsResponse::Status200_UsageDataRetrievedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn usage_vector_stores_validation(
  query_params: models::UsageVectorStoresQueryParams,
) -> std::result::Result<(
  models::UsageVectorStoresQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// UsageVectorStores - GET /v1/organization/usage/vector_stores
#[tracing::instrument(skip_all)]
async fn usage_vector_stores<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::UsageVectorStoresQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::usage::Usage<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    usage_vector_stores_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().usage_vector_stores(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::usage::UsageVectorStoresResponse::Status200_UsageDataRetrievedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn delete_user_validation(
  path_params: models::DeleteUserPathParams,
) -> std::result::Result<(
  models::DeleteUserPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// DeleteUser - DELETE /v1/organization/users/{user_id}
#[tracing::instrument(skip_all)]
async fn delete_user<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::DeleteUserPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::users::Users<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    delete_user_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().delete_user(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::users::DeleteUserResponse::Status200_UserDeletedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn list_users_validation(
  query_params: models::ListUsersQueryParams,
) -> std::result::Result<(
  models::ListUsersQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// ListUsers - GET /v1/organization/users
#[tracing::instrument(skip_all)]
async fn list_users<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::ListUsersQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::users::Users<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    list_users_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().list_users(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::users::ListUsersResponse::Status200_UsersListedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct ModifyUserBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::UserRoleUpdateRequest,
    }


#[tracing::instrument(skip_all)]
fn modify_user_validation(
  path_params: models::ModifyUserPathParams,
        body: models::UserRoleUpdateRequest,
) -> std::result::Result<(
  models::ModifyUserPathParams,
        models::UserRoleUpdateRequest,
), ValidationErrors>
{
  path_params.validate()?;
              let b = ModifyUserBodyValidator { body: &body };
              b.validate()?;

Ok((
  path_params,
    body,
))
}
/// ModifyUser - POST /v1/organization/users/{user_id}
#[tracing::instrument(skip_all)]
async fn modify_user<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::ModifyUserPathParams>,
 State(api_impl): State<I>,
          Json(body): Json<models::UserRoleUpdateRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::users::Users<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    modify_user_validation(
        path_params,
          body,
    )
  ).await.unwrap();

  let Ok((
    path_params,
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().modify_user(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::users::ModifyUserResponse::Status200_UserRoleUpdatedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn retrieve_user_validation(
  path_params: models::RetrieveUserPathParams,
) -> std::result::Result<(
  models::RetrieveUserPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// RetrieveUser - GET /v1/organization/users/{user_id}
#[tracing::instrument(skip_all)]
async fn retrieve_user<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::RetrieveUserPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::users::Users<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    retrieve_user_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().retrieve_user(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::users::RetrieveUserResponse::Status200_UserRetrievedSuccessfully
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn cancel_vector_store_file_batch_validation(
  path_params: models::CancelVectorStoreFileBatchPathParams,
) -> std::result::Result<(
  models::CancelVectorStoreFileBatchPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// CancelVectorStoreFileBatch - POST /v1/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel
#[tracing::instrument(skip_all)]
async fn cancel_vector_store_file_batch<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::CancelVectorStoreFileBatchPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::vector_stores::VectorStores<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    cancel_vector_store_file_batch_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().cancel_vector_store_file_batch(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::vector_stores::CancelVectorStoreFileBatchResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct CreateVectorStoreBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::CreateVectorStoreRequest,
    }


#[tracing::instrument(skip_all)]
fn create_vector_store_validation(
        body: models::CreateVectorStoreRequest,
) -> std::result::Result<(
        models::CreateVectorStoreRequest,
), ValidationErrors>
{
              let b = CreateVectorStoreBodyValidator { body: &body };
              b.validate()?;

Ok((
    body,
))
}
/// CreateVectorStore - POST /v1/vector_stores
#[tracing::instrument(skip_all)]
async fn create_vector_store<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
          Json(body): Json<models::CreateVectorStoreRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::vector_stores::VectorStores<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    create_vector_store_validation(
          body,
    )
  ).await.unwrap();

  let Ok((
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().create_vector_store(
      
      &method,
      &host,
      &cookies,
        &claims,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::vector_stores::CreateVectorStoreResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct CreateVectorStoreFileBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::CreateVectorStoreFileRequest,
    }


#[tracing::instrument(skip_all)]
fn create_vector_store_file_validation(
  path_params: models::CreateVectorStoreFilePathParams,
        body: models::CreateVectorStoreFileRequest,
) -> std::result::Result<(
  models::CreateVectorStoreFilePathParams,
        models::CreateVectorStoreFileRequest,
), ValidationErrors>
{
  path_params.validate()?;
              let b = CreateVectorStoreFileBodyValidator { body: &body };
              b.validate()?;

Ok((
  path_params,
    body,
))
}
/// CreateVectorStoreFile - POST /v1/vector_stores/{vector_store_id}/files
#[tracing::instrument(skip_all)]
async fn create_vector_store_file<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::CreateVectorStoreFilePathParams>,
 State(api_impl): State<I>,
          Json(body): Json<models::CreateVectorStoreFileRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::vector_stores::VectorStores<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    create_vector_store_file_validation(
        path_params,
          body,
    )
  ).await.unwrap();

  let Ok((
    path_params,
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().create_vector_store_file(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::vector_stores::CreateVectorStoreFileResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct CreateVectorStoreFileBatchBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::CreateVectorStoreFileBatchRequest,
    }


#[tracing::instrument(skip_all)]
fn create_vector_store_file_batch_validation(
  path_params: models::CreateVectorStoreFileBatchPathParams,
        body: models::CreateVectorStoreFileBatchRequest,
) -> std::result::Result<(
  models::CreateVectorStoreFileBatchPathParams,
        models::CreateVectorStoreFileBatchRequest,
), ValidationErrors>
{
  path_params.validate()?;
              let b = CreateVectorStoreFileBatchBodyValidator { body: &body };
              b.validate()?;

Ok((
  path_params,
    body,
))
}
/// CreateVectorStoreFileBatch - POST /v1/vector_stores/{vector_store_id}/file_batches
#[tracing::instrument(skip_all)]
async fn create_vector_store_file_batch<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::CreateVectorStoreFileBatchPathParams>,
 State(api_impl): State<I>,
          Json(body): Json<models::CreateVectorStoreFileBatchRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::vector_stores::VectorStores<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    create_vector_store_file_batch_validation(
        path_params,
          body,
    )
  ).await.unwrap();

  let Ok((
    path_params,
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().create_vector_store_file_batch(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::vector_stores::CreateVectorStoreFileBatchResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn delete_vector_store_validation(
  path_params: models::DeleteVectorStorePathParams,
) -> std::result::Result<(
  models::DeleteVectorStorePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// DeleteVectorStore - DELETE /v1/vector_stores/{vector_store_id}
#[tracing::instrument(skip_all)]
async fn delete_vector_store<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::DeleteVectorStorePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::vector_stores::VectorStores<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    delete_vector_store_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().delete_vector_store(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::vector_stores::DeleteVectorStoreResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn delete_vector_store_file_validation(
  path_params: models::DeleteVectorStoreFilePathParams,
) -> std::result::Result<(
  models::DeleteVectorStoreFilePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// DeleteVectorStoreFile - DELETE /v1/vector_stores/{vector_store_id}/files/{file_id}
#[tracing::instrument(skip_all)]
async fn delete_vector_store_file<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::DeleteVectorStoreFilePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::vector_stores::VectorStores<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    delete_vector_store_file_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().delete_vector_store_file(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::vector_stores::DeleteVectorStoreFileResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn get_vector_store_validation(
  path_params: models::GetVectorStorePathParams,
) -> std::result::Result<(
  models::GetVectorStorePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// GetVectorStore - GET /v1/vector_stores/{vector_store_id}
#[tracing::instrument(skip_all)]
async fn get_vector_store<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::GetVectorStorePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::vector_stores::VectorStores<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    get_vector_store_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().get_vector_store(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::vector_stores::GetVectorStoreResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn get_vector_store_file_validation(
  path_params: models::GetVectorStoreFilePathParams,
) -> std::result::Result<(
  models::GetVectorStoreFilePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// GetVectorStoreFile - GET /v1/vector_stores/{vector_store_id}/files/{file_id}
#[tracing::instrument(skip_all)]
async fn get_vector_store_file<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::GetVectorStoreFilePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::vector_stores::VectorStores<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    get_vector_store_file_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().get_vector_store_file(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::vector_stores::GetVectorStoreFileResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn get_vector_store_file_batch_validation(
  path_params: models::GetVectorStoreFileBatchPathParams,
) -> std::result::Result<(
  models::GetVectorStoreFileBatchPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// GetVectorStoreFileBatch - GET /v1/vector_stores/{vector_store_id}/file_batches/{batch_id}
#[tracing::instrument(skip_all)]
async fn get_vector_store_file_batch<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::GetVectorStoreFileBatchPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::vector_stores::VectorStores<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    get_vector_store_file_batch_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().get_vector_store_file_batch(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::vector_stores::GetVectorStoreFileBatchResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn list_files_in_vector_store_batch_validation(
  path_params: models::ListFilesInVectorStoreBatchPathParams,
  query_params: models::ListFilesInVectorStoreBatchQueryParams,
) -> std::result::Result<(
  models::ListFilesInVectorStoreBatchPathParams,
  models::ListFilesInVectorStoreBatchQueryParams,
), ValidationErrors>
{
  path_params.validate()?;
  query_params.validate()?;

Ok((
  path_params,
  query_params,
))
}
/// ListFilesInVectorStoreBatch - GET /v1/vector_stores/{vector_store_id}/file_batches/{batch_id}/files
#[tracing::instrument(skip_all)]
async fn list_files_in_vector_store_batch<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::ListFilesInVectorStoreBatchPathParams>,
  QueryExtra(query_params): QueryExtra<models::ListFilesInVectorStoreBatchQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::vector_stores::VectorStores<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    list_files_in_vector_store_batch_validation(
        path_params,
        query_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().list_files_in_vector_store_batch(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::vector_stores::ListFilesInVectorStoreBatchResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn list_vector_store_files_validation(
  path_params: models::ListVectorStoreFilesPathParams,
  query_params: models::ListVectorStoreFilesQueryParams,
) -> std::result::Result<(
  models::ListVectorStoreFilesPathParams,
  models::ListVectorStoreFilesQueryParams,
), ValidationErrors>
{
  path_params.validate()?;
  query_params.validate()?;

Ok((
  path_params,
  query_params,
))
}
/// ListVectorStoreFiles - GET /v1/vector_stores/{vector_store_id}/files
#[tracing::instrument(skip_all)]
async fn list_vector_store_files<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::ListVectorStoreFilesPathParams>,
  QueryExtra(query_params): QueryExtra<models::ListVectorStoreFilesQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::vector_stores::VectorStores<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    list_vector_store_files_validation(
        path_params,
        query_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().list_vector_store_files(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::vector_stores::ListVectorStoreFilesResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn list_vector_stores_validation(
  query_params: models::ListVectorStoresQueryParams,
) -> std::result::Result<(
  models::ListVectorStoresQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// ListVectorStores - GET /v1/vector_stores
#[tracing::instrument(skip_all)]
async fn list_vector_stores<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::ListVectorStoresQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::vector_stores::VectorStores<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    list_vector_stores_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().list_vector_stores(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::vector_stores::ListVectorStoresResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}

    #[derive(validator::Validate)]
    #[allow(dead_code)]
    struct ModifyVectorStoreBodyValidator<'a> {
          #[validate(nested)]
          body: &'a models::UpdateVectorStoreRequest,
    }


#[tracing::instrument(skip_all)]
fn modify_vector_store_validation(
  path_params: models::ModifyVectorStorePathParams,
        body: models::UpdateVectorStoreRequest,
) -> std::result::Result<(
  models::ModifyVectorStorePathParams,
        models::UpdateVectorStoreRequest,
), ValidationErrors>
{
  path_params.validate()?;
              let b = ModifyVectorStoreBodyValidator { body: &body };
              b.validate()?;

Ok((
  path_params,
    body,
))
}
/// ModifyVectorStore - POST /v1/vector_stores/{vector_store_id}
#[tracing::instrument(skip_all)]
async fn modify_vector_store<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::ModifyVectorStorePathParams>,
 State(api_impl): State<I>,
          Json(body): Json<models::UpdateVectorStoreRequest>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::vector_stores::VectorStores<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Bearer, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    modify_vector_store_validation(
        path_params,
          body,
    )
  ).await.unwrap();

  let Ok((
    path_params,
      body,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().modify_vector_store(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
              &body,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::vector_stores::ModifyVectorStoreResponse::Status200_OK
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[allow(dead_code)]
#[inline]
fn response_with_status_code_only(code: StatusCode) -> Result<Response, StatusCode> {
   Response::builder()
          .status(code)
          .body(Body::empty())
          .map_err(|_| code)
}
