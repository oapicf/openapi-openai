-module(openapi_assistant_tools_file_search_file_search).

-include("openapi.hrl").

-export([openapi_assistant_tools_file_search_file_search/0]).

-export([openapi_assistant_tools_file_search_file_search/1]).

-export_type([openapi_assistant_tools_file_search_file_search/0]).

-type openapi_assistant_tools_file_search_file_search() ::
  [ {'max_num_results', integer() }
  | {'ranking_options', openapi_file_search_ranking_options:openapi_file_search_ranking_options() }
  ].


openapi_assistant_tools_file_search_file_search() ->
    openapi_assistant_tools_file_search_file_search([]).

openapi_assistant_tools_file_search_file_search(Fields) ->
  Default = [ {'max_num_results', integer(1, 50) }
            , {'ranking_options', openapi_file_search_ranking_options:openapi_file_search_ranking_options() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

