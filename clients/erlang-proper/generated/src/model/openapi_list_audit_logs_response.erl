-module(openapi_list_audit_logs_response).

-include("openapi.hrl").

-export([openapi_list_audit_logs_response/0]).

-export([openapi_list_audit_logs_response/1]).

-export_type([openapi_list_audit_logs_response/0]).

-type openapi_list_audit_logs_response() ::
  [ {'object', binary() }
  | {'data', list(openapi_audit_log:openapi_audit_log()) }
  | {'first_id', binary() }
  | {'last_id', binary() }
  | {'has_more', boolean() }
  ].


openapi_list_audit_logs_response() ->
    openapi_list_audit_logs_response([]).

openapi_list_audit_logs_response(Fields) ->
  Default = [ {'object', elements([<<"list">>]) }
            , {'data', list(openapi_audit_log:openapi_audit_log()) }
            , {'first_id', binary() }
            , {'last_id', binary() }
            , {'has_more', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

