
/*
 * FineTuningJobCheckpoint_metrics.h
 *
 * Metrics at the step number during the fine-tuning job.
 */

#ifndef TINY_CPP_CLIENT_FineTuningJobCheckpoint_metrics_H_
#define TINY_CPP_CLIENT_FineTuningJobCheckpoint_metrics_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Metrics at the step number during the fine-tuning job.
 *
 *  \ingroup Models
 *
 */

class FineTuningJobCheckpoint_metrics{
public:

    /*! \brief Constructor.
	 */
    FineTuningJobCheckpoint_metrics();
    FineTuningJobCheckpoint_metrics(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FineTuningJobCheckpoint_metrics();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	long getStep();

	/*! \brief Set 
	 */
	void setStep(long  step);
	/*! \brief Get 
	 */
	long getTrainLoss();

	/*! \brief Set 
	 */
	void setTrainLoss(long  train_loss);
	/*! \brief Get 
	 */
	long getTrainMeanTokenAccuracy();

	/*! \brief Set 
	 */
	void setTrainMeanTokenAccuracy(long  train_mean_token_accuracy);
	/*! \brief Get 
	 */
	long getValidLoss();

	/*! \brief Set 
	 */
	void setValidLoss(long  valid_loss);
	/*! \brief Get 
	 */
	long getValidMeanTokenAccuracy();

	/*! \brief Set 
	 */
	void setValidMeanTokenAccuracy(long  valid_mean_token_accuracy);
	/*! \brief Get 
	 */
	long getFullValidLoss();

	/*! \brief Set 
	 */
	void setFullValidLoss(long  full_valid_loss);
	/*! \brief Get 
	 */
	long getFullValidMeanTokenAccuracy();

	/*! \brief Set 
	 */
	void setFullValidMeanTokenAccuracy(long  full_valid_mean_token_accuracy);


    private:
    long step{};
    long train_loss{};
    long train_mean_token_accuracy{};
    long valid_loss{};
    long valid_mean_token_accuracy{};
    long full_valid_loss{};
    long full_valid_mean_token_accuracy{};
};
}

#endif /* TINY_CPP_CLIENT_FineTuningJobCheckpoint_metrics_H_ */
