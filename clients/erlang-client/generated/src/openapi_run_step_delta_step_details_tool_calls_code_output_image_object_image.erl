-module(openapi_run_step_delta_step_details_tool_calls_code_output_image_object_image).

-export([encode/1]).

-export_type([openapi_run_step_delta_step_details_tool_calls_code_output_image_object_image/0]).

-type openapi_run_step_delta_step_details_tool_calls_code_output_image_object_image() ::
    #{ 'file_id' => binary()
     }.

encode(#{ 'file_id' := FileId
        }) ->
    #{ 'file_id' => FileId
     }.
