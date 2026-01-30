-module(openapi_project_api_key_owner).

-export([encode/1]).

-export_type([openapi_project_api_key_owner/0]).

-type openapi_project_api_key_owner() ::
    #{ 'type' => binary(),
       'user' => openapi_project_user:openapi_project_user(),
       'service_account' => openapi_project_service_account:openapi_project_service_account()
     }.

encode(#{ 'type' := Type,
          'user' := User,
          'service_account' := ServiceAccount
        }) ->
    #{ 'type' => Type,
       'user' => User,
       'service_account' => ServiceAccount
     }.
