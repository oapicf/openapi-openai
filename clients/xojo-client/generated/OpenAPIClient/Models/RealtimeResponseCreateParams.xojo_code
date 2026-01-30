#tag Class
Protected Class RealtimeResponseCreateParams

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
			The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
		#tag EndNote
		output_audio_format As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Tools (functions) available to the model.
		#tag EndNote
		tools() As OpenAPIClient.Models.RealtimeResponseCreateParamsToolsInner
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function, like `{"type": "function", "function": {"name": "my_function"}}`. 
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


	#tag Property, Flags = &h0
		conversation As OpenAPIClient.Models.RealtimeResponseCreateParamsConversation
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
		#tag EndNote
		metadata As Object
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation. 
		#tag EndNote
		input() As OpenAPIClient.Models.RealtimeConversationItem
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

    #tag Enum, Name = Output_audio_formatEnum, Type = Integer, Flags = &h0
        
        Pcm16
        G711Ulaw
        G711Alaw
        
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
	#tag Method, Flags = &h0
		Shared Function Output_audio_formatEnumToString(value As Output_audio_formatEnum) As String
		  Select Case value
		    
		    Case Output_audio_formatEnum.Pcm16
		      Return "pcm16"
		    Case Output_audio_formatEnum.G711Ulaw
		      Return "g711_ulaw"
		    Case Output_audio_formatEnum.G711Alaw
		      Return "g711_alaw"
		    
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
			Name="instructions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
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
		#tag ViewProperty
			Name="conversation"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RealtimeResponseCreateParamsConversation"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="metadata"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Object"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="input"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RealtimeConversationItem"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


