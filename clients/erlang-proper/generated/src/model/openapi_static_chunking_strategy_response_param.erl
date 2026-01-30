-module(openapi_static_chunking_strategy_response_param).

-include("openapi.hrl").

-export([openapi_static_chunking_strategy_response_param/0]).

-export([openapi_static_chunking_strategy_response_param/1]).

-export_type([openapi_static_chunking_strategy_response_param/0]).

-type openapi_static_chunking_strategy_response_param() ::
  [ {'type', binary() }
  | {'static', openapi_static_chunking_strategy:openapi_static_chunking_strategy() }
  ].


openapi_static_chunking_strategy_response_param() ->
    openapi_static_chunking_strategy_response_param([]).

openapi_static_chunking_strategy_response_param(Fields) ->
  Default = [ {'type', elements([<<"static">>]) }
            , {'static', openapi_static_chunking_strategy:openapi_static_chunking_strategy() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

