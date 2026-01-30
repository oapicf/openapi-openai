#tag Interface
Protected Interface UsersApiCallbackHandler
	#tag Method, Flags = &h0
		Sub DeleteUserCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UserDeleteResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ListUsersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UserListResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ModifyUserCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.User)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub RetrieveUserCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.User)
		  
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
