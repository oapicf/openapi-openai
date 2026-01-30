#tag Class
Protected Class CreateThreadAndRunRequest

	#tag Property, Flags = &h0
		#tag Note
			The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
		#tag EndNote
		assistant_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		thread As OpenAPIClient.Models.CreateThreadRequest
	#tag EndProperty


	#tag Property, Flags = &h0
		model As OpenAPIClient.Models.CreateRunRequestModel
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis.
		#tag EndNote
		instructions As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
		#tag EndNote
		tools() As OpenAPIClient.Models.CreateThreadAndRunRequestToolsInner
	#tag EndProperty


	#tag Property, Flags = &h0
		tool_resources As OpenAPIClient.Models.CreateThreadAndRunRequestToolResources
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
		#tag EndNote
		metadata As Object
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
		#tag EndNote
		temperature As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
		#tag EndNote
		top_p As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
		#tag EndNote
		stream As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
		#tag EndNote
		max_prompt_tokens As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
		#tag EndNote
		max_completion_tokens As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		truncation_strategy As OpenAPIClient.Models.TruncationObject
	#tag EndProperty


	#tag Property, Flags = &h0
		tool_choice As OpenAPIClient.Models.AssistantsApiToolChoiceOption
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
		#tag EndNote
		parallel_tool_calls As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		response_format As OpenAPIClient.Models.AssistantsApiResponseFormatOption
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
			Name="assistant_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="thread"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateThreadRequest"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="model"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateRunRequestModel"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="instructions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="tools"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateThreadAndRunRequestToolsInner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="tool_resources"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateThreadAndRunRequestToolResources"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="metadata"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Object"
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
			Name="stream"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="max_prompt_tokens"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="max_completion_tokens"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="truncation_strategy"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TruncationObject"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="tool_choice"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AssistantsApiToolChoiceOption"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="parallel_tool_calls"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="response_format"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AssistantsApiResponseFormatOption"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


