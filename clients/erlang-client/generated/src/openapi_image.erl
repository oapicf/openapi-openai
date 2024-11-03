-module(openapi_image).

-export([encode/1]).

-export_type([openapi_image/0]).

-type openapi_image() ::
    #{ 'b64_json' => binary(),
       'url' => binary(),
       'revised_prompt' => binary()
     }.

encode(#{ 'b64_json' := B64Json,
          'url' := Url,
          'revised_prompt' := RevisedPrompt
        }) ->
    #{ 'b64_json' => B64Json,
       'url' => Url,
       'revised_prompt' => RevisedPrompt
     }.
