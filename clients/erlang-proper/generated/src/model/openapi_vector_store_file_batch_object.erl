-module(openapi_vector_store_file_batch_object).

-include("openapi.hrl").

-export([openapi_vector_store_file_batch_object/0]).

-export([openapi_vector_store_file_batch_object/1]).

-export_type([openapi_vector_store_file_batch_object/0]).

-type openapi_vector_store_file_batch_object() ::
  [ {'id', binary() }
  | {'object', binary() }
  | {'created_at', integer() }
  | {'vector_store_id', binary() }
  | {'status', binary() }
  | {'file_counts', openapi_vector_store_file_batch_object_file_counts:openapi_vector_store_file_batch_object_file_counts() }
  ].


openapi_vector_store_file_batch_object() ->
    openapi_vector_store_file_batch_object([]).

openapi_vector_store_file_batch_object(Fields) ->
  Default = [ {'id', binary() }
            , {'object', elements([<<"vector_store.files_batch">>]) }
            , {'created_at', integer() }
            , {'vector_store_id', binary() }
            , {'status', elements([<<"in_progress">>, <<"completed">>, <<"cancelled">>, <<"failed">>]) }
            , {'file_counts', openapi_vector_store_file_batch_object_file_counts:openapi_vector_store_file_batch_object_file_counts() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

