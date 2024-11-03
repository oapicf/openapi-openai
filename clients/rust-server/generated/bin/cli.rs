//! CLI tool driving the API client
use anyhow::{anyhow, Context, Result};
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
    CreateAssistantFileResponse,
    CreateMessageResponse,
    CreateRunResponse,
    DeleteAssistantResponse,
    DeleteThreadResponse,
    GetAssistantResponse,
    GetThreadResponse,
    ListAssistantFilesResponse,
    ListMessagesResponse,
    ListRunsResponse,
    ModifyAssistantResponse,
    ModifyThreadResponse,
    CancelRunResponse,
    DeleteAssistantFileResponse,
    GetAssistantFileResponse,
    GetMessageResponse,
    GetRunResponse,
    ListMessageFilesResponse,
    ListRunStepsResponse,
    ModifyMessageResponse,
    ModifyRunResponse,
    SubmitToolOuputsToRunResponse,
    GetMessageFileResponse,
    GetRunStepResponse,
    CreateSpeechResponse,
    CreateTranscriptionResponse,
    CreateTranslationResponse,
    CreateChatCompletionResponse,
    CreateCompletionResponse,
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
    ListModelsResponse,
    DeleteModelResponse,
    RetrieveModelResponse,
    CreateModerationResponse,
};
use simple_logger::SimpleLogger;
use structopt::StructOpt;
use swagger::{AuthData, ContextBuilder, EmptyContext, Push, XSpanIdString};

type ClientContext = swagger::make_context_ty!(
    ContextBuilder,
    EmptyContext,
    Option<AuthData>,
    XSpanIdString
);

#[derive(StructOpt, Debug)]
#[structopt(
    name = "OpenAI API",
    version = "2.0.0",
    about = "CLI access to OpenAI API"
)]
struct Cli {
    #[structopt(subcommand)]
    operation: Operation,

    /// Address or hostname of the server hosting this API, including optional port
    #[structopt(short = "a", long, default_value = "http://localhost")]
    server_address: String,

    /// Path to the client private key if using client-side TLS authentication
    #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
    #[structopt(long, requires_all(&["client-certificate", "server-certificate"]))]
    client_key: Option<String>,

    /// Path to the client's public certificate associated with the private key
    #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
    #[structopt(long, requires_all(&["client-key", "server-certificate"]))]
    client_certificate: Option<String>,

    /// Path to CA certificate used to authenticate the server
    #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
    #[structopt(long)]
    server_certificate: Option<String>,

    /// If set, write output to file instead of stdout
    #[structopt(short, long)]
    output_file: Option<String>,

    #[structopt(flatten)]
    verbosity: clap_verbosity_flag::Verbosity,

    /// Don't ask for any confirmation prompts
    #[allow(dead_code)]
    #[structopt(short, long)]
    force: bool,

    /// Bearer token if used for authentication
    #[structopt(env = "OPENAPI_CLIENT_BEARER_TOKEN", hide_env_values = true)]
    bearer_token: Option<String>,
}

#[derive(StructOpt, Debug)]
enum Operation {
    /// Create an assistant with a model and instructions.
    CreateAssistant {
        #[structopt(parse(try_from_str = parse_json))]
        create_assistant_request: models::CreateAssistantRequest,
    },
    /// Create a thread.
    CreateThread {
        #[structopt(parse(try_from_str = parse_json))]
        create_thread_request: Option<models::CreateThreadRequest>,
    },
    /// Create a thread and run it in one request.
    CreateThreadAndRun {
        #[structopt(parse(try_from_str = parse_json))]
        create_thread_and_run_request: models::CreateThreadAndRunRequest,
    },
    /// Returns a list of assistants.
    ListAssistants {
        /// A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
        limit: Option<i32>,
        /// Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
        #[structopt(parse(try_from_str = parse_json))]
        order: Option<models::ListAssistantsOrderParameter>,
        /// A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
        after: Option<String>,
        /// A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
        before: Option<String>,
    },
    /// Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
    CreateAssistantFile {
        /// The ID of the assistant for which to create a File. 
        assistant_id: String,
        #[structopt(parse(try_from_str = parse_json))]
        create_assistant_file_request: models::CreateAssistantFileRequest,
    },
    /// Create a message.
    CreateMessage {
        /// The ID of the [thread](/docs/api-reference/threads) to create a message for.
        thread_id: String,
        #[structopt(parse(try_from_str = parse_json))]
        create_message_request: models::CreateMessageRequest,
    },
    /// Create a run.
    CreateRun {
        /// The ID of the thread to run.
        thread_id: String,
        #[structopt(parse(try_from_str = parse_json))]
        create_run_request: models::CreateRunRequest,
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
    /// Returns a list of assistant files.
    ListAssistantFiles {
        /// The ID of the assistant the file belongs to.
        assistant_id: String,
        /// A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
        limit: Option<i32>,
        /// Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
        #[structopt(parse(try_from_str = parse_json))]
        order: Option<models::ListAssistantsOrderParameter>,
        /// A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
        after: Option<String>,
        /// A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
        before: Option<String>,
    },
    /// Returns a list of messages for a given thread.
    ListMessages {
        /// The ID of the [thread](/docs/api-reference/threads) the messages belong to.
        thread_id: String,
        /// A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
        limit: Option<i32>,
        /// Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
        #[structopt(parse(try_from_str = parse_json))]
        order: Option<models::ListAssistantsOrderParameter>,
        /// A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
        after: Option<String>,
        /// A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
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
        #[structopt(parse(try_from_str = parse_json))]
        order: Option<models::ListAssistantsOrderParameter>,
        /// A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
        after: Option<String>,
        /// A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
        before: Option<String>,
    },
    /// Modifies an assistant.
    ModifyAssistant {
        /// The ID of the assistant to modify.
        assistant_id: String,
        #[structopt(parse(try_from_str = parse_json))]
        modify_assistant_request: models::ModifyAssistantRequest,
    },
    /// Modifies a thread.
    ModifyThread {
        /// The ID of the thread to modify. Only the `metadata` can be modified.
        thread_id: String,
        #[structopt(parse(try_from_str = parse_json))]
        modify_thread_request: models::ModifyThreadRequest,
    },
    /// Cancels a run that is `in_progress`.
    CancelRun {
        /// The ID of the thread to which this run belongs.
        thread_id: String,
        /// The ID of the run to cancel.
        run_id: String,
    },
    /// Delete an assistant file.
    DeleteAssistantFile {
        /// The ID of the assistant that the file belongs to.
        assistant_id: String,
        /// The ID of the file to delete.
        file_id: String,
    },
    /// Retrieves an AssistantFile.
    GetAssistantFile {
        /// The ID of the assistant who the file belongs to.
        assistant_id: String,
        /// The ID of the file we're getting.
        file_id: String,
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
    /// Returns a list of message files.
    ListMessageFiles {
        /// The ID of the thread that the message and files belong to.
        thread_id: String,
        /// The ID of the message that the files belongs to.
        message_id: String,
        /// A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
        limit: Option<i32>,
        /// Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
        #[structopt(parse(try_from_str = parse_json))]
        order: Option<models::ListAssistantsOrderParameter>,
        /// A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
        after: Option<String>,
        /// A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
        before: Option<String>,
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
        #[structopt(parse(try_from_str = parse_json))]
        order: Option<models::ListAssistantsOrderParameter>,
        /// A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
        after: Option<String>,
        /// A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
        before: Option<String>,
    },
    /// Modifies a message.
    ModifyMessage {
        /// The ID of the thread to which this message belongs.
        thread_id: String,
        /// The ID of the message to modify.
        message_id: String,
        #[structopt(parse(try_from_str = parse_json))]
        modify_message_request: models::ModifyMessageRequest,
    },
    /// Modifies a run.
    ModifyRun {
        /// The ID of the [thread](/docs/api-reference/threads) that was run.
        thread_id: String,
        /// The ID of the run to modify.
        run_id: String,
        #[structopt(parse(try_from_str = parse_json))]
        modify_run_request: models::ModifyRunRequest,
    },
    /// When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
    SubmitToolOuputsToRun {
        /// The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
        thread_id: String,
        /// The ID of the run that requires the tool output submission.
        run_id: String,
        #[structopt(parse(try_from_str = parse_json))]
        submit_tool_outputs_run_request: models::SubmitToolOutputsRunRequest,
    },
    /// Retrieves a message file.
    GetMessageFile {
        /// The ID of the thread to which the message and File belong.
        thread_id: String,
        /// The ID of the message the file belongs to.
        message_id: String,
        /// The ID of the file being retrieved.
        file_id: String,
    },
    /// Retrieves a run step.
    GetRunStep {
        /// The ID of the thread to which the run and run step belongs.
        thread_id: String,
        /// The ID of the run to which the run step belongs.
        run_id: String,
        /// The ID of the run step to retrieve.
        step_id: String,
    },
    /// Generates audio from the input text.
    CreateSpeech {
        #[structopt(parse(try_from_str = parse_json))]
        create_speech_request: models::CreateSpeechRequest,
    },
    /// Transcribes audio into the input language.
    CreateTranscription {
        /// The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
        #[structopt(parse(try_from_str = parse_json))]
        file: swagger::ByteArray,
        #[structopt(parse(try_from_str = parse_json))]
        model: models::CreateTranscriptionRequestModel,
        /// The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
        language: Option<String>,
        /// An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. 
        prompt: Option<String>,
        #[structopt(parse(try_from_str = parse_json))]
        response_format: Option<models::CreateTranscriptionRequestResponseFormat>,
        /// The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
        temperature: Option<f64>,
        /// The timestamp granularities to populate for this transcription. `response_format` must be set `verbose_json` to use timestamp granularities. Either or both of these options are supported: `word`, or `segment`. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. 
        #[structopt(parse(try_from_str = parse_json), long)]
        timestamp_granularities_left_square_bracket_right_square_bracket: Option<Vec<models::CreateTranscriptionRequestTimestampGranularitiesInner>>,
    },
    /// Translates audio into English.
    CreateTranslation {
        /// The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
        #[structopt(parse(try_from_str = parse_json))]
        file: swagger::ByteArray,
        #[structopt(parse(try_from_str = parse_json))]
        model: models::CreateTranscriptionRequestModel,
        /// An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. 
        prompt: Option<String>,
        /// The format of the transcript output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. 
        response_format: Option<String>,
        /// The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
        temperature: Option<f64>,
    },
    /// Creates a model response for the given chat conversation.
    CreateChatCompletion {
        #[structopt(parse(try_from_str = parse_json))]
        create_chat_completion_request: models::CreateChatCompletionRequest,
    },
    /// Creates a completion for the provided prompt and parameters.
    CreateCompletion {
        #[structopt(parse(try_from_str = parse_json))]
        create_completion_request: models::CreateCompletionRequest,
    },
    /// Creates an embedding vector representing the input text.
    CreateEmbedding {
        #[structopt(parse(try_from_str = parse_json))]
        create_embedding_request: models::CreateEmbeddingRequest,
    },
    /// Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
    CreateFile {
        /// The File object (not file name) to be uploaded. 
        #[structopt(parse(try_from_str = parse_json))]
        file: swagger::ByteArray,
        #[structopt(parse(try_from_str = parse_json))]
        purpose: models::CreateFileRequestPurpose,
    },
    /// Returns a list of files that belong to the user's organization.
    ListFiles {
        /// Only return files with the given purpose.
        purpose: Option<String>,
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
        #[structopt(parse(try_from_str = parse_json))]
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
        #[structopt(parse(try_from_str = parse_json))]
        create_image_request: models::CreateImageRequest,
    },
    /// Creates an edited or extended image given an original image and a prompt.
    CreateImageEdit {
        /// The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
        #[structopt(parse(try_from_str = parse_json))]
        image: swagger::ByteArray,
        /// A text description of the desired image(s). The maximum length is 1000 characters.
        prompt: String,
        /// An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.
        #[structopt(parse(try_from_str = parse_json))]
        mask: Option<swagger::ByteArray>,
        #[structopt(parse(try_from_str = parse_json))]
        model: Option<swagger::Nullable<models::CreateImageEditRequestModel>>,
        /// The number of images to generate. Must be between 1 and 10.
        n: Option<swagger::Nullable<i32>>,
        #[structopt(parse(try_from_str = parse_json))]
        size: Option<swagger::Nullable<models::CreateImageEditRequestSize>>,
        #[structopt(parse(try_from_str = parse_json))]
        response_format: Option<swagger::Nullable<models::CreateImageRequestResponseFormat>>,
        /// A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
        user: Option<String>,
    },
    /// Creates a variation of a given image.
    CreateImageVariation {
        /// The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
        #[structopt(parse(try_from_str = parse_json))]
        image: swagger::ByteArray,
        #[structopt(parse(try_from_str = parse_json))]
        model: Option<swagger::Nullable<models::CreateImageEditRequestModel>>,
        /// The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
        n: Option<swagger::Nullable<i32>>,
        #[structopt(parse(try_from_str = parse_json))]
        response_format: Option<swagger::Nullable<models::CreateImageRequestResponseFormat>>,
        #[structopt(parse(try_from_str = parse_json))]
        size: Option<swagger::Nullable<models::CreateImageEditRequestSize>>,
        /// A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
        user: Option<String>,
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
    /// Classifies if text is potentially harmful.
    CreateModeration {
        #[structopt(parse(try_from_str = parse_json))]
        create_moderation_request: models::CreateModerationRequest,
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
    let args = Cli::from_args();
    if let Some(log_level) = args.verbosity.log_level() {
        SimpleLogger::new().with_level(log_level.to_level_filter()).init()?;
    }

    debug!("Arguments: {:?}", &args);

    let mut auth_data: Option<AuthData> = None;

    if let Some(ref bearer_token) = args.bearer_token {
        debug!("Using bearer token");
        auth_data = Some(AuthData::bearer(bearer_token));
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
        Operation::CreateAssistantFile {
            assistant_id,
            create_assistant_file_request,
        } => {
            info!("Performing a CreateAssistantFile request on {:?}", (
                &assistant_id
            ));

            let result = client.create_assistant_file(
                assistant_id,
                create_assistant_file_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CreateAssistantFileResponse::OK
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
        } => {
            info!("Performing a CreateRun request on {:?}", (
                &thread_id
            ));

            let result = client.create_run(
                thread_id,
                create_run_request,
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
        Operation::ListAssistantFiles {
            assistant_id,
            limit,
            order,
            after,
            before,
        } => {
            info!("Performing a ListAssistantFiles request on {:?}", (
                &assistant_id
            ));

            let result = client.list_assistant_files(
                assistant_id,
                limit,
                order,
                after,
                before,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ListAssistantFilesResponse::OK
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
        Operation::DeleteAssistantFile {
            assistant_id,
            file_id,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a DeleteAssistantFile request on {:?}", (
                &assistant_id,
                &file_id
            ));

            let result = client.delete_assistant_file(
                assistant_id,
                file_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                DeleteAssistantFileResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GetAssistantFile {
            assistant_id,
            file_id,
        } => {
            info!("Performing a GetAssistantFile request on {:?}", (
                &assistant_id,
                &file_id
            ));

            let result = client.get_assistant_file(
                assistant_id,
                file_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetAssistantFileResponse::OK
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
        Operation::ListMessageFiles {
            thread_id,
            message_id,
            limit,
            order,
            after,
            before,
        } => {
            info!("Performing a ListMessageFiles request on {:?}", (
                &thread_id,
                &message_id
            ));

            let result = client.list_message_files(
                thread_id,
                message_id,
                limit,
                order,
                after,
                before,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ListMessageFilesResponse::OK
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
        Operation::GetMessageFile {
            thread_id,
            message_id,
            file_id,
        } => {
            info!("Performing a GetMessageFile request on {:?}", (
                &thread_id,
                &message_id,
                &file_id
            ));

            let result = client.get_message_file(
                thread_id,
                message_id,
                file_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetMessageFileResponse::OK
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
        } => {
            info!("Performing a ListFiles request");

            let result = client.list_files(
                purpose,
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
fn parse_json<'a, T: serde::de::Deserialize<'a>>(json_string: &'a str) -> Result<T> {
    serde_json::from_str(json_string).map_err(|err| anyhow!("Error parsing input: {}", err))
}
