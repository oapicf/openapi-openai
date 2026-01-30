-module(openapi_run_step_details_tool_calls_file_search_result_object).

-include("openapi.hrl").

-export([openapi_run_step_details_tool_calls_file_search_result_object/0]).

-export([openapi_run_step_details_tool_calls_file_search_result_object/1]).

-export_type([openapi_run_step_details_tool_calls_file_search_result_object/0]).

-type openapi_run_step_details_tool_calls_file_search_result_object() ::
  [ {'file_id', binary() }
  | {'file_name', binary() }
  | {'score', integer() }
  | {'content', list(openapi_run_step_details_tool_calls_file_search_result_object_content_inner:openapi_run_step_details_tool_calls_file_search_result_object_content_inner()) }
  ].


openapi_run_step_details_tool_calls_file_search_result_object() ->
    openapi_run_step_details_tool_calls_file_search_result_object([]).

openapi_run_step_details_tool_calls_file_search_result_object(Fields) ->
  Default = [ {'file_id', binary() }
            , {'file_name', binary() }
            , {'score', integer() }
            , {'content', list(openapi_run_step_details_tool_calls_file_search_result_object_content_inner:openapi_run_step_details_tool_calls_file_search_result_object_content_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

