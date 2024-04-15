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
class FINE_TUNING_JOB_CHECKPOINT_METRICS




feature --Access

    step: REAL_32
      
    train_loss: REAL_32
      
    train_mean_token_accuracy: REAL_32
      
    valid_loss: REAL_32
      
    valid_mean_token_accuracy: REAL_32
      
    full_valid_loss: REAL_32
      
    full_valid_mean_token_accuracy: REAL_32
      

feature -- Change Element

    set_step (a_name: like step)
        -- Set 'step' with 'a_name'.
      do
        step := a_name
      ensure
        step_set: step = a_name
      end

    set_train_loss (a_name: like train_loss)
        -- Set 'train_loss' with 'a_name'.
      do
        train_loss := a_name
      ensure
        train_loss_set: train_loss = a_name
      end

    set_train_mean_token_accuracy (a_name: like train_mean_token_accuracy)
        -- Set 'train_mean_token_accuracy' with 'a_name'.
      do
        train_mean_token_accuracy := a_name
      ensure
        train_mean_token_accuracy_set: train_mean_token_accuracy = a_name
      end

    set_valid_loss (a_name: like valid_loss)
        -- Set 'valid_loss' with 'a_name'.
      do
        valid_loss := a_name
      ensure
        valid_loss_set: valid_loss = a_name
      end

    set_valid_mean_token_accuracy (a_name: like valid_mean_token_accuracy)
        -- Set 'valid_mean_token_accuracy' with 'a_name'.
      do
        valid_mean_token_accuracy := a_name
      ensure
        valid_mean_token_accuracy_set: valid_mean_token_accuracy = a_name
      end

    set_full_valid_loss (a_name: like full_valid_loss)
        -- Set 'full_valid_loss' with 'a_name'.
      do
        full_valid_loss := a_name
      ensure
        full_valid_loss_set: full_valid_loss = a_name
      end

    set_full_valid_mean_token_accuracy (a_name: like full_valid_mean_token_accuracy)
        -- Set 'full_valid_mean_token_accuracy' with 'a_name'.
      do
        full_valid_mean_token_accuracy := a_name
      ensure
        full_valid_mean_token_accuracy_set: full_valid_mean_token_accuracy = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass FINE_TUNING_JOB_CHECKPOINT_METRICS%N")
        if attached step as l_step then
          Result.append ("%Nstep:")
          Result.append (l_step.out)
          Result.append ("%N")
        end
        if attached train_loss as l_train_loss then
          Result.append ("%Ntrain_loss:")
          Result.append (l_train_loss.out)
          Result.append ("%N")
        end
        if attached train_mean_token_accuracy as l_train_mean_token_accuracy then
          Result.append ("%Ntrain_mean_token_accuracy:")
          Result.append (l_train_mean_token_accuracy.out)
          Result.append ("%N")
        end
        if attached valid_loss as l_valid_loss then
          Result.append ("%Nvalid_loss:")
          Result.append (l_valid_loss.out)
          Result.append ("%N")
        end
        if attached valid_mean_token_accuracy as l_valid_mean_token_accuracy then
          Result.append ("%Nvalid_mean_token_accuracy:")
          Result.append (l_valid_mean_token_accuracy.out)
          Result.append ("%N")
        end
        if attached full_valid_loss as l_full_valid_loss then
          Result.append ("%Nfull_valid_loss:")
          Result.append (l_full_valid_loss.out)
          Result.append ("%N")
        end
        if attached full_valid_mean_token_accuracy as l_full_valid_mean_token_accuracy then
          Result.append ("%Nfull_valid_mean_token_accuracy:")
          Result.append (l_full_valid_mean_token_accuracy.out)
          Result.append ("%N")
        end
      end
end
