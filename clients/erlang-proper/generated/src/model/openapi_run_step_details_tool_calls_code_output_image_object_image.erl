-module(openapi_run_step_details_tool_calls_code_output_image_object_image).

-include("openapi.hrl").

-export([openapi_run_step_details_tool_calls_code_output_image_object_image/0]).

-export([openapi_run_step_details_tool_calls_code_output_image_object_image/1]).

-export_type([openapi_run_step_details_tool_calls_code_output_image_object_image/0]).

-type openapi_run_step_details_tool_calls_code_output_image_object_image() ::
  [ {'file_id', binary() }
  ].


openapi_run_step_details_tool_calls_code_output_image_object_image() ->
    openapi_run_step_details_tool_calls_code_output_image_object_image([]).

openapi_run_step_details_tool_calls_code_output_image_object_image(Fields) ->
  Default = [ {'file_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

