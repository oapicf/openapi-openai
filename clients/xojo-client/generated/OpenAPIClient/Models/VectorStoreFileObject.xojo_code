#tag Class
Protected Class VectorStoreFileObject

	#tag Property, Flags = &h0
		#tag Note
			The identifier, which can be referenced in API endpoints.
		#tag EndNote
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The object type, which is always `vector_store.file`.
		#tag EndNote
		object As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The total vector store usage in bytes. Note that this may be different from the original file size.
		#tag EndNote
		usage_bytes As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the vector store file was created.
		#tag EndNote
		created_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
		#tag EndNote
		vector_store_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.
		#tag EndNote
		status As String
	#tag EndProperty


	#tag Property, Flags = &h0
		last_error As OpenAPIClient.Models.VectorStoreFileObjectLastError
	#tag EndProperty


	#tag Property, Flags = &h0
		chunking_strategy As OpenAPIClient.Models.VectorStoreFileObjectChunkingStrategy
	#tag EndProperty


    #tag Enum, Name = ObjectEnum, Type = Integer, Flags = &h0
        
        VectorStorePeriodFile
        
    #tag EndEnum

    #tag Enum, Name = StatusEnum, Type = Integer, Flags = &h0
        
        InProgress
        Completed
        Cancelled
        Failed
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function ObjectEnumToString(value As ObjectEnum) As String
		  Select Case value
		    
		    Case ObjectEnum.VectorStorePeriodFile
		      Return "vector_store.file"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function StatusEnumToString(value As StatusEnum) As String
		  Select Case value
		    
		    Case StatusEnum.InProgress
		      Return "in_progress"
		    Case StatusEnum.Completed
		      Return "completed"
		    Case StatusEnum.Cancelled
		      Return "cancelled"
		    Case StatusEnum.Failed
		      Return "failed"
		    
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
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="usage_bytes"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="created_at"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="vector_store_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="last_error"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="VectorStoreFileObjectLastError"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="chunking_strategy"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="VectorStoreFileObjectChunkingStrategy"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


