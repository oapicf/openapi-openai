-module(openapi_audit_log_user_deleted).

-include("openapi.hrl").

-export([openapi_audit_log_user_deleted/0]).

-export([openapi_audit_log_user_deleted/1]).

-export_type([openapi_audit_log_user_deleted/0]).

-type openapi_audit_log_user_deleted() ::
  [ {'id', binary() }
  ].


openapi_audit_log_user_deleted() ->
    openapi_audit_log_user_deleted([]).

openapi_audit_log_user_deleted(Fields) ->
  Default = [ {'id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

