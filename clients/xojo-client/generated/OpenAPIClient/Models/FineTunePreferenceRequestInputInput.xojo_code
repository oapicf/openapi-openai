#tag Class
Protected Class FineTunePreferenceRequestInputInput

	#tag Property, Flags = &h0
		messages() As OpenAPIClient.Models.FineTuneChatRequestInputMessagesInner
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of tools the model may generate JSON inputs for.
		#tag EndNote
		tools() As OpenAPIClient.Models.ChatCompletionTool
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
		#tag EndNote
		parallel_tool_calls As Xoson.O.OptionalBoolean
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
			Type="FineTuneChatRequestInputMessagesInner"
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
			Name="parallel_tool_calls"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


