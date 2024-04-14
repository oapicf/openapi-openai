#tag Interface
Protected Interface AudioApiCallbackHandler
	#tag Method, Flags = &h0
		Sub CreateSpeechCallback(status As OpenAPIClient.OpenAPIClientException, Optional file As FolderItem)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateSpeechDownloadProgress(BytesReceived as Integer, TotalBytes as Integer)
		  
		End Sub
	#tag EndMethod
	#tag Method, Flags = &h0
		Sub CreateTranscriptionCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CreateTranscription200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateTranslationCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CreateTranslation200Response)
		  
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
