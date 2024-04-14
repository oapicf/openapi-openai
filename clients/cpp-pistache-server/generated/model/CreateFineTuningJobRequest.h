/**
* OpenAI API
* The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
*
* The version of the OpenAPI document: 2.0.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
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
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  CreateFineTuningJobRequest
{
public:
    CreateFineTuningJobRequest();
    virtual ~CreateFineTuningJobRequest() = default;


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

    bool operator==(const CreateFineTuningJobRequest& rhs) const;
    bool operator!=(const CreateFineTuningJobRequest& rhs) const;

    /////////////////////////////////////////////
    /// CreateFineTuningJobRequest members

    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::CreateFineTuningJobRequest_model getModel() const;
    void setModel(org::openapitools::server::model::CreateFineTuningJobRequest_model const& value);
    /// <summary>
    /// The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
    /// </summary>
    std::string getTrainingFile() const;
    void setTrainingFile(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::CreateFineTuningJobRequest_hyperparameters getHyperparameters() const;
    void setHyperparameters(org::openapitools::server::model::CreateFineTuningJobRequest_hyperparameters const& value);
    bool hyperparametersIsSet() const;
    void unsetHyperparameters();
    /// <summary>
    /// A string of up to 18 characters that will be added to your fine-tuned model name.  For example, a &#x60;suffix&#x60; of \&quot;custom-model-name\&quot; would produce a model name like &#x60;ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel&#x60;. 
    /// </summary>
    std::string getSuffix() const;
    void setSuffix(std::string const& value);
    bool suffixIsSet() const;
    void unsetSuffix();
    /// <summary>
    /// The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
    /// </summary>
    std::string getValidationFile() const;
    void setValidationFile(std::string const& value);
    bool validationFileIsSet() const;
    void unsetValidation_file();
    /// <summary>
    /// A list of integrations to enable for your fine-tuning job.
    /// </summary>
    std::vector<org::openapitools::server::model::CreateFineTuningJobRequest_integrations_inner> getIntegrations() const;
    void setIntegrations(std::vector<org::openapitools::server::model::CreateFineTuningJobRequest_integrations_inner> const& value);
    bool integrationsIsSet() const;
    void unsetIntegrations();
    /// <summary>
    /// The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. 
    /// </summary>
    int32_t getSeed() const;
    void setSeed(int32_t const value);
    bool seedIsSet() const;
    void unsetSeed();

    friend  void to_json(nlohmann::json& j, const CreateFineTuningJobRequest& o);
    friend  void from_json(const nlohmann::json& j, CreateFineTuningJobRequest& o);
protected:
    org::openapitools::server::model::CreateFineTuningJobRequest_model m_Model;

    std::string m_Training_file;

    org::openapitools::server::model::CreateFineTuningJobRequest_hyperparameters m_Hyperparameters;
    bool m_HyperparametersIsSet;
    std::string m_Suffix;
    bool m_SuffixIsSet;
    std::string m_Validation_file;
    bool m_Validation_fileIsSet;
    std::vector<org::openapitools::server::model::CreateFineTuningJobRequest_integrations_inner> m_Integrations;
    bool m_IntegrationsIsSet;
    int32_t m_Seed;
    bool m_SeedIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* CreateFineTuningJobRequest_H_ */
