-module(openapi_open_ai_api).

-export([cancel_fine_tune/2, cancel_fine_tune/3,
         create_chat_completion/2, create_chat_completion/3,
         create_completion/2, create_completion/3,
         create_edit/2, create_edit/3,
         create_embedding/2, create_embedding/3,
         create_file/3, create_file/4,
         create_fine_tune/2, create_fine_tune/3,
         create_image/2, create_image/3,
         create_image_edit/3, create_image_edit/4,
         create_image_variation/2, create_image_variation/3,
         create_moderation/2, create_moderation/3,
         create_transcription/3, create_transcription/4,
         create_translation/3, create_translation/4,
         delete_file/2, delete_file/3,
         delete_model/2, delete_model/3,
         download_file/2, download_file/3,
         list_files/1, list_files/2,
         list_fine_tune_events/2, list_fine_tune_events/3,
         list_fine_tunes/1, list_fine_tunes/2,
         list_models/1, list_models/2,
         retrieve_file/2, retrieve_file/3,
         retrieve_fine_tune/2, retrieve_fine_tune/3,
         retrieve_model/2, retrieve_model/3]).

-define(BASE_URL, <<"/v1">>).

%% @doc Immediately cancel a fine-tune job. 
%% 
-spec cancel_fine_tune(ctx:ctx(), binary()) -> {ok, openapi_fine_tune:openapi_fine_tune(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
cancel_fine_tune(Ctx, FineTuneId) ->
    cancel_fine_tune(Ctx, FineTuneId, #{}).

-spec cancel_fine_tune(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_fine_tune:openapi_fine_tune(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
cancel_fine_tune(Ctx, FineTuneId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/fine-tunes/", FineTuneId, "/cancel"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Creates a model response for the given chat conversation.
%% 
-spec create_chat_completion(ctx:ctx(), openapi_create_chat_completion_request:openapi_create_chat_completion_request()) -> {ok, openapi_create_chat_completion_response:openapi_create_chat_completion_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_chat_completion(Ctx, OpenapiCreateChatCompletionRequest) ->
    create_chat_completion(Ctx, OpenapiCreateChatCompletionRequest, #{}).

-spec create_chat_completion(ctx:ctx(), openapi_create_chat_completion_request:openapi_create_chat_completion_request(), maps:map()) -> {ok, openapi_create_chat_completion_response:openapi_create_chat_completion_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_chat_completion(Ctx, OpenapiCreateChatCompletionRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/chat/completions"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCreateChatCompletionRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Creates a completion for the provided prompt and parameters.
%% 
-spec create_completion(ctx:ctx(), openapi_create_completion_request:openapi_create_completion_request()) -> {ok, openapi_create_completion_response:openapi_create_completion_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_completion(Ctx, OpenapiCreateCompletionRequest) ->
    create_completion(Ctx, OpenapiCreateCompletionRequest, #{}).

-spec create_completion(ctx:ctx(), openapi_create_completion_request:openapi_create_completion_request(), maps:map()) -> {ok, openapi_create_completion_response:openapi_create_completion_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_completion(Ctx, OpenapiCreateCompletionRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/completions"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCreateCompletionRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Creates a new edit for the provided input, instruction, and parameters.
%% 
-spec create_edit(ctx:ctx(), openapi_create_edit_request:openapi_create_edit_request()) -> {ok, openapi_create_edit_response:openapi_create_edit_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_edit(Ctx, OpenapiCreateEditRequest) ->
    create_edit(Ctx, OpenapiCreateEditRequest, #{}).

-spec create_edit(ctx:ctx(), openapi_create_edit_request:openapi_create_edit_request(), maps:map()) -> {ok, openapi_create_edit_response:openapi_create_edit_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_edit(Ctx, OpenapiCreateEditRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/edits"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCreateEditRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Creates an embedding vector representing the input text.
%% 
-spec create_embedding(ctx:ctx(), openapi_create_embedding_request:openapi_create_embedding_request()) -> {ok, openapi_create_embedding_response:openapi_create_embedding_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_embedding(Ctx, OpenapiCreateEmbeddingRequest) ->
    create_embedding(Ctx, OpenapiCreateEmbeddingRequest, #{}).

-spec create_embedding(ctx:ctx(), openapi_create_embedding_request:openapi_create_embedding_request(), maps:map()) -> {ok, openapi_create_embedding_response:openapi_create_embedding_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_embedding(Ctx, OpenapiCreateEmbeddingRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/embeddings"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCreateEmbeddingRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
%% 
-spec create_file(ctx:ctx(), binary(), binary()) -> {ok, openapi_open_ai_file:openapi_open_ai_file(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_file(Ctx, File, Purpose) ->
    create_file(Ctx, File, Purpose, #{}).

-spec create_file(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_open_ai_file:openapi_open_ai_file(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_file(Ctx, File, Purpose, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/files"],
    QS = [],
    Headers = [],
    Body1 = {form, [{<<"file">>, File}, {<<"purpose">>, Purpose}]++openapi_utils:optional_params([], _OptionalParams)},
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"multipart/form-data">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
%% 
-spec create_fine_tune(ctx:ctx(), openapi_create_fine_tune_request:openapi_create_fine_tune_request()) -> {ok, openapi_fine_tune:openapi_fine_tune(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_fine_tune(Ctx, OpenapiCreateFineTuneRequest) ->
    create_fine_tune(Ctx, OpenapiCreateFineTuneRequest, #{}).

-spec create_fine_tune(ctx:ctx(), openapi_create_fine_tune_request:openapi_create_fine_tune_request(), maps:map()) -> {ok, openapi_fine_tune:openapi_fine_tune(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_fine_tune(Ctx, OpenapiCreateFineTuneRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/fine-tunes"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCreateFineTuneRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Creates an image given a prompt.
%% 
-spec create_image(ctx:ctx(), openapi_create_image_request:openapi_create_image_request()) -> {ok, openapi_images_response:openapi_images_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_image(Ctx, OpenapiCreateImageRequest) ->
    create_image(Ctx, OpenapiCreateImageRequest, #{}).

-spec create_image(ctx:ctx(), openapi_create_image_request:openapi_create_image_request(), maps:map()) -> {ok, openapi_images_response:openapi_images_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_image(Ctx, OpenapiCreateImageRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/images/generations"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCreateImageRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Creates an edited or extended image given an original image and a prompt.
%% 
-spec create_image_edit(ctx:ctx(), binary(), binary()) -> {ok, openapi_images_response:openapi_images_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_image_edit(Ctx, Image, Prompt) ->
    create_image_edit(Ctx, Image, Prompt, #{}).

-spec create_image_edit(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_images_response:openapi_images_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_image_edit(Ctx, Image, Prompt, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/images/edits"],
    QS = [],
    Headers = [],
    Body1 = {form, [{<<"image">>, Image}, {<<"prompt">>, Prompt}]++openapi_utils:optional_params(['mask', 'n', 'size', 'response_format', 'user'], _OptionalParams)},
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"multipart/form-data">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Creates a variation of a given image.
%% 
-spec create_image_variation(ctx:ctx(), binary()) -> {ok, openapi_images_response:openapi_images_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_image_variation(Ctx, Image) ->
    create_image_variation(Ctx, Image, #{}).

-spec create_image_variation(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_images_response:openapi_images_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_image_variation(Ctx, Image, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/images/variations"],
    QS = [],
    Headers = [],
    Body1 = {form, [{<<"image">>, Image}]++openapi_utils:optional_params(['n', 'size', 'response_format', 'user'], _OptionalParams)},
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"multipart/form-data">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Classifies if text violates OpenAI's Content Policy
%% 
-spec create_moderation(ctx:ctx(), openapi_create_moderation_request:openapi_create_moderation_request()) -> {ok, openapi_create_moderation_response:openapi_create_moderation_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_moderation(Ctx, OpenapiCreateModerationRequest) ->
    create_moderation(Ctx, OpenapiCreateModerationRequest, #{}).

-spec create_moderation(ctx:ctx(), openapi_create_moderation_request:openapi_create_moderation_request(), maps:map()) -> {ok, openapi_create_moderation_response:openapi_create_moderation_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_moderation(Ctx, OpenapiCreateModerationRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/moderations"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCreateModerationRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Transcribes audio into the input language.
%% 
-spec create_transcription(ctx:ctx(), binary(), openapi_create_transcription_request_model:openapi_create_transcription_request_model()) -> {ok, openapi_create_transcription_response:openapi_create_transcription_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_transcription(Ctx, File, Model) ->
    create_transcription(Ctx, File, Model, #{}).

-spec create_transcription(ctx:ctx(), binary(), openapi_create_transcription_request_model:openapi_create_transcription_request_model(), maps:map()) -> {ok, openapi_create_transcription_response:openapi_create_transcription_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_transcription(Ctx, File, Model, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/audio/transcriptions"],
    QS = [],
    Headers = [],
    Body1 = {form, [{<<"file">>, File}, {<<"model">>, Model}]++openapi_utils:optional_params(['prompt', 'response_format', 'temperature', 'language'], _OptionalParams)},
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"multipart/form-data">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Translates audio into English.
%% 
-spec create_translation(ctx:ctx(), binary(), openapi_create_transcription_request_model:openapi_create_transcription_request_model()) -> {ok, openapi_create_translation_response:openapi_create_translation_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_translation(Ctx, File, Model) ->
    create_translation(Ctx, File, Model, #{}).

-spec create_translation(ctx:ctx(), binary(), openapi_create_transcription_request_model:openapi_create_transcription_request_model(), maps:map()) -> {ok, openapi_create_translation_response:openapi_create_translation_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_translation(Ctx, File, Model, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/audio/translations"],
    QS = [],
    Headers = [],
    Body1 = {form, [{<<"file">>, File}, {<<"model">>, Model}]++openapi_utils:optional_params(['prompt', 'response_format', 'temperature'], _OptionalParams)},
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"multipart/form-data">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete a file.
%% 
-spec delete_file(ctx:ctx(), binary()) -> {ok, openapi_delete_file_response:openapi_delete_file_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_file(Ctx, FileId) ->
    delete_file(Ctx, FileId, #{}).

-spec delete_file(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_delete_file_response:openapi_delete_file_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_file(Ctx, FileId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/files/", FileId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete a fine-tuned model. You must have the Owner role in your organization.
%% 
-spec delete_model(ctx:ctx(), binary()) -> {ok, openapi_delete_model_response:openapi_delete_model_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_model(Ctx, Model) ->
    delete_model(Ctx, Model, #{}).

-spec delete_model(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_delete_model_response:openapi_delete_model_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_model(Ctx, Model, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/models/", Model, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Returns the contents of the specified file
%% 
-spec download_file(ctx:ctx(), binary()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
download_file(Ctx, FileId) ->
    download_file(Ctx, FileId, #{}).

-spec download_file(ctx:ctx(), binary(), maps:map()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
download_file(Ctx, FileId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/files/", FileId, "/content"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Returns a list of files that belong to the user's organization.
%% 
-spec list_files(ctx:ctx()) -> {ok, openapi_list_files_response:openapi_list_files_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_files(Ctx) ->
    list_files(Ctx, #{}).

-spec list_files(ctx:ctx(), maps:map()) -> {ok, openapi_list_files_response:openapi_list_files_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_files(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/files"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get fine-grained status updates for a fine-tune job. 
%% 
-spec list_fine_tune_events(ctx:ctx(), binary()) -> {ok, openapi_list_fine_tune_events_response:openapi_list_fine_tune_events_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_fine_tune_events(Ctx, FineTuneId) ->
    list_fine_tune_events(Ctx, FineTuneId, #{}).

-spec list_fine_tune_events(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_list_fine_tune_events_response:openapi_list_fine_tune_events_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_fine_tune_events(Ctx, FineTuneId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/fine-tunes/", FineTuneId, "/events"],
    QS = lists:flatten([])++openapi_utils:optional_params(['stream'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List your organization's fine-tuning jobs 
%% 
-spec list_fine_tunes(ctx:ctx()) -> {ok, openapi_list_fine_tunes_response:openapi_list_fine_tunes_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_fine_tunes(Ctx) ->
    list_fine_tunes(Ctx, #{}).

-spec list_fine_tunes(ctx:ctx(), maps:map()) -> {ok, openapi_list_fine_tunes_response:openapi_list_fine_tunes_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_fine_tunes(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/fine-tunes"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Lists the currently available models, and provides basic information about each one such as the owner and availability.
%% 
-spec list_models(ctx:ctx()) -> {ok, openapi_list_models_response:openapi_list_models_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_models(Ctx) ->
    list_models(Ctx, #{}).

-spec list_models(ctx:ctx(), maps:map()) -> {ok, openapi_list_models_response:openapi_list_models_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_models(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/models"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Returns information about a specific file.
%% 
-spec retrieve_file(ctx:ctx(), binary()) -> {ok, openapi_open_ai_file:openapi_open_ai_file(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
retrieve_file(Ctx, FileId) ->
    retrieve_file(Ctx, FileId, #{}).

-spec retrieve_file(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_open_ai_file:openapi_open_ai_file(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
retrieve_file(Ctx, FileId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/files/", FileId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
%% 
-spec retrieve_fine_tune(ctx:ctx(), binary()) -> {ok, openapi_fine_tune:openapi_fine_tune(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
retrieve_fine_tune(Ctx, FineTuneId) ->
    retrieve_fine_tune(Ctx, FineTuneId, #{}).

-spec retrieve_fine_tune(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_fine_tune:openapi_fine_tune(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
retrieve_fine_tune(Ctx, FineTuneId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/fine-tunes/", FineTuneId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
%% 
-spec retrieve_model(ctx:ctx(), binary()) -> {ok, openapi_model:openapi_model(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
retrieve_model(Ctx, Model) ->
    retrieve_model(Ctx, Model, #{}).

-spec retrieve_model(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_model:openapi_model(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
retrieve_model(Ctx, Model, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/models/", Model, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


