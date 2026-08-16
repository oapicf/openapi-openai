
/*
 * FineTuningJob_hyperparameters.h
 *
 * The hyperparameters used for the fine-tuning job. This value will only be returned when running &#x60;supervised&#x60; jobs.
 */

#ifndef TINY_CPP_CLIENT_FineTuningJob_hyperparameters_H_
#define TINY_CPP_CLIENT_FineTuningJob_hyperparameters_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CreateFineTuningJobRequest_hyperparameters_batch_size.h"
#include "CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier.h"
#include "CreateFineTuningJobRequest_hyperparameters_n_epochs.h"

namespace Tiny {


/*! \brief The hyperparameters used for the fine-tuning job. This value will only be returned when running `supervised` jobs.
 *
 *  \ingroup Models
 *
 */

class FineTuningJob_hyperparameters{
public:

    /*! \brief Constructor.
	 */
    FineTuningJob_hyperparameters();
    FineTuningJob_hyperparameters(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FineTuningJob_hyperparameters();


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

#endif /* TINY_CPP_CLIENT_FineTuningJob_hyperparameters_H_ */
