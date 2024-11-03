-module(openapi_create_chat_completion_stream_response_choices_inner).

-include("openapi.hrl").

-export([openapi_create_chat_completion_stream_response_choices_inner/0]).

-export([openapi_create_chat_completion_stream_response_choices_inner/1]).

-export_type([openapi_create_chat_completion_stream_response_choices_inner/0]).

-type openapi_create_chat_completion_stream_response_choices_inner() ::
  [ {'delta', openapi_chat_completion_stream_response_delta:openapi_chat_completion_stream_response_delta() }
  | {'logprobs', openapi_create_chat_completion_response_choices_inner_logprobs:openapi_create_chat_completion_response_choices_inner_logprobs() }
  | {'finish_reason', binary() }
  | {'index', integer() }
  ].


openapi_create_chat_completion_stream_response_choices_inner() ->
    openapi_create_chat_completion_stream_response_choices_inner([]).

openapi_create_chat_completion_stream_response_choices_inner(Fields) ->
  Default = [ {'delta', openapi_chat_completion_stream_response_delta:openapi_chat_completion_stream_response_delta() }
            , {'logprobs', openapi_create_chat_completion_response_choices_inner_logprobs:openapi_create_chat_completion_response_choices_inner_logprobs() }
            , {'finish_reason', elements([<<"stop">>, <<"length">>, <<"tool_calls">>, <<"content_filter">>, <<"function_call">>]) }
            , {'index', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

