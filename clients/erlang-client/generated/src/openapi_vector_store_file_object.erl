-module(openapi_vector_store_file_object).

-export([encode/1]).

-export_type([openapi_vector_store_file_object/0]).

-type openapi_vector_store_file_object() ::
    #{ 'id' := binary(),
       'object' := binary(),
       'usage_bytes' := integer(),
       'created_at' := integer(),
       'vector_store_id' := binary(),
       'status' := binary(),
       'last_error' := openapi_vector_store_file_object_last_error:openapi_vector_store_file_object_last_error(),
       'chunking_strategy' => openapi_vector_store_file_object_chunking_strategy:openapi_vector_store_file_object_chunking_strategy()
     }.

encode(#{ 'id' := Id,
          'object' := Object,
          'usage_bytes' := UsageBytes,
          'created_at' := CreatedAt,
          'vector_store_id' := VectorStoreId,
          'status' := Status,
          'last_error' := LastError,
          'chunking_strategy' := ChunkingStrategy
        }) ->
    #{ 'id' => Id,
       'object' => Object,
       'usage_bytes' => UsageBytes,
       'created_at' => CreatedAt,
       'vector_store_id' => VectorStoreId,
       'status' => Status,
       'last_error' => LastError,
       'chunking_strategy' => ChunkingStrategy
     }.
