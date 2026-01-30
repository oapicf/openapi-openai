-module(openapi_realtime_conversation_item).

-include("openapi.hrl").

-export([openapi_realtime_conversation_item/0]).

-export([openapi_realtime_conversation_item/1]).

-export_type([openapi_realtime_conversation_item/0]).

-type openapi_realtime_conversation_item() ::
  [ {'id', binary() }
  | {'type', binary() }
  | {'object', binary() }
  | {'status', binary() }
  | {'role', binary() }
  | {'content', list(openapi_realtime_conversation_item_content_inner:openapi_realtime_conversation_item_content_inner()) }
  | {'call_id', binary() }
  | {'name', binary() }
  | {'arguments', binary() }
  | {'output', binary() }
  ].


openapi_realtime_conversation_item() ->
    openapi_realtime_conversation_item([]).

openapi_realtime_conversation_item(Fields) ->
  Default = [ {'id', binary() }
            , {'type', elements([<<"message">>, <<"function_call">>, <<"function_call_output">>]) }
            , {'object', elements([<<"realtime.item">>]) }
            , {'status', elements([<<"completed">>, <<"incomplete">>]) }
            , {'role', elements([<<"user">>, <<"assistant">>, <<"system">>]) }
            , {'content', list(openapi_realtime_conversation_item_content_inner:openapi_realtime_conversation_item_content_inner()) }
            , {'call_id', binary() }
            , {'name', binary() }
            , {'arguments', binary() }
            , {'output', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

