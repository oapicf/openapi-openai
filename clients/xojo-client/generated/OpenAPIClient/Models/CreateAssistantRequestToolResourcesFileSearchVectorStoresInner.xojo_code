#tag Class
Protected Class CreateAssistantRequestToolResourcesFileSearchVectorStoresInner

	#tag Property, Flags = &h0
		#tag Note
			A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store. 
		#tag EndNote
		file_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		chunking_strategy As OpenAPIClient.Models.CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
		#tag EndNote
		metadata As Object
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
			Name="file_ids"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="chunking_strategy"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy"
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
	#tag EndViewBehavior
End Class
#tag EndClass


