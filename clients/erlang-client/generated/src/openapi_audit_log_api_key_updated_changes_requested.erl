-module(openapi_audit_log_api_key_updated_changes_requested).

-export([encode/1]).

-export_type([openapi_audit_log_api_key_updated_changes_requested/0]).

-type openapi_audit_log_api_key_updated_changes_requested() ::
    #{ 'scopes' => list()
     }.

encode(#{ 'scopes' := Scopes
        }) ->
    #{ 'scopes' => Scopes
     }.
