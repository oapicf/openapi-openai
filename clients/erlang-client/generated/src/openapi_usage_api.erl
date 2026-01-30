-module(openapi_usage_api).

-export([usage_audio_speeches/2, usage_audio_speeches/3,
         usage_audio_transcriptions/2, usage_audio_transcriptions/3,
         usage_code_interpreter_sessions/2, usage_code_interpreter_sessions/3,
         usage_completions/2, usage_completions/3,
         usage_costs/2, usage_costs/3,
         usage_embeddings/2, usage_embeddings/3,
         usage_images/2, usage_images/3,
         usage_moderations/2, usage_moderations/3,
         usage_vector_stores/2, usage_vector_stores/3]).

-define(BASE_URL, <<"/v1">>).

%% @doc Get audio speeches usage details for the organization.
%% 
-spec usage_audio_speeches(ctx:ctx(), integer()) -> {ok, openapi_usage_response:openapi_usage_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
usage_audio_speeches(Ctx, StartTime) ->
    usage_audio_speeches(Ctx, StartTime, #{}).

-spec usage_audio_speeches(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_usage_response:openapi_usage_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
usage_audio_speeches(Ctx, StartTime, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/organization/usage/audio_speeches"],
    QS = lists:flatten([{<<"start_time">>, StartTime}])++openapi_utils:optional_params(['end_time', 'bucket_width', 'project_ids', 'user_ids', 'api_key_ids', 'models', 'group_by', 'limit', 'page'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get audio transcriptions usage details for the organization.
%% 
-spec usage_audio_transcriptions(ctx:ctx(), integer()) -> {ok, openapi_usage_response:openapi_usage_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
usage_audio_transcriptions(Ctx, StartTime) ->
    usage_audio_transcriptions(Ctx, StartTime, #{}).

-spec usage_audio_transcriptions(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_usage_response:openapi_usage_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
usage_audio_transcriptions(Ctx, StartTime, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/organization/usage/audio_transcriptions"],
    QS = lists:flatten([{<<"start_time">>, StartTime}])++openapi_utils:optional_params(['end_time', 'bucket_width', 'project_ids', 'user_ids', 'api_key_ids', 'models', 'group_by', 'limit', 'page'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get code interpreter sessions usage details for the organization.
%% 
-spec usage_code_interpreter_sessions(ctx:ctx(), integer()) -> {ok, openapi_usage_response:openapi_usage_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
usage_code_interpreter_sessions(Ctx, StartTime) ->
    usage_code_interpreter_sessions(Ctx, StartTime, #{}).

-spec usage_code_interpreter_sessions(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_usage_response:openapi_usage_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
usage_code_interpreter_sessions(Ctx, StartTime, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/organization/usage/code_interpreter_sessions"],
    QS = lists:flatten([{<<"start_time">>, StartTime}])++openapi_utils:optional_params(['end_time', 'bucket_width', 'project_ids', 'group_by', 'limit', 'page'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get completions usage details for the organization.
%% 
-spec usage_completions(ctx:ctx(), integer()) -> {ok, openapi_usage_response:openapi_usage_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
usage_completions(Ctx, StartTime) ->
    usage_completions(Ctx, StartTime, #{}).

-spec usage_completions(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_usage_response:openapi_usage_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
usage_completions(Ctx, StartTime, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/organization/usage/completions"],
    QS = lists:flatten([{<<"start_time">>, StartTime}])++openapi_utils:optional_params(['end_time', 'bucket_width', 'project_ids', 'user_ids', 'api_key_ids', 'models', 'batch', 'group_by', 'limit', 'page'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get costs details for the organization.
%% 
-spec usage_costs(ctx:ctx(), integer()) -> {ok, openapi_usage_response:openapi_usage_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
usage_costs(Ctx, StartTime) ->
    usage_costs(Ctx, StartTime, #{}).

-spec usage_costs(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_usage_response:openapi_usage_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
usage_costs(Ctx, StartTime, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/organization/costs"],
    QS = lists:flatten([{<<"start_time">>, StartTime}])++openapi_utils:optional_params(['end_time', 'bucket_width', 'project_ids', 'group_by', 'limit', 'page'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get embeddings usage details for the organization.
%% 
-spec usage_embeddings(ctx:ctx(), integer()) -> {ok, openapi_usage_response:openapi_usage_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
usage_embeddings(Ctx, StartTime) ->
    usage_embeddings(Ctx, StartTime, #{}).

-spec usage_embeddings(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_usage_response:openapi_usage_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
usage_embeddings(Ctx, StartTime, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/organization/usage/embeddings"],
    QS = lists:flatten([{<<"start_time">>, StartTime}])++openapi_utils:optional_params(['end_time', 'bucket_width', 'project_ids', 'user_ids', 'api_key_ids', 'models', 'group_by', 'limit', 'page'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get images usage details for the organization.
%% 
-spec usage_images(ctx:ctx(), integer()) -> {ok, openapi_usage_response:openapi_usage_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
usage_images(Ctx, StartTime) ->
    usage_images(Ctx, StartTime, #{}).

-spec usage_images(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_usage_response:openapi_usage_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
usage_images(Ctx, StartTime, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/organization/usage/images"],
    QS = lists:flatten([{<<"start_time">>, StartTime}])++openapi_utils:optional_params(['end_time', 'bucket_width', 'sources', 'sizes', 'project_ids', 'user_ids', 'api_key_ids', 'models', 'group_by', 'limit', 'page'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get moderations usage details for the organization.
%% 
-spec usage_moderations(ctx:ctx(), integer()) -> {ok, openapi_usage_response:openapi_usage_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
usage_moderations(Ctx, StartTime) ->
    usage_moderations(Ctx, StartTime, #{}).

-spec usage_moderations(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_usage_response:openapi_usage_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
usage_moderations(Ctx, StartTime, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/organization/usage/moderations"],
    QS = lists:flatten([{<<"start_time">>, StartTime}])++openapi_utils:optional_params(['end_time', 'bucket_width', 'project_ids', 'user_ids', 'api_key_ids', 'models', 'group_by', 'limit', 'page'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get vector stores usage details for the organization.
%% 
-spec usage_vector_stores(ctx:ctx(), integer()) -> {ok, openapi_usage_response:openapi_usage_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
usage_vector_stores(Ctx, StartTime) ->
    usage_vector_stores(Ctx, StartTime, #{}).

-spec usage_vector_stores(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_usage_response:openapi_usage_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
usage_vector_stores(Ctx, StartTime, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/organization/usage/vector_stores"],
    QS = lists:flatten([{<<"start_time">>, StartTime}])++openapi_utils:optional_params(['end_time', 'bucket_width', 'project_ids', 'group_by', 'limit', 'page'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


