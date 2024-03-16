-module(openapi_create_edit_request).

-export([encode/1]).

-export_type([openapi_create_edit_request/0]).

-type openapi_create_edit_request() ::
    #{ 'model' := openapi_create_edit_request_model:openapi_create_edit_request_model(),
       'input' => binary(),
       'instruction' := binary(),
       'n' => integer(),
       'temperature' => integer(),
       'top_p' => integer()
     }.

encode(#{ 'model' := Model,
          'input' := Input,
          'instruction' := Instruction,
          'n' := N,
          'temperature' := Temperature,
          'top_p' := TopP
        }) ->
    #{ 'model' => Model,
       'input' => Input,
       'instruction' => Instruction,
       'n' => N,
       'temperature' => Temperature,
       'top_p' => TopP
     }.
