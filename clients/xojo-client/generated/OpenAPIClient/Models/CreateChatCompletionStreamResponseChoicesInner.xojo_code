#tag Class
Protected Class CreateChatCompletionStreamResponseChoicesInner

	#tag Property, Flags = &h0
		delta As OpenAPIClient.Models.ChatCompletionStreamResponseDelta
	#tag EndProperty


	#tag Property, Flags = &h0
		logprobs As OpenAPIClient.Models.CreateChatCompletionResponseChoicesInnerLogprobs
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
		#tag EndNote
		finish_reason As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The index of the choice in the list of choices.
		#tag EndNote
		index As Integer
	#tag EndProperty


    #tag Enum, Name = Finish_reasonEnum, Type = Integer, Flags = &h0
        
        Stop
        Length
        ToolCalls
        ContentFilter
        FunctionCall
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Finish_reasonEnumToString(value As Finish_reasonEnum) As String
		  Select Case value
		    
		    Case Finish_reasonEnum.Stop
		      Return "stop"
		    Case Finish_reasonEnum.Length
		      Return "length"
		    Case Finish_reasonEnum.ToolCalls
		      Return "tool_calls"
		    Case Finish_reasonEnum.ContentFilter
		      Return "content_filter"
		    Case Finish_reasonEnum.FunctionCall
		      Return "function_call"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod


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
			Name="delta"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ChatCompletionStreamResponseDelta"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="logprobs"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateChatCompletionResponseChoicesInnerLogprobs"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="index"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


