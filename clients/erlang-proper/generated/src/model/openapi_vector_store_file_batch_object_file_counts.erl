-module(openapi_vector_store_file_batch_object_file_counts).

-include("openapi.hrl").

-export([openapi_vector_store_file_batch_object_file_counts/0]).

-export([openapi_vector_store_file_batch_object_file_counts/1]).

-export_type([openapi_vector_store_file_batch_object_file_counts/0]).

-type openapi_vector_store_file_batch_object_file_counts() ::
  [ {'in_progress', integer() }
  | {'completed', integer() }
  | {'failed', integer() }
  | {'cancelled', integer() }
  | {'total', integer() }
  ].


openapi_vector_store_file_batch_object_file_counts() ->
    openapi_vector_store_file_batch_object_file_counts([]).

openapi_vector_store_file_batch_object_file_counts(Fields) ->
  Default = [ {'in_progress', integer() }
            , {'completed', integer() }
            , {'failed', integer() }
            , {'cancelled', integer() }
            , {'total', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

