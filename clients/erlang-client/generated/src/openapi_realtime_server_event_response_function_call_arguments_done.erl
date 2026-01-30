-module(openapi_realtime_server_event_response_function_call_arguments_done).

-export([encode/1]).

-export_type([openapi_realtime_server_event_response_function_call_arguments_done/0]).

-type openapi_realtime_server_event_response_function_call_arguments_done() ::
    #{ 'event_id' := binary(),
       'type' := binary(),
       'response_id' := binary(),
       'item_id' := binary(),
       'output_index' := integer(),
       'call_id' := binary(),
       'arguments' := binary()
     }.

encode(#{ 'event_id' := EventId,
          'type' := Type,
          'response_id' := ResponseId,
          'item_id' := ItemId,
          'output_index' := OutputIndex,
          'call_id' := CallId,
          'arguments' := Arguments
        }) ->
    #{ 'event_id' => EventId,
       'type' => Type,
       'response_id' => ResponseId,
       'item_id' => ItemId,
       'output_index' => OutputIndex,
       'call_id' => CallId,
       'arguments' => Arguments
     }.
