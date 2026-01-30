#tag Class
Protected Class Upload

	#tag Property, Flags = &h0
		#tag Note
			The Upload unique identifier, which can be referenced in API endpoints.
		#tag EndNote
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the Upload was created.
		#tag EndNote
		created_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name of the file to be uploaded.
		#tag EndNote
		filename As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The intended number of bytes to be uploaded.
		#tag EndNote
		bytes As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.
		#tag EndNote
		purpose As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The status of the Upload.
		#tag EndNote
		status As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the Upload was created.
		#tag EndNote
		expires_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The object type, which is always "upload".
		#tag EndNote
		object As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		Escapedfile As OpenAPIClient.Models.OpenAIFile
	#tag EndProperty


    #tag Enum, Name = StatusEnum, Type = Integer, Flags = &h0
        
        Pending
        Completed
        Cancelled
        Expired
        
    #tag EndEnum

    #tag Enum, Name = ObjectEnum, Type = Integer, Flags = &h0
        
        Upload
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function StatusEnumToString(value As StatusEnum) As String
		  Select Case value
		    
		    Case StatusEnum.Pending
		      Return "pending"
		    Case StatusEnum.Completed
		      Return "completed"
		    Case StatusEnum.Cancelled
		      Return "cancelled"
		    Case StatusEnum.Expired
		      Return "expired"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function ObjectEnumToString(value As ObjectEnum) As String
		  Select Case value
		    
		    Case ObjectEnum.Upload
		      Return "upload"
		    
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
			Name="filename"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="bytes"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="purpose"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
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
			Name="Escapedfile"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OpenAIFile"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


