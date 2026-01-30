#tag Class
Protected Class AuditLog

	#tag Property, Flags = &h0
		#tag Note
			The ID of this log.
		#tag EndNote
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) of the event.
		#tag EndNote
		effective_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		project As OpenAPIClient.Models.AuditLogProject
	#tag EndProperty


	#tag Property, Flags = &h0
		actor As OpenAPIClient.Models.AuditLogActor
	#tag EndProperty


	#tag Property, Flags = &h0
		api_key_created As OpenAPIClient.Models.AuditLogApiKeyCreated
	#tag EndProperty


	#tag Property, Flags = &h0
		api_key_updated As OpenAPIClient.Models.AuditLogApiKeyUpdated
	#tag EndProperty


	#tag Property, Flags = &h0
		api_key_deleted As OpenAPIClient.Models.AuditLogApiKeyDeleted
	#tag EndProperty


	#tag Property, Flags = &h0
		invite_sent As OpenAPIClient.Models.AuditLogInviteSent
	#tag EndProperty


	#tag Property, Flags = &h0
		invite_accepted As OpenAPIClient.Models.AuditLogInviteAccepted
	#tag EndProperty


	#tag Property, Flags = &h0
		invite_deleted As OpenAPIClient.Models.AuditLogInviteAccepted
	#tag EndProperty


	#tag Property, Flags = &h0
		login_failed As OpenAPIClient.Models.AuditLogLoginFailed
	#tag EndProperty


	#tag Property, Flags = &h0
		logout_failed As OpenAPIClient.Models.AuditLogLoginFailed
	#tag EndProperty


	#tag Property, Flags = &h0
		organization_updated As OpenAPIClient.Models.AuditLogOrganizationUpdated
	#tag EndProperty


	#tag Property, Flags = &h0
		project_created As OpenAPIClient.Models.AuditLogProjectCreated
	#tag EndProperty


	#tag Property, Flags = &h0
		project_updated As OpenAPIClient.Models.AuditLogProjectUpdated
	#tag EndProperty


	#tag Property, Flags = &h0
		project_archived As OpenAPIClient.Models.AuditLogProjectArchived
	#tag EndProperty


	#tag Property, Flags = &h0
		rate_limit_updated As OpenAPIClient.Models.AuditLogRateLimitUpdated
	#tag EndProperty


	#tag Property, Flags = &h0
		rate_limit_deleted As OpenAPIClient.Models.AuditLogRateLimitDeleted
	#tag EndProperty


	#tag Property, Flags = &h0
		service_account_created As OpenAPIClient.Models.AuditLogServiceAccountCreated
	#tag EndProperty


	#tag Property, Flags = &h0
		service_account_updated As OpenAPIClient.Models.AuditLogServiceAccountUpdated
	#tag EndProperty


	#tag Property, Flags = &h0
		service_account_deleted As OpenAPIClient.Models.AuditLogServiceAccountDeleted
	#tag EndProperty


	#tag Property, Flags = &h0
		user_added As OpenAPIClient.Models.AuditLogUserAdded
	#tag EndProperty


	#tag Property, Flags = &h0
		user_updated As OpenAPIClient.Models.AuditLogUserUpdated
	#tag EndProperty


	#tag Property, Flags = &h0
		user_deleted As OpenAPIClient.Models.AuditLogUserDeleted
	#tag EndProperty





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
			Name="type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AuditLogEventType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="effective_at"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="project"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AuditLogProject"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="actor"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AuditLogActor"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="api_key_created"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AuditLogApiKeyCreated"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="api_key_updated"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AuditLogApiKeyUpdated"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="api_key_deleted"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AuditLogApiKeyDeleted"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="invite_sent"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AuditLogInviteSent"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="invite_accepted"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AuditLogInviteAccepted"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="invite_deleted"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AuditLogInviteAccepted"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="login_failed"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AuditLogLoginFailed"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="logout_failed"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AuditLogLoginFailed"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="organization_updated"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AuditLogOrganizationUpdated"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="project_created"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AuditLogProjectCreated"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="project_updated"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AuditLogProjectUpdated"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="project_archived"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AuditLogProjectArchived"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="rate_limit_updated"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AuditLogRateLimitUpdated"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="rate_limit_deleted"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AuditLogRateLimitDeleted"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="service_account_created"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AuditLogServiceAccountCreated"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="service_account_updated"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AuditLogServiceAccountUpdated"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="service_account_deleted"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AuditLogServiceAccountDeleted"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="user_added"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AuditLogUserAdded"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="user_updated"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AuditLogUserUpdated"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="user_deleted"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AuditLogUserDeleted"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


