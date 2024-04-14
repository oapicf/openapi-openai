-module(openapi_message_object_incomplete_details).

-export([encode/1]).

-export_type([openapi_message_object_incomplete_details/0]).

-type openapi_message_object_incomplete_details() ::
    #{ 'reason' := binary()
     }.

encode(#{ 'reason' := Reason
        }) ->
    #{ 'reason' => Reason
     }.
