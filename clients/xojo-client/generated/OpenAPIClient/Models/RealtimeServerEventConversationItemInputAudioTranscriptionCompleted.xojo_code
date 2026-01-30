#tag Class
Protected Class RealtimeServerEventConversationItemInputAudioTranscriptionCompleted

	#tag Property, Flags = &h0
		#tag Note
			The unique ID of the server event.
		#tag EndNote
		event_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The event type, must be `conversation.item.input_audio_transcription.completed`. 
		#tag EndNote
		type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The ID of the user message item containing the audio.
		#tag EndNote
		item_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The index of the content part containing the audio.
		#tag EndNote
		content_index As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The transcribed text.
		#tag EndNote
		transcript As String
	#tag EndProperty


    #tag Enum, Name = TypeEnum, Type = Integer, Flags = &h0
        
        ConversationPeriodItemPeriodInputAudioTranscriptionPeriodCompleted
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function TypeEnumToString(value As TypeEnum) As String
		  Select Case value
		    
		    Case TypeEnum.ConversationPeriodItemPeriodInputAudioTranscriptionPeriodCompleted
		      Return "conversation.item.input_audio_transcription.completed"
		    
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
			Name="item_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="content_index"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="transcript"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


