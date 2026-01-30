#tag Class
Protected Class InviteRequest

	#tag Property, Flags = &h0
		#tag Note
			Send an email to this address
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
			An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior.
		#tag EndNote
		projects() As OpenAPIClient.Models.InviteRequestProjectsInner
	#tag EndProperty


    #tag Enum, Name = RoleEnum, Type = Integer, Flags = &h0
        
        Reader
        Owner
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function RoleEnumToString(value As RoleEnum) As String
		  Select Case value
		    
		    Case RoleEnum.Reader
		      Return "reader"
		    Case RoleEnum.Owner
		      Return "owner"
		    
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
			Name="email"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="projects"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="InviteRequestProjectsInner"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


