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



#include "CppRestOpenAPIClient/model/CreateFineTuningJobRequest_hyperparameters_batch_size.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


void CreateFineTuningJobRequest_hyperparameters_batch_size::validate()
{
    // TODO: implement validation
}

const CreateFineTuningJobRequest_hyperparameters_batch_size::VariantType& CreateFineTuningJobRequest_hyperparameters_batch_size::getVariant() const
{
    return m_variantValue;
}

void CreateFineTuningJobRequest_hyperparameters_batch_size::setVariant(CreateFineTuningJobRequest_hyperparameters_batch_size::VariantType value)
{
    m_variantValue = value;
}

web::json::value CreateFineTuningJobRequest_hyperparameters_batch_size::toJson() const
{
    web::json::value val = web::json::value::object();

    std::visit([&](auto&& arg) {
        using T = std::decay_t<decltype(arg)>;
        if constexpr (std::is_same_v<T, std::monostate>) {
            val = web::json::value::null();
        } else {
            val = arg.toJson();
        }
    }, m_variantValue);

    return val;
}

void CreateFineTuningJobRequest_hyperparameters_batch_size::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    std::visit([&](auto&& arg) {
        using T = std::decay_t<decltype(arg)>;
        if constexpr (!std::is_same_v<T, std::monostate>) {
          arg.toMultipart(multipart, prefix);
        }
    }, m_variantValue);
}

template bool CreateFineTuningJobRequest_hyperparameters_batch_size::fromJson<int32_t>(const web::json::value& json);
template bool CreateFineTuningJobRequest_hyperparameters_batch_size::fromMultiPart<int32_t>(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix);
template bool CreateFineTuningJobRequest_hyperparameters_batch_size::fromJson<utility::string_t>(const web::json::value& json);
template bool CreateFineTuningJobRequest_hyperparameters_batch_size::fromMultiPart<utility::string_t>(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix);


}
}
}
}


