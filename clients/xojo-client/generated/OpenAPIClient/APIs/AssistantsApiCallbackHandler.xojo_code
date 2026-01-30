#tag Interface
Protected Interface AssistantsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub CancelRunCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.RunObject)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateAssistantCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AssistantObject)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateMessageCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.MessageObject)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateRunCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.RunObject)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateThreadCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ThreadObject)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateThreadAndRunCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.RunObject)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DeleteAssistantCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.DeleteAssistantResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DeleteMessageCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.DeleteMessageResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DeleteThreadCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.DeleteThreadResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetAssistantCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AssistantObject)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetMessageCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.MessageObject)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetRunCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.RunObject)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetRunStepCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.RunStepObject)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetThreadCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ThreadObject)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ListAssistantsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ListAssistantsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ListMessagesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ListMessagesResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ListRunStepsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ListRunStepsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ListRunsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ListRunsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ModifyAssistantCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AssistantObject)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ModifyMessageCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.MessageObject)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ModifyRunCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.RunObject)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ModifyThreadCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ThreadObject)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub SubmitToolOuputsToRunCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.RunObject)
		  
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
