#tag Interface
Protected Interface ProjectsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub ArchiveProjectCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.Project)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateProjectCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.Project)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateProjectServiceAccountCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ProjectServiceAccountCreateResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateProjectUserCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ProjectUser)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DeleteProjectApiKeyCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ProjectApiKeyDeleteResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DeleteProjectServiceAccountCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ProjectServiceAccountDeleteResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DeleteProjectUserCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ProjectUserDeleteResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ListProjectApiKeysCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ProjectApiKeyListResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ListProjectRateLimitsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ProjectRateLimitListResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ListProjectServiceAccountsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ProjectServiceAccountListResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ListProjectUsersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ProjectUserListResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ListProjectsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ProjectListResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ModifyProjectCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.Project)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ModifyProjectUserCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ProjectUser)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub RetrieveProjectCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.Project)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub RetrieveProjectApiKeyCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ProjectApiKey)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub RetrieveProjectServiceAccountCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ProjectServiceAccount)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub RetrieveProjectUserCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ProjectUser)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UpdateProjectRateLimitsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ProjectRateLimit)
		  
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
