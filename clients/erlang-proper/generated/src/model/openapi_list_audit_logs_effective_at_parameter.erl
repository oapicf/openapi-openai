-module(openapi_list_audit_logs_effective_at_parameter).

-include("openapi.hrl").

-export([openapi_list_audit_logs_effective_at_parameter/0]).

-export([openapi_list_audit_logs_effective_at_parameter/1]).

-export_type([openapi_list_audit_logs_effective_at_parameter/0]).

-type openapi_list_audit_logs_effective_at_parameter() ::
  [ {'gt', integer() }
  | {'gte', integer() }
  | {'lt', integer() }
  | {'lte', integer() }
  ].


openapi_list_audit_logs_effective_at_parameter() ->
    openapi_list_audit_logs_effective_at_parameter([]).

openapi_list_audit_logs_effective_at_parameter(Fields) ->
  Default = [ {'gt', integer() }
            , {'gte', integer() }
            , {'lt', integer() }
            , {'lte', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

