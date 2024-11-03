-module(openapi_audio_api).

-export([create_speech/2, create_speech/3,
         create_transcription/3, create_transcription/4,
         create_translation/3, create_translation/4]).

-define(BASE_URL, <<"/v1">>).

%% @doc Generates audio from the input text.
%% 
-spec create_speech(ctx:ctx(), openapi_create_speech_request:openapi_create_speech_request()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_speech(Ctx, OpenapiCreateSpeechRequest) ->
    create_speech(Ctx, OpenapiCreateSpeechRequest, #{}).

-spec create_speech(ctx:ctx(), openapi_create_speech_request:openapi_create_speech_request(), maps:map()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_speech(Ctx, OpenapiCreateSpeechRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/audio/speech"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCreateSpeechRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Transcribes audio into the input language.
%% 
-spec create_transcription(ctx:ctx(), binary(), openapi_create_transcription_request_model:openapi_create_transcription_request_model()) -> {ok, openapi_create_transcription_200_response:openapi_create_transcription_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_transcription(Ctx, File, Model) ->
    create_transcription(Ctx, File, Model, #{}).

-spec create_transcription(ctx:ctx(), binary(), openapi_create_transcription_request_model:openapi_create_transcription_request_model(), maps:map()) -> {ok, openapi_create_transcription_200_response:openapi_create_transcription_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_transcription(Ctx, File, Model, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/audio/transcriptions"],
    QS = [],
    Headers = [],
    Body1 = {form, [{<<"file">>, File}, {<<"model">>, Model}]++openapi_utils:optional_params(['language', 'prompt', 'response_format', 'temperature', 'timestamp_granularities[]'], _OptionalParams)},
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"multipart/form-data">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Translates audio into English.
%% 
-spec create_translation(ctx:ctx(), binary(), openapi_create_transcription_request_model:openapi_create_transcription_request_model()) -> {ok, openapi_create_translation_200_response:openapi_create_translation_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_translation(Ctx, File, Model) ->
    create_translation(Ctx, File, Model, #{}).

-spec create_translation(ctx:ctx(), binary(), openapi_create_transcription_request_model:openapi_create_transcription_request_model(), maps:map()) -> {ok, openapi_create_translation_200_response:openapi_create_translation_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
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


