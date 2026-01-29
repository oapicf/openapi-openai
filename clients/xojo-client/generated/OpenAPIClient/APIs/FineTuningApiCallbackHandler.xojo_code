#tag Interface
Protected Interface FineTuningApiCallbackHandler
	#tag Method, Flags = &h0
		Sub CancelFineTuningJobCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.FineTuningJob)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateFineTuningJobCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.FineTuningJob)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ListFineTuningEventsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ListFineTuningJobEventsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ListFineTuningJobCheckpointsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ListFineTuningJobCheckpointsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ListPaginatedFineTuningJobsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ListPaginatedFineTuningJobsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub RetrieveFineTuningJobCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.FineTuningJob)
		  
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
