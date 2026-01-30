#tag Class
Protected Class AuditLogActorApiKey

	#tag Property, Flags = &h0
		#tag Note
			The tracking id of the API key.
		#tag EndNote
		id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The type of API key. Can be either `user` or `service_account`.
		#tag EndNote
		type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		user As OpenAPIClient.Models.AuditLogActorUser
	#tag EndProperty


	#tag Property, Flags = &h0
		service_account As OpenAPIClient.Models.AuditLogActorServiceAccount
	#tag EndProperty


    #tag Enum, Name = TypeEnum, Type = Integer, Flags = &h0
        
        User
        ServiceAccount
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function TypeEnumToString(value As TypeEnum) As String
		  Select Case value
		    
		    Case TypeEnum.User
		      Return "user"
		    Case TypeEnum.ServiceAccount
		      Return "service_account"
		    
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
			Name="user"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AuditLogActorUser"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="service_account"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AuditLogActorServiceAccount"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


