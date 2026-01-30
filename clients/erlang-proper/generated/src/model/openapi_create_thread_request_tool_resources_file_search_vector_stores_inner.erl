-module(openapi_create_thread_request_tool_resources_file_search_vector_stores_inner).

-include("openapi.hrl").

-export([openapi_create_thread_request_tool_resources_file_search_vector_stores_inner/0]).

-export([openapi_create_thread_request_tool_resources_file_search_vector_stores_inner/1]).

-export_type([openapi_create_thread_request_tool_resources_file_search_vector_stores_inner/0]).

-type openapi_create_thread_request_tool_resources_file_search_vector_stores_inner() ::
  [ {'file_ids', list(binary()) }
  | {'chunking_strategy', openapi_create_assistant_request_tool_resources_file_search_vector_stores_inner_chunking_strategy:openapi_create_assistant_request_tool_resources_file_search_vector_stores_inner_chunking_strategy() }
  | {'metadata', map() }
  ].


openapi_create_thread_request_tool_resources_file_search_vector_stores_inner() ->
    openapi_create_thread_request_tool_resources_file_search_vector_stores_inner([]).

openapi_create_thread_request_tool_resources_file_search_vector_stores_inner(Fields) ->
  Default = [ {'file_ids', list(binary()) }
            , {'chunking_strategy', openapi_create_assistant_request_tool_resources_file_search_vector_stores_inner_chunking_strategy:openapi_create_assistant_request_tool_resources_file_search_vector_stores_inner_chunking_strategy() }
            , {'metadata', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

