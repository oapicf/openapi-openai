-module(openapi_create_vector_store_request).

-export([encode/1]).

-export_type([openapi_create_vector_store_request/0]).

-type openapi_create_vector_store_request() ::
    #{ 'file_ids' => list(),
       'name' => binary(),
       'expires_after' => openapi_vector_store_expiration_after:openapi_vector_store_expiration_after(),
       'chunking_strategy' => openapi_create_vector_store_request_chunking_strategy:openapi_create_vector_store_request_chunking_strategy(),
       'metadata' => maps:map()
     }.

encode(#{ 'file_ids' := FileIds,
          'name' := Name,
          'expires_after' := ExpiresAfter,
          'chunking_strategy' := ChunkingStrategy,
          'metadata' := Metadata
        }) ->
    #{ 'file_ids' => FileIds,
       'name' => Name,
       'expires_after' => ExpiresAfter,
       'chunking_strategy' => ChunkingStrategy,
       'metadata' => Metadata
     }.
