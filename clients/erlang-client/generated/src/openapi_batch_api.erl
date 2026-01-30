-module(openapi_batch_api).

-export([cancel_batch/2, cancel_batch/3,
         create_batch/2, create_batch/3,
         list_batches/1, list_batches/2,
         retrieve_batch/2, retrieve_batch/3]).

-define(BASE_URL, <<"/v1">>).

%% @doc Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
%% 
-spec cancel_batch(ctx:ctx(), binary()) -> {ok, openapi_batch:openapi_batch(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
cancel_batch(Ctx, BatchId) ->
    cancel_batch(Ctx, BatchId, #{}).

-spec cancel_batch(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_batch:openapi_batch(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
cancel_batch(Ctx, BatchId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/batches/", BatchId, "/cancel"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Creates and executes a batch from an uploaded file of requests
%% 
-spec create_batch(ctx:ctx(), openapi_create_batch_request:openapi_create_batch_request()) -> {ok, openapi_batch:openapi_batch(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_batch(Ctx, OpenapiCreateBatchRequest) ->
    create_batch(Ctx, OpenapiCreateBatchRequest, #{}).

-spec create_batch(ctx:ctx(), openapi_create_batch_request:openapi_create_batch_request(), maps:map()) -> {ok, openapi_batch:openapi_batch(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_batch(Ctx, OpenapiCreateBatchRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/batches"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCreateBatchRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List your organization's batches.
%% 
-spec list_batches(ctx:ctx()) -> {ok, openapi_list_batches_response:openapi_list_batches_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_batches(Ctx) ->
    list_batches(Ctx, #{}).

-spec list_batches(ctx:ctx(), maps:map()) -> {ok, openapi_list_batches_response:openapi_list_batches_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_batches(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/batches"],
    QS = lists:flatten([])++openapi_utils:optional_params(['after', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieves a batch.
%% 
-spec retrieve_batch(ctx:ctx(), binary()) -> {ok, openapi_batch:openapi_batch(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
retrieve_batch(Ctx, BatchId) ->
    retrieve_batch(Ctx, BatchId, #{}).

-spec retrieve_batch(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_batch:openapi_batch(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
retrieve_batch(Ctx, BatchId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/batches/", BatchId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


