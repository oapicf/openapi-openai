-module(openapi_run_step_details_tool_calls_file_search_object_file_search).

-include("openapi.hrl").

-export([openapi_run_step_details_tool_calls_file_search_object_file_search/0]).

-export([openapi_run_step_details_tool_calls_file_search_object_file_search/1]).

-export_type([openapi_run_step_details_tool_calls_file_search_object_file_search/0]).

-type openapi_run_step_details_tool_calls_file_search_object_file_search() ::
  [ {'ranking_options', openapi_run_step_details_tool_calls_file_search_ranking_options_object:openapi_run_step_details_tool_calls_file_search_ranking_options_object() }
  | {'results', list(openapi_run_step_details_tool_calls_file_search_result_object:openapi_run_step_details_tool_calls_file_search_result_object()) }
  ].


openapi_run_step_details_tool_calls_file_search_object_file_search() ->
    openapi_run_step_details_tool_calls_file_search_object_file_search([]).

openapi_run_step_details_tool_calls_file_search_object_file_search(Fields) ->
  Default = [ {'ranking_options', openapi_run_step_details_tool_calls_file_search_ranking_options_object:openapi_run_step_details_tool_calls_file_search_ranking_options_object() }
            , {'results', list(openapi_run_step_details_tool_calls_file_search_result_object:openapi_run_step_details_tool_calls_file_search_result_object()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

