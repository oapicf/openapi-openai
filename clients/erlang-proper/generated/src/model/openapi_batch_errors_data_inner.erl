-module(openapi_batch_errors_data_inner).

-include("openapi.hrl").

-export([openapi_batch_errors_data_inner/0]).

-export([openapi_batch_errors_data_inner/1]).

-export_type([openapi_batch_errors_data_inner/0]).

-type openapi_batch_errors_data_inner() ::
  [ {'code', binary() }
  | {'message', binary() }
  | {'param', binary() }
  | {'line', integer() }
  ].


openapi_batch_errors_data_inner() ->
    openapi_batch_errors_data_inner([]).

openapi_batch_errors_data_inner(Fields) ->
  Default = [ {'code', binary() }
            , {'message', binary() }
            , {'param', binary() }
            , {'line', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

