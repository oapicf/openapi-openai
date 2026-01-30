#tag Class
Protected Class CreateChatCompletionRequestAudio

	#tag Property, Flags = &h0
		#tag Note
			The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). 
		#tag EndNote
		voice As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. 
		#tag EndNote
		format As String
	#tag EndProperty


    #tag Enum, Name = VoiceEnum, Type = Integer, Flags = &h0
        
        Alloy
        Ash
        Ballad
        Coral
        Echo
        Sage
        Shimmer
        Verse
        
    #tag EndEnum

    #tag Enum, Name = FormatEnum, Type = Integer, Flags = &h0
        
        Wav
        Mp3
        Flac
        Opus
        Pcm16
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function VoiceEnumToString(value As VoiceEnum) As String
		  Select Case value
		    
		    Case VoiceEnum.Alloy
		      Return "alloy"
		    Case VoiceEnum.Ash
		      Return "ash"
		    Case VoiceEnum.Ballad
		      Return "ballad"
		    Case VoiceEnum.Coral
		      Return "coral"
		    Case VoiceEnum.Echo
		      Return "echo"
		    Case VoiceEnum.Sage
		      Return "sage"
		    Case VoiceEnum.Shimmer
		      Return "shimmer"
		    Case VoiceEnum.Verse
		      Return "verse"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function FormatEnumToString(value As FormatEnum) As String
		  Select Case value
		    
		    Case FormatEnum.Wav
		      Return "wav"
		    Case FormatEnum.Mp3
		      Return "mp3"
		    Case FormatEnum.Flac
		      Return "flac"
		    Case FormatEnum.Opus
		      Return "opus"
		    Case FormatEnum.Pcm16
		      Return "pcm16"
		    
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


