#tag Class
Protected Class RealtimeServerEventInputAudioBufferSpeechStopped

	#tag Property, Flags = &h0
		#tag Note
			The unique ID of the server event.
		#tag EndNote
		event_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The event type, must be `input_audio_buffer.speech_stopped`.
		#tag EndNote
		type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  `min_silence_duration_ms` configured in the Session. 
		#tag EndNote
		audio_end_ms As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The ID of the user message item that will be created.
		#tag EndNote
		item_id As String
	#tag EndProperty


    #tag Enum, Name = TypeEnum, Type = Integer, Flags = &h0
        
        InputAudioBufferPeriodSpeechStopped
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function TypeEnumToString(value As TypeEnum) As String
		  Select Case value
		    
		    Case TypeEnum.InputAudioBufferPeriodSpeechStopped
		      Return "input_audio_buffer.speech_stopped"
		    
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
			Name="event_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="audio_end_ms"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="item_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


