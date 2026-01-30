-module(openapi_file_search_ranking_options).

-include("openapi.hrl").

-export([openapi_file_search_ranking_options/0]).

-export([openapi_file_search_ranking_options/1]).

-export_type([openapi_file_search_ranking_options/0]).

-type openapi_file_search_ranking_options() ::
  [ {'ranker', binary() }
  | {'score_threshold', integer() }
  ].


openapi_file_search_ranking_options() ->
    openapi_file_search_ranking_options([]).

openapi_file_search_ranking_options(Fields) ->
  Default = [ {'ranker', elements([<<"auto">>, <<"default_2024_08_21">>]) }
            , {'score_threshold', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

