# openapi::CreateChatCompletionRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | [**CreateChatCompletionRequestModel**](CreateChatCompletionRequest_model.md) |  | 
**messages** | [**array[ChatCompletionRequestMessage]**](ChatCompletionRequestMessage.md) | A list of messages comprising the conversation so far. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_format_inputs_to_ChatGPT_models.ipynb). | [Min. items: 1] 
**functions** | [**array[ChatCompletionFunctions]**](ChatCompletionFunctions.md) | A list of functions the model may generate JSON inputs for. | [optional] [Min. items: 1] 
**function_call** | [**CreateChatCompletionRequestFunctionCall**](CreateChatCompletionRequest_function_call.md) |  | [optional] 
**temperature** | **numeric** | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or &#x60;top_p&#x60; but not both.  | [optional] [default to 1] [Max: 2] [Min: 0] 
**top_p** | **numeric** | An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both.  | [optional] [default to 1] [Max: 1] [Min: 0] 
**n** | **integer** | How many chat completion choices to generate for each input message. | [optional] [default to 1] [Max: 128] [Min: 1] 
**stream** | **character** | If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a &#x60;data: [DONE]&#x60; message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb).  | [optional] [default to FALSE] 
**stop** | [**CreateChatCompletionRequestStop**](CreateChatCompletionRequest_stop.md) |  | [optional] 
**max_tokens** | **integer** | The maximum number of [tokens](/tokenizer) to generate in the chat completion.  The total length of input tokens and generated tokens is limited by the model&#39;s context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens.  | [optional] 
**presence_penalty** | **numeric** | Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model&#39;s likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details)  | [optional] [default to 0] [Max: 2] [Min: -2] 
**frequency_penalty** | **numeric** | Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model&#39;s likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details)  | [optional] [default to 0] [Max: 2] [Min: -2] 
**logit_bias** | **object** | Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  | [optional] 
**user** | **character** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

