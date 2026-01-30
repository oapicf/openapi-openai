#tag Class
Protected Class RealtimeResponseUsage

	#tag Property, Flags = &h0
		#tag Note
			The total number of tokens in the Response including input and output  text and audio tokens. 
		#tag EndNote
		total_tokens As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The number of input tokens used in the Response, including text and  audio tokens. 
		#tag EndNote
		input_tokens As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The number of output tokens sent in the Response, including text and  audio tokens. 
		#tag EndNote
		output_tokens As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		input_token_details As OpenAPIClient.Models.RealtimeResponseUsageInputTokenDetails
	#tag EndProperty


	#tag Property, Flags = &h0
		output_token_details As OpenAPIClient.Models.RealtimeResponseUsageOutputTokenDetails
	#tag EndProperty





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
			Name="total_tokens"
			Visible=false
			Group="Behavior"
			InitialValue=""
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
			Name="output_tokens"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="input_token_details"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RealtimeResponseUsageInputTokenDetails"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="output_token_details"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RealtimeResponseUsageOutputTokenDetails"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


