-module(openapi_chat_completion_message_tool_call_chunk).

-include("openapi.hrl").

-export([openapi_chat_completion_message_tool_call_chunk/0]).

-export([openapi_chat_completion_message_tool_call_chunk/1]).

-export_type([openapi_chat_completion_message_tool_call_chunk/0]).

-type openapi_chat_completion_message_tool_call_chunk() ::
  [ {'index', integer() }
  | {'id', binary() }
  | {'type', binary() }
  | {'function', openapi_chat_completion_message_tool_call_chunk_function:openapi_chat_completion_message_tool_call_chunk_function() }
  ].


openapi_chat_completion_message_tool_call_chunk() ->
    openapi_chat_completion_message_tool_call_chunk([]).

openapi_chat_completion_message_tool_call_chunk(Fields) ->
  Default = [ {'index', integer() }
            , {'id', binary() }
            , {'type', elements([<<"function">>]) }
            , {'function', openapi_chat_completion_message_tool_call_chunk_function:openapi_chat_completion_message_tool_call_chunk_function() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

