/**
* OpenAI API
* APIs for sampling from and fine-tuning language models
*
* The version of the OpenAPI document: 2.0.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * CreateFineTuneRequest.h
 *
 * 
 */

#ifndef CreateFineTuneRequest_H_
#define CreateFineTuneRequest_H_


#include <string>
#include "CreateFineTuneRequest_model.h"
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  CreateFineTuneRequest
{
public:
    CreateFineTuneRequest();
    virtual ~CreateFineTuneRequest() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const CreateFineTuneRequest& rhs) const;
    bool operator!=(const CreateFineTuneRequest& rhs) const;

    /////////////////////////////////////////////
    /// CreateFineTuneRequest members

    /// <summary>
    /// The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file, where each training example is a JSON object with the keys \&quot;prompt\&quot; and \&quot;completion\&quot;. Additionally, you must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. 
    /// </summary>
    std::string getTrainingFile() const;
    void setTrainingFile(std::string const& value);
    /// <summary>
    /// The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the [fine-tuning results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model). Your train and validation data should be mutually exclusive.  Your dataset must be formatted as a JSONL file, where each validation example is a JSON object with the keys \&quot;prompt\&quot; and \&quot;completion\&quot;. Additionally, you must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. 
    /// </summary>
    std::string getValidationFile() const;
    void setValidationFile(std::string const& value);
    bool validationFileIsSet() const;
    void unsetValidation_file();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::CreateFineTuneRequest_model getModel() const;
    void setModel(org::openapitools::server::model::CreateFineTuneRequest_model const& value);
    bool modelIsSet() const;
    void unsetModel();
    /// <summary>
    /// The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
    /// </summary>
    int32_t getNEpochs() const;
    void setNEpochs(int32_t const value);
    bool nEpochsIsSet() const;
    void unsetN_epochs();
    /// <summary>
    /// The batch size to use for training. The batch size is the number of training examples used to train a single forward and backward pass.  By default, the batch size will be dynamically configured to be ~0.2% of the number of examples in the training set, capped at 256 - in general, we&#39;ve found that larger batch sizes tend to work better for larger datasets. 
    /// </summary>
    int32_t getBatchSize() const;
    void setBatchSize(int32_t const value);
    bool batchSizeIsSet() const;
    void unsetBatch_size();
    /// <summary>
    /// The learning rate multiplier to use for training. The fine-tuning learning rate is the original learning rate used for pretraining multiplied by this value.  By default, the learning rate multiplier is the 0.05, 0.1, or 0.2 depending on final &#x60;batch_size&#x60; (larger learning rates tend to perform better with larger batch sizes). We recommend experimenting with values in the range 0.02 to 0.2 to see what produces the best results. 
    /// </summary>
    double getLearningRateMultiplier() const;
    void setLearningRateMultiplier(double const value);
    bool learningRateMultiplierIsSet() const;
    void unsetLearning_rate_multiplier();
    /// <summary>
    /// The weight to use for loss on the prompt tokens. This controls how much the model tries to learn to generate the prompt (as compared to the completion which always has a weight of 1.0), and can add a stabilizing effect to training when completions are short.  If prompts are extremely long (relative to completions), it may make sense to reduce this weight so as to avoid over-prioritizing learning the prompt. 
    /// </summary>
    double getPromptLossWeight() const;
    void setPromptLossWeight(double const value);
    bool promptLossWeightIsSet() const;
    void unsetPrompt_loss_weight();
    /// <summary>
    /// If set, we calculate classification-specific metrics such as accuracy and F-1 score using the validation set at the end of every epoch. These metrics can be viewed in the [results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model).  In order to compute classification metrics, you must provide a &#x60;validation_file&#x60;. Additionally, you must specify &#x60;classification_n_classes&#x60; for multiclass classification or &#x60;classification_positive_class&#x60; for binary classification. 
    /// </summary>
    bool isComputeClassificationMetrics() const;
    void setComputeClassificationMetrics(bool const value);
    bool computeClassificationMetricsIsSet() const;
    void unsetCompute_classification_metrics();
    /// <summary>
    /// The number of classes in a classification task.  This parameter is required for multiclass classification. 
    /// </summary>
    int32_t getClassificationNClasses() const;
    void setClassificationNClasses(int32_t const value);
    bool classificationNClassesIsSet() const;
    void unsetClassification_n_classes();
    /// <summary>
    /// The positive class in binary classification.  This parameter is needed to generate precision, recall, and F1 metrics when doing binary classification. 
    /// </summary>
    std::string getClassificationPositiveClass() const;
    void setClassificationPositiveClass(std::string const& value);
    bool classificationPositiveClassIsSet() const;
    void unsetClassification_positive_class();
    /// <summary>
    /// If this is provided, we calculate F-beta scores at the specified beta values. The F-beta score is a generalization of F-1 score. This is only used for binary classification.  With a beta of 1 (i.e. the F-1 score), precision and recall are given the same weight. A larger beta score puts more weight on recall and less on precision. A smaller beta score puts more weight on precision and less on recall. 
    /// </summary>
    std::vector<double> getClassificationBetas() const;
    void setClassificationBetas(std::vector<double> const value);
    bool classificationBetasIsSet() const;
    void unsetClassification_betas();
    /// <summary>
    /// A string of up to 40 characters that will be added to your fine-tuned model name.  For example, a &#x60;suffix&#x60; of \&quot;custom-model-name\&quot; would produce a model name like &#x60;ada:ft-your-org:custom-model-name-2022-02-15-04-21-04&#x60;. 
    /// </summary>
    std::string getSuffix() const;
    void setSuffix(std::string const& value);
    bool suffixIsSet() const;
    void unsetSuffix();

    friend  void to_json(nlohmann::json& j, const CreateFineTuneRequest& o);
    friend  void from_json(const nlohmann::json& j, CreateFineTuneRequest& o);
protected:
    std::string m_Training_file;

    std::string m_Validation_file;
    bool m_Validation_fileIsSet;
    org::openapitools::server::model::CreateFineTuneRequest_model m_Model;
    bool m_ModelIsSet;
    int32_t m_N_epochs;
    bool m_N_epochsIsSet;
    int32_t m_Batch_size;
    bool m_Batch_sizeIsSet;
    double m_Learning_rate_multiplier;
    bool m_Learning_rate_multiplierIsSet;
    double m_Prompt_loss_weight;
    bool m_Prompt_loss_weightIsSet;
    bool m_Compute_classification_metrics;
    bool m_Compute_classification_metricsIsSet;
    int32_t m_Classification_n_classes;
    bool m_Classification_n_classesIsSet;
    std::string m_Classification_positive_class;
    bool m_Classification_positive_classIsSet;
    std::vector<double> m_Classification_betas;
    bool m_Classification_betasIsSet;
    std::string m_Suffix;
    bool m_SuffixIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* CreateFineTuneRequest_H_ */