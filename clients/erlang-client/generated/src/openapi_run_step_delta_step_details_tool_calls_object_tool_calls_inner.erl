-module(openapi_run_step_delta_step_details_tool_calls_object_tool_calls_inner).

-export([encode/1]).

-export_type([openapi_run_step_delta_step_details_tool_calls_object_tool_calls_inner/0]).

-type openapi_run_step_delta_step_details_tool_calls_object_tool_calls_inner() ::
    #{ 'index' := integer(),
       'id' => binary(),
       'type' := binary(),
       'code_interpreter' => openapi_run_step_delta_step_details_tool_calls_code_object_code_interpreter:openapi_run_step_delta_step_details_tool_calls_code_object_code_interpreter(),
       'file_search' := maps:map(),
       'function' => openapi_run_step_delta_step_details_tool_calls_function_object_function:openapi_run_step_delta_step_details_tool_calls_function_object_function()
     }.

encode(#{ 'index' := Index,
          'id' := Id,
          'type' := Type,
          'code_interpreter' := CodeInterpreter,
          'file_search' := FileSearch,
          'function' := Function
        }) ->
    #{ 'index' => Index,
       'id' => Id,
       'type' => Type,
       'code_interpreter' => CodeInterpreter,
       'file_search' => FileSearch,
       'function' => Function
     }.
