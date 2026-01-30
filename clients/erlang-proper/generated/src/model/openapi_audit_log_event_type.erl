-module(openapi_audit_log_event_type).

-include("openapi.hrl").

-export([openapi_audit_log_event_type/0]).

-export_type([openapi_audit_log_event_type/0]).

-type openapi_audit_log_event_type() ::
  binary().

openapi_audit_log_event_type() ->
  elements([<<"api_key.created">>, <<"api_key.updated">>, <<"api_key.deleted">>, <<"invite.sent">>, <<"invite.accepted">>, <<"invite.deleted">>, <<"login.succeeded">>, <<"login.failed">>, <<"logout.succeeded">>, <<"logout.failed">>, <<"organization.updated">>, <<"project.created">>, <<"project.updated">>, <<"project.archived">>, <<"service_account.created">>, <<"service_account.updated">>, <<"service_account.deleted">>, <<"rate_limit.updated">>, <<"rate_limit.deleted">>, <<"user.added">>, <<"user.updated">>, <<"user.deleted">>]).

