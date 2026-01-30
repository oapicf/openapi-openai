-module(openapi_chat_completion_request_assistant_message_content).

-include("openapi.hrl").

-export([openapi_chat_completion_request_assistant_message_content/0]).

-export([openapi_chat_completion_request_assistant_message_content/1]).

-export_type([openapi_chat_completion_request_assistant_message_content/0]).

-type openapi_chat_completion_request_assistant_message_content() ::
  [ 
  ].


openapi_chat_completion_request_assistant_message_content() ->
    openapi_chat_completion_request_assistant_message_content([]).

openapi_chat_completion_request_assistant_message_content(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

