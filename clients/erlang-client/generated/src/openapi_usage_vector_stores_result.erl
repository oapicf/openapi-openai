-module(openapi_usage_vector_stores_result).

-export([encode/1]).

-export_type([openapi_usage_vector_stores_result/0]).

-type openapi_usage_vector_stores_result() ::
    #{ 'object' := binary(),
       'usage_bytes' := integer(),
       'project_id' => binary()
     }.

encode(#{ 'object' := Object,
          'usage_bytes' := UsageBytes,
          'project_id' := ProjectId
        }) ->
    #{ 'object' => Object,
       'usage_bytes' => UsageBytes,
       'project_id' => ProjectId
     }.
