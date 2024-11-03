/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * CreateFineTuningJobRequest.h
 *
 * 
 */

#ifndef CreateFineTuningJobRequest_H_
#define CreateFineTuningJobRequest_H_



#include "CreateFineTuningJobRequest_integrations_inner.h"
#include "CreateFineTuningJobRequest_hyperparameters.h"
#include <string>
#include <vector>
#include "CreateFineTuningJobRequest_model.h"
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
class  CreateFineTuningJobRequest 
{
public:
    CreateFineTuningJobRequest() = default;
    explicit CreateFineTuningJobRequest(boost::property_tree::ptree const& pt);
    virtual ~CreateFineTuningJobRequest() = default;

    CreateFineTuningJobRequest(const CreateFineTuningJobRequest& other) = default; // copy constructor
    CreateFineTuningJobRequest(CreateFineTuningJobRequest&& other) noexcept = default; // move constructor

    CreateFineTuningJobRequest& operator=(const CreateFineTuningJobRequest& other) = default; // copy assignment
    CreateFineTuningJobRequest& operator=(CreateFineTuningJobRequest&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CreateFineTuningJobRequest members

    /// <summary>
    /// 
    /// </summary>
    CreateFineTuningJobRequest_model getModel() const;
    void setModel(CreateFineTuningJobRequest_model value);

    /// <summary>
    /// The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
    /// </summary>
    std::string getTrainingFile() const;
    void setTrainingFile(std::string value);

    /// <summary>
    /// 
    /// </summary>
    CreateFineTuningJobRequest_hyperparameters getHyperparameters() const;
    void setHyperparameters(CreateFineTuningJobRequest_hyperparameters value);

    /// <summary>
    /// A string of up to 18 characters that will be added to your fine-tuned model name.  For example, a &#x60;suffix&#x60; of \&quot;custom-model-name\&quot; would produce a model name like &#x60;ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel&#x60;. 
    /// </summary>
    std::string getSuffix() const;
    void setSuffix(std::string value);

    /// <summary>
    /// The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
    /// </summary>
    std::string getValidationFile() const;
    void setValidationFile(std::string value);

    /// <summary>
    /// A list of integrations to enable for your fine-tuning job.
    /// </summary>
    std::vector<CreateFineTuningJobRequest_integrations_inner> getIntegrations() const;
    void setIntegrations(std::vector<CreateFineTuningJobRequest_integrations_inner> value);

    /// <summary>
    /// The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. 
    /// </summary>
    int32_t getSeed() const;
    void setSeed(int32_t value);

protected:
    CreateFineTuningJobRequest_model m_Model;
    std::string m_Training_file = "";
    CreateFineTuningJobRequest_hyperparameters m_Hyperparameters;
    std::string m_Suffix = "";
    std::string m_Validation_file = "";
    std::vector<CreateFineTuningJobRequest_integrations_inner> m_Integrations;
    int32_t m_Seed = 0;
};

std::vector<CreateFineTuningJobRequest> createCreateFineTuningJobRequestVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CreateFineTuningJobRequest>(const CreateFineTuningJobRequest& val) {
    return val.toPropertyTree();
}

template<>
inline CreateFineTuningJobRequest fromPt<CreateFineTuningJobRequest>(const boost::property_tree::ptree& pt) {
    CreateFineTuningJobRequest ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CreateFineTuningJobRequest_H_ */
