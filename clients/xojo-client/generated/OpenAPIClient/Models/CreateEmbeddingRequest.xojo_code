#tag Class
Protected Class CreateEmbeddingRequest

	#tag Property, Flags = &h0
		model As OpenAPIClient.Models.CreateEmbeddingRequestModel
	#tag EndProperty


	#tag Property, Flags = &h0
		input As OpenAPIClient.Models.CreateEmbeddingRequestInput
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
			Type="CreateEmbeddingRequestModel"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="input"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateEmbeddingRequestInput"
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


