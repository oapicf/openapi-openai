-module(openapi_chat_completion_response_message).

-include("openapi.hrl").

-export([openapi_chat_completion_response_message/0]).

-export([openapi_chat_completion_response_message/1]).

-export_type([openapi_chat_completion_response_message/0]).

-type openapi_chat_completion_response_message() ::
  [ {'role', binary() }
  | {'content', binary() }
  | {'function_call', openapi_chat_completion_request_message_function_call:openapi_chat_completion_request_message_function_call() }
  ].


openapi_chat_completion_response_message() ->
    openapi_chat_completion_response_message([]).

openapi_chat_completion_response_message(Fields) ->
  Default = [ {'role', elements([<<"system">>, <<"user">>, <<"assistant">>, <<"function">>]) }
            , {'content', binary() }
            , {'function_call', openapi_chat_completion_request_message_function_call:openapi_chat_completion_request_message_function_call() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

