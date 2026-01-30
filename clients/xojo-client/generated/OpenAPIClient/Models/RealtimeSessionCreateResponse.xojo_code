#tag Class
Protected Class RealtimeSessionCreateResponse

	#tag Property, Flags = &h0
		client_secret As OpenAPIClient.Models.RealtimeSessionCreateResponseClientSecret
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The set of modalities the model can respond with. To disable audio, set this to ["text"]. 
		#tag EndNote
		modalities() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. "be extremely succinct", "act friendly", "here are examples of good  responses") and on audio behavior (e.g. "talk quickly", "inject emotion  into your voice", "laugh frequently"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
		#tag EndNote
		instructions As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
		#tag EndNote
		voice As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
		#tag EndNote
		input_audio_format As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
		#tag EndNote
		output_audio_format As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		input_audio_transcription As OpenAPIClient.Models.RealtimeSessionInputAudioTranscription
	#tag EndProperty


	#tag Property, Flags = &h0
		turn_detection As OpenAPIClient.Models.RealtimeSessionCreateResponseTurnDetection
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Tools (functions) available to the model.
		#tag EndNote
		tools() As OpenAPIClient.Models.RealtimeResponseCreateParamsToolsInner
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function. 
		#tag EndNote
		tool_choice As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
		#tag EndNote
		temperature As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		max_response_output_tokens As OpenAPIClient.Models.RealtimeResponseCreateParamsMaxResponseOutputTokens
	#tag EndProperty


    #tag Enum, Name = ModalitiesEnum, Type = Integer, Flags = &h0
        
        Text
        Audio
        
    #tag EndEnum

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


	#tag Method, Flags = &h0
		Shared Function ModalitiesEnumToString(value As ModalitiesEnum) As String
		  Select Case value
		    
		    Case ModalitiesEnum.Text
		      Return "text"
		    Case ModalitiesEnum.Audio
		      Return "audio"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
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
			Name="client_secret"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RealtimeSessionCreateResponseClientSecret"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="instructions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="input_audio_format"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="output_audio_format"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="input_audio_transcription"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RealtimeSessionInputAudioTranscription"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="turn_detection"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RealtimeSessionCreateResponseTurnDetection"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="tools"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RealtimeResponseCreateParamsToolsInner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="tool_choice"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="temperature"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="max_response_output_tokens"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RealtimeResponseCreateParamsMaxResponseOutputTokens"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


