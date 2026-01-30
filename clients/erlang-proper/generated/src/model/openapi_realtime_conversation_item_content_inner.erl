-module(openapi_realtime_conversation_item_content_inner).

-include("openapi.hrl").

-export([openapi_realtime_conversation_item_content_inner/0]).

-export([openapi_realtime_conversation_item_content_inner/1]).

-export_type([openapi_realtime_conversation_item_content_inner/0]).

-type openapi_realtime_conversation_item_content_inner() ::
  [ {'type', binary() }
  | {'text', binary() }
  | {'id', binary() }
  | {'audio', binary() }
  | {'transcript', binary() }
  ].


openapi_realtime_conversation_item_content_inner() ->
    openapi_realtime_conversation_item_content_inner([]).

openapi_realtime_conversation_item_content_inner(Fields) ->
  Default = [ {'type', elements([<<"input_audio">>, <<"input_text">>, <<"item_reference">>, <<"text">>]) }
            , {'text', binary() }
            , {'id', binary() }
            , {'audio', binary() }
            , {'transcript', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

