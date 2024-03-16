require 'json'


MyApp.add_route('POST', '/v1/fine-tunes/{fine_tune_id}/cancel', {
  "resourcePath" => "/OpenAI",
  "summary" => "Immediately cancel a fine-tune job. ",
  "nickname" => "cancel_fine_tune",
  "responseClass" => "FineTune",
  "endpoint" => "/fine-tunes/{fine_tune_id}/cancel",
  "notes" => "",
  "parameters" => [
    {
      "name" => "fine_tune_id",
      "description" => "The ID of the fine-tune job to cancel ",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/chat/completions', {
  "resourcePath" => "/OpenAI",
  "summary" => "Creates a model response for the given chat conversation.",
  "nickname" => "create_chat_completion",
  "responseClass" => "CreateChatCompletionResponse",
  "endpoint" => "/chat/completions",
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CreateChatCompletionRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/completions', {
  "resourcePath" => "/OpenAI",
  "summary" => "Creates a completion for the provided prompt and parameters.",
  "nickname" => "create_completion",
  "responseClass" => "CreateCompletionResponse",
  "endpoint" => "/completions",
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CreateCompletionRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/edits', {
  "resourcePath" => "/OpenAI",
  "summary" => "Creates a new edit for the provided input, instruction, and parameters.",
  "nickname" => "create_edit",
  "responseClass" => "CreateEditResponse",
  "endpoint" => "/edits",
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CreateEditRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/embeddings', {
  "resourcePath" => "/OpenAI",
  "summary" => "Creates an embedding vector representing the input text.",
  "nickname" => "create_embedding",
  "responseClass" => "CreateEmbeddingResponse",
  "endpoint" => "/embeddings",
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CreateEmbeddingRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/files', {
  "resourcePath" => "/OpenAI",
  "summary" => "Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. ",
  "nickname" => "create_file",
  "responseClass" => "OpenAIFile",
  "endpoint" => "/files",
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/fine-tunes', {
  "resourcePath" => "/OpenAI",
  "summary" => "Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) ",
  "nickname" => "create_fine_tune",
  "responseClass" => "FineTune",
  "endpoint" => "/fine-tunes",
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CreateFineTuneRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/images/generations', {
  "resourcePath" => "/OpenAI",
  "summary" => "Creates an image given a prompt.",
  "nickname" => "create_image",
  "responseClass" => "ImagesResponse",
  "endpoint" => "/images/generations",
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CreateImageRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/images/edits', {
  "resourcePath" => "/OpenAI",
  "summary" => "Creates an edited or extended image given an original image and a prompt.",
  "nickname" => "create_image_edit",
  "responseClass" => "ImagesResponse",
  "endpoint" => "/images/edits",
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/images/variations', {
  "resourcePath" => "/OpenAI",
  "summary" => "Creates a variation of a given image.",
  "nickname" => "create_image_variation",
  "responseClass" => "ImagesResponse",
  "endpoint" => "/images/variations",
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/moderations', {
  "resourcePath" => "/OpenAI",
  "summary" => "Classifies if text violates OpenAI's Content Policy",
  "nickname" => "create_moderation",
  "responseClass" => "CreateModerationResponse",
  "endpoint" => "/moderations",
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CreateModerationRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/audio/transcriptions', {
  "resourcePath" => "/OpenAI",
  "summary" => "Transcribes audio into the input language.",
  "nickname" => "create_transcription",
  "responseClass" => "CreateTranscriptionResponse",
  "endpoint" => "/audio/transcriptions",
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/audio/translations', {
  "resourcePath" => "/OpenAI",
  "summary" => "Translates audio into English.",
  "nickname" => "create_translation",
  "responseClass" => "CreateTranslationResponse",
  "endpoint" => "/audio/translations",
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/files/{file_id}', {
  "resourcePath" => "/OpenAI",
  "summary" => "Delete a file.",
  "nickname" => "delete_file",
  "responseClass" => "DeleteFileResponse",
  "endpoint" => "/files/{file_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "file_id",
      "description" => "The ID of the file to use for this request",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/models/{model}', {
  "resourcePath" => "/OpenAI",
  "summary" => "Delete a fine-tuned model. You must have the Owner role in your organization.",
  "nickname" => "delete_model",
  "responseClass" => "DeleteModelResponse",
  "endpoint" => "/models/{model}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "model",
      "description" => "The model to delete",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/files/{file_id}/content', {
  "resourcePath" => "/OpenAI",
  "summary" => "Returns the contents of the specified file",
  "nickname" => "download_file",
  "responseClass" => "String",
  "endpoint" => "/files/{file_id}/content",
  "notes" => "",
  "parameters" => [
    {
      "name" => "file_id",
      "description" => "The ID of the file to use for this request",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/files', {
  "resourcePath" => "/OpenAI",
  "summary" => "Returns a list of files that belong to the user's organization.",
  "nickname" => "list_files",
  "responseClass" => "ListFilesResponse",
  "endpoint" => "/files",
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/fine-tunes/{fine_tune_id}/events', {
  "resourcePath" => "/OpenAI",
  "summary" => "Get fine-grained status updates for a fine-tune job. ",
  "nickname" => "list_fine_tune_events",
  "responseClass" => "ListFineTuneEventsResponse",
  "endpoint" => "/fine-tunes/{fine_tune_id}/events",
  "notes" => "",
  "parameters" => [
    {
      "name" => "stream",
      "description" => "Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "fine_tune_id",
      "description" => "The ID of the fine-tune job to get events for. ",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/fine-tunes', {
  "resourcePath" => "/OpenAI",
  "summary" => "List your organization's fine-tuning jobs ",
  "nickname" => "list_fine_tunes",
  "responseClass" => "ListFineTunesResponse",
  "endpoint" => "/fine-tunes",
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/models', {
  "resourcePath" => "/OpenAI",
  "summary" => "Lists the currently available models, and provides basic information about each one such as the owner and availability.",
  "nickname" => "list_models",
  "responseClass" => "ListModelsResponse",
  "endpoint" => "/models",
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/files/{file_id}', {
  "resourcePath" => "/OpenAI",
  "summary" => "Returns information about a specific file.",
  "nickname" => "retrieve_file",
  "responseClass" => "OpenAIFile",
  "endpoint" => "/files/{file_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "file_id",
      "description" => "The ID of the file to use for this request",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/fine-tunes/{fine_tune_id}', {
  "resourcePath" => "/OpenAI",
  "summary" => "Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) ",
  "nickname" => "retrieve_fine_tune",
  "responseClass" => "FineTune",
  "endpoint" => "/fine-tunes/{fine_tune_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "fine_tune_id",
      "description" => "The ID of the fine-tune job ",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/models/{model}', {
  "resourcePath" => "/OpenAI",
  "summary" => "Retrieves a model instance, providing basic information about the model such as the owner and permissioning.",
  "nickname" => "retrieve_model",
  "responseClass" => "Model",
  "endpoint" => "/models/{model}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "model",
      "description" => "The ID of the model to use for this request",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

