-module(openapi_realtime_server_event_response_function_call_arguments_delta).

-export([encode/1]).

-export_type([openapi_realtime_server_event_response_function_call_arguments_delta/0]).

-type openapi_realtime_server_event_response_function_call_arguments_delta() ::
    #{ 'event_id' := binary(),
       'type' := binary(),
       'response_id' := binary(),
       'item_id' := binary(),
       'output_index' := integer(),
       'call_id' := binary(),
       'delta' := binary()
     }.

encode(#{ 'event_id' := EventId,
          'type' := Type,
          'response_id' := ResponseId,
          'item_id' := ItemId,
          'output_index' := OutputIndex,
          'call_id' := CallId,
          'delta' := Delta
        }) ->
    #{ 'event_id' => EventId,
       'type' => Type,
       'response_id' => ResponseId,
       'item_id' => ItemId,
       'output_index' => OutputIndex,
       'call_id' => CallId,
       'delta' => Delta
     }.
