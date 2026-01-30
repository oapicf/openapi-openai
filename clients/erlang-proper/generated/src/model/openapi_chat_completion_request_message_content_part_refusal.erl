-module(openapi_chat_completion_request_message_content_part_refusal).

-include("openapi.hrl").

-export([openapi_chat_completion_request_message_content_part_refusal/0]).

-export([openapi_chat_completion_request_message_content_part_refusal/1]).

-export_type([openapi_chat_completion_request_message_content_part_refusal/0]).

-type openapi_chat_completion_request_message_content_part_refusal() ::
  [ {'type', binary() }
  | {'refusal', binary() }
  ].


openapi_chat_completion_request_message_content_part_refusal() ->
    openapi_chat_completion_request_message_content_part_refusal([]).

openapi_chat_completion_request_message_content_part_refusal(Fields) ->
  Default = [ {'type', elements([<<"refusal">>]) }
            , {'refusal', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

