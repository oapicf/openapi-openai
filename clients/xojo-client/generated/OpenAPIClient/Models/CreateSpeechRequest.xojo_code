#tag Class
Protected Class CreateSpeechRequest

	#tag Property, Flags = &h0
		model As OpenAPIClient.Models.CreateSpeechRequestModel
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The text to generate audio for. The maximum length is 4096 characters.
		#tag EndNote
		input As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options).
		#tag EndNote
		voice As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
		#tag EndNote
		response_format As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.
		#tag EndNote
		speed As Xoson.O.OptionalDouble
	#tag EndProperty


    #tag Enum, Name = VoiceEnum, Type = Integer, Flags = &h0
        
        Alloy
        Echo
        Fable
        Onyx
        Nova
        Shimmer
        
    #tag EndEnum

    #tag Enum, Name = Response_formatEnum, Type = Integer, Flags = &h0
        
        Mp3
        Opus
        Aac
        Flac
        Wav
        Pcm
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function VoiceEnumToString(value As VoiceEnum) As String
		  Select Case value
		    
		    Case VoiceEnum.Alloy
		      Return "alloy"
		    Case VoiceEnum.Echo
		      Return "echo"
		    Case VoiceEnum.Fable
		      Return "fable"
		    Case VoiceEnum.Onyx
		      Return "onyx"
		    Case VoiceEnum.Nova
		      Return "nova"
		    Case VoiceEnum.Shimmer
		      Return "shimmer"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function Response_formatEnumToString(value As Response_formatEnum) As String
		  Select Case value
		    
		    Case Response_formatEnum.Mp3
		      Return "mp3"
		    Case Response_formatEnum.Opus
		      Return "opus"
		    Case Response_formatEnum.Aac
		      Return "aac"
		    Case Response_formatEnum.Flac
		      Return "flac"
		    Case Response_formatEnum.Wav
		      Return "wav"
		    Case Response_formatEnum.Pcm
		      Return "pcm"
		    
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
			Name="model"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateSpeechRequestModel"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="input"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="speed"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


