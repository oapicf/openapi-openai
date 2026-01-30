#tag Class
Protected Class CreateVectorStoreFileRequest

	#tag Property, Flags = &h0
		#tag Note
			A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like `file_search` that can access files.
		#tag EndNote
		file_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		chunking_strategy As OpenAPIClient.Models.ChunkingStrategyRequestParam
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
			Name="file_id"
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
			Type="ChunkingStrategyRequestParam"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


