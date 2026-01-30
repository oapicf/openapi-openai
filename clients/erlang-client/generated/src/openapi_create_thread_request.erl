-module(openapi_create_thread_request).

-export([encode/1]).

-export_type([openapi_create_thread_request/0]).

-type openapi_create_thread_request() ::
    #{ 'messages' => list(),
       'tool_resources' => openapi_create_thread_request_tool_resources:openapi_create_thread_request_tool_resources(),
       'metadata' => maps:map()
     }.

encode(#{ 'messages' := Messages,
          'tool_resources' := ToolResources,
          'metadata' := Metadata
        }) ->
    #{ 'messages' => Messages,
       'tool_resources' => ToolResources,
       'metadata' => Metadata
     }.
