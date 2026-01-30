#tag Class
Protected Class FineTuningJobEvent

	#tag Property, Flags = &h0
		#tag Note
			The object type, which is always "fine_tuning.job.event".
		#tag EndNote
		object As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The object identifier.
		#tag EndNote
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the fine-tuning job was created.
		#tag EndNote
		created_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The log level of the event.
		#tag EndNote
		level As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The message of the event.
		#tag EndNote
		message As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The type of event.
		#tag EndNote
		type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The data associated with the event.
		#tag EndNote
		data As Object
	#tag EndProperty


    #tag Enum, Name = ObjectEnum, Type = Integer, Flags = &h0
        
        FineTuningPeriodJobPeriodEvent
        
    #tag EndEnum

    #tag Enum, Name = LevelEnum, Type = Integer, Flags = &h0
        
        Info
        Warn
        Error
        
    #tag EndEnum

    #tag Enum, Name = TypeEnum, Type = Integer, Flags = &h0
        
        Message
        Metrics
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function ObjectEnumToString(value As ObjectEnum) As String
		  Select Case value
		    
		    Case ObjectEnum.FineTuningPeriodJobPeriodEvent
		      Return "fine_tuning.job.event"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function LevelEnumToString(value As LevelEnum) As String
		  Select Case value
		    
		    Case LevelEnum.Info
		      Return "info"
		    Case LevelEnum.Warn
		      Return "warn"
		    Case LevelEnum.Error
		      Return "error"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function TypeEnumToString(value As TypeEnum) As String
		  Select Case value
		    
		    Case TypeEnum.Message
		      Return "message"
		    Case TypeEnum.Metrics
		      Return "metrics"
		    
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
			Name="created_at"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="message"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="data"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Object"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


