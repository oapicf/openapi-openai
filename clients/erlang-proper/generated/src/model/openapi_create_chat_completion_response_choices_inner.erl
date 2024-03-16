-module(openapi_create_chat_completion_response_choices_inner).

-include("openapi.hrl").

-export([openapi_create_chat_completion_response_choices_inner/0]).

-export([openapi_create_chat_completion_response_choices_inner/1]).

-export_type([openapi_create_chat_completion_response_choices_inner/0]).

-type openapi_create_chat_completion_response_choices_inner() ::
  [ {'index', integer() }
  | {'message', openapi_chat_completion_response_message:openapi_chat_completion_response_message() }
  | {'finish_reason', binary() }
  ].


openapi_create_chat_completion_response_choices_inner() ->
    openapi_create_chat_completion_response_choices_inner([]).

openapi_create_chat_completion_response_choices_inner(Fields) ->
  Default = [ {'index', integer() }
            , {'message', openapi_chat_completion_response_message:openapi_chat_completion_response_message() }
            , {'finish_reason', elements([<<"stop">>, <<"length">>, <<"function_call">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

