#tag Class
Protected Class CreateBatchRequest

	#tag Property, Flags = &h0
		#tag Note
			The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose `batch`. The file can contain up to 50,000 requests, and can be up to 200 MB in size. 
		#tag EndNote
		input_file_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
		#tag EndNote
		endpoint As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The time frame within which the batch should be processed. Currently only `24h` is supported.
		#tag EndNote
		completion_window As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Optional custom metadata for the batch.
		#tag EndNote
		metadata As Dictionary
	#tag EndProperty


    #tag Enum, Name = EndpointEnum, Type = Integer, Flags = &h0
        
        SlashV1SlashChatSlashCompletions
        SlashV1SlashEmbeddings
        SlashV1SlashCompletions
        
    #tag EndEnum

    #tag Enum, Name = Completion_windowEnum, Type = Integer, Flags = &h0
        
        Escaped24h
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function EndpointEnumToString(value As EndpointEnum) As String
		  Select Case value
		    
		    Case EndpointEnum.SlashV1SlashChatSlashCompletions
		      Return "/v1/chat/completions"
		    Case EndpointEnum.SlashV1SlashEmbeddings
		      Return "/v1/embeddings"
		    Case EndpointEnum.SlashV1SlashCompletions
		      Return "/v1/completions"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function Completion_windowEnumToString(value As Completion_windowEnum) As String
		  Select Case value
		    
		    Case Completion_windowEnum.Escaped24h
		      Return "24h"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod


	#tag ViewBehavior
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
			Name="input_file_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="metadata"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Dictionary"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


