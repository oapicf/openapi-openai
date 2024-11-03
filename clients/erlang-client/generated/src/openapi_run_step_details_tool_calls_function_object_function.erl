-module(openapi_run_step_details_tool_calls_function_object_function).

-export([encode/1]).

-export_type([openapi_run_step_details_tool_calls_function_object_function/0]).

-type openapi_run_step_details_tool_calls_function_object_function() ::
    #{ 'name' := binary(),
       'arguments' := binary(),
       'output' := binary()
     }.

encode(#{ 'name' := Name,
          'arguments' := Arguments,
          'output' := Output
        }) ->
    #{ 'name' => Name,
       'arguments' => Arguments,
       'output' => Output
     }.
