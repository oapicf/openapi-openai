
/*
 * FineTuneDPOMethod_hyperparameters.h
 *
 * The hyperparameters used for the fine-tuning job.
 */

#ifndef TINY_CPP_CLIENT_FineTuneDPOMethod_hyperparameters_H_
#define TINY_CPP_CLIENT_FineTuneDPOMethod_hyperparameters_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FineTuneDPOMethod_hyperparameters_batch_size.h"
#include "FineTuneDPOMethod_hyperparameters_beta.h"
#include "FineTuneDPOMethod_hyperparameters_learning_rate_multiplier.h"
#include "FineTuneDPOMethod_hyperparameters_n_epochs.h"

namespace Tiny {


/*! \brief The hyperparameters used for the fine-tuning job.
 *
 *  \ingroup Models
 *
 */

class FineTuneDPOMethod_hyperparameters{
public:

    /*! \brief Constructor.
	 */
    FineTuneDPOMethod_hyperparameters();
    FineTuneDPOMethod_hyperparameters(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FineTuneDPOMethod_hyperparameters();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
};
}

#endif /* TINY_CPP_CLIENT_FineTuneDPOMethod_hyperparameters_H_ */
