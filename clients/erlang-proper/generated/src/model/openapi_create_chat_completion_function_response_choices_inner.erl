-module(openapi_create_chat_completion_function_response_choices_inner).

-include("openapi.hrl").

-export([openapi_create_chat_completion_function_response_choices_inner/0]).

-export([openapi_create_chat_completion_function_response_choices_inner/1]).

-export_type([openapi_create_chat_completion_function_response_choices_inner/0]).

-type openapi_create_chat_completion_function_response_choices_inner() ::
  [ {'finish_reason', binary() }
  | {'index', integer() }
  | {'message', openapi_chat_completion_response_message:openapi_chat_completion_response_message() }
  ].


openapi_create_chat_completion_function_response_choices_inner() ->
    openapi_create_chat_completion_function_response_choices_inner([]).

openapi_create_chat_completion_function_response_choices_inner(Fields) ->
  Default = [ {'finish_reason', elements([<<"stop">>, <<"length">>, <<"function_call">>, <<"content_filter">>]) }
            , {'index', integer() }
            , {'message', openapi_chat_completion_response_message:openapi_chat_completion_response_message() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

