#tag Class
Protected Class MessageObjectIncompleteDetails

	#tag Property, Flags = &h0
		#tag Note
			The reason the message is incomplete.
		#tag EndNote
		reason As String
	#tag EndProperty


    #tag Enum, Name = ReasonEnum, Type = Integer, Flags = &h0
        
        ContentFilter
        MaxTokens
        RunCancelled
        RunExpired
        RunFailed
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function ReasonEnumToString(value As ReasonEnum) As String
		  Select Case value
		    
		    Case ReasonEnum.ContentFilter
		      Return "content_filter"
		    Case ReasonEnum.MaxTokens
		      Return "max_tokens"
		    Case ReasonEnum.RunCancelled
		      Return "run_cancelled"
		    Case ReasonEnum.RunExpired
		      Return "run_expired"
		    Case ReasonEnum.RunFailed
		      Return "run_failed"
		    
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
	#tag EndViewBehavior
End Class
#tag EndClass


