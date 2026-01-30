#tag Interface
Protected Interface InvitesApiCallbackHandler
	#tag Method, Flags = &h0
		Sub DeleteInviteCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.InviteDeleteResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub InviteUserCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.Invite)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ListInvitesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.InviteListResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub RetrieveInviteCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.Invite)
		  
		End Sub
	#tag EndMethod




	#tag ViewBehavior
		#tag ViewProperty
			Name="Name"
			Visible=true
			Group="ID"
			Type="String"
		#tag EndViewProperty
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			Type="String"
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
		#tag EndViewProperty
	#tag EndViewBehavior
End Interface
#tag EndInterface
