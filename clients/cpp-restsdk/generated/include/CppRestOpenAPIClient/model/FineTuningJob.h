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

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_FineTuningJob_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_FineTuningJob_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/FineTuningJob_hyperparameters.h"
#include "CppRestOpenAPIClient/model/FineTuningJob_integrations_inner.h"
#include <cpprest/details/basic_types.h>
#include "CppRestOpenAPIClient/model/FineTuningJob_error.h"
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class FineTuningJob_error;
class FineTuningJob_hyperparameters;
class FineTuningJob_integrations_inner;


/// <summary>
/// The &#x60;fine_tuning.job&#x60; object represents a fine-tuning job that has been created through the API. 
/// </summary>
class  FineTuningJob
    : public ModelBase
{
public:
    FineTuningJob();
    virtual ~FineTuningJob();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// FineTuningJob members

    /// <summary>
    /// The object identifier, which can be referenced in the API endpoints.
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// The Unix timestamp (in seconds) for when the fine-tuning job was created.
    /// </summary>
    int32_t getCreatedAt() const;
    bool createdAtIsSet() const;
    void unsetCreated_at();

    void setCreatedAt(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<FineTuningJob_error> getError() const;
    bool errorIsSet() const;
    void unsetError();

    void setError(const std::shared_ptr<FineTuningJob_error>& value);

    /// <summary>
    /// The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
    /// </summary>
    utility::string_t getFineTunedModel() const;
    bool fineTunedModelIsSet() const;
    void unsetFine_tuned_model();

    void setFineTunedModel(const utility::string_t& value);

    /// <summary>
    /// The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
    /// </summary>
    int32_t getFinishedAt() const;
    bool finishedAtIsSet() const;
    void unsetFinished_at();

    void setFinishedAt(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<FineTuningJob_hyperparameters> getHyperparameters() const;
    bool hyperparametersIsSet() const;
    void unsetHyperparameters();

    void setHyperparameters(const std::shared_ptr<FineTuningJob_hyperparameters>& value);

    /// <summary>
    /// The base model that is being fine-tuned.
    /// </summary>
    utility::string_t getModel() const;
    bool modelIsSet() const;
    void unsetModel();

    void setModel(const utility::string_t& value);

    /// <summary>
    /// The object type, which is always \&quot;fine_tuning.job\&quot;.
    /// </summary>
    utility::string_t getObject() const;
    bool objectIsSet() const;
    void unsetobject();

    void setObject(const utility::string_t& value);

    /// <summary>
    /// The organization that owns the fine-tuning job.
    /// </summary>
    utility::string_t getOrganizationId() const;
    bool organizationIdIsSet() const;
    void unsetOrganization_id();

    void setOrganizationId(const utility::string_t& value);

    /// <summary>
    /// The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
    /// </summary>
    std::vector<utility::string_t>& getResultFiles();
    bool resultFilesIsSet() const;
    void unsetResult_files();

    void setResultFiles(const std::vector<utility::string_t>& value);

    /// <summary>
    /// The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;.
    /// </summary>
    utility::string_t getStatus() const;
    bool statusIsSet() const;
    void unsetStatus();

    void setStatus(const utility::string_t& value);

    /// <summary>
    /// The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
    /// </summary>
    int32_t getTrainedTokens() const;
    bool trainedTokensIsSet() const;
    void unsetTrained_tokens();

    void setTrainedTokens(int32_t value);

    /// <summary>
    /// The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
    /// </summary>
    utility::string_t getTrainingFile() const;
    bool trainingFileIsSet() const;
    void unsetTraining_file();

    void setTrainingFile(const utility::string_t& value);

    /// <summary>
    /// The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
    /// </summary>
    utility::string_t getValidationFile() const;
    bool validationFileIsSet() const;
    void unsetValidation_file();

    void setValidationFile(const utility::string_t& value);

    /// <summary>
    /// A list of integrations to enable for this fine-tuning job.
    /// </summary>
    std::vector<std::shared_ptr<FineTuningJob_integrations_inner>>& getIntegrations();
    bool integrationsIsSet() const;
    void unsetIntegrations();

    void setIntegrations(const std::vector<std::shared_ptr<FineTuningJob_integrations_inner>>& value);

    /// <summary>
    /// The seed used for the fine-tuning job.
    /// </summary>
    int32_t getSeed() const;
    bool seedIsSet() const;
    void unsetSeed();

    void setSeed(int32_t value);


protected:
    utility::string_t m_Id;
    bool m_IdIsSet;
    int32_t m_Created_at;
    bool m_Created_atIsSet;
    std::shared_ptr<FineTuningJob_error> m_Error;
    bool m_ErrorIsSet;
    utility::string_t m_Fine_tuned_model;
    bool m_Fine_tuned_modelIsSet;
    int32_t m_Finished_at;
    bool m_Finished_atIsSet;
    std::shared_ptr<FineTuningJob_hyperparameters> m_Hyperparameters;
    bool m_HyperparametersIsSet;
    utility::string_t m_Model;
    bool m_ModelIsSet;
    utility::string_t m_object;
    bool m_objectIsSet;
    utility::string_t m_Organization_id;
    bool m_Organization_idIsSet;
    std::vector<utility::string_t> m_Result_files;
    bool m_Result_filesIsSet;
    utility::string_t m_Status;
    bool m_StatusIsSet;
    int32_t m_Trained_tokens;
    bool m_Trained_tokensIsSet;
    utility::string_t m_Training_file;
    bool m_Training_fileIsSet;
    utility::string_t m_Validation_file;
    bool m_Validation_fileIsSet;
    std::vector<std::shared_ptr<FineTuningJob_integrations_inner>> m_Integrations;
    bool m_IntegrationsIsSet;
    int32_t m_Seed;
    bool m_SeedIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_FineTuningJob_H_ */
