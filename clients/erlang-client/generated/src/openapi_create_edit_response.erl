-module(openapi_create_edit_response).

-export([encode/1]).

-export_type([openapi_create_edit_response/0]).

-type openapi_create_edit_response() ::
    #{ 'object' := binary(),
       'created' := integer(),
       'choices' := list(),
       'usage' := openapi_create_completion_response_usage:openapi_create_completion_response_usage()
     }.

encode(#{ 'object' := Object,
          'created' := Created,
          'choices' := Choices,
          'usage' := Usage
        }) ->
    #{ 'object' => Object,
       'created' => Created,
       'choices' => Choices,
       'usage' => Usage
     }.
