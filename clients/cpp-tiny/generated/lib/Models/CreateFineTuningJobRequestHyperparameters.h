
/*
 * CreateFineTuningJobRequest_hyperparameters.h
 *
 * The hyperparameters used for the fine-tuning job. This value is now deprecated in favor of &#x60;method&#x60;, and should be passed in under the &#x60;method&#x60; parameter. 
 */

#ifndef TINY_CPP_CLIENT_CreateFineTuningJobRequest_hyperparameters_H_
#define TINY_CPP_CLIENT_CreateFineTuningJobRequest_hyperparameters_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CreateFineTuningJobRequest_hyperparameters_batch_size.h"
#include "CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier.h"
#include "CreateFineTuningJobRequest_hyperparameters_n_epochs.h"

namespace Tiny {


/*! \brief The hyperparameters used for the fine-tuning job. This value is now deprecated in favor of `method`, and should be passed in under the `method` parameter. 
 *
 *  \ingroup Models
 *
 */

class CreateFineTuningJobRequest_hyperparameters{
public:

    /*! \brief Constructor.
	 */
    CreateFineTuningJobRequest_hyperparameters();
    CreateFineTuningJobRequest_hyperparameters(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateFineTuningJobRequest_hyperparameters();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CreateFineTuningJobRequest_hyperparameters_batch_size getBatchSize();

	/*! \brief Set 
	 */
	void setBatchSize(CreateFineTuningJobRequest_hyperparameters_batch_size  batch_size);
	/*! \brief Get 
	 */
	CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier getLearningRateMultiplier();

	/*! \brief Set 
	 */
	void setLearningRateMultiplier(CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier  learning_rate_multiplier);
	/*! \brief Get 
	 */
	CreateFineTuningJobRequest_hyperparameters_n_epochs getNEpochs();

	/*! \brief Set 
	 */
	void setNEpochs(CreateFineTuningJobRequest_hyperparameters_n_epochs  n_epochs);


    private:
    CreateFineTuningJobRequest_hyperparameters_batch_size batch_size;
    CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier learning_rate_multiplier;
    CreateFineTuningJobRequest_hyperparameters_n_epochs n_epochs;
};
}

#endif /* TINY_CPP_CLIENT_CreateFineTuningJobRequest_hyperparameters_H_ */
