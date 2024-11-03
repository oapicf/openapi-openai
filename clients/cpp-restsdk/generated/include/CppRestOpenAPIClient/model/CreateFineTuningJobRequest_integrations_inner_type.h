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
 * CreateFineTuningJobRequest_integrations_inner_type.h
 *
 * The type of integration to enable. Currently, only \&quot;wandb\&quot; (Weights and Biases) is supported. 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CreateFineTuningJobRequest_integrations_inner_type_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CreateFineTuningJobRequest_integrations_inner_type_H_

#include <variant>

#include "CppRestOpenAPIClient/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {



class  CreateFineTuningJobRequest_integrations_inner_type
{
public:
    CreateFineTuningJobRequest_integrations_inner_type() = default;
    ~CreateFineTuningJobRequest_integrations_inner_type() = default;

    /////////////////////////////////////////////

    void validate();

    web::json::value toJson() const;

    template<typename Target>
    bool fromJson(const web::json::value& json) {
        // convert json to Target type
        Target target;
        if (!target.fromJson(json)) {
            return false;
        }

        m_variantValue = target;
        return true;
    }

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const;

    template<typename Target>
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) {
        // convert multipart to Target type
        Target target;
        if (!target.fromMultiPart(multipart, namePrefix)) {
            return false;
        }

        m_variantValue = target;
        return true;
    }

    /////////////////////////////////////////////
    /// CreateFineTuningJobRequest_integrations_inner_type members

    using VariantType = std::variant<utility::string_t>;

    const VariantType& getVariant() const;
    void setVariant(VariantType value);

protected:
    VariantType m_variantValue;
};



}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CreateFineTuningJobRequest_integrations_inner_type_H_ */
