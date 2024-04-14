-module(openapi_run_step_delta_step_details_tool_calls_code_output_image_object).

-export([encode/1]).

-export_type([openapi_run_step_delta_step_details_tool_calls_code_output_image_object/0]).

-type openapi_run_step_delta_step_details_tool_calls_code_output_image_object() ::
    #{ 'index' := integer(),
       'type' := binary(),
       'image' => openapi_run_step_delta_step_details_tool_calls_code_output_image_object_image:openapi_run_step_delta_step_details_tool_calls_code_output_image_object_image()
     }.

encode(#{ 'index' := Index,
          'type' := Type,
          'image' := Image
        }) ->
    #{ 'index' => Index,
       'type' => Type,
       'image' => Image
     }.
