-module(openapi_other_chunking_strategy_response_param).

-include("openapi.hrl").

-export([openapi_other_chunking_strategy_response_param/0]).

-export([openapi_other_chunking_strategy_response_param/1]).

-export_type([openapi_other_chunking_strategy_response_param/0]).

-type openapi_other_chunking_strategy_response_param() ::
  [ {'type', binary() }
  ].


openapi_other_chunking_strategy_response_param() ->
    openapi_other_chunking_strategy_response_param([]).

openapi_other_chunking_strategy_response_param(Fields) ->
  Default = [ {'type', elements([<<"other">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

