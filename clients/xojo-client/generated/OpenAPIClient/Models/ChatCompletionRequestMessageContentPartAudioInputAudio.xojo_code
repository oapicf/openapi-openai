#tag Class
Protected Class ChatCompletionRequestMessageContentPartAudioInputAudio

	#tag Property, Flags = &h0
		#tag Note
			Base64 encoded audio data.
		#tag EndNote
		data As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The format of the encoded audio data. Currently supports "wav" and "mp3". 
		#tag EndNote
		format As String
	#tag EndProperty


    #tag Enum, Name = FormatEnum, Type = Integer, Flags = &h0
        
        Wav
        Mp3
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function FormatEnumToString(value As FormatEnum) As String
		  Select Case value
		    
		    Case FormatEnum.Wav
		      Return "wav"
		    Case FormatEnum.Mp3
		      Return "mp3"
		    
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
			Name="data"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


