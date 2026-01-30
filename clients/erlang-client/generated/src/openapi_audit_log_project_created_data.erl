-module(openapi_audit_log_project_created_data).

-export([encode/1]).

-export_type([openapi_audit_log_project_created_data/0]).

-type openapi_audit_log_project_created_data() ::
    #{ 'name' => binary(),
       'title' => binary()
     }.

encode(#{ 'name' := Name,
          'title' := Title
        }) ->
    #{ 'name' => Name,
       'title' => Title
     }.
