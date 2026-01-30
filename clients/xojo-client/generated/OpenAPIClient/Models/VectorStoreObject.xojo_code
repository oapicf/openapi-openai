#tag Class
Protected Class VectorStoreObject

	#tag Property, Flags = &h0
		#tag Note
			The identifier, which can be referenced in API endpoints.
		#tag EndNote
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The object type, which is always `vector_store`.
		#tag EndNote
		object As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the vector store was created.
		#tag EndNote
		created_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name of the vector store.
		#tag EndNote
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The total number of bytes used by the files in the vector store.
		#tag EndNote
		usage_bytes As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		file_counts As OpenAPIClient.Models.VectorStoreObjectFileCounts
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.
		#tag EndNote
		status As String
	#tag EndProperty


	#tag Property, Flags = &h0
		expires_after As OpenAPIClient.Models.VectorStoreExpirationAfter
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the vector store will expire.
		#tag EndNote
		expires_at As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the vector store was last active.
		#tag EndNote
		last_active_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
		#tag EndNote
		metadata As Object
	#tag EndProperty


    #tag Enum, Name = ObjectEnum, Type = Integer, Flags = &h0
        
        VectorStore
        
    #tag EndEnum

    #tag Enum, Name = StatusEnum, Type = Integer, Flags = &h0
        
        Expired
        InProgress
        Completed
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function ObjectEnumToString(value As ObjectEnum) As String
		  Select Case value
		    
		    Case ObjectEnum.VectorStore
		      Return "vector_store"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function StatusEnumToString(value As StatusEnum) As String
		  Select Case value
		    
		    Case StatusEnum.Expired
		      Return "expired"
		    Case StatusEnum.InProgress
		      Return "in_progress"
		    Case StatusEnum.Completed
		      Return "completed"
		    
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
			Name="created_at"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="name"
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
			Name="file_counts"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="VectorStoreObjectFileCounts"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="expires_after"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="VectorStoreExpirationAfter"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="expires_at"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="last_active_at"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
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


