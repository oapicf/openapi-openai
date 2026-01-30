-module(openapi_message_request_content_text_object).

-include("openapi.hrl").

-export([openapi_message_request_content_text_object/0]).

-export([openapi_message_request_content_text_object/1]).

-export_type([openapi_message_request_content_text_object/0]).

-type openapi_message_request_content_text_object() ::
  [ {'type', binary() }
  | {'text', binary() }
  ].


openapi_message_request_content_text_object() ->
    openapi_message_request_content_text_object([]).

openapi_message_request_content_text_object(Fields) ->
  Default = [ {'type', elements([<<"text">>]) }
            , {'text', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

