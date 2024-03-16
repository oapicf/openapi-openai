-module(openapi_create_chat_completion_stream_response_choices_inner).

-include("openapi.hrl").

-export([openapi_create_chat_completion_stream_response_choices_inner/0]).

-export([openapi_create_chat_completion_stream_response_choices_inner/1]).

-export_type([openapi_create_chat_completion_stream_response_choices_inner/0]).

-type openapi_create_chat_completion_stream_response_choices_inner() ::
  [ {'index', integer() }
  | {'delta', openapi_chat_completion_stream_response_delta:openapi_chat_completion_stream_response_delta() }
  | {'finish_reason', binary() }
  ].


openapi_create_chat_completion_stream_response_choices_inner() ->
    openapi_create_chat_completion_stream_response_choices_inner([]).

openapi_create_chat_completion_stream_response_choices_inner(Fields) ->
  Default = [ {'index', integer() }
            , {'delta', openapi_chat_completion_stream_response_delta:openapi_chat_completion_stream_response_delta() }
            , {'finish_reason', elements([<<"stop">>, <<"length">>, <<"function_call">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

