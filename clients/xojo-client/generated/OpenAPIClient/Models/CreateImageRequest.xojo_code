#tag Class
Protected Class CreateImageRequest

	#tag Property, Flags = &h0
		#tag Note
			A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.
		#tag EndNote
		prompt As String
	#tag EndProperty


	#tag Property, Flags = &h0
		model As OpenAPIClient.Models.CreateImageRequestModel
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
		#tag EndNote
		n As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
		#tag EndNote
		quality As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
		#tag EndNote
		response_format As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
		#tag EndNote
		size As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
		#tag EndNote
		style As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
		#tag EndNote
		user As Xoson.O.OptionalString
	#tag EndProperty


    #tag Enum, Name = QualityEnum, Type = Integer, Flags = &h0
        
        Standard
        Hd
        
    #tag EndEnum

    #tag Enum, Name = Response_formatEnum, Type = Integer, Flags = &h0
        
        Url
        B64Json
        
    #tag EndEnum

    #tag Enum, Name = SizeEnum, Type = Integer, Flags = &h0
        
        Escaped256x256
        Escaped512x512
        Escaped1024x1024
        Escaped1792x1024
        Escaped1024x1792
        
    #tag EndEnum

    #tag Enum, Name = StyleEnum, Type = Integer, Flags = &h0
        
        Vivid
        Natural
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function QualityEnumToString(value As QualityEnum) As String
		  Select Case value
		    
		    Case QualityEnum.Standard
		      Return "standard"
		    Case QualityEnum.Hd
		      Return "hd"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function Response_formatEnumToString(value As Response_formatEnum) As String
		  Select Case value
		    
		    Case Response_formatEnum.Url
		      Return "url"
		    Case Response_formatEnum.B64Json
		      Return "b64_json"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function SizeEnumToString(value As SizeEnum) As String
		  Select Case value
		    
		    Case SizeEnum.Escaped256x256
		      Return "256x256"
		    Case SizeEnum.Escaped512x512
		      Return "512x512"
		    Case SizeEnum.Escaped1024x1024
		      Return "1024x1024"
		    Case SizeEnum.Escaped1792x1024
		      Return "1792x1024"
		    Case SizeEnum.Escaped1024x1792
		      Return "1024x1792"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function StyleEnumToString(value As StyleEnum) As String
		  Select Case value
		    
		    Case StyleEnum.Vivid
		      Return "vivid"
		    Case StyleEnum.Natural
		      Return "natural"
		    
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
			Name="prompt"
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
			Type="CreateImageRequestModel"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="n"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="user"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


