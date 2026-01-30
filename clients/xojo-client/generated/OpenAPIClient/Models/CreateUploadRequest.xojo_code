#tag Class
Protected Class CreateUploadRequest

	#tag Property, Flags = &h0
		#tag Note
			The name of the file to upload. 
		#tag EndNote
		filename As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). 
		#tag EndNote
		purpose As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The number of bytes in the file you are uploading. 
		#tag EndNote
		bytes As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision. 
		#tag EndNote
		mime_type As String
	#tag EndProperty


    #tag Enum, Name = PurposeEnum, Type = Integer, Flags = &h0
        
        Assistants
        Batch
        FineTune
        Vision
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function PurposeEnumToString(value As PurposeEnum) As String
		  Select Case value
		    
		    Case PurposeEnum.Assistants
		      Return "assistants"
		    Case PurposeEnum.Batch
		      Return "batch"
		    Case PurposeEnum.FineTune
		      Return "fine-tune"
		    Case PurposeEnum.Vision
		      Return "vision"
		    
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
			Name="mime_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


