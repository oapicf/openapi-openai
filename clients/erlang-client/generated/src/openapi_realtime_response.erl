-module(openapi_realtime_response).

-export([encode/1]).

-export_type([openapi_realtime_response/0]).

-type openapi_realtime_response() ::
    #{ 'id' => binary(),
       'object' => binary(),
       'status' => binary(),
       'status_details' => openapi_realtime_response_status_details:openapi_realtime_response_status_details(),
       'output' => list(),
       'metadata' => maps:map(),
       'usage' => openapi_realtime_response_usage:openapi_realtime_response_usage()
     }.

encode(#{ 'id' := Id,
          'object' := Object,
          'status' := Status,
          'status_details' := StatusDetails,
          'output' := Output,
          'metadata' := Metadata,
          'usage' := Usage
        }) ->
    #{ 'id' => Id,
       'object' => Object,
       'status' => Status,
       'status_details' => StatusDetails,
       'output' => Output,
       'metadata' => Metadata,
       'usage' => Usage
     }.
