-module(openapi_vector_store_file_batch_object).

-export([encode/1]).

-export_type([openapi_vector_store_file_batch_object/0]).

-type openapi_vector_store_file_batch_object() ::
    #{ 'id' := binary(),
       'object' := binary(),
       'created_at' := integer(),
       'vector_store_id' := binary(),
       'status' := binary(),
       'file_counts' := openapi_vector_store_file_batch_object_file_counts:openapi_vector_store_file_batch_object_file_counts()
     }.

encode(#{ 'id' := Id,
          'object' := Object,
          'created_at' := CreatedAt,
          'vector_store_id' := VectorStoreId,
          'status' := Status,
          'file_counts' := FileCounts
        }) ->
    #{ 'id' => Id,
       'object' => Object,
       'created_at' => CreatedAt,
       'vector_store_id' => VectorStoreId,
       'status' => Status,
       'file_counts' => FileCounts
     }.
