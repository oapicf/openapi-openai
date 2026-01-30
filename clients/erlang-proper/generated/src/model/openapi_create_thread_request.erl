-module(openapi_create_thread_request).

-include("openapi.hrl").

-export([openapi_create_thread_request/0]).

-export([openapi_create_thread_request/1]).

-export_type([openapi_create_thread_request/0]).

-type openapi_create_thread_request() ::
  [ {'messages', list(openapi_create_message_request:openapi_create_message_request()) }
  | {'tool_resources', openapi_create_thread_request_tool_resources:openapi_create_thread_request_tool_resources() }
  | {'metadata', map() }
  ].


openapi_create_thread_request() ->
    openapi_create_thread_request([]).

openapi_create_thread_request(Fields) ->
  Default = [ {'messages', list(openapi_create_message_request:openapi_create_message_request()) }
            , {'tool_resources', openapi_create_thread_request_tool_resources:openapi_create_thread_request_tool_resources() }
            , {'metadata', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

