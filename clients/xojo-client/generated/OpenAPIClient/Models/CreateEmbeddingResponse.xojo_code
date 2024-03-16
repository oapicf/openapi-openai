#tag Class
Protected Class CreateEmbeddingResponse

	#tag Property, Flags = &h0
		object As String
	#tag EndProperty


	#tag Property, Flags = &h0
		model As String
	#tag EndProperty


	#tag Property, Flags = &h0
		data() As OpenAPIClient.Models.CreateEmbeddingResponseDataInner
	#tag EndProperty


	#tag Property, Flags = &h0
		usage As OpenAPIClient.Models.CreateEmbeddingResponseUsage
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
			Name="object"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="model"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="data"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateEmbeddingResponseDataInner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="usage"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateEmbeddingResponseUsage"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


