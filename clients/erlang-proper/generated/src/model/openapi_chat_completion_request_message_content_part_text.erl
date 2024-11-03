-module(openapi_chat_completion_request_message_content_part_text).

-include("openapi.hrl").

-export([openapi_chat_completion_request_message_content_part_text/0]).

-export([openapi_chat_completion_request_message_content_part_text/1]).

-export_type([openapi_chat_completion_request_message_content_part_text/0]).

-type openapi_chat_completion_request_message_content_part_text() ::
  [ {'type', binary() }
  | {'text', binary() }
  ].


openapi_chat_completion_request_message_content_part_text() ->
    openapi_chat_completion_request_message_content_part_text([]).

openapi_chat_completion_request_message_content_part_text(Fields) ->
  Default = [ {'type', elements([<<"text">>]) }
            , {'text', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

