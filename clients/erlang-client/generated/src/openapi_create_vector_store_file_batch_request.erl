-module(openapi_create_vector_store_file_batch_request).

-export([encode/1]).

-export_type([openapi_create_vector_store_file_batch_request/0]).

-type openapi_create_vector_store_file_batch_request() ::
    #{ 'file_ids' := list(),
       'chunking_strategy' => openapi_chunking_strategy_request_param:openapi_chunking_strategy_request_param()
     }.

encode(#{ 'file_ids' := FileIds,
          'chunking_strategy' := ChunkingStrategy
        }) ->
    #{ 'file_ids' => FileIds,
       'chunking_strategy' => ChunkingStrategy
     }.
