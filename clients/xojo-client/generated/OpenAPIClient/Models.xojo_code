#tag Module
Protected Module Models
	#tag Method, Flags = &h21
		Protected Function AudioResponseFormatToString(value As AudioResponseFormat) As String
		  Select Case value
		    Case AudioResponseFormat.Json
		      Return "json"
		    Case AudioResponseFormat.Text
		      Return "text"
		    Case AudioResponseFormat.Srt
		      Return "srt"
		    Case AudioResponseFormat.VerboseJson
		      Return "verbose_json"
		    Case AudioResponseFormat.Vtt
		      Return "vtt"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AuditLogEventTypeToString(value As AuditLogEventType) As String
		  Select Case value
		    Case AuditLogEventType.ApiKeyPeriodCreated
		      Return "api_key.created"
		    Case AuditLogEventType.ApiKeyPeriodUpdated
		      Return "api_key.updated"
		    Case AuditLogEventType.ApiKeyPeriodDeleted
		      Return "api_key.deleted"
		    Case AuditLogEventType.InvitePeriodSent
		      Return "invite.sent"
		    Case AuditLogEventType.InvitePeriodAccepted
		      Return "invite.accepted"
		    Case AuditLogEventType.InvitePeriodDeleted
		      Return "invite.deleted"
		    Case AuditLogEventType.LoginPeriodSucceeded
		      Return "login.succeeded"
		    Case AuditLogEventType.LoginPeriodFailed
		      Return "login.failed"
		    Case AuditLogEventType.LogoutPeriodSucceeded
		      Return "logout.succeeded"
		    Case AuditLogEventType.LogoutPeriodFailed
		      Return "logout.failed"
		    Case AuditLogEventType.OrganizationPeriodUpdated
		      Return "organization.updated"
		    Case AuditLogEventType.ProjectPeriodCreated
		      Return "project.created"
		    Case AuditLogEventType.ProjectPeriodUpdated
		      Return "project.updated"
		    Case AuditLogEventType.ProjectPeriodArchived
		      Return "project.archived"
		    Case AuditLogEventType.ServiceAccountPeriodCreated
		      Return "service_account.created"
		    Case AuditLogEventType.ServiceAccountPeriodUpdated
		      Return "service_account.updated"
		    Case AuditLogEventType.ServiceAccountPeriodDeleted
		      Return "service_account.deleted"
		    Case AuditLogEventType.RateLimitPeriodUpdated
		      Return "rate_limit.updated"
		    Case AuditLogEventType.RateLimitPeriodDeleted
		      Return "rate_limit.deleted"
		    Case AuditLogEventType.UserPeriodAdded
		      Return "user.added"
		    Case AuditLogEventType.UserPeriodUpdated
		      Return "user.updated"
		    Case AuditLogEventType.UserPeriodDeleted
		      Return "user.deleted"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ChatCompletionRoleToString(value As ChatCompletionRole) As String
		  Select Case value
		    Case ChatCompletionRole.System
		      Return "system"
		    Case ChatCompletionRole.User
		      Return "user"
		    Case ChatCompletionRole.Assistant
		      Return "assistant"
		    Case ChatCompletionRole.Tool
		      Return "tool"
		    Case ChatCompletionRole.Escapedfunction
		      Return "function"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod


	#tag Enum, Name = AudioResponseFormat, Type = Integer, Flags = &h1
		
		Json
		Text
		Srt
		VerboseJson
		Vtt
		
	#tag EndEnum
	#tag Enum, Name = AuditLogEventType, Type = Integer, Flags = &h1
		
		ApiKeyPeriodCreated
		ApiKeyPeriodUpdated
		ApiKeyPeriodDeleted
		InvitePeriodSent
		InvitePeriodAccepted
		InvitePeriodDeleted
		LoginPeriodSucceeded
		LoginPeriodFailed
		LogoutPeriodSucceeded
		LogoutPeriodFailed
		OrganizationPeriodUpdated
		ProjectPeriodCreated
		ProjectPeriodUpdated
		ProjectPeriodArchived
		ServiceAccountPeriodCreated
		ServiceAccountPeriodUpdated
		ServiceAccountPeriodDeleted
		RateLimitPeriodUpdated
		RateLimitPeriodDeleted
		UserPeriodAdded
		UserPeriodUpdated
		UserPeriodDeleted
		
	#tag EndEnum
	#tag Enum, Name = ChatCompletionRole, Type = Integer, Flags = &h1
		
		System
		User
		Assistant
		Tool
		Escapedfunction
		
	#tag EndEnum


	#tag ViewBehavior
		#tag ViewProperty
			Name="Name"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
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
	#tag EndViewBehavior
End Module
#tag EndModule
