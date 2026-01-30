#tag Class
Protected Class ChatCompletionRequestMessageContentPartAudio

	#tag Property, Flags = &h0
		#tag Note
			The type of the content part. Always `input_audio`.
		#tag EndNote
		type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		input_audio As OpenAPIClient.Models.ChatCompletionRequestMessageContentPartAudioInputAudio
	#tag EndProperty


    #tag Enum, Name = TypeEnum, Type = Integer, Flags = &h0
        
        InputAudio
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function TypeEnumToString(value As TypeEnum) As String
		  Select Case value
		    
		    Case TypeEnum.InputAudio
		      Return "input_audio"
		    
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
			Name="input_audio"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ChatCompletionRequestMessageContentPartAudioInputAudio"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


