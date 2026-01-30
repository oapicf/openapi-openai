-module(openapi_users_api).

-export([delete_user/2, delete_user/3,
         list_users/1, list_users/2,
         modify_user/3, modify_user/4,
         retrieve_user/2, retrieve_user/3]).

-define(BASE_URL, <<"/v1">>).

%% @doc Deletes a user from the organization.
%% 
-spec delete_user(ctx:ctx(), binary()) -> {ok, openapi_user_delete_response:openapi_user_delete_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_user(Ctx, UserId) ->
    delete_user(Ctx, UserId, #{}).

-spec delete_user(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_user_delete_response:openapi_user_delete_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_user(Ctx, UserId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/organization/users/", UserId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Lists all of the users in the organization.
%% 
-spec list_users(ctx:ctx()) -> {ok, openapi_user_list_response:openapi_user_list_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_users(Ctx) ->
    list_users(Ctx, #{}).

-spec list_users(ctx:ctx(), maps:map()) -> {ok, openapi_user_list_response:openapi_user_list_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_users(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/organization/users"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'after'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Modifies a user's role in the organization.
%% 
-spec modify_user(ctx:ctx(), binary(), openapi_user_role_update_request:openapi_user_role_update_request()) -> {ok, openapi_user:openapi_user(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
modify_user(Ctx, UserId, OpenapiUserRoleUpdateRequest) ->
    modify_user(Ctx, UserId, OpenapiUserRoleUpdateRequest, #{}).

-spec modify_user(ctx:ctx(), binary(), openapi_user_role_update_request:openapi_user_role_update_request(), maps:map()) -> {ok, openapi_user:openapi_user(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
modify_user(Ctx, UserId, OpenapiUserRoleUpdateRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/organization/users/", UserId, ""],
    QS = [],
    Headers = [],
    Body1 = OpenapiUserRoleUpdateRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieves a user by their identifier.
%% 
-spec retrieve_user(ctx:ctx(), binary()) -> {ok, openapi_user:openapi_user(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
retrieve_user(Ctx, UserId) ->
    retrieve_user(Ctx, UserId, #{}).

-spec retrieve_user(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_user:openapi_user(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
retrieve_user(Ctx, UserId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/organization/users/", UserId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


