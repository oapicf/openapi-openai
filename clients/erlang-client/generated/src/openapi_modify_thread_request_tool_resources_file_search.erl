-module(openapi_modify_thread_request_tool_resources_file_search).

-export([encode/1]).

-export_type([openapi_modify_thread_request_tool_resources_file_search/0]).

-type openapi_modify_thread_request_tool_resources_file_search() ::
    #{ 'vector_store_ids' => list()
     }.

encode(#{ 'vector_store_ids' := VectorStoreIds
        }) ->
    #{ 'vector_store_ids' => VectorStoreIds
     }.
