-module(openapi_prediction_content).

-export([encode/1]).

-export_type([openapi_prediction_content/0]).

-type openapi_prediction_content() ::
    #{ 'type' := binary(),
       'content' := openapi_prediction_content_content:openapi_prediction_content_content()
     }.

encode(#{ 'type' := Type,
          'content' := Content
        }) ->
    #{ 'type' => Type,
       'content' => Content
     }.
