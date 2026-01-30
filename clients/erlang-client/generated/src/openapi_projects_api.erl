-module(openapi_projects_api).

-export([archive_project/2, archive_project/3,
         create_project/2, create_project/3,
         create_project_service_account/3, create_project_service_account/4,
         create_project_user/3, create_project_user/4,
         delete_project_api_key/3, delete_project_api_key/4,
         delete_project_service_account/3, delete_project_service_account/4,
         delete_project_user/3, delete_project_user/4,
         list_project_api_keys/2, list_project_api_keys/3,
         list_project_rate_limits/2, list_project_rate_limits/3,
         list_project_service_accounts/2, list_project_service_accounts/3,
         list_project_users/2, list_project_users/3,
         list_projects/1, list_projects/2,
         modify_project/3, modify_project/4,
         modify_project_user/4, modify_project_user/5,
         retrieve_project/2, retrieve_project/3,
         retrieve_project_api_key/3, retrieve_project_api_key/4,
         retrieve_project_service_account/3, retrieve_project_service_account/4,
         retrieve_project_user/3, retrieve_project_user/4,
         update_project_rate_limits/4, update_project_rate_limits/5]).

-define(BASE_URL, <<"/v1">>).

%% @doc Archives a project in the organization. Archived projects cannot be used or updated.
%% 
-spec archive_project(ctx:ctx(), binary()) -> {ok, openapi_project:openapi_project(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
archive_project(Ctx, ProjectId) ->
    archive_project(Ctx, ProjectId, #{}).

-spec archive_project(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_project:openapi_project(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
archive_project(Ctx, ProjectId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/organization/projects/", ProjectId, "/archive"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
%% 
-spec create_project(ctx:ctx(), openapi_project_create_request:openapi_project_create_request()) -> {ok, openapi_project:openapi_project(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_project(Ctx, OpenapiProjectCreateRequest) ->
    create_project(Ctx, OpenapiProjectCreateRequest, #{}).

-spec create_project(ctx:ctx(), openapi_project_create_request:openapi_project_create_request(), maps:map()) -> {ok, openapi_project:openapi_project(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_project(Ctx, OpenapiProjectCreateRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/organization/projects"],
    QS = [],
    Headers = [],
    Body1 = OpenapiProjectCreateRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Creates a new service account in the project. This also returns an unredacted API key for the service account.
%% 
-spec create_project_service_account(ctx:ctx(), binary(), openapi_project_service_account_create_request:openapi_project_service_account_create_request()) -> {ok, openapi_project_service_account_create_response:openapi_project_service_account_create_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_project_service_account(Ctx, ProjectId, OpenapiProjectServiceAccountCreateRequest) ->
    create_project_service_account(Ctx, ProjectId, OpenapiProjectServiceAccountCreateRequest, #{}).

-spec create_project_service_account(ctx:ctx(), binary(), openapi_project_service_account_create_request:openapi_project_service_account_create_request(), maps:map()) -> {ok, openapi_project_service_account_create_response:openapi_project_service_account_create_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_project_service_account(Ctx, ProjectId, OpenapiProjectServiceAccountCreateRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/organization/projects/", ProjectId, "/service_accounts"],
    QS = [],
    Headers = [],
    Body1 = OpenapiProjectServiceAccountCreateRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Adds a user to the project. Users must already be members of the organization to be added to a project.
%% 
-spec create_project_user(ctx:ctx(), binary(), openapi_project_user_create_request:openapi_project_user_create_request()) -> {ok, openapi_project_user:openapi_project_user(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_project_user(Ctx, ProjectId, OpenapiProjectUserCreateRequest) ->
    create_project_user(Ctx, ProjectId, OpenapiProjectUserCreateRequest, #{}).

-spec create_project_user(ctx:ctx(), binary(), openapi_project_user_create_request:openapi_project_user_create_request(), maps:map()) -> {ok, openapi_project_user:openapi_project_user(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_project_user(Ctx, ProjectId, OpenapiProjectUserCreateRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/organization/projects/", ProjectId, "/users"],
    QS = [],
    Headers = [],
    Body1 = OpenapiProjectUserCreateRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Deletes an API key from the project.
%% 
-spec delete_project_api_key(ctx:ctx(), binary(), binary()) -> {ok, openapi_project_api_key_delete_response:openapi_project_api_key_delete_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_project_api_key(Ctx, ProjectId, KeyId) ->
    delete_project_api_key(Ctx, ProjectId, KeyId, #{}).

-spec delete_project_api_key(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_project_api_key_delete_response:openapi_project_api_key_delete_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_project_api_key(Ctx, ProjectId, KeyId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/organization/projects/", ProjectId, "/api_keys/", KeyId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Deletes a service account from the project.
%% 
-spec delete_project_service_account(ctx:ctx(), binary(), binary()) -> {ok, openapi_project_service_account_delete_response:openapi_project_service_account_delete_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_project_service_account(Ctx, ProjectId, ServiceAccountId) ->
    delete_project_service_account(Ctx, ProjectId, ServiceAccountId, #{}).

-spec delete_project_service_account(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_project_service_account_delete_response:openapi_project_service_account_delete_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_project_service_account(Ctx, ProjectId, ServiceAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/organization/projects/", ProjectId, "/service_accounts/", ServiceAccountId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Deletes a user from the project.
%% 
-spec delete_project_user(ctx:ctx(), binary(), binary()) -> {ok, openapi_project_user_delete_response:openapi_project_user_delete_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_project_user(Ctx, ProjectId, UserId) ->
    delete_project_user(Ctx, ProjectId, UserId, #{}).

-spec delete_project_user(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_project_user_delete_response:openapi_project_user_delete_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_project_user(Ctx, ProjectId, UserId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/organization/projects/", ProjectId, "/users/", UserId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Returns a list of API keys in the project.
%% 
-spec list_project_api_keys(ctx:ctx(), binary()) -> {ok, openapi_project_api_key_list_response:openapi_project_api_key_list_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_project_api_keys(Ctx, ProjectId) ->
    list_project_api_keys(Ctx, ProjectId, #{}).

-spec list_project_api_keys(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_project_api_key_list_response:openapi_project_api_key_list_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_project_api_keys(Ctx, ProjectId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/organization/projects/", ProjectId, "/api_keys"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'after'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Returns the rate limits per model for a project.
%% 
-spec list_project_rate_limits(ctx:ctx(), binary()) -> {ok, openapi_project_rate_limit_list_response:openapi_project_rate_limit_list_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_project_rate_limits(Ctx, ProjectId) ->
    list_project_rate_limits(Ctx, ProjectId, #{}).

-spec list_project_rate_limits(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_project_rate_limit_list_response:openapi_project_rate_limit_list_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_project_rate_limits(Ctx, ProjectId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/organization/projects/", ProjectId, "/rate_limits"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'after', 'before'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Returns a list of service accounts in the project.
%% 
-spec list_project_service_accounts(ctx:ctx(), binary()) -> {ok, openapi_project_service_account_list_response:openapi_project_service_account_list_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_project_service_accounts(Ctx, ProjectId) ->
    list_project_service_accounts(Ctx, ProjectId, #{}).

-spec list_project_service_accounts(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_project_service_account_list_response:openapi_project_service_account_list_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_project_service_accounts(Ctx, ProjectId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/organization/projects/", ProjectId, "/service_accounts"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'after'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Returns a list of users in the project.
%% 
-spec list_project_users(ctx:ctx(), binary()) -> {ok, openapi_project_user_list_response:openapi_project_user_list_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_project_users(Ctx, ProjectId) ->
    list_project_users(Ctx, ProjectId, #{}).

-spec list_project_users(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_project_user_list_response:openapi_project_user_list_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_project_users(Ctx, ProjectId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/organization/projects/", ProjectId, "/users"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'after'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Returns a list of projects.
%% 
-spec list_projects(ctx:ctx()) -> {ok, openapi_project_list_response:openapi_project_list_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_projects(Ctx) ->
    list_projects(Ctx, #{}).

-spec list_projects(ctx:ctx(), maps:map()) -> {ok, openapi_project_list_response:openapi_project_list_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_projects(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/organization/projects"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'after', 'include_archived'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Modifies a project in the organization.
%% 
-spec modify_project(ctx:ctx(), binary(), openapi_project_update_request:openapi_project_update_request()) -> {ok, openapi_project:openapi_project(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
modify_project(Ctx, ProjectId, OpenapiProjectUpdateRequest) ->
    modify_project(Ctx, ProjectId, OpenapiProjectUpdateRequest, #{}).

-spec modify_project(ctx:ctx(), binary(), openapi_project_update_request:openapi_project_update_request(), maps:map()) -> {ok, openapi_project:openapi_project(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
modify_project(Ctx, ProjectId, OpenapiProjectUpdateRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/organization/projects/", ProjectId, ""],
    QS = [],
    Headers = [],
    Body1 = OpenapiProjectUpdateRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Modifies a user's role in the project.
%% 
-spec modify_project_user(ctx:ctx(), binary(), binary(), openapi_project_user_update_request:openapi_project_user_update_request()) -> {ok, openapi_project_user:openapi_project_user(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
modify_project_user(Ctx, ProjectId, UserId, OpenapiProjectUserUpdateRequest) ->
    modify_project_user(Ctx, ProjectId, UserId, OpenapiProjectUserUpdateRequest, #{}).

-spec modify_project_user(ctx:ctx(), binary(), binary(), openapi_project_user_update_request:openapi_project_user_update_request(), maps:map()) -> {ok, openapi_project_user:openapi_project_user(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
modify_project_user(Ctx, ProjectId, UserId, OpenapiProjectUserUpdateRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/organization/projects/", ProjectId, "/users/", UserId, ""],
    QS = [],
    Headers = [],
    Body1 = OpenapiProjectUserUpdateRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieves a project.
%% 
-spec retrieve_project(ctx:ctx(), binary()) -> {ok, openapi_project:openapi_project(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
retrieve_project(Ctx, ProjectId) ->
    retrieve_project(Ctx, ProjectId, #{}).

-spec retrieve_project(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_project:openapi_project(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
retrieve_project(Ctx, ProjectId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/organization/projects/", ProjectId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieves an API key in the project.
%% 
-spec retrieve_project_api_key(ctx:ctx(), binary(), binary()) -> {ok, openapi_project_api_key:openapi_project_api_key(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
retrieve_project_api_key(Ctx, ProjectId, KeyId) ->
    retrieve_project_api_key(Ctx, ProjectId, KeyId, #{}).

-spec retrieve_project_api_key(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_project_api_key:openapi_project_api_key(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
retrieve_project_api_key(Ctx, ProjectId, KeyId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/organization/projects/", ProjectId, "/api_keys/", KeyId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieves a service account in the project.
%% 
-spec retrieve_project_service_account(ctx:ctx(), binary(), binary()) -> {ok, openapi_project_service_account:openapi_project_service_account(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
retrieve_project_service_account(Ctx, ProjectId, ServiceAccountId) ->
    retrieve_project_service_account(Ctx, ProjectId, ServiceAccountId, #{}).

-spec retrieve_project_service_account(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_project_service_account:openapi_project_service_account(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
retrieve_project_service_account(Ctx, ProjectId, ServiceAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/organization/projects/", ProjectId, "/service_accounts/", ServiceAccountId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieves a user in the project.
%% 
-spec retrieve_project_user(ctx:ctx(), binary(), binary()) -> {ok, openapi_project_user:openapi_project_user(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
retrieve_project_user(Ctx, ProjectId, UserId) ->
    retrieve_project_user(Ctx, ProjectId, UserId, #{}).

-spec retrieve_project_user(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_project_user:openapi_project_user(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
retrieve_project_user(Ctx, ProjectId, UserId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/organization/projects/", ProjectId, "/users/", UserId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Updates a project rate limit.
%% 
-spec update_project_rate_limits(ctx:ctx(), binary(), binary(), openapi_project_rate_limit_update_request:openapi_project_rate_limit_update_request()) -> {ok, openapi_project_rate_limit:openapi_project_rate_limit(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_project_rate_limits(Ctx, ProjectId, RateLimitId, OpenapiProjectRateLimitUpdateRequest) ->
    update_project_rate_limits(Ctx, ProjectId, RateLimitId, OpenapiProjectRateLimitUpdateRequest, #{}).

-spec update_project_rate_limits(ctx:ctx(), binary(), binary(), openapi_project_rate_limit_update_request:openapi_project_rate_limit_update_request(), maps:map()) -> {ok, openapi_project_rate_limit:openapi_project_rate_limit(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_project_rate_limits(Ctx, ProjectId, RateLimitId, OpenapiProjectRateLimitUpdateRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/organization/projects/", ProjectId, "/rate_limits/", RateLimitId, ""],
    QS = [],
    Headers = [],
    Body1 = OpenapiProjectRateLimitUpdateRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


