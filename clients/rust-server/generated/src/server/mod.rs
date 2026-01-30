use bytes::Bytes;
use futures::{future, future::BoxFuture, Stream, stream, future::FutureExt, stream::TryStreamExt};
use http_body_util::{combinators::BoxBody, Full};
use hyper::{body::{Body, Incoming}, HeaderMap, Request, Response, StatusCode};
use hyper::header::{HeaderName, HeaderValue, CONTENT_TYPE};
use log::warn;
#[cfg(feature = "validate")]
use serde_valid::Validate;
#[allow(unused_imports)]
use std::convert::{TryFrom, TryInto};
use std::{convert::Infallible, error::Error};
use std::future::Future;
use std::marker::PhantomData;
use std::task::{Context, Poll};
use swagger::{ApiError, BodyExt, Has, RequestParser, XSpanIdString};
pub use swagger::auth::Authorization;
use swagger::auth::Scopes;
use url::form_urlencoded;
use multipart::server::Multipart;
use multipart::server::save::{PartialReason, SaveResult};

#[allow(unused_imports)]
use crate::{models, header, AuthenticationApi};

pub use crate::context;

type ServiceFuture = BoxFuture<'static, Result<Response<BoxBody<Bytes, Infallible>>, crate::ServiceError>>;

use crate::{Api,
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
     ListFilesInVectorStoreBatchResponse
};

mod server_auth;

mod paths {
    use lazy_static::lazy_static;

    lazy_static! {
        pub static ref GLOBAL_REGEX_SET: regex::RegexSet = regex::RegexSet::new(vec![
            r"^/v1/assistants$",
            r"^/v1/assistants/(?P<assistant_id>[^/?#]*)$",
            r"^/v1/audio/speech$",
            r"^/v1/audio/transcriptions$",
            r"^/v1/audio/translations$",
            r"^/v1/batches$",
            r"^/v1/batches/(?P<batch_id>[^/?#]*)$",
            r"^/v1/batches/(?P<batch_id>[^/?#]*)/cancel$",
            r"^/v1/chat/completions$",
            r"^/v1/completions$",
            r"^/v1/embeddings$",
            r"^/v1/files$",
            r"^/v1/files/(?P<file_id>[^/?#]*)$",
            r"^/v1/files/(?P<file_id>[^/?#]*)/content$",
            r"^/v1/fine_tuning/jobs$",
            r"^/v1/fine_tuning/jobs/(?P<fine_tuning_job_id>[^/?#]*)$",
            r"^/v1/fine_tuning/jobs/(?P<fine_tuning_job_id>[^/?#]*)/cancel$",
            r"^/v1/fine_tuning/jobs/(?P<fine_tuning_job_id>[^/?#]*)/checkpoints$",
            r"^/v1/fine_tuning/jobs/(?P<fine_tuning_job_id>[^/?#]*)/events$",
            r"^/v1/images/edits$",
            r"^/v1/images/generations$",
            r"^/v1/images/variations$",
            r"^/v1/models$",
            r"^/v1/models/(?P<model>[^/?#]*)$",
            r"^/v1/moderations$",
            r"^/v1/organization/admin_api_keys$",
            r"^/v1/organization/admin_api_keys/(?P<key_id>[^/?#]*)$",
            r"^/v1/organization/audit_logs$",
            r"^/v1/organization/costs$",
            r"^/v1/organization/invites$",
            r"^/v1/organization/invites/(?P<invite_id>[^/?#]*)$",
            r"^/v1/organization/projects$",
            r"^/v1/organization/projects/(?P<project_id>[^/?#]*)$",
            r"^/v1/organization/projects/(?P<project_id>[^/?#]*)/api_keys$",
            r"^/v1/organization/projects/(?P<project_id>[^/?#]*)/api_keys/(?P<key_id>[^/?#]*)$",
            r"^/v1/organization/projects/(?P<project_id>[^/?#]*)/archive$",
            r"^/v1/organization/projects/(?P<project_id>[^/?#]*)/rate_limits$",
            r"^/v1/organization/projects/(?P<project_id>[^/?#]*)/rate_limits/(?P<rate_limit_id>[^/?#]*)$",
            r"^/v1/organization/projects/(?P<project_id>[^/?#]*)/service_accounts$",
            r"^/v1/organization/projects/(?P<project_id>[^/?#]*)/service_accounts/(?P<service_account_id>[^/?#]*)$",
            r"^/v1/organization/projects/(?P<project_id>[^/?#]*)/users$",
            r"^/v1/organization/projects/(?P<project_id>[^/?#]*)/users/(?P<user_id>[^/?#]*)$",
            r"^/v1/organization/usage/audio_speeches$",
            r"^/v1/organization/usage/audio_transcriptions$",
            r"^/v1/organization/usage/code_interpreter_sessions$",
            r"^/v1/organization/usage/completions$",
            r"^/v1/organization/usage/embeddings$",
            r"^/v1/organization/usage/images$",
            r"^/v1/organization/usage/moderations$",
            r"^/v1/organization/usage/vector_stores$",
            r"^/v1/organization/users$",
            r"^/v1/organization/users/(?P<user_id>[^/?#]*)$",
            r"^/v1/realtime/sessions$",
            r"^/v1/threads$",
            r"^/v1/threads/runs$",
            r"^/v1/threads/(?P<thread_id>[^/?#]*)$",
            r"^/v1/threads/(?P<thread_id>[^/?#]*)/messages$",
            r"^/v1/threads/(?P<thread_id>[^/?#]*)/messages/(?P<message_id>[^/?#]*)$",
            r"^/v1/threads/(?P<thread_id>[^/?#]*)/runs$",
            r"^/v1/threads/(?P<thread_id>[^/?#]*)/runs/(?P<run_id>[^/?#]*)$",
            r"^/v1/threads/(?P<thread_id>[^/?#]*)/runs/(?P<run_id>[^/?#]*)/cancel$",
            r"^/v1/threads/(?P<thread_id>[^/?#]*)/runs/(?P<run_id>[^/?#]*)/steps$",
            r"^/v1/threads/(?P<thread_id>[^/?#]*)/runs/(?P<run_id>[^/?#]*)/steps/(?P<step_id>[^/?#]*)$",
            r"^/v1/threads/(?P<thread_id>[^/?#]*)/runs/(?P<run_id>[^/?#]*)/submit_tool_outputs$",
            r"^/v1/uploads$",
            r"^/v1/uploads/(?P<upload_id>[^/?#]*)/cancel$",
            r"^/v1/uploads/(?P<upload_id>[^/?#]*)/complete$",
            r"^/v1/uploads/(?P<upload_id>[^/?#]*)/parts$",
            r"^/v1/vector_stores$",
            r"^/v1/vector_stores/(?P<vector_store_id>[^/?#]*)$",
            r"^/v1/vector_stores/(?P<vector_store_id>[^/?#]*)/file_batches$",
            r"^/v1/vector_stores/(?P<vector_store_id>[^/?#]*)/file_batches/(?P<batch_id>[^/?#]*)$",
            r"^/v1/vector_stores/(?P<vector_store_id>[^/?#]*)/file_batches/(?P<batch_id>[^/?#]*)/cancel$",
            r"^/v1/vector_stores/(?P<vector_store_id>[^/?#]*)/file_batches/(?P<batch_id>[^/?#]*)/files$",
            r"^/v1/vector_stores/(?P<vector_store_id>[^/?#]*)/files$",
            r"^/v1/vector_stores/(?P<vector_store_id>[^/?#]*)/files/(?P<file_id>[^/?#]*)$"
        ])
        .expect("Unable to create global regex set");
    }
    pub(crate) static ID_ASSISTANTS: usize = 0;
    pub(crate) static ID_ASSISTANTS_ASSISTANT_ID: usize = 1;
    lazy_static! {
        pub static ref REGEX_ASSISTANTS_ASSISTANT_ID: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/assistants/(?P<assistant_id>[^/?#]*)$")
                .expect("Unable to create regex for ASSISTANTS_ASSISTANT_ID");
    }
    pub(crate) static ID_AUDIO_SPEECH: usize = 2;
    pub(crate) static ID_AUDIO_TRANSCRIPTIONS: usize = 3;
    pub(crate) static ID_AUDIO_TRANSLATIONS: usize = 4;
    pub(crate) static ID_BATCHES: usize = 5;
    pub(crate) static ID_BATCHES_BATCH_ID: usize = 6;
    lazy_static! {
        pub static ref REGEX_BATCHES_BATCH_ID: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/batches/(?P<batch_id>[^/?#]*)$")
                .expect("Unable to create regex for BATCHES_BATCH_ID");
    }
    pub(crate) static ID_BATCHES_BATCH_ID_CANCEL: usize = 7;
    lazy_static! {
        pub static ref REGEX_BATCHES_BATCH_ID_CANCEL: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/batches/(?P<batch_id>[^/?#]*)/cancel$")
                .expect("Unable to create regex for BATCHES_BATCH_ID_CANCEL");
    }
    pub(crate) static ID_CHAT_COMPLETIONS: usize = 8;
    pub(crate) static ID_COMPLETIONS: usize = 9;
    pub(crate) static ID_EMBEDDINGS: usize = 10;
    pub(crate) static ID_FILES: usize = 11;
    pub(crate) static ID_FILES_FILE_ID: usize = 12;
    lazy_static! {
        pub static ref REGEX_FILES_FILE_ID: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/files/(?P<file_id>[^/?#]*)$")
                .expect("Unable to create regex for FILES_FILE_ID");
    }
    pub(crate) static ID_FILES_FILE_ID_CONTENT: usize = 13;
    lazy_static! {
        pub static ref REGEX_FILES_FILE_ID_CONTENT: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/files/(?P<file_id>[^/?#]*)/content$")
                .expect("Unable to create regex for FILES_FILE_ID_CONTENT");
    }
    pub(crate) static ID_FINE_TUNING_JOBS: usize = 14;
    pub(crate) static ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID: usize = 15;
    lazy_static! {
        pub static ref REGEX_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/fine_tuning/jobs/(?P<fine_tuning_job_id>[^/?#]*)$")
                .expect("Unable to create regex for FINE_TUNING_JOBS_FINE_TUNING_JOB_ID");
    }
    pub(crate) static ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CANCEL: usize = 16;
    lazy_static! {
        pub static ref REGEX_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CANCEL: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/fine_tuning/jobs/(?P<fine_tuning_job_id>[^/?#]*)/cancel$")
                .expect("Unable to create regex for FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CANCEL");
    }
    pub(crate) static ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CHECKPOINTS: usize = 17;
    lazy_static! {
        pub static ref REGEX_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CHECKPOINTS: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/fine_tuning/jobs/(?P<fine_tuning_job_id>[^/?#]*)/checkpoints$")
                .expect("Unable to create regex for FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CHECKPOINTS");
    }
    pub(crate) static ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_EVENTS: usize = 18;
    lazy_static! {
        pub static ref REGEX_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_EVENTS: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/fine_tuning/jobs/(?P<fine_tuning_job_id>[^/?#]*)/events$")
                .expect("Unable to create regex for FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_EVENTS");
    }
    pub(crate) static ID_IMAGES_EDITS: usize = 19;
    pub(crate) static ID_IMAGES_GENERATIONS: usize = 20;
    pub(crate) static ID_IMAGES_VARIATIONS: usize = 21;
    pub(crate) static ID_MODELS: usize = 22;
    pub(crate) static ID_MODELS_MODEL: usize = 23;
    lazy_static! {
        pub static ref REGEX_MODELS_MODEL: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/models/(?P<model>[^/?#]*)$")
                .expect("Unable to create regex for MODELS_MODEL");
    }
    pub(crate) static ID_MODERATIONS: usize = 24;
    pub(crate) static ID_ORGANIZATION_ADMIN_API_KEYS: usize = 25;
    pub(crate) static ID_ORGANIZATION_ADMIN_API_KEYS_KEY_ID: usize = 26;
    lazy_static! {
        pub static ref REGEX_ORGANIZATION_ADMIN_API_KEYS_KEY_ID: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/organization/admin_api_keys/(?P<key_id>[^/?#]*)$")
                .expect("Unable to create regex for ORGANIZATION_ADMIN_API_KEYS_KEY_ID");
    }
    pub(crate) static ID_ORGANIZATION_AUDIT_LOGS: usize = 27;
    pub(crate) static ID_ORGANIZATION_COSTS: usize = 28;
    pub(crate) static ID_ORGANIZATION_INVITES: usize = 29;
    pub(crate) static ID_ORGANIZATION_INVITES_INVITE_ID: usize = 30;
    lazy_static! {
        pub static ref REGEX_ORGANIZATION_INVITES_INVITE_ID: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/organization/invites/(?P<invite_id>[^/?#]*)$")
                .expect("Unable to create regex for ORGANIZATION_INVITES_INVITE_ID");
    }
    pub(crate) static ID_ORGANIZATION_PROJECTS: usize = 31;
    pub(crate) static ID_ORGANIZATION_PROJECTS_PROJECT_ID: usize = 32;
    lazy_static! {
        pub static ref REGEX_ORGANIZATION_PROJECTS_PROJECT_ID: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/organization/projects/(?P<project_id>[^/?#]*)$")
                .expect("Unable to create regex for ORGANIZATION_PROJECTS_PROJECT_ID");
    }
    pub(crate) static ID_ORGANIZATION_PROJECTS_PROJECT_ID_API_KEYS: usize = 33;
    lazy_static! {
        pub static ref REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_API_KEYS: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/organization/projects/(?P<project_id>[^/?#]*)/api_keys$")
                .expect("Unable to create regex for ORGANIZATION_PROJECTS_PROJECT_ID_API_KEYS");
    }
    pub(crate) static ID_ORGANIZATION_PROJECTS_PROJECT_ID_API_KEYS_KEY_ID: usize = 34;
    lazy_static! {
        pub static ref REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_API_KEYS_KEY_ID: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/organization/projects/(?P<project_id>[^/?#]*)/api_keys/(?P<key_id>[^/?#]*)$")
                .expect("Unable to create regex for ORGANIZATION_PROJECTS_PROJECT_ID_API_KEYS_KEY_ID");
    }
    pub(crate) static ID_ORGANIZATION_PROJECTS_PROJECT_ID_ARCHIVE: usize = 35;
    lazy_static! {
        pub static ref REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_ARCHIVE: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/organization/projects/(?P<project_id>[^/?#]*)/archive$")
                .expect("Unable to create regex for ORGANIZATION_PROJECTS_PROJECT_ID_ARCHIVE");
    }
    pub(crate) static ID_ORGANIZATION_PROJECTS_PROJECT_ID_RATE_LIMITS: usize = 36;
    lazy_static! {
        pub static ref REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_RATE_LIMITS: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/organization/projects/(?P<project_id>[^/?#]*)/rate_limits$")
                .expect("Unable to create regex for ORGANIZATION_PROJECTS_PROJECT_ID_RATE_LIMITS");
    }
    pub(crate) static ID_ORGANIZATION_PROJECTS_PROJECT_ID_RATE_LIMITS_RATE_LIMIT_ID: usize = 37;
    lazy_static! {
        pub static ref REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_RATE_LIMITS_RATE_LIMIT_ID: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/organization/projects/(?P<project_id>[^/?#]*)/rate_limits/(?P<rate_limit_id>[^/?#]*)$")
                .expect("Unable to create regex for ORGANIZATION_PROJECTS_PROJECT_ID_RATE_LIMITS_RATE_LIMIT_ID");
    }
    pub(crate) static ID_ORGANIZATION_PROJECTS_PROJECT_ID_SERVICE_ACCOUNTS: usize = 38;
    lazy_static! {
        pub static ref REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_SERVICE_ACCOUNTS: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/organization/projects/(?P<project_id>[^/?#]*)/service_accounts$")
                .expect("Unable to create regex for ORGANIZATION_PROJECTS_PROJECT_ID_SERVICE_ACCOUNTS");
    }
    pub(crate) static ID_ORGANIZATION_PROJECTS_PROJECT_ID_SERVICE_ACCOUNTS_SERVICE_ACCOUNT_ID: usize = 39;
    lazy_static! {
        pub static ref REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_SERVICE_ACCOUNTS_SERVICE_ACCOUNT_ID: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/organization/projects/(?P<project_id>[^/?#]*)/service_accounts/(?P<service_account_id>[^/?#]*)$")
                .expect("Unable to create regex for ORGANIZATION_PROJECTS_PROJECT_ID_SERVICE_ACCOUNTS_SERVICE_ACCOUNT_ID");
    }
    pub(crate) static ID_ORGANIZATION_PROJECTS_PROJECT_ID_USERS: usize = 40;
    lazy_static! {
        pub static ref REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_USERS: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/organization/projects/(?P<project_id>[^/?#]*)/users$")
                .expect("Unable to create regex for ORGANIZATION_PROJECTS_PROJECT_ID_USERS");
    }
    pub(crate) static ID_ORGANIZATION_PROJECTS_PROJECT_ID_USERS_USER_ID: usize = 41;
    lazy_static! {
        pub static ref REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_USERS_USER_ID: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/organization/projects/(?P<project_id>[^/?#]*)/users/(?P<user_id>[^/?#]*)$")
                .expect("Unable to create regex for ORGANIZATION_PROJECTS_PROJECT_ID_USERS_USER_ID");
    }
    pub(crate) static ID_ORGANIZATION_USAGE_AUDIO_SPEECHES: usize = 42;
    pub(crate) static ID_ORGANIZATION_USAGE_AUDIO_TRANSCRIPTIONS: usize = 43;
    pub(crate) static ID_ORGANIZATION_USAGE_CODE_INTERPRETER_SESSIONS: usize = 44;
    pub(crate) static ID_ORGANIZATION_USAGE_COMPLETIONS: usize = 45;
    pub(crate) static ID_ORGANIZATION_USAGE_EMBEDDINGS: usize = 46;
    pub(crate) static ID_ORGANIZATION_USAGE_IMAGES: usize = 47;
    pub(crate) static ID_ORGANIZATION_USAGE_MODERATIONS: usize = 48;
    pub(crate) static ID_ORGANIZATION_USAGE_VECTOR_STORES: usize = 49;
    pub(crate) static ID_ORGANIZATION_USERS: usize = 50;
    pub(crate) static ID_ORGANIZATION_USERS_USER_ID: usize = 51;
    lazy_static! {
        pub static ref REGEX_ORGANIZATION_USERS_USER_ID: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/organization/users/(?P<user_id>[^/?#]*)$")
                .expect("Unable to create regex for ORGANIZATION_USERS_USER_ID");
    }
    pub(crate) static ID_REALTIME_SESSIONS: usize = 52;
    pub(crate) static ID_THREADS: usize = 53;
    pub(crate) static ID_THREADS_RUNS: usize = 54;
    pub(crate) static ID_THREADS_THREAD_ID: usize = 55;
    lazy_static! {
        pub static ref REGEX_THREADS_THREAD_ID: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/threads/(?P<thread_id>[^/?#]*)$")
                .expect("Unable to create regex for THREADS_THREAD_ID");
    }
    pub(crate) static ID_THREADS_THREAD_ID_MESSAGES: usize = 56;
    lazy_static! {
        pub static ref REGEX_THREADS_THREAD_ID_MESSAGES: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/threads/(?P<thread_id>[^/?#]*)/messages$")
                .expect("Unable to create regex for THREADS_THREAD_ID_MESSAGES");
    }
    pub(crate) static ID_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID: usize = 57;
    lazy_static! {
        pub static ref REGEX_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/threads/(?P<thread_id>[^/?#]*)/messages/(?P<message_id>[^/?#]*)$")
                .expect("Unable to create regex for THREADS_THREAD_ID_MESSAGES_MESSAGE_ID");
    }
    pub(crate) static ID_THREADS_THREAD_ID_RUNS: usize = 58;
    lazy_static! {
        pub static ref REGEX_THREADS_THREAD_ID_RUNS: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/threads/(?P<thread_id>[^/?#]*)/runs$")
                .expect("Unable to create regex for THREADS_THREAD_ID_RUNS");
    }
    pub(crate) static ID_THREADS_THREAD_ID_RUNS_RUN_ID: usize = 59;
    lazy_static! {
        pub static ref REGEX_THREADS_THREAD_ID_RUNS_RUN_ID: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/threads/(?P<thread_id>[^/?#]*)/runs/(?P<run_id>[^/?#]*)$")
                .expect("Unable to create regex for THREADS_THREAD_ID_RUNS_RUN_ID");
    }
    pub(crate) static ID_THREADS_THREAD_ID_RUNS_RUN_ID_CANCEL: usize = 60;
    lazy_static! {
        pub static ref REGEX_THREADS_THREAD_ID_RUNS_RUN_ID_CANCEL: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/threads/(?P<thread_id>[^/?#]*)/runs/(?P<run_id>[^/?#]*)/cancel$")
                .expect("Unable to create regex for THREADS_THREAD_ID_RUNS_RUN_ID_CANCEL");
    }
    pub(crate) static ID_THREADS_THREAD_ID_RUNS_RUN_ID_STEPS: usize = 61;
    lazy_static! {
        pub static ref REGEX_THREADS_THREAD_ID_RUNS_RUN_ID_STEPS: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/threads/(?P<thread_id>[^/?#]*)/runs/(?P<run_id>[^/?#]*)/steps$")
                .expect("Unable to create regex for THREADS_THREAD_ID_RUNS_RUN_ID_STEPS");
    }
    pub(crate) static ID_THREADS_THREAD_ID_RUNS_RUN_ID_STEPS_STEP_ID: usize = 62;
    lazy_static! {
        pub static ref REGEX_THREADS_THREAD_ID_RUNS_RUN_ID_STEPS_STEP_ID: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/threads/(?P<thread_id>[^/?#]*)/runs/(?P<run_id>[^/?#]*)/steps/(?P<step_id>[^/?#]*)$")
                .expect("Unable to create regex for THREADS_THREAD_ID_RUNS_RUN_ID_STEPS_STEP_ID");
    }
    pub(crate) static ID_THREADS_THREAD_ID_RUNS_RUN_ID_SUBMIT_TOOL_OUTPUTS: usize = 63;
    lazy_static! {
        pub static ref REGEX_THREADS_THREAD_ID_RUNS_RUN_ID_SUBMIT_TOOL_OUTPUTS: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/threads/(?P<thread_id>[^/?#]*)/runs/(?P<run_id>[^/?#]*)/submit_tool_outputs$")
                .expect("Unable to create regex for THREADS_THREAD_ID_RUNS_RUN_ID_SUBMIT_TOOL_OUTPUTS");
    }
    pub(crate) static ID_UPLOADS: usize = 64;
    pub(crate) static ID_UPLOADS_UPLOAD_ID_CANCEL: usize = 65;
    lazy_static! {
        pub static ref REGEX_UPLOADS_UPLOAD_ID_CANCEL: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/uploads/(?P<upload_id>[^/?#]*)/cancel$")
                .expect("Unable to create regex for UPLOADS_UPLOAD_ID_CANCEL");
    }
    pub(crate) static ID_UPLOADS_UPLOAD_ID_COMPLETE: usize = 66;
    lazy_static! {
        pub static ref REGEX_UPLOADS_UPLOAD_ID_COMPLETE: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/uploads/(?P<upload_id>[^/?#]*)/complete$")
                .expect("Unable to create regex for UPLOADS_UPLOAD_ID_COMPLETE");
    }
    pub(crate) static ID_UPLOADS_UPLOAD_ID_PARTS: usize = 67;
    lazy_static! {
        pub static ref REGEX_UPLOADS_UPLOAD_ID_PARTS: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/uploads/(?P<upload_id>[^/?#]*)/parts$")
                .expect("Unable to create regex for UPLOADS_UPLOAD_ID_PARTS");
    }
    pub(crate) static ID_VECTOR_STORES: usize = 68;
    pub(crate) static ID_VECTOR_STORES_VECTOR_STORE_ID: usize = 69;
    lazy_static! {
        pub static ref REGEX_VECTOR_STORES_VECTOR_STORE_ID: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/vector_stores/(?P<vector_store_id>[^/?#]*)$")
                .expect("Unable to create regex for VECTOR_STORES_VECTOR_STORE_ID");
    }
    pub(crate) static ID_VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES: usize = 70;
    lazy_static! {
        pub static ref REGEX_VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/vector_stores/(?P<vector_store_id>[^/?#]*)/file_batches$")
                .expect("Unable to create regex for VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES");
    }
    pub(crate) static ID_VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES_BATCH_ID: usize = 71;
    lazy_static! {
        pub static ref REGEX_VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES_BATCH_ID: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/vector_stores/(?P<vector_store_id>[^/?#]*)/file_batches/(?P<batch_id>[^/?#]*)$")
                .expect("Unable to create regex for VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES_BATCH_ID");
    }
    pub(crate) static ID_VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES_BATCH_ID_CANCEL: usize = 72;
    lazy_static! {
        pub static ref REGEX_VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES_BATCH_ID_CANCEL: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/vector_stores/(?P<vector_store_id>[^/?#]*)/file_batches/(?P<batch_id>[^/?#]*)/cancel$")
                .expect("Unable to create regex for VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES_BATCH_ID_CANCEL");
    }
    pub(crate) static ID_VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES_BATCH_ID_FILES: usize = 73;
    lazy_static! {
        pub static ref REGEX_VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES_BATCH_ID_FILES: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/vector_stores/(?P<vector_store_id>[^/?#]*)/file_batches/(?P<batch_id>[^/?#]*)/files$")
                .expect("Unable to create regex for VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES_BATCH_ID_FILES");
    }
    pub(crate) static ID_VECTOR_STORES_VECTOR_STORE_ID_FILES: usize = 74;
    lazy_static! {
        pub static ref REGEX_VECTOR_STORES_VECTOR_STORE_ID_FILES: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/vector_stores/(?P<vector_store_id>[^/?#]*)/files$")
                .expect("Unable to create regex for VECTOR_STORES_VECTOR_STORE_ID_FILES");
    }
    pub(crate) static ID_VECTOR_STORES_VECTOR_STORE_ID_FILES_FILE_ID: usize = 75;
    lazy_static! {
        pub static ref REGEX_VECTOR_STORES_VECTOR_STORE_ID_FILES_FILE_ID: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/vector_stores/(?P<vector_store_id>[^/?#]*)/files/(?P<file_id>[^/?#]*)$")
                .expect("Unable to create regex for VECTOR_STORES_VECTOR_STORE_ID_FILES_FILE_ID");
    }
}


pub struct MakeService<T, C>
where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    api_impl: T,
    multipart_form_size_limit: Option<u64>,
    marker: PhantomData<C>,
    validation: bool
}

impl<T, C> MakeService<T, C>
where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    pub fn new(api_impl: T) -> Self {
        MakeService {
            api_impl,
            multipart_form_size_limit: Some(8 * 1024 * 1024),
            marker: PhantomData,
            validation: false
        }
    }

    /// Configure size limit when inspecting a multipart/form body.
    ///
    /// Default is 8 MiB.
    ///
    /// Set to None for no size limit, which presents a Denial of Service attack risk.
    pub fn multipart_form_size_limit(mut self, multipart_form_size_limit: Option<u64>) -> Self {
        self.multipart_form_size_limit = multipart_form_size_limit;
        self
    }

    // Turn on/off validation for the service being made.
    #[cfg(feature = "validate")]
    pub fn set_validation(&mut self, validation: bool) {
        self.validation = validation;
    }
}

impl<T, C> Clone for MakeService<T, C>
where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString>  + Has<Option<Authorization>> + Send + Sync + 'static
{
    fn clone(&self) -> Self {
        Self {
            api_impl: self.api_impl.clone(),
            multipart_form_size_limit: Some(8 * 1024 * 1024),
            marker: PhantomData,
            validation: self.validation
        }
    }
}

impl<T, C, Target> hyper::service::Service<Target> for MakeService<T, C>
where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    type Response = Service<T, C>;
    type Error = crate::ServiceError;
    type Future = future::Ready<Result<Self::Response, Self::Error>>;

    fn call(&self, target: Target) -> Self::Future {
        let service = Service::new(self.api_impl.clone(), self.validation)
            .multipart_form_size_limit(self.multipart_form_size_limit);

        future::ok(service)
    }
}

fn method_not_allowed() -> Result<Response<BoxBody<Bytes, Infallible>>, crate::ServiceError> {
    Ok(
        Response::builder().status(StatusCode::METHOD_NOT_ALLOWED)
            .body(BoxBody::new(http_body_util::Empty::new()))
            .expect("Unable to create Method Not Allowed response")
    )
}

#[allow(unused_macros)]
#[cfg(not(feature = "validate"))]
macro_rules! run_validation {
    ($parameter:tt, $base_name:tt, $validation:tt) => ();
}

#[allow(unused_macros)]
#[cfg(feature = "validate")]
macro_rules! run_validation {
    ($parameter:tt, $base_name:tt, $validation:tt) => {
        let $parameter = if $validation {
            match $parameter.validate() {
            Ok(()) => $parameter,
            Err(e) => return Ok(Response::builder()
                                    .status(StatusCode::BAD_REQUEST)
                                    .header(CONTENT_TYPE, mime::TEXT_PLAIN.as_ref())
                                    .body(BoxBody::new(format!("Invalid value in body parameter {}: {}", $base_name, e)))
                                    .expect(&format!("Unable to create Bad Request response for invalid value in body parameter {}", $base_name))),
            }
        } else {
            $parameter
        };
    }
}

pub struct Service<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    api_impl: T,
    multipart_form_size_limit: Option<u64>,
    marker: PhantomData<C>,
    // Enable regex pattern validation of received JSON models
    validation: bool,
}

impl<T, C> Service<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    pub fn new(api_impl: T, validation: bool) -> Self {
        Service {
            api_impl,
            multipart_form_size_limit: Some(8 * 1024 * 1024),
            marker: PhantomData,
            validation,
        }
    }
    #[cfg(feature = "validate")]
    pub fn set_validation(&mut self, validation: bool) {
        self.validation = validation
    }


    /// Configure size limit when extracting a multipart/form body.
    ///
    /// Default is 8 MiB.
    ///
    /// Set to None for no size limit, which presents a Denial of Service attack risk.
    pub fn multipart_form_size_limit(mut self, multipart_form_size_limit: Option<u64>) -> Self {
        self.multipart_form_size_limit = multipart_form_size_limit;
        self
    }
}

impl<T, C> Clone for Service<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    fn clone(&self) -> Self {
        Service {
            api_impl: self.api_impl.clone(),
            multipart_form_size_limit: Some(8 * 1024 * 1024),
            marker: self.marker,
            validation: self.validation,
        }
    }
}

#[allow(dead_code)]
fn body_from_string(s: String) -> BoxBody<Bytes, Infallible> {
    BoxBody::new(Full::new(Bytes::from(s)))
}

fn body_from_str(s: &str) -> BoxBody<Bytes, Infallible> {
    BoxBody::new(Full::new(Bytes::copy_from_slice(s.as_bytes())))
}

impl<T, C, ReqBody> hyper::service::Service<(Request<ReqBody>, C)> for Service<T, C> where
    T: Api<C> + Clone + Send + Sync + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static,
    ReqBody: Body + Send + 'static,
    ReqBody::Error: Into<Box<dyn Error + Send + Sync>> + Send,
    ReqBody::Data: Send,
{
    type Response = Response<BoxBody<Bytes, Infallible>>;
    type Error = crate::ServiceError;
    type Future = ServiceFuture;

    fn call(&self, req: (Request<ReqBody>, C)) -> Self::Future {
        async fn run<T, C, ReqBody>(
            mut api_impl: T,
            req: (Request<ReqBody>, C),
            validation: bool,
            multipart_form_size_limit: Option<u64>,
        ) -> Result<Response<BoxBody<Bytes, Infallible>>, crate::ServiceError>
        where
            T: Api<C> + Clone + Send + 'static,
            C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static,
            ReqBody: Body + Send + 'static,
            ReqBody::Error: Into<Box<dyn Error + Send + Sync>> + Send,
            ReqBody::Data: Send,
        {
            let (request, context) = req;
            let (parts, body) = request.into_parts();
            let (method, uri, headers) = (parts.method, parts.uri, parts.headers);
            let path = paths::GLOBAL_REGEX_SET.matches(uri.path());

            match method {

            // CreateAssistant - POST /assistants
            hyper::Method::POST if path.matched(paths::ID_ASSISTANTS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_create_assistant_request: Option<models::CreateAssistantRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_assistant_request) => param_create_assistant_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter CreateAssistantRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CreateAssistantRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_create_assistant_request = match param_create_assistant_request {
                                    Some(param_create_assistant_request) => param_create_assistant_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter CreateAssistantRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter CreateAssistantRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_create_assistant_request, "CreateAssistantRequest", validation);


                                let result = api_impl.create_assistant(
                                            param_create_assistant_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateAssistantResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // CreateThread - POST /threads
            hyper::Method::POST if path.matched(paths::ID_THREADS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_create_thread_request: Option<models::CreateThreadRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    serde_ignored::deserialize(deserializer, |path| {
                                        warn!("Ignoring unknown field in body: {path}");
                                        unused_elements.push(path.to_string());
                                    }).unwrap_or_default()

                                } else {
                                    None
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_create_thread_request, "CreateThreadRequest", validation);


                                let result = api_impl.create_thread(
                                            param_create_thread_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateThreadResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // CreateThreadAndRun - POST /threads/runs
            hyper::Method::POST if path.matched(paths::ID_THREADS_RUNS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_create_thread_and_run_request: Option<models::CreateThreadAndRunRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_thread_and_run_request) => param_create_thread_and_run_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter CreateThreadAndRunRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CreateThreadAndRunRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_create_thread_and_run_request = match param_create_thread_and_run_request {
                                    Some(param_create_thread_and_run_request) => param_create_thread_and_run_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter CreateThreadAndRunRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter CreateThreadAndRunRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_create_thread_and_run_request, "CreateThreadAndRunRequest", validation);


                                let result = api_impl.create_thread_and_run(
                                            param_create_thread_and_run_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateThreadAndRunResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // ListAssistants - GET /assistants
            hyper::Method::GET if path.matched(paths::ID_ASSISTANTS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter limit - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_order = query_params.iter().filter(|e| e.0 == "order").map(|e| e.1.clone())
                    .next();
                let param_order = match param_order {
                    Some(param_order) => {
                        let param_order =
                            <models::ListAssistantsOrderParameter as std::str::FromStr>::from_str
                                (&param_order);
                        match param_order {
                            Ok(param_order) => Some(param_order),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter order - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter order")),
                        }
                    },
                    None => None,
                };
    #[cfg(not(feature = "validate"))]
                run_validation!(param_order, "order", validation);
                let param_after = query_params.iter().filter(|e| e.0 == "after").map(|e| e.1.clone())
                    .next();
                let param_after = match param_after {
                    Some(param_after) => {
                        let param_after =
                            <String as std::str::FromStr>::from_str
                                (&param_after);
                        match param_after {
                            Ok(param_after) => Some(param_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter after - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter after")),
                        }
                    },
                    None => None,
                };
                let param_before = query_params.iter().filter(|e| e.0 == "before").map(|e| e.1.clone())
                    .next();
                let param_before = match param_before {
                    Some(param_before) => {
                        let param_before =
                            <String as std::str::FromStr>::from_str
                                (&param_before);
                        match param_before {
                            Ok(param_before) => Some(param_before),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter before - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter before")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.list_assistants(
                                            param_limit,
                                            param_order,
                                            param_after,
                                            param_before,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListAssistantsResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // CreateMessage - POST /threads/{thread_id}/messages
            hyper::Method::POST if path.matched(paths::ID_THREADS_THREAD_ID_MESSAGES) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID_MESSAGES
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID_MESSAGES in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID_MESSAGES.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter thread_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_create_message_request: Option<models::CreateMessageRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_message_request) => param_create_message_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter CreateMessageRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CreateMessageRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_create_message_request = match param_create_message_request {
                                    Some(param_create_message_request) => param_create_message_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter CreateMessageRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter CreateMessageRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_create_message_request, "CreateMessageRequest", validation);


                                let result = api_impl.create_message(
                                            param_thread_id,
                                            param_create_message_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateMessageResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // CreateRun - POST /threads/{thread_id}/runs
            hyper::Method::POST if path.matched(paths::ID_THREADS_THREAD_ID_RUNS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID_RUNS
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID_RUNS in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID_RUNS.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter thread_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_include_left_square_bracket_right_square_bracket = query_params.iter().filter(|e| e.0 == "include[]").map(|e| e.1.clone())
                    .filter_map(|param_include_left_square_bracket_right_square_bracket| param_include_left_square_bracket_right_square_bracket.parse().ok())
                    .collect::<Vec<_>>();
                let param_include_left_square_bracket_right_square_bracket = if !param_include_left_square_bracket_right_square_bracket.is_empty() {
                    Some(param_include_left_square_bracket_right_square_bracket)
                } else {
                    None
                };

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_create_run_request: Option<models::CreateRunRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_run_request) => param_create_run_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter CreateRunRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CreateRunRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_create_run_request = match param_create_run_request {
                                    Some(param_create_run_request) => param_create_run_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter CreateRunRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter CreateRunRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_create_run_request, "CreateRunRequest", validation);


                                let result = api_impl.create_run(
                                            param_thread_id,
                                            param_create_run_request,
                                            param_include_left_square_bracket_right_square_bracket.as_ref(),
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateRunResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // DeleteAssistant - DELETE /assistants/{assistant_id}
            hyper::Method::DELETE if path.matched(paths::ID_ASSISTANTS_ASSISTANT_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ASSISTANTS_ASSISTANT_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ASSISTANTS_ASSISTANT_ID in set but failed match against \"{}\"", path, paths::REGEX_ASSISTANTS_ASSISTANT_ID.as_str())
                    );

                let param_assistant_id = match percent_encoding::percent_decode(path_params["assistant_id"].as_bytes()).decode_utf8() {
                    Ok(param_assistant_id) => match param_assistant_id.parse::<String>() {
                        Ok(param_assistant_id) => param_assistant_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter assistant_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["assistant_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.delete_assistant(
                                            param_assistant_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteAssistantResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // DeleteThread - DELETE /threads/{thread_id}
            hyper::Method::DELETE if path.matched(paths::ID_THREADS_THREAD_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter thread_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.delete_thread(
                                            param_thread_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteThreadResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetAssistant - GET /assistants/{assistant_id}
            hyper::Method::GET if path.matched(paths::ID_ASSISTANTS_ASSISTANT_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ASSISTANTS_ASSISTANT_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ASSISTANTS_ASSISTANT_ID in set but failed match against \"{}\"", path, paths::REGEX_ASSISTANTS_ASSISTANT_ID.as_str())
                    );

                let param_assistant_id = match percent_encoding::percent_decode(path_params["assistant_id"].as_bytes()).decode_utf8() {
                    Ok(param_assistant_id) => match param_assistant_id.parse::<String>() {
                        Ok(param_assistant_id) => param_assistant_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter assistant_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["assistant_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.get_assistant(
                                            param_assistant_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetAssistantResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetThread - GET /threads/{thread_id}
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter thread_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.get_thread(
                                            param_thread_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetThreadResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ListMessages - GET /threads/{thread_id}/messages
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID_MESSAGES) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID_MESSAGES
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID_MESSAGES in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID_MESSAGES.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter thread_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter limit - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_order = query_params.iter().filter(|e| e.0 == "order").map(|e| e.1.clone())
                    .next();
                let param_order = match param_order {
                    Some(param_order) => {
                        let param_order =
                            <models::ListAssistantsOrderParameter as std::str::FromStr>::from_str
                                (&param_order);
                        match param_order {
                            Ok(param_order) => Some(param_order),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter order - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter order")),
                        }
                    },
                    None => None,
                };
    #[cfg(not(feature = "validate"))]
                run_validation!(param_order, "order", validation);
                let param_after = query_params.iter().filter(|e| e.0 == "after").map(|e| e.1.clone())
                    .next();
                let param_after = match param_after {
                    Some(param_after) => {
                        let param_after =
                            <String as std::str::FromStr>::from_str
                                (&param_after);
                        match param_after {
                            Ok(param_after) => Some(param_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter after - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter after")),
                        }
                    },
                    None => None,
                };
                let param_before = query_params.iter().filter(|e| e.0 == "before").map(|e| e.1.clone())
                    .next();
                let param_before = match param_before {
                    Some(param_before) => {
                        let param_before =
                            <String as std::str::FromStr>::from_str
                                (&param_before);
                        match param_before {
                            Ok(param_before) => Some(param_before),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter before - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter before")),
                        }
                    },
                    None => None,
                };
                let param_run_id = query_params.iter().filter(|e| e.0 == "run_id").map(|e| e.1.clone())
                    .next();
                let param_run_id = match param_run_id {
                    Some(param_run_id) => {
                        let param_run_id =
                            <String as std::str::FromStr>::from_str
                                (&param_run_id);
                        match param_run_id {
                            Ok(param_run_id) => Some(param_run_id),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter run_id - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter run_id")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.list_messages(
                                            param_thread_id,
                                            param_limit,
                                            param_order,
                                            param_after,
                                            param_before,
                                            param_run_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListMessagesResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ListRuns - GET /threads/{thread_id}/runs
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID_RUNS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID_RUNS
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID_RUNS in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID_RUNS.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter thread_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter limit - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_order = query_params.iter().filter(|e| e.0 == "order").map(|e| e.1.clone())
                    .next();
                let param_order = match param_order {
                    Some(param_order) => {
                        let param_order =
                            <models::ListAssistantsOrderParameter as std::str::FromStr>::from_str
                                (&param_order);
                        match param_order {
                            Ok(param_order) => Some(param_order),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter order - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter order")),
                        }
                    },
                    None => None,
                };
    #[cfg(not(feature = "validate"))]
                run_validation!(param_order, "order", validation);
                let param_after = query_params.iter().filter(|e| e.0 == "after").map(|e| e.1.clone())
                    .next();
                let param_after = match param_after {
                    Some(param_after) => {
                        let param_after =
                            <String as std::str::FromStr>::from_str
                                (&param_after);
                        match param_after {
                            Ok(param_after) => Some(param_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter after - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter after")),
                        }
                    },
                    None => None,
                };
                let param_before = query_params.iter().filter(|e| e.0 == "before").map(|e| e.1.clone())
                    .next();
                let param_before = match param_before {
                    Some(param_before) => {
                        let param_before =
                            <String as std::str::FromStr>::from_str
                                (&param_before);
                        match param_before {
                            Ok(param_before) => Some(param_before),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter before - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter before")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.list_runs(
                                            param_thread_id,
                                            param_limit,
                                            param_order,
                                            param_after,
                                            param_before,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListRunsResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ModifyAssistant - POST /assistants/{assistant_id}
            hyper::Method::POST if path.matched(paths::ID_ASSISTANTS_ASSISTANT_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ASSISTANTS_ASSISTANT_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ASSISTANTS_ASSISTANT_ID in set but failed match against \"{}\"", path, paths::REGEX_ASSISTANTS_ASSISTANT_ID.as_str())
                    );

                let param_assistant_id = match percent_encoding::percent_decode(path_params["assistant_id"].as_bytes()).decode_utf8() {
                    Ok(param_assistant_id) => match param_assistant_id.parse::<String>() {
                        Ok(param_assistant_id) => param_assistant_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter assistant_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["assistant_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_modify_assistant_request: Option<models::ModifyAssistantRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_modify_assistant_request) => param_modify_assistant_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter ModifyAssistantRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter ModifyAssistantRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_modify_assistant_request = match param_modify_assistant_request {
                                    Some(param_modify_assistant_request) => param_modify_assistant_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter ModifyAssistantRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter ModifyAssistantRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_modify_assistant_request, "ModifyAssistantRequest", validation);


                                let result = api_impl.modify_assistant(
                                            param_assistant_id,
                                            param_modify_assistant_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                ModifyAssistantResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // ModifyThread - POST /threads/{thread_id}
            hyper::Method::POST if path.matched(paths::ID_THREADS_THREAD_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter thread_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_modify_thread_request: Option<models::ModifyThreadRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_modify_thread_request) => param_modify_thread_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter ModifyThreadRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter ModifyThreadRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_modify_thread_request = match param_modify_thread_request {
                                    Some(param_modify_thread_request) => param_modify_thread_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter ModifyThreadRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter ModifyThreadRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_modify_thread_request, "ModifyThreadRequest", validation);


                                let result = api_impl.modify_thread(
                                            param_thread_id,
                                            param_modify_thread_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                ModifyThreadResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // CancelRun - POST /threads/{thread_id}/runs/{run_id}/cancel
            hyper::Method::POST if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID_CANCEL) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID_RUNS_RUN_ID_CANCEL
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID_RUNS_RUN_ID_CANCEL in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID_RUNS_RUN_ID_CANCEL.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter thread_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_run_id = match percent_encoding::percent_decode(path_params["run_id"].as_bytes()).decode_utf8() {
                    Ok(param_run_id) => match param_run_id.parse::<String>() {
                        Ok(param_run_id) => param_run_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter run_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["run_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.cancel_run(
                                            param_thread_id,
                                            param_run_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CancelRunResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // DeleteMessage - DELETE /threads/{thread_id}/messages/{message_id}
            hyper::Method::DELETE if path.matched(paths::ID_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID_MESSAGES_MESSAGE_ID in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter thread_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_message_id = match percent_encoding::percent_decode(path_params["message_id"].as_bytes()).decode_utf8() {
                    Ok(param_message_id) => match param_message_id.parse::<String>() {
                        Ok(param_message_id) => param_message_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter message_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["message_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.delete_message(
                                            param_thread_id,
                                            param_message_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteMessageResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetMessage - GET /threads/{thread_id}/messages/{message_id}
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID_MESSAGES_MESSAGE_ID in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter thread_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_message_id = match percent_encoding::percent_decode(path_params["message_id"].as_bytes()).decode_utf8() {
                    Ok(param_message_id) => match param_message_id.parse::<String>() {
                        Ok(param_message_id) => param_message_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter message_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["message_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.get_message(
                                            param_thread_id,
                                            param_message_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetMessageResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetRun - GET /threads/{thread_id}/runs/{run_id}
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID_RUNS_RUN_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID_RUNS_RUN_ID in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID_RUNS_RUN_ID.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter thread_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_run_id = match percent_encoding::percent_decode(path_params["run_id"].as_bytes()).decode_utf8() {
                    Ok(param_run_id) => match param_run_id.parse::<String>() {
                        Ok(param_run_id) => param_run_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter run_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["run_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.get_run(
                                            param_thread_id,
                                            param_run_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetRunResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ListRunSteps - GET /threads/{thread_id}/runs/{run_id}/steps
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID_STEPS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID_RUNS_RUN_ID_STEPS
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID_RUNS_RUN_ID_STEPS in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID_RUNS_RUN_ID_STEPS.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter thread_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_run_id = match percent_encoding::percent_decode(path_params["run_id"].as_bytes()).decode_utf8() {
                    Ok(param_run_id) => match param_run_id.parse::<String>() {
                        Ok(param_run_id) => param_run_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter run_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["run_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter limit - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_order = query_params.iter().filter(|e| e.0 == "order").map(|e| e.1.clone())
                    .next();
                let param_order = match param_order {
                    Some(param_order) => {
                        let param_order =
                            <models::ListAssistantsOrderParameter as std::str::FromStr>::from_str
                                (&param_order);
                        match param_order {
                            Ok(param_order) => Some(param_order),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter order - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter order")),
                        }
                    },
                    None => None,
                };
    #[cfg(not(feature = "validate"))]
                run_validation!(param_order, "order", validation);
                let param_after = query_params.iter().filter(|e| e.0 == "after").map(|e| e.1.clone())
                    .next();
                let param_after = match param_after {
                    Some(param_after) => {
                        let param_after =
                            <String as std::str::FromStr>::from_str
                                (&param_after);
                        match param_after {
                            Ok(param_after) => Some(param_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter after - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter after")),
                        }
                    },
                    None => None,
                };
                let param_before = query_params.iter().filter(|e| e.0 == "before").map(|e| e.1.clone())
                    .next();
                let param_before = match param_before {
                    Some(param_before) => {
                        let param_before =
                            <String as std::str::FromStr>::from_str
                                (&param_before);
                        match param_before {
                            Ok(param_before) => Some(param_before),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter before - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter before")),
                        }
                    },
                    None => None,
                };
                let param_include_left_square_bracket_right_square_bracket = query_params.iter().filter(|e| e.0 == "include[]").map(|e| e.1.clone())
                    .filter_map(|param_include_left_square_bracket_right_square_bracket| param_include_left_square_bracket_right_square_bracket.parse().ok())
                    .collect::<Vec<_>>();
                let param_include_left_square_bracket_right_square_bracket = if !param_include_left_square_bracket_right_square_bracket.is_empty() {
                    Some(param_include_left_square_bracket_right_square_bracket)
                } else {
                    None
                };

                                let result = api_impl.list_run_steps(
                                            param_thread_id,
                                            param_run_id,
                                            param_limit,
                                            param_order,
                                            param_after,
                                            param_before,
                                            param_include_left_square_bracket_right_square_bracket.as_ref(),
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListRunStepsResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ModifyMessage - POST /threads/{thread_id}/messages/{message_id}
            hyper::Method::POST if path.matched(paths::ID_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID_MESSAGES_MESSAGE_ID in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter thread_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_message_id = match percent_encoding::percent_decode(path_params["message_id"].as_bytes()).decode_utf8() {
                    Ok(param_message_id) => match param_message_id.parse::<String>() {
                        Ok(param_message_id) => param_message_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter message_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["message_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_modify_message_request: Option<models::ModifyMessageRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_modify_message_request) => param_modify_message_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter ModifyMessageRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter ModifyMessageRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_modify_message_request = match param_modify_message_request {
                                    Some(param_modify_message_request) => param_modify_message_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter ModifyMessageRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter ModifyMessageRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_modify_message_request, "ModifyMessageRequest", validation);


                                let result = api_impl.modify_message(
                                            param_thread_id,
                                            param_message_id,
                                            param_modify_message_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                ModifyMessageResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // ModifyRun - POST /threads/{thread_id}/runs/{run_id}
            hyper::Method::POST if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID_RUNS_RUN_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID_RUNS_RUN_ID in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID_RUNS_RUN_ID.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter thread_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_run_id = match percent_encoding::percent_decode(path_params["run_id"].as_bytes()).decode_utf8() {
                    Ok(param_run_id) => match param_run_id.parse::<String>() {
                        Ok(param_run_id) => param_run_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter run_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["run_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_modify_run_request: Option<models::ModifyRunRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_modify_run_request) => param_modify_run_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter ModifyRunRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter ModifyRunRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_modify_run_request = match param_modify_run_request {
                                    Some(param_modify_run_request) => param_modify_run_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter ModifyRunRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter ModifyRunRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_modify_run_request, "ModifyRunRequest", validation);


                                let result = api_impl.modify_run(
                                            param_thread_id,
                                            param_run_id,
                                            param_modify_run_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                ModifyRunResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // SubmitToolOuputsToRun - POST /threads/{thread_id}/runs/{run_id}/submit_tool_outputs
            hyper::Method::POST if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID_SUBMIT_TOOL_OUTPUTS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID_RUNS_RUN_ID_SUBMIT_TOOL_OUTPUTS
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID_RUNS_RUN_ID_SUBMIT_TOOL_OUTPUTS in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID_RUNS_RUN_ID_SUBMIT_TOOL_OUTPUTS.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter thread_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_run_id = match percent_encoding::percent_decode(path_params["run_id"].as_bytes()).decode_utf8() {
                    Ok(param_run_id) => match param_run_id.parse::<String>() {
                        Ok(param_run_id) => param_run_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter run_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["run_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_submit_tool_outputs_run_request: Option<models::SubmitToolOutputsRunRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_submit_tool_outputs_run_request) => param_submit_tool_outputs_run_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter SubmitToolOutputsRunRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter SubmitToolOutputsRunRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_submit_tool_outputs_run_request = match param_submit_tool_outputs_run_request {
                                    Some(param_submit_tool_outputs_run_request) => param_submit_tool_outputs_run_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter SubmitToolOutputsRunRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter SubmitToolOutputsRunRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_submit_tool_outputs_run_request, "SubmitToolOutputsRunRequest", validation);


                                let result = api_impl.submit_tool_ouputs_to_run(
                                            param_thread_id,
                                            param_run_id,
                                            param_submit_tool_outputs_run_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                SubmitToolOuputsToRunResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // GetRunStep - GET /threads/{thread_id}/runs/{run_id}/steps/{step_id}
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID_STEPS_STEP_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID_RUNS_RUN_ID_STEPS_STEP_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID_RUNS_RUN_ID_STEPS_STEP_ID in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID_RUNS_RUN_ID_STEPS_STEP_ID.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter thread_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_run_id = match percent_encoding::percent_decode(path_params["run_id"].as_bytes()).decode_utf8() {
                    Ok(param_run_id) => match param_run_id.parse::<String>() {
                        Ok(param_run_id) => param_run_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter run_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["run_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_step_id = match percent_encoding::percent_decode(path_params["step_id"].as_bytes()).decode_utf8() {
                    Ok(param_step_id) => match param_step_id.parse::<String>() {
                        Ok(param_step_id) => param_step_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter step_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["step_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_include_left_square_bracket_right_square_bracket = query_params.iter().filter(|e| e.0 == "include[]").map(|e| e.1.clone())
                    .filter_map(|param_include_left_square_bracket_right_square_bracket| param_include_left_square_bracket_right_square_bracket.parse().ok())
                    .collect::<Vec<_>>();
                let param_include_left_square_bracket_right_square_bracket = if !param_include_left_square_bracket_right_square_bracket.is_empty() {
                    Some(param_include_left_square_bracket_right_square_bracket)
                } else {
                    None
                };

                                let result = api_impl.get_run_step(
                                            param_thread_id,
                                            param_run_id,
                                            param_step_id,
                                            param_include_left_square_bracket_right_square_bracket.as_ref(),
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetRunStepResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // CreateSpeech - POST /audio/speech
            hyper::Method::POST if path.matched(paths::ID_AUDIO_SPEECH) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_create_speech_request: Option<models::CreateSpeechRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_speech_request) => param_create_speech_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter CreateSpeechRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CreateSpeechRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_create_speech_request = match param_create_speech_request {
                                    Some(param_create_speech_request) => param_create_speech_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter CreateSpeechRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter CreateSpeechRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_create_speech_request, "CreateSpeechRequest", validation);


                                let result = api_impl.create_speech(
                                            param_create_speech_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateSpeechResponse::OK
                                                    {
                                                        body,
                                                        transfer_encoding
                                                    }
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");

                                                    if let Some(transfer_encoding) = transfer_encoding {
                                                    let transfer_encoding = match header::IntoHeaderValue(transfer_encoding).try_into() {
                                                        Ok(val) => val,
                                                        Err(e) => {
                                                            return Ok(Response::builder()
                                                                    .status(StatusCode::INTERNAL_SERVER_ERROR)
                                                                    .body(body_from_string(format!("An internal server error occurred handling transfer_encoding header - {e}")))
                                                                    .expect("Unable to create Internal Server Error for invalid response header"))
                                                        }
                                                    };

                                                    response.headers_mut().insert(
                                                        HeaderName::from_static("transfer-encoding"),
                                                        transfer_encoding
                                                    );
                                                    }
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/octet-stream"));
                                                    // Binary Body
                                                    *response.body_mut() = BoxBody::new(Full::new(Bytes::from(body.0)));

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // CreateTranscription - POST /audio/transcriptions
            hyper::Method::POST if path.matched(paths::ID_AUDIO_TRANSCRIPTIONS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let boundary = match swagger::multipart::form::boundary(&headers) {
                                    Some(boundary) => boundary.to_string(),
                                    None => return Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(BoxBody::new("Couldn't find valid multipart body".to_string()))
                                                .expect("Unable to create Bad Request response for incorrect boundary")),
                                };

                                use std::io::Read;

                                // Read Form Parameters from body
                                let mut entries = match Multipart::with_body(&body.to_vec()[..], boundary)
                                    .save()
                                    .size_limit(multipart_form_size_limit)
                                    .temp()
                                {
                                    SaveResult::Full(entries) => {
                                        entries
                                    },
                                    SaveResult::Partial(_, PartialReason::CountLimit) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Unable to process message part due to excessive parts".to_string()))
                                                        .expect("Unable to create Bad Request response due to excessive parts"))
                                    },
                                    SaveResult::Partial(_, PartialReason::SizeLimit) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Unable to process message part due to excessive data".to_string()))
                                                        .expect("Unable to create Bad Request response due to excessive data"))
                                    },
                                    SaveResult::Partial(_, PartialReason::Utf8Error(_)) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Unable to process message part due to invalid data".to_string()))
                                                        .expect("Unable to create Bad Request response due to invalid data"))
                                    },
                                    SaveResult::Partial(_, PartialReason::IoError(_)) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::INTERNAL_SERVER_ERROR)
                                                        .body(BoxBody::new("Failed to process message part due an internal error".to_string()))
                                                        .expect("Unable to create Internal Server Error response due to an internal error"))
                                    },
                                    SaveResult::Error(e) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::INTERNAL_SERVER_ERROR)
                                                        .body(BoxBody::new("Failed to process all message parts due to an internal error".to_string()))
                                                        .expect("Unable to create Internal Server Error response due to an internal error"))
                                    },
                                };
                                let field_file = entries.fields.remove("file");
                                let param_file = match field_file {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for file");
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let file_model: swagger::ByteArray = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(BoxBody::new(format!("file data does not match API definition : {e}")))
                                                    .expect("Unable to create Bad Request due to missing required form parameter file"))
                                            }
                                        };
                                        file_model
                                    },
                                    None => {
                                        return Ok(
                                            Response::builder()
                                            .status(StatusCode::BAD_REQUEST)
                                            .body(BoxBody::new("Missing required form parameter file".to_string()))
                                            .expect("Unable to create Bad Request due to missing required form parameter file"))
                                    }
                                };
                                let field_model = entries.fields.remove("model");
                                let param_model = match field_model {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for model");
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let model_model: models::CreateTranscriptionRequestModel = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(BoxBody::new(format!("model data does not match API definition : {e}")))
                                                    .expect("Unable to create Bad Request due to missing required form parameter model"))
                                            }
                                        };
                                        model_model
                                    },
                                    None => {
                                        return Ok(
                                            Response::builder()
                                            .status(StatusCode::BAD_REQUEST)
                                            .body(BoxBody::new("Missing required form parameter model".to_string()))
                                            .expect("Unable to create Bad Request due to missing required form parameter model"))
                                    }
                                };
                                let field_language = entries.fields.remove("language");
                                let param_language = match field_language {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for language");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let language_model: String = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(BoxBody::new(format!("language data does not match API definition : {e}")))
                                                    .expect("Unable to create Bad Request due to missing required form parameter language"))
                                            }
                                        };
                                        language_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_prompt = entries.fields.remove("prompt");
                                let param_prompt = match field_prompt {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for prompt");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let prompt_model: String = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(BoxBody::new(format!("prompt data does not match API definition : {e}")))
                                                    .expect("Unable to create Bad Request due to missing required form parameter prompt"))
                                            }
                                        };
                                        prompt_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_response_format = entries.fields.remove("response_format");
                                let param_response_format = match field_response_format {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for response_format");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let response_format_model: models::AudioResponseFormat = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(BoxBody::new(format!("response_format data does not match API definition : {e}")))
                                                    .expect("Unable to create Bad Request due to missing required form parameter response_format"))
                                            }
                                        };
                                        response_format_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_temperature = entries.fields.remove("temperature");
                                let param_temperature = match field_temperature {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for temperature");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let temperature_model: f64 = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(BoxBody::new(format!("temperature data does not match API definition : {e}")))
                                                    .expect("Unable to create Bad Request due to missing required form parameter temperature"))
                                            }
                                        };
                                        temperature_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_timestamp_granularities_left_square_bracket_right_square_bracket = entries.fields.remove("timestamp_granularities_left_square_bracket_right_square_bracket");
                                let param_timestamp_granularities_left_square_bracket_right_square_bracket = match field_timestamp_granularities_left_square_bracket_right_square_bracket {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for timestamp_granularities_left_square_bracket_right_square_bracket");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let timestamp_granularities_left_square_bracket_right_square_bracket_model: Vec<models::CreateTranscriptionRequestTimestampGranularitiesInner> = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(BoxBody::new(format!("timestamp_granularities_left_square_bracket_right_square_bracket data does not match API definition : {e}")))
                                                    .expect("Unable to create Bad Request due to missing required form parameter timestamp_granularities_left_square_bracket_right_square_bracket"))
                                            }
                                        };
                                        timestamp_granularities_left_square_bracket_right_square_bracket_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };


                                let result = api_impl.create_transcription(
                                            param_file,
                                            param_model,
                                            param_language,
                                            param_prompt,
                                            param_response_format,
                                            param_temperature,
                                            param_timestamp_granularities_left_square_bracket_right_square_bracket.as_ref(),
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateTranscriptionResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // CreateTranslation - POST /audio/translations
            hyper::Method::POST if path.matched(paths::ID_AUDIO_TRANSLATIONS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let boundary = match swagger::multipart::form::boundary(&headers) {
                                    Some(boundary) => boundary.to_string(),
                                    None => return Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(BoxBody::new("Couldn't find valid multipart body".to_string()))
                                                .expect("Unable to create Bad Request response for incorrect boundary")),
                                };

                                use std::io::Read;

                                // Read Form Parameters from body
                                let mut entries = match Multipart::with_body(&body.to_vec()[..], boundary)
                                    .save()
                                    .size_limit(multipart_form_size_limit)
                                    .temp()
                                {
                                    SaveResult::Full(entries) => {
                                        entries
                                    },
                                    SaveResult::Partial(_, PartialReason::CountLimit) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Unable to process message part due to excessive parts".to_string()))
                                                        .expect("Unable to create Bad Request response due to excessive parts"))
                                    },
                                    SaveResult::Partial(_, PartialReason::SizeLimit) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Unable to process message part due to excessive data".to_string()))
                                                        .expect("Unable to create Bad Request response due to excessive data"))
                                    },
                                    SaveResult::Partial(_, PartialReason::Utf8Error(_)) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Unable to process message part due to invalid data".to_string()))
                                                        .expect("Unable to create Bad Request response due to invalid data"))
                                    },
                                    SaveResult::Partial(_, PartialReason::IoError(_)) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::INTERNAL_SERVER_ERROR)
                                                        .body(BoxBody::new("Failed to process message part due an internal error".to_string()))
                                                        .expect("Unable to create Internal Server Error response due to an internal error"))
                                    },
                                    SaveResult::Error(e) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::INTERNAL_SERVER_ERROR)
                                                        .body(BoxBody::new("Failed to process all message parts due to an internal error".to_string()))
                                                        .expect("Unable to create Internal Server Error response due to an internal error"))
                                    },
                                };
                                let field_file = entries.fields.remove("file");
                                let param_file = match field_file {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for file");
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let file_model: swagger::ByteArray = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(BoxBody::new(format!("file data does not match API definition : {e}")))
                                                    .expect("Unable to create Bad Request due to missing required form parameter file"))
                                            }
                                        };
                                        file_model
                                    },
                                    None => {
                                        return Ok(
                                            Response::builder()
                                            .status(StatusCode::BAD_REQUEST)
                                            .body(BoxBody::new("Missing required form parameter file".to_string()))
                                            .expect("Unable to create Bad Request due to missing required form parameter file"))
                                    }
                                };
                                let field_model = entries.fields.remove("model");
                                let param_model = match field_model {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for model");
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let model_model: models::CreateTranscriptionRequestModel = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(BoxBody::new(format!("model data does not match API definition : {e}")))
                                                    .expect("Unable to create Bad Request due to missing required form parameter model"))
                                            }
                                        };
                                        model_model
                                    },
                                    None => {
                                        return Ok(
                                            Response::builder()
                                            .status(StatusCode::BAD_REQUEST)
                                            .body(BoxBody::new("Missing required form parameter model".to_string()))
                                            .expect("Unable to create Bad Request due to missing required form parameter model"))
                                    }
                                };
                                let field_prompt = entries.fields.remove("prompt");
                                let param_prompt = match field_prompt {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for prompt");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let prompt_model: String = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(BoxBody::new(format!("prompt data does not match API definition : {e}")))
                                                    .expect("Unable to create Bad Request due to missing required form parameter prompt"))
                                            }
                                        };
                                        prompt_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_response_format = entries.fields.remove("response_format");
                                let param_response_format = match field_response_format {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for response_format");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let response_format_model: models::AudioResponseFormat = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(BoxBody::new(format!("response_format data does not match API definition : {e}")))
                                                    .expect("Unable to create Bad Request due to missing required form parameter response_format"))
                                            }
                                        };
                                        response_format_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_temperature = entries.fields.remove("temperature");
                                let param_temperature = match field_temperature {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for temperature");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let temperature_model: f64 = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(BoxBody::new(format!("temperature data does not match API definition : {e}")))
                                                    .expect("Unable to create Bad Request due to missing required form parameter temperature"))
                                            }
                                        };
                                        temperature_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };


                                let result = api_impl.create_translation(
                                            param_file,
                                            param_model,
                                            param_prompt,
                                            param_response_format,
                                            param_temperature,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateTranslationResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // ListAuditLogs - GET /organization/audit_logs
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_AUDIT_LOGS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_effective_at = query_params.iter().filter(|e| e.0 == "effective_at").map(|e| e.1.clone())
                    .next();
                let param_effective_at = match param_effective_at {
                    Some(param_effective_at) => {
                        let param_effective_at =
                            <models::ListAuditLogsEffectiveAtParameter as std::str::FromStr>::from_str
                                (&param_effective_at);
                        match param_effective_at {
                            Ok(param_effective_at) => Some(param_effective_at),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter effective_at - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter effective_at")),
                        }
                    },
                    None => None,
                };
    #[cfg(not(feature = "validate"))]
                run_validation!(param_effective_at, "effective_at", validation);
                let param_project_ids_left_square_bracket_right_square_bracket = query_params.iter().filter(|e| e.0 == "project_ids[]").map(|e| e.1.clone())
                    .filter_map(|param_project_ids_left_square_bracket_right_square_bracket| param_project_ids_left_square_bracket_right_square_bracket.parse().ok())
                    .collect::<Vec<_>>();
                let param_project_ids_left_square_bracket_right_square_bracket = if !param_project_ids_left_square_bracket_right_square_bracket.is_empty() {
                    Some(param_project_ids_left_square_bracket_right_square_bracket)
                } else {
                    None
                };
                let param_event_types_left_square_bracket_right_square_bracket = query_params.iter().filter(|e| e.0 == "event_types[]").map(|e| e.1.clone())
                    .filter_map(|param_event_types_left_square_bracket_right_square_bracket| param_event_types_left_square_bracket_right_square_bracket.parse().ok())
                    .collect::<Vec<_>>();
                let param_event_types_left_square_bracket_right_square_bracket = if !param_event_types_left_square_bracket_right_square_bracket.is_empty() {
                    Some(param_event_types_left_square_bracket_right_square_bracket)
                } else {
                    None
                };
                let param_actor_ids_left_square_bracket_right_square_bracket = query_params.iter().filter(|e| e.0 == "actor_ids[]").map(|e| e.1.clone())
                    .filter_map(|param_actor_ids_left_square_bracket_right_square_bracket| param_actor_ids_left_square_bracket_right_square_bracket.parse().ok())
                    .collect::<Vec<_>>();
                let param_actor_ids_left_square_bracket_right_square_bracket = if !param_actor_ids_left_square_bracket_right_square_bracket.is_empty() {
                    Some(param_actor_ids_left_square_bracket_right_square_bracket)
                } else {
                    None
                };
                let param_actor_emails_left_square_bracket_right_square_bracket = query_params.iter().filter(|e| e.0 == "actor_emails[]").map(|e| e.1.clone())
                    .filter_map(|param_actor_emails_left_square_bracket_right_square_bracket| param_actor_emails_left_square_bracket_right_square_bracket.parse().ok())
                    .collect::<Vec<_>>();
                let param_actor_emails_left_square_bracket_right_square_bracket = if !param_actor_emails_left_square_bracket_right_square_bracket.is_empty() {
                    Some(param_actor_emails_left_square_bracket_right_square_bracket)
                } else {
                    None
                };
                let param_resource_ids_left_square_bracket_right_square_bracket = query_params.iter().filter(|e| e.0 == "resource_ids[]").map(|e| e.1.clone())
                    .filter_map(|param_resource_ids_left_square_bracket_right_square_bracket| param_resource_ids_left_square_bracket_right_square_bracket.parse().ok())
                    .collect::<Vec<_>>();
                let param_resource_ids_left_square_bracket_right_square_bracket = if !param_resource_ids_left_square_bracket_right_square_bracket.is_empty() {
                    Some(param_resource_ids_left_square_bracket_right_square_bracket)
                } else {
                    None
                };
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter limit - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_after = query_params.iter().filter(|e| e.0 == "after").map(|e| e.1.clone())
                    .next();
                let param_after = match param_after {
                    Some(param_after) => {
                        let param_after =
                            <String as std::str::FromStr>::from_str
                                (&param_after);
                        match param_after {
                            Ok(param_after) => Some(param_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter after - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter after")),
                        }
                    },
                    None => None,
                };
                let param_before = query_params.iter().filter(|e| e.0 == "before").map(|e| e.1.clone())
                    .next();
                let param_before = match param_before {
                    Some(param_before) => {
                        let param_before =
                            <String as std::str::FromStr>::from_str
                                (&param_before);
                        match param_before {
                            Ok(param_before) => Some(param_before),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter before - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter before")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.list_audit_logs(
                                            param_effective_at,
                                            param_project_ids_left_square_bracket_right_square_bracket.as_ref(),
                                            param_event_types_left_square_bracket_right_square_bracket.as_ref(),
                                            param_actor_ids_left_square_bracket_right_square_bracket.as_ref(),
                                            param_actor_emails_left_square_bracket_right_square_bracket.as_ref(),
                                            param_resource_ids_left_square_bracket_right_square_bracket.as_ref(),
                                            param_limit,
                                            param_after,
                                            param_before,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListAuditLogsResponse::AuditLogsListedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // CreateBatch - POST /batches
            hyper::Method::POST if path.matched(paths::ID_BATCHES) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_create_batch_request: Option<models::CreateBatchRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_batch_request) => param_create_batch_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter CreateBatchRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CreateBatchRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_create_batch_request = match param_create_batch_request {
                                    Some(param_create_batch_request) => param_create_batch_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter CreateBatchRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter CreateBatchRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_create_batch_request, "CreateBatchRequest", validation);


                                let result = api_impl.create_batch(
                                            param_create_batch_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateBatchResponse::BatchCreatedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // ListBatches - GET /batches
            hyper::Method::GET if path.matched(paths::ID_BATCHES) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_after = query_params.iter().filter(|e| e.0 == "after").map(|e| e.1.clone())
                    .next();
                let param_after = match param_after {
                    Some(param_after) => {
                        let param_after =
                            <String as std::str::FromStr>::from_str
                                (&param_after);
                        match param_after {
                            Ok(param_after) => Some(param_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter after - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter after")),
                        }
                    },
                    None => None,
                };
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter limit - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.list_batches(
                                            param_after,
                                            param_limit,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListBatchesResponse::BatchListedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // CancelBatch - POST /batches/{batch_id}/cancel
            hyper::Method::POST if path.matched(paths::ID_BATCHES_BATCH_ID_CANCEL) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_BATCHES_BATCH_ID_CANCEL
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE BATCHES_BATCH_ID_CANCEL in set but failed match against \"{}\"", path, paths::REGEX_BATCHES_BATCH_ID_CANCEL.as_str())
                    );

                let param_batch_id = match percent_encoding::percent_decode(path_params["batch_id"].as_bytes()).decode_utf8() {
                    Ok(param_batch_id) => match param_batch_id.parse::<String>() {
                        Ok(param_batch_id) => param_batch_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter batch_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["batch_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.cancel_batch(
                                            param_batch_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CancelBatchResponse::BatchIsCancelling
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // RetrieveBatch - GET /batches/{batch_id}
            hyper::Method::GET if path.matched(paths::ID_BATCHES_BATCH_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_BATCHES_BATCH_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE BATCHES_BATCH_ID in set but failed match against \"{}\"", path, paths::REGEX_BATCHES_BATCH_ID.as_str())
                    );

                let param_batch_id = match percent_encoding::percent_decode(path_params["batch_id"].as_bytes()).decode_utf8() {
                    Ok(param_batch_id) => match param_batch_id.parse::<String>() {
                        Ok(param_batch_id) => param_batch_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter batch_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["batch_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.retrieve_batch(
                                            param_batch_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                RetrieveBatchResponse::BatchRetrievedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // CreateChatCompletion - POST /chat/completions
            hyper::Method::POST if path.matched(paths::ID_CHAT_COMPLETIONS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_create_chat_completion_request: Option<models::CreateChatCompletionRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_chat_completion_request) => param_create_chat_completion_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter CreateChatCompletionRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CreateChatCompletionRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_create_chat_completion_request = match param_create_chat_completion_request {
                                    Some(param_create_chat_completion_request) => param_create_chat_completion_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter CreateChatCompletionRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter CreateChatCompletionRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_create_chat_completion_request, "CreateChatCompletionRequest", validation);


                                let result = api_impl.create_chat_completion(
                                            param_create_chat_completion_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateChatCompletionResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // CreateCompletion - POST /completions
            hyper::Method::POST if path.matched(paths::ID_COMPLETIONS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_create_completion_request: Option<models::CreateCompletionRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_completion_request) => param_create_completion_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter CreateCompletionRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CreateCompletionRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_create_completion_request = match param_create_completion_request {
                                    Some(param_create_completion_request) => param_create_completion_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter CreateCompletionRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter CreateCompletionRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_create_completion_request, "CreateCompletionRequest", validation);


                                let result = api_impl.create_completion(
                                            param_create_completion_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateCompletionResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // AdminApiKeysCreate - POST /organization/admin_api_keys
            hyper::Method::POST if path.matched(paths::ID_ORGANIZATION_ADMIN_API_KEYS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_admin_api_keys_create_request: Option<models::AdminApiKeysCreateRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_admin_api_keys_create_request) => param_admin_api_keys_create_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter AdminApiKeysCreateRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter AdminApiKeysCreateRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_admin_api_keys_create_request = match param_admin_api_keys_create_request {
                                    Some(param_admin_api_keys_create_request) => param_admin_api_keys_create_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter AdminApiKeysCreateRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter AdminApiKeysCreateRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_admin_api_keys_create_request, "AdminApiKeysCreateRequest", validation);


                                let result = api_impl.admin_api_keys_create(
                                            param_admin_api_keys_create_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                AdminApiKeysCreateResponse::TheNewlyCreatedAdminAPIKey
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // AdminApiKeysList - GET /organization/admin_api_keys
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_ADMIN_API_KEYS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_after = query_params.iter().filter(|e| e.0 == "after").map(|e| e.1.clone())
                    .next();
                let param_after = match param_after {
                    Some(param_after) => {
                        let param_after =
                            <swagger::Nullable<String> as std::str::FromStr>::from_str
                                (&param_after);
                        match param_after {
                            Ok(param_after) => Some(param_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter after - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter after")),
                        }
                    },
                    None => None,
                };
                let param_order = query_params.iter().filter(|e| e.0 == "order").map(|e| e.1.clone())
                    .next();
                let param_order = match param_order {
                    Some(param_order) => {
                        let param_order =
                            <models::AdminApiKeysListOrderParameter as std::str::FromStr>::from_str
                                (&param_order);
                        match param_order {
                            Ok(param_order) => Some(param_order),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter order - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter order")),
                        }
                    },
                    None => None,
                };
    #[cfg(not(feature = "validate"))]
                run_validation!(param_order, "order", validation);
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter limit - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.admin_api_keys_list(
                                            param_after,
                                            param_order,
                                            param_limit,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                AdminApiKeysListResponse::AListOfOrganizationAPIKeys
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // AdminApiKeysDelete - DELETE /organization/admin_api_keys/{key_id}
            hyper::Method::DELETE if path.matched(paths::ID_ORGANIZATION_ADMIN_API_KEYS_KEY_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ORGANIZATION_ADMIN_API_KEYS_KEY_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ORGANIZATION_ADMIN_API_KEYS_KEY_ID in set but failed match against \"{}\"", path, paths::REGEX_ORGANIZATION_ADMIN_API_KEYS_KEY_ID.as_str())
                    );

                let param_key_id = match percent_encoding::percent_decode(path_params["key_id"].as_bytes()).decode_utf8() {
                    Ok(param_key_id) => match param_key_id.parse::<String>() {
                        Ok(param_key_id) => param_key_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter key_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["key_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.admin_api_keys_delete(
                                            param_key_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                AdminApiKeysDeleteResponse::ConfirmationThatTheAPIKeyWasDeleted
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // AdminApiKeysGet - GET /organization/admin_api_keys/{key_id}
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_ADMIN_API_KEYS_KEY_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ORGANIZATION_ADMIN_API_KEYS_KEY_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ORGANIZATION_ADMIN_API_KEYS_KEY_ID in set but failed match against \"{}\"", path, paths::REGEX_ORGANIZATION_ADMIN_API_KEYS_KEY_ID.as_str())
                    );

                let param_key_id = match percent_encoding::percent_decode(path_params["key_id"].as_bytes()).decode_utf8() {
                    Ok(param_key_id) => match param_key_id.parse::<String>() {
                        Ok(param_key_id) => param_key_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter key_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["key_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.admin_api_keys_get(
                                            param_key_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                AdminApiKeysGetResponse::DetailsOfTheRequestedAPIKey
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // CreateEmbedding - POST /embeddings
            hyper::Method::POST if path.matched(paths::ID_EMBEDDINGS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_create_embedding_request: Option<models::CreateEmbeddingRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_embedding_request) => param_create_embedding_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter CreateEmbeddingRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CreateEmbeddingRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_create_embedding_request = match param_create_embedding_request {
                                    Some(param_create_embedding_request) => param_create_embedding_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter CreateEmbeddingRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter CreateEmbeddingRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_create_embedding_request, "CreateEmbeddingRequest", validation);


                                let result = api_impl.create_embedding(
                                            param_create_embedding_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateEmbeddingResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // CreateFile - POST /files
            hyper::Method::POST if path.matched(paths::ID_FILES) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let boundary = match swagger::multipart::form::boundary(&headers) {
                                    Some(boundary) => boundary.to_string(),
                                    None => return Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(BoxBody::new("Couldn't find valid multipart body".to_string()))
                                                .expect("Unable to create Bad Request response for incorrect boundary")),
                                };

                                use std::io::Read;

                                // Read Form Parameters from body
                                let mut entries = match Multipart::with_body(&body.to_vec()[..], boundary)
                                    .save()
                                    .size_limit(multipart_form_size_limit)
                                    .temp()
                                {
                                    SaveResult::Full(entries) => {
                                        entries
                                    },
                                    SaveResult::Partial(_, PartialReason::CountLimit) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Unable to process message part due to excessive parts".to_string()))
                                                        .expect("Unable to create Bad Request response due to excessive parts"))
                                    },
                                    SaveResult::Partial(_, PartialReason::SizeLimit) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Unable to process message part due to excessive data".to_string()))
                                                        .expect("Unable to create Bad Request response due to excessive data"))
                                    },
                                    SaveResult::Partial(_, PartialReason::Utf8Error(_)) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Unable to process message part due to invalid data".to_string()))
                                                        .expect("Unable to create Bad Request response due to invalid data"))
                                    },
                                    SaveResult::Partial(_, PartialReason::IoError(_)) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::INTERNAL_SERVER_ERROR)
                                                        .body(BoxBody::new("Failed to process message part due an internal error".to_string()))
                                                        .expect("Unable to create Internal Server Error response due to an internal error"))
                                    },
                                    SaveResult::Error(e) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::INTERNAL_SERVER_ERROR)
                                                        .body(BoxBody::new("Failed to process all message parts due to an internal error".to_string()))
                                                        .expect("Unable to create Internal Server Error response due to an internal error"))
                                    },
                                };
                                let field_file = entries.fields.remove("file");
                                let param_file = match field_file {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for file");
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let file_model: swagger::ByteArray = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(BoxBody::new(format!("file data does not match API definition : {e}")))
                                                    .expect("Unable to create Bad Request due to missing required form parameter file"))
                                            }
                                        };
                                        file_model
                                    },
                                    None => {
                                        return Ok(
                                            Response::builder()
                                            .status(StatusCode::BAD_REQUEST)
                                            .body(BoxBody::new("Missing required form parameter file".to_string()))
                                            .expect("Unable to create Bad Request due to missing required form parameter file"))
                                    }
                                };
                                let field_purpose = entries.fields.remove("purpose");
                                let param_purpose = match field_purpose {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for purpose");
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let purpose_model: models::CreateFileRequestPurpose = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(BoxBody::new(format!("purpose data does not match API definition : {e}")))
                                                    .expect("Unable to create Bad Request due to missing required form parameter purpose"))
                                            }
                                        };
                                        purpose_model
                                    },
                                    None => {
                                        return Ok(
                                            Response::builder()
                                            .status(StatusCode::BAD_REQUEST)
                                            .body(BoxBody::new("Missing required form parameter purpose".to_string()))
                                            .expect("Unable to create Bad Request due to missing required form parameter purpose"))
                                    }
                                };


                                let result = api_impl.create_file(
                                            param_file,
                                            param_purpose,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateFileResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // ListFiles - GET /files
            hyper::Method::GET if path.matched(paths::ID_FILES) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_purpose = query_params.iter().filter(|e| e.0 == "purpose").map(|e| e.1.clone())
                    .next();
                let param_purpose = match param_purpose {
                    Some(param_purpose) => {
                        let param_purpose =
                            <String as std::str::FromStr>::from_str
                                (&param_purpose);
                        match param_purpose {
                            Ok(param_purpose) => Some(param_purpose),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter purpose - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter purpose")),
                        }
                    },
                    None => None,
                };
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter limit - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_order = query_params.iter().filter(|e| e.0 == "order").map(|e| e.1.clone())
                    .next();
                let param_order = match param_order {
                    Some(param_order) => {
                        let param_order =
                            <models::ListAssistantsOrderParameter as std::str::FromStr>::from_str
                                (&param_order);
                        match param_order {
                            Ok(param_order) => Some(param_order),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter order - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter order")),
                        }
                    },
                    None => None,
                };
    #[cfg(not(feature = "validate"))]
                run_validation!(param_order, "order", validation);
                let param_after = query_params.iter().filter(|e| e.0 == "after").map(|e| e.1.clone())
                    .next();
                let param_after = match param_after {
                    Some(param_after) => {
                        let param_after =
                            <String as std::str::FromStr>::from_str
                                (&param_after);
                        match param_after {
                            Ok(param_after) => Some(param_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter after - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter after")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.list_files(
                                            param_purpose,
                                            param_limit,
                                            param_order,
                                            param_after,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListFilesResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // DeleteFile - DELETE /files/{file_id}
            hyper::Method::DELETE if path.matched(paths::ID_FILES_FILE_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_FILES_FILE_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FILES_FILE_ID in set but failed match against \"{}\"", path, paths::REGEX_FILES_FILE_ID.as_str())
                    );

                let param_file_id = match percent_encoding::percent_decode(path_params["file_id"].as_bytes()).decode_utf8() {
                    Ok(param_file_id) => match param_file_id.parse::<String>() {
                        Ok(param_file_id) => param_file_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter file_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["file_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.delete_file(
                                            param_file_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteFileResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // DownloadFile - GET /files/{file_id}/content
            hyper::Method::GET if path.matched(paths::ID_FILES_FILE_ID_CONTENT) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_FILES_FILE_ID_CONTENT
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FILES_FILE_ID_CONTENT in set but failed match against \"{}\"", path, paths::REGEX_FILES_FILE_ID_CONTENT.as_str())
                    );

                let param_file_id = match percent_encoding::percent_decode(path_params["file_id"].as_bytes()).decode_utf8() {
                    Ok(param_file_id) => match param_file_id.parse::<String>() {
                        Ok(param_file_id) => param_file_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter file_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["file_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.download_file(
                                            param_file_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DownloadFileResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // RetrieveFile - GET /files/{file_id}
            hyper::Method::GET if path.matched(paths::ID_FILES_FILE_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_FILES_FILE_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FILES_FILE_ID in set but failed match against \"{}\"", path, paths::REGEX_FILES_FILE_ID.as_str())
                    );

                let param_file_id = match percent_encoding::percent_decode(path_params["file_id"].as_bytes()).decode_utf8() {
                    Ok(param_file_id) => match param_file_id.parse::<String>() {
                        Ok(param_file_id) => param_file_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter file_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["file_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.retrieve_file(
                                            param_file_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                RetrieveFileResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // CreateFineTuningJob - POST /fine_tuning/jobs
            hyper::Method::POST if path.matched(paths::ID_FINE_TUNING_JOBS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_create_fine_tuning_job_request: Option<models::CreateFineTuningJobRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_fine_tuning_job_request) => param_create_fine_tuning_job_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter CreateFineTuningJobRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CreateFineTuningJobRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_create_fine_tuning_job_request = match param_create_fine_tuning_job_request {
                                    Some(param_create_fine_tuning_job_request) => param_create_fine_tuning_job_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter CreateFineTuningJobRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter CreateFineTuningJobRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_create_fine_tuning_job_request, "CreateFineTuningJobRequest", validation);


                                let result = api_impl.create_fine_tuning_job(
                                            param_create_fine_tuning_job_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateFineTuningJobResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // ListPaginatedFineTuningJobs - GET /fine_tuning/jobs
            hyper::Method::GET if path.matched(paths::ID_FINE_TUNING_JOBS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_after = query_params.iter().filter(|e| e.0 == "after").map(|e| e.1.clone())
                    .next();
                let param_after = match param_after {
                    Some(param_after) => {
                        let param_after =
                            <String as std::str::FromStr>::from_str
                                (&param_after);
                        match param_after {
                            Ok(param_after) => Some(param_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter after - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter after")),
                        }
                    },
                    None => None,
                };
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter limit - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.list_paginated_fine_tuning_jobs(
                                            param_after,
                                            param_limit,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListPaginatedFineTuningJobsResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // CancelFineTuningJob - POST /fine_tuning/jobs/{fine_tuning_job_id}/cancel
            hyper::Method::POST if path.matched(paths::ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CANCEL) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CANCEL
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CANCEL in set but failed match against \"{}\"", path, paths::REGEX_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CANCEL.as_str())
                    );

                let param_fine_tuning_job_id = match percent_encoding::percent_decode(path_params["fine_tuning_job_id"].as_bytes()).decode_utf8() {
                    Ok(param_fine_tuning_job_id) => match param_fine_tuning_job_id.parse::<String>() {
                        Ok(param_fine_tuning_job_id) => param_fine_tuning_job_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter fine_tuning_job_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["fine_tuning_job_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.cancel_fine_tuning_job(
                                            param_fine_tuning_job_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CancelFineTuningJobResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ListFineTuningEvents - GET /fine_tuning/jobs/{fine_tuning_job_id}/events
            hyper::Method::GET if path.matched(paths::ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_EVENTS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_EVENTS
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_EVENTS in set but failed match against \"{}\"", path, paths::REGEX_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_EVENTS.as_str())
                    );

                let param_fine_tuning_job_id = match percent_encoding::percent_decode(path_params["fine_tuning_job_id"].as_bytes()).decode_utf8() {
                    Ok(param_fine_tuning_job_id) => match param_fine_tuning_job_id.parse::<String>() {
                        Ok(param_fine_tuning_job_id) => param_fine_tuning_job_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter fine_tuning_job_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["fine_tuning_job_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_after = query_params.iter().filter(|e| e.0 == "after").map(|e| e.1.clone())
                    .next();
                let param_after = match param_after {
                    Some(param_after) => {
                        let param_after =
                            <String as std::str::FromStr>::from_str
                                (&param_after);
                        match param_after {
                            Ok(param_after) => Some(param_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter after - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter after")),
                        }
                    },
                    None => None,
                };
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter limit - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.list_fine_tuning_events(
                                            param_fine_tuning_job_id,
                                            param_after,
                                            param_limit,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListFineTuningEventsResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ListFineTuningJobCheckpoints - GET /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints
            hyper::Method::GET if path.matched(paths::ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CHECKPOINTS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CHECKPOINTS
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CHECKPOINTS in set but failed match against \"{}\"", path, paths::REGEX_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CHECKPOINTS.as_str())
                    );

                let param_fine_tuning_job_id = match percent_encoding::percent_decode(path_params["fine_tuning_job_id"].as_bytes()).decode_utf8() {
                    Ok(param_fine_tuning_job_id) => match param_fine_tuning_job_id.parse::<String>() {
                        Ok(param_fine_tuning_job_id) => param_fine_tuning_job_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter fine_tuning_job_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["fine_tuning_job_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_after = query_params.iter().filter(|e| e.0 == "after").map(|e| e.1.clone())
                    .next();
                let param_after = match param_after {
                    Some(param_after) => {
                        let param_after =
                            <String as std::str::FromStr>::from_str
                                (&param_after);
                        match param_after {
                            Ok(param_after) => Some(param_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter after - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter after")),
                        }
                    },
                    None => None,
                };
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter limit - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.list_fine_tuning_job_checkpoints(
                                            param_fine_tuning_job_id,
                                            param_after,
                                            param_limit,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListFineTuningJobCheckpointsResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // RetrieveFineTuningJob - GET /fine_tuning/jobs/{fine_tuning_job_id}
            hyper::Method::GET if path.matched(paths::ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FINE_TUNING_JOBS_FINE_TUNING_JOB_ID in set but failed match against \"{}\"", path, paths::REGEX_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID.as_str())
                    );

                let param_fine_tuning_job_id = match percent_encoding::percent_decode(path_params["fine_tuning_job_id"].as_bytes()).decode_utf8() {
                    Ok(param_fine_tuning_job_id) => match param_fine_tuning_job_id.parse::<String>() {
                        Ok(param_fine_tuning_job_id) => param_fine_tuning_job_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter fine_tuning_job_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["fine_tuning_job_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.retrieve_fine_tuning_job(
                                            param_fine_tuning_job_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                RetrieveFineTuningJobResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // CreateImage - POST /images/generations
            hyper::Method::POST if path.matched(paths::ID_IMAGES_GENERATIONS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_create_image_request: Option<models::CreateImageRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_image_request) => param_create_image_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter CreateImageRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CreateImageRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_create_image_request = match param_create_image_request {
                                    Some(param_create_image_request) => param_create_image_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter CreateImageRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter CreateImageRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_create_image_request, "CreateImageRequest", validation);


                                let result = api_impl.create_image(
                                            param_create_image_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateImageResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // CreateImageEdit - POST /images/edits
            hyper::Method::POST if path.matched(paths::ID_IMAGES_EDITS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let boundary = match swagger::multipart::form::boundary(&headers) {
                                    Some(boundary) => boundary.to_string(),
                                    None => return Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(BoxBody::new("Couldn't find valid multipart body".to_string()))
                                                .expect("Unable to create Bad Request response for incorrect boundary")),
                                };

                                use std::io::Read;

                                // Read Form Parameters from body
                                let mut entries = match Multipart::with_body(&body.to_vec()[..], boundary)
                                    .save()
                                    .size_limit(multipart_form_size_limit)
                                    .temp()
                                {
                                    SaveResult::Full(entries) => {
                                        entries
                                    },
                                    SaveResult::Partial(_, PartialReason::CountLimit) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Unable to process message part due to excessive parts".to_string()))
                                                        .expect("Unable to create Bad Request response due to excessive parts"))
                                    },
                                    SaveResult::Partial(_, PartialReason::SizeLimit) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Unable to process message part due to excessive data".to_string()))
                                                        .expect("Unable to create Bad Request response due to excessive data"))
                                    },
                                    SaveResult::Partial(_, PartialReason::Utf8Error(_)) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Unable to process message part due to invalid data".to_string()))
                                                        .expect("Unable to create Bad Request response due to invalid data"))
                                    },
                                    SaveResult::Partial(_, PartialReason::IoError(_)) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::INTERNAL_SERVER_ERROR)
                                                        .body(BoxBody::new("Failed to process message part due an internal error".to_string()))
                                                        .expect("Unable to create Internal Server Error response due to an internal error"))
                                    },
                                    SaveResult::Error(e) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::INTERNAL_SERVER_ERROR)
                                                        .body(BoxBody::new("Failed to process all message parts due to an internal error".to_string()))
                                                        .expect("Unable to create Internal Server Error response due to an internal error"))
                                    },
                                };
                                let field_image = entries.fields.remove("image");
                                let param_image = match field_image {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for image");
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let image_model: swagger::ByteArray = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(BoxBody::new(format!("image data does not match API definition : {e}")))
                                                    .expect("Unable to create Bad Request due to missing required form parameter image"))
                                            }
                                        };
                                        image_model
                                    },
                                    None => {
                                        return Ok(
                                            Response::builder()
                                            .status(StatusCode::BAD_REQUEST)
                                            .body(BoxBody::new("Missing required form parameter image".to_string()))
                                            .expect("Unable to create Bad Request due to missing required form parameter image"))
                                    }
                                };
                                let field_prompt = entries.fields.remove("prompt");
                                let param_prompt = match field_prompt {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for prompt");
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let prompt_model: String = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(BoxBody::new(format!("prompt data does not match API definition : {e}")))
                                                    .expect("Unable to create Bad Request due to missing required form parameter prompt"))
                                            }
                                        };
                                        prompt_model
                                    },
                                    None => {
                                        return Ok(
                                            Response::builder()
                                            .status(StatusCode::BAD_REQUEST)
                                            .body(BoxBody::new("Missing required form parameter prompt".to_string()))
                                            .expect("Unable to create Bad Request due to missing required form parameter prompt"))
                                    }
                                };
                                let field_mask = entries.fields.remove("mask");
                                let param_mask = match field_mask {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for mask");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let mask_model: swagger::ByteArray = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(BoxBody::new(format!("mask data does not match API definition : {e}")))
                                                    .expect("Unable to create Bad Request due to missing required form parameter mask"))
                                            }
                                        };
                                        mask_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_model = entries.fields.remove("model");
                                let param_model = match field_model {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for model");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let model_model: swagger::Nullable<models::CreateImageEditRequestModel> = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(BoxBody::new(format!("model data does not match API definition : {e}")))
                                                    .expect("Unable to create Bad Request due to missing required form parameter model"))
                                            }
                                        };
                                        model_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_n = entries.fields.remove("n");
                                let param_n = match field_n {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for n");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let n_model: swagger::Nullable<i32> = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(BoxBody::new(format!("n data does not match API definition : {e}")))
                                                    .expect("Unable to create Bad Request due to missing required form parameter n"))
                                            }
                                        };
                                        n_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_size = entries.fields.remove("size");
                                let param_size = match field_size {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for size");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let size_model: swagger::Nullable<models::CreateImageEditRequestSize> = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(BoxBody::new(format!("size data does not match API definition : {e}")))
                                                    .expect("Unable to create Bad Request due to missing required form parameter size"))
                                            }
                                        };
                                        size_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_response_format = entries.fields.remove("response_format");
                                let param_response_format = match field_response_format {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for response_format");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let response_format_model: swagger::Nullable<models::CreateImageEditRequestResponseFormat> = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(BoxBody::new(format!("response_format data does not match API definition : {e}")))
                                                    .expect("Unable to create Bad Request due to missing required form parameter response_format"))
                                            }
                                        };
                                        response_format_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_user = entries.fields.remove("user");
                                let param_user = match field_user {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for user");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let user_model: String = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(BoxBody::new(format!("user data does not match API definition : {e}")))
                                                    .expect("Unable to create Bad Request due to missing required form parameter user"))
                                            }
                                        };
                                        user_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };


                                let result = api_impl.create_image_edit(
                                            param_image,
                                            param_prompt,
                                            param_mask,
                                            param_model,
                                            param_n,
                                            param_size,
                                            param_response_format,
                                            param_user,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateImageEditResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // CreateImageVariation - POST /images/variations
            hyper::Method::POST if path.matched(paths::ID_IMAGES_VARIATIONS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let boundary = match swagger::multipart::form::boundary(&headers) {
                                    Some(boundary) => boundary.to_string(),
                                    None => return Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(BoxBody::new("Couldn't find valid multipart body".to_string()))
                                                .expect("Unable to create Bad Request response for incorrect boundary")),
                                };

                                use std::io::Read;

                                // Read Form Parameters from body
                                let mut entries = match Multipart::with_body(&body.to_vec()[..], boundary)
                                    .save()
                                    .size_limit(multipart_form_size_limit)
                                    .temp()
                                {
                                    SaveResult::Full(entries) => {
                                        entries
                                    },
                                    SaveResult::Partial(_, PartialReason::CountLimit) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Unable to process message part due to excessive parts".to_string()))
                                                        .expect("Unable to create Bad Request response due to excessive parts"))
                                    },
                                    SaveResult::Partial(_, PartialReason::SizeLimit) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Unable to process message part due to excessive data".to_string()))
                                                        .expect("Unable to create Bad Request response due to excessive data"))
                                    },
                                    SaveResult::Partial(_, PartialReason::Utf8Error(_)) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Unable to process message part due to invalid data".to_string()))
                                                        .expect("Unable to create Bad Request response due to invalid data"))
                                    },
                                    SaveResult::Partial(_, PartialReason::IoError(_)) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::INTERNAL_SERVER_ERROR)
                                                        .body(BoxBody::new("Failed to process message part due an internal error".to_string()))
                                                        .expect("Unable to create Internal Server Error response due to an internal error"))
                                    },
                                    SaveResult::Error(e) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::INTERNAL_SERVER_ERROR)
                                                        .body(BoxBody::new("Failed to process all message parts due to an internal error".to_string()))
                                                        .expect("Unable to create Internal Server Error response due to an internal error"))
                                    },
                                };
                                let field_image = entries.fields.remove("image");
                                let param_image = match field_image {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for image");
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let image_model: swagger::ByteArray = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(BoxBody::new(format!("image data does not match API definition : {e}")))
                                                    .expect("Unable to create Bad Request due to missing required form parameter image"))
                                            }
                                        };
                                        image_model
                                    },
                                    None => {
                                        return Ok(
                                            Response::builder()
                                            .status(StatusCode::BAD_REQUEST)
                                            .body(BoxBody::new("Missing required form parameter image".to_string()))
                                            .expect("Unable to create Bad Request due to missing required form parameter image"))
                                    }
                                };
                                let field_model = entries.fields.remove("model");
                                let param_model = match field_model {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for model");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let model_model: swagger::Nullable<models::CreateImageEditRequestModel> = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(BoxBody::new(format!("model data does not match API definition : {e}")))
                                                    .expect("Unable to create Bad Request due to missing required form parameter model"))
                                            }
                                        };
                                        model_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_n = entries.fields.remove("n");
                                let param_n = match field_n {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for n");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let n_model: swagger::Nullable<i32> = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(BoxBody::new(format!("n data does not match API definition : {e}")))
                                                    .expect("Unable to create Bad Request due to missing required form parameter n"))
                                            }
                                        };
                                        n_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_response_format = entries.fields.remove("response_format");
                                let param_response_format = match field_response_format {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for response_format");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let response_format_model: swagger::Nullable<models::CreateImageEditRequestResponseFormat> = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(BoxBody::new(format!("response_format data does not match API definition : {e}")))
                                                    .expect("Unable to create Bad Request due to missing required form parameter response_format"))
                                            }
                                        };
                                        response_format_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_size = entries.fields.remove("size");
                                let param_size = match field_size {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for size");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let size_model: swagger::Nullable<models::CreateImageEditRequestSize> = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(BoxBody::new(format!("size data does not match API definition : {e}")))
                                                    .expect("Unable to create Bad Request due to missing required form parameter size"))
                                            }
                                        };
                                        size_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_user = entries.fields.remove("user");
                                let param_user = match field_user {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for user");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let user_model: String = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(BoxBody::new(format!("user data does not match API definition : {e}")))
                                                    .expect("Unable to create Bad Request due to missing required form parameter user"))
                                            }
                                        };
                                        user_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };


                                let result = api_impl.create_image_variation(
                                            param_image,
                                            param_model,
                                            param_n,
                                            param_response_format,
                                            param_size,
                                            param_user,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateImageVariationResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // InviteUser - POST /organization/invites
            hyper::Method::POST if path.matched(paths::ID_ORGANIZATION_INVITES) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_invite_request: Option<models::InviteRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_invite_request) => param_invite_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter InviteRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter InviteRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_invite_request = match param_invite_request {
                                    Some(param_invite_request) => param_invite_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter InviteRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter InviteRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_invite_request, "InviteRequest", validation);


                                let result = api_impl.invite_user(
                                            param_invite_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                InviteUserResponse::UserInvitedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // ListInvites - GET /organization/invites
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_INVITES) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter limit - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_after = query_params.iter().filter(|e| e.0 == "after").map(|e| e.1.clone())
                    .next();
                let param_after = match param_after {
                    Some(param_after) => {
                        let param_after =
                            <String as std::str::FromStr>::from_str
                                (&param_after);
                        match param_after {
                            Ok(param_after) => Some(param_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter after - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter after")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.list_invites(
                                            param_limit,
                                            param_after,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListInvitesResponse::InvitesListedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // DeleteInvite - DELETE /organization/invites/{invite_id}
            hyper::Method::DELETE if path.matched(paths::ID_ORGANIZATION_INVITES_INVITE_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ORGANIZATION_INVITES_INVITE_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ORGANIZATION_INVITES_INVITE_ID in set but failed match against \"{}\"", path, paths::REGEX_ORGANIZATION_INVITES_INVITE_ID.as_str())
                    );

                let param_invite_id = match percent_encoding::percent_decode(path_params["invite_id"].as_bytes()).decode_utf8() {
                    Ok(param_invite_id) => match param_invite_id.parse::<String>() {
                        Ok(param_invite_id) => param_invite_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter invite_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["invite_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.delete_invite(
                                            param_invite_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteInviteResponse::InviteDeletedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // RetrieveInvite - GET /organization/invites/{invite_id}
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_INVITES_INVITE_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ORGANIZATION_INVITES_INVITE_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ORGANIZATION_INVITES_INVITE_ID in set but failed match against \"{}\"", path, paths::REGEX_ORGANIZATION_INVITES_INVITE_ID.as_str())
                    );

                let param_invite_id = match percent_encoding::percent_decode(path_params["invite_id"].as_bytes()).decode_utf8() {
                    Ok(param_invite_id) => match param_invite_id.parse::<String>() {
                        Ok(param_invite_id) => param_invite_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter invite_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["invite_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.retrieve_invite(
                                            param_invite_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                RetrieveInviteResponse::InviteRetrievedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ListModels - GET /models
            hyper::Method::GET if path.matched(paths::ID_MODELS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                                let result = api_impl.list_models(
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListModelsResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // DeleteModel - DELETE /models/{model}
            hyper::Method::DELETE if path.matched(paths::ID_MODELS_MODEL) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_MODELS_MODEL
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE MODELS_MODEL in set but failed match against \"{}\"", path, paths::REGEX_MODELS_MODEL.as_str())
                    );

                let param_model = match percent_encoding::percent_decode(path_params["model"].as_bytes()).decode_utf8() {
                    Ok(param_model) => match param_model.parse::<String>() {
                        Ok(param_model) => param_model,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter model: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["model"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.delete_model(
                                            param_model,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteModelResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // RetrieveModel - GET /models/{model}
            hyper::Method::GET if path.matched(paths::ID_MODELS_MODEL) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_MODELS_MODEL
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE MODELS_MODEL in set but failed match against \"{}\"", path, paths::REGEX_MODELS_MODEL.as_str())
                    );

                let param_model = match percent_encoding::percent_decode(path_params["model"].as_bytes()).decode_utf8() {
                    Ok(param_model) => match param_model.parse::<String>() {
                        Ok(param_model) => param_model,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter model: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["model"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.retrieve_model(
                                            param_model,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                RetrieveModelResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // CreateModeration - POST /moderations
            hyper::Method::POST if path.matched(paths::ID_MODERATIONS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_create_moderation_request: Option<models::CreateModerationRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_moderation_request) => param_create_moderation_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter CreateModerationRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CreateModerationRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_create_moderation_request = match param_create_moderation_request {
                                    Some(param_create_moderation_request) => param_create_moderation_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter CreateModerationRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter CreateModerationRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_create_moderation_request, "CreateModerationRequest", validation);


                                let result = api_impl.create_moderation(
                                            param_create_moderation_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateModerationResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // CreateProject - POST /organization/projects
            hyper::Method::POST if path.matched(paths::ID_ORGANIZATION_PROJECTS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_project_create_request: Option<models::ProjectCreateRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_project_create_request) => param_project_create_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter ProjectCreateRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter ProjectCreateRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_project_create_request = match param_project_create_request {
                                    Some(param_project_create_request) => param_project_create_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter ProjectCreateRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter ProjectCreateRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_project_create_request, "ProjectCreateRequest", validation);


                                let result = api_impl.create_project(
                                            param_project_create_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateProjectResponse::ProjectCreatedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // ListProjects - GET /organization/projects
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_PROJECTS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter limit - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_after = query_params.iter().filter(|e| e.0 == "after").map(|e| e.1.clone())
                    .next();
                let param_after = match param_after {
                    Some(param_after) => {
                        let param_after =
                            <String as std::str::FromStr>::from_str
                                (&param_after);
                        match param_after {
                            Ok(param_after) => Some(param_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter after - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter after")),
                        }
                    },
                    None => None,
                };
                let param_include_archived = query_params.iter().filter(|e| e.0 == "include_archived").map(|e| e.1.clone())
                    .next();
                let param_include_archived = match param_include_archived {
                    Some(param_include_archived) => {
                        let param_include_archived =
                            <bool as std::str::FromStr>::from_str
                                (&param_include_archived);
                        match param_include_archived {
                            Ok(param_include_archived) => Some(param_include_archived),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter include_archived - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter include_archived")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.list_projects(
                                            param_limit,
                                            param_after,
                                            param_include_archived,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListProjectsResponse::ProjectsListedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ArchiveProject - POST /organization/projects/{project_id}/archive
            hyper::Method::POST if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_ARCHIVE) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_ARCHIVE
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ORGANIZATION_PROJECTS_PROJECT_ID_ARCHIVE in set but failed match against \"{}\"", path, paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_ARCHIVE.as_str())
                    );

                let param_project_id = match percent_encoding::percent_decode(path_params["project_id"].as_bytes()).decode_utf8() {
                    Ok(param_project_id) => match param_project_id.parse::<String>() {
                        Ok(param_project_id) => param_project_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter project_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["project_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.archive_project(
                                            param_project_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ArchiveProjectResponse::ProjectArchivedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // CreateProjectServiceAccount - POST /organization/projects/{project_id}/service_accounts
            hyper::Method::POST if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_SERVICE_ACCOUNTS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_SERVICE_ACCOUNTS
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ORGANIZATION_PROJECTS_PROJECT_ID_SERVICE_ACCOUNTS in set but failed match against \"{}\"", path, paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_SERVICE_ACCOUNTS.as_str())
                    );

                let param_project_id = match percent_encoding::percent_decode(path_params["project_id"].as_bytes()).decode_utf8() {
                    Ok(param_project_id) => match param_project_id.parse::<String>() {
                        Ok(param_project_id) => param_project_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter project_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["project_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_project_service_account_create_request: Option<models::ProjectServiceAccountCreateRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_project_service_account_create_request) => param_project_service_account_create_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter ProjectServiceAccountCreateRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter ProjectServiceAccountCreateRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_project_service_account_create_request = match param_project_service_account_create_request {
                                    Some(param_project_service_account_create_request) => param_project_service_account_create_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter ProjectServiceAccountCreateRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter ProjectServiceAccountCreateRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_project_service_account_create_request, "ProjectServiceAccountCreateRequest", validation);


                                let result = api_impl.create_project_service_account(
                                            param_project_id,
                                            param_project_service_account_create_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateProjectServiceAccountResponse::ProjectServiceAccountCreatedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                                CreateProjectServiceAccountResponse::ErrorResponseWhenProjectIsArchived
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // CreateProjectUser - POST /organization/projects/{project_id}/users
            hyper::Method::POST if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_USERS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_USERS
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ORGANIZATION_PROJECTS_PROJECT_ID_USERS in set but failed match against \"{}\"", path, paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_USERS.as_str())
                    );

                let param_project_id = match percent_encoding::percent_decode(path_params["project_id"].as_bytes()).decode_utf8() {
                    Ok(param_project_id) => match param_project_id.parse::<String>() {
                        Ok(param_project_id) => param_project_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter project_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["project_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_project_user_create_request: Option<models::ProjectUserCreateRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_project_user_create_request) => param_project_user_create_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter ProjectUserCreateRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter ProjectUserCreateRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_project_user_create_request = match param_project_user_create_request {
                                    Some(param_project_user_create_request) => param_project_user_create_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter ProjectUserCreateRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter ProjectUserCreateRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_project_user_create_request, "ProjectUserCreateRequest", validation);


                                let result = api_impl.create_project_user(
                                            param_project_id,
                                            param_project_user_create_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateProjectUserResponse::UserAddedToProjectSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                                CreateProjectUserResponse::ErrorResponseForVariousConditions
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // ListProjectApiKeys - GET /organization/projects/{project_id}/api_keys
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_API_KEYS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_API_KEYS
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ORGANIZATION_PROJECTS_PROJECT_ID_API_KEYS in set but failed match against \"{}\"", path, paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_API_KEYS.as_str())
                    );

                let param_project_id = match percent_encoding::percent_decode(path_params["project_id"].as_bytes()).decode_utf8() {
                    Ok(param_project_id) => match param_project_id.parse::<String>() {
                        Ok(param_project_id) => param_project_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter project_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["project_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter limit - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_after = query_params.iter().filter(|e| e.0 == "after").map(|e| e.1.clone())
                    .next();
                let param_after = match param_after {
                    Some(param_after) => {
                        let param_after =
                            <String as std::str::FromStr>::from_str
                                (&param_after);
                        match param_after {
                            Ok(param_after) => Some(param_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter after - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter after")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.list_project_api_keys(
                                            param_project_id,
                                            param_limit,
                                            param_after,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListProjectApiKeysResponse::ProjectAPIKeysListedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ListProjectRateLimits - GET /organization/projects/{project_id}/rate_limits
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_RATE_LIMITS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_RATE_LIMITS
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ORGANIZATION_PROJECTS_PROJECT_ID_RATE_LIMITS in set but failed match against \"{}\"", path, paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_RATE_LIMITS.as_str())
                    );

                let param_project_id = match percent_encoding::percent_decode(path_params["project_id"].as_bytes()).decode_utf8() {
                    Ok(param_project_id) => match param_project_id.parse::<String>() {
                        Ok(param_project_id) => param_project_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter project_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["project_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter limit - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_after = query_params.iter().filter(|e| e.0 == "after").map(|e| e.1.clone())
                    .next();
                let param_after = match param_after {
                    Some(param_after) => {
                        let param_after =
                            <String as std::str::FromStr>::from_str
                                (&param_after);
                        match param_after {
                            Ok(param_after) => Some(param_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter after - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter after")),
                        }
                    },
                    None => None,
                };
                let param_before = query_params.iter().filter(|e| e.0 == "before").map(|e| e.1.clone())
                    .next();
                let param_before = match param_before {
                    Some(param_before) => {
                        let param_before =
                            <String as std::str::FromStr>::from_str
                                (&param_before);
                        match param_before {
                            Ok(param_before) => Some(param_before),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter before - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter before")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.list_project_rate_limits(
                                            param_project_id,
                                            param_limit,
                                            param_after,
                                            param_before,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListProjectRateLimitsResponse::ProjectRateLimitsListedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ListProjectServiceAccounts - GET /organization/projects/{project_id}/service_accounts
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_SERVICE_ACCOUNTS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_SERVICE_ACCOUNTS
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ORGANIZATION_PROJECTS_PROJECT_ID_SERVICE_ACCOUNTS in set but failed match against \"{}\"", path, paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_SERVICE_ACCOUNTS.as_str())
                    );

                let param_project_id = match percent_encoding::percent_decode(path_params["project_id"].as_bytes()).decode_utf8() {
                    Ok(param_project_id) => match param_project_id.parse::<String>() {
                        Ok(param_project_id) => param_project_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter project_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["project_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter limit - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_after = query_params.iter().filter(|e| e.0 == "after").map(|e| e.1.clone())
                    .next();
                let param_after = match param_after {
                    Some(param_after) => {
                        let param_after =
                            <String as std::str::FromStr>::from_str
                                (&param_after);
                        match param_after {
                            Ok(param_after) => Some(param_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter after - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter after")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.list_project_service_accounts(
                                            param_project_id,
                                            param_limit,
                                            param_after,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListProjectServiceAccountsResponse::ProjectServiceAccountsListedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                                ListProjectServiceAccountsResponse::ErrorResponseWhenProjectIsArchived
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ListProjectUsers - GET /organization/projects/{project_id}/users
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_USERS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_USERS
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ORGANIZATION_PROJECTS_PROJECT_ID_USERS in set but failed match against \"{}\"", path, paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_USERS.as_str())
                    );

                let param_project_id = match percent_encoding::percent_decode(path_params["project_id"].as_bytes()).decode_utf8() {
                    Ok(param_project_id) => match param_project_id.parse::<String>() {
                        Ok(param_project_id) => param_project_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter project_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["project_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter limit - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_after = query_params.iter().filter(|e| e.0 == "after").map(|e| e.1.clone())
                    .next();
                let param_after = match param_after {
                    Some(param_after) => {
                        let param_after =
                            <String as std::str::FromStr>::from_str
                                (&param_after);
                        match param_after {
                            Ok(param_after) => Some(param_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter after - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter after")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.list_project_users(
                                            param_project_id,
                                            param_limit,
                                            param_after,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListProjectUsersResponse::ProjectUsersListedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                                ListProjectUsersResponse::ErrorResponseWhenProjectIsArchived
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ModifyProject - POST /organization/projects/{project_id}
            hyper::Method::POST if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ORGANIZATION_PROJECTS_PROJECT_ID in set but failed match against \"{}\"", path, paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID.as_str())
                    );

                let param_project_id = match percent_encoding::percent_decode(path_params["project_id"].as_bytes()).decode_utf8() {
                    Ok(param_project_id) => match param_project_id.parse::<String>() {
                        Ok(param_project_id) => param_project_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter project_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["project_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_project_update_request: Option<models::ProjectUpdateRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_project_update_request) => param_project_update_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter ProjectUpdateRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter ProjectUpdateRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_project_update_request = match param_project_update_request {
                                    Some(param_project_update_request) => param_project_update_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter ProjectUpdateRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter ProjectUpdateRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_project_update_request, "ProjectUpdateRequest", validation);


                                let result = api_impl.modify_project(
                                            param_project_id,
                                            param_project_update_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                ModifyProjectResponse::ProjectUpdatedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                                ModifyProjectResponse::ErrorResponseWhenUpdatingTheDefaultProject
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // RetrieveProject - GET /organization/projects/{project_id}
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ORGANIZATION_PROJECTS_PROJECT_ID in set but failed match against \"{}\"", path, paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID.as_str())
                    );

                let param_project_id = match percent_encoding::percent_decode(path_params["project_id"].as_bytes()).decode_utf8() {
                    Ok(param_project_id) => match param_project_id.parse::<String>() {
                        Ok(param_project_id) => param_project_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter project_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["project_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.retrieve_project(
                                            param_project_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                RetrieveProjectResponse::ProjectRetrievedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // DeleteProjectApiKey - DELETE /organization/projects/{project_id}/api_keys/{key_id}
            hyper::Method::DELETE if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_API_KEYS_KEY_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_API_KEYS_KEY_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ORGANIZATION_PROJECTS_PROJECT_ID_API_KEYS_KEY_ID in set but failed match against \"{}\"", path, paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_API_KEYS_KEY_ID.as_str())
                    );

                let param_project_id = match percent_encoding::percent_decode(path_params["project_id"].as_bytes()).decode_utf8() {
                    Ok(param_project_id) => match param_project_id.parse::<String>() {
                        Ok(param_project_id) => param_project_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter project_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["project_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_key_id = match percent_encoding::percent_decode(path_params["key_id"].as_bytes()).decode_utf8() {
                    Ok(param_key_id) => match param_key_id.parse::<String>() {
                        Ok(param_key_id) => param_key_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter key_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["key_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.delete_project_api_key(
                                            param_project_id,
                                            param_key_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteProjectApiKeyResponse::ProjectAPIKeyDeletedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                                DeleteProjectApiKeyResponse::ErrorResponseForVariousConditions
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // DeleteProjectServiceAccount - DELETE /organization/projects/{project_id}/service_accounts/{service_account_id}
            hyper::Method::DELETE if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_SERVICE_ACCOUNTS_SERVICE_ACCOUNT_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_SERVICE_ACCOUNTS_SERVICE_ACCOUNT_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ORGANIZATION_PROJECTS_PROJECT_ID_SERVICE_ACCOUNTS_SERVICE_ACCOUNT_ID in set but failed match against \"{}\"", path, paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_SERVICE_ACCOUNTS_SERVICE_ACCOUNT_ID.as_str())
                    );

                let param_project_id = match percent_encoding::percent_decode(path_params["project_id"].as_bytes()).decode_utf8() {
                    Ok(param_project_id) => match param_project_id.parse::<String>() {
                        Ok(param_project_id) => param_project_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter project_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["project_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_service_account_id = match percent_encoding::percent_decode(path_params["service_account_id"].as_bytes()).decode_utf8() {
                    Ok(param_service_account_id) => match param_service_account_id.parse::<String>() {
                        Ok(param_service_account_id) => param_service_account_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter service_account_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["service_account_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.delete_project_service_account(
                                            param_project_id,
                                            param_service_account_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteProjectServiceAccountResponse::ProjectServiceAccountDeletedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // DeleteProjectUser - DELETE /organization/projects/{project_id}/users/{user_id}
            hyper::Method::DELETE if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_USERS_USER_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_USERS_USER_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ORGANIZATION_PROJECTS_PROJECT_ID_USERS_USER_ID in set but failed match against \"{}\"", path, paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_USERS_USER_ID.as_str())
                    );

                let param_project_id = match percent_encoding::percent_decode(path_params["project_id"].as_bytes()).decode_utf8() {
                    Ok(param_project_id) => match param_project_id.parse::<String>() {
                        Ok(param_project_id) => param_project_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter project_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["project_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_user_id = match percent_encoding::percent_decode(path_params["user_id"].as_bytes()).decode_utf8() {
                    Ok(param_user_id) => match param_user_id.parse::<String>() {
                        Ok(param_user_id) => param_user_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter user_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["user_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.delete_project_user(
                                            param_project_id,
                                            param_user_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteProjectUserResponse::ProjectUserDeletedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                                DeleteProjectUserResponse::ErrorResponseForVariousConditions
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ModifyProjectUser - POST /organization/projects/{project_id}/users/{user_id}
            hyper::Method::POST if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_USERS_USER_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_USERS_USER_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ORGANIZATION_PROJECTS_PROJECT_ID_USERS_USER_ID in set but failed match against \"{}\"", path, paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_USERS_USER_ID.as_str())
                    );

                let param_project_id = match percent_encoding::percent_decode(path_params["project_id"].as_bytes()).decode_utf8() {
                    Ok(param_project_id) => match param_project_id.parse::<String>() {
                        Ok(param_project_id) => param_project_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter project_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["project_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_user_id = match percent_encoding::percent_decode(path_params["user_id"].as_bytes()).decode_utf8() {
                    Ok(param_user_id) => match param_user_id.parse::<String>() {
                        Ok(param_user_id) => param_user_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter user_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["user_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_project_user_update_request: Option<models::ProjectUserUpdateRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_project_user_update_request) => param_project_user_update_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter ProjectUserUpdateRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter ProjectUserUpdateRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_project_user_update_request = match param_project_user_update_request {
                                    Some(param_project_user_update_request) => param_project_user_update_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter ProjectUserUpdateRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter ProjectUserUpdateRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_project_user_update_request, "ProjectUserUpdateRequest", validation);


                                let result = api_impl.modify_project_user(
                                            param_project_id,
                                            param_user_id,
                                            param_project_user_update_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                ModifyProjectUserResponse::ProjectUser
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                                ModifyProjectUserResponse::ErrorResponseForVariousConditions
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // RetrieveProjectApiKey - GET /organization/projects/{project_id}/api_keys/{key_id}
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_API_KEYS_KEY_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_API_KEYS_KEY_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ORGANIZATION_PROJECTS_PROJECT_ID_API_KEYS_KEY_ID in set but failed match against \"{}\"", path, paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_API_KEYS_KEY_ID.as_str())
                    );

                let param_project_id = match percent_encoding::percent_decode(path_params["project_id"].as_bytes()).decode_utf8() {
                    Ok(param_project_id) => match param_project_id.parse::<String>() {
                        Ok(param_project_id) => param_project_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter project_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["project_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_key_id = match percent_encoding::percent_decode(path_params["key_id"].as_bytes()).decode_utf8() {
                    Ok(param_key_id) => match param_key_id.parse::<String>() {
                        Ok(param_key_id) => param_key_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter key_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["key_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.retrieve_project_api_key(
                                            param_project_id,
                                            param_key_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                RetrieveProjectApiKeyResponse::ProjectAPIKeyRetrievedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // RetrieveProjectServiceAccount - GET /organization/projects/{project_id}/service_accounts/{service_account_id}
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_SERVICE_ACCOUNTS_SERVICE_ACCOUNT_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_SERVICE_ACCOUNTS_SERVICE_ACCOUNT_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ORGANIZATION_PROJECTS_PROJECT_ID_SERVICE_ACCOUNTS_SERVICE_ACCOUNT_ID in set but failed match against \"{}\"", path, paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_SERVICE_ACCOUNTS_SERVICE_ACCOUNT_ID.as_str())
                    );

                let param_project_id = match percent_encoding::percent_decode(path_params["project_id"].as_bytes()).decode_utf8() {
                    Ok(param_project_id) => match param_project_id.parse::<String>() {
                        Ok(param_project_id) => param_project_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter project_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["project_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_service_account_id = match percent_encoding::percent_decode(path_params["service_account_id"].as_bytes()).decode_utf8() {
                    Ok(param_service_account_id) => match param_service_account_id.parse::<String>() {
                        Ok(param_service_account_id) => param_service_account_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter service_account_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["service_account_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.retrieve_project_service_account(
                                            param_project_id,
                                            param_service_account_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                RetrieveProjectServiceAccountResponse::ProjectServiceAccountRetrievedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // RetrieveProjectUser - GET /organization/projects/{project_id}/users/{user_id}
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_USERS_USER_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_USERS_USER_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ORGANIZATION_PROJECTS_PROJECT_ID_USERS_USER_ID in set but failed match against \"{}\"", path, paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_USERS_USER_ID.as_str())
                    );

                let param_project_id = match percent_encoding::percent_decode(path_params["project_id"].as_bytes()).decode_utf8() {
                    Ok(param_project_id) => match param_project_id.parse::<String>() {
                        Ok(param_project_id) => param_project_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter project_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["project_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_user_id = match percent_encoding::percent_decode(path_params["user_id"].as_bytes()).decode_utf8() {
                    Ok(param_user_id) => match param_user_id.parse::<String>() {
                        Ok(param_user_id) => param_user_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter user_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["user_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.retrieve_project_user(
                                            param_project_id,
                                            param_user_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                RetrieveProjectUserResponse::ProjectUserRetrievedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // UpdateProjectRateLimits - POST /organization/projects/{project_id}/rate_limits/{rate_limit_id}
            hyper::Method::POST if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_RATE_LIMITS_RATE_LIMIT_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_RATE_LIMITS_RATE_LIMIT_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ORGANIZATION_PROJECTS_PROJECT_ID_RATE_LIMITS_RATE_LIMIT_ID in set but failed match against \"{}\"", path, paths::REGEX_ORGANIZATION_PROJECTS_PROJECT_ID_RATE_LIMITS_RATE_LIMIT_ID.as_str())
                    );

                let param_project_id = match percent_encoding::percent_decode(path_params["project_id"].as_bytes()).decode_utf8() {
                    Ok(param_project_id) => match param_project_id.parse::<String>() {
                        Ok(param_project_id) => param_project_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter project_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["project_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_rate_limit_id = match percent_encoding::percent_decode(path_params["rate_limit_id"].as_bytes()).decode_utf8() {
                    Ok(param_rate_limit_id) => match param_rate_limit_id.parse::<String>() {
                        Ok(param_rate_limit_id) => param_rate_limit_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter rate_limit_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["rate_limit_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_project_rate_limit_update_request: Option<models::ProjectRateLimitUpdateRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_project_rate_limit_update_request) => param_project_rate_limit_update_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter ProjectRateLimitUpdateRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter ProjectRateLimitUpdateRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_project_rate_limit_update_request = match param_project_rate_limit_update_request {
                                    Some(param_project_rate_limit_update_request) => param_project_rate_limit_update_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter ProjectRateLimitUpdateRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter ProjectRateLimitUpdateRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_project_rate_limit_update_request, "ProjectRateLimitUpdateRequest", validation);


                                let result = api_impl.update_project_rate_limits(
                                            param_project_id,
                                            param_rate_limit_id,
                                            param_project_rate_limit_update_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                UpdateProjectRateLimitsResponse::ProjectRateLimitUpdatedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                                UpdateProjectRateLimitsResponse::ErrorResponseForVariousConditions
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // CreateRealtimeSession - POST /realtime/sessions
            hyper::Method::POST if path.matched(paths::ID_REALTIME_SESSIONS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_realtime_session_create_request: Option<models::RealtimeSessionCreateRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_realtime_session_create_request) => param_realtime_session_create_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter RealtimeSessionCreateRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter RealtimeSessionCreateRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_realtime_session_create_request = match param_realtime_session_create_request {
                                    Some(param_realtime_session_create_request) => param_realtime_session_create_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter RealtimeSessionCreateRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter RealtimeSessionCreateRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_realtime_session_create_request, "RealtimeSessionCreateRequest", validation);


                                let result = api_impl.create_realtime_session(
                                            param_realtime_session_create_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateRealtimeSessionResponse::SessionCreatedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // CreateUpload - POST /uploads
            hyper::Method::POST if path.matched(paths::ID_UPLOADS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_create_upload_request: Option<models::CreateUploadRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_upload_request) => param_create_upload_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter CreateUploadRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CreateUploadRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_create_upload_request = match param_create_upload_request {
                                    Some(param_create_upload_request) => param_create_upload_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter CreateUploadRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter CreateUploadRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_create_upload_request, "CreateUploadRequest", validation);


                                let result = api_impl.create_upload(
                                            param_create_upload_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateUploadResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // AddUploadPart - POST /uploads/{upload_id}/parts
            hyper::Method::POST if path.matched(paths::ID_UPLOADS_UPLOAD_ID_PARTS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_UPLOADS_UPLOAD_ID_PARTS
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE UPLOADS_UPLOAD_ID_PARTS in set but failed match against \"{}\"", path, paths::REGEX_UPLOADS_UPLOAD_ID_PARTS.as_str())
                    );

                let param_upload_id = match percent_encoding::percent_decode(path_params["upload_id"].as_bytes()).decode_utf8() {
                    Ok(param_upload_id) => match param_upload_id.parse::<String>() {
                        Ok(param_upload_id) => param_upload_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter upload_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["upload_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let boundary = match swagger::multipart::form::boundary(&headers) {
                                    Some(boundary) => boundary.to_string(),
                                    None => return Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(BoxBody::new("Couldn't find valid multipart body".to_string()))
                                                .expect("Unable to create Bad Request response for incorrect boundary")),
                                };

                                use std::io::Read;

                                // Read Form Parameters from body
                                let mut entries = match Multipart::with_body(&body.to_vec()[..], boundary)
                                    .save()
                                    .size_limit(multipart_form_size_limit)
                                    .temp()
                                {
                                    SaveResult::Full(entries) => {
                                        entries
                                    },
                                    SaveResult::Partial(_, PartialReason::CountLimit) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Unable to process message part due to excessive parts".to_string()))
                                                        .expect("Unable to create Bad Request response due to excessive parts"))
                                    },
                                    SaveResult::Partial(_, PartialReason::SizeLimit) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Unable to process message part due to excessive data".to_string()))
                                                        .expect("Unable to create Bad Request response due to excessive data"))
                                    },
                                    SaveResult::Partial(_, PartialReason::Utf8Error(_)) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Unable to process message part due to invalid data".to_string()))
                                                        .expect("Unable to create Bad Request response due to invalid data"))
                                    },
                                    SaveResult::Partial(_, PartialReason::IoError(_)) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::INTERNAL_SERVER_ERROR)
                                                        .body(BoxBody::new("Failed to process message part due an internal error".to_string()))
                                                        .expect("Unable to create Internal Server Error response due to an internal error"))
                                    },
                                    SaveResult::Error(e) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::INTERNAL_SERVER_ERROR)
                                                        .body(BoxBody::new("Failed to process all message parts due to an internal error".to_string()))
                                                        .expect("Unable to create Internal Server Error response due to an internal error"))
                                    },
                                };
                                let field_data = entries.fields.remove("data");
                                let param_data = match field_data {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for data");
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let data_model: swagger::ByteArray = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(BoxBody::new(format!("data data does not match API definition : {e}")))
                                                    .expect("Unable to create Bad Request due to missing required form parameter data"))
                                            }
                                        };
                                        data_model
                                    },
                                    None => {
                                        return Ok(
                                            Response::builder()
                                            .status(StatusCode::BAD_REQUEST)
                                            .body(BoxBody::new("Missing required form parameter data".to_string()))
                                            .expect("Unable to create Bad Request due to missing required form parameter data"))
                                    }
                                };


                                let result = api_impl.add_upload_part(
                                            param_upload_id,
                                            param_data,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                AddUploadPartResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // CancelUpload - POST /uploads/{upload_id}/cancel
            hyper::Method::POST if path.matched(paths::ID_UPLOADS_UPLOAD_ID_CANCEL) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_UPLOADS_UPLOAD_ID_CANCEL
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE UPLOADS_UPLOAD_ID_CANCEL in set but failed match against \"{}\"", path, paths::REGEX_UPLOADS_UPLOAD_ID_CANCEL.as_str())
                    );

                let param_upload_id = match percent_encoding::percent_decode(path_params["upload_id"].as_bytes()).decode_utf8() {
                    Ok(param_upload_id) => match param_upload_id.parse::<String>() {
                        Ok(param_upload_id) => param_upload_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter upload_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["upload_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.cancel_upload(
                                            param_upload_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CancelUploadResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // CompleteUpload - POST /uploads/{upload_id}/complete
            hyper::Method::POST if path.matched(paths::ID_UPLOADS_UPLOAD_ID_COMPLETE) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_UPLOADS_UPLOAD_ID_COMPLETE
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE UPLOADS_UPLOAD_ID_COMPLETE in set but failed match against \"{}\"", path, paths::REGEX_UPLOADS_UPLOAD_ID_COMPLETE.as_str())
                    );

                let param_upload_id = match percent_encoding::percent_decode(path_params["upload_id"].as_bytes()).decode_utf8() {
                    Ok(param_upload_id) => match param_upload_id.parse::<String>() {
                        Ok(param_upload_id) => param_upload_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter upload_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["upload_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_complete_upload_request: Option<models::CompleteUploadRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_complete_upload_request) => param_complete_upload_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter CompleteUploadRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CompleteUploadRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_complete_upload_request = match param_complete_upload_request {
                                    Some(param_complete_upload_request) => param_complete_upload_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter CompleteUploadRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter CompleteUploadRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_complete_upload_request, "CompleteUploadRequest", validation);


                                let result = api_impl.complete_upload(
                                            param_upload_id,
                                            param_complete_upload_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                CompleteUploadResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // UsageAudioSpeeches - GET /organization/usage/audio_speeches
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_USAGE_AUDIO_SPEECHES) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_start_time = query_params.iter().filter(|e| e.0 == "start_time").map(|e| e.1.clone())
                    .next();
                let param_start_time = match param_start_time {
                    Some(param_start_time) => {
                        let param_start_time =
                            <i32 as std::str::FromStr>::from_str
                                (&param_start_time);
                        match param_start_time {
                            Ok(param_start_time) => Some(param_start_time),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter start_time - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter start_time")),
                        }
                    },
                    None => None,
                };
                let param_start_time = match param_start_time {
                    Some(param_start_time) => param_start_time,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(body_from_str("Missing required query parameter start_time"))
                        .expect("Unable to create Bad Request response for missing query parameter start_time")),
                };
                let param_end_time = query_params.iter().filter(|e| e.0 == "end_time").map(|e| e.1.clone())
                    .next();
                let param_end_time = match param_end_time {
                    Some(param_end_time) => {
                        let param_end_time =
                            <i32 as std::str::FromStr>::from_str
                                (&param_end_time);
                        match param_end_time {
                            Ok(param_end_time) => Some(param_end_time),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter end_time - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter end_time")),
                        }
                    },
                    None => None,
                };
                let param_bucket_width = query_params.iter().filter(|e| e.0 == "bucket_width").map(|e| e.1.clone())
                    .next();
                let param_bucket_width = match param_bucket_width {
                    Some(param_bucket_width) => {
                        let param_bucket_width =
                            <models::UsageAudioSpeechesBucketWidthParameter as std::str::FromStr>::from_str
                                (&param_bucket_width);
                        match param_bucket_width {
                            Ok(param_bucket_width) => Some(param_bucket_width),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter bucket_width - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter bucket_width")),
                        }
                    },
                    None => None,
                };
    #[cfg(not(feature = "validate"))]
                run_validation!(param_bucket_width, "bucket_width", validation);
                let param_project_ids = query_params.iter().filter(|e| e.0 == "project_ids").map(|e| e.1.clone())
                    .filter_map(|param_project_ids| param_project_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_project_ids = if !param_project_ids.is_empty() {
                    Some(param_project_ids)
                } else {
                    None
                };
                let param_user_ids = query_params.iter().filter(|e| e.0 == "user_ids").map(|e| e.1.clone())
                    .filter_map(|param_user_ids| param_user_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_user_ids = if !param_user_ids.is_empty() {
                    Some(param_user_ids)
                } else {
                    None
                };
                let param_api_key_ids = query_params.iter().filter(|e| e.0 == "api_key_ids").map(|e| e.1.clone())
                    .filter_map(|param_api_key_ids| param_api_key_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_api_key_ids = if !param_api_key_ids.is_empty() {
                    Some(param_api_key_ids)
                } else {
                    None
                };
                let param_models = query_params.iter().filter(|e| e.0 == "models").map(|e| e.1.clone())
                    .filter_map(|param_models| param_models.parse().ok())
                    .collect::<Vec<_>>();
                let param_models = if !param_models.is_empty() {
                    Some(param_models)
                } else {
                    None
                };
                let param_group_by = query_params.iter().filter(|e| e.0 == "group_by").map(|e| e.1.clone())
                    .filter_map(|param_group_by| param_group_by.parse().ok())
                    .collect::<Vec<_>>();
                let param_group_by = if !param_group_by.is_empty() {
                    Some(param_group_by)
                } else {
                    None
                };
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter limit - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_page = query_params.iter().filter(|e| e.0 == "page").map(|e| e.1.clone())
                    .next();
                let param_page = match param_page {
                    Some(param_page) => {
                        let param_page =
                            <String as std::str::FromStr>::from_str
                                (&param_page);
                        match param_page {
                            Ok(param_page) => Some(param_page),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter page - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter page")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.usage_audio_speeches(
                                            param_start_time,
                                            param_end_time,
                                            param_bucket_width,
                                            param_project_ids.as_ref(),
                                            param_user_ids.as_ref(),
                                            param_api_key_ids.as_ref(),
                                            param_models.as_ref(),
                                            param_group_by.as_ref(),
                                            param_limit,
                                            param_page,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UsageAudioSpeechesResponse::UsageDataRetrievedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // UsageAudioTranscriptions - GET /organization/usage/audio_transcriptions
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_USAGE_AUDIO_TRANSCRIPTIONS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_start_time = query_params.iter().filter(|e| e.0 == "start_time").map(|e| e.1.clone())
                    .next();
                let param_start_time = match param_start_time {
                    Some(param_start_time) => {
                        let param_start_time =
                            <i32 as std::str::FromStr>::from_str
                                (&param_start_time);
                        match param_start_time {
                            Ok(param_start_time) => Some(param_start_time),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter start_time - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter start_time")),
                        }
                    },
                    None => None,
                };
                let param_start_time = match param_start_time {
                    Some(param_start_time) => param_start_time,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(body_from_str("Missing required query parameter start_time"))
                        .expect("Unable to create Bad Request response for missing query parameter start_time")),
                };
                let param_end_time = query_params.iter().filter(|e| e.0 == "end_time").map(|e| e.1.clone())
                    .next();
                let param_end_time = match param_end_time {
                    Some(param_end_time) => {
                        let param_end_time =
                            <i32 as std::str::FromStr>::from_str
                                (&param_end_time);
                        match param_end_time {
                            Ok(param_end_time) => Some(param_end_time),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter end_time - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter end_time")),
                        }
                    },
                    None => None,
                };
                let param_bucket_width = query_params.iter().filter(|e| e.0 == "bucket_width").map(|e| e.1.clone())
                    .next();
                let param_bucket_width = match param_bucket_width {
                    Some(param_bucket_width) => {
                        let param_bucket_width =
                            <models::UsageAudioSpeechesBucketWidthParameter as std::str::FromStr>::from_str
                                (&param_bucket_width);
                        match param_bucket_width {
                            Ok(param_bucket_width) => Some(param_bucket_width),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter bucket_width - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter bucket_width")),
                        }
                    },
                    None => None,
                };
    #[cfg(not(feature = "validate"))]
                run_validation!(param_bucket_width, "bucket_width", validation);
                let param_project_ids = query_params.iter().filter(|e| e.0 == "project_ids").map(|e| e.1.clone())
                    .filter_map(|param_project_ids| param_project_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_project_ids = if !param_project_ids.is_empty() {
                    Some(param_project_ids)
                } else {
                    None
                };
                let param_user_ids = query_params.iter().filter(|e| e.0 == "user_ids").map(|e| e.1.clone())
                    .filter_map(|param_user_ids| param_user_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_user_ids = if !param_user_ids.is_empty() {
                    Some(param_user_ids)
                } else {
                    None
                };
                let param_api_key_ids = query_params.iter().filter(|e| e.0 == "api_key_ids").map(|e| e.1.clone())
                    .filter_map(|param_api_key_ids| param_api_key_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_api_key_ids = if !param_api_key_ids.is_empty() {
                    Some(param_api_key_ids)
                } else {
                    None
                };
                let param_models = query_params.iter().filter(|e| e.0 == "models").map(|e| e.1.clone())
                    .filter_map(|param_models| param_models.parse().ok())
                    .collect::<Vec<_>>();
                let param_models = if !param_models.is_empty() {
                    Some(param_models)
                } else {
                    None
                };
                let param_group_by = query_params.iter().filter(|e| e.0 == "group_by").map(|e| e.1.clone())
                    .filter_map(|param_group_by| param_group_by.parse().ok())
                    .collect::<Vec<_>>();
                let param_group_by = if !param_group_by.is_empty() {
                    Some(param_group_by)
                } else {
                    None
                };
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter limit - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_page = query_params.iter().filter(|e| e.0 == "page").map(|e| e.1.clone())
                    .next();
                let param_page = match param_page {
                    Some(param_page) => {
                        let param_page =
                            <String as std::str::FromStr>::from_str
                                (&param_page);
                        match param_page {
                            Ok(param_page) => Some(param_page),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter page - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter page")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.usage_audio_transcriptions(
                                            param_start_time,
                                            param_end_time,
                                            param_bucket_width,
                                            param_project_ids.as_ref(),
                                            param_user_ids.as_ref(),
                                            param_api_key_ids.as_ref(),
                                            param_models.as_ref(),
                                            param_group_by.as_ref(),
                                            param_limit,
                                            param_page,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UsageAudioTranscriptionsResponse::UsageDataRetrievedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // UsageCodeInterpreterSessions - GET /organization/usage/code_interpreter_sessions
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_USAGE_CODE_INTERPRETER_SESSIONS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_start_time = query_params.iter().filter(|e| e.0 == "start_time").map(|e| e.1.clone())
                    .next();
                let param_start_time = match param_start_time {
                    Some(param_start_time) => {
                        let param_start_time =
                            <i32 as std::str::FromStr>::from_str
                                (&param_start_time);
                        match param_start_time {
                            Ok(param_start_time) => Some(param_start_time),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter start_time - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter start_time")),
                        }
                    },
                    None => None,
                };
                let param_start_time = match param_start_time {
                    Some(param_start_time) => param_start_time,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(body_from_str("Missing required query parameter start_time"))
                        .expect("Unable to create Bad Request response for missing query parameter start_time")),
                };
                let param_end_time = query_params.iter().filter(|e| e.0 == "end_time").map(|e| e.1.clone())
                    .next();
                let param_end_time = match param_end_time {
                    Some(param_end_time) => {
                        let param_end_time =
                            <i32 as std::str::FromStr>::from_str
                                (&param_end_time);
                        match param_end_time {
                            Ok(param_end_time) => Some(param_end_time),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter end_time - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter end_time")),
                        }
                    },
                    None => None,
                };
                let param_bucket_width = query_params.iter().filter(|e| e.0 == "bucket_width").map(|e| e.1.clone())
                    .next();
                let param_bucket_width = match param_bucket_width {
                    Some(param_bucket_width) => {
                        let param_bucket_width =
                            <models::UsageAudioSpeechesBucketWidthParameter as std::str::FromStr>::from_str
                                (&param_bucket_width);
                        match param_bucket_width {
                            Ok(param_bucket_width) => Some(param_bucket_width),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter bucket_width - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter bucket_width")),
                        }
                    },
                    None => None,
                };
    #[cfg(not(feature = "validate"))]
                run_validation!(param_bucket_width, "bucket_width", validation);
                let param_project_ids = query_params.iter().filter(|e| e.0 == "project_ids").map(|e| e.1.clone())
                    .filter_map(|param_project_ids| param_project_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_project_ids = if !param_project_ids.is_empty() {
                    Some(param_project_ids)
                } else {
                    None
                };
                let param_group_by = query_params.iter().filter(|e| e.0 == "group_by").map(|e| e.1.clone())
                    .filter_map(|param_group_by| param_group_by.parse().ok())
                    .collect::<Vec<_>>();
                let param_group_by = if !param_group_by.is_empty() {
                    Some(param_group_by)
                } else {
                    None
                };
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter limit - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_page = query_params.iter().filter(|e| e.0 == "page").map(|e| e.1.clone())
                    .next();
                let param_page = match param_page {
                    Some(param_page) => {
                        let param_page =
                            <String as std::str::FromStr>::from_str
                                (&param_page);
                        match param_page {
                            Ok(param_page) => Some(param_page),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter page - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter page")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.usage_code_interpreter_sessions(
                                            param_start_time,
                                            param_end_time,
                                            param_bucket_width,
                                            param_project_ids.as_ref(),
                                            param_group_by.as_ref(),
                                            param_limit,
                                            param_page,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UsageCodeInterpreterSessionsResponse::UsageDataRetrievedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // UsageCompletions - GET /organization/usage/completions
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_USAGE_COMPLETIONS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_start_time = query_params.iter().filter(|e| e.0 == "start_time").map(|e| e.1.clone())
                    .next();
                let param_start_time = match param_start_time {
                    Some(param_start_time) => {
                        let param_start_time =
                            <i32 as std::str::FromStr>::from_str
                                (&param_start_time);
                        match param_start_time {
                            Ok(param_start_time) => Some(param_start_time),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter start_time - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter start_time")),
                        }
                    },
                    None => None,
                };
                let param_start_time = match param_start_time {
                    Some(param_start_time) => param_start_time,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(body_from_str("Missing required query parameter start_time"))
                        .expect("Unable to create Bad Request response for missing query parameter start_time")),
                };
                let param_end_time = query_params.iter().filter(|e| e.0 == "end_time").map(|e| e.1.clone())
                    .next();
                let param_end_time = match param_end_time {
                    Some(param_end_time) => {
                        let param_end_time =
                            <i32 as std::str::FromStr>::from_str
                                (&param_end_time);
                        match param_end_time {
                            Ok(param_end_time) => Some(param_end_time),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter end_time - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter end_time")),
                        }
                    },
                    None => None,
                };
                let param_bucket_width = query_params.iter().filter(|e| e.0 == "bucket_width").map(|e| e.1.clone())
                    .next();
                let param_bucket_width = match param_bucket_width {
                    Some(param_bucket_width) => {
                        let param_bucket_width =
                            <models::UsageAudioSpeechesBucketWidthParameter as std::str::FromStr>::from_str
                                (&param_bucket_width);
                        match param_bucket_width {
                            Ok(param_bucket_width) => Some(param_bucket_width),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter bucket_width - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter bucket_width")),
                        }
                    },
                    None => None,
                };
    #[cfg(not(feature = "validate"))]
                run_validation!(param_bucket_width, "bucket_width", validation);
                let param_project_ids = query_params.iter().filter(|e| e.0 == "project_ids").map(|e| e.1.clone())
                    .filter_map(|param_project_ids| param_project_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_project_ids = if !param_project_ids.is_empty() {
                    Some(param_project_ids)
                } else {
                    None
                };
                let param_user_ids = query_params.iter().filter(|e| e.0 == "user_ids").map(|e| e.1.clone())
                    .filter_map(|param_user_ids| param_user_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_user_ids = if !param_user_ids.is_empty() {
                    Some(param_user_ids)
                } else {
                    None
                };
                let param_api_key_ids = query_params.iter().filter(|e| e.0 == "api_key_ids").map(|e| e.1.clone())
                    .filter_map(|param_api_key_ids| param_api_key_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_api_key_ids = if !param_api_key_ids.is_empty() {
                    Some(param_api_key_ids)
                } else {
                    None
                };
                let param_models = query_params.iter().filter(|e| e.0 == "models").map(|e| e.1.clone())
                    .filter_map(|param_models| param_models.parse().ok())
                    .collect::<Vec<_>>();
                let param_models = if !param_models.is_empty() {
                    Some(param_models)
                } else {
                    None
                };
                let param_batch = query_params.iter().filter(|e| e.0 == "batch").map(|e| e.1.clone())
                    .next();
                let param_batch = match param_batch {
                    Some(param_batch) => {
                        let param_batch =
                            <bool as std::str::FromStr>::from_str
                                (&param_batch);
                        match param_batch {
                            Ok(param_batch) => Some(param_batch),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter batch - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter batch")),
                        }
                    },
                    None => None,
                };
                let param_group_by = query_params.iter().filter(|e| e.0 == "group_by").map(|e| e.1.clone())
                    .filter_map(|param_group_by| param_group_by.parse().ok())
                    .collect::<Vec<_>>();
                let param_group_by = if !param_group_by.is_empty() {
                    Some(param_group_by)
                } else {
                    None
                };
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter limit - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_page = query_params.iter().filter(|e| e.0 == "page").map(|e| e.1.clone())
                    .next();
                let param_page = match param_page {
                    Some(param_page) => {
                        let param_page =
                            <String as std::str::FromStr>::from_str
                                (&param_page);
                        match param_page {
                            Ok(param_page) => Some(param_page),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter page - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter page")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.usage_completions(
                                            param_start_time,
                                            param_end_time,
                                            param_bucket_width,
                                            param_project_ids.as_ref(),
                                            param_user_ids.as_ref(),
                                            param_api_key_ids.as_ref(),
                                            param_models.as_ref(),
                                            param_batch,
                                            param_group_by.as_ref(),
                                            param_limit,
                                            param_page,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UsageCompletionsResponse::UsageDataRetrievedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // UsageCosts - GET /organization/costs
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_COSTS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_start_time = query_params.iter().filter(|e| e.0 == "start_time").map(|e| e.1.clone())
                    .next();
                let param_start_time = match param_start_time {
                    Some(param_start_time) => {
                        let param_start_time =
                            <i32 as std::str::FromStr>::from_str
                                (&param_start_time);
                        match param_start_time {
                            Ok(param_start_time) => Some(param_start_time),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter start_time - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter start_time")),
                        }
                    },
                    None => None,
                };
                let param_start_time = match param_start_time {
                    Some(param_start_time) => param_start_time,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(body_from_str("Missing required query parameter start_time"))
                        .expect("Unable to create Bad Request response for missing query parameter start_time")),
                };
                let param_end_time = query_params.iter().filter(|e| e.0 == "end_time").map(|e| e.1.clone())
                    .next();
                let param_end_time = match param_end_time {
                    Some(param_end_time) => {
                        let param_end_time =
                            <i32 as std::str::FromStr>::from_str
                                (&param_end_time);
                        match param_end_time {
                            Ok(param_end_time) => Some(param_end_time),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter end_time - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter end_time")),
                        }
                    },
                    None => None,
                };
                let param_bucket_width = query_params.iter().filter(|e| e.0 == "bucket_width").map(|e| e.1.clone())
                    .next();
                let param_bucket_width = match param_bucket_width {
                    Some(param_bucket_width) => {
                        let param_bucket_width =
                            <models::UsageCostsBucketWidthParameter as std::str::FromStr>::from_str
                                (&param_bucket_width);
                        match param_bucket_width {
                            Ok(param_bucket_width) => Some(param_bucket_width),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter bucket_width - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter bucket_width")),
                        }
                    },
                    None => None,
                };
    #[cfg(not(feature = "validate"))]
                run_validation!(param_bucket_width, "bucket_width", validation);
                let param_project_ids = query_params.iter().filter(|e| e.0 == "project_ids").map(|e| e.1.clone())
                    .filter_map(|param_project_ids| param_project_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_project_ids = if !param_project_ids.is_empty() {
                    Some(param_project_ids)
                } else {
                    None
                };
                let param_group_by = query_params.iter().filter(|e| e.0 == "group_by").map(|e| e.1.clone())
                    .filter_map(|param_group_by| param_group_by.parse().ok())
                    .collect::<Vec<_>>();
                let param_group_by = if !param_group_by.is_empty() {
                    Some(param_group_by)
                } else {
                    None
                };
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter limit - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_page = query_params.iter().filter(|e| e.0 == "page").map(|e| e.1.clone())
                    .next();
                let param_page = match param_page {
                    Some(param_page) => {
                        let param_page =
                            <String as std::str::FromStr>::from_str
                                (&param_page);
                        match param_page {
                            Ok(param_page) => Some(param_page),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter page - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter page")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.usage_costs(
                                            param_start_time,
                                            param_end_time,
                                            param_bucket_width,
                                            param_project_ids.as_ref(),
                                            param_group_by.as_ref(),
                                            param_limit,
                                            param_page,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UsageCostsResponse::CostsDataRetrievedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // UsageEmbeddings - GET /organization/usage/embeddings
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_USAGE_EMBEDDINGS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_start_time = query_params.iter().filter(|e| e.0 == "start_time").map(|e| e.1.clone())
                    .next();
                let param_start_time = match param_start_time {
                    Some(param_start_time) => {
                        let param_start_time =
                            <i32 as std::str::FromStr>::from_str
                                (&param_start_time);
                        match param_start_time {
                            Ok(param_start_time) => Some(param_start_time),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter start_time - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter start_time")),
                        }
                    },
                    None => None,
                };
                let param_start_time = match param_start_time {
                    Some(param_start_time) => param_start_time,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(body_from_str("Missing required query parameter start_time"))
                        .expect("Unable to create Bad Request response for missing query parameter start_time")),
                };
                let param_end_time = query_params.iter().filter(|e| e.0 == "end_time").map(|e| e.1.clone())
                    .next();
                let param_end_time = match param_end_time {
                    Some(param_end_time) => {
                        let param_end_time =
                            <i32 as std::str::FromStr>::from_str
                                (&param_end_time);
                        match param_end_time {
                            Ok(param_end_time) => Some(param_end_time),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter end_time - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter end_time")),
                        }
                    },
                    None => None,
                };
                let param_bucket_width = query_params.iter().filter(|e| e.0 == "bucket_width").map(|e| e.1.clone())
                    .next();
                let param_bucket_width = match param_bucket_width {
                    Some(param_bucket_width) => {
                        let param_bucket_width =
                            <models::UsageAudioSpeechesBucketWidthParameter as std::str::FromStr>::from_str
                                (&param_bucket_width);
                        match param_bucket_width {
                            Ok(param_bucket_width) => Some(param_bucket_width),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter bucket_width - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter bucket_width")),
                        }
                    },
                    None => None,
                };
    #[cfg(not(feature = "validate"))]
                run_validation!(param_bucket_width, "bucket_width", validation);
                let param_project_ids = query_params.iter().filter(|e| e.0 == "project_ids").map(|e| e.1.clone())
                    .filter_map(|param_project_ids| param_project_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_project_ids = if !param_project_ids.is_empty() {
                    Some(param_project_ids)
                } else {
                    None
                };
                let param_user_ids = query_params.iter().filter(|e| e.0 == "user_ids").map(|e| e.1.clone())
                    .filter_map(|param_user_ids| param_user_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_user_ids = if !param_user_ids.is_empty() {
                    Some(param_user_ids)
                } else {
                    None
                };
                let param_api_key_ids = query_params.iter().filter(|e| e.0 == "api_key_ids").map(|e| e.1.clone())
                    .filter_map(|param_api_key_ids| param_api_key_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_api_key_ids = if !param_api_key_ids.is_empty() {
                    Some(param_api_key_ids)
                } else {
                    None
                };
                let param_models = query_params.iter().filter(|e| e.0 == "models").map(|e| e.1.clone())
                    .filter_map(|param_models| param_models.parse().ok())
                    .collect::<Vec<_>>();
                let param_models = if !param_models.is_empty() {
                    Some(param_models)
                } else {
                    None
                };
                let param_group_by = query_params.iter().filter(|e| e.0 == "group_by").map(|e| e.1.clone())
                    .filter_map(|param_group_by| param_group_by.parse().ok())
                    .collect::<Vec<_>>();
                let param_group_by = if !param_group_by.is_empty() {
                    Some(param_group_by)
                } else {
                    None
                };
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter limit - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_page = query_params.iter().filter(|e| e.0 == "page").map(|e| e.1.clone())
                    .next();
                let param_page = match param_page {
                    Some(param_page) => {
                        let param_page =
                            <String as std::str::FromStr>::from_str
                                (&param_page);
                        match param_page {
                            Ok(param_page) => Some(param_page),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter page - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter page")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.usage_embeddings(
                                            param_start_time,
                                            param_end_time,
                                            param_bucket_width,
                                            param_project_ids.as_ref(),
                                            param_user_ids.as_ref(),
                                            param_api_key_ids.as_ref(),
                                            param_models.as_ref(),
                                            param_group_by.as_ref(),
                                            param_limit,
                                            param_page,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UsageEmbeddingsResponse::UsageDataRetrievedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // UsageImages - GET /organization/usage/images
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_USAGE_IMAGES) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_start_time = query_params.iter().filter(|e| e.0 == "start_time").map(|e| e.1.clone())
                    .next();
                let param_start_time = match param_start_time {
                    Some(param_start_time) => {
                        let param_start_time =
                            <i32 as std::str::FromStr>::from_str
                                (&param_start_time);
                        match param_start_time {
                            Ok(param_start_time) => Some(param_start_time),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter start_time - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter start_time")),
                        }
                    },
                    None => None,
                };
                let param_start_time = match param_start_time {
                    Some(param_start_time) => param_start_time,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(body_from_str("Missing required query parameter start_time"))
                        .expect("Unable to create Bad Request response for missing query parameter start_time")),
                };
                let param_end_time = query_params.iter().filter(|e| e.0 == "end_time").map(|e| e.1.clone())
                    .next();
                let param_end_time = match param_end_time {
                    Some(param_end_time) => {
                        let param_end_time =
                            <i32 as std::str::FromStr>::from_str
                                (&param_end_time);
                        match param_end_time {
                            Ok(param_end_time) => Some(param_end_time),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter end_time - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter end_time")),
                        }
                    },
                    None => None,
                };
                let param_bucket_width = query_params.iter().filter(|e| e.0 == "bucket_width").map(|e| e.1.clone())
                    .next();
                let param_bucket_width = match param_bucket_width {
                    Some(param_bucket_width) => {
                        let param_bucket_width =
                            <models::UsageAudioSpeechesBucketWidthParameter as std::str::FromStr>::from_str
                                (&param_bucket_width);
                        match param_bucket_width {
                            Ok(param_bucket_width) => Some(param_bucket_width),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter bucket_width - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter bucket_width")),
                        }
                    },
                    None => None,
                };
    #[cfg(not(feature = "validate"))]
                run_validation!(param_bucket_width, "bucket_width", validation);
                let param_sources = query_params.iter().filter(|e| e.0 == "sources").map(|e| e.1.clone())
                    .filter_map(|param_sources| param_sources.parse().ok())
                    .collect::<Vec<_>>();
                let param_sources = if !param_sources.is_empty() {
                    Some(param_sources)
                } else {
                    None
                };
                let param_sizes = query_params.iter().filter(|e| e.0 == "sizes").map(|e| e.1.clone())
                    .filter_map(|param_sizes| param_sizes.parse().ok())
                    .collect::<Vec<_>>();
                let param_sizes = if !param_sizes.is_empty() {
                    Some(param_sizes)
                } else {
                    None
                };
                let param_project_ids = query_params.iter().filter(|e| e.0 == "project_ids").map(|e| e.1.clone())
                    .filter_map(|param_project_ids| param_project_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_project_ids = if !param_project_ids.is_empty() {
                    Some(param_project_ids)
                } else {
                    None
                };
                let param_user_ids = query_params.iter().filter(|e| e.0 == "user_ids").map(|e| e.1.clone())
                    .filter_map(|param_user_ids| param_user_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_user_ids = if !param_user_ids.is_empty() {
                    Some(param_user_ids)
                } else {
                    None
                };
                let param_api_key_ids = query_params.iter().filter(|e| e.0 == "api_key_ids").map(|e| e.1.clone())
                    .filter_map(|param_api_key_ids| param_api_key_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_api_key_ids = if !param_api_key_ids.is_empty() {
                    Some(param_api_key_ids)
                } else {
                    None
                };
                let param_models = query_params.iter().filter(|e| e.0 == "models").map(|e| e.1.clone())
                    .filter_map(|param_models| param_models.parse().ok())
                    .collect::<Vec<_>>();
                let param_models = if !param_models.is_empty() {
                    Some(param_models)
                } else {
                    None
                };
                let param_group_by = query_params.iter().filter(|e| e.0 == "group_by").map(|e| e.1.clone())
                    .filter_map(|param_group_by| param_group_by.parse().ok())
                    .collect::<Vec<_>>();
                let param_group_by = if !param_group_by.is_empty() {
                    Some(param_group_by)
                } else {
                    None
                };
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter limit - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_page = query_params.iter().filter(|e| e.0 == "page").map(|e| e.1.clone())
                    .next();
                let param_page = match param_page {
                    Some(param_page) => {
                        let param_page =
                            <String as std::str::FromStr>::from_str
                                (&param_page);
                        match param_page {
                            Ok(param_page) => Some(param_page),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter page - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter page")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.usage_images(
                                            param_start_time,
                                            param_end_time,
                                            param_bucket_width,
                                            param_sources.as_ref(),
                                            param_sizes.as_ref(),
                                            param_project_ids.as_ref(),
                                            param_user_ids.as_ref(),
                                            param_api_key_ids.as_ref(),
                                            param_models.as_ref(),
                                            param_group_by.as_ref(),
                                            param_limit,
                                            param_page,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UsageImagesResponse::UsageDataRetrievedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // UsageModerations - GET /organization/usage/moderations
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_USAGE_MODERATIONS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_start_time = query_params.iter().filter(|e| e.0 == "start_time").map(|e| e.1.clone())
                    .next();
                let param_start_time = match param_start_time {
                    Some(param_start_time) => {
                        let param_start_time =
                            <i32 as std::str::FromStr>::from_str
                                (&param_start_time);
                        match param_start_time {
                            Ok(param_start_time) => Some(param_start_time),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter start_time - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter start_time")),
                        }
                    },
                    None => None,
                };
                let param_start_time = match param_start_time {
                    Some(param_start_time) => param_start_time,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(body_from_str("Missing required query parameter start_time"))
                        .expect("Unable to create Bad Request response for missing query parameter start_time")),
                };
                let param_end_time = query_params.iter().filter(|e| e.0 == "end_time").map(|e| e.1.clone())
                    .next();
                let param_end_time = match param_end_time {
                    Some(param_end_time) => {
                        let param_end_time =
                            <i32 as std::str::FromStr>::from_str
                                (&param_end_time);
                        match param_end_time {
                            Ok(param_end_time) => Some(param_end_time),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter end_time - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter end_time")),
                        }
                    },
                    None => None,
                };
                let param_bucket_width = query_params.iter().filter(|e| e.0 == "bucket_width").map(|e| e.1.clone())
                    .next();
                let param_bucket_width = match param_bucket_width {
                    Some(param_bucket_width) => {
                        let param_bucket_width =
                            <models::UsageAudioSpeechesBucketWidthParameter as std::str::FromStr>::from_str
                                (&param_bucket_width);
                        match param_bucket_width {
                            Ok(param_bucket_width) => Some(param_bucket_width),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter bucket_width - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter bucket_width")),
                        }
                    },
                    None => None,
                };
    #[cfg(not(feature = "validate"))]
                run_validation!(param_bucket_width, "bucket_width", validation);
                let param_project_ids = query_params.iter().filter(|e| e.0 == "project_ids").map(|e| e.1.clone())
                    .filter_map(|param_project_ids| param_project_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_project_ids = if !param_project_ids.is_empty() {
                    Some(param_project_ids)
                } else {
                    None
                };
                let param_user_ids = query_params.iter().filter(|e| e.0 == "user_ids").map(|e| e.1.clone())
                    .filter_map(|param_user_ids| param_user_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_user_ids = if !param_user_ids.is_empty() {
                    Some(param_user_ids)
                } else {
                    None
                };
                let param_api_key_ids = query_params.iter().filter(|e| e.0 == "api_key_ids").map(|e| e.1.clone())
                    .filter_map(|param_api_key_ids| param_api_key_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_api_key_ids = if !param_api_key_ids.is_empty() {
                    Some(param_api_key_ids)
                } else {
                    None
                };
                let param_models = query_params.iter().filter(|e| e.0 == "models").map(|e| e.1.clone())
                    .filter_map(|param_models| param_models.parse().ok())
                    .collect::<Vec<_>>();
                let param_models = if !param_models.is_empty() {
                    Some(param_models)
                } else {
                    None
                };
                let param_group_by = query_params.iter().filter(|e| e.0 == "group_by").map(|e| e.1.clone())
                    .filter_map(|param_group_by| param_group_by.parse().ok())
                    .collect::<Vec<_>>();
                let param_group_by = if !param_group_by.is_empty() {
                    Some(param_group_by)
                } else {
                    None
                };
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter limit - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_page = query_params.iter().filter(|e| e.0 == "page").map(|e| e.1.clone())
                    .next();
                let param_page = match param_page {
                    Some(param_page) => {
                        let param_page =
                            <String as std::str::FromStr>::from_str
                                (&param_page);
                        match param_page {
                            Ok(param_page) => Some(param_page),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter page - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter page")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.usage_moderations(
                                            param_start_time,
                                            param_end_time,
                                            param_bucket_width,
                                            param_project_ids.as_ref(),
                                            param_user_ids.as_ref(),
                                            param_api_key_ids.as_ref(),
                                            param_models.as_ref(),
                                            param_group_by.as_ref(),
                                            param_limit,
                                            param_page,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UsageModerationsResponse::UsageDataRetrievedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // UsageVectorStores - GET /organization/usage/vector_stores
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_USAGE_VECTOR_STORES) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_start_time = query_params.iter().filter(|e| e.0 == "start_time").map(|e| e.1.clone())
                    .next();
                let param_start_time = match param_start_time {
                    Some(param_start_time) => {
                        let param_start_time =
                            <i32 as std::str::FromStr>::from_str
                                (&param_start_time);
                        match param_start_time {
                            Ok(param_start_time) => Some(param_start_time),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter start_time - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter start_time")),
                        }
                    },
                    None => None,
                };
                let param_start_time = match param_start_time {
                    Some(param_start_time) => param_start_time,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(body_from_str("Missing required query parameter start_time"))
                        .expect("Unable to create Bad Request response for missing query parameter start_time")),
                };
                let param_end_time = query_params.iter().filter(|e| e.0 == "end_time").map(|e| e.1.clone())
                    .next();
                let param_end_time = match param_end_time {
                    Some(param_end_time) => {
                        let param_end_time =
                            <i32 as std::str::FromStr>::from_str
                                (&param_end_time);
                        match param_end_time {
                            Ok(param_end_time) => Some(param_end_time),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter end_time - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter end_time")),
                        }
                    },
                    None => None,
                };
                let param_bucket_width = query_params.iter().filter(|e| e.0 == "bucket_width").map(|e| e.1.clone())
                    .next();
                let param_bucket_width = match param_bucket_width {
                    Some(param_bucket_width) => {
                        let param_bucket_width =
                            <models::UsageAudioSpeechesBucketWidthParameter as std::str::FromStr>::from_str
                                (&param_bucket_width);
                        match param_bucket_width {
                            Ok(param_bucket_width) => Some(param_bucket_width),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter bucket_width - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter bucket_width")),
                        }
                    },
                    None => None,
                };
    #[cfg(not(feature = "validate"))]
                run_validation!(param_bucket_width, "bucket_width", validation);
                let param_project_ids = query_params.iter().filter(|e| e.0 == "project_ids").map(|e| e.1.clone())
                    .filter_map(|param_project_ids| param_project_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_project_ids = if !param_project_ids.is_empty() {
                    Some(param_project_ids)
                } else {
                    None
                };
                let param_group_by = query_params.iter().filter(|e| e.0 == "group_by").map(|e| e.1.clone())
                    .filter_map(|param_group_by| param_group_by.parse().ok())
                    .collect::<Vec<_>>();
                let param_group_by = if !param_group_by.is_empty() {
                    Some(param_group_by)
                } else {
                    None
                };
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter limit - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_page = query_params.iter().filter(|e| e.0 == "page").map(|e| e.1.clone())
                    .next();
                let param_page = match param_page {
                    Some(param_page) => {
                        let param_page =
                            <String as std::str::FromStr>::from_str
                                (&param_page);
                        match param_page {
                            Ok(param_page) => Some(param_page),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter page - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter page")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.usage_vector_stores(
                                            param_start_time,
                                            param_end_time,
                                            param_bucket_width,
                                            param_project_ids.as_ref(),
                                            param_group_by.as_ref(),
                                            param_limit,
                                            param_page,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UsageVectorStoresResponse::UsageDataRetrievedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ListUsers - GET /organization/users
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_USERS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter limit - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_after = query_params.iter().filter(|e| e.0 == "after").map(|e| e.1.clone())
                    .next();
                let param_after = match param_after {
                    Some(param_after) => {
                        let param_after =
                            <String as std::str::FromStr>::from_str
                                (&param_after);
                        match param_after {
                            Ok(param_after) => Some(param_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter after - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter after")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.list_users(
                                            param_limit,
                                            param_after,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListUsersResponse::UsersListedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // DeleteUser - DELETE /organization/users/{user_id}
            hyper::Method::DELETE if path.matched(paths::ID_ORGANIZATION_USERS_USER_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ORGANIZATION_USERS_USER_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ORGANIZATION_USERS_USER_ID in set but failed match against \"{}\"", path, paths::REGEX_ORGANIZATION_USERS_USER_ID.as_str())
                    );

                let param_user_id = match percent_encoding::percent_decode(path_params["user_id"].as_bytes()).decode_utf8() {
                    Ok(param_user_id) => match param_user_id.parse::<String>() {
                        Ok(param_user_id) => param_user_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter user_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["user_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.delete_user(
                                            param_user_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteUserResponse::UserDeletedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ModifyUser - POST /organization/users/{user_id}
            hyper::Method::POST if path.matched(paths::ID_ORGANIZATION_USERS_USER_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ORGANIZATION_USERS_USER_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ORGANIZATION_USERS_USER_ID in set but failed match against \"{}\"", path, paths::REGEX_ORGANIZATION_USERS_USER_ID.as_str())
                    );

                let param_user_id = match percent_encoding::percent_decode(path_params["user_id"].as_bytes()).decode_utf8() {
                    Ok(param_user_id) => match param_user_id.parse::<String>() {
                        Ok(param_user_id) => param_user_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter user_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["user_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_user_role_update_request: Option<models::UserRoleUpdateRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_user_role_update_request) => param_user_role_update_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter UserRoleUpdateRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter UserRoleUpdateRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_user_role_update_request = match param_user_role_update_request {
                                    Some(param_user_role_update_request) => param_user_role_update_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter UserRoleUpdateRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter UserRoleUpdateRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_user_role_update_request, "UserRoleUpdateRequest", validation);


                                let result = api_impl.modify_user(
                                            param_user_id,
                                            param_user_role_update_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                ModifyUserResponse::UserRoleUpdatedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // RetrieveUser - GET /organization/users/{user_id}
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_USERS_USER_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ORGANIZATION_USERS_USER_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ORGANIZATION_USERS_USER_ID in set but failed match against \"{}\"", path, paths::REGEX_ORGANIZATION_USERS_USER_ID.as_str())
                    );

                let param_user_id = match percent_encoding::percent_decode(path_params["user_id"].as_bytes()).decode_utf8() {
                    Ok(param_user_id) => match param_user_id.parse::<String>() {
                        Ok(param_user_id) => param_user_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter user_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["user_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.retrieve_user(
                                            param_user_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                RetrieveUserResponse::UserRetrievedSuccessfully
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // CreateVectorStore - POST /vector_stores
            hyper::Method::POST if path.matched(paths::ID_VECTOR_STORES) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_create_vector_store_request: Option<models::CreateVectorStoreRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_vector_store_request) => param_create_vector_store_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter CreateVectorStoreRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CreateVectorStoreRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_create_vector_store_request = match param_create_vector_store_request {
                                    Some(param_create_vector_store_request) => param_create_vector_store_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter CreateVectorStoreRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter CreateVectorStoreRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_create_vector_store_request, "CreateVectorStoreRequest", validation);


                                let result = api_impl.create_vector_store(
                                            param_create_vector_store_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateVectorStoreResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // ListVectorStores - GET /vector_stores
            hyper::Method::GET if path.matched(paths::ID_VECTOR_STORES) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter limit - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_order = query_params.iter().filter(|e| e.0 == "order").map(|e| e.1.clone())
                    .next();
                let param_order = match param_order {
                    Some(param_order) => {
                        let param_order =
                            <models::ListAssistantsOrderParameter as std::str::FromStr>::from_str
                                (&param_order);
                        match param_order {
                            Ok(param_order) => Some(param_order),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter order - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter order")),
                        }
                    },
                    None => None,
                };
    #[cfg(not(feature = "validate"))]
                run_validation!(param_order, "order", validation);
                let param_after = query_params.iter().filter(|e| e.0 == "after").map(|e| e.1.clone())
                    .next();
                let param_after = match param_after {
                    Some(param_after) => {
                        let param_after =
                            <String as std::str::FromStr>::from_str
                                (&param_after);
                        match param_after {
                            Ok(param_after) => Some(param_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter after - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter after")),
                        }
                    },
                    None => None,
                };
                let param_before = query_params.iter().filter(|e| e.0 == "before").map(|e| e.1.clone())
                    .next();
                let param_before = match param_before {
                    Some(param_before) => {
                        let param_before =
                            <String as std::str::FromStr>::from_str
                                (&param_before);
                        match param_before {
                            Ok(param_before) => Some(param_before),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter before - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter before")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.list_vector_stores(
                                            param_limit,
                                            param_order,
                                            param_after,
                                            param_before,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListVectorStoresResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // CreateVectorStoreFile - POST /vector_stores/{vector_store_id}/files
            hyper::Method::POST if path.matched(paths::ID_VECTOR_STORES_VECTOR_STORE_ID_FILES) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_VECTOR_STORES_VECTOR_STORE_ID_FILES
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE VECTOR_STORES_VECTOR_STORE_ID_FILES in set but failed match against \"{}\"", path, paths::REGEX_VECTOR_STORES_VECTOR_STORE_ID_FILES.as_str())
                    );

                let param_vector_store_id = match percent_encoding::percent_decode(path_params["vector_store_id"].as_bytes()).decode_utf8() {
                    Ok(param_vector_store_id) => match param_vector_store_id.parse::<String>() {
                        Ok(param_vector_store_id) => param_vector_store_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter vector_store_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["vector_store_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_create_vector_store_file_request: Option<models::CreateVectorStoreFileRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_vector_store_file_request) => param_create_vector_store_file_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter CreateVectorStoreFileRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CreateVectorStoreFileRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_create_vector_store_file_request = match param_create_vector_store_file_request {
                                    Some(param_create_vector_store_file_request) => param_create_vector_store_file_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter CreateVectorStoreFileRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter CreateVectorStoreFileRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_create_vector_store_file_request, "CreateVectorStoreFileRequest", validation);


                                let result = api_impl.create_vector_store_file(
                                            param_vector_store_id,
                                            param_create_vector_store_file_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateVectorStoreFileResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // CreateVectorStoreFileBatch - POST /vector_stores/{vector_store_id}/file_batches
            hyper::Method::POST if path.matched(paths::ID_VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES in set but failed match against \"{}\"", path, paths::REGEX_VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES.as_str())
                    );

                let param_vector_store_id = match percent_encoding::percent_decode(path_params["vector_store_id"].as_bytes()).decode_utf8() {
                    Ok(param_vector_store_id) => match param_vector_store_id.parse::<String>() {
                        Ok(param_vector_store_id) => param_vector_store_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter vector_store_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["vector_store_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_create_vector_store_file_batch_request: Option<models::CreateVectorStoreFileBatchRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_vector_store_file_batch_request) => param_create_vector_store_file_batch_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter CreateVectorStoreFileBatchRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CreateVectorStoreFileBatchRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_create_vector_store_file_batch_request = match param_create_vector_store_file_batch_request {
                                    Some(param_create_vector_store_file_batch_request) => param_create_vector_store_file_batch_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter CreateVectorStoreFileBatchRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter CreateVectorStoreFileBatchRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_create_vector_store_file_batch_request, "CreateVectorStoreFileBatchRequest", validation);


                                let result = api_impl.create_vector_store_file_batch(
                                            param_vector_store_id,
                                            param_create_vector_store_file_batch_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateVectorStoreFileBatchResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // DeleteVectorStore - DELETE /vector_stores/{vector_store_id}
            hyper::Method::DELETE if path.matched(paths::ID_VECTOR_STORES_VECTOR_STORE_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_VECTOR_STORES_VECTOR_STORE_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE VECTOR_STORES_VECTOR_STORE_ID in set but failed match against \"{}\"", path, paths::REGEX_VECTOR_STORES_VECTOR_STORE_ID.as_str())
                    );

                let param_vector_store_id = match percent_encoding::percent_decode(path_params["vector_store_id"].as_bytes()).decode_utf8() {
                    Ok(param_vector_store_id) => match param_vector_store_id.parse::<String>() {
                        Ok(param_vector_store_id) => param_vector_store_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter vector_store_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["vector_store_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.delete_vector_store(
                                            param_vector_store_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteVectorStoreResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetVectorStore - GET /vector_stores/{vector_store_id}
            hyper::Method::GET if path.matched(paths::ID_VECTOR_STORES_VECTOR_STORE_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_VECTOR_STORES_VECTOR_STORE_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE VECTOR_STORES_VECTOR_STORE_ID in set but failed match against \"{}\"", path, paths::REGEX_VECTOR_STORES_VECTOR_STORE_ID.as_str())
                    );

                let param_vector_store_id = match percent_encoding::percent_decode(path_params["vector_store_id"].as_bytes()).decode_utf8() {
                    Ok(param_vector_store_id) => match param_vector_store_id.parse::<String>() {
                        Ok(param_vector_store_id) => param_vector_store_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter vector_store_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["vector_store_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.get_vector_store(
                                            param_vector_store_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetVectorStoreResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ListVectorStoreFiles - GET /vector_stores/{vector_store_id}/files
            hyper::Method::GET if path.matched(paths::ID_VECTOR_STORES_VECTOR_STORE_ID_FILES) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_VECTOR_STORES_VECTOR_STORE_ID_FILES
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE VECTOR_STORES_VECTOR_STORE_ID_FILES in set but failed match against \"{}\"", path, paths::REGEX_VECTOR_STORES_VECTOR_STORE_ID_FILES.as_str())
                    );

                let param_vector_store_id = match percent_encoding::percent_decode(path_params["vector_store_id"].as_bytes()).decode_utf8() {
                    Ok(param_vector_store_id) => match param_vector_store_id.parse::<String>() {
                        Ok(param_vector_store_id) => param_vector_store_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter vector_store_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["vector_store_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter limit - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_order = query_params.iter().filter(|e| e.0 == "order").map(|e| e.1.clone())
                    .next();
                let param_order = match param_order {
                    Some(param_order) => {
                        let param_order =
                            <models::ListAssistantsOrderParameter as std::str::FromStr>::from_str
                                (&param_order);
                        match param_order {
                            Ok(param_order) => Some(param_order),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter order - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter order")),
                        }
                    },
                    None => None,
                };
    #[cfg(not(feature = "validate"))]
                run_validation!(param_order, "order", validation);
                let param_after = query_params.iter().filter(|e| e.0 == "after").map(|e| e.1.clone())
                    .next();
                let param_after = match param_after {
                    Some(param_after) => {
                        let param_after =
                            <String as std::str::FromStr>::from_str
                                (&param_after);
                        match param_after {
                            Ok(param_after) => Some(param_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter after - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter after")),
                        }
                    },
                    None => None,
                };
                let param_before = query_params.iter().filter(|e| e.0 == "before").map(|e| e.1.clone())
                    .next();
                let param_before = match param_before {
                    Some(param_before) => {
                        let param_before =
                            <String as std::str::FromStr>::from_str
                                (&param_before);
                        match param_before {
                            Ok(param_before) => Some(param_before),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter before - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter before")),
                        }
                    },
                    None => None,
                };
                let param_filter = query_params.iter().filter(|e| e.0 == "filter").map(|e| e.1.clone())
                    .next();
                let param_filter = match param_filter {
                    Some(param_filter) => {
                        let param_filter =
                            <models::ListFilesInVectorStoreBatchFilterParameter as std::str::FromStr>::from_str
                                (&param_filter);
                        match param_filter {
                            Ok(param_filter) => Some(param_filter),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter filter - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter filter")),
                        }
                    },
                    None => None,
                };
    #[cfg(not(feature = "validate"))]
                run_validation!(param_filter, "filter", validation);

                                let result = api_impl.list_vector_store_files(
                                            param_vector_store_id,
                                            param_limit,
                                            param_order,
                                            param_after,
                                            param_before,
                                            param_filter,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListVectorStoreFilesResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ModifyVectorStore - POST /vector_stores/{vector_store_id}
            hyper::Method::POST if path.matched(paths::ID_VECTOR_STORES_VECTOR_STORE_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_VECTOR_STORES_VECTOR_STORE_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE VECTOR_STORES_VECTOR_STORE_ID in set but failed match against \"{}\"", path, paths::REGEX_VECTOR_STORES_VECTOR_STORE_ID.as_str())
                    );

                let param_vector_store_id = match percent_encoding::percent_decode(path_params["vector_store_id"].as_bytes()).decode_utf8() {
                    Ok(param_vector_store_id) => match param_vector_store_id.parse::<String>() {
                        Ok(param_vector_store_id) => param_vector_store_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter vector_store_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["vector_store_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = http_body_util::BodyExt::collect(body).await.map(|f| f.to_bytes().to_vec());
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_update_vector_store_request: Option<models::UpdateVectorStoreRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {path}");
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_update_vector_store_request) => param_update_vector_store_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new(format!("Couldn't parse body parameter UpdateVectorStoreRequest - doesn't match schema: {e}")))
                                                        .expect("Unable to create Bad Request response for invalid body parameter UpdateVectorStoreRequest due to schema")),
                                    }

                                } else {
                                    None
                                };
                                let param_update_vector_store_request = match param_update_vector_store_request {
                                    Some(param_update_vector_store_request) => param_update_vector_store_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(BoxBody::new("Missing required body parameter UpdateVectorStoreRequest".to_string()))
                                                        .expect("Unable to create Bad Request response for missing body parameter UpdateVectorStoreRequest")),
                                };
        #[cfg(not(feature = "validate"))]
                                run_validation!(param_update_vector_store_request, "UpdateVectorStoreRequest", validation);


                                let result = api_impl.modify_vector_store(
                                            param_vector_store_id,
                                            param_update_vector_store_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {unused_elements:?}").as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }
                                        match result {
                                            Ok(rsp) => match rsp {
                                                ModifyVectorStoreResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(body_from_string(format!("Unable to read body: {}", e.into())))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // CancelVectorStoreFileBatch - POST /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel
            hyper::Method::POST if path.matched(paths::ID_VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES_BATCH_ID_CANCEL) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES_BATCH_ID_CANCEL
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES_BATCH_ID_CANCEL in set but failed match against \"{}\"", path, paths::REGEX_VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES_BATCH_ID_CANCEL.as_str())
                    );

                let param_vector_store_id = match percent_encoding::percent_decode(path_params["vector_store_id"].as_bytes()).decode_utf8() {
                    Ok(param_vector_store_id) => match param_vector_store_id.parse::<String>() {
                        Ok(param_vector_store_id) => param_vector_store_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter vector_store_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["vector_store_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_batch_id = match percent_encoding::percent_decode(path_params["batch_id"].as_bytes()).decode_utf8() {
                    Ok(param_batch_id) => match param_batch_id.parse::<String>() {
                        Ok(param_batch_id) => param_batch_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter batch_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["batch_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.cancel_vector_store_file_batch(
                                            param_vector_store_id,
                                            param_batch_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CancelVectorStoreFileBatchResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // DeleteVectorStoreFile - DELETE /vector_stores/{vector_store_id}/files/{file_id}
            hyper::Method::DELETE if path.matched(paths::ID_VECTOR_STORES_VECTOR_STORE_ID_FILES_FILE_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_VECTOR_STORES_VECTOR_STORE_ID_FILES_FILE_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE VECTOR_STORES_VECTOR_STORE_ID_FILES_FILE_ID in set but failed match against \"{}\"", path, paths::REGEX_VECTOR_STORES_VECTOR_STORE_ID_FILES_FILE_ID.as_str())
                    );

                let param_vector_store_id = match percent_encoding::percent_decode(path_params["vector_store_id"].as_bytes()).decode_utf8() {
                    Ok(param_vector_store_id) => match param_vector_store_id.parse::<String>() {
                        Ok(param_vector_store_id) => param_vector_store_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter vector_store_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["vector_store_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_file_id = match percent_encoding::percent_decode(path_params["file_id"].as_bytes()).decode_utf8() {
                    Ok(param_file_id) => match param_file_id.parse::<String>() {
                        Ok(param_file_id) => param_file_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter file_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["file_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.delete_vector_store_file(
                                            param_vector_store_id,
                                            param_file_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteVectorStoreFileResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetVectorStoreFile - GET /vector_stores/{vector_store_id}/files/{file_id}
            hyper::Method::GET if path.matched(paths::ID_VECTOR_STORES_VECTOR_STORE_ID_FILES_FILE_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_VECTOR_STORES_VECTOR_STORE_ID_FILES_FILE_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE VECTOR_STORES_VECTOR_STORE_ID_FILES_FILE_ID in set but failed match against \"{}\"", path, paths::REGEX_VECTOR_STORES_VECTOR_STORE_ID_FILES_FILE_ID.as_str())
                    );

                let param_vector_store_id = match percent_encoding::percent_decode(path_params["vector_store_id"].as_bytes()).decode_utf8() {
                    Ok(param_vector_store_id) => match param_vector_store_id.parse::<String>() {
                        Ok(param_vector_store_id) => param_vector_store_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter vector_store_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["vector_store_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_file_id = match percent_encoding::percent_decode(path_params["file_id"].as_bytes()).decode_utf8() {
                    Ok(param_file_id) => match param_file_id.parse::<String>() {
                        Ok(param_file_id) => param_file_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter file_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["file_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.get_vector_store_file(
                                            param_vector_store_id,
                                            param_file_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetVectorStoreFileResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetVectorStoreFileBatch - GET /vector_stores/{vector_store_id}/file_batches/{batch_id}
            hyper::Method::GET if path.matched(paths::ID_VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES_BATCH_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES_BATCH_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES_BATCH_ID in set but failed match against \"{}\"", path, paths::REGEX_VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES_BATCH_ID.as_str())
                    );

                let param_vector_store_id = match percent_encoding::percent_decode(path_params["vector_store_id"].as_bytes()).decode_utf8() {
                    Ok(param_vector_store_id) => match param_vector_store_id.parse::<String>() {
                        Ok(param_vector_store_id) => param_vector_store_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter vector_store_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["vector_store_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_batch_id = match percent_encoding::percent_decode(path_params["batch_id"].as_bytes()).decode_utf8() {
                    Ok(param_batch_id) => match param_batch_id.parse::<String>() {
                        Ok(param_batch_id) => param_batch_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter batch_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["batch_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.get_vector_store_file_batch(
                                            param_vector_store_id,
                                            param_batch_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetVectorStoreFileBatchResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ListFilesInVectorStoreBatch - GET /vector_stores/{vector_store_id}/file_batches/{batch_id}/files
            hyper::Method::GET if path.matched(paths::ID_VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES_BATCH_ID_FILES) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(body_from_str("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES_BATCH_ID_FILES
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES_BATCH_ID_FILES in set but failed match against \"{}\"", path, paths::REGEX_VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES_BATCH_ID_FILES.as_str())
                    );

                let param_vector_store_id = match percent_encoding::percent_decode(path_params["vector_store_id"].as_bytes()).decode_utf8() {
                    Ok(param_vector_store_id) => match param_vector_store_id.parse::<String>() {
                        Ok(param_vector_store_id) => param_vector_store_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter vector_store_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["vector_store_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_batch_id = match percent_encoding::percent_decode(path_params["batch_id"].as_bytes()).decode_utf8() {
                    Ok(param_batch_id) => match param_batch_id.parse::<String>() {
                        Ok(param_batch_id) => param_batch_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't parse path parameter batch_id: {e}")))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(body_from_string(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["batch_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter limit - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_order = query_params.iter().filter(|e| e.0 == "order").map(|e| e.1.clone())
                    .next();
                let param_order = match param_order {
                    Some(param_order) => {
                        let param_order =
                            <models::ListAssistantsOrderParameter as std::str::FromStr>::from_str
                                (&param_order);
                        match param_order {
                            Ok(param_order) => Some(param_order),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter order - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter order")),
                        }
                    },
                    None => None,
                };
    #[cfg(not(feature = "validate"))]
                run_validation!(param_order, "order", validation);
                let param_after = query_params.iter().filter(|e| e.0 == "after").map(|e| e.1.clone())
                    .next();
                let param_after = match param_after {
                    Some(param_after) => {
                        let param_after =
                            <String as std::str::FromStr>::from_str
                                (&param_after);
                        match param_after {
                            Ok(param_after) => Some(param_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter after - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter after")),
                        }
                    },
                    None => None,
                };
                let param_before = query_params.iter().filter(|e| e.0 == "before").map(|e| e.1.clone())
                    .next();
                let param_before = match param_before {
                    Some(param_before) => {
                        let param_before =
                            <String as std::str::FromStr>::from_str
                                (&param_before);
                        match param_before {
                            Ok(param_before) => Some(param_before),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter before - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter before")),
                        }
                    },
                    None => None,
                };
                let param_filter = query_params.iter().filter(|e| e.0 == "filter").map(|e| e.1.clone())
                    .next();
                let param_filter = match param_filter {
                    Some(param_filter) => {
                        let param_filter =
                            <models::ListFilesInVectorStoreBatchFilterParameter as std::str::FromStr>::from_str
                                (&param_filter);
                        match param_filter {
                            Ok(param_filter) => Some(param_filter),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter filter - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter filter")),
                        }
                    },
                    None => None,
                };
    #[cfg(not(feature = "validate"))]
                run_validation!(param_filter, "filter", validation);

                                let result = api_impl.list_files_in_vector_store_batch(
                                            param_vector_store_id,
                                            param_batch_id,
                                            param_limit,
                                            param_order,
                                            param_after,
                                            param_before,
                                            param_filter,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListFilesInVectorStoreBatchResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            _ if path.matched(paths::ID_ASSISTANTS) => method_not_allowed(),
            _ if path.matched(paths::ID_ASSISTANTS_ASSISTANT_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_AUDIO_SPEECH) => method_not_allowed(),
            _ if path.matched(paths::ID_AUDIO_TRANSCRIPTIONS) => method_not_allowed(),
            _ if path.matched(paths::ID_AUDIO_TRANSLATIONS) => method_not_allowed(),
            _ if path.matched(paths::ID_BATCHES) => method_not_allowed(),
            _ if path.matched(paths::ID_BATCHES_BATCH_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_BATCHES_BATCH_ID_CANCEL) => method_not_allowed(),
            _ if path.matched(paths::ID_CHAT_COMPLETIONS) => method_not_allowed(),
            _ if path.matched(paths::ID_COMPLETIONS) => method_not_allowed(),
            _ if path.matched(paths::ID_EMBEDDINGS) => method_not_allowed(),
            _ if path.matched(paths::ID_FILES) => method_not_allowed(),
            _ if path.matched(paths::ID_FILES_FILE_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_FILES_FILE_ID_CONTENT) => method_not_allowed(),
            _ if path.matched(paths::ID_FINE_TUNING_JOBS) => method_not_allowed(),
            _ if path.matched(paths::ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CANCEL) => method_not_allowed(),
            _ if path.matched(paths::ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CHECKPOINTS) => method_not_allowed(),
            _ if path.matched(paths::ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_EVENTS) => method_not_allowed(),
            _ if path.matched(paths::ID_IMAGES_EDITS) => method_not_allowed(),
            _ if path.matched(paths::ID_IMAGES_GENERATIONS) => method_not_allowed(),
            _ if path.matched(paths::ID_IMAGES_VARIATIONS) => method_not_allowed(),
            _ if path.matched(paths::ID_MODELS) => method_not_allowed(),
            _ if path.matched(paths::ID_MODELS_MODEL) => method_not_allowed(),
            _ if path.matched(paths::ID_MODERATIONS) => method_not_allowed(),
            _ if path.matched(paths::ID_ORGANIZATION_ADMIN_API_KEYS) => method_not_allowed(),
            _ if path.matched(paths::ID_ORGANIZATION_ADMIN_API_KEYS_KEY_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_ORGANIZATION_AUDIT_LOGS) => method_not_allowed(),
            _ if path.matched(paths::ID_ORGANIZATION_COSTS) => method_not_allowed(),
            _ if path.matched(paths::ID_ORGANIZATION_INVITES) => method_not_allowed(),
            _ if path.matched(paths::ID_ORGANIZATION_INVITES_INVITE_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_ORGANIZATION_PROJECTS) => method_not_allowed(),
            _ if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_API_KEYS) => method_not_allowed(),
            _ if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_API_KEYS_KEY_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_ARCHIVE) => method_not_allowed(),
            _ if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_RATE_LIMITS) => method_not_allowed(),
            _ if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_RATE_LIMITS_RATE_LIMIT_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_SERVICE_ACCOUNTS) => method_not_allowed(),
            _ if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_SERVICE_ACCOUNTS_SERVICE_ACCOUNT_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_USERS) => method_not_allowed(),
            _ if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_USERS_USER_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_ORGANIZATION_USAGE_AUDIO_SPEECHES) => method_not_allowed(),
            _ if path.matched(paths::ID_ORGANIZATION_USAGE_AUDIO_TRANSCRIPTIONS) => method_not_allowed(),
            _ if path.matched(paths::ID_ORGANIZATION_USAGE_CODE_INTERPRETER_SESSIONS) => method_not_allowed(),
            _ if path.matched(paths::ID_ORGANIZATION_USAGE_COMPLETIONS) => method_not_allowed(),
            _ if path.matched(paths::ID_ORGANIZATION_USAGE_EMBEDDINGS) => method_not_allowed(),
            _ if path.matched(paths::ID_ORGANIZATION_USAGE_IMAGES) => method_not_allowed(),
            _ if path.matched(paths::ID_ORGANIZATION_USAGE_MODERATIONS) => method_not_allowed(),
            _ if path.matched(paths::ID_ORGANIZATION_USAGE_VECTOR_STORES) => method_not_allowed(),
            _ if path.matched(paths::ID_ORGANIZATION_USERS) => method_not_allowed(),
            _ if path.matched(paths::ID_ORGANIZATION_USERS_USER_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_REALTIME_SESSIONS) => method_not_allowed(),
            _ if path.matched(paths::ID_THREADS) => method_not_allowed(),
            _ if path.matched(paths::ID_THREADS_RUNS) => method_not_allowed(),
            _ if path.matched(paths::ID_THREADS_THREAD_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_THREADS_THREAD_ID_MESSAGES) => method_not_allowed(),
            _ if path.matched(paths::ID_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_THREADS_THREAD_ID_RUNS) => method_not_allowed(),
            _ if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID_CANCEL) => method_not_allowed(),
            _ if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID_STEPS) => method_not_allowed(),
            _ if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID_STEPS_STEP_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID_SUBMIT_TOOL_OUTPUTS) => method_not_allowed(),
            _ if path.matched(paths::ID_UPLOADS) => method_not_allowed(),
            _ if path.matched(paths::ID_UPLOADS_UPLOAD_ID_CANCEL) => method_not_allowed(),
            _ if path.matched(paths::ID_UPLOADS_UPLOAD_ID_COMPLETE) => method_not_allowed(),
            _ if path.matched(paths::ID_UPLOADS_UPLOAD_ID_PARTS) => method_not_allowed(),
            _ if path.matched(paths::ID_VECTOR_STORES) => method_not_allowed(),
            _ if path.matched(paths::ID_VECTOR_STORES_VECTOR_STORE_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES) => method_not_allowed(),
            _ if path.matched(paths::ID_VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES_BATCH_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES_BATCH_ID_CANCEL) => method_not_allowed(),
            _ if path.matched(paths::ID_VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES_BATCH_ID_FILES) => method_not_allowed(),
            _ if path.matched(paths::ID_VECTOR_STORES_VECTOR_STORE_ID_FILES) => method_not_allowed(),
            _ if path.matched(paths::ID_VECTOR_STORES_VECTOR_STORE_ID_FILES_FILE_ID) => method_not_allowed(),
                _ => Ok(Response::builder().status(StatusCode::NOT_FOUND)
                        .body(BoxBody::new(http_body_util::Empty::new()))
                        .expect("Unable to create Not Found response"))
            }
        }
        Box::pin(run(
            self.api_impl.clone(),
            req,
            self.validation,
            self.multipart_form_size_limit
        ))
    }
}

/// Request parser for `Api`.
pub struct ApiRequestParser;
impl<T> RequestParser<T> for ApiRequestParser {
    fn parse_operation_id(request: &Request<T>) -> Option<&'static str> {
        let path = paths::GLOBAL_REGEX_SET.matches(request.uri().path());
        match *request.method() {
            // CreateAssistant - POST /assistants
            hyper::Method::POST if path.matched(paths::ID_ASSISTANTS) => Some("CreateAssistant"),
            // CreateThread - POST /threads
            hyper::Method::POST if path.matched(paths::ID_THREADS) => Some("CreateThread"),
            // CreateThreadAndRun - POST /threads/runs
            hyper::Method::POST if path.matched(paths::ID_THREADS_RUNS) => Some("CreateThreadAndRun"),
            // ListAssistants - GET /assistants
            hyper::Method::GET if path.matched(paths::ID_ASSISTANTS) => Some("ListAssistants"),
            // CreateMessage - POST /threads/{thread_id}/messages
            hyper::Method::POST if path.matched(paths::ID_THREADS_THREAD_ID_MESSAGES) => Some("CreateMessage"),
            // CreateRun - POST /threads/{thread_id}/runs
            hyper::Method::POST if path.matched(paths::ID_THREADS_THREAD_ID_RUNS) => Some("CreateRun"),
            // DeleteAssistant - DELETE /assistants/{assistant_id}
            hyper::Method::DELETE if path.matched(paths::ID_ASSISTANTS_ASSISTANT_ID) => Some("DeleteAssistant"),
            // DeleteThread - DELETE /threads/{thread_id}
            hyper::Method::DELETE if path.matched(paths::ID_THREADS_THREAD_ID) => Some("DeleteThread"),
            // GetAssistant - GET /assistants/{assistant_id}
            hyper::Method::GET if path.matched(paths::ID_ASSISTANTS_ASSISTANT_ID) => Some("GetAssistant"),
            // GetThread - GET /threads/{thread_id}
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID) => Some("GetThread"),
            // ListMessages - GET /threads/{thread_id}/messages
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID_MESSAGES) => Some("ListMessages"),
            // ListRuns - GET /threads/{thread_id}/runs
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID_RUNS) => Some("ListRuns"),
            // ModifyAssistant - POST /assistants/{assistant_id}
            hyper::Method::POST if path.matched(paths::ID_ASSISTANTS_ASSISTANT_ID) => Some("ModifyAssistant"),
            // ModifyThread - POST /threads/{thread_id}
            hyper::Method::POST if path.matched(paths::ID_THREADS_THREAD_ID) => Some("ModifyThread"),
            // CancelRun - POST /threads/{thread_id}/runs/{run_id}/cancel
            hyper::Method::POST if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID_CANCEL) => Some("CancelRun"),
            // DeleteMessage - DELETE /threads/{thread_id}/messages/{message_id}
            hyper::Method::DELETE if path.matched(paths::ID_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID) => Some("DeleteMessage"),
            // GetMessage - GET /threads/{thread_id}/messages/{message_id}
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID) => Some("GetMessage"),
            // GetRun - GET /threads/{thread_id}/runs/{run_id}
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID) => Some("GetRun"),
            // ListRunSteps - GET /threads/{thread_id}/runs/{run_id}/steps
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID_STEPS) => Some("ListRunSteps"),
            // ModifyMessage - POST /threads/{thread_id}/messages/{message_id}
            hyper::Method::POST if path.matched(paths::ID_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID) => Some("ModifyMessage"),
            // ModifyRun - POST /threads/{thread_id}/runs/{run_id}
            hyper::Method::POST if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID) => Some("ModifyRun"),
            // SubmitToolOuputsToRun - POST /threads/{thread_id}/runs/{run_id}/submit_tool_outputs
            hyper::Method::POST if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID_SUBMIT_TOOL_OUTPUTS) => Some("SubmitToolOuputsToRun"),
            // GetRunStep - GET /threads/{thread_id}/runs/{run_id}/steps/{step_id}
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID_STEPS_STEP_ID) => Some("GetRunStep"),
            // CreateSpeech - POST /audio/speech
            hyper::Method::POST if path.matched(paths::ID_AUDIO_SPEECH) => Some("CreateSpeech"),
            // CreateTranscription - POST /audio/transcriptions
            hyper::Method::POST if path.matched(paths::ID_AUDIO_TRANSCRIPTIONS) => Some("CreateTranscription"),
            // CreateTranslation - POST /audio/translations
            hyper::Method::POST if path.matched(paths::ID_AUDIO_TRANSLATIONS) => Some("CreateTranslation"),
            // ListAuditLogs - GET /organization/audit_logs
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_AUDIT_LOGS) => Some("ListAuditLogs"),
            // CreateBatch - POST /batches
            hyper::Method::POST if path.matched(paths::ID_BATCHES) => Some("CreateBatch"),
            // ListBatches - GET /batches
            hyper::Method::GET if path.matched(paths::ID_BATCHES) => Some("ListBatches"),
            // CancelBatch - POST /batches/{batch_id}/cancel
            hyper::Method::POST if path.matched(paths::ID_BATCHES_BATCH_ID_CANCEL) => Some("CancelBatch"),
            // RetrieveBatch - GET /batches/{batch_id}
            hyper::Method::GET if path.matched(paths::ID_BATCHES_BATCH_ID) => Some("RetrieveBatch"),
            // CreateChatCompletion - POST /chat/completions
            hyper::Method::POST if path.matched(paths::ID_CHAT_COMPLETIONS) => Some("CreateChatCompletion"),
            // CreateCompletion - POST /completions
            hyper::Method::POST if path.matched(paths::ID_COMPLETIONS) => Some("CreateCompletion"),
            // AdminApiKeysCreate - POST /organization/admin_api_keys
            hyper::Method::POST if path.matched(paths::ID_ORGANIZATION_ADMIN_API_KEYS) => Some("AdminApiKeysCreate"),
            // AdminApiKeysList - GET /organization/admin_api_keys
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_ADMIN_API_KEYS) => Some("AdminApiKeysList"),
            // AdminApiKeysDelete - DELETE /organization/admin_api_keys/{key_id}
            hyper::Method::DELETE if path.matched(paths::ID_ORGANIZATION_ADMIN_API_KEYS_KEY_ID) => Some("AdminApiKeysDelete"),
            // AdminApiKeysGet - GET /organization/admin_api_keys/{key_id}
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_ADMIN_API_KEYS_KEY_ID) => Some("AdminApiKeysGet"),
            // CreateEmbedding - POST /embeddings
            hyper::Method::POST if path.matched(paths::ID_EMBEDDINGS) => Some("CreateEmbedding"),
            // CreateFile - POST /files
            hyper::Method::POST if path.matched(paths::ID_FILES) => Some("CreateFile"),
            // ListFiles - GET /files
            hyper::Method::GET if path.matched(paths::ID_FILES) => Some("ListFiles"),
            // DeleteFile - DELETE /files/{file_id}
            hyper::Method::DELETE if path.matched(paths::ID_FILES_FILE_ID) => Some("DeleteFile"),
            // DownloadFile - GET /files/{file_id}/content
            hyper::Method::GET if path.matched(paths::ID_FILES_FILE_ID_CONTENT) => Some("DownloadFile"),
            // RetrieveFile - GET /files/{file_id}
            hyper::Method::GET if path.matched(paths::ID_FILES_FILE_ID) => Some("RetrieveFile"),
            // CreateFineTuningJob - POST /fine_tuning/jobs
            hyper::Method::POST if path.matched(paths::ID_FINE_TUNING_JOBS) => Some("CreateFineTuningJob"),
            // ListPaginatedFineTuningJobs - GET /fine_tuning/jobs
            hyper::Method::GET if path.matched(paths::ID_FINE_TUNING_JOBS) => Some("ListPaginatedFineTuningJobs"),
            // CancelFineTuningJob - POST /fine_tuning/jobs/{fine_tuning_job_id}/cancel
            hyper::Method::POST if path.matched(paths::ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CANCEL) => Some("CancelFineTuningJob"),
            // ListFineTuningEvents - GET /fine_tuning/jobs/{fine_tuning_job_id}/events
            hyper::Method::GET if path.matched(paths::ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_EVENTS) => Some("ListFineTuningEvents"),
            // ListFineTuningJobCheckpoints - GET /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints
            hyper::Method::GET if path.matched(paths::ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CHECKPOINTS) => Some("ListFineTuningJobCheckpoints"),
            // RetrieveFineTuningJob - GET /fine_tuning/jobs/{fine_tuning_job_id}
            hyper::Method::GET if path.matched(paths::ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID) => Some("RetrieveFineTuningJob"),
            // CreateImage - POST /images/generations
            hyper::Method::POST if path.matched(paths::ID_IMAGES_GENERATIONS) => Some("CreateImage"),
            // CreateImageEdit - POST /images/edits
            hyper::Method::POST if path.matched(paths::ID_IMAGES_EDITS) => Some("CreateImageEdit"),
            // CreateImageVariation - POST /images/variations
            hyper::Method::POST if path.matched(paths::ID_IMAGES_VARIATIONS) => Some("CreateImageVariation"),
            // InviteUser - POST /organization/invites
            hyper::Method::POST if path.matched(paths::ID_ORGANIZATION_INVITES) => Some("InviteUser"),
            // ListInvites - GET /organization/invites
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_INVITES) => Some("ListInvites"),
            // DeleteInvite - DELETE /organization/invites/{invite_id}
            hyper::Method::DELETE if path.matched(paths::ID_ORGANIZATION_INVITES_INVITE_ID) => Some("DeleteInvite"),
            // RetrieveInvite - GET /organization/invites/{invite_id}
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_INVITES_INVITE_ID) => Some("RetrieveInvite"),
            // ListModels - GET /models
            hyper::Method::GET if path.matched(paths::ID_MODELS) => Some("ListModels"),
            // DeleteModel - DELETE /models/{model}
            hyper::Method::DELETE if path.matched(paths::ID_MODELS_MODEL) => Some("DeleteModel"),
            // RetrieveModel - GET /models/{model}
            hyper::Method::GET if path.matched(paths::ID_MODELS_MODEL) => Some("RetrieveModel"),
            // CreateModeration - POST /moderations
            hyper::Method::POST if path.matched(paths::ID_MODERATIONS) => Some("CreateModeration"),
            // CreateProject - POST /organization/projects
            hyper::Method::POST if path.matched(paths::ID_ORGANIZATION_PROJECTS) => Some("CreateProject"),
            // ListProjects - GET /organization/projects
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_PROJECTS) => Some("ListProjects"),
            // ArchiveProject - POST /organization/projects/{project_id}/archive
            hyper::Method::POST if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_ARCHIVE) => Some("ArchiveProject"),
            // CreateProjectServiceAccount - POST /organization/projects/{project_id}/service_accounts
            hyper::Method::POST if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_SERVICE_ACCOUNTS) => Some("CreateProjectServiceAccount"),
            // CreateProjectUser - POST /organization/projects/{project_id}/users
            hyper::Method::POST if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_USERS) => Some("CreateProjectUser"),
            // ListProjectApiKeys - GET /organization/projects/{project_id}/api_keys
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_API_KEYS) => Some("ListProjectApiKeys"),
            // ListProjectRateLimits - GET /organization/projects/{project_id}/rate_limits
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_RATE_LIMITS) => Some("ListProjectRateLimits"),
            // ListProjectServiceAccounts - GET /organization/projects/{project_id}/service_accounts
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_SERVICE_ACCOUNTS) => Some("ListProjectServiceAccounts"),
            // ListProjectUsers - GET /organization/projects/{project_id}/users
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_USERS) => Some("ListProjectUsers"),
            // ModifyProject - POST /organization/projects/{project_id}
            hyper::Method::POST if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID) => Some("ModifyProject"),
            // RetrieveProject - GET /organization/projects/{project_id}
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID) => Some("RetrieveProject"),
            // DeleteProjectApiKey - DELETE /organization/projects/{project_id}/api_keys/{key_id}
            hyper::Method::DELETE if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_API_KEYS_KEY_ID) => Some("DeleteProjectApiKey"),
            // DeleteProjectServiceAccount - DELETE /organization/projects/{project_id}/service_accounts/{service_account_id}
            hyper::Method::DELETE if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_SERVICE_ACCOUNTS_SERVICE_ACCOUNT_ID) => Some("DeleteProjectServiceAccount"),
            // DeleteProjectUser - DELETE /organization/projects/{project_id}/users/{user_id}
            hyper::Method::DELETE if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_USERS_USER_ID) => Some("DeleteProjectUser"),
            // ModifyProjectUser - POST /organization/projects/{project_id}/users/{user_id}
            hyper::Method::POST if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_USERS_USER_ID) => Some("ModifyProjectUser"),
            // RetrieveProjectApiKey - GET /organization/projects/{project_id}/api_keys/{key_id}
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_API_KEYS_KEY_ID) => Some("RetrieveProjectApiKey"),
            // RetrieveProjectServiceAccount - GET /organization/projects/{project_id}/service_accounts/{service_account_id}
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_SERVICE_ACCOUNTS_SERVICE_ACCOUNT_ID) => Some("RetrieveProjectServiceAccount"),
            // RetrieveProjectUser - GET /organization/projects/{project_id}/users/{user_id}
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_USERS_USER_ID) => Some("RetrieveProjectUser"),
            // UpdateProjectRateLimits - POST /organization/projects/{project_id}/rate_limits/{rate_limit_id}
            hyper::Method::POST if path.matched(paths::ID_ORGANIZATION_PROJECTS_PROJECT_ID_RATE_LIMITS_RATE_LIMIT_ID) => Some("UpdateProjectRateLimits"),
            // CreateRealtimeSession - POST /realtime/sessions
            hyper::Method::POST if path.matched(paths::ID_REALTIME_SESSIONS) => Some("CreateRealtimeSession"),
            // CreateUpload - POST /uploads
            hyper::Method::POST if path.matched(paths::ID_UPLOADS) => Some("CreateUpload"),
            // AddUploadPart - POST /uploads/{upload_id}/parts
            hyper::Method::POST if path.matched(paths::ID_UPLOADS_UPLOAD_ID_PARTS) => Some("AddUploadPart"),
            // CancelUpload - POST /uploads/{upload_id}/cancel
            hyper::Method::POST if path.matched(paths::ID_UPLOADS_UPLOAD_ID_CANCEL) => Some("CancelUpload"),
            // CompleteUpload - POST /uploads/{upload_id}/complete
            hyper::Method::POST if path.matched(paths::ID_UPLOADS_UPLOAD_ID_COMPLETE) => Some("CompleteUpload"),
            // UsageAudioSpeeches - GET /organization/usage/audio_speeches
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_USAGE_AUDIO_SPEECHES) => Some("UsageAudioSpeeches"),
            // UsageAudioTranscriptions - GET /organization/usage/audio_transcriptions
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_USAGE_AUDIO_TRANSCRIPTIONS) => Some("UsageAudioTranscriptions"),
            // UsageCodeInterpreterSessions - GET /organization/usage/code_interpreter_sessions
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_USAGE_CODE_INTERPRETER_SESSIONS) => Some("UsageCodeInterpreterSessions"),
            // UsageCompletions - GET /organization/usage/completions
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_USAGE_COMPLETIONS) => Some("UsageCompletions"),
            // UsageCosts - GET /organization/costs
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_COSTS) => Some("UsageCosts"),
            // UsageEmbeddings - GET /organization/usage/embeddings
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_USAGE_EMBEDDINGS) => Some("UsageEmbeddings"),
            // UsageImages - GET /organization/usage/images
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_USAGE_IMAGES) => Some("UsageImages"),
            // UsageModerations - GET /organization/usage/moderations
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_USAGE_MODERATIONS) => Some("UsageModerations"),
            // UsageVectorStores - GET /organization/usage/vector_stores
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_USAGE_VECTOR_STORES) => Some("UsageVectorStores"),
            // ListUsers - GET /organization/users
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_USERS) => Some("ListUsers"),
            // DeleteUser - DELETE /organization/users/{user_id}
            hyper::Method::DELETE if path.matched(paths::ID_ORGANIZATION_USERS_USER_ID) => Some("DeleteUser"),
            // ModifyUser - POST /organization/users/{user_id}
            hyper::Method::POST if path.matched(paths::ID_ORGANIZATION_USERS_USER_ID) => Some("ModifyUser"),
            // RetrieveUser - GET /organization/users/{user_id}
            hyper::Method::GET if path.matched(paths::ID_ORGANIZATION_USERS_USER_ID) => Some("RetrieveUser"),
            // CreateVectorStore - POST /vector_stores
            hyper::Method::POST if path.matched(paths::ID_VECTOR_STORES) => Some("CreateVectorStore"),
            // ListVectorStores - GET /vector_stores
            hyper::Method::GET if path.matched(paths::ID_VECTOR_STORES) => Some("ListVectorStores"),
            // CreateVectorStoreFile - POST /vector_stores/{vector_store_id}/files
            hyper::Method::POST if path.matched(paths::ID_VECTOR_STORES_VECTOR_STORE_ID_FILES) => Some("CreateVectorStoreFile"),
            // CreateVectorStoreFileBatch - POST /vector_stores/{vector_store_id}/file_batches
            hyper::Method::POST if path.matched(paths::ID_VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES) => Some("CreateVectorStoreFileBatch"),
            // DeleteVectorStore - DELETE /vector_stores/{vector_store_id}
            hyper::Method::DELETE if path.matched(paths::ID_VECTOR_STORES_VECTOR_STORE_ID) => Some("DeleteVectorStore"),
            // GetVectorStore - GET /vector_stores/{vector_store_id}
            hyper::Method::GET if path.matched(paths::ID_VECTOR_STORES_VECTOR_STORE_ID) => Some("GetVectorStore"),
            // ListVectorStoreFiles - GET /vector_stores/{vector_store_id}/files
            hyper::Method::GET if path.matched(paths::ID_VECTOR_STORES_VECTOR_STORE_ID_FILES) => Some("ListVectorStoreFiles"),
            // ModifyVectorStore - POST /vector_stores/{vector_store_id}
            hyper::Method::POST if path.matched(paths::ID_VECTOR_STORES_VECTOR_STORE_ID) => Some("ModifyVectorStore"),
            // CancelVectorStoreFileBatch - POST /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel
            hyper::Method::POST if path.matched(paths::ID_VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES_BATCH_ID_CANCEL) => Some("CancelVectorStoreFileBatch"),
            // DeleteVectorStoreFile - DELETE /vector_stores/{vector_store_id}/files/{file_id}
            hyper::Method::DELETE if path.matched(paths::ID_VECTOR_STORES_VECTOR_STORE_ID_FILES_FILE_ID) => Some("DeleteVectorStoreFile"),
            // GetVectorStoreFile - GET /vector_stores/{vector_store_id}/files/{file_id}
            hyper::Method::GET if path.matched(paths::ID_VECTOR_STORES_VECTOR_STORE_ID_FILES_FILE_ID) => Some("GetVectorStoreFile"),
            // GetVectorStoreFileBatch - GET /vector_stores/{vector_store_id}/file_batches/{batch_id}
            hyper::Method::GET if path.matched(paths::ID_VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES_BATCH_ID) => Some("GetVectorStoreFileBatch"),
            // ListFilesInVectorStoreBatch - GET /vector_stores/{vector_store_id}/file_batches/{batch_id}/files
            hyper::Method::GET if path.matched(paths::ID_VECTOR_STORES_VECTOR_STORE_ID_FILE_BATCHES_BATCH_ID_FILES) => Some("ListFilesInVectorStoreBatch"),
            _ => None,
        }
    }
}
