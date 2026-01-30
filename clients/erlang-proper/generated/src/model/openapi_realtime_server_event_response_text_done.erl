-module(openapi_realtime_server_event_response_text_done).

-include("openapi.hrl").

-export([openapi_realtime_server_event_response_text_done/0]).

-export([openapi_realtime_server_event_response_text_done/1]).

-export_type([openapi_realtime_server_event_response_text_done/0]).

-type openapi_realtime_server_event_response_text_done() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'response_id', binary() }
  | {'item_id', binary() }
  | {'output_index', integer() }
  | {'content_index', integer() }
  | {'text', binary() }
  ].


openapi_realtime_server_event_response_text_done() ->
    openapi_realtime_server_event_response_text_done([]).

openapi_realtime_server_event_response_text_done(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"response.text.done">>]) }
            , {'response_id', binary() }
            , {'item_id', binary() }
            , {'output_index', integer() }
            , {'content_index', integer() }
            , {'text', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

