/*
 * FineTuningJobCheckpoint.h
 *
 * The &#x60;fine_tuning.job.checkpoint&#x60; object represents a model checkpoint for a fine-tuning job that is ready to use. 
 */

#ifndef _FineTuningJobCheckpoint_H_
#define _FineTuningJobCheckpoint_H_


#include <string>
#include "FineTuningJobCheckpoint_metrics.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The `fine_tuning.job.checkpoint` object represents a model checkpoint for a fine-tuning job that is ready to use. 
 *
 *  \ingroup Models
 *
 */

class FineTuningJobCheckpoint : public Object {
public:
	/*! \brief Constructor.
	 */
	FineTuningJobCheckpoint();
	FineTuningJobCheckpoint(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FineTuningJobCheckpoint();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The checkpoint identifier, which can be referenced in the API endpoints.
	 */
	std::string getId();

	/*! \brief Set The checkpoint identifier, which can be referenced in the API endpoints.
	 */
	void setId(std::string  id);
	/*! \brief Get The Unix timestamp (in seconds) for when the checkpoint was created.
	 */
	int getCreatedAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the checkpoint was created.
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get The name of the fine-tuned checkpoint model that is created.
	 */
	std::string getFineTunedModelCheckpoint();

	/*! \brief Set The name of the fine-tuned checkpoint model that is created.
	 */
	void setFineTunedModelCheckpoint(std::string  fine_tuned_model_checkpoint);
	/*! \brief Get The step number that the checkpoint was created at.
	 */
	int getStepNumber();

	/*! \brief Set The step number that the checkpoint was created at.
	 */
	void setStepNumber(int  step_number);
	/*! \brief Get 
	 */
	FineTuningJobCheckpoint_metrics getMetrics();

	/*! \brief Set 
	 */
	void setMetrics(FineTuningJobCheckpoint_metrics  metrics);
	/*! \brief Get The name of the fine-tuning job that this checkpoint was created from.
	 */
	std::string getFineTuningJobId();

	/*! \brief Set The name of the fine-tuning job that this checkpoint was created from.
	 */
	void setFineTuningJobId(std::string  fine_tuning_job_id);
	/*! \brief Get The object type, which is always \"fine_tuning.job.checkpoint\".
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always \"fine_tuning.job.checkpoint\".
	 */
	void setObject(std::string  object);

private:
	std::string id;
	int created_at;
	std::string fine_tuned_model_checkpoint;
	int step_number;
	FineTuningJobCheckpoint_metrics metrics;
	std::string fine_tuning_job_id;
	std::string object;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FineTuningJobCheckpoint_H_ */
