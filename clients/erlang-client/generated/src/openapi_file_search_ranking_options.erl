-module(openapi_file_search_ranking_options).

-export([encode/1]).

-export_type([openapi_file_search_ranking_options/0]).

-type openapi_file_search_ranking_options() ::
    #{ 'ranker' => binary(),
       'score_threshold' := integer()
     }.

encode(#{ 'ranker' := Ranker,
          'score_threshold' := ScoreThreshold
        }) ->
    #{ 'ranker' => Ranker,
       'score_threshold' => ScoreThreshold
     }.
