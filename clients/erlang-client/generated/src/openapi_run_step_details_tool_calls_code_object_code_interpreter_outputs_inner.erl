-module(openapi_run_step_details_tool_calls_code_object_code_interpreter_outputs_inner).

-export([encode/1]).

-export_type([openapi_run_step_details_tool_calls_code_object_code_interpreter_outputs_inner/0]).

-type openapi_run_step_details_tool_calls_code_object_code_interpreter_outputs_inner() ::
    #{ 'type' := binary(),
       'logs' := binary(),
       'image' := openapi_run_step_details_tool_calls_code_output_image_object_image:openapi_run_step_details_tool_calls_code_output_image_object_image()
     }.

encode(#{ 'type' := Type,
          'logs' := Logs,
          'image' := Image
        }) ->
    #{ 'type' => Type,
       'logs' => Logs,
       'image' => Image
     }.
