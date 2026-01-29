#tag Class
Protected Class RunStepDeltaStepDetailsMessageCreationObject

	#tag Property, Flags = &h0
		#tag Note
			Always `message_creation`.
		#tag EndNote
		type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		message_creation As OpenAPIClient.Models.RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
	#tag EndProperty


    #tag Enum, Name = TypeEnum, Type = Integer, Flags = &h0
        
        MessageCreation
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function TypeEnumToString(value As TypeEnum) As String
		  Select Case value
		    
		    Case TypeEnum.MessageCreation
		      Return "message_creation"
		    
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
			Name="message_creation"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RunStepDeltaStepDetailsMessageCreationObjectMessageCreation"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


