#tag Class
Protected Class VectorStoreExpirationAfter

	#tag Property, Flags = &h0
		#tag Note
			Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.
		#tag EndNote
		anchor As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The number of days after the anchor time that the vector store will expire.
		#tag EndNote
		days As Integer
	#tag EndProperty


    #tag Enum, Name = AnchorEnum, Type = Integer, Flags = &h0
        
        LastActiveAt
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function AnchorEnumToString(value As AnchorEnum) As String
		  Select Case value
		    
		    Case AnchorEnum.LastActiveAt
		      Return "last_active_at"
		    
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
			Name="days"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


