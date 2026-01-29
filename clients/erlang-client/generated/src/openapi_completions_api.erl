-module(openapi_completions_api).

-export([create_completion/2, create_completion/3]).

-define(BASE_URL, <<"/v1">>).

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


