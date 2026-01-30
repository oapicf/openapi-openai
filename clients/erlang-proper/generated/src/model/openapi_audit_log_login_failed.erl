-module(openapi_audit_log_login_failed).

-include("openapi.hrl").

-export([openapi_audit_log_login_failed/0]).

-export([openapi_audit_log_login_failed/1]).

-export_type([openapi_audit_log_login_failed/0]).

-type openapi_audit_log_login_failed() ::
  [ {'error_code', binary() }
  | {'error_message', binary() }
  ].


openapi_audit_log_login_failed() ->
    openapi_audit_log_login_failed([]).

openapi_audit_log_login_failed(Fields) ->
  Default = [ {'error_code', binary() }
            , {'error_message', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

