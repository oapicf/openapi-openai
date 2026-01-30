-module(openapi_batch_request_counts).

-include("openapi.hrl").

-export([openapi_batch_request_counts/0]).

-export([openapi_batch_request_counts/1]).

-export_type([openapi_batch_request_counts/0]).

-type openapi_batch_request_counts() ::
  [ {'total', integer() }
  | {'completed', integer() }
  | {'failed', integer() }
  ].


openapi_batch_request_counts() ->
    openapi_batch_request_counts([]).

openapi_batch_request_counts(Fields) ->
  Default = [ {'total', integer() }
            , {'completed', integer() }
            , {'failed', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

