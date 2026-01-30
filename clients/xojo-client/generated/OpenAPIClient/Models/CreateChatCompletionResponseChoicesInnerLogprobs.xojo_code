#tag Class
Protected Class CreateChatCompletionResponseChoicesInnerLogprobs

	#tag Property, Flags = &h0
		#tag Note
			A list of message content tokens with log probability information.
		#tag EndNote
		content() As OpenAPIClient.Models.ChatCompletionTokenLogprob
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of message refusal tokens with log probability information.
		#tag EndNote
		refusal() As OpenAPIClient.Models.ChatCompletionTokenLogprob
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
			Name="content"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ChatCompletionTokenLogprob"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="refusal"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ChatCompletionTokenLogprob"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


