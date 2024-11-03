-module(openapi_run_step_delta_step_details_tool_calls_function_object).

-export([encode/1]).

-export_type([openapi_run_step_delta_step_details_tool_calls_function_object/0]).

-type openapi_run_step_delta_step_details_tool_calls_function_object() ::
    #{ 'index' := integer(),
       'id' => binary(),
       'type' := binary(),
       'function' => openapi_run_step_delta_step_details_tool_calls_function_object_function:openapi_run_step_delta_step_details_tool_calls_function_object_function()
     }.

encode(#{ 'index' := Index,
          'id' := Id,
          'type' := Type,
          'function' := Function
        }) ->
    #{ 'index' => Index,
       'id' => Id,
       'type' => Type,
       'function' => Function
     }.
