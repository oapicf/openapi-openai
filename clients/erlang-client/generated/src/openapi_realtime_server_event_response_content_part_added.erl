-module(openapi_realtime_server_event_response_content_part_added).

-export([encode/1]).

-export_type([openapi_realtime_server_event_response_content_part_added/0]).

-type openapi_realtime_server_event_response_content_part_added() ::
    #{ 'event_id' := binary(),
       'type' := binary(),
       'response_id' := binary(),
       'item_id' := binary(),
       'output_index' := integer(),
       'content_index' := integer(),
       'part' := openapi_realtime_server_event_response_content_part_added_part:openapi_realtime_server_event_response_content_part_added_part()
     }.

encode(#{ 'event_id' := EventId,
          'type' := Type,
          'response_id' := ResponseId,
          'item_id' := ItemId,
          'output_index' := OutputIndex,
          'content_index' := ContentIndex,
          'part' := Part
        }) ->
    #{ 'event_id' => EventId,
       'type' => Type,
       'response_id' => ResponseId,
       'item_id' => ItemId,
       'output_index' => OutputIndex,
       'content_index' => ContentIndex,
       'part' => Part
     }.
