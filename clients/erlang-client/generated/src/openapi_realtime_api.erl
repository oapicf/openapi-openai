-module(openapi_realtime_api).

-export([create_realtime_session/2, create_realtime_session/3]).

-define(BASE_URL, <<"/v1">>).

%% @doc Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
%% 
-spec create_realtime_session(ctx:ctx(), openapi_realtime_session_create_request:openapi_realtime_session_create_request()) -> {ok, openapi_realtime_session_create_response:openapi_realtime_session_create_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_realtime_session(Ctx, OpenapiRealtimeSessionCreateRequest) ->
    create_realtime_session(Ctx, OpenapiRealtimeSessionCreateRequest, #{}).

-spec create_realtime_session(ctx:ctx(), openapi_realtime_session_create_request:openapi_realtime_session_create_request(), maps:map()) -> {ok, openapi_realtime_session_create_response:openapi_realtime_session_create_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_realtime_session(Ctx, OpenapiRealtimeSessionCreateRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/realtime/sessions"],
    QS = [],
    Headers = [],
    Body1 = OpenapiRealtimeSessionCreateRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


