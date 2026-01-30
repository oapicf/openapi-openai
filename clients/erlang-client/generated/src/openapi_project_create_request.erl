-module(openapi_project_create_request).

-export([encode/1]).

-export_type([openapi_project_create_request/0]).

-type openapi_project_create_request() ::
    #{ 'name' := binary()
     }.

encode(#{ 'name' := Name
        }) ->
    #{ 'name' => Name
     }.
