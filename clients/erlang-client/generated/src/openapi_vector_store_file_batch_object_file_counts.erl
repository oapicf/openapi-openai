-module(openapi_vector_store_file_batch_object_file_counts).

-export([encode/1]).

-export_type([openapi_vector_store_file_batch_object_file_counts/0]).

-type openapi_vector_store_file_batch_object_file_counts() ::
    #{ 'in_progress' := integer(),
       'completed' := integer(),
       'failed' := integer(),
       'cancelled' := integer(),
       'total' := integer()
     }.

encode(#{ 'in_progress' := InProgress,
          'completed' := Completed,
          'failed' := Failed,
          'cancelled' := Cancelled,
          'total' := Total
        }) ->
    #{ 'in_progress' => InProgress,
       'completed' => Completed,
       'failed' => Failed,
       'cancelled' => Cancelled,
       'total' => Total
     }.
