#tag Class
Protected Class ProjectRateLimit

	#tag Property, Flags = &h0
		#tag Note
			The object type, which is always `project.rate_limit`
		#tag EndNote
		object As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The identifier, which can be referenced in API endpoints.
		#tag EndNote
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The model this rate limit applies to.
		#tag EndNote
		model As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The maximum requests per minute.
		#tag EndNote
		max_requests_per_1_minute As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The maximum tokens per minute.
		#tag EndNote
		max_tokens_per_1_minute As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The maximum images per minute. Only present for relevant models.
		#tag EndNote
		max_images_per_1_minute As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The maximum audio megabytes per minute. Only present for relevant models.
		#tag EndNote
		max_audio_megabytes_per_1_minute As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The maximum requests per day. Only present for relevant models.
		#tag EndNote
		max_requests_per_1_day As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The maximum batch input tokens per day. Only present for relevant models.
		#tag EndNote
		batch_1_day_max_input_tokens As Xoson.O.OptionalInteger
	#tag EndProperty


    #tag Enum, Name = ObjectEnum, Type = Integer, Flags = &h0
        
        ProjectPeriodRateLimit
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function ObjectEnumToString(value As ObjectEnum) As String
		  Select Case value
		    
		    Case ObjectEnum.ProjectPeriodRateLimit
		      Return "project.rate_limit"
		    
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
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="model"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="max_requests_per_1_minute"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="max_tokens_per_1_minute"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="max_images_per_1_minute"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="max_audio_megabytes_per_1_minute"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="max_requests_per_1_day"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="batch_1_day_max_input_tokens"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


