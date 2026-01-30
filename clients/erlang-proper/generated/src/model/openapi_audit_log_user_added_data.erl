-module(openapi_audit_log_user_added_data).

-include("openapi.hrl").

-export([openapi_audit_log_user_added_data/0]).

-export([openapi_audit_log_user_added_data/1]).

-export_type([openapi_audit_log_user_added_data/0]).

-type openapi_audit_log_user_added_data() ::
  [ {'role', binary() }
  ].


openapi_audit_log_user_added_data() ->
    openapi_audit_log_user_added_data([]).

openapi_audit_log_user_added_data(Fields) ->
  Default = [ {'role', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

