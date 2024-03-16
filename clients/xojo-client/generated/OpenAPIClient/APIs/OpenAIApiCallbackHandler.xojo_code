#tag Interface
Protected Interface OpenAIApiCallbackHandler
	#tag Method, Flags = &h0
		Sub CancelFineTuneCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.FineTune)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateChatCompletionCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CreateChatCompletionResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateCompletionCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CreateCompletionResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateEditCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CreateEditResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateEmbeddingCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CreateEmbeddingResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateFileCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.OpenAIFile)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateFineTuneCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.FineTune)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateImageCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ImagesResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateImageEditCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ImagesResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateImageVariationCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ImagesResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateModerationCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CreateModerationResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateTranscriptionCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CreateTranscriptionResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateTranslationCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CreateTranslationResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DeleteFileCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.DeleteFileResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DeleteModelCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.DeleteModelResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DownloadFileCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As String)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ListFilesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ListFilesResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ListFineTuneEventsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ListFineTuneEventsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ListFineTunesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ListFineTunesResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ListModelsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ListModelsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub RetrieveFileCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.OpenAIFile)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub RetrieveFineTuneCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.FineTune)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub RetrieveModelCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.Model)
		  
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
