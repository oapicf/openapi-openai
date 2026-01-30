#tag Class
Protected Class RealtimeResponseStatusDetails

	#tag Property, Flags = &h0
		#tag Note
			The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`). 
		#tag EndNote
		type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response). 
		#tag EndNote
		reason As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		error As OpenAPIClient.Models.RealtimeResponseStatusDetailsError
	#tag EndProperty


    #tag Enum, Name = TypeEnum, Type = Integer, Flags = &h0
        
        Completed
        Cancelled
        Failed
        Incomplete
        
    #tag EndEnum

    #tag Enum, Name = ReasonEnum, Type = Integer, Flags = &h0
        
        TurnDetected
        ClientCancelled
        MaxOutputTokens
        ContentFilter
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function TypeEnumToString(value As TypeEnum) As String
		  Select Case value
		    
		    Case TypeEnum.Completed
		      Return "completed"
		    Case TypeEnum.Cancelled
		      Return "cancelled"
		    Case TypeEnum.Failed
		      Return "failed"
		    Case TypeEnum.Incomplete
		      Return "incomplete"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function ReasonEnumToString(value As ReasonEnum) As String
		  Select Case value
		    
		    Case ReasonEnum.TurnDetected
		      Return "turn_detected"
		    Case ReasonEnum.ClientCancelled
		      Return "client_cancelled"
		    Case ReasonEnum.MaxOutputTokens
		      Return "max_output_tokens"
		    Case ReasonEnum.ContentFilter
		      Return "content_filter"
		    
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
			Name="error"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RealtimeResponseStatusDetailsError"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


