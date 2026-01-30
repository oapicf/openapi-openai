#tag Interface
Protected Interface UsageApiCallbackHandler
	#tag Method, Flags = &h0
		Sub UsageAudioSpeechesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UsageResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UsageAudioTranscriptionsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UsageResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UsageCodeInterpreterSessionsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UsageResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UsageCompletionsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UsageResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UsageCostsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UsageResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UsageEmbeddingsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UsageResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UsageImagesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UsageResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UsageModerationsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UsageResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UsageVectorStoresCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UsageResponse)
		  
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
