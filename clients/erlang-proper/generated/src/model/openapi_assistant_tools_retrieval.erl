-module(openapi_assistant_tools_retrieval).

-include("openapi.hrl").

-export([openapi_assistant_tools_retrieval/0]).

-export([openapi_assistant_tools_retrieval/1]).

-export_type([openapi_assistant_tools_retrieval/0]).

-type openapi_assistant_tools_retrieval() ::
  [ {'type', binary() }
  ].


openapi_assistant_tools_retrieval() ->
    openapi_assistant_tools_retrieval([]).

openapi_assistant_tools_retrieval(Fields) ->
  Default = [ {'type', elements([<<"retrieval">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

