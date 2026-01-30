/*
 * CreateFineTuningJobRequest_hyperparameters.h
 *
 * The hyperparameters used for the fine-tuning job. This value is now deprecated in favor of &#x60;method&#x60;, and should be passed in under the &#x60;method&#x60; parameter. 
 */

#ifndef _CreateFineTuningJobRequest_hyperparameters_H_
#define _CreateFineTuningJobRequest_hyperparameters_H_


#include <string>
#include "CreateFineTuningJobRequest_hyperparameters_batch_size.h"
#include "CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier.h"
#include "CreateFineTuningJobRequest_hyperparameters_n_epochs.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The hyperparameters used for the fine-tuning job. This value is now deprecated in favor of `method`, and should be passed in under the `method` parameter. 
 *
 *  \ingroup Models
 *
 */

class CreateFineTuningJobRequest_hyperparameters : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateFineTuningJobRequest_hyperparameters();
	CreateFineTuningJobRequest_hyperparameters(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateFineTuningJobRequest_hyperparameters();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateFineTuningJobRequest_hyperparameters_H_ */
