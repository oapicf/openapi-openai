-module(openapi_create_batch_request).

-include("openapi.hrl").

-export([openapi_create_batch_request/0]).

-export([openapi_create_batch_request/1]).

-export_type([openapi_create_batch_request/0]).

-type openapi_create_batch_request() ::
  [ {'input_file_id', binary() }
  | {'endpoint', binary() }
  | {'completion_window', binary() }
  | {'metadata', map() }
  ].


openapi_create_batch_request() ->
    openapi_create_batch_request([]).

openapi_create_batch_request(Fields) ->
  Default = [ {'input_file_id', binary() }
            , {'endpoint', elements([<<"/v1/chat/completions">>, <<"/v1/embeddings">>, <<"/v1/completions">>]) }
            , {'completion_window', elements([<<"24h">>]) }
            , {'metadata', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

