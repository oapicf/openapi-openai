-module(openapi_api).

-export([ cancel_fine_tune/1
        , create_chat_completion/1
        , create_completion/1
        , create_edit/1
        , create_embedding/1
        , create_file/2
        , create_fine_tune/1
        , create_image/1
        , create_image_edit/2
        , create_image_variation/1
        , create_moderation/1
        , create_transcription/2
        , create_translation/2
        , delete_file/1
        , delete_model/1
        , download_file/1
        , list_files/0
        , list_fine_tune_events/1
        , list_fine_tunes/0
        , list_models/0
        , retrieve_file/1
        , retrieve_fine_tune/1
        , retrieve_model/1
        ]).

-define(BASE_URL, "/v1").

%% @doc Immediately cancel a fine-tune job. 
%% 
-spec cancel_fine_tune(binary()) ->
  openapi_utils:response().
cancel_fine_tune(FineTuneId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/fine-tunes/", FineTuneId, "/cancel"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Creates a model response for the given chat conversation.
%% 
-spec create_chat_completion(openapi_create_chat_completion_request:openapi_create_chat_completion_request()) ->
  openapi_utils:response().
create_chat_completion(OpenapiCreateChatCompletionRequest) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/chat/completions"],
  Body        = OpenapiCreateChatCompletionRequest,
  ContentType = hd(["application/json"]),

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Creates a completion for the provided prompt and parameters.
%% 
-spec create_completion(openapi_create_completion_request:openapi_create_completion_request()) ->
  openapi_utils:response().
create_completion(OpenapiCreateCompletionRequest) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/completions"],
  Body        = OpenapiCreateCompletionRequest,
  ContentType = hd(["application/json"]),

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Creates a new edit for the provided input, instruction, and parameters.
%% 
-spec create_edit(openapi_create_edit_request:openapi_create_edit_request()) ->
  openapi_utils:response().
create_edit(OpenapiCreateEditRequest) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/edits"],
  Body        = OpenapiCreateEditRequest,
  ContentType = hd(["application/json"]),

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Creates an embedding vector representing the input text.
%% 
-spec create_embedding(openapi_create_embedding_request:openapi_create_embedding_request()) ->
  openapi_utils:response().
create_embedding(OpenapiCreateEmbeddingRequest) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/embeddings"],
  Body        = OpenapiCreateEmbeddingRequest,
  ContentType = hd(["application/json"]),

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
%% 
-spec create_file(binary(), binary()) ->
  openapi_utils:response().
create_file(File, Purpose) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/files"],
  Body        = {form, [{<<"file">>, File, {<<"purpose">>, Purpose]++openapi_utils:optional_params([], _OptionalParams)},
  ContentType = hd(["multipart/form-data"]),

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
%% 
-spec create_fine_tune(openapi_create_fine_tune_request:openapi_create_fine_tune_request()) ->
  openapi_utils:response().
create_fine_tune(OpenapiCreateFineTuneRequest) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/fine-tunes"],
  Body        = OpenapiCreateFineTuneRequest,
  ContentType = hd(["application/json"]),

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Creates an image given a prompt.
%% 
-spec create_image(openapi_create_image_request:openapi_create_image_request()) ->
  openapi_utils:response().
create_image(OpenapiCreateImageRequest) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/images/generations"],
  Body        = OpenapiCreateImageRequest,
  ContentType = hd(["application/json"]),

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Creates an edited or extended image given an original image and a prompt.
%% 
-spec create_image_edit(binary(), binary()) ->
  openapi_utils:response().
create_image_edit(Image, Prompt) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/images/edits"],
  Body        = {form, [{<<"image">>, Image, {<<"prompt">>, Prompt]++openapi_utils:optional_params([, 'mask', 'n', 'size', 'response_format', 'user'], _OptionalParams)},
  ContentType = hd(["multipart/form-data"]),

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Creates a variation of a given image.
%% 
-spec create_image_variation(binary()) ->
  openapi_utils:response().
create_image_variation(Image) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/images/variations"],
  Body        = {form, [{<<"image">>, Image]++openapi_utils:optional_params([, 'n', 'size', 'response_format', 'user'], _OptionalParams)},
  ContentType = hd(["multipart/form-data"]),

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Classifies if text violates OpenAI's Content Policy
%% 
-spec create_moderation(openapi_create_moderation_request:openapi_create_moderation_request()) ->
  openapi_utils:response().
create_moderation(OpenapiCreateModerationRequest) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/moderations"],
  Body        = OpenapiCreateModerationRequest,
  ContentType = hd(["application/json"]),

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Transcribes audio into the input language.
%% 
-spec create_transcription(binary(), openapi_create_transcription_request_model:openapi_create_transcription_request_model()) ->
  openapi_utils:response().
create_transcription(File, Model) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/audio/transcriptions"],
  Body        = {form, [{<<"file">>, File, {<<"model">>, Model]++openapi_utils:optional_params([, 'prompt', 'response_format', 'temperature', 'language'], _OptionalParams)},
  ContentType = hd(["multipart/form-data"]),

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Translates audio into English.
%% 
-spec create_translation(binary(), openapi_create_transcription_request_model:openapi_create_transcription_request_model()) ->
  openapi_utils:response().
create_translation(File, Model) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/audio/translations"],
  Body        = {form, [{<<"file">>, File, {<<"model">>, Model]++openapi_utils:optional_params([, 'prompt', 'response_format', 'temperature'], _OptionalParams)},
  ContentType = hd(["multipart/form-data"]),

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Delete a file.
%% 
-spec delete_file(binary()) ->
  openapi_utils:response().
delete_file(FileId) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/files/", FileId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Delete a fine-tuned model. You must have the Owner role in your organization.
%% 
-spec delete_model(binary()) ->
  openapi_utils:response().
delete_model(Model) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/models/", Model, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Returns the contents of the specified file
%% 
-spec download_file(binary()) ->
  openapi_utils:response().
download_file(FileId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/files/", FileId, "/content"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Returns a list of files that belong to the user's organization.
%% 
-spec list_files() ->
  openapi_utils:response().
list_files() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/files"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Get fine-grained status updates for a fine-tune job. 
%% 
-spec list_fine_tune_events(binary()) ->
  openapi_utils:response().
list_fine_tune_events(FineTuneId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/fine-tunes/", FineTuneId, "/events"],
  QueryString = [<<"stream=">>, Stream, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc List your organization's fine-tuning jobs 
%% 
-spec list_fine_tunes() ->
  openapi_utils:response().
list_fine_tunes() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/fine-tunes"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Lists the currently available models, and provides basic information about each one such as the owner and availability.
%% 
-spec list_models() ->
  openapi_utils:response().
list_models() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/models"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Returns information about a specific file.
%% 
-spec retrieve_file(binary()) ->
  openapi_utils:response().
retrieve_file(FileId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/files/", FileId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
%% 
-spec retrieve_fine_tune(binary()) ->
  openapi_utils:response().
retrieve_fine_tune(FineTuneId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/fine-tunes/", FineTuneId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
%% 
-spec retrieve_model(binary()) ->
  openapi_utils:response().
retrieve_model(Model) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/models/", Model, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

