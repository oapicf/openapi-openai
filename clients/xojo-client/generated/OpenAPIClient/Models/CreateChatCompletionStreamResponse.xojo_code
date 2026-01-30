#tag Class
Protected Class CreateChatCompletionStreamResponse

	#tag Property, Flags = &h0
		#tag Note
			A unique identifier for the chat completion. Each chunk has the same ID.
		#tag EndNote
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of chat completion choices. Can contain more than one elements if `n` is greater than 1. Can also be empty for the last chunk if you set `stream_options: {"include_usage": true}`. 
		#tag EndNote
		choices() As OpenAPIClient.Models.CreateChatCompletionStreamResponseChoicesInner
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
		#tag EndNote
		created As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The model to generate the completion.
		#tag EndNote
		model As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.
		#tag EndNote
		service_tier As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
		#tag EndNote
		system_fingerprint As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The object type, which is always `chat.completion.chunk`.
		#tag EndNote
		object As String
	#tag EndProperty


	#tag Property, Flags = &h0
		usage As OpenAPIClient.Models.CreateChatCompletionStreamResponseUsage
	#tag EndProperty


    #tag Enum, Name = Service_tierEnum, Type = Integer, Flags = &h0
        
        Scale
        Default
        
    #tag EndEnum

    #tag Enum, Name = ObjectEnum, Type = Integer, Flags = &h0
        
        ChatPeriodCompletionPeriodChunk
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Service_tierEnumToString(value As Service_tierEnum) As String
		  Select Case value
		    
		    Case Service_tierEnum.Scale
		      Return "scale"
		    Case Service_tierEnum.Default
		      Return "default"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function ObjectEnumToString(value As ObjectEnum) As String
		  Select Case value
		    
		    Case ObjectEnum.ChatPeriodCompletionPeriodChunk
		      Return "chat.completion.chunk"
		    
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
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="choices"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateChatCompletionStreamResponseChoicesInner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="created"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="model"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="system_fingerprint"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="usage"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateChatCompletionStreamResponseUsage"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


