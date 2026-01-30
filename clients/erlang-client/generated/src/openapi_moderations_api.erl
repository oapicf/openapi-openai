-module(openapi_moderations_api).

-export([create_moderation/2, create_moderation/3]).

-define(BASE_URL, <<"/v1">>).

%% @doc Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 
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


