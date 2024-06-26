note
 description:"[
		OpenAI API
 		The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
  		The version of the OpenAPI document: 2.0.0
 	    Contact: blah+oapicf@cliffano.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class FINE_TUNING_JOB_HYPERPARAMETERS




feature --Access

    n_epochs: detachable FINE_TUNING_JOB_HYPERPARAMETERS_N_EPOCHS
      

feature -- Change Element

    set_n_epochs (a_name: like n_epochs)
        -- Set 'n_epochs' with 'a_name'.
      do
        n_epochs := a_name
      ensure
        n_epochs_set: n_epochs = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass FINE_TUNING_JOB_HYPERPARAMETERS%N")
        if attached n_epochs as l_n_epochs then
          Result.append ("%Nn_epochs:")
          Result.append (l_n_epochs.out)
          Result.append ("%N")
        end
      end
end

