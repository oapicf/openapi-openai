#tag Class
Protected Class Invite

	#tag Property, Flags = &h0
		#tag Note
			The object type, which is always `organization.invite`
		#tag EndNote
		object As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The identifier, which can be referenced in API endpoints
		#tag EndNote
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The email address of the individual to whom the invite was sent
		#tag EndNote
		email As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			`owner` or `reader`
		#tag EndNote
		role As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			`accepted`,`expired`, or `pending`
		#tag EndNote
		status As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) of when the invite was sent.
		#tag EndNote
		invited_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) of when the invite expires.
		#tag EndNote
		expires_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) of when the invite was accepted.
		#tag EndNote
		accepted_at As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The projects that were granted membership upon acceptance of the invite.
		#tag EndNote
		projects() As OpenAPIClient.Models.InviteProjectsInner
	#tag EndProperty


    #tag Enum, Name = ObjectEnum, Type = Integer, Flags = &h0
        
        OrganizationPeriodInvite
        
    #tag EndEnum

    #tag Enum, Name = RoleEnum, Type = Integer, Flags = &h0
        
        Owner
        Reader
        
    #tag EndEnum

    #tag Enum, Name = StatusEnum, Type = Integer, Flags = &h0
        
        Accepted
        Expired
        Pending
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function ObjectEnumToString(value As ObjectEnum) As String
		  Select Case value
		    
		    Case ObjectEnum.OrganizationPeriodInvite
		      Return "organization.invite"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function RoleEnumToString(value As RoleEnum) As String
		  Select Case value
		    
		    Case RoleEnum.Owner
		      Return "owner"
		    Case RoleEnum.Reader
		      Return "reader"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function StatusEnumToString(value As StatusEnum) As String
		  Select Case value
		    
		    Case StatusEnum.Accepted
		      Return "accepted"
		    Case StatusEnum.Expired
		      Return "expired"
		    Case StatusEnum.Pending
		      Return "pending"
		    
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
			Name="email"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="invited_at"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="expires_at"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="accepted_at"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="projects"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="InviteProjectsInner"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


