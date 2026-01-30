-module(openapi_invites_api).

-export([delete_invite/2, delete_invite/3,
         invite_user/2, invite_user/3,
         list_invites/1, list_invites/2,
         retrieve_invite/2, retrieve_invite/3]).

-define(BASE_URL, <<"/v1">>).

%% @doc Delete an invite. If the invite has already been accepted, it cannot be deleted.
%% 
-spec delete_invite(ctx:ctx(), binary()) -> {ok, openapi_invite_delete_response:openapi_invite_delete_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_invite(Ctx, InviteId) ->
    delete_invite(Ctx, InviteId, #{}).

-spec delete_invite(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_invite_delete_response:openapi_invite_delete_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_invite(Ctx, InviteId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/organization/invites/", InviteId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
%% 
-spec invite_user(ctx:ctx(), openapi_invite_request:openapi_invite_request()) -> {ok, openapi_invite:openapi_invite(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
invite_user(Ctx, OpenapiInviteRequest) ->
    invite_user(Ctx, OpenapiInviteRequest, #{}).

-spec invite_user(ctx:ctx(), openapi_invite_request:openapi_invite_request(), maps:map()) -> {ok, openapi_invite:openapi_invite(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
invite_user(Ctx, OpenapiInviteRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/organization/invites"],
    QS = [],
    Headers = [],
    Body1 = OpenapiInviteRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Returns a list of invites in the organization.
%% 
-spec list_invites(ctx:ctx()) -> {ok, openapi_invite_list_response:openapi_invite_list_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_invites(Ctx) ->
    list_invites(Ctx, #{}).

-spec list_invites(ctx:ctx(), maps:map()) -> {ok, openapi_invite_list_response:openapi_invite_list_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_invites(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/organization/invites"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'after'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieves an invite.
%% 
-spec retrieve_invite(ctx:ctx(), binary()) -> {ok, openapi_invite:openapi_invite(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
retrieve_invite(Ctx, InviteId) ->
    retrieve_invite(Ctx, InviteId, #{}).

-spec retrieve_invite(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_invite:openapi_invite(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
retrieve_invite(Ctx, InviteId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/organization/invites/", InviteId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


