-module(openapi_audit_logs_api).

-export([list_audit_logs/1, list_audit_logs/2]).

-define(BASE_URL, <<"/v1">>).

%% @doc List user actions and configuration changes within this organization.
%% 
-spec list_audit_logs(ctx:ctx()) -> {ok, openapi_list_audit_logs_response:openapi_list_audit_logs_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_audit_logs(Ctx) ->
    list_audit_logs(Ctx, #{}).

-spec list_audit_logs(ctx:ctx(), maps:map()) -> {ok, openapi_list_audit_logs_response:openapi_list_audit_logs_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_audit_logs(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/organization/audit_logs"],
    QS = lists:flatten([])++openapi_utils:optional_params(['effective_at', 'project_ids[]', 'event_types[]', 'actor_ids[]', 'actor_emails[]', 'resource_ids[]', 'limit', 'after', 'before'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


