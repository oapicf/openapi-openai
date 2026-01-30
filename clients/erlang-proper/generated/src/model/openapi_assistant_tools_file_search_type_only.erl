-module(openapi_assistant_tools_file_search_type_only).

-include("openapi.hrl").

-export([openapi_assistant_tools_file_search_type_only/0]).

-export([openapi_assistant_tools_file_search_type_only/1]).

-export_type([openapi_assistant_tools_file_search_type_only/0]).

-type openapi_assistant_tools_file_search_type_only() ::
  [ {'type', binary() }
  ].


openapi_assistant_tools_file_search_type_only() ->
    openapi_assistant_tools_file_search_type_only([]).

openapi_assistant_tools_file_search_type_only(Fields) ->
  Default = [ {'type', elements([<<"file_search">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

