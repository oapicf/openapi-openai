#tag Interface
Protected Interface UploadsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub AddUploadPartCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UploadPart)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CancelUploadCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.Upload)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CompleteUploadCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.Upload)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateUploadCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.Upload)
		  
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
