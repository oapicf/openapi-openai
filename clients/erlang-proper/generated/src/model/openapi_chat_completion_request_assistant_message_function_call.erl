-module(openapi_chat_completion_request_assistant_message_function_call).

-include("openapi.hrl").

-export([openapi_chat_completion_request_assistant_message_function_call/0]).

-export([openapi_chat_completion_request_assistant_message_function_call/1]).

-export_type([openapi_chat_completion_request_assistant_message_function_call/0]).

-type openapi_chat_completion_request_assistant_message_function_call() ::
  [ {'arguments', binary() }
  | {'name', binary() }
  ].


openapi_chat_completion_request_assistant_message_function_call() ->
    openapi_chat_completion_request_assistant_message_function_call([]).

openapi_chat_completion_request_assistant_message_function_call(Fields) ->
  Default = [ {'arguments', binary() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

