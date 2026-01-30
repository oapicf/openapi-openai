-module(openapi_auto_chunking_strategy).

-include("openapi.hrl").

-export([openapi_auto_chunking_strategy/0]).

-export([openapi_auto_chunking_strategy/1]).

-export_type([openapi_auto_chunking_strategy/0]).

-type openapi_auto_chunking_strategy() ::
  [ {'type', binary() }
  ].


openapi_auto_chunking_strategy() ->
    openapi_auto_chunking_strategy([]).

openapi_auto_chunking_strategy(Fields) ->
  Default = [ {'type', elements([<<"auto">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

