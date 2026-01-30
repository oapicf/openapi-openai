-module(openapi_message_delta_content_refusal_object).

-include("openapi.hrl").

-export([openapi_message_delta_content_refusal_object/0]).

-export([openapi_message_delta_content_refusal_object/1]).

-export_type([openapi_message_delta_content_refusal_object/0]).

-type openapi_message_delta_content_refusal_object() ::
  [ {'index', integer() }
  | {'type', binary() }
  | {'refusal', binary() }
  ].


openapi_message_delta_content_refusal_object() ->
    openapi_message_delta_content_refusal_object([]).

openapi_message_delta_content_refusal_object(Fields) ->
  Default = [ {'index', integer() }
            , {'type', elements([<<"refusal">>]) }
            , {'refusal', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

