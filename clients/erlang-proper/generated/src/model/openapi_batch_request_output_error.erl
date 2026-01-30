-module(openapi_batch_request_output_error).

-include("openapi.hrl").

-export([openapi_batch_request_output_error/0]).

-export([openapi_batch_request_output_error/1]).

-export_type([openapi_batch_request_output_error/0]).

-type openapi_batch_request_output_error() ::
  [ {'code', binary() }
  | {'message', binary() }
  ].


openapi_batch_request_output_error() ->
    openapi_batch_request_output_error([]).

openapi_batch_request_output_error(Fields) ->
  Default = [ {'code', binary() }
            , {'message', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

