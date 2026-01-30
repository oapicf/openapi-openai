-module(openapi_list_batches_response).

-include("openapi.hrl").

-export([openapi_list_batches_response/0]).

-export([openapi_list_batches_response/1]).

-export_type([openapi_list_batches_response/0]).

-type openapi_list_batches_response() ::
  [ {'data', list(openapi_batch:openapi_batch()) }
  | {'first_id', binary() }
  | {'last_id', binary() }
  | {'has_more', boolean() }
  | {'object', binary() }
  ].


openapi_list_batches_response() ->
    openapi_list_batches_response([]).

openapi_list_batches_response(Fields) ->
  Default = [ {'data', list(openapi_batch:openapi_batch()) }
            , {'first_id', binary() }
            , {'last_id', binary() }
            , {'has_more', boolean() }
            , {'object', elements([<<"list">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

