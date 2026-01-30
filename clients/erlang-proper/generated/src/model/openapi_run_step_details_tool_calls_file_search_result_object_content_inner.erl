-module(openapi_run_step_details_tool_calls_file_search_result_object_content_inner).

-include("openapi.hrl").

-export([openapi_run_step_details_tool_calls_file_search_result_object_content_inner/0]).

-export([openapi_run_step_details_tool_calls_file_search_result_object_content_inner/1]).

-export_type([openapi_run_step_details_tool_calls_file_search_result_object_content_inner/0]).

-type openapi_run_step_details_tool_calls_file_search_result_object_content_inner() ::
  [ {'type', binary() }
  | {'text', binary() }
  ].


openapi_run_step_details_tool_calls_file_search_result_object_content_inner() ->
    openapi_run_step_details_tool_calls_file_search_result_object_content_inner([]).

openapi_run_step_details_tool_calls_file_search_result_object_content_inner(Fields) ->
  Default = [ {'type', elements([<<"text">>]) }
            , {'text', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

