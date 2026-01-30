-module(openapi_audit_log_service_account_deleted).

-include("openapi.hrl").

-export([openapi_audit_log_service_account_deleted/0]).

-export([openapi_audit_log_service_account_deleted/1]).

-export_type([openapi_audit_log_service_account_deleted/0]).

-type openapi_audit_log_service_account_deleted() ::
  [ {'id', binary() }
  ].


openapi_audit_log_service_account_deleted() ->
    openapi_audit_log_service_account_deleted([]).

openapi_audit_log_service_account_deleted(Fields) ->
  Default = [ {'id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

