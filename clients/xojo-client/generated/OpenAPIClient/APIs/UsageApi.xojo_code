#tag Class
Protected Class UsageApi
	#tag Method, Flags = &h0
		Sub UsageAudioSpeeches(, startTime As Integer, Optional endTime As Xoson.O.OptionalInteger, bucketWidth As Bucket_widthEnum_UsageAudioSpeeches, projectIds() As String, userIds() As String, apiKeyIds() As String, Escapedmodels() As String, groupBy() As Group_byEnum_UsageAudioSpeeches, Optional limit As Xoson.O.OptionalInteger, Optional page As Xoson.O.OptionalString)
		  // Operation usage-audio-speeches
		  // Get audio speeches usage details for the organization.
		  // - 
		  // - parameter startTime: (query) Start time (Unix seconds) of the query time range, inclusive. 
		  // - parameter endTime: (query) End time (Unix seconds) of the query time range, exclusive. (optional, default to 0)
		  // - parameter bucketWidth: (query) Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. (optional, default to 1d)
		  // - parameter projectIds: (query) Return only usage for these projects. (optional, default to Nil)
		  // - parameter userIds: (query) Return only usage for these users. (optional, default to Nil)
		  // - parameter apiKeyIds: (query) Return only usage for these API keys. (optional, default to Nil)
		  // - parameter Escapedmodels: (query) Return only usage for these models. (optional, default to Nil)
		  // - parameter groupBy: (query) Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. (optional, default to Nil)
		  // - parameter limit: (query) Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  (optional, default to 0)
		  // - parameter page: (query) A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. (optional, default to Sample)
		  //
		  // Invokes UsageApiCallbackHandler.UsageAudioSpeechesCallback(UsageResponse) on completion. 
		  //
		  // - GET /organization/usage/audio_speeches
		  // - defaultResponse: Nil
		  //
		  // - Bearer Token:
		  //   - type: http
		  //   - name: ApiKeyAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  localVarQueryParams = localVarQueryParams + EncodeURLComponent("start_time") + "=" + EncodeURLComponent(startTime.ToString)
		  
		  If endTime <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("end_time") + "=" + EncodeURLComponent(endTime.ToString)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("bucket_width") + "=" + EncodeURLComponent(Bucket_widthEnum_UsageAudioSpeechesToString(bucketWidth))
		  
		  
		  Dim localVarQueryStringsprojectIds() As String
		  For Each localVarItemprojectIds As String in projectIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemprojectIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsprojectIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsprojectIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsprojectIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringprojectIds As String
		  localVarQueryStringprojectIds = Join(localVarQueryStringsprojectIds, "&")
		  
		  Dim localVarQueryStringsuserIds() As String
		  For Each localVarItemuserIds As String in userIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemuserIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsuserIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsuserIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsuserIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringuserIds As String
		  localVarQueryStringuserIds = Join(localVarQueryStringsuserIds, "&")
		  
		  Dim localVarQueryStringsapiKeyIds() As String
		  For Each localVarItemapiKeyIds As String in apiKeyIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemapiKeyIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsapiKeyIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsapiKeyIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsapiKeyIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringapiKeyIds As String
		  localVarQueryStringapiKeyIds = Join(localVarQueryStringsapiKeyIds, "&")
		  
		  Dim localVarQueryStringsEscapedmodels() As String
		  For Each localVarItemEscapedmodels As String in Escapedmodels
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemEscapedmodels)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsEscapedmodels.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsEscapedmodels.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsEscapedmodels.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringEscapedmodels As String
		  localVarQueryStringEscapedmodels = Join(localVarQueryStringsEscapedmodels, "&")
		  
		  Dim localVarQueryStringsgroupBy() As String
		  For Each localVarItemgroupBy As Group_byEnum_UsageAudioSpeeches in groupBy
		    Dim encodedParameter As String = EncodeURLComponent(Group_byEnum_UsageAudioSpeechesToString(localVarItemgroupBy))
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsgroupBy.Append("group_by=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsgroupBy.Append("group_by=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsgroupBy.Append("group_by=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringgroupBy As String
		  localVarQueryStringgroupBy = Join(localVarQueryStringsgroupBy, "&")
		  If limit <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("limit") + "=" + EncodeURLComponent(limit.ToString)
		  
		  If page <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("page") + "=" + EncodeURLComponent(page)
		  

		  
		  


		  Dim localVarPath As String = "/organization/usage/audio_speeches"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.UsageAudioSpeeches_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.UsageAudioSpeeches_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function UsageAudioSpeechesPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.UsageResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.UsageResponse
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
		Private Sub UsageAudioSpeeches_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.UsageResponse
		  CallbackHandler.UsageAudioSpeechesCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub UsageAudioSpeeches_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.UsageResponse
		  Call UsageAudioSpeechesPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.UsageAudioSpeechesCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function Bucket_widthEnum_UsageAudioSpeechesToString(value As Bucket_widthEnum_UsageAudioSpeeches) As String
		  Select Case value
		    
		    Case Bucket_widthEnum_UsageAudioSpeeches.Escaped1m
		      Return "1m"
		    Case Bucket_widthEnum_UsageAudioSpeeches.Escaped1h
		      Return "1h"
		    Case Bucket_widthEnum_UsageAudioSpeeches.Escaped1d
		      Return "1d"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Group_byEnum_UsageAudioSpeechesToString(value As Group_byEnum_UsageAudioSpeeches) As String
		  Select Case value
		    
		    Case Group_byEnum_UsageAudioSpeeches.ProjectId
		      Return "project_id"
		    Case Group_byEnum_UsageAudioSpeeches.UserId
		      Return "user_id"
		    Case Group_byEnum_UsageAudioSpeeches.ApiKeyId
		      Return "api_key_id"
		    Case Group_byEnum_UsageAudioSpeeches.Model
		      Return "model"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UsageAudioTranscriptions(, startTime As Integer, Optional endTime As Xoson.O.OptionalInteger, bucketWidth As Bucket_widthEnum_UsageAudioTranscriptions, projectIds() As String, userIds() As String, apiKeyIds() As String, Escapedmodels() As String, groupBy() As Group_byEnum_UsageAudioTranscriptions, Optional limit As Xoson.O.OptionalInteger, Optional page As Xoson.O.OptionalString)
		  // Operation usage-audio-transcriptions
		  // Get audio transcriptions usage details for the organization.
		  // - 
		  // - parameter startTime: (query) Start time (Unix seconds) of the query time range, inclusive. 
		  // - parameter endTime: (query) End time (Unix seconds) of the query time range, exclusive. (optional, default to 0)
		  // - parameter bucketWidth: (query) Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. (optional, default to 1d)
		  // - parameter projectIds: (query) Return only usage for these projects. (optional, default to Nil)
		  // - parameter userIds: (query) Return only usage for these users. (optional, default to Nil)
		  // - parameter apiKeyIds: (query) Return only usage for these API keys. (optional, default to Nil)
		  // - parameter Escapedmodels: (query) Return only usage for these models. (optional, default to Nil)
		  // - parameter groupBy: (query) Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. (optional, default to Nil)
		  // - parameter limit: (query) Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  (optional, default to 0)
		  // - parameter page: (query) A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. (optional, default to Sample)
		  //
		  // Invokes UsageApiCallbackHandler.UsageAudioTranscriptionsCallback(UsageResponse) on completion. 
		  //
		  // - GET /organization/usage/audio_transcriptions
		  // - defaultResponse: Nil
		  //
		  // - Bearer Token:
		  //   - type: http
		  //   - name: ApiKeyAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  localVarQueryParams = localVarQueryParams + EncodeURLComponent("start_time") + "=" + EncodeURLComponent(startTime.ToString)
		  
		  If endTime <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("end_time") + "=" + EncodeURLComponent(endTime.ToString)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("bucket_width") + "=" + EncodeURLComponent(Bucket_widthEnum_UsageAudioTranscriptionsToString(bucketWidth))
		  
		  
		  Dim localVarQueryStringsprojectIds() As String
		  For Each localVarItemprojectIds As String in projectIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemprojectIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsprojectIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsprojectIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsprojectIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringprojectIds As String
		  localVarQueryStringprojectIds = Join(localVarQueryStringsprojectIds, "&")
		  
		  Dim localVarQueryStringsuserIds() As String
		  For Each localVarItemuserIds As String in userIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemuserIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsuserIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsuserIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsuserIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringuserIds As String
		  localVarQueryStringuserIds = Join(localVarQueryStringsuserIds, "&")
		  
		  Dim localVarQueryStringsapiKeyIds() As String
		  For Each localVarItemapiKeyIds As String in apiKeyIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemapiKeyIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsapiKeyIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsapiKeyIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsapiKeyIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringapiKeyIds As String
		  localVarQueryStringapiKeyIds = Join(localVarQueryStringsapiKeyIds, "&")
		  
		  Dim localVarQueryStringsEscapedmodels() As String
		  For Each localVarItemEscapedmodels As String in Escapedmodels
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemEscapedmodels)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsEscapedmodels.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsEscapedmodels.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsEscapedmodels.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringEscapedmodels As String
		  localVarQueryStringEscapedmodels = Join(localVarQueryStringsEscapedmodels, "&")
		  
		  Dim localVarQueryStringsgroupBy() As String
		  For Each localVarItemgroupBy As Group_byEnum_UsageAudioTranscriptions in groupBy
		    Dim encodedParameter As String = EncodeURLComponent(Group_byEnum_UsageAudioTranscriptionsToString(localVarItemgroupBy))
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsgroupBy.Append("group_by=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsgroupBy.Append("group_by=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsgroupBy.Append("group_by=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringgroupBy As String
		  localVarQueryStringgroupBy = Join(localVarQueryStringsgroupBy, "&")
		  If limit <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("limit") + "=" + EncodeURLComponent(limit.ToString)
		  
		  If page <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("page") + "=" + EncodeURLComponent(page)
		  

		  
		  


		  Dim localVarPath As String = "/organization/usage/audio_transcriptions"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.UsageAudioTranscriptions_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.UsageAudioTranscriptions_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function UsageAudioTranscriptionsPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.UsageResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.UsageResponse
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
		Private Sub UsageAudioTranscriptions_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.UsageResponse
		  CallbackHandler.UsageAudioTranscriptionsCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub UsageAudioTranscriptions_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.UsageResponse
		  Call UsageAudioTranscriptionsPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.UsageAudioTranscriptionsCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function Bucket_widthEnum_UsageAudioTranscriptionsToString(value As Bucket_widthEnum_UsageAudioTranscriptions) As String
		  Select Case value
		    
		    Case Bucket_widthEnum_UsageAudioTranscriptions.Escaped1m
		      Return "1m"
		    Case Bucket_widthEnum_UsageAudioTranscriptions.Escaped1h
		      Return "1h"
		    Case Bucket_widthEnum_UsageAudioTranscriptions.Escaped1d
		      Return "1d"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Group_byEnum_UsageAudioTranscriptionsToString(value As Group_byEnum_UsageAudioTranscriptions) As String
		  Select Case value
		    
		    Case Group_byEnum_UsageAudioTranscriptions.ProjectId
		      Return "project_id"
		    Case Group_byEnum_UsageAudioTranscriptions.UserId
		      Return "user_id"
		    Case Group_byEnum_UsageAudioTranscriptions.ApiKeyId
		      Return "api_key_id"
		    Case Group_byEnum_UsageAudioTranscriptions.Model
		      Return "model"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UsageCodeInterpreterSessions(, startTime As Integer, Optional endTime As Xoson.O.OptionalInteger, bucketWidth As Bucket_widthEnum_UsageCodeInterpreterSessions, projectIds() As String, groupBy() As Group_byEnum_UsageCodeInterpreterSessions, Optional limit As Xoson.O.OptionalInteger, Optional page As Xoson.O.OptionalString)
		  // Operation usage-code-interpreter-sessions
		  // Get code interpreter sessions usage details for the organization.
		  // - 
		  // - parameter startTime: (query) Start time (Unix seconds) of the query time range, inclusive. 
		  // - parameter endTime: (query) End time (Unix seconds) of the query time range, exclusive. (optional, default to 0)
		  // - parameter bucketWidth: (query) Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. (optional, default to 1d)
		  // - parameter projectIds: (query) Return only usage for these projects. (optional, default to Nil)
		  // - parameter groupBy: (query) Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. (optional, default to Nil)
		  // - parameter limit: (query) Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  (optional, default to 0)
		  // - parameter page: (query) A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. (optional, default to Sample)
		  //
		  // Invokes UsageApiCallbackHandler.UsageCodeInterpreterSessionsCallback(UsageResponse) on completion. 
		  //
		  // - GET /organization/usage/code_interpreter_sessions
		  // - defaultResponse: Nil
		  //
		  // - Bearer Token:
		  //   - type: http
		  //   - name: ApiKeyAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  localVarQueryParams = localVarQueryParams + EncodeURLComponent("start_time") + "=" + EncodeURLComponent(startTime.ToString)
		  
		  If endTime <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("end_time") + "=" + EncodeURLComponent(endTime.ToString)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("bucket_width") + "=" + EncodeURLComponent(Bucket_widthEnum_UsageCodeInterpreterSessionsToString(bucketWidth))
		  
		  
		  Dim localVarQueryStringsprojectIds() As String
		  For Each localVarItemprojectIds As String in projectIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemprojectIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsprojectIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsprojectIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsprojectIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringprojectIds As String
		  localVarQueryStringprojectIds = Join(localVarQueryStringsprojectIds, "&")
		  
		  Dim localVarQueryStringsgroupBy() As String
		  For Each localVarItemgroupBy As Group_byEnum_UsageCodeInterpreterSessions in groupBy
		    Dim encodedParameter As String = EncodeURLComponent(Group_byEnum_UsageCodeInterpreterSessionsToString(localVarItemgroupBy))
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsgroupBy.Append("group_by=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsgroupBy.Append("group_by=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsgroupBy.Append("group_by=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringgroupBy As String
		  localVarQueryStringgroupBy = Join(localVarQueryStringsgroupBy, "&")
		  If limit <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("limit") + "=" + EncodeURLComponent(limit.ToString)
		  
		  If page <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("page") + "=" + EncodeURLComponent(page)
		  

		  
		  


		  Dim localVarPath As String = "/organization/usage/code_interpreter_sessions"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.UsageCodeInterpreterSessions_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.UsageCodeInterpreterSessions_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function UsageCodeInterpreterSessionsPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.UsageResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.UsageResponse
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
		Private Sub UsageCodeInterpreterSessions_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.UsageResponse
		  CallbackHandler.UsageCodeInterpreterSessionsCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub UsageCodeInterpreterSessions_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.UsageResponse
		  Call UsageCodeInterpreterSessionsPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.UsageCodeInterpreterSessionsCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function Bucket_widthEnum_UsageCodeInterpreterSessionsToString(value As Bucket_widthEnum_UsageCodeInterpreterSessions) As String
		  Select Case value
		    
		    Case Bucket_widthEnum_UsageCodeInterpreterSessions.Escaped1m
		      Return "1m"
		    Case Bucket_widthEnum_UsageCodeInterpreterSessions.Escaped1h
		      Return "1h"
		    Case Bucket_widthEnum_UsageCodeInterpreterSessions.Escaped1d
		      Return "1d"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Group_byEnum_UsageCodeInterpreterSessionsToString(value As Group_byEnum_UsageCodeInterpreterSessions) As String
		  Select Case value
		    
		    Case Group_byEnum_UsageCodeInterpreterSessions.ProjectId
		      Return "project_id"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UsageCompletions(, startTime As Integer, Optional endTime As Xoson.O.OptionalInteger, bucketWidth As Bucket_widthEnum_UsageCompletions, projectIds() As String, userIds() As String, apiKeyIds() As String, Escapedmodels() As String, Optional batch As Xoson.O.OptionalBoolean, groupBy() As Group_byEnum_UsageCompletions, Optional limit As Xoson.O.OptionalInteger, Optional page As Xoson.O.OptionalString)
		  // Operation usage-completions
		  // Get completions usage details for the organization.
		  // - 
		  // - parameter startTime: (query) Start time (Unix seconds) of the query time range, inclusive. 
		  // - parameter endTime: (query) End time (Unix seconds) of the query time range, exclusive. (optional, default to 0)
		  // - parameter bucketWidth: (query) Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. (optional, default to 1d)
		  // - parameter projectIds: (query) Return only usage for these projects. (optional, default to Nil)
		  // - parameter userIds: (query) Return only usage for these users. (optional, default to Nil)
		  // - parameter apiKeyIds: (query) Return only usage for these API keys. (optional, default to Nil)
		  // - parameter Escapedmodels: (query) Return only usage for these models. (optional, default to Nil)
		  // - parameter batch: (query) If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both.  (optional, default to False)
		  // - parameter groupBy: (query) Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them. (optional, default to Nil)
		  // - parameter limit: (query) Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  (optional, default to 0)
		  // - parameter page: (query) A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. (optional, default to Sample)
		  //
		  // Invokes UsageApiCallbackHandler.UsageCompletionsCallback(UsageResponse) on completion. 
		  //
		  // - GET /organization/usage/completions
		  // - defaultResponse: Nil
		  //
		  // - Bearer Token:
		  //   - type: http
		  //   - name: ApiKeyAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  localVarQueryParams = localVarQueryParams + EncodeURLComponent("start_time") + "=" + EncodeURLComponent(startTime.ToString)
		  
		  If endTime <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("end_time") + "=" + EncodeURLComponent(endTime.ToString)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("bucket_width") + "=" + EncodeURLComponent(Bucket_widthEnum_UsageCompletionsToString(bucketWidth))
		  
		  
		  Dim localVarQueryStringsprojectIds() As String
		  For Each localVarItemprojectIds As String in projectIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemprojectIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsprojectIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsprojectIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsprojectIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringprojectIds As String
		  localVarQueryStringprojectIds = Join(localVarQueryStringsprojectIds, "&")
		  
		  Dim localVarQueryStringsuserIds() As String
		  For Each localVarItemuserIds As String in userIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemuserIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsuserIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsuserIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsuserIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringuserIds As String
		  localVarQueryStringuserIds = Join(localVarQueryStringsuserIds, "&")
		  
		  Dim localVarQueryStringsapiKeyIds() As String
		  For Each localVarItemapiKeyIds As String in apiKeyIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemapiKeyIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsapiKeyIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsapiKeyIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsapiKeyIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringapiKeyIds As String
		  localVarQueryStringapiKeyIds = Join(localVarQueryStringsapiKeyIds, "&")
		  
		  Dim localVarQueryStringsEscapedmodels() As String
		  For Each localVarItemEscapedmodels As String in Escapedmodels
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemEscapedmodels)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsEscapedmodels.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsEscapedmodels.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsEscapedmodels.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringEscapedmodels As String
		  localVarQueryStringEscapedmodels = Join(localVarQueryStringsEscapedmodels, "&")
		  If batch <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("batch") + "=" + EncodeURLComponent(batch.ToString)
		  
		  
		  Dim localVarQueryStringsgroupBy() As String
		  For Each localVarItemgroupBy As Group_byEnum_UsageCompletions in groupBy
		    Dim encodedParameter As String = EncodeURLComponent(Group_byEnum_UsageCompletionsToString(localVarItemgroupBy))
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsgroupBy.Append("group_by=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsgroupBy.Append("group_by=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsgroupBy.Append("group_by=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringgroupBy As String
		  localVarQueryStringgroupBy = Join(localVarQueryStringsgroupBy, "&")
		  If limit <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("limit") + "=" + EncodeURLComponent(limit.ToString)
		  
		  If page <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("page") + "=" + EncodeURLComponent(page)
		  

		  
		  


		  Dim localVarPath As String = "/organization/usage/completions"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.UsageCompletions_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.UsageCompletions_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function UsageCompletionsPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.UsageResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.UsageResponse
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
		Private Sub UsageCompletions_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.UsageResponse
		  CallbackHandler.UsageCompletionsCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub UsageCompletions_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.UsageResponse
		  Call UsageCompletionsPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.UsageCompletionsCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function Bucket_widthEnum_UsageCompletionsToString(value As Bucket_widthEnum_UsageCompletions) As String
		  Select Case value
		    
		    Case Bucket_widthEnum_UsageCompletions.Escaped1m
		      Return "1m"
		    Case Bucket_widthEnum_UsageCompletions.Escaped1h
		      Return "1h"
		    Case Bucket_widthEnum_UsageCompletions.Escaped1d
		      Return "1d"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Group_byEnum_UsageCompletionsToString(value As Group_byEnum_UsageCompletions) As String
		  Select Case value
		    
		    Case Group_byEnum_UsageCompletions.ProjectId
		      Return "project_id"
		    Case Group_byEnum_UsageCompletions.UserId
		      Return "user_id"
		    Case Group_byEnum_UsageCompletions.ApiKeyId
		      Return "api_key_id"
		    Case Group_byEnum_UsageCompletions.Model
		      Return "model"
		    Case Group_byEnum_UsageCompletions.Batch
		      Return "batch"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UsageCosts(, startTime As Integer, Optional endTime As Xoson.O.OptionalInteger, bucketWidth As Bucket_widthEnum_UsageCosts, projectIds() As String, groupBy() As Group_byEnum_UsageCosts, Optional limit As Xoson.O.OptionalInteger, Optional page As Xoson.O.OptionalString)
		  // Operation usage-costs
		  // Get costs details for the organization.
		  // - 
		  // - parameter startTime: (query) Start time (Unix seconds) of the query time range, inclusive. 
		  // - parameter endTime: (query) End time (Unix seconds) of the query time range, exclusive. (optional, default to 0)
		  // - parameter bucketWidth: (query) Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;. (optional, default to 1d)
		  // - parameter projectIds: (query) Return only costs for these projects. (optional, default to Nil)
		  // - parameter groupBy: (query) Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them. (optional, default to Nil)
		  // - parameter limit: (query) A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  (optional, default to 7)
		  // - parameter page: (query) A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. (optional, default to Sample)
		  //
		  // Invokes UsageApiCallbackHandler.UsageCostsCallback(UsageResponse) on completion. 
		  //
		  // - GET /organization/costs
		  // - defaultResponse: Nil
		  //
		  // - Bearer Token:
		  //   - type: http
		  //   - name: ApiKeyAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  localVarQueryParams = localVarQueryParams + EncodeURLComponent("start_time") + "=" + EncodeURLComponent(startTime.ToString)
		  
		  If endTime <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("end_time") + "=" + EncodeURLComponent(endTime.ToString)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("bucket_width") + "=" + EncodeURLComponent(Bucket_widthEnum_UsageCostsToString(bucketWidth))
		  
		  
		  Dim localVarQueryStringsprojectIds() As String
		  For Each localVarItemprojectIds As String in projectIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemprojectIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsprojectIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsprojectIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsprojectIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringprojectIds As String
		  localVarQueryStringprojectIds = Join(localVarQueryStringsprojectIds, "&")
		  
		  Dim localVarQueryStringsgroupBy() As String
		  For Each localVarItemgroupBy As Group_byEnum_UsageCosts in groupBy
		    Dim encodedParameter As String = EncodeURLComponent(Group_byEnum_UsageCostsToString(localVarItemgroupBy))
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsgroupBy.Append("group_by=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsgroupBy.Append("group_by=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsgroupBy.Append("group_by=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringgroupBy As String
		  localVarQueryStringgroupBy = Join(localVarQueryStringsgroupBy, "&")
		  If limit <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("limit") + "=" + EncodeURLComponent(limit.ToString)
		  
		  If page <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("page") + "=" + EncodeURLComponent(page)
		  

		  
		  


		  Dim localVarPath As String = "/organization/costs"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.UsageCosts_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.UsageCosts_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function UsageCostsPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.UsageResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.UsageResponse
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
		Private Sub UsageCosts_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.UsageResponse
		  CallbackHandler.UsageCostsCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub UsageCosts_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.UsageResponse
		  Call UsageCostsPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.UsageCostsCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function Bucket_widthEnum_UsageCostsToString(value As Bucket_widthEnum_UsageCosts) As String
		  Select Case value
		    
		    Case Bucket_widthEnum_UsageCosts.Escaped1d
		      Return "1d"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Group_byEnum_UsageCostsToString(value As Group_byEnum_UsageCosts) As String
		  Select Case value
		    
		    Case Group_byEnum_UsageCosts.ProjectId
		      Return "project_id"
		    Case Group_byEnum_UsageCosts.LineItem
		      Return "line_item"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UsageEmbeddings(, startTime As Integer, Optional endTime As Xoson.O.OptionalInteger, bucketWidth As Bucket_widthEnum_UsageEmbeddings, projectIds() As String, userIds() As String, apiKeyIds() As String, Escapedmodels() As String, groupBy() As Group_byEnum_UsageEmbeddings, Optional limit As Xoson.O.OptionalInteger, Optional page As Xoson.O.OptionalString)
		  // Operation usage-embeddings
		  // Get embeddings usage details for the organization.
		  // - 
		  // - parameter startTime: (query) Start time (Unix seconds) of the query time range, inclusive. 
		  // - parameter endTime: (query) End time (Unix seconds) of the query time range, exclusive. (optional, default to 0)
		  // - parameter bucketWidth: (query) Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. (optional, default to 1d)
		  // - parameter projectIds: (query) Return only usage for these projects. (optional, default to Nil)
		  // - parameter userIds: (query) Return only usage for these users. (optional, default to Nil)
		  // - parameter apiKeyIds: (query) Return only usage for these API keys. (optional, default to Nil)
		  // - parameter Escapedmodels: (query) Return only usage for these models. (optional, default to Nil)
		  // - parameter groupBy: (query) Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. (optional, default to Nil)
		  // - parameter limit: (query) Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  (optional, default to 0)
		  // - parameter page: (query) A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. (optional, default to Sample)
		  //
		  // Invokes UsageApiCallbackHandler.UsageEmbeddingsCallback(UsageResponse) on completion. 
		  //
		  // - GET /organization/usage/embeddings
		  // - defaultResponse: Nil
		  //
		  // - Bearer Token:
		  //   - type: http
		  //   - name: ApiKeyAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  localVarQueryParams = localVarQueryParams + EncodeURLComponent("start_time") + "=" + EncodeURLComponent(startTime.ToString)
		  
		  If endTime <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("end_time") + "=" + EncodeURLComponent(endTime.ToString)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("bucket_width") + "=" + EncodeURLComponent(Bucket_widthEnum_UsageEmbeddingsToString(bucketWidth))
		  
		  
		  Dim localVarQueryStringsprojectIds() As String
		  For Each localVarItemprojectIds As String in projectIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemprojectIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsprojectIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsprojectIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsprojectIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringprojectIds As String
		  localVarQueryStringprojectIds = Join(localVarQueryStringsprojectIds, "&")
		  
		  Dim localVarQueryStringsuserIds() As String
		  For Each localVarItemuserIds As String in userIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemuserIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsuserIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsuserIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsuserIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringuserIds As String
		  localVarQueryStringuserIds = Join(localVarQueryStringsuserIds, "&")
		  
		  Dim localVarQueryStringsapiKeyIds() As String
		  For Each localVarItemapiKeyIds As String in apiKeyIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemapiKeyIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsapiKeyIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsapiKeyIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsapiKeyIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringapiKeyIds As String
		  localVarQueryStringapiKeyIds = Join(localVarQueryStringsapiKeyIds, "&")
		  
		  Dim localVarQueryStringsEscapedmodels() As String
		  For Each localVarItemEscapedmodels As String in Escapedmodels
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemEscapedmodels)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsEscapedmodels.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsEscapedmodels.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsEscapedmodels.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringEscapedmodels As String
		  localVarQueryStringEscapedmodels = Join(localVarQueryStringsEscapedmodels, "&")
		  
		  Dim localVarQueryStringsgroupBy() As String
		  For Each localVarItemgroupBy As Group_byEnum_UsageEmbeddings in groupBy
		    Dim encodedParameter As String = EncodeURLComponent(Group_byEnum_UsageEmbeddingsToString(localVarItemgroupBy))
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsgroupBy.Append("group_by=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsgroupBy.Append("group_by=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsgroupBy.Append("group_by=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringgroupBy As String
		  localVarQueryStringgroupBy = Join(localVarQueryStringsgroupBy, "&")
		  If limit <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("limit") + "=" + EncodeURLComponent(limit.ToString)
		  
		  If page <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("page") + "=" + EncodeURLComponent(page)
		  

		  
		  


		  Dim localVarPath As String = "/organization/usage/embeddings"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.UsageEmbeddings_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.UsageEmbeddings_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function UsageEmbeddingsPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.UsageResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.UsageResponse
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
		Private Sub UsageEmbeddings_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.UsageResponse
		  CallbackHandler.UsageEmbeddingsCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub UsageEmbeddings_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.UsageResponse
		  Call UsageEmbeddingsPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.UsageEmbeddingsCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function Bucket_widthEnum_UsageEmbeddingsToString(value As Bucket_widthEnum_UsageEmbeddings) As String
		  Select Case value
		    
		    Case Bucket_widthEnum_UsageEmbeddings.Escaped1m
		      Return "1m"
		    Case Bucket_widthEnum_UsageEmbeddings.Escaped1h
		      Return "1h"
		    Case Bucket_widthEnum_UsageEmbeddings.Escaped1d
		      Return "1d"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Group_byEnum_UsageEmbeddingsToString(value As Group_byEnum_UsageEmbeddings) As String
		  Select Case value
		    
		    Case Group_byEnum_UsageEmbeddings.ProjectId
		      Return "project_id"
		    Case Group_byEnum_UsageEmbeddings.UserId
		      Return "user_id"
		    Case Group_byEnum_UsageEmbeddings.ApiKeyId
		      Return "api_key_id"
		    Case Group_byEnum_UsageEmbeddings.Model
		      Return "model"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UsageImages(, startTime As Integer, Optional endTime As Xoson.O.OptionalInteger, bucketWidth As Bucket_widthEnum_UsageImages, sources() As SourcesEnum_UsageImages, sizes() As SizesEnum_UsageImages, projectIds() As String, userIds() As String, apiKeyIds() As String, Escapedmodels() As String, groupBy() As Group_byEnum_UsageImages, Optional limit As Xoson.O.OptionalInteger, Optional page As Xoson.O.OptionalString)
		  // Operation usage-images
		  // Get images usage details for the organization.
		  // - 
		  // - parameter startTime: (query) Start time (Unix seconds) of the query time range, inclusive. 
		  // - parameter endTime: (query) End time (Unix seconds) of the query time range, exclusive. (optional, default to 0)
		  // - parameter bucketWidth: (query) Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. (optional, default to 1d)
		  // - parameter sources: (query) Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them. (optional, default to Nil)
		  // - parameter sizes: (query) Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them. (optional, default to Nil)
		  // - parameter projectIds: (query) Return only usage for these projects. (optional, default to Nil)
		  // - parameter userIds: (query) Return only usage for these users. (optional, default to Nil)
		  // - parameter apiKeyIds: (query) Return only usage for these API keys. (optional, default to Nil)
		  // - parameter Escapedmodels: (query) Return only usage for these models. (optional, default to Nil)
		  // - parameter groupBy: (query) Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them. (optional, default to Nil)
		  // - parameter limit: (query) Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  (optional, default to 0)
		  // - parameter page: (query) A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. (optional, default to Sample)
		  //
		  // Invokes UsageApiCallbackHandler.UsageImagesCallback(UsageResponse) on completion. 
		  //
		  // - GET /organization/usage/images
		  // - defaultResponse: Nil
		  //
		  // - Bearer Token:
		  //   - type: http
		  //   - name: ApiKeyAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  localVarQueryParams = localVarQueryParams + EncodeURLComponent("start_time") + "=" + EncodeURLComponent(startTime.ToString)
		  
		  If endTime <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("end_time") + "=" + EncodeURLComponent(endTime.ToString)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("bucket_width") + "=" + EncodeURLComponent(Bucket_widthEnum_UsageImagesToString(bucketWidth))
		  
		  
		  Dim localVarQueryStringssources() As String
		  For Each localVarItemsources As SourcesEnum_UsageImages in sources
		    Dim encodedParameter As String = EncodeURLComponent(SourcesEnum_UsageImagesToString(localVarItemsources))
		    Select Case "form"
		      Case "form"
		        localVarQueryStringssources.Append("sources=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringssources.Append("sources=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringssources.Append("sources=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringsources As String
		  localVarQueryStringsources = Join(localVarQueryStringssources, "&")
		  
		  Dim localVarQueryStringssizes() As String
		  For Each localVarItemsizes As SizesEnum_UsageImages in sizes
		    Dim encodedParameter As String = EncodeURLComponent(SizesEnum_UsageImagesToString(localVarItemsizes))
		    Select Case "form"
		      Case "form"
		        localVarQueryStringssizes.Append("sizes=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringssizes.Append("sizes=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringssizes.Append("sizes=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringsizes As String
		  localVarQueryStringsizes = Join(localVarQueryStringssizes, "&")
		  
		  Dim localVarQueryStringsprojectIds() As String
		  For Each localVarItemprojectIds As String in projectIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemprojectIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsprojectIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsprojectIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsprojectIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringprojectIds As String
		  localVarQueryStringprojectIds = Join(localVarQueryStringsprojectIds, "&")
		  
		  Dim localVarQueryStringsuserIds() As String
		  For Each localVarItemuserIds As String in userIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemuserIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsuserIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsuserIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsuserIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringuserIds As String
		  localVarQueryStringuserIds = Join(localVarQueryStringsuserIds, "&")
		  
		  Dim localVarQueryStringsapiKeyIds() As String
		  For Each localVarItemapiKeyIds As String in apiKeyIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemapiKeyIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsapiKeyIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsapiKeyIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsapiKeyIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringapiKeyIds As String
		  localVarQueryStringapiKeyIds = Join(localVarQueryStringsapiKeyIds, "&")
		  
		  Dim localVarQueryStringsEscapedmodels() As String
		  For Each localVarItemEscapedmodels As String in Escapedmodels
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemEscapedmodels)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsEscapedmodels.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsEscapedmodels.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsEscapedmodels.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringEscapedmodels As String
		  localVarQueryStringEscapedmodels = Join(localVarQueryStringsEscapedmodels, "&")
		  
		  Dim localVarQueryStringsgroupBy() As String
		  For Each localVarItemgroupBy As Group_byEnum_UsageImages in groupBy
		    Dim encodedParameter As String = EncodeURLComponent(Group_byEnum_UsageImagesToString(localVarItemgroupBy))
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsgroupBy.Append("group_by=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsgroupBy.Append("group_by=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsgroupBy.Append("group_by=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringgroupBy As String
		  localVarQueryStringgroupBy = Join(localVarQueryStringsgroupBy, "&")
		  If limit <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("limit") + "=" + EncodeURLComponent(limit.ToString)
		  
		  If page <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("page") + "=" + EncodeURLComponent(page)
		  

		  
		  


		  Dim localVarPath As String = "/organization/usage/images"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.UsageImages_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.UsageImages_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function UsageImagesPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.UsageResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.UsageResponse
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
		Private Sub UsageImages_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.UsageResponse
		  CallbackHandler.UsageImagesCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub UsageImages_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.UsageResponse
		  Call UsageImagesPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.UsageImagesCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function Bucket_widthEnum_UsageImagesToString(value As Bucket_widthEnum_UsageImages) As String
		  Select Case value
		    
		    Case Bucket_widthEnum_UsageImages.Escaped1m
		      Return "1m"
		    Case Bucket_widthEnum_UsageImages.Escaped1h
		      Return "1h"
		    Case Bucket_widthEnum_UsageImages.Escaped1d
		      Return "1d"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function SourcesEnum_UsageImagesToString(value As SourcesEnum_UsageImages) As String
		  Select Case value
		    
		    Case SourcesEnum_UsageImages.ImagePeriodGeneration
		      Return "image.generation"
		    Case SourcesEnum_UsageImages.ImagePeriodEdit
		      Return "image.edit"
		    Case SourcesEnum_UsageImages.ImagePeriodVariation
		      Return "image.variation"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function SizesEnum_UsageImagesToString(value As SizesEnum_UsageImages) As String
		  Select Case value
		    
		    Case SizesEnum_UsageImages.Escaped256x256
		      Return "256x256"
		    Case SizesEnum_UsageImages.Escaped512x512
		      Return "512x512"
		    Case SizesEnum_UsageImages.Escaped1024x1024
		      Return "1024x1024"
		    Case SizesEnum_UsageImages.Escaped1792x1792
		      Return "1792x1792"
		    Case SizesEnum_UsageImages.Escaped1024x1792
		      Return "1024x1792"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Group_byEnum_UsageImagesToString(value As Group_byEnum_UsageImages) As String
		  Select Case value
		    
		    Case Group_byEnum_UsageImages.ProjectId
		      Return "project_id"
		    Case Group_byEnum_UsageImages.UserId
		      Return "user_id"
		    Case Group_byEnum_UsageImages.ApiKeyId
		      Return "api_key_id"
		    Case Group_byEnum_UsageImages.Model
		      Return "model"
		    Case Group_byEnum_UsageImages.Size
		      Return "size"
		    Case Group_byEnum_UsageImages.Source
		      Return "source"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UsageModerations(, startTime As Integer, Optional endTime As Xoson.O.OptionalInteger, bucketWidth As Bucket_widthEnum_UsageModerations, projectIds() As String, userIds() As String, apiKeyIds() As String, Escapedmodels() As String, groupBy() As Group_byEnum_UsageModerations, Optional limit As Xoson.O.OptionalInteger, Optional page As Xoson.O.OptionalString)
		  // Operation usage-moderations
		  // Get moderations usage details for the organization.
		  // - 
		  // - parameter startTime: (query) Start time (Unix seconds) of the query time range, inclusive. 
		  // - parameter endTime: (query) End time (Unix seconds) of the query time range, exclusive. (optional, default to 0)
		  // - parameter bucketWidth: (query) Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. (optional, default to 1d)
		  // - parameter projectIds: (query) Return only usage for these projects. (optional, default to Nil)
		  // - parameter userIds: (query) Return only usage for these users. (optional, default to Nil)
		  // - parameter apiKeyIds: (query) Return only usage for these API keys. (optional, default to Nil)
		  // - parameter Escapedmodels: (query) Return only usage for these models. (optional, default to Nil)
		  // - parameter groupBy: (query) Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. (optional, default to Nil)
		  // - parameter limit: (query) Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  (optional, default to 0)
		  // - parameter page: (query) A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. (optional, default to Sample)
		  //
		  // Invokes UsageApiCallbackHandler.UsageModerationsCallback(UsageResponse) on completion. 
		  //
		  // - GET /organization/usage/moderations
		  // - defaultResponse: Nil
		  //
		  // - Bearer Token:
		  //   - type: http
		  //   - name: ApiKeyAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  localVarQueryParams = localVarQueryParams + EncodeURLComponent("start_time") + "=" + EncodeURLComponent(startTime.ToString)
		  
		  If endTime <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("end_time") + "=" + EncodeURLComponent(endTime.ToString)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("bucket_width") + "=" + EncodeURLComponent(Bucket_widthEnum_UsageModerationsToString(bucketWidth))
		  
		  
		  Dim localVarQueryStringsprojectIds() As String
		  For Each localVarItemprojectIds As String in projectIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemprojectIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsprojectIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsprojectIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsprojectIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringprojectIds As String
		  localVarQueryStringprojectIds = Join(localVarQueryStringsprojectIds, "&")
		  
		  Dim localVarQueryStringsuserIds() As String
		  For Each localVarItemuserIds As String in userIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemuserIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsuserIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsuserIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsuserIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringuserIds As String
		  localVarQueryStringuserIds = Join(localVarQueryStringsuserIds, "&")
		  
		  Dim localVarQueryStringsapiKeyIds() As String
		  For Each localVarItemapiKeyIds As String in apiKeyIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemapiKeyIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsapiKeyIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsapiKeyIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsapiKeyIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringapiKeyIds As String
		  localVarQueryStringapiKeyIds = Join(localVarQueryStringsapiKeyIds, "&")
		  
		  Dim localVarQueryStringsEscapedmodels() As String
		  For Each localVarItemEscapedmodels As String in Escapedmodels
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemEscapedmodels)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsEscapedmodels.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsEscapedmodels.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsEscapedmodels.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringEscapedmodels As String
		  localVarQueryStringEscapedmodels = Join(localVarQueryStringsEscapedmodels, "&")
		  
		  Dim localVarQueryStringsgroupBy() As String
		  For Each localVarItemgroupBy As Group_byEnum_UsageModerations in groupBy
		    Dim encodedParameter As String = EncodeURLComponent(Group_byEnum_UsageModerationsToString(localVarItemgroupBy))
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsgroupBy.Append("group_by=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsgroupBy.Append("group_by=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsgroupBy.Append("group_by=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringgroupBy As String
		  localVarQueryStringgroupBy = Join(localVarQueryStringsgroupBy, "&")
		  If limit <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("limit") + "=" + EncodeURLComponent(limit.ToString)
		  
		  If page <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("page") + "=" + EncodeURLComponent(page)
		  

		  
		  


		  Dim localVarPath As String = "/organization/usage/moderations"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.UsageModerations_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.UsageModerations_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function UsageModerationsPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.UsageResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.UsageResponse
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
		Private Sub UsageModerations_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.UsageResponse
		  CallbackHandler.UsageModerationsCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub UsageModerations_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.UsageResponse
		  Call UsageModerationsPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.UsageModerationsCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function Bucket_widthEnum_UsageModerationsToString(value As Bucket_widthEnum_UsageModerations) As String
		  Select Case value
		    
		    Case Bucket_widthEnum_UsageModerations.Escaped1m
		      Return "1m"
		    Case Bucket_widthEnum_UsageModerations.Escaped1h
		      Return "1h"
		    Case Bucket_widthEnum_UsageModerations.Escaped1d
		      Return "1d"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Group_byEnum_UsageModerationsToString(value As Group_byEnum_UsageModerations) As String
		  Select Case value
		    
		    Case Group_byEnum_UsageModerations.ProjectId
		      Return "project_id"
		    Case Group_byEnum_UsageModerations.UserId
		      Return "user_id"
		    Case Group_byEnum_UsageModerations.ApiKeyId
		      Return "api_key_id"
		    Case Group_byEnum_UsageModerations.Model
		      Return "model"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UsageVectorStores(, startTime As Integer, Optional endTime As Xoson.O.OptionalInteger, bucketWidth As Bucket_widthEnum_UsageVectorStores, projectIds() As String, groupBy() As Group_byEnum_UsageVectorStores, Optional limit As Xoson.O.OptionalInteger, Optional page As Xoson.O.OptionalString)
		  // Operation usage-vector-stores
		  // Get vector stores usage details for the organization.
		  // - 
		  // - parameter startTime: (query) Start time (Unix seconds) of the query time range, inclusive. 
		  // - parameter endTime: (query) End time (Unix seconds) of the query time range, exclusive. (optional, default to 0)
		  // - parameter bucketWidth: (query) Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. (optional, default to 1d)
		  // - parameter projectIds: (query) Return only usage for these projects. (optional, default to Nil)
		  // - parameter groupBy: (query) Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. (optional, default to Nil)
		  // - parameter limit: (query) Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  (optional, default to 0)
		  // - parameter page: (query) A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. (optional, default to Sample)
		  //
		  // Invokes UsageApiCallbackHandler.UsageVectorStoresCallback(UsageResponse) on completion. 
		  //
		  // - GET /organization/usage/vector_stores
		  // - defaultResponse: Nil
		  //
		  // - Bearer Token:
		  //   - type: http
		  //   - name: ApiKeyAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  localVarQueryParams = localVarQueryParams + EncodeURLComponent("start_time") + "=" + EncodeURLComponent(startTime.ToString)
		  
		  If endTime <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("end_time") + "=" + EncodeURLComponent(endTime.ToString)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("bucket_width") + "=" + EncodeURLComponent(Bucket_widthEnum_UsageVectorStoresToString(bucketWidth))
		  
		  
		  Dim localVarQueryStringsprojectIds() As String
		  For Each localVarItemprojectIds As String in projectIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemprojectIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsprojectIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsprojectIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsprojectIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringprojectIds As String
		  localVarQueryStringprojectIds = Join(localVarQueryStringsprojectIds, "&")
		  
		  Dim localVarQueryStringsgroupBy() As String
		  For Each localVarItemgroupBy As Group_byEnum_UsageVectorStores in groupBy
		    Dim encodedParameter As String = EncodeURLComponent(Group_byEnum_UsageVectorStoresToString(localVarItemgroupBy))
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsgroupBy.Append("group_by=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsgroupBy.Append("group_by=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsgroupBy.Append("group_by=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringgroupBy As String
		  localVarQueryStringgroupBy = Join(localVarQueryStringsgroupBy, "&")
		  If limit <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("limit") + "=" + EncodeURLComponent(limit.ToString)
		  
		  If page <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("page") + "=" + EncodeURLComponent(page)
		  

		  
		  


		  Dim localVarPath As String = "/organization/usage/vector_stores"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.UsageVectorStores_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.UsageVectorStores_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function UsageVectorStoresPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.UsageResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.UsageResponse
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
		Private Sub UsageVectorStores_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.UsageResponse
		  CallbackHandler.UsageVectorStoresCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub UsageVectorStores_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.UsageResponse
		  Call UsageVectorStoresPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.UsageVectorStoresCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function Bucket_widthEnum_UsageVectorStoresToString(value As Bucket_widthEnum_UsageVectorStores) As String
		  Select Case value
		    
		    Case Bucket_widthEnum_UsageVectorStores.Escaped1m
		      Return "1m"
		    Case Bucket_widthEnum_UsageVectorStores.Escaped1h
		      Return "1h"
		    Case Bucket_widthEnum_UsageVectorStores.Escaped1d
		      Return "1d"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Group_byEnum_UsageVectorStoresToString(value As Group_byEnum_UsageVectorStores) As String
		  Select Case value
		    
		    Case Group_byEnum_UsageVectorStores.ProjectId
		      Return "project_id"
		    
		  End Select
		  Return ""
		End Function
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
		CallbackHandler As OpenAPIClient.APIs.UsageApiCallbackHandler
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

	#tag Enum, Name = Bucket_widthEnum_UsageAudioSpeeches, Type = Integer, Flags = &h0
		
        Escaped1m
        Escaped1h
        Escaped1d
		
	#tag EndEnum

	#tag Enum, Name = Group_byEnum_UsageAudioSpeeches, Type = Integer, Flags = &h0
		
        ProjectId
        UserId
        ApiKeyId
        Model
		
	#tag EndEnum

	#tag Enum, Name = Bucket_widthEnum_UsageAudioTranscriptions, Type = Integer, Flags = &h0
		
        Escaped1m
        Escaped1h
        Escaped1d
		
	#tag EndEnum

	#tag Enum, Name = Group_byEnum_UsageAudioTranscriptions, Type = Integer, Flags = &h0
		
        ProjectId
        UserId
        ApiKeyId
        Model
		
	#tag EndEnum

	#tag Enum, Name = Bucket_widthEnum_UsageCodeInterpreterSessions, Type = Integer, Flags = &h0
		
        Escaped1m
        Escaped1h
        Escaped1d
		
	#tag EndEnum

	#tag Enum, Name = Group_byEnum_UsageCodeInterpreterSessions, Type = Integer, Flags = &h0
		
        ProjectId
		
	#tag EndEnum

	#tag Enum, Name = Bucket_widthEnum_UsageCompletions, Type = Integer, Flags = &h0
		
        Escaped1m
        Escaped1h
        Escaped1d
		
	#tag EndEnum

	#tag Enum, Name = Group_byEnum_UsageCompletions, Type = Integer, Flags = &h0
		
        ProjectId
        UserId
        ApiKeyId
        Model
        Batch
		
	#tag EndEnum

	#tag Enum, Name = Bucket_widthEnum_UsageCosts, Type = Integer, Flags = &h0
		
        Escaped1d
		
	#tag EndEnum

	#tag Enum, Name = Group_byEnum_UsageCosts, Type = Integer, Flags = &h0
		
        ProjectId
        LineItem
		
	#tag EndEnum

	#tag Enum, Name = Bucket_widthEnum_UsageEmbeddings, Type = Integer, Flags = &h0
		
        Escaped1m
        Escaped1h
        Escaped1d
		
	#tag EndEnum

	#tag Enum, Name = Group_byEnum_UsageEmbeddings, Type = Integer, Flags = &h0
		
        ProjectId
        UserId
        ApiKeyId
        Model
		
	#tag EndEnum

	#tag Enum, Name = Bucket_widthEnum_UsageImages, Type = Integer, Flags = &h0
		
        Escaped1m
        Escaped1h
        Escaped1d
		
	#tag EndEnum

	#tag Enum, Name = SourcesEnum_UsageImages, Type = Integer, Flags = &h0
		
        ImagePeriodGeneration
        ImagePeriodEdit
        ImagePeriodVariation
		
	#tag EndEnum

	#tag Enum, Name = SizesEnum_UsageImages, Type = Integer, Flags = &h0
		
        Escaped256x256
        Escaped512x512
        Escaped1024x1024
        Escaped1792x1792
        Escaped1024x1792
		
	#tag EndEnum

	#tag Enum, Name = Group_byEnum_UsageImages, Type = Integer, Flags = &h0
		
        ProjectId
        UserId
        ApiKeyId
        Model
        Size
        Source
		
	#tag EndEnum

	#tag Enum, Name = Bucket_widthEnum_UsageModerations, Type = Integer, Flags = &h0
		
        Escaped1m
        Escaped1h
        Escaped1d
		
	#tag EndEnum

	#tag Enum, Name = Group_byEnum_UsageModerations, Type = Integer, Flags = &h0
		
        ProjectId
        UserId
        ApiKeyId
        Model
		
	#tag EndEnum

	#tag Enum, Name = Bucket_widthEnum_UsageVectorStores, Type = Integer, Flags = &h0
		
        Escaped1m
        Escaped1h
        Escaped1d
		
	#tag EndEnum

	#tag Enum, Name = Group_byEnum_UsageVectorStores, Type = Integer, Flags = &h0
		
        ProjectId
		
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
