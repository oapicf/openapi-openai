-module(openapi_audit_log_api_key_updated_changes_requested).

-include("openapi.hrl").

-export([openapi_audit_log_api_key_updated_changes_requested/0]).

-export([openapi_audit_log_api_key_updated_changes_requested/1]).

-export_type([openapi_audit_log_api_key_updated_changes_requested/0]).

-type openapi_audit_log_api_key_updated_changes_requested() ::
  [ {'scopes', list(binary()) }
  ].


openapi_audit_log_api_key_updated_changes_requested() ->
    openapi_audit_log_api_key_updated_changes_requested([]).

openapi_audit_log_api_key_updated_changes_requested(Fields) ->
  Default = [ {'scopes', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

