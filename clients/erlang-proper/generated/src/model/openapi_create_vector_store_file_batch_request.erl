-module(openapi_create_vector_store_file_batch_request).

-include("openapi.hrl").

-export([openapi_create_vector_store_file_batch_request/0]).

-export([openapi_create_vector_store_file_batch_request/1]).

-export_type([openapi_create_vector_store_file_batch_request/0]).

-type openapi_create_vector_store_file_batch_request() ::
  [ {'file_ids', list(binary()) }
  | {'chunking_strategy', openapi_chunking_strategy_request_param:openapi_chunking_strategy_request_param() }
  ].


openapi_create_vector_store_file_batch_request() ->
    openapi_create_vector_store_file_batch_request([]).

openapi_create_vector_store_file_batch_request(Fields) ->
  Default = [ {'file_ids', list(binary(), 1, 500) }
            , {'chunking_strategy', openapi_chunking_strategy_request_param:openapi_chunking_strategy_request_param() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

