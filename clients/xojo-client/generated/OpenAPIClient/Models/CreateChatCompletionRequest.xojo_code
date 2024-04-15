#tag Class
Protected Class CreateChatCompletionRequest

	#tag Property, Flags = &h0
		#tag Note
			A list of messages comprising the conversation so far. [Example Python code](https://cookbook.openai.com/examples/how_to_format_inputs_to_chatgpt_models).
		#tag EndNote
		messages() As OpenAPIClient.Models.ChatCompletionRequestMessage
	#tag EndProperty


	#tag Property, Flags = &h0
		model As OpenAPIClient.Models.CreateChatCompletionRequestModel
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) 
		#tag EndNote
		frequency_penalty As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. 
		#tag EndNote
		logit_bias As Dictionary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether to return log probabilities of the output tokens or not. If true, returns the log probabilities of each output token returned in the `content` of `message`.
		#tag EndNote
		logprobs As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			An integer between 0 and 20 specifying the number of most likely tokens to return at each token position, each with an associated log probability. `logprobs` must be set to `true` if this parameter is used.
		#tag EndNote
		top_logprobs As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The maximum number of [tokens](/tokenizer) that can be generated in the chat completion.  The total length of input tokens and generated tokens is limited by the model's context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. 
		#tag EndNote
		max_tokens As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			How many chat completion choices to generate for each input message. Note that you will be charged based on the number of generated tokens across all of the choices. Keep `n` as `1` to minimize costs.
		#tag EndNote
		n As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) 
		#tag EndNote
		presence_penalty As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		response_format As OpenAPIClient.Models.CreateChatCompletionRequestResponseFormat
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			This feature is in Beta. If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result. Determinism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend. 
		#tag EndNote
		seed As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		stop As OpenAPIClient.Models.CreateChatCompletionRequestStop
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). 
		#tag EndNote
		stream As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
		#tag EndNote
		temperature As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
		#tag EndNote
		top_p As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of tools the model may call. Currently, only functions are supported as a tool. Use this to provide a list of functions the model may generate JSON inputs for. A max of 128 functions are supported. 
		#tag EndNote
		tools() As OpenAPIClient.Models.ChatCompletionTool
	#tag EndProperty


	#tag Property, Flags = &h0
		tool_choice As OpenAPIClient.Models.ChatCompletionToolChoiceOption
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
		#tag EndNote
		user As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		Attributes( Deprecated ) function_call As OpenAPIClient.Models.CreateChatCompletionRequestFunctionCall
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Deprecated in favor of `tools`.  A list of functions the model may generate JSON inputs for. 
		#tag EndNote
		Attributes( Deprecated ) functions() As OpenAPIClient.Models.ChatCompletionFunctions
	#tag EndProperty





	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="messages"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ChatCompletionRequestMessage"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="model"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateChatCompletionRequestModel"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="frequency_penalty"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="logit_bias"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Dictionary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="logprobs"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="top_logprobs"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="max_tokens"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="n"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="presence_penalty"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="response_format"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateChatCompletionRequestResponseFormat"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="seed"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="stop"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateChatCompletionRequestStop"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="stream"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="temperature"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="top_p"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="tools"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ChatCompletionTool"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="tool_choice"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ChatCompletionToolChoiceOption"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="user"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="function_call"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateChatCompletionRequestFunctionCall"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="functions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ChatCompletionFunctions"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass

