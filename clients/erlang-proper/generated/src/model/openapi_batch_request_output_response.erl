-module(openapi_batch_request_output_response).

-include("openapi.hrl").

-export([openapi_batch_request_output_response/0]).

-export([openapi_batch_request_output_response/1]).

-export_type([openapi_batch_request_output_response/0]).

-type openapi_batch_request_output_response() ::
  [ {'status_code', integer() }
  | {'request_id', binary() }
  | {'body', map() }
  ].


openapi_batch_request_output_response() ->
    openapi_batch_request_output_response([]).

openapi_batch_request_output_response(Fields) ->
  Default = [ {'status_code', integer() }
            , {'request_id', binary() }
            , {'body', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

