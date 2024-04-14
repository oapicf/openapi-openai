/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * FineTuningJob_integrations_inner.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_FineTuningJob_integrations_inner_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_FineTuningJob_integrations_inner_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/FineTuningIntegration.h"
#include <cpprest/details/basic_types.h>
#include "CppRestOpenAPIClient/model/CreateFineTuningJobRequest_integrations_inner_wandb.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class CreateFineTuningJobRequest_integrations_inner_wandb;

/// <summary>
/// 
/// </summary>
class  FineTuningJob_integrations_inner
    : public ModelBase
{
public:
    FineTuningJob_integrations_inner();
    virtual ~FineTuningJob_integrations_inner();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// FineTuningJob_integrations_inner members

    /// <summary>
    /// The type of the integration being enabled for the fine-tuning job
    /// </summary>
    utility::string_t getType() const;
    bool typeIsSet() const;
    void unsetType();

    void setType(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CreateFineTuningJobRequest_integrations_inner_wandb> getWandb() const;
    bool wandbIsSet() const;
    void unsetWandb();

    void setWandb(const std::shared_ptr<CreateFineTuningJobRequest_integrations_inner_wandb>& value);


protected:
    utility::string_t m_Type;
    bool m_TypeIsSet;
    std::shared_ptr<CreateFineTuningJobRequest_integrations_inner_wandb> m_Wandb;
    bool m_WandbIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_FineTuningJob_integrations_inner_H_ */
