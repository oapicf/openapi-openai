/*
 * FineTuneDPOMethod_hyperparameters.h
 *
 * The hyperparameters used for the fine-tuning job.
 */

#ifndef _FineTuneDPOMethod_hyperparameters_H_
#define _FineTuneDPOMethod_hyperparameters_H_


#include <string>
#include "FineTuneDPOMethod_hyperparameters_batch_size.h"
#include "FineTuneDPOMethod_hyperparameters_beta.h"
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

class FineTuneDPOMethod_hyperparameters : public Object {
public:
	/*! \brief Constructor.
	 */
	FineTuneDPOMethod_hyperparameters();
	FineTuneDPOMethod_hyperparameters(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FineTuneDPOMethod_hyperparameters();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	FineTuneDPOMethod_hyperparameters_beta getBeta();

	/*! \brief Set 
	 */
	void setBeta(FineTuneDPOMethod_hyperparameters_beta  beta);
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
	FineTuneDPOMethod_hyperparameters_beta beta;
	FineTuneDPOMethod_hyperparameters_batch_size batch_size;
	FineTuneDPOMethod_hyperparameters_learning_rate_multiplier learning_rate_multiplier;
	FineTuneDPOMethod_hyperparameters_n_epochs n_epochs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FineTuneDPOMethod_hyperparameters_H_ */
