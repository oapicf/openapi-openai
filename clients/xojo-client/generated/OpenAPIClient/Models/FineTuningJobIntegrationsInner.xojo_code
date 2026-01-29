#tag Class
Protected Class FineTuningJobIntegrationsInner

	#tag Property, Flags = &h0
		#tag Note
			The type of the integration being enabled for the fine-tuning job
		#tag EndNote
		type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		wandb As OpenAPIClient.Models.CreateFineTuningJobRequestIntegrationsInnerWandb
	#tag EndProperty


    #tag Enum, Name = TypeEnum, Type = Integer, Flags = &h0
        
        Wandb
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function TypeEnumToString(value As TypeEnum) As String
		  Select Case value
		    
		    Case TypeEnum.Wandb
		      Return "wandb"
		    
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
			Name="wandb"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateFineTuningJobRequestIntegrationsInnerWandb"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


