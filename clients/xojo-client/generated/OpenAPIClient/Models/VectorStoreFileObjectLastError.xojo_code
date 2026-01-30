#tag Class
Protected Class VectorStoreFileObjectLastError

	#tag Property, Flags = &h0
		#tag Note
			One of `server_error` or `rate_limit_exceeded`.
		#tag EndNote
		code As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A human-readable description of the error.
		#tag EndNote
		message As String
	#tag EndProperty


    #tag Enum, Name = CodeEnum, Type = Integer, Flags = &h0
        
        ServerError
        UnsupportedFile
        InvalidFile
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function CodeEnumToString(value As CodeEnum) As String
		  Select Case value
		    
		    Case CodeEnum.ServerError
		      Return "server_error"
		    Case CodeEnum.UnsupportedFile
		      Return "unsupported_file"
		    Case CodeEnum.InvalidFile
		      Return "invalid_file"
		    
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
			Name="message"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


