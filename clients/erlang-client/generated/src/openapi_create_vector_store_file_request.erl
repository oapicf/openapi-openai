-module(openapi_create_vector_store_file_request).

-export([encode/1]).

-export_type([openapi_create_vector_store_file_request/0]).

-type openapi_create_vector_store_file_request() ::
    #{ 'file_id' := binary(),
       'chunking_strategy' => openapi_chunking_strategy_request_param:openapi_chunking_strategy_request_param()
     }.

encode(#{ 'file_id' := FileId,
          'chunking_strategy' := ChunkingStrategy
        }) ->
    #{ 'file_id' => FileId,
       'chunking_strategy' => ChunkingStrategy
     }.
