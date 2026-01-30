-module(openapi_list_audit_logs_effective_at_parameter).

-export([encode/1]).

-export_type([openapi_list_audit_logs_effective_at_parameter/0]).

-type openapi_list_audit_logs_effective_at_parameter() ::
    #{ 'gt' => integer(),
       'gte' => integer(),
       'lt' => integer(),
       'lte' => integer()
     }.

encode(#{ 'gt' := Gt,
          'gte' := Gte,
          'lt' := Lt,
          'lte' := Lte
        }) ->
    #{ 'gt' => Gt,
       'gte' => Gte,
       'lt' => Lt,
       'lte' => Lte
     }.
