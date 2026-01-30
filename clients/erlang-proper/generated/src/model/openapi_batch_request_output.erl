-module(openapi_batch_request_output).

-include("openapi.hrl").

-export([openapi_batch_request_output/0]).

-export([openapi_batch_request_output/1]).

-export_type([openapi_batch_request_output/0]).

-type openapi_batch_request_output() ::
  [ {'id', binary() }
  | {'custom_id', binary() }
  | {'response', openapi_batch_request_output_response:openapi_batch_request_output_response() }
  | {'error', openapi_batch_request_output_error:openapi_batch_request_output_error() }
  ].


openapi_batch_request_output() ->
    openapi_batch_request_output([]).

openapi_batch_request_output(Fields) ->
  Default = [ {'id', binary() }
            , {'custom_id', binary() }
            , {'response', openapi_batch_request_output_response:openapi_batch_request_output_response() }
            , {'error', openapi_batch_request_output_error:openapi_batch_request_output_error() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

