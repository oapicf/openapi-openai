/*
 * CreateFineTuningJobRequest.h
 *
 * 
 */

#ifndef _CreateFineTuningJobRequest_H_
#define _CreateFineTuningJobRequest_H_


#include <string>
#include "CreateFineTuningJobRequest_hyperparameters.h"
#include "CreateFineTuningJobRequest_integrations_inner.h"
#include "CreateFineTuningJobRequest_model.h"
#include "FineTuneMethod.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateFineTuningJobRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateFineTuningJobRequest();
	CreateFineTuningJobRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateFineTuningJobRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CreateFineTuningJobRequest_model getModel();

	/*! \brief Set 
	 */
	void setModel(CreateFineTuningJobRequest_model  model);
	/*! \brief Get The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  The contents of the file should differ depending on if the model uses the [chat](/docs/api-reference/fine-tuning/chat-input), [completions](/docs/api-reference/fine-tuning/completions-input) format, or if the fine-tuning method uses the [preference](/docs/api-reference/fine-tuning/preference-input) format.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
	 */
	std::string getTrainingFile();

	/*! \brief Set The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  The contents of the file should differ depending on if the model uses the [chat](/docs/api-reference/fine-tuning/chat-input), [completions](/docs/api-reference/fine-tuning/completions-input) format, or if the fine-tuning method uses the [preference](/docs/api-reference/fine-tuning/preference-input) format.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
	 */
	void setTrainingFile(std::string  training_file);
	/*! \brief Get 
	 */
	CreateFineTuningJobRequest_hyperparameters getHyperparameters();

	/*! \brief Set 
	 */
	void setHyperparameters(CreateFineTuningJobRequest_hyperparameters  hyperparameters);
	/*! \brief Get A string of up to 64 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-4o-mini:openai:custom-model-name:7p4lURel`. 
	 */
	std::string getSuffix();

	/*! \brief Set A string of up to 64 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-4o-mini:openai:custom-model-name:7p4lURel`. 
	 */
	void setSuffix(std::string  suffix);
	/*! \brief Get The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
	 */
	std::string getValidationFile();

	/*! \brief Set The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
	 */
	void setValidationFile(std::string  validation_file);
	/*! \brief Get A list of integrations to enable for your fine-tuning job.
	 */
	std::list<CreateFineTuningJobRequest_integrations_inner> getIntegrations();

	/*! \brief Set A list of integrations to enable for your fine-tuning job.
	 */
	void setIntegrations(std::list <CreateFineTuningJobRequest_integrations_inner> integrations);
	/*! \brief Get The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. 
	 */
	int getSeed();

	/*! \brief Set The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. 
	 */
	void setSeed(int  seed);
	/*! \brief Get 
	 */
	FineTuneMethod getMethod();

	/*! \brief Set 
	 */
	void setMethod(FineTuneMethod  method);

private:
	CreateFineTuningJobRequest_model model;
	std::string training_file;
	CreateFineTuningJobRequest_hyperparameters hyperparameters;
	std::string suffix;
	std::string validation_file;
	std::list <CreateFineTuningJobRequest_integrations_inner>integrations;
	int seed;
	FineTuneMethod method;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateFineTuningJobRequest_H_ */
