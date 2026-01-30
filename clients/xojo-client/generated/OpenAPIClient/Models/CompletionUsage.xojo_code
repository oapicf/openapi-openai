#tag Class
Protected Class CompletionUsage

	#tag Property, Flags = &h0
		#tag Note
			Number of tokens in the generated completion.
		#tag EndNote
		completion_tokens As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Number of tokens in the prompt.
		#tag EndNote
		prompt_tokens As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Total number of tokens used in the request (prompt + completion).
		#tag EndNote
		total_tokens As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		completion_tokens_details As OpenAPIClient.Models.CompletionUsageCompletionTokensDetails
	#tag EndProperty


	#tag Property, Flags = &h0
		prompt_tokens_details As OpenAPIClient.Models.CompletionUsagePromptTokensDetails
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
			Name="completion_tokens"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="prompt_tokens"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="total_tokens"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="completion_tokens_details"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CompletionUsageCompletionTokensDetails"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="prompt_tokens_details"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CompletionUsagePromptTokensDetails"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


