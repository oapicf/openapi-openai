-module(openapi_realtime_server_event_response_text_done).

-export([encode/1]).

-export_type([openapi_realtime_server_event_response_text_done/0]).

-type openapi_realtime_server_event_response_text_done() ::
    #{ 'event_id' := binary(),
       'type' := binary(),
       'response_id' := binary(),
       'item_id' := binary(),
       'output_index' := integer(),
       'content_index' := integer(),
       'text' := binary()
     }.

encode(#{ 'event_id' := EventId,
          'type' := Type,
          'response_id' := ResponseId,
          'item_id' := ItemId,
          'output_index' := OutputIndex,
          'content_index' := ContentIndex,
          'text' := Text
        }) ->
    #{ 'event_id' => EventId,
       'type' => Type,
       'response_id' => ResponseId,
       'item_id' => ItemId,
       'output_index' => OutputIndex,
       'content_index' => ContentIndex,
       'text' => Text
     }.
