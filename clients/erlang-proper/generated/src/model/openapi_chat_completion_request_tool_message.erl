-module(openapi_chat_completion_request_tool_message).

-include("openapi.hrl").

-export([openapi_chat_completion_request_tool_message/0]).

-export([openapi_chat_completion_request_tool_message/1]).

-export_type([openapi_chat_completion_request_tool_message/0]).

-type openapi_chat_completion_request_tool_message() ::
  [ {'role', binary() }
  | {'content', openapi_chat_completion_request_tool_message_content:openapi_chat_completion_request_tool_message_content() }
  | {'tool_call_id', binary() }
  ].


openapi_chat_completion_request_tool_message() ->
    openapi_chat_completion_request_tool_message([]).

openapi_chat_completion_request_tool_message(Fields) ->
  Default = [ {'role', elements([<<"tool">>]) }
            , {'content', openapi_chat_completion_request_tool_message_content:openapi_chat_completion_request_tool_message_content() }
            , {'tool_call_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

