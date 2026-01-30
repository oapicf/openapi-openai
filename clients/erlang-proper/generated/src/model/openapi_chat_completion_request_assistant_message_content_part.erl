-module(openapi_chat_completion_request_assistant_message_content_part).

-include("openapi.hrl").

-export([openapi_chat_completion_request_assistant_message_content_part/0]).

-export([openapi_chat_completion_request_assistant_message_content_part/1]).

-export_type([openapi_chat_completion_request_assistant_message_content_part/0]).

-type openapi_chat_completion_request_assistant_message_content_part() ::
  [ {'type', binary() }
  | {'text', binary() }
  | {'refusal', binary() }
  ].


openapi_chat_completion_request_assistant_message_content_part() ->
    openapi_chat_completion_request_assistant_message_content_part([]).

openapi_chat_completion_request_assistant_message_content_part(Fields) ->
  Default = [ {'type', elements([<<"text">>, <<"refusal">>]) }
            , {'text', binary() }
            , {'refusal', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

