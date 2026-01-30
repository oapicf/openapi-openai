#tag Class
Protected Class AuditLogsApi
	#tag Method, Flags = &h0
		Sub ListAuditLogs(, Optional effectiveAt As OpenAPIClient.Models.ListAuditLogsEffectiveAtParameter, projectIds() As String, eventTypes() As AuditLogEventType, actorIds() As String, actorEmails() As String, resourceIds() As String, Optional limit As Xoson.O.OptionalInteger, Optional after As Xoson.O.OptionalString, Optional before As Xoson.O.OptionalString)
		  // Operation list-audit-logs
		  // List user actions and configuration changes within this organization.
		  // - 
		  // - parameter effectiveAt: (query) Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range. (optional, default to Nil)
		  // - parameter projectIds: (query) Return only events for these projects. (optional, default to Nil)
		  // - parameter eventTypes: (query) Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). (optional, default to Nil)
		  // - parameter actorIds: (query) Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. (optional, default to Nil)
		  // - parameter actorEmails: (query) Return only events performed by users with these emails. (optional, default to Nil)
		  // - parameter resourceIds: (query) Return only events performed on these targets. For example, a project ID updated. (optional, default to Nil)
		  // - parameter limit: (query) A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
		  // - parameter after: (query) A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional, default to Sample)
		  // - parameter before: (query) A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional, default to Sample)
		  //
		  // Invokes AuditLogsApiCallbackHandler.ListAuditLogsCallback(ListAuditLogsResponse) on completion. 
		  //
		  // - GET /organization/audit_logs
		  // - defaultResponse: Nil
		  //
		  // - Bearer Token:
		  //   - type: http
		  //   - name: ApiKeyAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If effectiveAt <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("effective_at") + "=" + EncodeURLComponent(Xoson.toJSON(effectiveAt))
		  
		  
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
		  
		  Dim localVarQueryStringseventTypes() As String
		  For Each localVarItemeventTypes As AuditLogEventType in eventTypes
		    Dim encodedParameter As String = EncodeURLComponent(Xoson.toJSON(localVarItemeventTypes))
		    Select Case "form"
		      Case "form"
		        localVarQueryStringseventTypes.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringseventTypes.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringseventTypes.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringeventTypes As String
		  localVarQueryStringeventTypes = Join(localVarQueryStringseventTypes, "&")
		  
		  Dim localVarQueryStringsactorIds() As String
		  For Each localVarItemactorIds As String in actorIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemactorIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsactorIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsactorIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsactorIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringactorIds As String
		  localVarQueryStringactorIds = Join(localVarQueryStringsactorIds, "&")
		  
		  Dim localVarQueryStringsactorEmails() As String
		  For Each localVarItemactorEmails As String in actorEmails
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemactorEmails)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsactorEmails.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsactorEmails.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsactorEmails.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringactorEmails As String
		  localVarQueryStringactorEmails = Join(localVarQueryStringsactorEmails, "&")
		  
		  Dim localVarQueryStringsresourceIds() As String
		  For Each localVarItemresourceIds As String in resourceIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemresourceIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsresourceIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsresourceIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsresourceIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringresourceIds As String
		  localVarQueryStringresourceIds = Join(localVarQueryStringsresourceIds, "&")
		  If limit <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("limit") + "=" + EncodeURLComponent(limit.ToString)
		  
		  If after <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("after") + "=" + EncodeURLComponent(after)
		  
		  If before <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("before") + "=" + EncodeURLComponent(before)
		  

		  
		  


		  Dim localVarPath As String = "/organization/audit_logs"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.ListAuditLogs_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.ListAuditLogs_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function ListAuditLogsPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.ListAuditLogsResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.ListAuditLogsResponse
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
		Private Sub ListAuditLogs_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.ListAuditLogsResponse
		  CallbackHandler.ListAuditLogsCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub ListAuditLogs_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.ListAuditLogsResponse
		  Call ListAuditLogsPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.ListAuditLogsCallback(error, data)
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
		CallbackHandler As OpenAPIClient.APIs.AuditLogsApiCallbackHandler
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
