/*
 * FineTuningJob.h
 *
 * The &#x60;fine_tuning.job&#x60; object represents a fine-tuning job that has been created through the API. 
 */

#ifndef _FineTuningJob_H_
#define _FineTuningJob_H_


#include <string>
#include "FineTuneMethod.h"
#include "FineTuningJob_error.h"
#include "FineTuningJob_hyperparameters.h"
#include "FineTuningJob_integrations_inner.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The `fine_tuning.job` object represents a fine-tuning job that has been created through the API. 
 *
 *  \ingroup Models
 *
 */

class FineTuningJob : public Object {
public:
	/*! \brief Constructor.
	 */
	FineTuningJob();
	FineTuningJob(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FineTuningJob();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The object identifier, which can be referenced in the API endpoints.
	 */
	std::string getId();

	/*! \brief Set The object identifier, which can be referenced in the API endpoints.
	 */
	void setId(std::string  id);
	/*! \brief Get The Unix timestamp (in seconds) for when the fine-tuning job was created.
	 */
	int getCreatedAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the fine-tuning job was created.
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get 
	 */
	FineTuningJob_error getError();

	/*! \brief Set 
	 */
	void setError(FineTuningJob_error  error);
	/*! \brief Get The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
	 */
	std::string getFineTunedModel();

	/*! \brief Set The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
	 */
	void setFineTunedModel(std::string  fine_tuned_model);
	/*! \brief Get The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
	 */
	int getFinishedAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
	 */
	void setFinishedAt(int  finished_at);
	/*! \brief Get 
	 */
	FineTuningJob_hyperparameters getHyperparameters();

	/*! \brief Set 
	 */
	void setHyperparameters(FineTuningJob_hyperparameters  hyperparameters);
	/*! \brief Get The base model that is being fine-tuned.
	 */
	std::string getModel();

	/*! \brief Set The base model that is being fine-tuned.
	 */
	void setModel(std::string  model);
	/*! \brief Get The object type, which is always \"fine_tuning.job\".
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always \"fine_tuning.job\".
	 */
	void setObject(std::string  object);
	/*! \brief Get The organization that owns the fine-tuning job.
	 */
	std::string getOrganizationId();

	/*! \brief Set The organization that owns the fine-tuning job.
	 */
	void setOrganizationId(std::string  organization_id);
	/*! \brief Get The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
	 */
	std::list<std::string> getResultFiles();

	/*! \brief Set The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
	 */
	void setResultFiles(std::list <std::string> result_files);
	/*! \brief Get The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
	 */
	std::string getStatus();

	/*! \brief Set The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
	 */
	void setStatus(std::string  status);
	/*! \brief Get The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
	 */
	int getTrainedTokens();

	/*! \brief Set The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
	 */
	void setTrainedTokens(int  trained_tokens);
	/*! \brief Get The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
	 */
	std::string getTrainingFile();

	/*! \brief Set The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
	 */
	void setTrainingFile(std::string  training_file);
	/*! \brief Get The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
	 */
	std::string getValidationFile();

	/*! \brief Set The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
	 */
	void setValidationFile(std::string  validation_file);
	/*! \brief Get A list of integrations to enable for this fine-tuning job.
	 */
	std::list<FineTuningJob_integrations_inner> getIntegrations();

	/*! \brief Set A list of integrations to enable for this fine-tuning job.
	 */
	void setIntegrations(std::list <FineTuningJob_integrations_inner> integrations);
	/*! \brief Get The seed used for the fine-tuning job.
	 */
	int getSeed();

	/*! \brief Set The seed used for the fine-tuning job.
	 */
	void setSeed(int  seed);
	/*! \brief Get The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running.
	 */
	int getEstimatedFinish();

	/*! \brief Set The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running.
	 */
	void setEstimatedFinish(int  estimated_finish);
	/*! \brief Get 
	 */
	FineTuneMethod getMethod();

	/*! \brief Set 
	 */
	void setMethod(FineTuneMethod  method);

private:
	std::string id;
	int created_at;
	FineTuningJob_error error;
	std::string fine_tuned_model;
	int finished_at;
	FineTuningJob_hyperparameters hyperparameters;
	std::string model;
	std::string object;
	std::string organization_id;
	std::list <std::string>result_files;
	std::string status;
	int trained_tokens;
	std::string training_file;
	std::string validation_file;
	std::list <FineTuningJob_integrations_inner>integrations;
	int seed;
	int estimated_finish;
	FineTuneMethod method;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FineTuningJob_H_ */
