#![allow(missing_docs, unused_variables, trivial_casts)]


#[allow(unused_imports)]
use futures::{future, Stream, stream};
#[allow(unused_imports)]
use openapi_client::{Api, ApiNoContext, Client, ContextWrapperExt, models,
                      CancelRunResponse,
                      CreateAssistantResponse,
                      CreateAssistantFileResponse,
                      CreateMessageResponse,
                      CreateRunResponse,
                      CreateThreadResponse,
                      CreateThreadAndRunResponse,
                      DeleteAssistantResponse,
                      DeleteAssistantFileResponse,
                      DeleteThreadResponse,
                      GetAssistantResponse,
                      GetAssistantFileResponse,
                      GetMessageResponse,
                      GetMessageFileResponse,
                      GetRunResponse,
                      GetRunStepResponse,
                      GetThreadResponse,
                      ListAssistantFilesResponse,
                      ListAssistantsResponse,
                      ListMessageFilesResponse,
                      ListMessagesResponse,
                      ListRunStepsResponse,
                      ListRunsResponse,
                      ModifyAssistantResponse,
                      ModifyMessageResponse,
                      ModifyRunResponse,
                      ModifyThreadResponse,
                      SubmitToolOuputsToRunResponse,
                      CreateSpeechResponse,
                      CreateTranscriptionResponse,
                      CreateTranslationResponse,
                      CreateChatCompletionResponse,
                      CreateCompletionResponse,
                      CreateEmbeddingResponse,
                      CreateFileResponse,
                      DeleteFileResponse,
                      DownloadFileResponse,
                      ListFilesResponse,
                      RetrieveFileResponse,
                      CancelFineTuningJobResponse,
                      CreateFineTuningJobResponse,
                      ListFineTuningEventsResponse,
                      ListFineTuningJobCheckpointsResponse,
                      ListPaginatedFineTuningJobsResponse,
                      RetrieveFineTuningJobResponse,
                      CreateImageResponse,
                      CreateImageEditResponse,
                      CreateImageVariationResponse,
                      DeleteModelResponse,
                      ListModelsResponse,
                      RetrieveModelResponse,
                      CreateModerationResponse,
                     };
use clap::{App, Arg};

#[allow(unused_imports)]
use log::info;

// swagger::Has may be unused if there are no examples
#[allow(unused_imports)]
use swagger::{AuthData, ContextBuilder, EmptyContext, Has, Push, XSpanIdString};

type ClientContext = swagger::make_context_ty!(ContextBuilder, EmptyContext, Option<AuthData>, XSpanIdString);

// rt may be unused if there are no examples
#[allow(unused_mut)]
fn main() {
    env_logger::init();

    let matches = App::new("client")
        .arg(Arg::with_name("operation")
            .help("Sets the operation to run")
            .possible_values(&[
                "CancelRun",
                "CreateThread",
                "DeleteAssistant",
                "DeleteAssistantFile",
                "DeleteThread",
                "GetAssistant",
                "GetAssistantFile",
                "GetMessage",
                "GetMessageFile",
                "GetRun",
                "GetRunStep",
                "GetThread",
                "ListAssistantFiles",
                "ListAssistants",
                "ListMessageFiles",
                "ListMessages",
                "ListRunSteps",
                "ListRuns",
                "CreateFile",
                "DeleteFile",
                "DownloadFile",
                "ListFiles",
                "RetrieveFile",
                "CancelFineTuningJob",
                "ListFineTuningEvents",
                "ListFineTuningJobCheckpoints",
                "ListPaginatedFineTuningJobs",
                "RetrieveFineTuningJob",
                "CreateImageEdit",
                "CreateImageVariation",
                "DeleteModel",
                "ListModels",
                "RetrieveModel",
            ])
            .required(true)
            .index(1))
        .arg(Arg::with_name("https")
            .long("https")
            .help("Whether to use HTTPS or not"))
        .arg(Arg::with_name("host")
            .long("host")
            .takes_value(true)
            .default_value("api.openai.com")
            .help("Hostname to contact"))
        .arg(Arg::with_name("port")
            .long("port")
            .takes_value(true)
            .default_value("8080")
            .help("Port to contact"))
        .get_matches();

    let is_https = matches.is_present("https");
    let base_url = format!("{}://{}:{}",
                           if is_https { "https" } else { "http" },
                           matches.value_of("host").unwrap(),
                           matches.value_of("port").unwrap());

    let context: ClientContext =
        swagger::make_context!(ContextBuilder, EmptyContext, None as Option<AuthData>, XSpanIdString::default());

    let mut client : Box<dyn ApiNoContext<ClientContext>> = if matches.is_present("https") {
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

    match matches.value_of("operation") {
        Some("CancelRun") => {
            let result = rt.block_on(client.cancel_run(
                  "thread_id_example".to_string(),
                  "run_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("CreateAssistant") => {
            let result = rt.block_on(client.create_assistant(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("CreateAssistantFile") => {
            let result = rt.block_on(client.create_assistant_file(
                  "file-abc123".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
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
        Some("DeleteAssistant") => {
            let result = rt.block_on(client.delete_assistant(
                  "assistant_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteAssistantFile") => {
            let result = rt.block_on(client.delete_assistant_file(
                  "assistant_id_example".to_string(),
                  "file_id_example".to_string()
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
        Some("GetAssistantFile") => {
            let result = rt.block_on(client.get_assistant_file(
                  "assistant_id_example".to_string(),
                  "file_id_example".to_string()
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
        Some("GetMessageFile") => {
            let result = rt.block_on(client.get_message_file(
                  "thread_abc123".to_string(),
                  "msg_abc123".to_string(),
                  "file-abc123".to_string()
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
        Some("GetRunStep") => {
            let result = rt.block_on(client.get_run_step(
                  "thread_id_example".to_string(),
                  "run_id_example".to_string(),
                  "step_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetThread") => {
            let result = rt.block_on(client.get_thread(
                  "thread_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListAssistantFiles") => {
            let result = rt.block_on(client.list_assistant_files(
                  "assistant_id_example".to_string(),
                  Some(56),
                  Some("order_example".to_string()),
                  Some("after_example".to_string()),
                  Some("before_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListAssistants") => {
            let result = rt.block_on(client.list_assistants(
                  Some(56),
                  Some("order_example".to_string()),
                  Some("after_example".to_string()),
                  Some("before_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListMessageFiles") => {
            let result = rt.block_on(client.list_message_files(
                  "thread_id_example".to_string(),
                  "message_id_example".to_string(),
                  Some(56),
                  Some("order_example".to_string()),
                  Some("after_example".to_string()),
                  Some("before_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListMessages") => {
            let result = rt.block_on(client.list_messages(
                  "thread_id_example".to_string(),
                  Some(56),
                  Some("order_example".to_string()),
                  Some("after_example".to_string()),
                  Some("before_example".to_string()),
                  Some("run_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListRunSteps") => {
            let result = rt.block_on(client.list_run_steps(
                  "thread_id_example".to_string(),
                  "run_id_example".to_string(),
                  Some(56),
                  Some("order_example".to_string()),
                  Some("after_example".to_string()),
                  Some("before_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListRuns") => {
            let result = rt.block_on(client.list_runs(
                  "thread_id_example".to_string(),
                  Some(56),
                  Some("order_example".to_string()),
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
        Some("ModifyThread") => {
            let result = rt.block_on(client.modify_thread(
                  "thread_id_example".to_string(),
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
                  Some("response_format_example".to_string()),
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
                  Some("response_format_example".to_string()),
                  Some(8.14)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
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
                  "purpose_example".to_string()
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
        Some("ListFiles") => {
            let result = rt.block_on(client.list_files(
                  Some("purpose_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RetrieveFile") => {
            let result = rt.block_on(client.retrieve_file(
                  "file_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CancelFineTuningJob") => {
            let result = rt.block_on(client.cancel_fine_tuning_job(
                  "ft-AF1WoRqd3aJAHsqc9NY7iL8F".to_string()
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
        Some("ListPaginatedFineTuningJobs") => {
            let result = rt.block_on(client.list_paginated_fine_tuning_jobs(
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
                  Some("size_example".to_string()),
                  Some("response_format_example".to_string()),
                  Some("user_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateImageVariation") => {
            let result = rt.block_on(client.create_image_variation(
                  swagger::ByteArray(Vec::from("BINARY_DATA_HERE")),
                  None,
                  Some(56),
                  Some("response_format_example".to_string()),
                  Some("size_example".to_string()),
                  Some("user_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteModel") => {
            let result = rt.block_on(client.delete_model(
                  "ft:gpt-3.5-turbo:acemeco:suffix:abc123".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListModels") => {
            let result = rt.block_on(client.list_models(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RetrieveModel") => {
            let result = rt.block_on(client.retrieve_model(
                  "gpt-3.5-turbo".to_string()
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
        _ => {
            panic!("Invalid operation provided")
        }
    }
}
