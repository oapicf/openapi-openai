/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
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
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  CreateFineTuneRequest 
{
public:
    CreateFineTuneRequest() = default;
    explicit CreateFineTuneRequest(boost::property_tree::ptree const& pt);
    virtual ~CreateFineTuneRequest() = default;

    CreateFineTuneRequest(const CreateFineTuneRequest& other) = default; // copy constructor
    CreateFineTuneRequest(CreateFineTuneRequest&& other) noexcept = default; // move constructor

    CreateFineTuneRequest& operator=(const CreateFineTuneRequest& other) = default; // copy assignment
    CreateFineTuneRequest& operator=(CreateFineTuneRequest&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CreateFineTuneRequest members

    /// <summary>
    /// The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file, where each training example is a JSON object with the keys \&quot;prompt\&quot; and \&quot;completion\&quot;. Additionally, you must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. 
    /// </summary>
    std::string getTrainingFile() const;
    void setTrainingFile(std::string value);

    /// <summary>
    /// The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the [fine-tuning results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model). Your train and validation data should be mutually exclusive.  Your dataset must be formatted as a JSONL file, where each validation example is a JSON object with the keys \&quot;prompt\&quot; and \&quot;completion\&quot;. Additionally, you must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. 
    /// </summary>
    std::string getValidationFile() const;
    void setValidationFile(std::string value);

    /// <summary>
    /// 
    /// </summary>
    CreateFineTuneRequest_model getModel() const;
    void setModel(CreateFineTuneRequest_model value);

    /// <summary>
    /// The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
    /// </summary>
    int32_t getNEpochs() const;
    void setNEpochs(int32_t value);

    /// <summary>
    /// The batch size to use for training. The batch size is the number of training examples used to train a single forward and backward pass.  By default, the batch size will be dynamically configured to be ~0.2% of the number of examples in the training set, capped at 256 - in general, we&#39;ve found that larger batch sizes tend to work better for larger datasets. 
    /// </summary>
    int32_t getBatchSize() const;
    void setBatchSize(int32_t value);

    /// <summary>
    /// The learning rate multiplier to use for training. The fine-tuning learning rate is the original learning rate used for pretraining multiplied by this value.  By default, the learning rate multiplier is the 0.05, 0.1, or 0.2 depending on final &#x60;batch_size&#x60; (larger learning rates tend to perform better with larger batch sizes). We recommend experimenting with values in the range 0.02 to 0.2 to see what produces the best results. 
    /// </summary>
    double getLearningRateMultiplier() const;
    void setLearningRateMultiplier(double value);

    /// <summary>
    /// The weight to use for loss on the prompt tokens. This controls how much the model tries to learn to generate the prompt (as compared to the completion which always has a weight of 1.0), and can add a stabilizing effect to training when completions are short.  If prompts are extremely long (relative to completions), it may make sense to reduce this weight so as to avoid over-prioritizing learning the prompt. 
    /// </summary>
    double getPromptLossWeight() const;
    void setPromptLossWeight(double value);

    /// <summary>
    /// If set, we calculate classification-specific metrics such as accuracy and F-1 score using the validation set at the end of every epoch. These metrics can be viewed in the [results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model).  In order to compute classification metrics, you must provide a &#x60;validation_file&#x60;. Additionally, you must specify &#x60;classification_n_classes&#x60; for multiclass classification or &#x60;classification_positive_class&#x60; for binary classification. 
    /// </summary>
    bool isComputeClassificationMetrics() const;
    void setComputeClassificationMetrics(bool value);

    /// <summary>
    /// The number of classes in a classification task.  This parameter is required for multiclass classification. 
    /// </summary>
    int32_t getClassificationNClasses() const;
    void setClassificationNClasses(int32_t value);

    /// <summary>
    /// The positive class in binary classification.  This parameter is needed to generate precision, recall, and F1 metrics when doing binary classification. 
    /// </summary>
    std::string getClassificationPositiveClass() const;
    void setClassificationPositiveClass(std::string value);

    /// <summary>
    /// If this is provided, we calculate F-beta scores at the specified beta values. The F-beta score is a generalization of F-1 score. This is only used for binary classification.  With a beta of 1 (i.e. the F-1 score), precision and recall are given the same weight. A larger beta score puts more weight on recall and less on precision. A smaller beta score puts more weight on precision and less on recall. 
    /// </summary>
    std::vector<double> getClassificationBetas() const;
    void setClassificationBetas(std::vector<double> value);

    /// <summary>
    /// A string of up to 40 characters that will be added to your fine-tuned model name.  For example, a &#x60;suffix&#x60; of \&quot;custom-model-name\&quot; would produce a model name like &#x60;ada:ft-your-org:custom-model-name-2022-02-15-04-21-04&#x60;. 
    /// </summary>
    std::string getSuffix() const;
    void setSuffix(std::string value);

protected:
    std::string m_Training_file = "";
    std::string m_Validation_file = "";
    CreateFineTuneRequest_model m_Model;
    int32_t m_N_epochs = 4;
    int32_t m_Batch_size = 0;
    double m_Learning_rate_multiplier = 0.0;
    double m_Prompt_loss_weight = 0.01;
    bool m_Compute_classification_metrics = false;
    int32_t m_Classification_n_classes = 0;
    std::string m_Classification_positive_class = "";
    std::vector<double> m_Classification_betas;
    std::string m_Suffix = "";
};

std::vector<CreateFineTuneRequest> createCreateFineTuneRequestVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CreateFineTuneRequest>(const CreateFineTuneRequest& val) {
    return val.toPropertyTree();
}

template<>
inline CreateFineTuneRequest fromPt<CreateFineTuneRequest>(const boost::property_tree::ptree& pt) {
    CreateFineTuneRequest ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CreateFineTuneRequest_H_ */