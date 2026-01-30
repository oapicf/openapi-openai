-module(openapi_static_chunking_strategy).

-include("openapi.hrl").

-export([openapi_static_chunking_strategy/0]).

-export([openapi_static_chunking_strategy/1]).

-export_type([openapi_static_chunking_strategy/0]).

-type openapi_static_chunking_strategy() ::
  [ {'type', binary() }
  | {'static', openapi_static_chunking_strategy_static:openapi_static_chunking_strategy_static() }
  ].


openapi_static_chunking_strategy() ->
    openapi_static_chunking_strategy([]).

openapi_static_chunking_strategy(Fields) ->
  Default = [ {'type', elements([<<"static">>]) }
            , {'static', openapi_static_chunking_strategy_static:openapi_static_chunking_strategy_static() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

