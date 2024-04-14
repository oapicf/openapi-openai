#tag Class
Protected Class CreateChatCompletionStreamResponseChoicesInner

	#tag Property, Flags = &h0
		index As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		delta As OpenAPIClient.Models.ChatCompletionStreamResponseDelta
	#tag EndProperty


	#tag Property, Flags = &h0
		finish_reason As Xoson.O.OptionalString
	#tag EndProperty


    #tag Enum, Name = Finish_reasonEnum, Type = Integer, Flags = &h0
        
        Stop
        Length
        FunctionCall
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Finish_reasonEnumToString(value As Finish_reasonEnum) As String
		  Select Case value
		    
		    Case Finish_reasonEnum.Stop
		      Return "stop"
		    Case Finish_reasonEnum.Length
		      Return "length"
		    Case Finish_reasonEnum.FunctionCall
		      Return "function_call"
		    
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
			Name="index"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="delta"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ChatCompletionStreamResponseDelta"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass

