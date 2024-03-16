-module(openapi_chat_completion_stream_response_delta).

-include("openapi.hrl").

-export([openapi_chat_completion_stream_response_delta/0]).

-export([openapi_chat_completion_stream_response_delta/1]).

-export_type([openapi_chat_completion_stream_response_delta/0]).

-type openapi_chat_completion_stream_response_delta() ::
  [ {'role', binary() }
  | {'content', binary() }
  | {'function_call', openapi_chat_completion_request_message_function_call:openapi_chat_completion_request_message_function_call() }
  ].


openapi_chat_completion_stream_response_delta() ->
    openapi_chat_completion_stream_response_delta([]).

openapi_chat_completion_stream_response_delta(Fields) ->
  Default = [ {'role', elements([<<"system">>, <<"user">>, <<"assistant">>, <<"function">>]) }
            , {'content', binary() }
            , {'function_call', openapi_chat_completion_request_message_function_call:openapi_chat_completion_request_message_function_call() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

