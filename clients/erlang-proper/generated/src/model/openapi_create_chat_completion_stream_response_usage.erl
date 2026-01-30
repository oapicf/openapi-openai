-module(openapi_create_chat_completion_stream_response_usage).

-include("openapi.hrl").

-export([openapi_create_chat_completion_stream_response_usage/0]).

-export([openapi_create_chat_completion_stream_response_usage/1]).

-export_type([openapi_create_chat_completion_stream_response_usage/0]).

-type openapi_create_chat_completion_stream_response_usage() ::
  [ {'completion_tokens', integer() }
  | {'prompt_tokens', integer() }
  | {'total_tokens', integer() }
  ].


openapi_create_chat_completion_stream_response_usage() ->
    openapi_create_chat_completion_stream_response_usage([]).

openapi_create_chat_completion_stream_response_usage(Fields) ->
  Default = [ {'completion_tokens', integer() }
            , {'prompt_tokens', integer() }
            , {'total_tokens', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

