#tag Class
Protected Class AudioApi
	#tag Method, Flags = &h0
		Sub CreateSpeech(downloadToFile As FolderItem, createSpeechRequest As OpenAPIClient.Models.CreateSpeechRequest)
		  // Operation createSpeech
		  // Generates audio from the input text.
		  // - parameter downloadToFile: The writable, non-existing path in the filesystem where the response body should be stored.
		  // - parameter createSpeechRequest: (body)  
		  //
		  // Invokes AudioApiCallbackHandler.CreateSpeechCallback(FolderItem) on completion. 
		  //
		  // - POST /audio/speech
		  // - defaultResponse: Sample
		  //
		  // - Bearer Token:
		  //   - type: http
		  //   - name: ApiKeyAuth
		  //
		  // - responseHeaders: [Transfer-Encoding(String)]
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(createSpeechRequest), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/audio/speech"
		  
		  
		  AddHandler localVarHTTPSocket.DownloadComplete, addressof me.CreateSpeech_handler
		  AddHandler localVarHTTPSocket.ReceiveProgress, addressof Me.CreateSpeech_progress
		  
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath, downloadToFile)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub CreateSpeech_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim file As FolderItem
		  CallbackHandler.CreateSpeechCallback(error, file)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub CreateSpeech_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, File As FolderItem)
		  #Pragma Unused URL
		  #Pragma Unused Headers

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.CreateSpeechCallback(error, File)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub CreateSpeech_progress(sender As HTTPSecureSocket, BytesReceived As Integer, TotalBytes As Integer, NewData As String)
		  CallbackHandler.CreateSpeechDownloadProgress(BytesReceived, TotalBytes)
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h0
		Sub CreateTranscription(, Escapedfile As FolderItem, model As OpenAPIClient.Models.CreateTranscriptionRequestModel, Optional language As Xoson.O.OptionalString, Optional prompt As Xoson.O.OptionalString, responseFormat As AudioResponseFormat, Optional temperature As Xoson.O.OptionalDouble, timestampGranularities() As Timestamp_granularitiesEnum_CreateTranscription)
		  // Operation createTranscription
		  // Transcribes audio into the input language.
		  // - 
		  // - parameter Escapedfile: (form) The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  
		  // - parameter model: (form)  
		  // - parameter language: (form) The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  (optional, default to Sample)
		  // - parameter prompt: (form) An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language.  (optional, default to Sample)
		  // - parameter responseFormat: (form)  (optional, default to Nil)
		  // - parameter temperature: (form) The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional, default to 0)
		  // - parameter timestampGranularities: (form) The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.  (optional, default to Sample)
		  //
		  // Invokes AudioApiCallbackHandler.CreateTranscriptionCallback(CreateTranscription200Response) on completion. 
		  //
		  // - POST /audio/transcriptions
		  // - defaultResponse: Nil
		  //
		  // - Bearer Token:
		  //   - type: http
		  //   - name: ApiKeyAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  Dim localVarFormParams As New Dictionary
		  localVarFormParams.Value("file") = Escapedfile.LocalFuncSerializeFile
localVarFormParams.Value("model") = Xoson.toJSON(model)
If language <> nil Then localVarFormParams.Value("language") = language
If prompt <> nil Then localVarFormParams.Value("prompt") = prompt
If responseFormat <> nil Then localVarFormParams.Value("response_format") = Xoson.toJSON(responseFormat)
If temperature <> nil Then localVarFormParams.Value("temperature") = temperature.ToString
localVarFormParams.Value("timestamp_granularities[]") = Timestamp_granularitiesEnum_CreateTranscriptionToString(timestampGranularities)
		  If localVarFormParams.Count > 0 Then localVarHTTPSocket.SetFormData(localVarFormParams)
		  
		  
		  
		  


		  Dim localVarPath As String = "/audio/transcriptions"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.CreateTranscription_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.CreateTranscription_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function CreateTranscriptionPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.CreateTranscription200Response) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.CreateTranscription200Response
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
		Private Sub CreateTranscription_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.CreateTranscription200Response
		  CallbackHandler.CreateTranscriptionCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub CreateTranscription_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.CreateTranscription200Response
		  Call CreateTranscriptionPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.CreateTranscriptionCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function Timestamp_granularitiesEnum_CreateTranscriptionToString(value As Timestamp_granularitiesEnum_CreateTranscription) As String
		  Select Case value
		    
		    Case Timestamp_granularitiesEnum_CreateTranscription.Word
		      Return "word"
		    Case Timestamp_granularitiesEnum_CreateTranscription.Segment
		      Return "segment"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateTranslation(, Escapedfile As FolderItem, model As OpenAPIClient.Models.CreateTranscriptionRequestModel, Optional prompt As Xoson.O.OptionalString, responseFormat As AudioResponseFormat, Optional temperature As Xoson.O.OptionalDouble)
		  // Operation createTranslation
		  // Translates audio into English.
		  // - 
		  // - parameter Escapedfile: (form) The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  
		  // - parameter model: (form)  
		  // - parameter prompt: (form) An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English.  (optional, default to Sample)
		  // - parameter responseFormat: (form)  (optional, default to Nil)
		  // - parameter temperature: (form) The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional, default to 0)
		  //
		  // Invokes AudioApiCallbackHandler.CreateTranslationCallback(CreateTranslation200Response) on completion. 
		  //
		  // - POST /audio/translations
		  // - defaultResponse: Nil
		  //
		  // - Bearer Token:
		  //   - type: http
		  //   - name: ApiKeyAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  Dim localVarFormParams As New Dictionary
		  localVarFormParams.Value("file") = Escapedfile.LocalFuncSerializeFile
localVarFormParams.Value("model") = Xoson.toJSON(model)
If prompt <> nil Then localVarFormParams.Value("prompt") = prompt
If responseFormat <> nil Then localVarFormParams.Value("response_format") = Xoson.toJSON(responseFormat)
If temperature <> nil Then localVarFormParams.Value("temperature") = temperature.ToString
		  If localVarFormParams.Count > 0 Then localVarHTTPSocket.SetFormData(localVarFormParams)
		  
		  
		  
		  


		  Dim localVarPath As String = "/audio/translations"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.CreateTranslation_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.CreateTranslation_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function CreateTranslationPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.CreateTranslation200Response) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.CreateTranslation200Response
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
		Private Sub CreateTranslation_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.CreateTranslation200Response
		  CallbackHandler.CreateTranslationCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub CreateTranslation_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.CreateTranslation200Response
		  Call CreateTranslationPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.CreateTranslationCallback(error, data)
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
		CallbackHandler As OpenAPIClient.APIs.AudioApiCallbackHandler
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

	#tag Enum, Name = Timestamp_granularitiesEnum_CreateTranscription, Type = Integer, Flags = &h0
		
        Word
        Segment
		
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
