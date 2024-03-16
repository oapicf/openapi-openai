#tag Class
Protected Class CreateCompletionResponseChoicesInnerLogprobs

	#tag Property, Flags = &h0
		tokens() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		token_logprobs() As Double
	#tag EndProperty


	#tag Property, Flags = &h0
		top_logprobs() As Object
	#tag EndProperty


	#tag Property, Flags = &h0
		text_offset() As Integer
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
			Name="tokens"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="token_logprobs"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="top_logprobs"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Object"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="text_offset"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


