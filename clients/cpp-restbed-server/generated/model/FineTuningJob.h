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
 * FineTuningJob.h
 *
 * The &#x60;fine_tuning.job&#x60; object represents a fine-tuning job that has been created through the API. 
 */

#ifndef FineTuningJob_H_
#define FineTuningJob_H_



#include "FineTuningJob_hyperparameters.h"
#include "FineTuningJob_error.h"
#include "FineTuningJob_integrations_inner.h"
#include <string>
#include <vector>
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// The &#x60;fine_tuning.job&#x60; object represents a fine-tuning job that has been created through the API. 
/// </summary>
class  FineTuningJob 
{
public:
    FineTuningJob() = default;
    explicit FineTuningJob(boost::property_tree::ptree const& pt);
    virtual ~FineTuningJob() = default;

    FineTuningJob(const FineTuningJob& other) = default; // copy constructor
    FineTuningJob(FineTuningJob&& other) noexcept = default; // move constructor

    FineTuningJob& operator=(const FineTuningJob& other) = default; // copy assignment
    FineTuningJob& operator=(FineTuningJob&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// FineTuningJob members

    /// <summary>
    /// The object identifier, which can be referenced in the API endpoints.
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// The Unix timestamp (in seconds) for when the fine-tuning job was created.
    /// </summary>
    int32_t getCreatedAt() const;
    void setCreatedAt(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    FineTuningJob_error getError() const;
    void setError(FineTuningJob_error value);

    /// <summary>
    /// The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
    /// </summary>
    std::string getFineTunedModel() const;
    void setFineTunedModel(std::string value);

    /// <summary>
    /// The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
    /// </summary>
    int32_t getFinishedAt() const;
    void setFinishedAt(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    FineTuningJob_hyperparameters getHyperparameters() const;
    void setHyperparameters(FineTuningJob_hyperparameters value);

    /// <summary>
    /// The base model that is being fine-tuned.
    /// </summary>
    std::string getModel() const;
    void setModel(std::string value);

    /// <summary>
    /// The object type, which is always \&quot;fine_tuning.job\&quot;.
    /// </summary>
    std::string getObject() const;
    void setObject(std::string value);

    /// <summary>
    /// The organization that owns the fine-tuning job.
    /// </summary>
    std::string getOrganizationId() const;
    void setOrganizationId(std::string value);

    /// <summary>
    /// The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
    /// </summary>
    std::vector<std::string> getResultFiles() const;
    void setResultFiles(std::vector<std::string> value);

    /// <summary>
    /// The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;.
    /// </summary>
    std::string getStatus() const;
    void setStatus(std::string value);

    /// <summary>
    /// The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
    /// </summary>
    int32_t getTrainedTokens() const;
    void setTrainedTokens(int32_t value);

    /// <summary>
    /// The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
    /// </summary>
    std::string getTrainingFile() const;
    void setTrainingFile(std::string value);

    /// <summary>
    /// The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
    /// </summary>
    std::string getValidationFile() const;
    void setValidationFile(std::string value);

    /// <summary>
    /// A list of integrations to enable for this fine-tuning job.
    /// </summary>
    std::vector<FineTuningJob_integrations_inner> getIntegrations() const;
    void setIntegrations(std::vector<FineTuningJob_integrations_inner> value);

    /// <summary>
    /// The seed used for the fine-tuning job.
    /// </summary>
    int32_t getSeed() const;
    void setSeed(int32_t value);

protected:
    std::string m_Id = "";
    int32_t m_Created_at = 0;
    FineTuningJob_error m_Error;
    std::string m_Fine_tuned_model = "";
    int32_t m_Finished_at = 0;
    FineTuningJob_hyperparameters m_Hyperparameters;
    std::string m_Model = "";
    std::string m_object = "";
    std::string m_Organization_id = "";
    std::vector<std::string> m_Result_files;
    std::string m_Status = "";
    int32_t m_Trained_tokens = 0;
    std::string m_Training_file = "";
    std::string m_Validation_file = "";
    std::vector<FineTuningJob_integrations_inner> m_Integrations;
    int32_t m_Seed = 0;
};

std::vector<FineTuningJob> createFineTuningJobVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<FineTuningJob>(const FineTuningJob& val) {
    return val.toPropertyTree();
}

template<>
inline FineTuningJob fromPt<FineTuningJob>(const boost::property_tree::ptree& pt) {
    FineTuningJob ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* FineTuningJob_H_ */
