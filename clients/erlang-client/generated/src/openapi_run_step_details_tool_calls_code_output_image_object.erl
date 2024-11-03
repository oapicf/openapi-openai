-module(openapi_run_step_details_tool_calls_code_output_image_object).

-export([encode/1]).

-export_type([openapi_run_step_details_tool_calls_code_output_image_object/0]).

-type openapi_run_step_details_tool_calls_code_output_image_object() ::
    #{ 'type' := binary(),
       'image' := openapi_run_step_details_tool_calls_code_output_image_object_image:openapi_run_step_details_tool_calls_code_output_image_object_image()
     }.

encode(#{ 'type' := Type,
          'image' := Image
        }) ->
    #{ 'type' => Type,
       'image' => Image
     }.
