-module(openapi_static_chunking_strategy_static).

-include("openapi.hrl").

-export([openapi_static_chunking_strategy_static/0]).

-export([openapi_static_chunking_strategy_static/1]).

-export_type([openapi_static_chunking_strategy_static/0]).

-type openapi_static_chunking_strategy_static() ::
  [ {'max_chunk_size_tokens', integer() }
  | {'chunk_overlap_tokens', integer() }
  ].


openapi_static_chunking_strategy_static() ->
    openapi_static_chunking_strategy_static([]).

openapi_static_chunking_strategy_static(Fields) ->
  Default = [ {'max_chunk_size_tokens', integer(100, 4096) }
            , {'chunk_overlap_tokens', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

