#tag Class
Protected Class RunStepDeltaStepDetailsToolCallsCodeOutputImageObject

	#tag Property, Flags = &h0
		#tag Note
			The index of the output in the outputs array.
		#tag EndNote
		index As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Always `image`.
		#tag EndNote
		type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		image As OpenAPIClient.Models.RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
	#tag EndProperty


    #tag Enum, Name = TypeEnum, Type = Integer, Flags = &h0
        
        Image
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function TypeEnumToString(value As TypeEnum) As String
		  Select Case value
		    
		    Case TypeEnum.Image
		      Return "image"
		    
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
			Name="index"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="image"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


