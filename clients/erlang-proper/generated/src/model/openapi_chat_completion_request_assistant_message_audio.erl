-module(openapi_chat_completion_request_assistant_message_audio).

-include("openapi.hrl").

-export([openapi_chat_completion_request_assistant_message_audio/0]).

-export([openapi_chat_completion_request_assistant_message_audio/1]).

-export_type([openapi_chat_completion_request_assistant_message_audio/0]).

-type openapi_chat_completion_request_assistant_message_audio() ::
  [ {'id', binary() }
  ].


openapi_chat_completion_request_assistant_message_audio() ->
    openapi_chat_completion_request_assistant_message_audio([]).

openapi_chat_completion_request_assistant_message_audio(Fields) ->
  Default = [ {'id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

