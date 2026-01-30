-module(openapi_audit_log_service_account_created_data).

-include("openapi.hrl").

-export([openapi_audit_log_service_account_created_data/0]).

-export([openapi_audit_log_service_account_created_data/1]).

-export_type([openapi_audit_log_service_account_created_data/0]).

-type openapi_audit_log_service_account_created_data() ::
  [ {'role', binary() }
  ].


openapi_audit_log_service_account_created_data() ->
    openapi_audit_log_service_account_created_data([]).

openapi_audit_log_service_account_created_data(Fields) ->
  Default = [ {'role', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

