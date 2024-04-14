-module(openapi_run_step_details_tool_calls_code_object_code_interpreter).

-export([encode/1]).

-export_type([openapi_run_step_details_tool_calls_code_object_code_interpreter/0]).

-type openapi_run_step_details_tool_calls_code_object_code_interpreter() ::
    #{ 'input' := binary(),
       'outputs' := list()
     }.

encode(#{ 'input' := Input,
          'outputs' := Outputs
        }) ->
    #{ 'input' => Input,
       'outputs' => Outputs
     }.
