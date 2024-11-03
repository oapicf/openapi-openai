-module(openapi_run_step_details_tool_calls_code_object).

-export([encode/1]).

-export_type([openapi_run_step_details_tool_calls_code_object/0]).

-type openapi_run_step_details_tool_calls_code_object() ::
    #{ 'id' := binary(),
       'type' := binary(),
       'code_interpreter' := openapi_run_step_details_tool_calls_code_object_code_interpreter:openapi_run_step_details_tool_calls_code_object_code_interpreter()
     }.

encode(#{ 'id' := Id,
          'type' := Type,
          'code_interpreter' := CodeInterpreter
        }) ->
    #{ 'id' => Id,
       'type' => Type,
       'code_interpreter' => CodeInterpreter
     }.
