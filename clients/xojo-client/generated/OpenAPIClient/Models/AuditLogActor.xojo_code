#tag Class
Protected Class AuditLogActor

	#tag Property, Flags = &h0
		#tag Note
			The type of actor. Is either `session` or `api_key`.
		#tag EndNote
		type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		session As AuditLogActorSession
	#tag EndProperty


	#tag Property, Flags = &h0
		api_key As AuditLogActorApiKey
	#tag EndProperty


    #tag Enum, Name = TypeEnum, Type = Integer, Flags = &h0
        
        Session
        ApiKey
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function TypeEnumToString(value As TypeEnum) As String
		  Select Case value
		    
		    Case TypeEnum.Session
		      Return "session"
		    Case TypeEnum.ApiKey
		      Return "api_key"
		    
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
			Name="session"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AuditLogActorSession"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="api_key"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AuditLogActorApiKey"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


