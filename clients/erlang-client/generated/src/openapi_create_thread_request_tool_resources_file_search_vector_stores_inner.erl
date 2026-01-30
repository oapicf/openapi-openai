-module(openapi_create_thread_request_tool_resources_file_search_vector_stores_inner).

-export([encode/1]).

-export_type([openapi_create_thread_request_tool_resources_file_search_vector_stores_inner/0]).

-type openapi_create_thread_request_tool_resources_file_search_vector_stores_inner() ::
    #{ 'file_ids' => list(),
       'chunking_strategy' => openapi_create_assistant_request_tool_resources_file_search_vector_stores_inner_chunking_strategy:openapi_create_assistant_request_tool_resources_file_search_vector_stores_inner_chunking_strategy(),
       'metadata' => maps:map()
     }.

encode(#{ 'file_ids' := FileIds,
          'chunking_strategy' := ChunkingStrategy,
          'metadata' := Metadata
        }) ->
    #{ 'file_ids' => FileIds,
       'chunking_strategy' => ChunkingStrategy,
       'metadata' => Metadata
     }.
