#tag Class
Protected Class RunObjectRequiredAction

	#tag Property, Flags = &h0
		#tag Note
			For now, this is always `submit_tool_outputs`.
		#tag EndNote
		type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		submit_tool_outputs As OpenAPIClient.Models.RunObjectRequiredActionSubmitToolOutputs
	#tag EndProperty


    #tag Enum, Name = TypeEnum, Type = Integer, Flags = &h0
        
        SubmitToolOutputs
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function TypeEnumToString(value As TypeEnum) As String
		  Select Case value
		    
		    Case TypeEnum.SubmitToolOutputs
		      Return "submit_tool_outputs"
		    
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
			Name="submit_tool_outputs"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RunObjectRequiredActionSubmitToolOutputs"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


