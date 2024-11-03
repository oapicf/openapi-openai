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
 * CreateFineTuningJobRequest_hyperparameters.h
 *
 * The hyperparameters used for the fine-tuning job.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CreateFineTuningJobRequest_hyperparameters_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CreateFineTuningJobRequest_hyperparameters_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier.h"
#include "CppRestOpenAPIClient/model/CreateFineTuningJobRequest_hyperparameters_batch_size.h"
#include "CppRestOpenAPIClient/model/CreateFineTuningJobRequest_hyperparameters_n_epochs.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// The hyperparameters used for the fine-tuning job.
/// </summary>
class  CreateFineTuningJobRequest_hyperparameters
    : public ModelBase
{
public:
    CreateFineTuningJobRequest_hyperparameters();
    virtual ~CreateFineTuningJobRequest_hyperparameters();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CreateFineTuningJobRequest_hyperparameters members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CreateFineTuningJobRequest_hyperparameters_batch_size> getBatchSize() const;
    bool batchSizeIsSet() const;
    void unsetBatch_size();

    void setBatchSize(const std::shared_ptr<CreateFineTuningJobRequest_hyperparameters_batch_size>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier> getLearningRateMultiplier() const;
    bool learningRateMultiplierIsSet() const;
    void unsetLearning_rate_multiplier();

    void setLearningRateMultiplier(const std::shared_ptr<CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CreateFineTuningJobRequest_hyperparameters_n_epochs> getNEpochs() const;
    bool nEpochsIsSet() const;
    void unsetN_epochs();

    void setNEpochs(const std::shared_ptr<CreateFineTuningJobRequest_hyperparameters_n_epochs>& value);


protected:
    std::shared_ptr<CreateFineTuningJobRequest_hyperparameters_batch_size> m_Batch_size;
    bool m_Batch_sizeIsSet;
    std::shared_ptr<CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier> m_Learning_rate_multiplier;
    bool m_Learning_rate_multiplierIsSet;
    std::shared_ptr<CreateFineTuningJobRequest_hyperparameters_n_epochs> m_N_epochs;
    bool m_N_epochsIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CreateFineTuningJobRequest_hyperparameters_H_ */
