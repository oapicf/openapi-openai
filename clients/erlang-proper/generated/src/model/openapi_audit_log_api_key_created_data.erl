-module(openapi_audit_log_api_key_created_data).

-include("openapi.hrl").

-export([openapi_audit_log_api_key_created_data/0]).

-export([openapi_audit_log_api_key_created_data/1]).

-export_type([openapi_audit_log_api_key_created_data/0]).

-type openapi_audit_log_api_key_created_data() ::
  [ {'scopes', list(binary()) }
  ].


openapi_audit_log_api_key_created_data() ->
    openapi_audit_log_api_key_created_data([]).

openapi_audit_log_api_key_created_data(Fields) ->
  Default = [ {'scopes', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

