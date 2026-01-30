-module(openapi_audit_log_user_added).

-include("openapi.hrl").

-export([openapi_audit_log_user_added/0]).

-export([openapi_audit_log_user_added/1]).

-export_type([openapi_audit_log_user_added/0]).

-type openapi_audit_log_user_added() ::
  [ {'id', binary() }
  | {'data', openapi_audit_log_user_added_data:openapi_audit_log_user_added_data() }
  ].


openapi_audit_log_user_added() ->
    openapi_audit_log_user_added([]).

openapi_audit_log_user_added(Fields) ->
  Default = [ {'id', binary() }
            , {'data', openapi_audit_log_user_added_data:openapi_audit_log_user_added_data() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

