-module(openapi_create_thread_request_tool_resources_file_search).

-include("openapi.hrl").

-export([openapi_create_thread_request_tool_resources_file_search/0]).

-export([openapi_create_thread_request_tool_resources_file_search/1]).

-export_type([openapi_create_thread_request_tool_resources_file_search/0]).

-type openapi_create_thread_request_tool_resources_file_search() ::
  [ {'vector_store_ids', list(binary()) }
  | {'vector_stores', list(openapi_create_thread_request_tool_resources_file_search_vector_stores_inner:openapi_create_thread_request_tool_resources_file_search_vector_stores_inner()) }
  ].


openapi_create_thread_request_tool_resources_file_search() ->
    openapi_create_thread_request_tool_resources_file_search([]).

openapi_create_thread_request_tool_resources_file_search(Fields) ->
  Default = [ {'vector_store_ids', list(binary()) }
            , {'vector_stores', list(openapi_create_thread_request_tool_resources_file_search_vector_stores_inner:openapi_create_thread_request_tool_resources_file_search_vector_stores_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

