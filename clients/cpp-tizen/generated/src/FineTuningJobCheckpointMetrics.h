/*
 * FineTuningJobCheckpoint_metrics.h
 *
 * Metrics at the step number during the fine-tuning job.
 */

#ifndef _FineTuningJobCheckpoint_metrics_H_
#define _FineTuningJobCheckpoint_metrics_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Metrics at the step number during the fine-tuning job.
 *
 *  \ingroup Models
 *
 */

class FineTuningJobCheckpoint_metrics : public Object {
public:
	/*! \brief Constructor.
	 */
	FineTuningJobCheckpoint_metrics();
	FineTuningJobCheckpoint_metrics(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FineTuningJobCheckpoint_metrics();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	long long getStep();

	/*! \brief Set 
	 */
	void setStep(long long  step);
	/*! \brief Get 
	 */
	long long getTrainLoss();

	/*! \brief Set 
	 */
	void setTrainLoss(long long  train_loss);
	/*! \brief Get 
	 */
	long long getTrainMeanTokenAccuracy();

	/*! \brief Set 
	 */
	void setTrainMeanTokenAccuracy(long long  train_mean_token_accuracy);
	/*! \brief Get 
	 */
	long long getValidLoss();

	/*! \brief Set 
	 */
	void setValidLoss(long long  valid_loss);
	/*! \brief Get 
	 */
	long long getValidMeanTokenAccuracy();

	/*! \brief Set 
	 */
	void setValidMeanTokenAccuracy(long long  valid_mean_token_accuracy);
	/*! \brief Get 
	 */
	long long getFullValidLoss();

	/*! \brief Set 
	 */
	void setFullValidLoss(long long  full_valid_loss);
	/*! \brief Get 
	 */
	long long getFullValidMeanTokenAccuracy();

	/*! \brief Set 
	 */
	void setFullValidMeanTokenAccuracy(long long  full_valid_mean_token_accuracy);

private:
	long long step;
	long long train_loss;
	long long train_mean_token_accuracy;
	long long valid_loss;
	long long valid_mean_token_accuracy;
	long long full_valid_loss;
	long long full_valid_mean_token_accuracy;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FineTuningJobCheckpoint_metrics_H_ */
