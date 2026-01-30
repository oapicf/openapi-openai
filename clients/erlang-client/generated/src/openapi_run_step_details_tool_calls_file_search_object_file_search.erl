-module(openapi_run_step_details_tool_calls_file_search_object_file_search).

-export([encode/1]).

-export_type([openapi_run_step_details_tool_calls_file_search_object_file_search/0]).

-type openapi_run_step_details_tool_calls_file_search_object_file_search() ::
    #{ 'ranking_options' => openapi_run_step_details_tool_calls_file_search_ranking_options_object:openapi_run_step_details_tool_calls_file_search_ranking_options_object(),
       'results' => list()
     }.

encode(#{ 'ranking_options' := RankingOptions,
          'results' := Results
        }) ->
    #{ 'ranking_options' => RankingOptions,
       'results' => Results
     }.
