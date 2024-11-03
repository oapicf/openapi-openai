-module(openapi_run_step_details_tool_calls_retrieval_object).

-export([encode/1]).

-export_type([openapi_run_step_details_tool_calls_retrieval_object/0]).

-type openapi_run_step_details_tool_calls_retrieval_object() ::
    #{ 'id' := binary(),
       'type' := binary(),
       'retrieval' := maps:map()
     }.

encode(#{ 'id' := Id,
          'type' := Type,
          'retrieval' := Retrieval
        }) ->
    #{ 'id' => Id,
       'type' => Type,
       'retrieval' => Retrieval
     }.
