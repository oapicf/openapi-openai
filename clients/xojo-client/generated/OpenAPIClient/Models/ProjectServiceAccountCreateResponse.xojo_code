#tag Class
Protected Class ProjectServiceAccountCreateResponse

	#tag Property, Flags = &h0
		object As String
	#tag EndProperty


	#tag Property, Flags = &h0
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Service accounts can only have one role of type `member`
		#tag EndNote
		role As String
	#tag EndProperty


	#tag Property, Flags = &h0
		created_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		api_key As OpenAPIClient.Models.ProjectServiceAccountApiKey
	#tag EndProperty


    #tag Enum, Name = ObjectEnum, Type = Integer, Flags = &h0
        
        OrganizationPeriodProjectPeriodServiceAccount
        
    #tag EndEnum

    #tag Enum, Name = RoleEnum, Type = Integer, Flags = &h0
        
        Member
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function ObjectEnumToString(value As ObjectEnum) As String
		  Select Case value
		    
		    Case ObjectEnum.OrganizationPeriodProjectPeriodServiceAccount
		      Return "organization.project.service_account"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function RoleEnumToString(value As RoleEnum) As String
		  Select Case value
		    
		    Case RoleEnum.Member
		      Return "member"
		    
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
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="created_at"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="api_key"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ProjectServiceAccountApiKey"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


