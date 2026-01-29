#tag Interface
Protected Interface FilesApiCallbackHandler
	#tag Method, Flags = &h0
		Sub CreateFileCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.OpenAIFile)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DeleteFileCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.DeleteFileResponse)
		  
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
		Sub RetrieveFileCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.OpenAIFile)
		  
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
