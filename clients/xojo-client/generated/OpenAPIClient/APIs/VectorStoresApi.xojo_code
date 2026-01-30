#tag Class
Protected Class VectorStoresApi
	#tag Method, Flags = &h0
		Sub CancelVectorStoreFileBatch(, vectorStoreId As String, batchId As String)
		  // Operation cancelVectorStoreFileBatch
		  // Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
		  // - 
		  // - parameter vectorStoreId: (path) The ID of the vector store that the file batch belongs to. 
		  // - parameter batchId: (path) The ID of the file batch to cancel. 
		  //
		  // Invokes VectorStoresApiCallbackHandler.CancelVectorStoreFileBatchCallback(VectorStoreFileBatchObject) on completion. 
		  //
		  // - POST /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel
		  // - defaultResponse: Nil
		  //
		  // - Bearer Token:
		  //   - type: http
		  //   - name: ApiKeyAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  


		  Dim localVarPath As String = "/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel"
		  
		  Dim localVarPathStringvectorStoreId As String = vectorStoreId
		  
		  localVarPath = localVarPath.ReplaceAllB("{vector_store_id}", localVarPathStringvectorStoreId)
		  Dim localVarPathStringbatchId As String = batchId
		  
		  localVarPath = localVarPath.ReplaceAllB("{batch_id}", localVarPathStringbatchId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.CancelVectorStoreFileBatch_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.CancelVectorStoreFileBatch_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function CancelVectorStoreFileBatchPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.VectorStoreFileBatchObject) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.VectorStoreFileBatchObject
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub CancelVectorStoreFileBatch_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.VectorStoreFileBatchObject
		  CallbackHandler.CancelVectorStoreFileBatchCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub CancelVectorStoreFileBatch_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.VectorStoreFileBatchObject
		  Call CancelVectorStoreFileBatchPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.CancelVectorStoreFileBatchCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub CreateVectorStore(, createVectorStoreRequest As OpenAPIClient.Models.CreateVectorStoreRequest)
		  // Operation createVectorStore
		  // Create a vector store.
		  // - 
		  // - parameter createVectorStoreRequest: (body)  
		  //
		  // Invokes VectorStoresApiCallbackHandler.CreateVectorStoreCallback(VectorStoreObject) on completion. 
		  //
		  // - POST /vector_stores
		  // - defaultResponse: Nil
		  //
		  // - Bearer Token:
		  //   - type: http
		  //   - name: ApiKeyAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(createVectorStoreRequest), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/vector_stores"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.CreateVectorStore_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.CreateVectorStore_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function CreateVectorStorePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.VectorStoreObject) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.VectorStoreObject
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub CreateVectorStore_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.VectorStoreObject
		  CallbackHandler.CreateVectorStoreCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub CreateVectorStore_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.VectorStoreObject
		  Call CreateVectorStorePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.CreateVectorStoreCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub CreateVectorStoreFile(, vectorStoreId As String, createVectorStoreFileRequest As OpenAPIClient.Models.CreateVectorStoreFileRequest)
		  // Operation createVectorStoreFile
		  // Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
		  // - 
		  // - parameter vectorStoreId: (path) The ID of the vector store for which to create a File.  
		  // - parameter createVectorStoreFileRequest: (body)  
		  //
		  // Invokes VectorStoresApiCallbackHandler.CreateVectorStoreFileCallback(VectorStoreFileObject) on completion. 
		  //
		  // - POST /vector_stores/{vector_store_id}/files
		  // - defaultResponse: Nil
		  //
		  // - Bearer Token:
		  //   - type: http
		  //   - name: ApiKeyAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(createVectorStoreFileRequest), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/vector_stores/{vector_store_id}/files"
		  
		  Dim localVarPathStringvectorStoreId As String = vectorStoreId
		  
		  localVarPath = localVarPath.ReplaceAllB("{vector_store_id}", localVarPathStringvectorStoreId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.CreateVectorStoreFile_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.CreateVectorStoreFile_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function CreateVectorStoreFilePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.VectorStoreFileObject) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.VectorStoreFileObject
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub CreateVectorStoreFile_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.VectorStoreFileObject
		  CallbackHandler.CreateVectorStoreFileCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub CreateVectorStoreFile_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.VectorStoreFileObject
		  Call CreateVectorStoreFilePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.CreateVectorStoreFileCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub CreateVectorStoreFileBatch(, vectorStoreId As String, createVectorStoreFileBatchRequest As OpenAPIClient.Models.CreateVectorStoreFileBatchRequest)
		  // Operation createVectorStoreFileBatch
		  // Create a vector store file batch.
		  // - 
		  // - parameter vectorStoreId: (path) The ID of the vector store for which to create a File Batch.  
		  // - parameter createVectorStoreFileBatchRequest: (body)  
		  //
		  // Invokes VectorStoresApiCallbackHandler.CreateVectorStoreFileBatchCallback(VectorStoreFileBatchObject) on completion. 
		  //
		  // - POST /vector_stores/{vector_store_id}/file_batches
		  // - defaultResponse: Nil
		  //
		  // - Bearer Token:
		  //   - type: http
		  //   - name: ApiKeyAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(createVectorStoreFileBatchRequest), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/vector_stores/{vector_store_id}/file_batches"
		  
		  Dim localVarPathStringvectorStoreId As String = vectorStoreId
		  
		  localVarPath = localVarPath.ReplaceAllB("{vector_store_id}", localVarPathStringvectorStoreId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.CreateVectorStoreFileBatch_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.CreateVectorStoreFileBatch_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function CreateVectorStoreFileBatchPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.VectorStoreFileBatchObject) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.VectorStoreFileBatchObject
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub CreateVectorStoreFileBatch_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.VectorStoreFileBatchObject
		  CallbackHandler.CreateVectorStoreFileBatchCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub CreateVectorStoreFileBatch_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.VectorStoreFileBatchObject
		  Call CreateVectorStoreFileBatchPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.CreateVectorStoreFileBatchCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub DeleteVectorStore(, vectorStoreId As String)
		  // Operation deleteVectorStore
		  // Delete a vector store.
		  // - 
		  // - parameter vectorStoreId: (path) The ID of the vector store to delete. 
		  //
		  // Invokes VectorStoresApiCallbackHandler.DeleteVectorStoreCallback(DeleteVectorStoreResponse) on completion. 
		  //
		  // - DELETE /vector_stores/{vector_store_id}
		  // - defaultResponse: Nil
		  //
		  // - Bearer Token:
		  //   - type: http
		  //   - name: ApiKeyAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  


		  Dim localVarPath As String = "/vector_stores/{vector_store_id}"
		  
		  Dim localVarPathStringvectorStoreId As String = vectorStoreId
		  
		  localVarPath = localVarPath.ReplaceAllB("{vector_store_id}", localVarPathStringvectorStoreId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.DeleteVectorStore_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.DeleteVectorStore_error
		  
		  
		  localVarHTTPSocket.SendRequest("DELETE", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function DeleteVectorStorePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.DeleteVectorStoreResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.DeleteVectorStoreResponse
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub DeleteVectorStore_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.DeleteVectorStoreResponse
		  CallbackHandler.DeleteVectorStoreCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub DeleteVectorStore_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.DeleteVectorStoreResponse
		  Call DeleteVectorStorePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.DeleteVectorStoreCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub DeleteVectorStoreFile(, vectorStoreId As String, fileId As String)
		  // Operation deleteVectorStoreFile
		  // Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
		  // - 
		  // - parameter vectorStoreId: (path) The ID of the vector store that the file belongs to. 
		  // - parameter fileId: (path) The ID of the file to delete. 
		  //
		  // Invokes VectorStoresApiCallbackHandler.DeleteVectorStoreFileCallback(DeleteVectorStoreFileResponse) on completion. 
		  //
		  // - DELETE /vector_stores/{vector_store_id}/files/{file_id}
		  // - defaultResponse: Nil
		  //
		  // - Bearer Token:
		  //   - type: http
		  //   - name: ApiKeyAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  


		  Dim localVarPath As String = "/vector_stores/{vector_store_id}/files/{file_id}"
		  
		  Dim localVarPathStringvectorStoreId As String = vectorStoreId
		  
		  localVarPath = localVarPath.ReplaceAllB("{vector_store_id}", localVarPathStringvectorStoreId)
		  Dim localVarPathStringfileId As String = fileId
		  
		  localVarPath = localVarPath.ReplaceAllB("{file_id}", localVarPathStringfileId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.DeleteVectorStoreFile_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.DeleteVectorStoreFile_error
		  
		  
		  localVarHTTPSocket.SendRequest("DELETE", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function DeleteVectorStoreFilePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.DeleteVectorStoreFileResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.DeleteVectorStoreFileResponse
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub DeleteVectorStoreFile_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.DeleteVectorStoreFileResponse
		  CallbackHandler.DeleteVectorStoreFileCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub DeleteVectorStoreFile_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.DeleteVectorStoreFileResponse
		  Call DeleteVectorStoreFilePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.DeleteVectorStoreFileCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub GetVectorStore(, vectorStoreId As String)
		  // Operation getVectorStore
		  // Retrieves a vector store.
		  // - 
		  // - parameter vectorStoreId: (path) The ID of the vector store to retrieve. 
		  //
		  // Invokes VectorStoresApiCallbackHandler.GetVectorStoreCallback(VectorStoreObject) on completion. 
		  //
		  // - GET /vector_stores/{vector_store_id}
		  // - defaultResponse: Nil
		  //
		  // - Bearer Token:
		  //   - type: http
		  //   - name: ApiKeyAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  


		  Dim localVarPath As String = "/vector_stores/{vector_store_id}"
		  
		  Dim localVarPathStringvectorStoreId As String = vectorStoreId
		  
		  localVarPath = localVarPath.ReplaceAllB("{vector_store_id}", localVarPathStringvectorStoreId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.GetVectorStore_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.GetVectorStore_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function GetVectorStorePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.VectorStoreObject) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.VectorStoreObject
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetVectorStore_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.VectorStoreObject
		  CallbackHandler.GetVectorStoreCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetVectorStore_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.VectorStoreObject
		  Call GetVectorStorePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.GetVectorStoreCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub GetVectorStoreFile(, vectorStoreId As String, fileId As String)
		  // Operation getVectorStoreFile
		  // Retrieves a vector store file.
		  // - 
		  // - parameter vectorStoreId: (path) The ID of the vector store that the file belongs to. 
		  // - parameter fileId: (path) The ID of the file being retrieved. 
		  //
		  // Invokes VectorStoresApiCallbackHandler.GetVectorStoreFileCallback(VectorStoreFileObject) on completion. 
		  //
		  // - GET /vector_stores/{vector_store_id}/files/{file_id}
		  // - defaultResponse: Nil
		  //
		  // - Bearer Token:
		  //   - type: http
		  //   - name: ApiKeyAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  


		  Dim localVarPath As String = "/vector_stores/{vector_store_id}/files/{file_id}"
		  
		  Dim localVarPathStringvectorStoreId As String = vectorStoreId
		  
		  localVarPath = localVarPath.ReplaceAllB("{vector_store_id}", localVarPathStringvectorStoreId)
		  Dim localVarPathStringfileId As String = fileId
		  
		  localVarPath = localVarPath.ReplaceAllB("{file_id}", localVarPathStringfileId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.GetVectorStoreFile_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.GetVectorStoreFile_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function GetVectorStoreFilePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.VectorStoreFileObject) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.VectorStoreFileObject
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetVectorStoreFile_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.VectorStoreFileObject
		  CallbackHandler.GetVectorStoreFileCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetVectorStoreFile_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.VectorStoreFileObject
		  Call GetVectorStoreFilePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.GetVectorStoreFileCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub GetVectorStoreFileBatch(, vectorStoreId As String, batchId As String)
		  // Operation getVectorStoreFileBatch
		  // Retrieves a vector store file batch.
		  // - 
		  // - parameter vectorStoreId: (path) The ID of the vector store that the file batch belongs to. 
		  // - parameter batchId: (path) The ID of the file batch being retrieved. 
		  //
		  // Invokes VectorStoresApiCallbackHandler.GetVectorStoreFileBatchCallback(VectorStoreFileBatchObject) on completion. 
		  //
		  // - GET /vector_stores/{vector_store_id}/file_batches/{batch_id}
		  // - defaultResponse: Nil
		  //
		  // - Bearer Token:
		  //   - type: http
		  //   - name: ApiKeyAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  


		  Dim localVarPath As String = "/vector_stores/{vector_store_id}/file_batches/{batch_id}"
		  
		  Dim localVarPathStringvectorStoreId As String = vectorStoreId
		  
		  localVarPath = localVarPath.ReplaceAllB("{vector_store_id}", localVarPathStringvectorStoreId)
		  Dim localVarPathStringbatchId As String = batchId
		  
		  localVarPath = localVarPath.ReplaceAllB("{batch_id}", localVarPathStringbatchId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.GetVectorStoreFileBatch_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.GetVectorStoreFileBatch_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function GetVectorStoreFileBatchPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.VectorStoreFileBatchObject) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.VectorStoreFileBatchObject
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetVectorStoreFileBatch_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.VectorStoreFileBatchObject
		  CallbackHandler.GetVectorStoreFileBatchCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetVectorStoreFileBatch_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.VectorStoreFileBatchObject
		  Call GetVectorStoreFileBatchPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.GetVectorStoreFileBatchCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub ListFilesInVectorStoreBatch(, vectorStoreId As String, batchId As String, Optional limit As Xoson.O.OptionalInteger, order As OrderEnum_ListFilesInVectorStoreBatch, Optional after As Xoson.O.OptionalString, Optional before As Xoson.O.OptionalString, filter As FilterEnum_ListFilesInVectorStoreBatch)
		  // Operation listFilesInVectorStoreBatch
		  // Returns a list of vector store files in a batch.
		  // - 
		  // - parameter vectorStoreId: (path) The ID of the vector store that the files belong to. 
		  // - parameter batchId: (path) The ID of the file batch that the files belong to. 
		  // - parameter limit: (query) A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
		  // - parameter order: (query) Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
		  // - parameter after: (query) A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional, default to Sample)
		  // - parameter before: (query) A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional, default to Sample)
		  // - parameter filter: (query) Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. (optional, default to Sample)
		  //
		  // Invokes VectorStoresApiCallbackHandler.ListFilesInVectorStoreBatchCallback(ListVectorStoreFilesResponse) on completion. 
		  //
		  // - GET /vector_stores/{vector_store_id}/file_batches/{batch_id}/files
		  // - defaultResponse: Nil
		  //
		  // - Bearer Token:
		  //   - type: http
		  //   - name: ApiKeyAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If limit <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("limit") + "=" + EncodeURLComponent(limit.ToString)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("order") + "=" + EncodeURLComponent(OrderEnum_ListFilesInVectorStoreBatchToString(order))
		  
		  If after <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("after") + "=" + EncodeURLComponent(after)
		  
		  If before <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("before") + "=" + EncodeURLComponent(before)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("filter") + "=" + EncodeURLComponent(FilterEnum_ListFilesInVectorStoreBatchToString(filter))
		  

		  
		  


		  Dim localVarPath As String = "/vector_stores/{vector_store_id}/file_batches/{batch_id}/files"
		  
		  Dim localVarPathStringvectorStoreId As String = vectorStoreId
		  
		  localVarPath = localVarPath.ReplaceAllB("{vector_store_id}", localVarPathStringvectorStoreId)
		  Dim localVarPathStringbatchId As String = batchId
		  
		  localVarPath = localVarPath.ReplaceAllB("{batch_id}", localVarPathStringbatchId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.ListFilesInVectorStoreBatch_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.ListFilesInVectorStoreBatch_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function ListFilesInVectorStoreBatchPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.ListVectorStoreFilesResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.ListVectorStoreFilesResponse
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub ListFilesInVectorStoreBatch_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.ListVectorStoreFilesResponse
		  CallbackHandler.ListFilesInVectorStoreBatchCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub ListFilesInVectorStoreBatch_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.ListVectorStoreFilesResponse
		  Call ListFilesInVectorStoreBatchPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.ListFilesInVectorStoreBatchCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function OrderEnum_ListFilesInVectorStoreBatchToString(value As OrderEnum_ListFilesInVectorStoreBatch) As String
		  Select Case value
		    
		    Case OrderEnum_ListFilesInVectorStoreBatch.Asc
		      Return "asc"
		    Case OrderEnum_ListFilesInVectorStoreBatch.Desc
		      Return "desc"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function FilterEnum_ListFilesInVectorStoreBatchToString(value As FilterEnum_ListFilesInVectorStoreBatch) As String
		  Select Case value
		    
		    Case FilterEnum_ListFilesInVectorStoreBatch.InProgress
		      Return "in_progress"
		    Case FilterEnum_ListFilesInVectorStoreBatch.Completed
		      Return "completed"
		    Case FilterEnum_ListFilesInVectorStoreBatch.Failed
		      Return "failed"
		    Case FilterEnum_ListFilesInVectorStoreBatch.Cancelled
		      Return "cancelled"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ListVectorStoreFiles(, vectorStoreId As String, Optional limit As Xoson.O.OptionalInteger, order As OrderEnum_ListVectorStoreFiles, Optional after As Xoson.O.OptionalString, Optional before As Xoson.O.OptionalString, filter As FilterEnum_ListVectorStoreFiles)
		  // Operation listVectorStoreFiles
		  // Returns a list of vector store files.
		  // - 
		  // - parameter vectorStoreId: (path) The ID of the vector store that the files belong to. 
		  // - parameter limit: (query) A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
		  // - parameter order: (query) Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
		  // - parameter after: (query) A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional, default to Sample)
		  // - parameter before: (query) A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional, default to Sample)
		  // - parameter filter: (query) Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. (optional, default to Sample)
		  //
		  // Invokes VectorStoresApiCallbackHandler.ListVectorStoreFilesCallback(ListVectorStoreFilesResponse) on completion. 
		  //
		  // - GET /vector_stores/{vector_store_id}/files
		  // - defaultResponse: Nil
		  //
		  // - Bearer Token:
		  //   - type: http
		  //   - name: ApiKeyAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If limit <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("limit") + "=" + EncodeURLComponent(limit.ToString)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("order") + "=" + EncodeURLComponent(OrderEnum_ListVectorStoreFilesToString(order))
		  
		  If after <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("after") + "=" + EncodeURLComponent(after)
		  
		  If before <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("before") + "=" + EncodeURLComponent(before)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("filter") + "=" + EncodeURLComponent(FilterEnum_ListVectorStoreFilesToString(filter))
		  

		  
		  


		  Dim localVarPath As String = "/vector_stores/{vector_store_id}/files"
		  
		  Dim localVarPathStringvectorStoreId As String = vectorStoreId
		  
		  localVarPath = localVarPath.ReplaceAllB("{vector_store_id}", localVarPathStringvectorStoreId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.ListVectorStoreFiles_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.ListVectorStoreFiles_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function ListVectorStoreFilesPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.ListVectorStoreFilesResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.ListVectorStoreFilesResponse
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub ListVectorStoreFiles_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.ListVectorStoreFilesResponse
		  CallbackHandler.ListVectorStoreFilesCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub ListVectorStoreFiles_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.ListVectorStoreFilesResponse
		  Call ListVectorStoreFilesPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.ListVectorStoreFilesCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function OrderEnum_ListVectorStoreFilesToString(value As OrderEnum_ListVectorStoreFiles) As String
		  Select Case value
		    
		    Case OrderEnum_ListVectorStoreFiles.Asc
		      Return "asc"
		    Case OrderEnum_ListVectorStoreFiles.Desc
		      Return "desc"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function FilterEnum_ListVectorStoreFilesToString(value As FilterEnum_ListVectorStoreFiles) As String
		  Select Case value
		    
		    Case FilterEnum_ListVectorStoreFiles.InProgress
		      Return "in_progress"
		    Case FilterEnum_ListVectorStoreFiles.Completed
		      Return "completed"
		    Case FilterEnum_ListVectorStoreFiles.Failed
		      Return "failed"
		    Case FilterEnum_ListVectorStoreFiles.Cancelled
		      Return "cancelled"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ListVectorStores(, Optional limit As Xoson.O.OptionalInteger, order As OrderEnum_ListVectorStores, Optional after As Xoson.O.OptionalString, Optional before As Xoson.O.OptionalString)
		  // Operation listVectorStores
		  // Returns a list of vector stores.
		  // - 
		  // - parameter limit: (query) A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
		  // - parameter order: (query) Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
		  // - parameter after: (query) A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional, default to Sample)
		  // - parameter before: (query) A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional, default to Sample)
		  //
		  // Invokes VectorStoresApiCallbackHandler.ListVectorStoresCallback(ListVectorStoresResponse) on completion. 
		  //
		  // - GET /vector_stores
		  // - defaultResponse: Nil
		  //
		  // - Bearer Token:
		  //   - type: http
		  //   - name: ApiKeyAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If limit <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("limit") + "=" + EncodeURLComponent(limit.ToString)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("order") + "=" + EncodeURLComponent(OrderEnum_ListVectorStoresToString(order))
		  
		  If after <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("after") + "=" + EncodeURLComponent(after)
		  
		  If before <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("before") + "=" + EncodeURLComponent(before)
		  

		  
		  


		  Dim localVarPath As String = "/vector_stores"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.ListVectorStores_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.ListVectorStores_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function ListVectorStoresPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.ListVectorStoresResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.ListVectorStoresResponse
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub ListVectorStores_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.ListVectorStoresResponse
		  CallbackHandler.ListVectorStoresCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub ListVectorStores_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.ListVectorStoresResponse
		  Call ListVectorStoresPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.ListVectorStoresCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function OrderEnum_ListVectorStoresToString(value As OrderEnum_ListVectorStores) As String
		  Select Case value
		    
		    Case OrderEnum_ListVectorStores.Asc
		      Return "asc"
		    Case OrderEnum_ListVectorStores.Desc
		      Return "desc"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ModifyVectorStore(, vectorStoreId As String, updateVectorStoreRequest As OpenAPIClient.Models.UpdateVectorStoreRequest)
		  // Operation modifyVectorStore
		  // Modifies a vector store.
		  // - 
		  // - parameter vectorStoreId: (path) The ID of the vector store to modify. 
		  // - parameter updateVectorStoreRequest: (body)  
		  //
		  // Invokes VectorStoresApiCallbackHandler.ModifyVectorStoreCallback(VectorStoreObject) on completion. 
		  //
		  // - POST /vector_stores/{vector_store_id}
		  // - defaultResponse: Nil
		  //
		  // - Bearer Token:
		  //   - type: http
		  //   - name: ApiKeyAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(updateVectorStoreRequest), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/vector_stores/{vector_store_id}"
		  
		  Dim localVarPathStringvectorStoreId As String = vectorStoreId
		  
		  localVarPath = localVarPath.ReplaceAllB("{vector_store_id}", localVarPathStringvectorStoreId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.ModifyVectorStore_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.ModifyVectorStore_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function ModifyVectorStorePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.VectorStoreObject) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.VectorStoreObject
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub ModifyVectorStore_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.VectorStoreObject
		  CallbackHandler.ModifyVectorStoreCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub ModifyVectorStore_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.VectorStoreObject
		  Call ModifyVectorStorePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.ModifyVectorStoreCallback(error, data)
		End Sub
	#tag EndMethod






	#tag Method, Flags = &h21
		Private Function AuthenticationRequired(Realm As String, Headers As InternetHeaders, ByRef Name As String, ByRef Password As String) As Boolean
		  #Pragma Unused Realm
		  #Pragma Unused Headers
		  Name = Me.BasicAuthUser
		  Password = Me.BasicAuthPassword
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PrivateFuncPrepareSocket(socket As HTTPSecureSocket)
		  socket.Secure = Me.useHTTPS
		  socket.ConnectionType = SSLSocket.TLSv12
		  socket.Port = Me.Port
		  socket.RequestHeaders.Delete("Accept")
		  socket.RequestHeaders.AppendHeader("Accept", "text/plain")
		  socket.RequestHeaders.AppendHeader("Accept", "application/json")
		  socket.RequestHeaders.AppendHeader("Content-Type", "application/json")

		  If Me.AdditionalHeaders <> Nil Then
		    For Each HeaderName As Variant In Me.AdditionalHeaders.Keys
		      Dim headerValueS As Variant = additionalHeaders.Value(HeaderName)
		      If headerValueS.IsArray Then
		        If headerValueS.ArrayElementType = Variant.TypeString Then
		          Dim values() As String = headerValueS
		          For Each value As String In values
		            socket.RequestHeaders.AppendHeader(HeaderName, value)
		          Next
		        Else
		          Raise New OpenAPIClient.OpenAPIClientException(kErrorInternal, "AdditionalHeaders only support Strings and String arrays as values.")
		        End If
		      Else
		        socket.RequestHeaders.AppendHeader(HeaderName, headerValueS.StringValue)
		      End If
		    Next
		  End If
		End Sub
	#tag EndMethod



	#tag Property, Flags = &h0
		AdditionalHeaders As Dictionary
	#tag EndProperty

	#tag Property, Flags = &h0
		BasePath As String = "https://api.openai.com/v1"
	#tag EndProperty

	#tag Property, Flags = &h0
		BasicAuthPassword As String
	#tag EndProperty

	#tag Property, Flags = &h0
		BasicAuthUser As String
	#tag EndProperty

	#tag Property, Flags = &h0
		CallbackHandler As OpenAPIClient.APIs.VectorStoresApiCallbackHandler
	#tag EndProperty

	#tag Property, Flags = &h0
		Host As String = ""
	#tag EndProperty

	#tag Property, Flags = &h0
		Port As Integer
	#tag EndProperty

	#tag Property, Flags = &h0
		UseHTTPS As Boolean = true
	#tag EndProperty

	#tag Enum, Name = OrderEnum_ListFilesInVectorStoreBatch, Type = Integer, Flags = &h0
		
        Asc
        Desc
		
	#tag EndEnum

	#tag Enum, Name = FilterEnum_ListFilesInVectorStoreBatch, Type = Integer, Flags = &h0
		
        InProgress
        Completed
        Failed
        Cancelled
		
	#tag EndEnum

	#tag Enum, Name = OrderEnum_ListVectorStoreFiles, Type = Integer, Flags = &h0
		
        Asc
        Desc
		
	#tag EndEnum

	#tag Enum, Name = FilterEnum_ListVectorStoreFiles, Type = Integer, Flags = &h0
		
        InProgress
        Completed
        Failed
        Cancelled
		
	#tag EndEnum

	#tag Enum, Name = OrderEnum_ListVectorStores, Type = Integer, Flags = &h0
		
        Asc
        Desc
		
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
		#tag ViewProperty
			Name="BasePath"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType="MultiLineEditor"
		#tag EndViewProperty
		#tag ViewProperty
			Name="BasicAuthUser"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType="MultiLineEditor"
		#tag EndViewProperty
		#tag ViewProperty
			Name="BasicAuthPassword"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType="MultiLineEditor"
		#tag EndViewProperty
		#tag ViewProperty
			Name="UseHTTPS"
			Visible=false
			Group="Behavior"
			InitialValue="true"
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Port"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Host"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType="MultiLineEditor"
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass
