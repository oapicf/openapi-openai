#tag Class
Protected Class RealtimeServerEventRateLimitsUpdatedRateLimitsInner

	#tag Property, Flags = &h0
		#tag Note
			The name of the rate limit (`requests`, `tokens`). 
		#tag EndNote
		name As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The maximum allowed value for the rate limit.
		#tag EndNote
		limit As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The remaining value before the limit is reached.
		#tag EndNote
		remaining As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Seconds until the rate limit resets.
		#tag EndNote
		reset_seconds As Xoson.O.OptionalDouble
	#tag EndProperty


    #tag Enum, Name = NameEnum, Type = Integer, Flags = &h0
        
        Requests
        Tokens
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function NameEnumToString(value As NameEnum) As String
		  Select Case value
		    
		    Case NameEnum.Requests
		      Return "requests"
		    Case NameEnum.Tokens
		      Return "tokens"
		    
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
			Name="limit"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="remaining"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="reset_seconds"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


