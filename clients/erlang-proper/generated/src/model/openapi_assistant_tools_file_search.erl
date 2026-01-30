-module(openapi_assistant_tools_file_search).

-include("openapi.hrl").

-export([openapi_assistant_tools_file_search/0]).

-export([openapi_assistant_tools_file_search/1]).

-export_type([openapi_assistant_tools_file_search/0]).

-type openapi_assistant_tools_file_search() ::
  [ {'type', binary() }
  | {'file_search', openapi_assistant_tools_file_search_file_search:openapi_assistant_tools_file_search_file_search() }
  ].


openapi_assistant_tools_file_search() ->
    openapi_assistant_tools_file_search([]).

openapi_assistant_tools_file_search(Fields) ->
  Default = [ {'type', elements([<<"file_search">>]) }
            , {'file_search', openapi_assistant_tools_file_search_file_search:openapi_assistant_tools_file_search_file_search() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

