#tag Class
Protected Class UsageTimeBucketResultInner

	#tag Property, Flags = &h0
		object As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The aggregated number of input tokens used.
		#tag EndNote
		input_tokens As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
		#tag EndNote
		input_cached_tokens As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
		#tag EndNote
		output_tokens As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The aggregated number of audio input tokens used, including cached tokens.
		#tag EndNote
		input_audio_tokens As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The aggregated number of audio output tokens used.
		#tag EndNote
		output_audio_tokens As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The count of requests made to the model.
		#tag EndNote
		num_model_requests As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			When `group_by=project_id`, this field provides the project ID of the grouped costs result.
		#tag EndNote
		project_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			When `group_by=user_id`, this field provides the user ID of the grouped usage result.
		#tag EndNote
		user_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
		#tag EndNote
		api_key_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			When `group_by=model`, this field provides the model name of the grouped usage result.
		#tag EndNote
		model As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
		#tag EndNote
		batch As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The number of images processed.
		#tag EndNote
		images As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
		#tag EndNote
		source As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			When `group_by=size`, this field provides the image size of the grouped usage result.
		#tag EndNote
		size As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The number of characters processed.
		#tag EndNote
		characters As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The number of seconds processed.
		#tag EndNote
		seconds As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The vector stores usage in bytes.
		#tag EndNote
		usage_bytes As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The number of code interpreter sessions.
		#tag EndNote
		sessions As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		amount As OpenAPIClient.Models.CostsResultAmount
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			When `group_by=line_item`, this field provides the line item of the grouped costs result.
		#tag EndNote
		line_item As Xoson.O.OptionalString
	#tag EndProperty


    #tag Enum, Name = ObjectEnum, Type = Integer, Flags = &h0
        
        OrganizationPeriodCostsPeriodResult
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function ObjectEnumToString(value As ObjectEnum) As String
		  Select Case value
		    
		    Case ObjectEnum.OrganizationPeriodCostsPeriodResult
		      Return "organization.costs.result"
		    
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
			Name="input_tokens"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="input_cached_tokens"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="output_tokens"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="input_audio_tokens"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="output_audio_tokens"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="num_model_requests"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="project_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="user_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="api_key_id"
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
			Name="batch"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="images"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="source"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="size"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="characters"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="seconds"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="usage_bytes"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="sessions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="amount"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CostsResultAmount"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="line_item"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


