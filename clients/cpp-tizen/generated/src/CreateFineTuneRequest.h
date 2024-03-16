/*
 * CreateFineTuneRequest.h
 *
 * 
 */

#ifndef _CreateFineTuneRequest_H_
#define _CreateFineTuneRequest_H_


#include <string>
#include "CreateFineTuneRequest_model.h"
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

class CreateFineTuneRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateFineTuneRequest();
	CreateFineTuneRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateFineTuneRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file, where each training example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. 
	 */
	std::string getTrainingFile();

	/*! \brief Set The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file, where each training example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. 
	 */
	void setTrainingFile(std::string  training_file);
	/*! \brief Get The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the [fine-tuning results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model). Your train and validation data should be mutually exclusive.  Your dataset must be formatted as a JSONL file, where each validation example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. 
	 */
	std::string getValidationFile();

	/*! \brief Set The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the [fine-tuning results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model). Your train and validation data should be mutually exclusive.  Your dataset must be formatted as a JSONL file, where each validation example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. 
	 */
	void setValidationFile(std::string  validation_file);
	/*! \brief Get 
	 */
	CreateFineTuneRequest_model getModel();

	/*! \brief Set 
	 */
	void setModel(CreateFineTuneRequest_model  model);
	/*! \brief Get The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
	 */
	int getNEpochs();

	/*! \brief Set The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
	 */
	void setNEpochs(int  n_epochs);
	/*! \brief Get The batch size to use for training. The batch size is the number of training examples used to train a single forward and backward pass.  By default, the batch size will be dynamically configured to be ~0.2% of the number of examples in the training set, capped at 256 - in general, we've found that larger batch sizes tend to work better for larger datasets. 
	 */
	int getBatchSize();

	/*! \brief Set The batch size to use for training. The batch size is the number of training examples used to train a single forward and backward pass.  By default, the batch size will be dynamically configured to be ~0.2% of the number of examples in the training set, capped at 256 - in general, we've found that larger batch sizes tend to work better for larger datasets. 
	 */
	void setBatchSize(int  batch_size);
	/*! \brief Get The learning rate multiplier to use for training. The fine-tuning learning rate is the original learning rate used for pretraining multiplied by this value.  By default, the learning rate multiplier is the 0.05, 0.1, or 0.2 depending on final `batch_size` (larger learning rates tend to perform better with larger batch sizes). We recommend experimenting with values in the range 0.02 to 0.2 to see what produces the best results. 
	 */
	long long getLearningRateMultiplier();

	/*! \brief Set The learning rate multiplier to use for training. The fine-tuning learning rate is the original learning rate used for pretraining multiplied by this value.  By default, the learning rate multiplier is the 0.05, 0.1, or 0.2 depending on final `batch_size` (larger learning rates tend to perform better with larger batch sizes). We recommend experimenting with values in the range 0.02 to 0.2 to see what produces the best results. 
	 */
	void setLearningRateMultiplier(long long  learning_rate_multiplier);
	/*! \brief Get The weight to use for loss on the prompt tokens. This controls how much the model tries to learn to generate the prompt (as compared to the completion which always has a weight of 1.0), and can add a stabilizing effect to training when completions are short.  If prompts are extremely long (relative to completions), it may make sense to reduce this weight so as to avoid over-prioritizing learning the prompt. 
	 */
	long long getPromptLossWeight();

	/*! \brief Set The weight to use for loss on the prompt tokens. This controls how much the model tries to learn to generate the prompt (as compared to the completion which always has a weight of 1.0), and can add a stabilizing effect to training when completions are short.  If prompts are extremely long (relative to completions), it may make sense to reduce this weight so as to avoid over-prioritizing learning the prompt. 
	 */
	void setPromptLossWeight(long long  prompt_loss_weight);
	/*! \brief Get If set, we calculate classification-specific metrics such as accuracy and F-1 score using the validation set at the end of every epoch. These metrics can be viewed in the [results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model).  In order to compute classification metrics, you must provide a `validation_file`. Additionally, you must specify `classification_n_classes` for multiclass classification or `classification_positive_class` for binary classification. 
	 */
	bool getComputeClassificationMetrics();

	/*! \brief Set If set, we calculate classification-specific metrics such as accuracy and F-1 score using the validation set at the end of every epoch. These metrics can be viewed in the [results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model).  In order to compute classification metrics, you must provide a `validation_file`. Additionally, you must specify `classification_n_classes` for multiclass classification or `classification_positive_class` for binary classification. 
	 */
	void setComputeClassificationMetrics(bool  compute_classification_metrics);
	/*! \brief Get The number of classes in a classification task.  This parameter is required for multiclass classification. 
	 */
	int getClassificationNClasses();

	/*! \brief Set The number of classes in a classification task.  This parameter is required for multiclass classification. 
	 */
	void setClassificationNClasses(int  classification_n_classes);
	/*! \brief Get The positive class in binary classification.  This parameter is needed to generate precision, recall, and F1 metrics when doing binary classification. 
	 */
	std::string getClassificationPositiveClass();

	/*! \brief Set The positive class in binary classification.  This parameter is needed to generate precision, recall, and F1 metrics when doing binary classification. 
	 */
	void setClassificationPositiveClass(std::string  classification_positive_class);
	/*! \brief Get If this is provided, we calculate F-beta scores at the specified beta values. The F-beta score is a generalization of F-1 score. This is only used for binary classification.  With a beta of 1 (i.e. the F-1 score), precision and recall are given the same weight. A larger beta score puts more weight on recall and less on precision. A smaller beta score puts more weight on precision and less on recall. 
	 */
	std::list<long long> getClassificationBetas();

	/*! \brief Set If this is provided, we calculate F-beta scores at the specified beta values. The F-beta score is a generalization of F-1 score. This is only used for binary classification.  With a beta of 1 (i.e. the F-1 score), precision and recall are given the same weight. A larger beta score puts more weight on recall and less on precision. A smaller beta score puts more weight on precision and less on recall. 
	 */
	void setClassificationBetas(std::list <long long> classification_betas);
	/*! \brief Get A string of up to 40 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ada:ft-your-org:custom-model-name-2022-02-15-04-21-04`. 
	 */
	std::string getSuffix();

	/*! \brief Set A string of up to 40 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ada:ft-your-org:custom-model-name-2022-02-15-04-21-04`. 
	 */
	void setSuffix(std::string  suffix);

private:
	std::string training_file;
	std::string validation_file;
	CreateFineTuneRequest_model model;
	int n_epochs;
	int batch_size;
	long long learning_rate_multiplier;
	long long prompt_loss_weight;
	bool compute_classification_metrics;
	int classification_n_classes;
	std::string classification_positive_class;
	std::list <long long>classification_betas;
	std::string suffix;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateFineTuneRequest_H_ */
