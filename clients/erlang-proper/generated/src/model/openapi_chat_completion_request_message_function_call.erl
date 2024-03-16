-module(openapi_chat_completion_request_message_function_call).

-include("openapi.hrl").

-export([openapi_chat_completion_request_message_function_call/0]).

-export([openapi_chat_completion_request_message_function_call/1]).

-export_type([openapi_chat_completion_request_message_function_call/0]).

-type openapi_chat_completion_request_message_function_call() ::
  [ {'name', binary() }
  | {'arguments', binary() }
  ].


openapi_chat_completion_request_message_function_call() ->
    openapi_chat_completion_request_message_function_call([]).

openapi_chat_completion_request_message_function_call(Fields) ->
  Default = [ {'name', binary() }
            , {'arguments', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

