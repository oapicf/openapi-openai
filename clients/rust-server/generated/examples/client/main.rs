#![allow(missing_docs, unused_variables, trivial_casts)]


#[allow(unused_imports)]
use futures::{future, Stream, stream};
#[allow(unused_imports)]
use openapi_client::{Api, ApiNoContext, Claims, Client, ContextWrapperExt, models,
                      CreateAssistantResponse,
                      CreateThreadResponse,
                      CreateThreadAndRunResponse,
                      ListAssistantsResponse,
                      CreateMessageResponse,
                      CreateRunResponse,
                      DeleteAssistantResponse,
                      DeleteThreadResponse,
                      GetAssistantResponse,
                      GetThreadResponse,
                      ListMessagesResponse,
                      ListRunsResponse,
                      ModifyAssistantResponse,
                      ModifyThreadResponse,
                      CancelRunResponse,
                      DeleteMessageResponse,
                      GetMessageResponse,
                      GetRunResponse,
                      ListRunStepsResponse,
                      ModifyMessageResponse,
                      ModifyRunResponse,
                      SubmitToolOuputsToRunResponse,
                      GetRunStepResponse,
                      CreateSpeechResponse,
                      CreateTranscriptionResponse,
                      CreateTranslationResponse,
                      ListAuditLogsResponse,
                      CreateBatchResponse,
                      ListBatchesResponse,
                      CancelBatchResponse,
                      RetrieveBatchResponse,
                      CreateChatCompletionResponse,
                      CreateCompletionResponse,
                      AdminApiKeysCreateResponse,
                      AdminApiKeysListResponse,
                      AdminApiKeysDeleteResponse,
                      AdminApiKeysGetResponse,
                      CreateEmbeddingResponse,
                      CreateFileResponse,
                      ListFilesResponse,
                      DeleteFileResponse,
                      DownloadFileResponse,
                      RetrieveFileResponse,
                      CreateFineTuningJobResponse,
                      ListPaginatedFineTuningJobsResponse,
                      CancelFineTuningJobResponse,
                      ListFineTuningEventsResponse,
                      ListFineTuningJobCheckpointsResponse,
                      RetrieveFineTuningJobResponse,
                      CreateImageResponse,
                      CreateImageEditResponse,
                      CreateImageVariationResponse,
                      InviteUserResponse,
                      ListInvitesResponse,
                      DeleteInviteResponse,
                      RetrieveInviteResponse,
                      ListModelsResponse,
                      DeleteModelResponse,
                      RetrieveModelResponse,
                      CreateModerationResponse,
                      CreateProjectResponse,
                      ListProjectsResponse,
                      ArchiveProjectResponse,
                      CreateProjectServiceAccountResponse,
                      CreateProjectUserResponse,
                      ListProjectApiKeysResponse,
                      ListProjectRateLimitsResponse,
                      ListProjectServiceAccountsResponse,
                      ListProjectUsersResponse,
                      ModifyProjectResponse,
                      RetrieveProjectResponse,
                      DeleteProjectApiKeyResponse,
                      DeleteProjectServiceAccountResponse,
                      DeleteProjectUserResponse,
                      ModifyProjectUserResponse,
                      RetrieveProjectApiKeyResponse,
                      RetrieveProjectServiceAccountResponse,
                      RetrieveProjectUserResponse,
                      UpdateProjectRateLimitsResponse,
                      CreateRealtimeSessionResponse,
                      CreateUploadResponse,
                      AddUploadPartResponse,
                      CancelUploadResponse,
                      CompleteUploadResponse,
                      UsageAudioSpeechesResponse,
                      UsageAudioTranscriptionsResponse,
                      UsageCodeInterpreterSessionsResponse,
                      UsageCompletionsResponse,
                      UsageCostsResponse,
                      UsageEmbeddingsResponse,
                      UsageImagesResponse,
                      UsageModerationsResponse,
                      UsageVectorStoresResponse,
                      ListUsersResponse,
                      DeleteUserResponse,
                      ModifyUserResponse,
                      RetrieveUserResponse,
                      CreateVectorStoreResponse,
                      ListVectorStoresResponse,
                      CreateVectorStoreFileResponse,
                      CreateVectorStoreFileBatchResponse,
                      DeleteVectorStoreResponse,
                      GetVectorStoreResponse,
                      ListVectorStoreFilesResponse,
                      ModifyVectorStoreResponse,
                      CancelVectorStoreFileBatchResponse,
                      DeleteVectorStoreFileResponse,
                      GetVectorStoreFileResponse,
                      GetVectorStoreFileBatchResponse,
                      ListFilesInVectorStoreBatchResponse,
                     };
use clap::{Command, Arg};

// NOTE: Set environment variable RUST_LOG to the name of the executable (or "cargo run") to activate console logging for all loglevels.
//     See https://docs.rs/env_logger/latest/env_logger/  for more details

#[allow(unused_imports)]
use log::info;

// swagger::Has may be unused if there are no examples
#[allow(unused_imports)]
use swagger::{AuthData, ContextBuilder, EmptyContext, Has, Push, XSpanIdString};

type ClientContext = swagger::make_context_ty!(ContextBuilder, EmptyContext, Option<AuthData>, XSpanIdString);

mod client_auth;
use client_auth::build_token;


// rt may be unused if there are no examples
#[allow(unused_mut)]
fn main() {
    env_logger::init();

    let matches = Command::new("client")
        .arg(Arg::new("operation")
            .help("Sets the operation to run")
            .value_parser([
                "CreateAssistant",
                "CreateThread",
                "CreateThreadAndRun",
                "ListAssistants",
                "CreateMessage",
                "CreateRun",
                "DeleteAssistant",
                "DeleteThread",
                "GetAssistant",
                "GetThread",
                "ListMessages",
                "ListRuns",
                "ModifyAssistant",
                "ModifyThread",
                "CancelRun",
                "DeleteMessage",
                "GetMessage",
                "GetRun",
                "ListRunSteps",
                "ModifyMessage",
                "ModifyRun",
                "SubmitToolOuputsToRun",
                "GetRunStep",
                "CreateSpeech",
                "CreateTranscription",
                "CreateTranslation",
                "ListAuditLogs",
                "CreateBatch",
                "ListBatches",
                "CancelBatch",
                "RetrieveBatch",
                "CreateChatCompletion",
                "CreateCompletion",
                "AdminApiKeysCreate",
                "AdminApiKeysList",
                "AdminApiKeysDelete",
                "AdminApiKeysGet",
                "CreateEmbedding",
                "CreateFile",
                "ListFiles",
                "DeleteFile",
                "DownloadFile",
                "RetrieveFile",
                "CreateFineTuningJob",
                "ListPaginatedFineTuningJobs",
                "CancelFineTuningJob",
                "ListFineTuningEvents",
                "ListFineTuningJobCheckpoints",
                "RetrieveFineTuningJob",
                "CreateImage",
                "CreateImageEdit",
                "CreateImageVariation",
                "InviteUser",
                "ListInvites",
                "DeleteInvite",
                "RetrieveInvite",
                "ListModels",
                "DeleteModel",
                "RetrieveModel",
                "CreateModeration",
                "CreateProject",
                "ListProjects",
                "ArchiveProject",
                "CreateProjectServiceAccount",
                "CreateProjectUser",
                "ListProjectApiKeys",
                "ListProjectRateLimits",
                "ListProjectServiceAccounts",
                "ListProjectUsers",
                "ModifyProject",
                "RetrieveProject",
                "DeleteProjectApiKey",
                "DeleteProjectServiceAccount",
                "DeleteProjectUser",
                "ModifyProjectUser",
                "RetrieveProjectApiKey",
                "RetrieveProjectServiceAccount",
                "RetrieveProjectUser",
                "UpdateProjectRateLimits",
                "CreateRealtimeSession",
                "CreateUpload",
                "AddUploadPart",
                "CancelUpload",
                "CompleteUpload",
                "UsageAudioSpeeches",
                "UsageAudioTranscriptions",
                "UsageCodeInterpreterSessions",
                "UsageCompletions",
                "UsageCosts",
                "UsageEmbeddings",
                "UsageImages",
                "UsageModerations",
                "UsageVectorStores",
                "ListUsers",
                "DeleteUser",
                "ModifyUser",
                "RetrieveUser",
                "CreateVectorStore",
                "ListVectorStores",
                "CreateVectorStoreFile",
                "CreateVectorStoreFileBatch",
                "DeleteVectorStore",
                "GetVectorStore",
                "ListVectorStoreFiles",
                "ModifyVectorStore",
                "CancelVectorStoreFileBatch",
                "DeleteVectorStoreFile",
                "GetVectorStoreFile",
                "GetVectorStoreFileBatch",
                "ListFilesInVectorStoreBatch",
            ])
            .required(true)
            .index(1))
        .arg(Arg::new("https")
            .long("https")
            .help("Whether to use HTTPS or not"))
        .arg(Arg::new("host")
            .long("host")
            .default_value("api.openai.com")
            .help("Hostname to contact"))
        .arg(Arg::new("port")
            .long("port")
            .default_value("8080")
            .help("Port to contact"))
        .get_matches();

    // Create Bearer-token with a fixed key (secret) for test purposes.
    // In a real (production) system this Bearer token should be obtained via an external Identity/Authentication-server
    // Ensure that you set the correct algorithm and encodingkey that matches what is used on the server side.
    // See https://github.com/Keats/jsonwebtoken for more information
    let auth_token = build_token(
            Claims {
                sub: "tester@acme.com".to_owned(),
                company: "ACME".to_owned(),
                iss: "my_identity_provider".to_owned(),
                // added a very long expiry time
                aud: "org.acme.Resource_Server".to_string(),
                exp: 10000000000,
                // In this example code all available Scopes are added, so the current Bearer Token gets fully authorization.
                scopes:
                  "".to_owned()
            },
            b"secret").unwrap();

    let auth_data = if !auth_token.is_empty() {
        Some(AuthData::Bearer(auth_token))
    } else {
        // No Bearer-token available, so return None
        None
    };

    let is_https = matches.contains_id("https");
    let base_url = format!("{}://{}:{}",
        if is_https { "https" } else { "http" },
        matches.get_one::<String>("host").unwrap(),
        matches.get_one::<u16>("port").unwrap());

    let context: ClientContext =
        swagger::make_context!(ContextBuilder, EmptyContext, auth_data, XSpanIdString::default());

    let mut client : Box<dyn ApiNoContext<ClientContext>> = if is_https {
        // Using Simple HTTPS
        let client = Box::new(Client::try_new_https(&base_url)
            .expect("Failed to create HTTPS client"));
        Box::new(client.with_context(context))
    } else {
        // Using HTTP
        let client = Box::new(Client::try_new_http(
            &base_url)
            .expect("Failed to create HTTP client"));
        Box::new(client.with_context(context))
    };

    let mut rt = tokio::runtime::Runtime::new().unwrap();

    match matches.get_one::<String>("operation").map(String::as_str) {
        /* Disabled because there's no example.
        Some("CreateAssistant") => {
            let result = rt.block_on(client.create_assistant(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("CreateThread") => {
            let result = rt.block_on(client.create_thread(
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("CreateThreadAndRun") => {
            let result = rt.block_on(client.create_thread_and_run(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("ListAssistants") => {
            let result = rt.block_on(client.list_assistants(
                  Some(56),
                  Some(models::ListAssistantsOrderParameter::Asc),
                  Some("after_example".to_string()),
                  Some("before_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("CreateMessage") => {
            let result = rt.block_on(client.create_message(
                  "thread_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("CreateRun") => {
            let result = rt.block_on(client.create_run(
                  "thread_id_example".to_string(),
                  ???,
                  Some(&Vec::new())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("DeleteAssistant") => {
            let result = rt.block_on(client.delete_assistant(
                  "assistant_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteThread") => {
            let result = rt.block_on(client.delete_thread(
                  "thread_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetAssistant") => {
            let result = rt.block_on(client.get_assistant(
                  "assistant_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetThread") => {
            let result = rt.block_on(client.get_thread(
                  "thread_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListMessages") => {
            let result = rt.block_on(client.list_messages(
                  "thread_id_example".to_string(),
                  Some(56),
                  Some(models::ListAssistantsOrderParameter::Asc),
                  Some("after_example".to_string()),
                  Some("before_example".to_string()),
                  Some("run_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListRuns") => {
            let result = rt.block_on(client.list_runs(
                  "thread_id_example".to_string(),
                  Some(56),
                  Some(models::ListAssistantsOrderParameter::Asc),
                  Some("after_example".to_string()),
                  Some("before_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("ModifyAssistant") => {
            let result = rt.block_on(client.modify_assistant(
                  "assistant_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("ModifyThread") => {
            let result = rt.block_on(client.modify_thread(
                  "thread_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("CancelRun") => {
            let result = rt.block_on(client.cancel_run(
                  "thread_id_example".to_string(),
                  "run_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteMessage") => {
            let result = rt.block_on(client.delete_message(
                  "thread_id_example".to_string(),
                  "message_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetMessage") => {
            let result = rt.block_on(client.get_message(
                  "thread_id_example".to_string(),
                  "message_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetRun") => {
            let result = rt.block_on(client.get_run(
                  "thread_id_example".to_string(),
                  "run_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListRunSteps") => {
            let result = rt.block_on(client.list_run_steps(
                  "thread_id_example".to_string(),
                  "run_id_example".to_string(),
                  Some(56),
                  Some(models::ListAssistantsOrderParameter::Asc),
                  Some("after_example".to_string()),
                  Some("before_example".to_string()),
                  Some(&Vec::new())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("ModifyMessage") => {
            let result = rt.block_on(client.modify_message(
                  "thread_id_example".to_string(),
                  "message_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("ModifyRun") => {
            let result = rt.block_on(client.modify_run(
                  "thread_id_example".to_string(),
                  "run_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("SubmitToolOuputsToRun") => {
            let result = rt.block_on(client.submit_tool_ouputs_to_run(
                  "thread_id_example".to_string(),
                  "run_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("GetRunStep") => {
            let result = rt.block_on(client.get_run_step(
                  "thread_id_example".to_string(),
                  "run_id_example".to_string(),
                  "step_id_example".to_string(),
                  Some(&Vec::new())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("CreateSpeech") => {
            let result = rt.block_on(client.create_speech(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("CreateTranscription") => {
            let result = rt.block_on(client.create_transcription(
                  swagger::ByteArray(Vec::from("BINARY_DATA_HERE")),
                  ???,
                  Some("language_example".to_string()),
                  Some("prompt_example".to_string()),
                  Some(models::AudioResponseFormat::Json),
                  Some(8.14),
                  Some(&Vec::new())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("CreateTranslation") => {
            let result = rt.block_on(client.create_translation(
                  swagger::ByteArray(Vec::from("BINARY_DATA_HERE")),
                  ???,
                  Some("prompt_example".to_string()),
                  Some(models::AudioResponseFormat::Json),
                  Some(8.14)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("ListAuditLogs") => {
            let result = rt.block_on(client.list_audit_logs(
                  None,
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(56),
                  Some("after_example".to_string()),
                  Some("before_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("CreateBatch") => {
            let result = rt.block_on(client.create_batch(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("ListBatches") => {
            let result = rt.block_on(client.list_batches(
                  Some("after_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CancelBatch") => {
            let result = rt.block_on(client.cancel_batch(
                  "batch_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RetrieveBatch") => {
            let result = rt.block_on(client.retrieve_batch(
                  "batch_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("CreateChatCompletion") => {
            let result = rt.block_on(client.create_chat_completion(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("CreateCompletion") => {
            let result = rt.block_on(client.create_completion(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("AdminApiKeysCreate") => {
            let result = rt.block_on(client.admin_api_keys_create(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("AdminApiKeysList") => {
            let result = rt.block_on(client.admin_api_keys_list(
                  Some("after_example".to_string()),
                  Some(models::AdminApiKeysListOrderParameter::Asc),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AdminApiKeysDelete") => {
            let result = rt.block_on(client.admin_api_keys_delete(
                  "key_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AdminApiKeysGet") => {
            let result = rt.block_on(client.admin_api_keys_get(
                  "key_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("CreateEmbedding") => {
            let result = rt.block_on(client.create_embedding(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("CreateFile") => {
            let result = rt.block_on(client.create_file(
                  swagger::ByteArray(Vec::from("BINARY_DATA_HERE")),
                  models::CreateFileRequestPurpose::Assistants
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListFiles") => {
            let result = rt.block_on(client.list_files(
                  Some("purpose_example".to_string()),
                  Some(56),
                  Some(models::ListAssistantsOrderParameter::Asc),
                  Some("after_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteFile") => {
            let result = rt.block_on(client.delete_file(
                  "file_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DownloadFile") => {
            let result = rt.block_on(client.download_file(
                  "file_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RetrieveFile") => {
            let result = rt.block_on(client.retrieve_file(
                  "file_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("CreateFineTuningJob") => {
            let result = rt.block_on(client.create_fine_tuning_job(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("ListPaginatedFineTuningJobs") => {
            let result = rt.block_on(client.list_paginated_fine_tuning_jobs(
                  Some("after_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CancelFineTuningJob") => {
            let result = rt.block_on(client.cancel_fine_tuning_job(
                  "ft-AF1WoRqd3aJAHsqc9NY7iL8F".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListFineTuningEvents") => {
            let result = rt.block_on(client.list_fine_tuning_events(
                  "ft-AF1WoRqd3aJAHsqc9NY7iL8F".to_string(),
                  Some("after_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListFineTuningJobCheckpoints") => {
            let result = rt.block_on(client.list_fine_tuning_job_checkpoints(
                  "ft-AF1WoRqd3aJAHsqc9NY7iL8F".to_string(),
                  Some("after_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RetrieveFineTuningJob") => {
            let result = rt.block_on(client.retrieve_fine_tuning_job(
                  "ft-AF1WoRqd3aJAHsqc9NY7iL8F".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("CreateImage") => {
            let result = rt.block_on(client.create_image(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("CreateImageEdit") => {
            let result = rt.block_on(client.create_image_edit(
                  swagger::ByteArray(Vec::from("BINARY_DATA_HERE")),
                  "prompt_example".to_string(),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  None,
                  Some(56),
                  Some(swagger::Nullable<models::CreateImageEditRequestSize>::Variant256x256),
                  Some(swagger::Nullable<models::CreateImageEditRequestResponseFormat>::Url),
                  Some("user_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateImageVariation") => {
            let result = rt.block_on(client.create_image_variation(
                  swagger::ByteArray(Vec::from("BINARY_DATA_HERE")),
                  None,
                  Some(56),
                  Some(swagger::Nullable<models::CreateImageEditRequestResponseFormat>::Url),
                  Some(swagger::Nullable<models::CreateImageEditRequestSize>::Variant256x256),
                  Some("user_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("InviteUser") => {
            let result = rt.block_on(client.invite_user(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("ListInvites") => {
            let result = rt.block_on(client.list_invites(
                  Some(56),
                  Some("after_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteInvite") => {
            let result = rt.block_on(client.delete_invite(
                  "invite_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RetrieveInvite") => {
            let result = rt.block_on(client.retrieve_invite(
                  "invite_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListModels") => {
            let result = rt.block_on(client.list_models(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteModel") => {
            let result = rt.block_on(client.delete_model(
                  "ft:gpt-4o-mini:acemeco:suffix:abc123".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RetrieveModel") => {
            let result = rt.block_on(client.retrieve_model(
                  "gpt-4o-mini".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("CreateModeration") => {
            let result = rt.block_on(client.create_moderation(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("CreateProject") => {
            let result = rt.block_on(client.create_project(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("ListProjects") => {
            let result = rt.block_on(client.list_projects(
                  Some(56),
                  Some("after_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ArchiveProject") => {
            let result = rt.block_on(client.archive_project(
                  "project_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("CreateProjectServiceAccount") => {
            let result = rt.block_on(client.create_project_service_account(
                  "project_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("CreateProjectUser") => {
            let result = rt.block_on(client.create_project_user(
                  "project_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("ListProjectApiKeys") => {
            let result = rt.block_on(client.list_project_api_keys(
                  "project_id_example".to_string(),
                  Some(56),
                  Some("after_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListProjectRateLimits") => {
            let result = rt.block_on(client.list_project_rate_limits(
                  "project_id_example".to_string(),
                  Some(56),
                  Some("after_example".to_string()),
                  Some("before_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListProjectServiceAccounts") => {
            let result = rt.block_on(client.list_project_service_accounts(
                  "project_id_example".to_string(),
                  Some(56),
                  Some("after_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListProjectUsers") => {
            let result = rt.block_on(client.list_project_users(
                  "project_id_example".to_string(),
                  Some(56),
                  Some("after_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("ModifyProject") => {
            let result = rt.block_on(client.modify_project(
                  "project_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("RetrieveProject") => {
            let result = rt.block_on(client.retrieve_project(
                  "project_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteProjectApiKey") => {
            let result = rt.block_on(client.delete_project_api_key(
                  "project_id_example".to_string(),
                  "key_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteProjectServiceAccount") => {
            let result = rt.block_on(client.delete_project_service_account(
                  "project_id_example".to_string(),
                  "service_account_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteProjectUser") => {
            let result = rt.block_on(client.delete_project_user(
                  "project_id_example".to_string(),
                  "user_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("ModifyProjectUser") => {
            let result = rt.block_on(client.modify_project_user(
                  "project_id_example".to_string(),
                  "user_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("RetrieveProjectApiKey") => {
            let result = rt.block_on(client.retrieve_project_api_key(
                  "project_id_example".to_string(),
                  "key_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RetrieveProjectServiceAccount") => {
            let result = rt.block_on(client.retrieve_project_service_account(
                  "project_id_example".to_string(),
                  "service_account_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RetrieveProjectUser") => {
            let result = rt.block_on(client.retrieve_project_user(
                  "project_id_example".to_string(),
                  "user_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("UpdateProjectRateLimits") => {
            let result = rt.block_on(client.update_project_rate_limits(
                  "project_id_example".to_string(),
                  "rate_limit_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("CreateRealtimeSession") => {
            let result = rt.block_on(client.create_realtime_session(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("CreateUpload") => {
            let result = rt.block_on(client.create_upload(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("AddUploadPart") => {
            let result = rt.block_on(client.add_upload_part(
                  "upload_abc123".to_string(),
                  swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CancelUpload") => {
            let result = rt.block_on(client.cancel_upload(
                  "upload_abc123".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("CompleteUpload") => {
            let result = rt.block_on(client.complete_upload(
                  "upload_abc123".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("UsageAudioSpeeches") => {
            let result = rt.block_on(client.usage_audio_speeches(
                  56,
                  Some(56),
                  Some(models::UsageAudioSpeechesBucketWidthParameter::Variant1m),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(56),
                  Some("page_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UsageAudioTranscriptions") => {
            let result = rt.block_on(client.usage_audio_transcriptions(
                  56,
                  Some(56),
                  Some(models::UsageAudioSpeechesBucketWidthParameter::Variant1m),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(56),
                  Some("page_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UsageCodeInterpreterSessions") => {
            let result = rt.block_on(client.usage_code_interpreter_sessions(
                  56,
                  Some(56),
                  Some(models::UsageAudioSpeechesBucketWidthParameter::Variant1m),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(56),
                  Some("page_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UsageCompletions") => {
            let result = rt.block_on(client.usage_completions(
                  56,
                  Some(56),
                  Some(models::UsageAudioSpeechesBucketWidthParameter::Variant1m),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(true),
                  Some(&Vec::new()),
                  Some(56),
                  Some("page_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UsageCosts") => {
            let result = rt.block_on(client.usage_costs(
                  56,
                  Some(56),
                  Some(models::UsageCostsBucketWidthParameter::Variant1d),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(56),
                  Some("page_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UsageEmbeddings") => {
            let result = rt.block_on(client.usage_embeddings(
                  56,
                  Some(56),
                  Some(models::UsageAudioSpeechesBucketWidthParameter::Variant1m),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(56),
                  Some("page_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UsageImages") => {
            let result = rt.block_on(client.usage_images(
                  56,
                  Some(56),
                  Some(models::UsageAudioSpeechesBucketWidthParameter::Variant1m),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(56),
                  Some("page_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UsageModerations") => {
            let result = rt.block_on(client.usage_moderations(
                  56,
                  Some(56),
                  Some(models::UsageAudioSpeechesBucketWidthParameter::Variant1m),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(56),
                  Some("page_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UsageVectorStores") => {
            let result = rt.block_on(client.usage_vector_stores(
                  56,
                  Some(56),
                  Some(models::UsageAudioSpeechesBucketWidthParameter::Variant1m),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(56),
                  Some("page_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListUsers") => {
            let result = rt.block_on(client.list_users(
                  Some(56),
                  Some("after_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteUser") => {
            let result = rt.block_on(client.delete_user(
                  "user_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("ModifyUser") => {
            let result = rt.block_on(client.modify_user(
                  "user_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("RetrieveUser") => {
            let result = rt.block_on(client.retrieve_user(
                  "user_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("CreateVectorStore") => {
            let result = rt.block_on(client.create_vector_store(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("ListVectorStores") => {
            let result = rt.block_on(client.list_vector_stores(
                  Some(56),
                  Some(models::ListAssistantsOrderParameter::Asc),
                  Some("after_example".to_string()),
                  Some("before_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("CreateVectorStoreFile") => {
            let result = rt.block_on(client.create_vector_store_file(
                  "vs_abc123".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("CreateVectorStoreFileBatch") => {
            let result = rt.block_on(client.create_vector_store_file_batch(
                  "vs_abc123".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("DeleteVectorStore") => {
            let result = rt.block_on(client.delete_vector_store(
                  "vector_store_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetVectorStore") => {
            let result = rt.block_on(client.get_vector_store(
                  "vector_store_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListVectorStoreFiles") => {
            let result = rt.block_on(client.list_vector_store_files(
                  "vector_store_id_example".to_string(),
                  Some(56),
                  Some(models::ListAssistantsOrderParameter::Asc),
                  Some("after_example".to_string()),
                  Some("before_example".to_string()),
                  Some(models::ListFilesInVectorStoreBatchFilterParameter::InProgress)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("ModifyVectorStore") => {
            let result = rt.block_on(client.modify_vector_store(
                  "vector_store_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("CancelVectorStoreFileBatch") => {
            let result = rt.block_on(client.cancel_vector_store_file_batch(
                  "vector_store_id_example".to_string(),
                  "batch_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteVectorStoreFile") => {
            let result = rt.block_on(client.delete_vector_store_file(
                  "vector_store_id_example".to_string(),
                  "file_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetVectorStoreFile") => {
            let result = rt.block_on(client.get_vector_store_file(
                  "vs_abc123".to_string(),
                  "file-abc123".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetVectorStoreFileBatch") => {
            let result = rt.block_on(client.get_vector_store_file_batch(
                  "vs_abc123".to_string(),
                  "vsfb_abc123".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListFilesInVectorStoreBatch") => {
            let result = rt.block_on(client.list_files_in_vector_store_batch(
                  "vector_store_id_example".to_string(),
                  "batch_id_example".to_string(),
                  Some(56),
                  Some(models::ListAssistantsOrderParameter::Asc),
                  Some("after_example".to_string()),
                  Some("before_example".to_string()),
                  Some(models::ListFilesInVectorStoreBatchFilterParameter::InProgress)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        _ => {
            panic!("Invalid operation provided")
        }
    }
}
