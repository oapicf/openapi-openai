-module(openapi_message_content_text_object).

-include("openapi.hrl").

-export([openapi_message_content_text_object/0]).

-export([openapi_message_content_text_object/1]).

-export_type([openapi_message_content_text_object/0]).

-type openapi_message_content_text_object() ::
  [ {'type', binary() }
  | {'text', openapi_message_content_text_object_text:openapi_message_content_text_object_text() }
  ].


openapi_message_content_text_object() ->
    openapi_message_content_text_object([]).

openapi_message_content_text_object(Fields) ->
  Default = [ {'type', elements([<<"text">>]) }
            , {'text', openapi_message_content_text_object_text:openapi_message_content_text_object_text() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

