-module(openapi_audit_log_event_type).

-export([encode/1]).

-export_type([openapi_audit_log_event_type/0]).

-type openapi_audit_log_event_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
