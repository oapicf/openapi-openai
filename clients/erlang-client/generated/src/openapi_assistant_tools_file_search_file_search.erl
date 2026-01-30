-module(openapi_assistant_tools_file_search_file_search).

-export([encode/1]).

-export_type([openapi_assistant_tools_file_search_file_search/0]).

-type openapi_assistant_tools_file_search_file_search() ::
    #{ 'max_num_results' => integer(),
       'ranking_options' => openapi_file_search_ranking_options:openapi_file_search_ranking_options()
     }.

encode(#{ 'max_num_results' := MaxNumResults,
          'ranking_options' := RankingOptions
        }) ->
    #{ 'max_num_results' => MaxNumResults,
       'ranking_options' => RankingOptions
     }.
