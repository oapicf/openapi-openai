/*
 * FineTuneSupervisedMethod_hyperparameters.h
 *
 * The hyperparameters used for the fine-tuning job.
 */

#ifndef _FineTuneSupervisedMethod_hyperparameters_H_
#define _FineTuneSupervisedMethod_hyperparameters_H_


#include <string>
#include "FineTuneDPOMethod_hyperparameters_batch_size.h"
#include "FineTuneDPOMethod_hyperparameters_learning_rate_multiplier.h"
#include "FineTuneDPOMethod_hyperparameters_n_epochs.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The hyperparameters used for the fine-tuning job.
 *
 *  \ingroup Models
 *
 */

class FineTuneSupervisedMethod_hyperparameters : public Object {
public:
	/*! \brief Constructor.
	 */
	FineTuneSupervisedMethod_hyperparameters();
	FineTuneSupervisedMethod_hyperparameters(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FineTuneSupervisedMethod_hyperparameters();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	FineTuneDPOMethod_hyperparameters_batch_size getBatchSize();

	/*! \brief Set 
	 */
	void setBatchSize(FineTuneDPOMethod_hyperparameters_batch_size  batch_size);
	/*! \brief Get 
	 */
	FineTuneDPOMethod_hyperparameters_learning_rate_multiplier getLearningRateMultiplier();

	/*! \brief Set 
	 */
	void setLearningRateMultiplier(FineTuneDPOMethod_hyperparameters_learning_rate_multiplier  learning_rate_multiplier);
	/*! \brief Get 
	 */
	FineTuneDPOMethod_hyperparameters_n_epochs getNEpochs();

	/*! \brief Set 
	 */
	void setNEpochs(FineTuneDPOMethod_hyperparameters_n_epochs  n_epochs);

private:
	FineTuneDPOMethod_hyperparameters_batch_size batch_size;
	FineTuneDPOMethod_hyperparameters_learning_rate_multiplier learning_rate_multiplier;
	FineTuneDPOMethod_hyperparameters_n_epochs n_epochs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FineTuneSupervisedMethod_hyperparameters_H_ */
