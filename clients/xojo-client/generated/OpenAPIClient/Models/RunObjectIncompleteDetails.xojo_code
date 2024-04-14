#tag Class
Protected Class RunObjectIncompleteDetails

	#tag Property, Flags = &h0
		#tag Note
			The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
		#tag EndNote
		reason As Xoson.O.OptionalString
	#tag EndProperty


    #tag Enum, Name = ReasonEnum, Type = Integer, Flags = &h0
        
        CompletionTokens
        PromptTokens
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function ReasonEnumToString(value As ReasonEnum) As String
		  Select Case value
		    
		    Case ReasonEnum.CompletionTokens
		      Return "max_completion_tokens"
		    Case ReasonEnum.PromptTokens
		      Return "max_prompt_tokens"
		    
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


