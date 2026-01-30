-module(openapi_message_content_refusal_object).

-include("openapi.hrl").

-export([openapi_message_content_refusal_object/0]).

-export([openapi_message_content_refusal_object/1]).

-export_type([openapi_message_content_refusal_object/0]).

-type openapi_message_content_refusal_object() ::
  [ {'type', binary() }
  | {'refusal', binary() }
  ].


openapi_message_content_refusal_object() ->
    openapi_message_content_refusal_object([]).

openapi_message_content_refusal_object(Fields) ->
  Default = [ {'type', elements([<<"refusal">>]) }
            , {'refusal', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

