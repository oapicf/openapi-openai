-module(openapi_run_step_details_tool_calls_code_output_image_object).

-include("openapi.hrl").

-export([openapi_run_step_details_tool_calls_code_output_image_object/0]).

-export([openapi_run_step_details_tool_calls_code_output_image_object/1]).

-export_type([openapi_run_step_details_tool_calls_code_output_image_object/0]).

-type openapi_run_step_details_tool_calls_code_output_image_object() ::
  [ {'type', binary() }
  | {'image', openapi_run_step_details_tool_calls_code_output_image_object_image:openapi_run_step_details_tool_calls_code_output_image_object_image() }
  ].


openapi_run_step_details_tool_calls_code_output_image_object() ->
    openapi_run_step_details_tool_calls_code_output_image_object([]).

openapi_run_step_details_tool_calls_code_output_image_object(Fields) ->
  Default = [ {'type', elements([<<"image">>]) }
            , {'image', openapi_run_step_details_tool_calls_code_output_image_object_image:openapi_run_step_details_tool_calls_code_output_image_object_image() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

