#![allow(missing_docs, unused_variables, trivial_casts)]


#[allow(unused_imports)]
use futures::{future, Stream, stream};
#[allow(unused_imports)]
use openapi_client::{Api, ApiNoContext, Client, ContextWrapperExt, models,
                      CancelFineTuneResponse,
                      CreateChatCompletionResponse,
                      CreateCompletionResponse,
                      CreateEditResponse,
                      CreateEmbeddingResponse,
                      CreateFileResponse,
                      CreateFineTuneResponse,
                      CreateImageResponse,
                      CreateImageEditResponse,
                      CreateImageVariationResponse,
                      CreateModerationResponse,
                      CreateTranscriptionResponse,
                      CreateTranslationResponse,
                      DeleteFileResponse,
                      DeleteModelResponse,
                      DownloadFileResponse,
                      ListFilesResponse,
                      ListFineTuneEventsResponse,
                      ListFineTunesResponse,
                      ListModelsResponse,
                      RetrieveFileResponse,
                      RetrieveFineTuneResponse,
                      RetrieveModelResponse,
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
                "CancelFineTune",
                "CreateFile",
                "CreateImageEdit",
                "CreateImageVariation",
                "DeleteFile",
                "DeleteModel",
                "DownloadFile",
                "ListFiles",
                "ListFineTuneEvents",
                "ListFineTunes",
                "ListModels",
                "RetrieveFile",
                "RetrieveFineTune",
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
        Some("CancelFineTune") => {
            let result = rt.block_on(client.cancel_fine_tune(
                  "ft-AF1WoRqd3aJAHsqc9NY7iL8F".to_string()
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
        Some("CreateEdit") => {
            let result = rt.block_on(client.create_edit(
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
        /* Disabled because there's no example.
        Some("CreateFineTune") => {
            let result = rt.block_on(client.create_fine_tune(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
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
                  Some(56),
                  Some("size_example".to_string()),
                  Some("response_format_example".to_string()),
                  Some("user_example".to_string())
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
        Some("CreateTranscription") => {
            let result = rt.block_on(client.create_transcription(
                  swagger::ByteArray(Vec::from("BINARY_DATA_HERE")),
                  ???,
                  Some("prompt_example".to_string()),
                  Some("response_format_example".to_string()),
                  Some(8.14),
                  Some("language_example".to_string())
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
        Some("DeleteFile") => {
            let result = rt.block_on(client.delete_file(
                  "file_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteModel") => {
            let result = rt.block_on(client.delete_model(
                  "curie:ft-acmeco-2021-03-03-21-44-20".to_string()
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
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListFineTuneEvents") => {
            let result = rt.block_on(client.list_fine_tune_events(
                  "ft-AF1WoRqd3aJAHsqc9NY7iL8F".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListFineTunes") => {
            let result = rt.block_on(client.list_fine_tunes(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListModels") => {
            let result = rt.block_on(client.list_models(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RetrieveFile") => {
            let result = rt.block_on(client.retrieve_file(
                  "file_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RetrieveFineTune") => {
            let result = rt.block_on(client.retrieve_fine_tune(
                  "ft-AF1WoRqd3aJAHsqc9NY7iL8F".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RetrieveModel") => {
            let result = rt.block_on(client.retrieve_model(
                  "text-davinci-001".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        _ => {
            panic!("Invalid operation provided")
        }
    }
}
