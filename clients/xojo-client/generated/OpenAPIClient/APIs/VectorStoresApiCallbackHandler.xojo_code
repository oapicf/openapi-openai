#tag Interface
Protected Interface VectorStoresApiCallbackHandler
	#tag Method, Flags = &h0
		Sub CancelVectorStoreFileBatchCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.VectorStoreFileBatchObject)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateVectorStoreCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.VectorStoreObject)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateVectorStoreFileCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.VectorStoreFileObject)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateVectorStoreFileBatchCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.VectorStoreFileBatchObject)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DeleteVectorStoreCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.DeleteVectorStoreResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DeleteVectorStoreFileCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.DeleteVectorStoreFileResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetVectorStoreCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.VectorStoreObject)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetVectorStoreFileCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.VectorStoreFileObject)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetVectorStoreFileBatchCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.VectorStoreFileBatchObject)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ListFilesInVectorStoreBatchCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ListVectorStoreFilesResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ListVectorStoreFilesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ListVectorStoreFilesResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ListVectorStoresCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ListVectorStoresResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ModifyVectorStoreCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.VectorStoreObject)
		  
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
