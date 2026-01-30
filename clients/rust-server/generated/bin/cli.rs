//! CLI tool driving the API client
use anyhow::{anyhow, Context, Result};
use clap::Parser;
use dialoguer::Confirm;
use log::{debug, info};
// models may be unused if all inputs are primitive types
#[allow(unused_imports)]
use openapi_client::{
    models, ApiNoContext, Client, ContextWrapperExt,
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
use simple_logger::SimpleLogger;
use swagger::{AuthData, ContextBuilder, EmptyContext, Push, XSpanIdString};

type ClientContext = swagger::make_context_ty!(
    ContextBuilder,
    EmptyContext,
    Option<AuthData>,
    XSpanIdString
);

#[derive(Parser, Debug)]
#[clap(
    name = "OpenAI API",
    version = "2.3.0",
    about = "CLI access to OpenAI API"
)]
struct Cli {
    #[clap(subcommand)]
    operation: Operation,

    /// Address or hostname of the server hosting this API, including optional port
    #[clap(short = 'a', long, default_value = "http://localhost")]
    server_address: String,

    /// Path to the client private key if using client-side TLS authentication
    #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
    #[clap(long, requires_all(&["client_certificate", "server_certificate"]))]
    client_key: Option<String>,

    /// Path to the client's public certificate associated with the private key
    #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
    #[clap(long, requires_all(&["client_key", "server_certificate"]))]
    client_certificate: Option<String>,

    /// Path to CA certificate used to authenticate the server
    #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
    #[clap(long)]
    server_certificate: Option<String>,

    /// If set, write output to file instead of stdout
    #[clap(short, long)]
    output_file: Option<String>,

    #[command(flatten)]
    verbosity: clap_verbosity_flag::Verbosity,

    /// Don't ask for any confirmation prompts
    #[allow(dead_code)]
    #[clap(short, long)]
    force: bool,

    /// Bearer token if used for authentication
    #[arg(env = "OPENAPI_CLIENT_BEARER_TOKEN", hide_env = true)]
    bearer_token: Option<String>,
}

#[derive(Parser, Debug)]
enum Operation {
    /// Create an assistant with a model and instructions.
    CreateAssistant {
        #[clap(value_parser = parse_json::<models::CreateAssistantRequest>)]
        create_assistant_request: models::CreateAssistantRequest,
    },
    /// Create a thread.
    CreateThread {
        #[clap(value_parser = parse_json::<models::CreateThreadRequest>)]
        create_thread_request: Option<models::CreateThreadRequest>,
    },
    /// Create a thread and run it in one request.
    CreateThreadAndRun {
        #[clap(value_parser = parse_json::<models::CreateThreadAndRunRequest>)]
        create_thread_and_run_request: models::CreateThreadAndRunRequest,
    },
    /// Returns a list of assistants.
    ListAssistants {
        /// A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
        limit: Option<i32>,
        /// Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
        #[clap(value_parser = parse_json::<models::ListAssistantsOrderParameter>)]
        order: Option<models::ListAssistantsOrderParameter>,
        /// A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
        after: Option<String>,
        /// A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
        before: Option<String>,
    },
    /// Create a message.
    CreateMessage {
        /// The ID of the [thread](/docs/api-reference/threads) to create a message for.
        thread_id: String,
        #[clap(value_parser = parse_json::<models::CreateMessageRequest>)]
        create_message_request: models::CreateMessageRequest,
    },
    /// Create a run.
    CreateRun {
        /// The ID of the thread to run.
        thread_id: String,
        #[clap(value_parser = parse_json::<models::CreateRunRequest>)]
        create_run_request: models::CreateRunRequest,
        /// A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
        #[clap(value_parser = parse_json::<Vec<models::CreateRunIncludeParameterInner>>, long)]
        include_left_square_bracket_right_square_bracket: Option<Vec<models::CreateRunIncludeParameterInner>>,
    },
    /// Delete an assistant.
    DeleteAssistant {
        /// The ID of the assistant to delete.
        assistant_id: String,
    },
    /// Delete a thread.
    DeleteThread {
        /// The ID of the thread to delete.
        thread_id: String,
    },
    /// Retrieves an assistant.
    GetAssistant {
        /// The ID of the assistant to retrieve.
        assistant_id: String,
    },
    /// Retrieves a thread.
    GetThread {
        /// The ID of the thread to retrieve.
        thread_id: String,
    },
    /// Returns a list of messages for a given thread.
    ListMessages {
        /// The ID of the [thread](/docs/api-reference/threads) the messages belong to.
        thread_id: String,
        /// A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
        limit: Option<i32>,
        /// Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
        #[clap(value_parser = parse_json::<models::ListAssistantsOrderParameter>)]
        order: Option<models::ListAssistantsOrderParameter>,
        /// A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
        after: Option<String>,
        /// A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
        before: Option<String>,
        /// Filter messages by the run ID that generated them. 
        run_id: Option<String>,
    },
    /// Returns a list of runs belonging to a thread.
    ListRuns {
        /// The ID of the thread the run belongs to.
        thread_id: String,
        /// A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
        limit: Option<i32>,
        /// Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
        #[clap(value_parser = parse_json::<models::ListAssistantsOrderParameter>)]
        order: Option<models::ListAssistantsOrderParameter>,
        /// A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
        after: Option<String>,
        /// A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
        before: Option<String>,
    },
    /// Modifies an assistant.
    ModifyAssistant {
        /// The ID of the assistant to modify.
        assistant_id: String,
        #[clap(value_parser = parse_json::<models::ModifyAssistantRequest>)]
        modify_assistant_request: models::ModifyAssistantRequest,
    },
    /// Modifies a thread.
    ModifyThread {
        /// The ID of the thread to modify. Only the `metadata` can be modified.
        thread_id: String,
        #[clap(value_parser = parse_json::<models::ModifyThreadRequest>)]
        modify_thread_request: models::ModifyThreadRequest,
    },
    /// Cancels a run that is `in_progress`.
    CancelRun {
        /// The ID of the thread to which this run belongs.
        thread_id: String,
        /// The ID of the run to cancel.
        run_id: String,
    },
    /// Deletes a message.
    DeleteMessage {
        /// The ID of the thread to which this message belongs.
        thread_id: String,
        /// The ID of the message to delete.
        message_id: String,
    },
    /// Retrieve a message.
    GetMessage {
        /// The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
        thread_id: String,
        /// The ID of the message to retrieve.
        message_id: String,
    },
    /// Retrieves a run.
    GetRun {
        /// The ID of the [thread](/docs/api-reference/threads) that was run.
        thread_id: String,
        /// The ID of the run to retrieve.
        run_id: String,
    },
    /// Returns a list of run steps belonging to a run.
    ListRunSteps {
        /// The ID of the thread the run and run steps belong to.
        thread_id: String,
        /// The ID of the run the run steps belong to.
        run_id: String,
        /// A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
        limit: Option<i32>,
        /// Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
        #[clap(value_parser = parse_json::<models::ListAssistantsOrderParameter>)]
        order: Option<models::ListAssistantsOrderParameter>,
        /// A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
        after: Option<String>,
        /// A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
        before: Option<String>,
        /// A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
        #[clap(value_parser = parse_json::<Vec<models::CreateRunIncludeParameterInner>>, long)]
        include_left_square_bracket_right_square_bracket: Option<Vec<models::CreateRunIncludeParameterInner>>,
    },
    /// Modifies a message.
    ModifyMessage {
        /// The ID of the thread to which this message belongs.
        thread_id: String,
        /// The ID of the message to modify.
        message_id: String,
        #[clap(value_parser = parse_json::<models::ModifyMessageRequest>)]
        modify_message_request: models::ModifyMessageRequest,
    },
    /// Modifies a run.
    ModifyRun {
        /// The ID of the [thread](/docs/api-reference/threads) that was run.
        thread_id: String,
        /// The ID of the run to modify.
        run_id: String,
        #[clap(value_parser = parse_json::<models::ModifyRunRequest>)]
        modify_run_request: models::ModifyRunRequest,
    },
    /// When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
    SubmitToolOuputsToRun {
        /// The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
        thread_id: String,
        /// The ID of the run that requires the tool output submission.
        run_id: String,
        #[clap(value_parser = parse_json::<models::SubmitToolOutputsRunRequest>)]
        submit_tool_outputs_run_request: models::SubmitToolOutputsRunRequest,
    },
    /// Retrieves a run step.
    GetRunStep {
        /// The ID of the thread to which the run and run step belongs.
        thread_id: String,
        /// The ID of the run to which the run step belongs.
        run_id: String,
        /// The ID of the run step to retrieve.
        step_id: String,
        /// A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
        #[clap(value_parser = parse_json::<Vec<models::CreateRunIncludeParameterInner>>, long)]
        include_left_square_bracket_right_square_bracket: Option<Vec<models::CreateRunIncludeParameterInner>>,
    },
    /// Generates audio from the input text.
    CreateSpeech {
        #[clap(value_parser = parse_json::<models::CreateSpeechRequest>)]
        create_speech_request: models::CreateSpeechRequest,
    },
    /// Transcribes audio into the input language.
    CreateTranscription {
        /// The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
        #[clap(value_parser = parse_json::<swagger::ByteArray>)]
        file: swagger::ByteArray,
        #[clap(value_parser = parse_json::<models::CreateTranscriptionRequestModel>)]
        model: models::CreateTranscriptionRequestModel,
        /// The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
        language: Option<String>,
        /// An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language. 
        prompt: Option<String>,
        #[clap(value_parser = parse_json::<models::AudioResponseFormat>)]
        response_format: Option<models::AudioResponseFormat>,
        /// The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
        temperature: Option<f64>,
        /// The timestamp granularities to populate for this transcription. `response_format` must be set `verbose_json` to use timestamp granularities. Either or both of these options are supported: `word`, or `segment`. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. 
        #[clap(value_parser = parse_json::<Vec<models::CreateTranscriptionRequestTimestampGranularitiesInner>>, long)]
        timestamp_granularities_left_square_bracket_right_square_bracket: Option<Vec<models::CreateTranscriptionRequestTimestampGranularitiesInner>>,
    },
    /// Translates audio into English.
    CreateTranslation {
        /// The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
        #[clap(value_parser = parse_json::<swagger::ByteArray>)]
        file: swagger::ByteArray,
        #[clap(value_parser = parse_json::<models::CreateTranscriptionRequestModel>)]
        model: models::CreateTranscriptionRequestModel,
        /// An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English. 
        prompt: Option<String>,
        #[clap(value_parser = parse_json::<models::AudioResponseFormat>)]
        response_format: Option<models::AudioResponseFormat>,
        /// The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
        temperature: Option<f64>,
    },
    /// List user actions and configuration changes within this organization.
    ListAuditLogs {
        /// Return only events whose `effective_at` (Unix seconds) is in this range.
        #[clap(value_parser = parse_json::<models::ListAuditLogsEffectiveAtParameter>)]
        effective_at: Option<models::ListAuditLogsEffectiveAtParameter>,
        /// Return only events for these projects.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        project_ids_left_square_bracket_right_square_bracket: Option<Vec<String>>,
        /// Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).
        #[clap(value_parser = parse_json::<Vec<models::AuditLogEventType>>, long)]
        event_types_left_square_bracket_right_square_bracket: Option<Vec<models::AuditLogEventType>>,
        /// Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        actor_ids_left_square_bracket_right_square_bracket: Option<Vec<String>>,
        /// Return only events performed by users with these emails.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        actor_emails_left_square_bracket_right_square_bracket: Option<Vec<String>>,
        /// Return only events performed on these targets. For example, a project ID updated.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        resource_ids_left_square_bracket_right_square_bracket: Option<Vec<String>>,
        /// A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
        limit: Option<i32>,
        /// A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
        after: Option<String>,
        /// A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
        before: Option<String>,
    },
    /// Creates and executes a batch from an uploaded file of requests
    CreateBatch {
        #[clap(value_parser = parse_json::<models::CreateBatchRequest>)]
        create_batch_request: models::CreateBatchRequest,
    },
    /// List your organization's batches.
    ListBatches {
        /// A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
        after: Option<String>,
        /// A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
        limit: Option<i32>,
    },
    /// Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
    CancelBatch {
        /// The ID of the batch to cancel.
        batch_id: String,
    },
    /// Retrieves a batch.
    RetrieveBatch {
        /// The ID of the batch to retrieve.
        batch_id: String,
    },
    /// Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 
    CreateChatCompletion {
        #[clap(value_parser = parse_json::<models::CreateChatCompletionRequest>)]
        create_chat_completion_request: models::CreateChatCompletionRequest,
    },
    /// Creates a completion for the provided prompt and parameters.
    CreateCompletion {
        #[clap(value_parser = parse_json::<models::CreateCompletionRequest>)]
        create_completion_request: models::CreateCompletionRequest,
    },
    /// Create an organization admin API key
    AdminApiKeysCreate {
        #[clap(value_parser = parse_json::<models::AdminApiKeysCreateRequest>)]
        admin_api_keys_create_request: models::AdminApiKeysCreateRequest,
    },
    /// List organization API keys
    AdminApiKeysList {
        after: Option<swagger::Nullable<String>>,
        #[clap(value_parser = parse_json::<models::AdminApiKeysListOrderParameter>)]
        order: Option<models::AdminApiKeysListOrderParameter>,
        limit: Option<i32>,
    },
    /// Delete an organization admin API key
    AdminApiKeysDelete {
        key_id: String,
    },
    /// Retrieve a single organization API key
    AdminApiKeysGet {
        key_id: String,
    },
    /// Creates an embedding vector representing the input text.
    CreateEmbedding {
        #[clap(value_parser = parse_json::<models::CreateEmbeddingRequest>)]
        create_embedding_request: models::CreateEmbeddingRequest,
    },
    /// Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
    CreateFile {
        /// The File object (not file name) to be uploaded. 
        #[clap(value_parser = parse_json::<swagger::ByteArray>)]
        file: swagger::ByteArray,
        #[clap(value_parser = parse_json::<models::CreateFileRequestPurpose>)]
        purpose: models::CreateFileRequestPurpose,
    },
    /// Returns a list of files.
    ListFiles {
        /// Only return files with the given purpose.
        purpose: Option<String>,
        /// A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000. 
        limit: Option<i32>,
        /// Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
        #[clap(value_parser = parse_json::<models::ListAssistantsOrderParameter>)]
        order: Option<models::ListAssistantsOrderParameter>,
        /// A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
        after: Option<String>,
    },
    /// Delete a file.
    DeleteFile {
        /// The ID of the file to use for this request.
        file_id: String,
    },
    /// Returns the contents of the specified file.
    DownloadFile {
        /// The ID of the file to use for this request.
        file_id: String,
    },
    /// Returns information about a specific file.
    RetrieveFile {
        /// The ID of the file to use for this request.
        file_id: String,
    },
    /// Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    CreateFineTuningJob {
        #[clap(value_parser = parse_json::<models::CreateFineTuningJobRequest>)]
        create_fine_tuning_job_request: models::CreateFineTuningJobRequest,
    },
    /// List your organization's fine-tuning jobs 
    ListPaginatedFineTuningJobs {
        /// Identifier for the last job from the previous pagination request.
        after: Option<String>,
        /// Number of fine-tuning jobs to retrieve.
        limit: Option<i32>,
    },
    /// Immediately cancel a fine-tune job. 
    CancelFineTuningJob {
        /// The ID of the fine-tuning job to cancel. 
        fine_tuning_job_id: String,
    },
    /// Get status updates for a fine-tuning job. 
    ListFineTuningEvents {
        /// The ID of the fine-tuning job to get events for. 
        fine_tuning_job_id: String,
        /// Identifier for the last event from the previous pagination request.
        after: Option<String>,
        /// Number of events to retrieve.
        limit: Option<i32>,
    },
    /// List checkpoints for a fine-tuning job. 
    ListFineTuningJobCheckpoints {
        /// The ID of the fine-tuning job to get checkpoints for. 
        fine_tuning_job_id: String,
        /// Identifier for the last checkpoint ID from the previous pagination request.
        after: Option<String>,
        /// Number of checkpoints to retrieve.
        limit: Option<i32>,
    },
    /// Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    RetrieveFineTuningJob {
        /// The ID of the fine-tuning job. 
        fine_tuning_job_id: String,
    },
    /// Creates an image given a prompt.
    CreateImage {
        #[clap(value_parser = parse_json::<models::CreateImageRequest>)]
        create_image_request: models::CreateImageRequest,
    },
    /// Creates an edited or extended image given an original image and a prompt.
    CreateImageEdit {
        /// The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
        #[clap(value_parser = parse_json::<swagger::ByteArray>)]
        image: swagger::ByteArray,
        /// A text description of the desired image(s). The maximum length is 1000 characters.
        prompt: String,
        /// An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.
        #[clap(value_parser = parse_json::<swagger::ByteArray>)]
        mask: Option<swagger::ByteArray>,
        #[clap(value_parser = parse_json::<swagger::Nullable<models::CreateImageEditRequestModel>>)]
        model: Option<swagger::Nullable<models::CreateImageEditRequestModel>>,
        /// The number of images to generate. Must be between 1 and 10.
        n: Option<swagger::Nullable<i32>>,
        #[clap(value_parser = parse_json::<swagger::Nullable<models::CreateImageEditRequestSize>>)]
        size: Option<swagger::Nullable<models::CreateImageEditRequestSize>>,
        #[clap(value_parser = parse_json::<swagger::Nullable<models::CreateImageEditRequestResponseFormat>>)]
        response_format: Option<swagger::Nullable<models::CreateImageEditRequestResponseFormat>>,
        /// A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
        user: Option<String>,
    },
    /// Creates a variation of a given image.
    CreateImageVariation {
        /// The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
        #[clap(value_parser = parse_json::<swagger::ByteArray>)]
        image: swagger::ByteArray,
        #[clap(value_parser = parse_json::<swagger::Nullable<models::CreateImageEditRequestModel>>)]
        model: Option<swagger::Nullable<models::CreateImageEditRequestModel>>,
        /// The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
        n: Option<swagger::Nullable<i32>>,
        #[clap(value_parser = parse_json::<swagger::Nullable<models::CreateImageEditRequestResponseFormat>>)]
        response_format: Option<swagger::Nullable<models::CreateImageEditRequestResponseFormat>>,
        #[clap(value_parser = parse_json::<swagger::Nullable<models::CreateImageEditRequestSize>>)]
        size: Option<swagger::Nullable<models::CreateImageEditRequestSize>>,
        /// A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
        user: Option<String>,
    },
    /// Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
    InviteUser {
        /// The invite request payload.
        #[clap(value_parser = parse_json::<models::InviteRequest>)]
        invite_request: models::InviteRequest,
    },
    /// Returns a list of invites in the organization.
    ListInvites {
        /// A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
        limit: Option<i32>,
        /// A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
        after: Option<String>,
    },
    /// Delete an invite. If the invite has already been accepted, it cannot be deleted.
    DeleteInvite {
        /// The ID of the invite to delete.
        invite_id: String,
    },
    /// Retrieves an invite.
    RetrieveInvite {
        /// The ID of the invite to retrieve.
        invite_id: String,
    },
    /// Lists the currently available models, and provides basic information about each one such as the owner and availability.
    ListModels {
    },
    /// Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
    DeleteModel {
        /// The model to delete
        model: String,
    },
    /// Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
    RetrieveModel {
        /// The ID of the model to use for this request
        model: String,
    },
    /// Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 
    CreateModeration {
        #[clap(value_parser = parse_json::<models::CreateModerationRequest>)]
        create_moderation_request: models::CreateModerationRequest,
    },
    /// Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
    CreateProject {
        /// The project create request payload.
        #[clap(value_parser = parse_json::<models::ProjectCreateRequest>)]
        project_create_request: models::ProjectCreateRequest,
    },
    /// Returns a list of projects.
    ListProjects {
        /// A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
        limit: Option<i32>,
        /// A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
        after: Option<String>,
        /// If `true` returns all projects including those that have been `archived`. Archived projects are not included by default.
        #[clap(short, long)]
        include_archived: Option<bool>,
    },
    /// Archives a project in the organization. Archived projects cannot be used or updated.
    ArchiveProject {
        /// The ID of the project.
        project_id: String,
    },
    /// Creates a new service account in the project. This also returns an unredacted API key for the service account.
    CreateProjectServiceAccount {
        /// The ID of the project.
        project_id: String,
        /// The project service account create request payload.
        #[clap(value_parser = parse_json::<models::ProjectServiceAccountCreateRequest>)]
        project_service_account_create_request: models::ProjectServiceAccountCreateRequest,
    },
    /// Adds a user to the project. Users must already be members of the organization to be added to a project.
    CreateProjectUser {
        /// The ID of the project.
        project_id: String,
        /// The project user create request payload.
        #[clap(value_parser = parse_json::<models::ProjectUserCreateRequest>)]
        project_user_create_request: models::ProjectUserCreateRequest,
    },
    /// Returns a list of API keys in the project.
    ListProjectApiKeys {
        /// The ID of the project.
        project_id: String,
        /// A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
        limit: Option<i32>,
        /// A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
        after: Option<String>,
    },
    /// Returns the rate limits per model for a project.
    ListProjectRateLimits {
        /// The ID of the project.
        project_id: String,
        /// A limit on the number of objects to be returned. The default is 100. 
        limit: Option<i32>,
        /// A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
        after: Option<String>,
        /// A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
        before: Option<String>,
    },
    /// Returns a list of service accounts in the project.
    ListProjectServiceAccounts {
        /// The ID of the project.
        project_id: String,
        /// A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
        limit: Option<i32>,
        /// A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
        after: Option<String>,
    },
    /// Returns a list of users in the project.
    ListProjectUsers {
        /// The ID of the project.
        project_id: String,
        /// A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
        limit: Option<i32>,
        /// A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
        after: Option<String>,
    },
    /// Modifies a project in the organization.
    ModifyProject {
        /// The ID of the project.
        project_id: String,
        /// The project update request payload.
        #[clap(value_parser = parse_json::<models::ProjectUpdateRequest>)]
        project_update_request: models::ProjectUpdateRequest,
    },
    /// Retrieves a project.
    RetrieveProject {
        /// The ID of the project.
        project_id: String,
    },
    /// Deletes an API key from the project.
    DeleteProjectApiKey {
        /// The ID of the project.
        project_id: String,
        /// The ID of the API key.
        key_id: String,
    },
    /// Deletes a service account from the project.
    DeleteProjectServiceAccount {
        /// The ID of the project.
        project_id: String,
        /// The ID of the service account.
        service_account_id: String,
    },
    /// Deletes a user from the project.
    DeleteProjectUser {
        /// The ID of the project.
        project_id: String,
        /// The ID of the user.
        user_id: String,
    },
    /// Modifies a user's role in the project.
    ModifyProjectUser {
        /// The ID of the project.
        project_id: String,
        /// The ID of the user.
        user_id: String,
        /// The project user update request payload.
        #[clap(value_parser = parse_json::<models::ProjectUserUpdateRequest>)]
        project_user_update_request: models::ProjectUserUpdateRequest,
    },
    /// Retrieves an API key in the project.
    RetrieveProjectApiKey {
        /// The ID of the project.
        project_id: String,
        /// The ID of the API key.
        key_id: String,
    },
    /// Retrieves a service account in the project.
    RetrieveProjectServiceAccount {
        /// The ID of the project.
        project_id: String,
        /// The ID of the service account.
        service_account_id: String,
    },
    /// Retrieves a user in the project.
    RetrieveProjectUser {
        /// The ID of the project.
        project_id: String,
        /// The ID of the user.
        user_id: String,
    },
    /// Updates a project rate limit.
    UpdateProjectRateLimits {
        /// The ID of the project.
        project_id: String,
        /// The ID of the rate limit.
        rate_limit_id: String,
        /// The project rate limit update request payload.
        #[clap(value_parser = parse_json::<models::ProjectRateLimitUpdateRequest>)]
        project_rate_limit_update_request: models::ProjectRateLimitUpdateRequest,
    },
    /// Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
    CreateRealtimeSession {
        /// Create an ephemeral API key with the given session configuration.
        #[clap(value_parser = parse_json::<models::RealtimeSessionCreateRequest>)]
        realtime_session_create_request: models::RealtimeSessionCreateRequest,
    },
    /// Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 
    CreateUpload {
        #[clap(value_parser = parse_json::<models::CreateUploadRequest>)]
        create_upload_request: models::CreateUploadRequest,
    },
    /// Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
    AddUploadPart {
        /// The ID of the Upload. 
        upload_id: String,
        /// The chunk of bytes for this Part. 
        #[clap(value_parser = parse_json::<swagger::ByteArray>)]
        data: swagger::ByteArray,
    },
    /// Cancels the Upload. No Parts may be added after an Upload is cancelled. 
    CancelUpload {
        /// The ID of the Upload. 
        upload_id: String,
    },
    /// Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
    CompleteUpload {
        /// The ID of the Upload. 
        upload_id: String,
        #[clap(value_parser = parse_json::<models::CompleteUploadRequest>)]
        complete_upload_request: models::CompleteUploadRequest,
    },
    /// Get audio speeches usage details for the organization.
    UsageAudioSpeeches {
        /// Start time (Unix seconds) of the query time range, inclusive.
        start_time: i32,
        /// End time (Unix seconds) of the query time range, exclusive.
        end_time: Option<i32>,
        /// Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
        #[clap(value_parser = parse_json::<models::UsageAudioSpeechesBucketWidthParameter>)]
        bucket_width: Option<models::UsageAudioSpeechesBucketWidthParameter>,
        /// Return only usage for these projects.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        project_ids: Option<Vec<String>>,
        /// Return only usage for these users.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        user_ids: Option<Vec<String>>,
        /// Return only usage for these API keys.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        api_key_ids: Option<Vec<String>>,
        /// Return only usage for these models.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        models: Option<Vec<String>>,
        /// Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
        #[clap(value_parser = parse_json::<Vec<models::UsageAudioSpeechesGroupByParameterInner>>, long)]
        group_by: Option<Vec<models::UsageAudioSpeechesGroupByParameterInner>>,
        /// Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
        limit: Option<i32>,
        /// A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
        page: Option<String>,
    },
    /// Get audio transcriptions usage details for the organization.
    UsageAudioTranscriptions {
        /// Start time (Unix seconds) of the query time range, inclusive.
        start_time: i32,
        /// End time (Unix seconds) of the query time range, exclusive.
        end_time: Option<i32>,
        /// Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
        #[clap(value_parser = parse_json::<models::UsageAudioSpeechesBucketWidthParameter>)]
        bucket_width: Option<models::UsageAudioSpeechesBucketWidthParameter>,
        /// Return only usage for these projects.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        project_ids: Option<Vec<String>>,
        /// Return only usage for these users.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        user_ids: Option<Vec<String>>,
        /// Return only usage for these API keys.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        api_key_ids: Option<Vec<String>>,
        /// Return only usage for these models.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        models: Option<Vec<String>>,
        /// Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
        #[clap(value_parser = parse_json::<Vec<models::UsageAudioSpeechesGroupByParameterInner>>, long)]
        group_by: Option<Vec<models::UsageAudioSpeechesGroupByParameterInner>>,
        /// Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
        limit: Option<i32>,
        /// A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
        page: Option<String>,
    },
    /// Get code interpreter sessions usage details for the organization.
    UsageCodeInterpreterSessions {
        /// Start time (Unix seconds) of the query time range, inclusive.
        start_time: i32,
        /// End time (Unix seconds) of the query time range, exclusive.
        end_time: Option<i32>,
        /// Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
        #[clap(value_parser = parse_json::<models::UsageAudioSpeechesBucketWidthParameter>)]
        bucket_width: Option<models::UsageAudioSpeechesBucketWidthParameter>,
        /// Return only usage for these projects.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        project_ids: Option<Vec<String>>,
        /// Group the usage data by the specified fields. Support fields include `project_id`.
        #[clap(value_parser = parse_json::<Vec<models::UsageCodeInterpreterSessionsGroupByParameterInner>>, long)]
        group_by: Option<Vec<models::UsageCodeInterpreterSessionsGroupByParameterInner>>,
        /// Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
        limit: Option<i32>,
        /// A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
        page: Option<String>,
    },
    /// Get completions usage details for the organization.
    UsageCompletions {
        /// Start time (Unix seconds) of the query time range, inclusive.
        start_time: i32,
        /// End time (Unix seconds) of the query time range, exclusive.
        end_time: Option<i32>,
        /// Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
        #[clap(value_parser = parse_json::<models::UsageAudioSpeechesBucketWidthParameter>)]
        bucket_width: Option<models::UsageAudioSpeechesBucketWidthParameter>,
        /// Return only usage for these projects.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        project_ids: Option<Vec<String>>,
        /// Return only usage for these users.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        user_ids: Option<Vec<String>>,
        /// Return only usage for these API keys.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        api_key_ids: Option<Vec<String>>,
        /// Return only usage for these models.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        models: Option<Vec<String>>,
        /// If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both. 
        #[clap(short, long)]
        batch: Option<bool>,
        /// Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them.
        #[clap(value_parser = parse_json::<Vec<models::UsageCompletionsGroupByParameterInner>>, long)]
        group_by: Option<Vec<models::UsageCompletionsGroupByParameterInner>>,
        /// Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
        limit: Option<i32>,
        /// A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
        page: Option<String>,
    },
    /// Get costs details for the organization.
    UsageCosts {
        /// Start time (Unix seconds) of the query time range, inclusive.
        start_time: i32,
        /// End time (Unix seconds) of the query time range, exclusive.
        end_time: Option<i32>,
        /// Width of each time bucket in response. Currently only `1d` is supported, default to `1d`.
        #[clap(value_parser = parse_json::<models::UsageCostsBucketWidthParameter>)]
        bucket_width: Option<models::UsageCostsBucketWidthParameter>,
        /// Return only costs for these projects.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        project_ids: Option<Vec<String>>,
        /// Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them.
        #[clap(value_parser = parse_json::<Vec<models::UsageCostsGroupByParameterInner>>, long)]
        group_by: Option<Vec<models::UsageCostsGroupByParameterInner>>,
        /// A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. 
        limit: Option<i32>,
        /// A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
        page: Option<String>,
    },
    /// Get embeddings usage details for the organization.
    UsageEmbeddings {
        /// Start time (Unix seconds) of the query time range, inclusive.
        start_time: i32,
        /// End time (Unix seconds) of the query time range, exclusive.
        end_time: Option<i32>,
        /// Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
        #[clap(value_parser = parse_json::<models::UsageAudioSpeechesBucketWidthParameter>)]
        bucket_width: Option<models::UsageAudioSpeechesBucketWidthParameter>,
        /// Return only usage for these projects.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        project_ids: Option<Vec<String>>,
        /// Return only usage for these users.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        user_ids: Option<Vec<String>>,
        /// Return only usage for these API keys.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        api_key_ids: Option<Vec<String>>,
        /// Return only usage for these models.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        models: Option<Vec<String>>,
        /// Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
        #[clap(value_parser = parse_json::<Vec<models::UsageAudioSpeechesGroupByParameterInner>>, long)]
        group_by: Option<Vec<models::UsageAudioSpeechesGroupByParameterInner>>,
        /// Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
        limit: Option<i32>,
        /// A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
        page: Option<String>,
    },
    /// Get images usage details for the organization.
    UsageImages {
        /// Start time (Unix seconds) of the query time range, inclusive.
        start_time: i32,
        /// End time (Unix seconds) of the query time range, exclusive.
        end_time: Option<i32>,
        /// Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
        #[clap(value_parser = parse_json::<models::UsageAudioSpeechesBucketWidthParameter>)]
        bucket_width: Option<models::UsageAudioSpeechesBucketWidthParameter>,
        /// Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them.
        #[clap(value_parser = parse_json::<Vec<models::UsageImagesSourcesParameterInner>>, long)]
        sources: Option<Vec<models::UsageImagesSourcesParameterInner>>,
        /// Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them.
        #[clap(value_parser = parse_json::<Vec<models::UsageImagesSizesParameterInner>>, long)]
        sizes: Option<Vec<models::UsageImagesSizesParameterInner>>,
        /// Return only usage for these projects.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        project_ids: Option<Vec<String>>,
        /// Return only usage for these users.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        user_ids: Option<Vec<String>>,
        /// Return only usage for these API keys.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        api_key_ids: Option<Vec<String>>,
        /// Return only usage for these models.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        models: Option<Vec<String>>,
        /// Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them.
        #[clap(value_parser = parse_json::<Vec<models::UsageImagesGroupByParameterInner>>, long)]
        group_by: Option<Vec<models::UsageImagesGroupByParameterInner>>,
        /// Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
        limit: Option<i32>,
        /// A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
        page: Option<String>,
    },
    /// Get moderations usage details for the organization.
    UsageModerations {
        /// Start time (Unix seconds) of the query time range, inclusive.
        start_time: i32,
        /// End time (Unix seconds) of the query time range, exclusive.
        end_time: Option<i32>,
        /// Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
        #[clap(value_parser = parse_json::<models::UsageAudioSpeechesBucketWidthParameter>)]
        bucket_width: Option<models::UsageAudioSpeechesBucketWidthParameter>,
        /// Return only usage for these projects.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        project_ids: Option<Vec<String>>,
        /// Return only usage for these users.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        user_ids: Option<Vec<String>>,
        /// Return only usage for these API keys.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        api_key_ids: Option<Vec<String>>,
        /// Return only usage for these models.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        models: Option<Vec<String>>,
        /// Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
        #[clap(value_parser = parse_json::<Vec<models::UsageAudioSpeechesGroupByParameterInner>>, long)]
        group_by: Option<Vec<models::UsageAudioSpeechesGroupByParameterInner>>,
        /// Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
        limit: Option<i32>,
        /// A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
        page: Option<String>,
    },
    /// Get vector stores usage details for the organization.
    UsageVectorStores {
        /// Start time (Unix seconds) of the query time range, inclusive.
        start_time: i32,
        /// End time (Unix seconds) of the query time range, exclusive.
        end_time: Option<i32>,
        /// Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
        #[clap(value_parser = parse_json::<models::UsageAudioSpeechesBucketWidthParameter>)]
        bucket_width: Option<models::UsageAudioSpeechesBucketWidthParameter>,
        /// Return only usage for these projects.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        project_ids: Option<Vec<String>>,
        /// Group the usage data by the specified fields. Support fields include `project_id`.
        #[clap(value_parser = parse_json::<Vec<models::UsageCodeInterpreterSessionsGroupByParameterInner>>, long)]
        group_by: Option<Vec<models::UsageCodeInterpreterSessionsGroupByParameterInner>>,
        /// Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
        limit: Option<i32>,
        /// A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
        page: Option<String>,
    },
    /// Lists all of the users in the organization.
    ListUsers {
        /// A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
        limit: Option<i32>,
        /// A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
        after: Option<String>,
    },
    /// Deletes a user from the organization.
    DeleteUser {
        /// The ID of the user.
        user_id: String,
    },
    /// Modifies a user's role in the organization.
    ModifyUser {
        /// The ID of the user.
        user_id: String,
        /// The new user role to modify. This must be one of `owner` or `member`.
        #[clap(value_parser = parse_json::<models::UserRoleUpdateRequest>)]
        user_role_update_request: models::UserRoleUpdateRequest,
    },
    /// Retrieves a user by their identifier.
    RetrieveUser {
        /// The ID of the user.
        user_id: String,
    },
    /// Create a vector store.
    CreateVectorStore {
        #[clap(value_parser = parse_json::<models::CreateVectorStoreRequest>)]
        create_vector_store_request: models::CreateVectorStoreRequest,
    },
    /// Returns a list of vector stores.
    ListVectorStores {
        /// A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
        limit: Option<i32>,
        /// Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
        #[clap(value_parser = parse_json::<models::ListAssistantsOrderParameter>)]
        order: Option<models::ListAssistantsOrderParameter>,
        /// A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
        after: Option<String>,
        /// A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
        before: Option<String>,
    },
    /// Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
    CreateVectorStoreFile {
        /// The ID of the vector store for which to create a File. 
        vector_store_id: String,
        #[clap(value_parser = parse_json::<models::CreateVectorStoreFileRequest>)]
        create_vector_store_file_request: models::CreateVectorStoreFileRequest,
    },
    /// Create a vector store file batch.
    CreateVectorStoreFileBatch {
        /// The ID of the vector store for which to create a File Batch. 
        vector_store_id: String,
        #[clap(value_parser = parse_json::<models::CreateVectorStoreFileBatchRequest>)]
        create_vector_store_file_batch_request: models::CreateVectorStoreFileBatchRequest,
    },
    /// Delete a vector store.
    DeleteVectorStore {
        /// The ID of the vector store to delete.
        vector_store_id: String,
    },
    /// Retrieves a vector store.
    GetVectorStore {
        /// The ID of the vector store to retrieve.
        vector_store_id: String,
    },
    /// Returns a list of vector store files.
    ListVectorStoreFiles {
        /// The ID of the vector store that the files belong to.
        vector_store_id: String,
        /// A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
        limit: Option<i32>,
        /// Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
        #[clap(value_parser = parse_json::<models::ListAssistantsOrderParameter>)]
        order: Option<models::ListAssistantsOrderParameter>,
        /// A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
        after: Option<String>,
        /// A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
        before: Option<String>,
        /// Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.
        #[clap(value_parser = parse_json::<models::ListFilesInVectorStoreBatchFilterParameter>)]
        filter: Option<models::ListFilesInVectorStoreBatchFilterParameter>,
    },
    /// Modifies a vector store.
    ModifyVectorStore {
        /// The ID of the vector store to modify.
        vector_store_id: String,
        #[clap(value_parser = parse_json::<models::UpdateVectorStoreRequest>)]
        update_vector_store_request: models::UpdateVectorStoreRequest,
    },
    /// Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
    CancelVectorStoreFileBatch {
        /// The ID of the vector store that the file batch belongs to.
        vector_store_id: String,
        /// The ID of the file batch to cancel.
        batch_id: String,
    },
    /// Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
    DeleteVectorStoreFile {
        /// The ID of the vector store that the file belongs to.
        vector_store_id: String,
        /// The ID of the file to delete.
        file_id: String,
    },
    /// Retrieves a vector store file.
    GetVectorStoreFile {
        /// The ID of the vector store that the file belongs to.
        vector_store_id: String,
        /// The ID of the file being retrieved.
        file_id: String,
    },
    /// Retrieves a vector store file batch.
    GetVectorStoreFileBatch {
        /// The ID of the vector store that the file batch belongs to.
        vector_store_id: String,
        /// The ID of the file batch being retrieved.
        batch_id: String,
    },
    /// Returns a list of vector store files in a batch.
    ListFilesInVectorStoreBatch {
        /// The ID of the vector store that the files belong to.
        vector_store_id: String,
        /// The ID of the file batch that the files belong to.
        batch_id: String,
        /// A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
        limit: Option<i32>,
        /// Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
        #[clap(value_parser = parse_json::<models::ListAssistantsOrderParameter>)]
        order: Option<models::ListAssistantsOrderParameter>,
        /// A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
        after: Option<String>,
        /// A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
        before: Option<String>,
        /// Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.
        #[clap(value_parser = parse_json::<models::ListFilesInVectorStoreBatchFilterParameter>)]
        filter: Option<models::ListFilesInVectorStoreBatchFilterParameter>,
    },
}

#[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
fn create_client(args: &Cli, context: ClientContext) -> Result<Box<dyn ApiNoContext<ClientContext>>> {
    if args.client_certificate.is_some() {
        debug!("Using mutual TLS");
        let client = Client::try_new_https_mutual(
            &args.server_address,
            args.server_certificate.clone().unwrap(),
            args.client_key.clone().unwrap(),
            args.client_certificate.clone().unwrap(),
        )
        .context("Failed to create HTTPS client")?;
        Ok(Box::new(client.with_context(context)))
    } else if args.server_certificate.is_some() {
        debug!("Using TLS with pinned server certificate");
        let client =
            Client::try_new_https_pinned(&args.server_address, args.server_certificate.clone().unwrap())
                .context("Failed to create HTTPS client")?;
        Ok(Box::new(client.with_context(context)))
    } else {
        debug!("Using client without certificates");
        let client =
            Client::try_new(&args.server_address).context("Failed to create HTTP(S) client")?;
        Ok(Box::new(client.with_context(context)))
    }
}

#[cfg(any(target_os = "macos", target_os = "windows", target_os = "ios"))]
fn create_client(args: &Cli, context: ClientContext) -> Result<Box<dyn ApiNoContext<ClientContext>>> {
    let client =
        Client::try_new(&args.server_address).context("Failed to create HTTP(S) client")?;
    Ok(Box::new(client.with_context(context)))
}

#[tokio::main]
async fn main() -> Result<()> {
    let args = Cli::parse();
    if let Some(log_level) = args.verbosity.log_level() {
        SimpleLogger::new().with_level(log_level.to_level_filter()).init()?;
    }

    debug!("Arguments: {:?}", &args);

    let mut auth_data: Option<AuthData> = None;

    if let Some(ref bearer_token) = args.bearer_token {
        debug!("Using bearer token");
        auth_data = AuthData::bearer(bearer_token);
    }

    #[allow(trivial_casts)]
    let context = swagger::make_context!(
        ContextBuilder,
        EmptyContext,
        auth_data,
        XSpanIdString::default()
    );

    let client = create_client(&args, context)?;

    let result = match args.operation {
        Operation::CreateAssistant {
            create_assistant_request,
        } => {
            info!("Performing a CreateAssistant request");

            let result = client.create_assistant(
                create_assistant_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CreateAssistantResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CreateThread {
            create_thread_request,
        } => {
            info!("Performing a CreateThread request");

            let result = client.create_thread(
                create_thread_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CreateThreadResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CreateThreadAndRun {
            create_thread_and_run_request,
        } => {
            info!("Performing a CreateThreadAndRun request");

            let result = client.create_thread_and_run(
                create_thread_and_run_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CreateThreadAndRunResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ListAssistants {
            limit,
            order,
            after,
            before,
        } => {
            info!("Performing a ListAssistants request");

            let result = client.list_assistants(
                limit,
                order,
                after,
                before,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ListAssistantsResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CreateMessage {
            thread_id,
            create_message_request,
        } => {
            info!("Performing a CreateMessage request on {:?}", (
                &thread_id
            ));

            let result = client.create_message(
                thread_id,
                create_message_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CreateMessageResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CreateRun {
            thread_id,
            create_run_request,
            include_left_square_bracket_right_square_bracket,
        } => {
            info!("Performing a CreateRun request on {:?}", (
                &thread_id
            ));

            let result = client.create_run(
                thread_id,
                create_run_request,
                include_left_square_bracket_right_square_bracket.as_ref(),
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CreateRunResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::DeleteAssistant {
            assistant_id,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a DeleteAssistant request on {:?}", (
                &assistant_id
            ));

            let result = client.delete_assistant(
                assistant_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                DeleteAssistantResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::DeleteThread {
            thread_id,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a DeleteThread request on {:?}", (
                &thread_id
            ));

            let result = client.delete_thread(
                thread_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                DeleteThreadResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GetAssistant {
            assistant_id,
        } => {
            info!("Performing a GetAssistant request on {:?}", (
                &assistant_id
            ));

            let result = client.get_assistant(
                assistant_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetAssistantResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GetThread {
            thread_id,
        } => {
            info!("Performing a GetThread request on {:?}", (
                &thread_id
            ));

            let result = client.get_thread(
                thread_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetThreadResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ListMessages {
            thread_id,
            limit,
            order,
            after,
            before,
            run_id,
        } => {
            info!("Performing a ListMessages request on {:?}", (
                &thread_id
            ));

            let result = client.list_messages(
                thread_id,
                limit,
                order,
                after,
                before,
                run_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ListMessagesResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ListRuns {
            thread_id,
            limit,
            order,
            after,
            before,
        } => {
            info!("Performing a ListRuns request on {:?}", (
                &thread_id
            ));

            let result = client.list_runs(
                thread_id,
                limit,
                order,
                after,
                before,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ListRunsResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ModifyAssistant {
            assistant_id,
            modify_assistant_request,
        } => {
            info!("Performing a ModifyAssistant request on {:?}", (
                &assistant_id
            ));

            let result = client.modify_assistant(
                assistant_id,
                modify_assistant_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ModifyAssistantResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ModifyThread {
            thread_id,
            modify_thread_request,
        } => {
            info!("Performing a ModifyThread request on {:?}", (
                &thread_id
            ));

            let result = client.modify_thread(
                thread_id,
                modify_thread_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ModifyThreadResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CancelRun {
            thread_id,
            run_id,
        } => {
            info!("Performing a CancelRun request on {:?}", (
                &thread_id,
                &run_id
            ));

            let result = client.cancel_run(
                thread_id,
                run_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CancelRunResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::DeleteMessage {
            thread_id,
            message_id,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a DeleteMessage request on {:?}", (
                &thread_id,
                &message_id
            ));

            let result = client.delete_message(
                thread_id,
                message_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                DeleteMessageResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GetMessage {
            thread_id,
            message_id,
        } => {
            info!("Performing a GetMessage request on {:?}", (
                &thread_id,
                &message_id
            ));

            let result = client.get_message(
                thread_id,
                message_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetMessageResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GetRun {
            thread_id,
            run_id,
        } => {
            info!("Performing a GetRun request on {:?}", (
                &thread_id,
                &run_id
            ));

            let result = client.get_run(
                thread_id,
                run_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetRunResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ListRunSteps {
            thread_id,
            run_id,
            limit,
            order,
            after,
            before,
            include_left_square_bracket_right_square_bracket,
        } => {
            info!("Performing a ListRunSteps request on {:?}", (
                &thread_id,
                &run_id
            ));

            let result = client.list_run_steps(
                thread_id,
                run_id,
                limit,
                order,
                after,
                before,
                include_left_square_bracket_right_square_bracket.as_ref(),
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ListRunStepsResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ModifyMessage {
            thread_id,
            message_id,
            modify_message_request,
        } => {
            info!("Performing a ModifyMessage request on {:?}", (
                &thread_id,
                &message_id
            ));

            let result = client.modify_message(
                thread_id,
                message_id,
                modify_message_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ModifyMessageResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ModifyRun {
            thread_id,
            run_id,
            modify_run_request,
        } => {
            info!("Performing a ModifyRun request on {:?}", (
                &thread_id,
                &run_id
            ));

            let result = client.modify_run(
                thread_id,
                run_id,
                modify_run_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ModifyRunResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::SubmitToolOuputsToRun {
            thread_id,
            run_id,
            submit_tool_outputs_run_request,
        } => {
            info!("Performing a SubmitToolOuputsToRun request on {:?}", (
                &thread_id,
                &run_id
            ));

            let result = client.submit_tool_ouputs_to_run(
                thread_id,
                run_id,
                submit_tool_outputs_run_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                SubmitToolOuputsToRunResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GetRunStep {
            thread_id,
            run_id,
            step_id,
            include_left_square_bracket_right_square_bracket,
        } => {
            info!("Performing a GetRunStep request on {:?}", (
                &thread_id,
                &run_id,
                &step_id
            ));

            let result = client.get_run_step(
                thread_id,
                run_id,
                step_id,
                include_left_square_bracket_right_square_bracket.as_ref(),
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetRunStepResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CreateSpeech {
            create_speech_request,
        } => {
            info!("Performing a CreateSpeech request");

            let result = client.create_speech(
                create_speech_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CreateSpeechResponse::OK
                {
                    body,
                    transfer_encoding,
                }
                => "OK\n".to_string()
                   +
                    &format!("body: {}\n", serde_json::to_string_pretty(&body)?) +
                    &format!(
                        "transfer_encoding: {}\n",
                        serde_json::to_string_pretty(&transfer_encoding)?
                    ),
            }
        }
        Operation::CreateTranscription {
            file,
            model,
            language,
            prompt,
            response_format,
            temperature,
            timestamp_granularities_left_square_bracket_right_square_bracket,
        } => {
            info!("Performing a CreateTranscription request");

            let result = client.create_transcription(
                file,
                model,
                language,
                prompt,
                response_format,
                temperature,
                timestamp_granularities_left_square_bracket_right_square_bracket.as_ref(),
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CreateTranscriptionResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CreateTranslation {
            file,
            model,
            prompt,
            response_format,
            temperature,
        } => {
            info!("Performing a CreateTranslation request");

            let result = client.create_translation(
                file,
                model,
                prompt,
                response_format,
                temperature,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CreateTranslationResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ListAuditLogs {
            effective_at,
            project_ids_left_square_bracket_right_square_bracket,
            event_types_left_square_bracket_right_square_bracket,
            actor_ids_left_square_bracket_right_square_bracket,
            actor_emails_left_square_bracket_right_square_bracket,
            resource_ids_left_square_bracket_right_square_bracket,
            limit,
            after,
            before,
        } => {
            info!("Performing a ListAuditLogs request");

            let result = client.list_audit_logs(
                effective_at,
                project_ids_left_square_bracket_right_square_bracket.as_ref(),
                event_types_left_square_bracket_right_square_bracket.as_ref(),
                actor_ids_left_square_bracket_right_square_bracket.as_ref(),
                actor_emails_left_square_bracket_right_square_bracket.as_ref(),
                resource_ids_left_square_bracket_right_square_bracket.as_ref(),
                limit,
                after,
                before,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ListAuditLogsResponse::AuditLogsListedSuccessfully
                (body)
                => "AuditLogsListedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CreateBatch {
            create_batch_request,
        } => {
            info!("Performing a CreateBatch request");

            let result = client.create_batch(
                create_batch_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CreateBatchResponse::BatchCreatedSuccessfully
                (body)
                => "BatchCreatedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ListBatches {
            after,
            limit,
        } => {
            info!("Performing a ListBatches request");

            let result = client.list_batches(
                after,
                limit,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ListBatchesResponse::BatchListedSuccessfully
                (body)
                => "BatchListedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CancelBatch {
            batch_id,
        } => {
            info!("Performing a CancelBatch request on {:?}", (
                &batch_id
            ));

            let result = client.cancel_batch(
                batch_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CancelBatchResponse::BatchIsCancelling
                (body)
                => "BatchIsCancelling\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::RetrieveBatch {
            batch_id,
        } => {
            info!("Performing a RetrieveBatch request on {:?}", (
                &batch_id
            ));

            let result = client.retrieve_batch(
                batch_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                RetrieveBatchResponse::BatchRetrievedSuccessfully
                (body)
                => "BatchRetrievedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CreateChatCompletion {
            create_chat_completion_request,
        } => {
            info!("Performing a CreateChatCompletion request");

            let result = client.create_chat_completion(
                create_chat_completion_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CreateChatCompletionResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CreateCompletion {
            create_completion_request,
        } => {
            info!("Performing a CreateCompletion request");

            let result = client.create_completion(
                create_completion_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CreateCompletionResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdminApiKeysCreate {
            admin_api_keys_create_request,
        } => {
            info!("Performing a AdminApiKeysCreate request");

            let result = client.admin_api_keys_create(
                admin_api_keys_create_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdminApiKeysCreateResponse::TheNewlyCreatedAdminAPIKey
                (body)
                => "TheNewlyCreatedAdminAPIKey\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdminApiKeysList {
            after,
            order,
            limit,
        } => {
            info!("Performing a AdminApiKeysList request");

            let result = client.admin_api_keys_list(
                after,
                order,
                limit,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdminApiKeysListResponse::AListOfOrganizationAPIKeys
                (body)
                => "AListOfOrganizationAPIKeys\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdminApiKeysDelete {
            key_id,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a AdminApiKeysDelete request on {:?}", (
                &key_id
            ));

            let result = client.admin_api_keys_delete(
                key_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdminApiKeysDeleteResponse::ConfirmationThatTheAPIKeyWasDeleted
                (body)
                => "ConfirmationThatTheAPIKeyWasDeleted\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdminApiKeysGet {
            key_id,
        } => {
            info!("Performing a AdminApiKeysGet request on {:?}", (
                &key_id
            ));

            let result = client.admin_api_keys_get(
                key_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdminApiKeysGetResponse::DetailsOfTheRequestedAPIKey
                (body)
                => "DetailsOfTheRequestedAPIKey\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CreateEmbedding {
            create_embedding_request,
        } => {
            info!("Performing a CreateEmbedding request");

            let result = client.create_embedding(
                create_embedding_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CreateEmbeddingResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CreateFile {
            file,
            purpose,
        } => {
            info!("Performing a CreateFile request");

            let result = client.create_file(
                file,
                purpose,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CreateFileResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ListFiles {
            purpose,
            limit,
            order,
            after,
        } => {
            info!("Performing a ListFiles request");

            let result = client.list_files(
                purpose,
                limit,
                order,
                after,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ListFilesResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::DeleteFile {
            file_id,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a DeleteFile request on {:?}", (
                &file_id
            ));

            let result = client.delete_file(
                file_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                DeleteFileResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::DownloadFile {
            file_id,
        } => {
            info!("Performing a DownloadFile request on {:?}", (
                &file_id
            ));

            let result = client.download_file(
                file_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                DownloadFileResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::RetrieveFile {
            file_id,
        } => {
            info!("Performing a RetrieveFile request on {:?}", (
                &file_id
            ));

            let result = client.retrieve_file(
                file_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                RetrieveFileResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CreateFineTuningJob {
            create_fine_tuning_job_request,
        } => {
            info!("Performing a CreateFineTuningJob request");

            let result = client.create_fine_tuning_job(
                create_fine_tuning_job_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CreateFineTuningJobResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ListPaginatedFineTuningJobs {
            after,
            limit,
        } => {
            info!("Performing a ListPaginatedFineTuningJobs request");

            let result = client.list_paginated_fine_tuning_jobs(
                after,
                limit,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ListPaginatedFineTuningJobsResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CancelFineTuningJob {
            fine_tuning_job_id,
        } => {
            info!("Performing a CancelFineTuningJob request on {:?}", (
                &fine_tuning_job_id
            ));

            let result = client.cancel_fine_tuning_job(
                fine_tuning_job_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CancelFineTuningJobResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ListFineTuningEvents {
            fine_tuning_job_id,
            after,
            limit,
        } => {
            info!("Performing a ListFineTuningEvents request on {:?}", (
                &fine_tuning_job_id
            ));

            let result = client.list_fine_tuning_events(
                fine_tuning_job_id,
                after,
                limit,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ListFineTuningEventsResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ListFineTuningJobCheckpoints {
            fine_tuning_job_id,
            after,
            limit,
        } => {
            info!("Performing a ListFineTuningJobCheckpoints request on {:?}", (
                &fine_tuning_job_id
            ));

            let result = client.list_fine_tuning_job_checkpoints(
                fine_tuning_job_id,
                after,
                limit,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ListFineTuningJobCheckpointsResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::RetrieveFineTuningJob {
            fine_tuning_job_id,
        } => {
            info!("Performing a RetrieveFineTuningJob request on {:?}", (
                &fine_tuning_job_id
            ));

            let result = client.retrieve_fine_tuning_job(
                fine_tuning_job_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                RetrieveFineTuningJobResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CreateImage {
            create_image_request,
        } => {
            info!("Performing a CreateImage request");

            let result = client.create_image(
                create_image_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CreateImageResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CreateImageEdit {
            image,
            prompt,
            mask,
            model,
            n,
            size,
            response_format,
            user,
        } => {
            info!("Performing a CreateImageEdit request");

            let result = client.create_image_edit(
                image,
                prompt,
                mask,
                model,
                n,
                size,
                response_format,
                user,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CreateImageEditResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CreateImageVariation {
            image,
            model,
            n,
            response_format,
            size,
            user,
        } => {
            info!("Performing a CreateImageVariation request");

            let result = client.create_image_variation(
                image,
                model,
                n,
                response_format,
                size,
                user,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CreateImageVariationResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::InviteUser {
            invite_request,
        } => {
            info!("Performing a InviteUser request");

            let result = client.invite_user(
                invite_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                InviteUserResponse::UserInvitedSuccessfully
                (body)
                => "UserInvitedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ListInvites {
            limit,
            after,
        } => {
            info!("Performing a ListInvites request");

            let result = client.list_invites(
                limit,
                after,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ListInvitesResponse::InvitesListedSuccessfully
                (body)
                => "InvitesListedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::DeleteInvite {
            invite_id,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a DeleteInvite request on {:?}", (
                &invite_id
            ));

            let result = client.delete_invite(
                invite_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                DeleteInviteResponse::InviteDeletedSuccessfully
                (body)
                => "InviteDeletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::RetrieveInvite {
            invite_id,
        } => {
            info!("Performing a RetrieveInvite request on {:?}", (
                &invite_id
            ));

            let result = client.retrieve_invite(
                invite_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                RetrieveInviteResponse::InviteRetrievedSuccessfully
                (body)
                => "InviteRetrievedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ListModels {
        } => {
            info!("Performing a ListModels request");

            let result = client.list_models(
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ListModelsResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::DeleteModel {
            model,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a DeleteModel request on {:?}", (
                &model
            ));

            let result = client.delete_model(
                model,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                DeleteModelResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::RetrieveModel {
            model,
        } => {
            info!("Performing a RetrieveModel request on {:?}", (
                &model
            ));

            let result = client.retrieve_model(
                model,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                RetrieveModelResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CreateModeration {
            create_moderation_request,
        } => {
            info!("Performing a CreateModeration request");

            let result = client.create_moderation(
                create_moderation_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CreateModerationResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CreateProject {
            project_create_request,
        } => {
            info!("Performing a CreateProject request");

            let result = client.create_project(
                project_create_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CreateProjectResponse::ProjectCreatedSuccessfully
                (body)
                => "ProjectCreatedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ListProjects {
            limit,
            after,
            include_archived,
        } => {
            info!("Performing a ListProjects request");

            let result = client.list_projects(
                limit,
                after,
                include_archived,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ListProjectsResponse::ProjectsListedSuccessfully
                (body)
                => "ProjectsListedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ArchiveProject {
            project_id,
        } => {
            info!("Performing a ArchiveProject request on {:?}", (
                &project_id
            ));

            let result = client.archive_project(
                project_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ArchiveProjectResponse::ProjectArchivedSuccessfully
                (body)
                => "ProjectArchivedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CreateProjectServiceAccount {
            project_id,
            project_service_account_create_request,
        } => {
            info!("Performing a CreateProjectServiceAccount request on {:?}", (
                &project_id
            ));

            let result = client.create_project_service_account(
                project_id,
                project_service_account_create_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CreateProjectServiceAccountResponse::ProjectServiceAccountCreatedSuccessfully
                (body)
                => "ProjectServiceAccountCreatedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CreateProjectServiceAccountResponse::ErrorResponseWhenProjectIsArchived
                (body)
                => "ErrorResponseWhenProjectIsArchived\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CreateProjectUser {
            project_id,
            project_user_create_request,
        } => {
            info!("Performing a CreateProjectUser request on {:?}", (
                &project_id
            ));

            let result = client.create_project_user(
                project_id,
                project_user_create_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CreateProjectUserResponse::UserAddedToProjectSuccessfully
                (body)
                => "UserAddedToProjectSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CreateProjectUserResponse::ErrorResponseForVariousConditions
                (body)
                => "ErrorResponseForVariousConditions\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ListProjectApiKeys {
            project_id,
            limit,
            after,
        } => {
            info!("Performing a ListProjectApiKeys request on {:?}", (
                &project_id
            ));

            let result = client.list_project_api_keys(
                project_id,
                limit,
                after,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ListProjectApiKeysResponse::ProjectAPIKeysListedSuccessfully
                (body)
                => "ProjectAPIKeysListedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ListProjectRateLimits {
            project_id,
            limit,
            after,
            before,
        } => {
            info!("Performing a ListProjectRateLimits request on {:?}", (
                &project_id
            ));

            let result = client.list_project_rate_limits(
                project_id,
                limit,
                after,
                before,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ListProjectRateLimitsResponse::ProjectRateLimitsListedSuccessfully
                (body)
                => "ProjectRateLimitsListedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ListProjectServiceAccounts {
            project_id,
            limit,
            after,
        } => {
            info!("Performing a ListProjectServiceAccounts request on {:?}", (
                &project_id
            ));

            let result = client.list_project_service_accounts(
                project_id,
                limit,
                after,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ListProjectServiceAccountsResponse::ProjectServiceAccountsListedSuccessfully
                (body)
                => "ProjectServiceAccountsListedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ListProjectServiceAccountsResponse::ErrorResponseWhenProjectIsArchived
                (body)
                => "ErrorResponseWhenProjectIsArchived\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ListProjectUsers {
            project_id,
            limit,
            after,
        } => {
            info!("Performing a ListProjectUsers request on {:?}", (
                &project_id
            ));

            let result = client.list_project_users(
                project_id,
                limit,
                after,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ListProjectUsersResponse::ProjectUsersListedSuccessfully
                (body)
                => "ProjectUsersListedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ListProjectUsersResponse::ErrorResponseWhenProjectIsArchived
                (body)
                => "ErrorResponseWhenProjectIsArchived\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ModifyProject {
            project_id,
            project_update_request,
        } => {
            info!("Performing a ModifyProject request on {:?}", (
                &project_id
            ));

            let result = client.modify_project(
                project_id,
                project_update_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ModifyProjectResponse::ProjectUpdatedSuccessfully
                (body)
                => "ProjectUpdatedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ModifyProjectResponse::ErrorResponseWhenUpdatingTheDefaultProject
                (body)
                => "ErrorResponseWhenUpdatingTheDefaultProject\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::RetrieveProject {
            project_id,
        } => {
            info!("Performing a RetrieveProject request on {:?}", (
                &project_id
            ));

            let result = client.retrieve_project(
                project_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                RetrieveProjectResponse::ProjectRetrievedSuccessfully
                (body)
                => "ProjectRetrievedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::DeleteProjectApiKey {
            project_id,
            key_id,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a DeleteProjectApiKey request on {:?}", (
                &project_id,
                &key_id
            ));

            let result = client.delete_project_api_key(
                project_id,
                key_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                DeleteProjectApiKeyResponse::ProjectAPIKeyDeletedSuccessfully
                (body)
                => "ProjectAPIKeyDeletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                DeleteProjectApiKeyResponse::ErrorResponseForVariousConditions
                (body)
                => "ErrorResponseForVariousConditions\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::DeleteProjectServiceAccount {
            project_id,
            service_account_id,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a DeleteProjectServiceAccount request on {:?}", (
                &project_id,
                &service_account_id
            ));

            let result = client.delete_project_service_account(
                project_id,
                service_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                DeleteProjectServiceAccountResponse::ProjectServiceAccountDeletedSuccessfully
                (body)
                => "ProjectServiceAccountDeletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::DeleteProjectUser {
            project_id,
            user_id,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a DeleteProjectUser request on {:?}", (
                &project_id,
                &user_id
            ));

            let result = client.delete_project_user(
                project_id,
                user_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                DeleteProjectUserResponse::ProjectUserDeletedSuccessfully
                (body)
                => "ProjectUserDeletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                DeleteProjectUserResponse::ErrorResponseForVariousConditions
                (body)
                => "ErrorResponseForVariousConditions\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ModifyProjectUser {
            project_id,
            user_id,
            project_user_update_request,
        } => {
            info!("Performing a ModifyProjectUser request on {:?}", (
                &project_id,
                &user_id
            ));

            let result = client.modify_project_user(
                project_id,
                user_id,
                project_user_update_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ModifyProjectUserResponse::ProjectUser
                (body)
                => "ProjectUser\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ModifyProjectUserResponse::ErrorResponseForVariousConditions
                (body)
                => "ErrorResponseForVariousConditions\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::RetrieveProjectApiKey {
            project_id,
            key_id,
        } => {
            info!("Performing a RetrieveProjectApiKey request on {:?}", (
                &project_id,
                &key_id
            ));

            let result = client.retrieve_project_api_key(
                project_id,
                key_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                RetrieveProjectApiKeyResponse::ProjectAPIKeyRetrievedSuccessfully
                (body)
                => "ProjectAPIKeyRetrievedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::RetrieveProjectServiceAccount {
            project_id,
            service_account_id,
        } => {
            info!("Performing a RetrieveProjectServiceAccount request on {:?}", (
                &project_id,
                &service_account_id
            ));

            let result = client.retrieve_project_service_account(
                project_id,
                service_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                RetrieveProjectServiceAccountResponse::ProjectServiceAccountRetrievedSuccessfully
                (body)
                => "ProjectServiceAccountRetrievedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::RetrieveProjectUser {
            project_id,
            user_id,
        } => {
            info!("Performing a RetrieveProjectUser request on {:?}", (
                &project_id,
                &user_id
            ));

            let result = client.retrieve_project_user(
                project_id,
                user_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                RetrieveProjectUserResponse::ProjectUserRetrievedSuccessfully
                (body)
                => "ProjectUserRetrievedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::UpdateProjectRateLimits {
            project_id,
            rate_limit_id,
            project_rate_limit_update_request,
        } => {
            info!("Performing a UpdateProjectRateLimits request on {:?}", (
                &project_id,
                &rate_limit_id
            ));

            let result = client.update_project_rate_limits(
                project_id,
                rate_limit_id,
                project_rate_limit_update_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                UpdateProjectRateLimitsResponse::ProjectRateLimitUpdatedSuccessfully
                (body)
                => "ProjectRateLimitUpdatedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateProjectRateLimitsResponse::ErrorResponseForVariousConditions
                (body)
                => "ErrorResponseForVariousConditions\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CreateRealtimeSession {
            realtime_session_create_request,
        } => {
            info!("Performing a CreateRealtimeSession request");

            let result = client.create_realtime_session(
                realtime_session_create_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CreateRealtimeSessionResponse::SessionCreatedSuccessfully
                (body)
                => "SessionCreatedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CreateUpload {
            create_upload_request,
        } => {
            info!("Performing a CreateUpload request");

            let result = client.create_upload(
                create_upload_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CreateUploadResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AddUploadPart {
            upload_id,
            data,
        } => {
            info!("Performing a AddUploadPart request on {:?}", (
                &upload_id
            ));

            let result = client.add_upload_part(
                upload_id,
                data,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AddUploadPartResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CancelUpload {
            upload_id,
        } => {
            info!("Performing a CancelUpload request on {:?}", (
                &upload_id
            ));

            let result = client.cancel_upload(
                upload_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CancelUploadResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CompleteUpload {
            upload_id,
            complete_upload_request,
        } => {
            info!("Performing a CompleteUpload request on {:?}", (
                &upload_id
            ));

            let result = client.complete_upload(
                upload_id,
                complete_upload_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CompleteUploadResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::UsageAudioSpeeches {
            start_time,
            end_time,
            bucket_width,
            project_ids,
            user_ids,
            api_key_ids,
            models,
            group_by,
            limit,
            page,
        } => {
            info!("Performing a UsageAudioSpeeches request");

            let result = client.usage_audio_speeches(
                start_time,
                end_time,
                bucket_width,
                project_ids.as_ref(),
                user_ids.as_ref(),
                api_key_ids.as_ref(),
                models.as_ref(),
                group_by.as_ref(),
                limit,
                page,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                UsageAudioSpeechesResponse::UsageDataRetrievedSuccessfully
                (body)
                => "UsageDataRetrievedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::UsageAudioTranscriptions {
            start_time,
            end_time,
            bucket_width,
            project_ids,
            user_ids,
            api_key_ids,
            models,
            group_by,
            limit,
            page,
        } => {
            info!("Performing a UsageAudioTranscriptions request");

            let result = client.usage_audio_transcriptions(
                start_time,
                end_time,
                bucket_width,
                project_ids.as_ref(),
                user_ids.as_ref(),
                api_key_ids.as_ref(),
                models.as_ref(),
                group_by.as_ref(),
                limit,
                page,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                UsageAudioTranscriptionsResponse::UsageDataRetrievedSuccessfully
                (body)
                => "UsageDataRetrievedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::UsageCodeInterpreterSessions {
            start_time,
            end_time,
            bucket_width,
            project_ids,
            group_by,
            limit,
            page,
        } => {
            info!("Performing a UsageCodeInterpreterSessions request");

            let result = client.usage_code_interpreter_sessions(
                start_time,
                end_time,
                bucket_width,
                project_ids.as_ref(),
                group_by.as_ref(),
                limit,
                page,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                UsageCodeInterpreterSessionsResponse::UsageDataRetrievedSuccessfully
                (body)
                => "UsageDataRetrievedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::UsageCompletions {
            start_time,
            end_time,
            bucket_width,
            project_ids,
            user_ids,
            api_key_ids,
            models,
            batch,
            group_by,
            limit,
            page,
        } => {
            info!("Performing a UsageCompletions request");

            let result = client.usage_completions(
                start_time,
                end_time,
                bucket_width,
                project_ids.as_ref(),
                user_ids.as_ref(),
                api_key_ids.as_ref(),
                models.as_ref(),
                batch,
                group_by.as_ref(),
                limit,
                page,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                UsageCompletionsResponse::UsageDataRetrievedSuccessfully
                (body)
                => "UsageDataRetrievedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::UsageCosts {
            start_time,
            end_time,
            bucket_width,
            project_ids,
            group_by,
            limit,
            page,
        } => {
            info!("Performing a UsageCosts request");

            let result = client.usage_costs(
                start_time,
                end_time,
                bucket_width,
                project_ids.as_ref(),
                group_by.as_ref(),
                limit,
                page,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                UsageCostsResponse::CostsDataRetrievedSuccessfully
                (body)
                => "CostsDataRetrievedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::UsageEmbeddings {
            start_time,
            end_time,
            bucket_width,
            project_ids,
            user_ids,
            api_key_ids,
            models,
            group_by,
            limit,
            page,
        } => {
            info!("Performing a UsageEmbeddings request");

            let result = client.usage_embeddings(
                start_time,
                end_time,
                bucket_width,
                project_ids.as_ref(),
                user_ids.as_ref(),
                api_key_ids.as_ref(),
                models.as_ref(),
                group_by.as_ref(),
                limit,
                page,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                UsageEmbeddingsResponse::UsageDataRetrievedSuccessfully
                (body)
                => "UsageDataRetrievedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::UsageImages {
            start_time,
            end_time,
            bucket_width,
            sources,
            sizes,
            project_ids,
            user_ids,
            api_key_ids,
            models,
            group_by,
            limit,
            page,
        } => {
            info!("Performing a UsageImages request");

            let result = client.usage_images(
                start_time,
                end_time,
                bucket_width,
                sources.as_ref(),
                sizes.as_ref(),
                project_ids.as_ref(),
                user_ids.as_ref(),
                api_key_ids.as_ref(),
                models.as_ref(),
                group_by.as_ref(),
                limit,
                page,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                UsageImagesResponse::UsageDataRetrievedSuccessfully
                (body)
                => "UsageDataRetrievedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::UsageModerations {
            start_time,
            end_time,
            bucket_width,
            project_ids,
            user_ids,
            api_key_ids,
            models,
            group_by,
            limit,
            page,
        } => {
            info!("Performing a UsageModerations request");

            let result = client.usage_moderations(
                start_time,
                end_time,
                bucket_width,
                project_ids.as_ref(),
                user_ids.as_ref(),
                api_key_ids.as_ref(),
                models.as_ref(),
                group_by.as_ref(),
                limit,
                page,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                UsageModerationsResponse::UsageDataRetrievedSuccessfully
                (body)
                => "UsageDataRetrievedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::UsageVectorStores {
            start_time,
            end_time,
            bucket_width,
            project_ids,
            group_by,
            limit,
            page,
        } => {
            info!("Performing a UsageVectorStores request");

            let result = client.usage_vector_stores(
                start_time,
                end_time,
                bucket_width,
                project_ids.as_ref(),
                group_by.as_ref(),
                limit,
                page,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                UsageVectorStoresResponse::UsageDataRetrievedSuccessfully
                (body)
                => "UsageDataRetrievedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ListUsers {
            limit,
            after,
        } => {
            info!("Performing a ListUsers request");

            let result = client.list_users(
                limit,
                after,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ListUsersResponse::UsersListedSuccessfully
                (body)
                => "UsersListedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::DeleteUser {
            user_id,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a DeleteUser request on {:?}", (
                &user_id
            ));

            let result = client.delete_user(
                user_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                DeleteUserResponse::UserDeletedSuccessfully
                (body)
                => "UserDeletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ModifyUser {
            user_id,
            user_role_update_request,
        } => {
            info!("Performing a ModifyUser request on {:?}", (
                &user_id
            ));

            let result = client.modify_user(
                user_id,
                user_role_update_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ModifyUserResponse::UserRoleUpdatedSuccessfully
                (body)
                => "UserRoleUpdatedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::RetrieveUser {
            user_id,
        } => {
            info!("Performing a RetrieveUser request on {:?}", (
                &user_id
            ));

            let result = client.retrieve_user(
                user_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                RetrieveUserResponse::UserRetrievedSuccessfully
                (body)
                => "UserRetrievedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CreateVectorStore {
            create_vector_store_request,
        } => {
            info!("Performing a CreateVectorStore request");

            let result = client.create_vector_store(
                create_vector_store_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CreateVectorStoreResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ListVectorStores {
            limit,
            order,
            after,
            before,
        } => {
            info!("Performing a ListVectorStores request");

            let result = client.list_vector_stores(
                limit,
                order,
                after,
                before,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ListVectorStoresResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CreateVectorStoreFile {
            vector_store_id,
            create_vector_store_file_request,
        } => {
            info!("Performing a CreateVectorStoreFile request on {:?}", (
                &vector_store_id
            ));

            let result = client.create_vector_store_file(
                vector_store_id,
                create_vector_store_file_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CreateVectorStoreFileResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CreateVectorStoreFileBatch {
            vector_store_id,
            create_vector_store_file_batch_request,
        } => {
            info!("Performing a CreateVectorStoreFileBatch request on {:?}", (
                &vector_store_id
            ));

            let result = client.create_vector_store_file_batch(
                vector_store_id,
                create_vector_store_file_batch_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CreateVectorStoreFileBatchResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::DeleteVectorStore {
            vector_store_id,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a DeleteVectorStore request on {:?}", (
                &vector_store_id
            ));

            let result = client.delete_vector_store(
                vector_store_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                DeleteVectorStoreResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GetVectorStore {
            vector_store_id,
        } => {
            info!("Performing a GetVectorStore request on {:?}", (
                &vector_store_id
            ));

            let result = client.get_vector_store(
                vector_store_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetVectorStoreResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ListVectorStoreFiles {
            vector_store_id,
            limit,
            order,
            after,
            before,
            filter,
        } => {
            info!("Performing a ListVectorStoreFiles request on {:?}", (
                &vector_store_id
            ));

            let result = client.list_vector_store_files(
                vector_store_id,
                limit,
                order,
                after,
                before,
                filter,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ListVectorStoreFilesResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ModifyVectorStore {
            vector_store_id,
            update_vector_store_request,
        } => {
            info!("Performing a ModifyVectorStore request on {:?}", (
                &vector_store_id
            ));

            let result = client.modify_vector_store(
                vector_store_id,
                update_vector_store_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ModifyVectorStoreResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CancelVectorStoreFileBatch {
            vector_store_id,
            batch_id,
        } => {
            info!("Performing a CancelVectorStoreFileBatch request on {:?}", (
                &vector_store_id,
                &batch_id
            ));

            let result = client.cancel_vector_store_file_batch(
                vector_store_id,
                batch_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CancelVectorStoreFileBatchResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::DeleteVectorStoreFile {
            vector_store_id,
            file_id,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a DeleteVectorStoreFile request on {:?}", (
                &vector_store_id,
                &file_id
            ));

            let result = client.delete_vector_store_file(
                vector_store_id,
                file_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                DeleteVectorStoreFileResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GetVectorStoreFile {
            vector_store_id,
            file_id,
        } => {
            info!("Performing a GetVectorStoreFile request on {:?}", (
                &vector_store_id,
                &file_id
            ));

            let result = client.get_vector_store_file(
                vector_store_id,
                file_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetVectorStoreFileResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GetVectorStoreFileBatch {
            vector_store_id,
            batch_id,
        } => {
            info!("Performing a GetVectorStoreFileBatch request on {:?}", (
                &vector_store_id,
                &batch_id
            ));

            let result = client.get_vector_store_file_batch(
                vector_store_id,
                batch_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetVectorStoreFileBatchResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ListFilesInVectorStoreBatch {
            vector_store_id,
            batch_id,
            limit,
            order,
            after,
            before,
            filter,
        } => {
            info!("Performing a ListFilesInVectorStoreBatch request on {:?}", (
                &vector_store_id,
                &batch_id
            ));

            let result = client.list_files_in_vector_store_batch(
                vector_store_id,
                batch_id,
                limit,
                order,
                after,
                before,
                filter,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ListFilesInVectorStoreBatchResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
    };

    if let Some(output_file) = args.output_file {
        std::fs::write(output_file, result)?
    } else {
        println!("{}", result);
    }
    Ok(())
}

fn prompt(force: bool, text: &str) -> Result<()> {
    if force || Confirm::new().with_prompt(text).interact()? {
        Ok(())
    } else {
        Err(anyhow!("Aborting"))
    }
}

// May be unused if all inputs are primitive types
#[allow(dead_code)]
fn parse_json<T: serde::de::DeserializeOwned>(json_string: &str) -> Result<T> {
    serde_json::from_str(json_string).map_err(|err| anyhow!("Error parsing input: {}", err))
}
