-module(openapi_default_api).

-export([admin_api_keys_create/2, admin_api_keys_create/3,
         admin_api_keys_delete/2, admin_api_keys_delete/3,
         admin_api_keys_get/2, admin_api_keys_get/3,
         admin_api_keys_list/1, admin_api_keys_list/2]).

-define(BASE_URL, <<"/v1">>).

%% @doc Create an organization admin API key
%% Create a new admin-level API key for the organization.
-spec admin_api_keys_create(ctx:ctx(), openapi_admin_api_keys_create_request:openapi_admin_api_keys_create_request()) -> {ok, openapi_admin_api_key:openapi_admin_api_key(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
admin_api_keys_create(Ctx, OpenapiAdminApiKeysCreateRequest) ->
    admin_api_keys_create(Ctx, OpenapiAdminApiKeysCreateRequest, #{}).

-spec admin_api_keys_create(ctx:ctx(), openapi_admin_api_keys_create_request:openapi_admin_api_keys_create_request(), maps:map()) -> {ok, openapi_admin_api_key:openapi_admin_api_key(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
admin_api_keys_create(Ctx, OpenapiAdminApiKeysCreateRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/organization/admin_api_keys"],
    QS = [],
    Headers = [],
    Body1 = OpenapiAdminApiKeysCreateRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete an organization admin API key
%% Delete the specified admin API key.
-spec admin_api_keys_delete(ctx:ctx(), binary()) -> {ok, openapi_admin_api_keys_delete_200_response:openapi_admin_api_keys_delete_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
admin_api_keys_delete(Ctx, KeyId) ->
    admin_api_keys_delete(Ctx, KeyId, #{}).

-spec admin_api_keys_delete(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_admin_api_keys_delete_200_response:openapi_admin_api_keys_delete_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
admin_api_keys_delete(Ctx, KeyId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/organization/admin_api_keys/", KeyId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve a single organization API key
%% Get details for a specific organization API key by its ID.
-spec admin_api_keys_get(ctx:ctx(), binary()) -> {ok, openapi_admin_api_key:openapi_admin_api_key(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
admin_api_keys_get(Ctx, KeyId) ->
    admin_api_keys_get(Ctx, KeyId, #{}).

-spec admin_api_keys_get(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_admin_api_key:openapi_admin_api_key(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
admin_api_keys_get(Ctx, KeyId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/organization/admin_api_keys/", KeyId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List organization API keys
%% Retrieve a paginated list of organization admin API keys.
-spec admin_api_keys_list(ctx:ctx()) -> {ok, openapi_api_key_list:openapi_api_key_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
admin_api_keys_list(Ctx) ->
    admin_api_keys_list(Ctx, #{}).

-spec admin_api_keys_list(ctx:ctx(), maps:map()) -> {ok, openapi_api_key_list:openapi_api_key_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
admin_api_keys_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/organization/admin_api_keys"],
    QS = lists:flatten([])++openapi_utils:optional_params(['after', 'order', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


