#tag Class
Protected Class CreateCompletionRequest

	#tag Property, Flags = &h0
		model As OpenAPIClient.Models.CreateCompletionRequestModel
	#tag EndProperty


	#tag Property, Flags = &h0
		prompt As OpenAPIClient.Models.CreateCompletionRequestPrompt
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The suffix that comes after a completion of inserted text.
		#tag EndNote
		suffix As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The maximum number of [tokens](/tokenizer) to generate in the completion.  The token count of your prompt plus `max_tokens` cannot exceed the model's context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. 
		#tag EndNote
		max_tokens As Xoson.O.OptionalInteger
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
			How many completions to generate for each prompt.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. 
		#tag EndNote
		n As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether to stream back partial progress. If set, tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb). 
		#tag EndNote
		stream As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Include the log probabilities on the `logprobs` most likely tokens, as well the chosen tokens. For example, if `logprobs` is 5, the API will return a list of the 5 most likely tokens. The API will always return the `logprob` of the sampled token, so there may be up to `logprobs+1` elements in the response.  The maximum value for `logprobs` is 5. 
		#tag EndNote
		logprobs As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Echo back the prompt in addition to the completion 
		#tag EndNote
		echo As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		stop As OpenAPIClient.Models.CreateCompletionRequestStop
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
		#tag EndNote
		presence_penalty As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
		#tag EndNote
		frequency_penalty As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Generates `best_of` completions server-side and returns the "best" (the one with the highest log probability per token). Results cannot be streamed.  When used with `n`, `best_of` controls the number of candidate completions and `n` specifies how many to return – `best_of` must be greater than `n`.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. 
		#tag EndNote
		best_of As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the GPT tokenizer) to an associated bias value from -100 to 100. You can use this [tokenizer tool](/tokenizer?view=bpe) (which works for both GPT-2 and GPT-3) to convert text to token IDs. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  As an example, you can pass `{"50256": -100}` to prevent the <|endoftext|> token from being generated. 
		#tag EndNote
		logit_bias As Object
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
		#tag EndNote
		user As Xoson.O.OptionalString
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
			Name="model"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateCompletionRequestModel"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="prompt"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateCompletionRequestPrompt"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="suffix"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
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
			Name="n"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
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
			Name="logprobs"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="echo"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="stop"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateCompletionRequestStop"
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
			Name="frequency_penalty"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="best_of"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="logit_bias"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Object"
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
	#tag EndViewBehavior
End Class
#tag EndClass


