-module(openapi_run_step_delta_step_details_tool_calls_retrieval_object).

-export([encode/1]).

-export_type([openapi_run_step_delta_step_details_tool_calls_retrieval_object/0]).

-type openapi_run_step_delta_step_details_tool_calls_retrieval_object() ::
    #{ 'index' := integer(),
       'id' => binary(),
       'type' := binary(),
       'retrieval' => maps:map()
     }.

encode(#{ 'index' := Index,
          'id' := Id,
          'type' := Type,
          'retrieval' := Retrieval
        }) ->
    #{ 'index' => Index,
       'id' => Id,
       'type' => Type,
       'retrieval' => Retrieval
     }.
