#tag Class
Protected Class OpenAIFile

	#tag Property, Flags = &h0
		#tag Note
			The file identifier, which can be referenced in the API endpoints.
		#tag EndNote
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The size of the file, in bytes.
		#tag EndNote
		bytes As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the file was created.
		#tag EndNote
		created_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name of the file.
		#tag EndNote
		filename As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The object type, which is always `file`.
		#tag EndNote
		object As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The intended purpose of the file. Supported values are `fine-tune`, `fine-tune-results`, `assistants`, and `assistants_output`.
		#tag EndNote
		purpose As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
		#tag EndNote
		Attributes( Deprecated ) status As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`.
		#tag EndNote
		Attributes( Deprecated ) status_details As Xoson.O.OptionalString
	#tag EndProperty


    #tag Enum, Name = ObjectEnum, Type = Integer, Flags = &h0
        
        Escapedfile
        
    #tag EndEnum

    #tag Enum, Name = PurposeEnum, Type = Integer, Flags = &h0
        
        FineTune
        FineTuneResults
        Assistants
        AssistantsOutput
        
    #tag EndEnum

    #tag Enum, Name = StatusEnum, Type = Integer, Flags = &h0
        
        Uploaded
        Processed
        Error
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function ObjectEnumToString(value As ObjectEnum) As String
		  Select Case value
		    
		    Case ObjectEnum.Escapedfile
		      Return "file"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function PurposeEnumToString(value As PurposeEnum) As String
		  Select Case value
		    
		    Case PurposeEnum.FineTune
		      Return "fine-tune"
		    Case PurposeEnum.FineTuneResults
		      Return "fine-tune-results"
		    Case PurposeEnum.Assistants
		      Return "assistants"
		    Case PurposeEnum.AssistantsOutput
		      Return "assistants_output"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function StatusEnumToString(value As StatusEnum) As String
		  Select Case value
		    
		    Case StatusEnum.Uploaded
		      Return "uploaded"
		    Case StatusEnum.Processed
		      Return "processed"
		    Case StatusEnum.Error
		      Return "error"
		    
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
			Name="bytes"
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
			Name="filename"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="status_details"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


