-module(openapi_message_delta_object).

-include("openapi.hrl").

-export([openapi_message_delta_object/0]).

-export([openapi_message_delta_object/1]).

-export_type([openapi_message_delta_object/0]).

-type openapi_message_delta_object() ::
  [ {'id', binary() }
  | {'object', binary() }
  | {'delta', openapi_message_delta_object_delta:openapi_message_delta_object_delta() }
  ].


openapi_message_delta_object() ->
    openapi_message_delta_object([]).

openapi_message_delta_object(Fields) ->
  Default = [ {'id', binary() }
            , {'object', elements([<<"thread.message.delta">>]) }
            , {'delta', openapi_message_delta_object_delta:openapi_message_delta_object_delta() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

