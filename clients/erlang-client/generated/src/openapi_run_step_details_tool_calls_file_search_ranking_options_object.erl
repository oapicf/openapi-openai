-module(openapi_run_step_details_tool_calls_file_search_ranking_options_object).

-export([encode/1]).

-export_type([openapi_run_step_details_tool_calls_file_search_ranking_options_object/0]).

-type openapi_run_step_details_tool_calls_file_search_ranking_options_object() ::
    #{ 'ranker' := binary(),
       'score_threshold' := integer()
     }.

encode(#{ 'ranker' := Ranker,
          'score_threshold' := ScoreThreshold
        }) ->
    #{ 'ranker' => Ranker,
       'score_threshold' => ScoreThreshold
     }.
