-module(openapi_create_moderation_response).

-export([encode/1]).

-export_type([openapi_create_moderation_response/0]).

-type openapi_create_moderation_response() ::
    #{ 'id' := binary(),
       'model' := binary(),
       'results' := list()
     }.

encode(#{ 'id' := Id,
          'model' := Model,
          'results' := Results
        }) ->
    #{ 'id' => Id,
       'model' => Model,
       'results' => Results
     }.
