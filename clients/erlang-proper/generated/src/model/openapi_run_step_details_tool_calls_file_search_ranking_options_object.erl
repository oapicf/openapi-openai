-module(openapi_run_step_details_tool_calls_file_search_ranking_options_object).

-include("openapi.hrl").

-export([openapi_run_step_details_tool_calls_file_search_ranking_options_object/0]).

-export([openapi_run_step_details_tool_calls_file_search_ranking_options_object/1]).

-export_type([openapi_run_step_details_tool_calls_file_search_ranking_options_object/0]).

-type openapi_run_step_details_tool_calls_file_search_ranking_options_object() ::
  [ {'ranker', binary() }
  | {'score_threshold', integer() }
  ].


openapi_run_step_details_tool_calls_file_search_ranking_options_object() ->
    openapi_run_step_details_tool_calls_file_search_ranking_options_object([]).

openapi_run_step_details_tool_calls_file_search_ranking_options_object(Fields) ->
  Default = [ {'ranker', elements([<<"default_2024_08_21">>]) }
            , {'score_threshold', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

