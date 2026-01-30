-module(openapi_create_thread_request_tool_resources_file_search).

-export([encode/1]).

-export_type([openapi_create_thread_request_tool_resources_file_search/0]).

-type openapi_create_thread_request_tool_resources_file_search() ::
    #{ 'vector_store_ids' => list(),
       'vector_stores' => list()
     }.

encode(#{ 'vector_store_ids' := VectorStoreIds,
          'vector_stores' := VectorStores
        }) ->
    #{ 'vector_store_ids' => VectorStoreIds,
       'vector_stores' => VectorStores
     }.
