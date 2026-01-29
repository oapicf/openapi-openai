-module(openapi_run_step_details_tool_calls_object).

-export([encode/1]).

-export_type([openapi_run_step_details_tool_calls_object/0]).

-type openapi_run_step_details_tool_calls_object() ::
    #{ 'type' := binary(),
       'tool_calls' := list()
     }.

encode(#{ 'type' := Type,
          'tool_calls' := ToolCalls
        }) ->
    #{ 'type' => Type,
       'tool_calls' => ToolCalls
     }.
