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
 * CreateFineTuningJobRequest_integrations_inner.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CreateFineTuningJobRequest_integrations_inner_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CreateFineTuningJobRequest_integrations_inner_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/CreateFineTuningJobRequest_integrations_inner_type.h"
#include "CppRestOpenAPIClient/model/CreateFineTuningJobRequest_integrations_inner_wandb.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class CreateFineTuningJobRequest_integrations_inner_wandb;

/// <summary>
/// 
/// </summary>
class  CreateFineTuningJobRequest_integrations_inner
    : public ModelBase
{
public:
    CreateFineTuningJobRequest_integrations_inner();
    virtual ~CreateFineTuningJobRequest_integrations_inner();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CreateFineTuningJobRequest_integrations_inner members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CreateFineTuningJobRequest_integrations_inner_type> getType() const;
    bool typeIsSet() const;
    void unsetType();

    void setType(const std::shared_ptr<CreateFineTuningJobRequest_integrations_inner_type>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CreateFineTuningJobRequest_integrations_inner_wandb> getWandb() const;
    bool wandbIsSet() const;
    void unsetWandb();

    void setWandb(const std::shared_ptr<CreateFineTuningJobRequest_integrations_inner_wandb>& value);


protected:
    std::shared_ptr<CreateFineTuningJobRequest_integrations_inner_type> m_Type;
    bool m_TypeIsSet;
    std::shared_ptr<CreateFineTuningJobRequest_integrations_inner_wandb> m_Wandb;
    bool m_WandbIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CreateFineTuningJobRequest_integrations_inner_H_ */
