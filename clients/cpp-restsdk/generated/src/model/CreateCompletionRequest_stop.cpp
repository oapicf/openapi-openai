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



#include "CppRestOpenAPIClient/model/CreateCompletionRequest_stop.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


void CreateCompletionRequest_stop::validate()
{
    // TODO: implement validation
}

const CreateCompletionRequest_stop::VariantType& CreateCompletionRequest_stop::getVariant() const
{
    return m_variantValue;
}

void CreateCompletionRequest_stop::setVariant(CreateCompletionRequest_stop::VariantType value)
{
    m_variantValue = value;
}

web::json::value CreateCompletionRequest_stop::toJson() const
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

void CreateCompletionRequest_stop::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    std::visit([&](auto&& arg) {
        using T = std::decay_t<decltype(arg)>;
        if constexpr (!std::is_same_v<T, std::monostate>) {
          arg.toMultipart(multipart, prefix);
        }
    }, m_variantValue);
}

template bool CreateCompletionRequest_stop::fromJson<std::vector&lt;utility::string_t&gt;>(const web::json::value& json);
template bool CreateCompletionRequest_stop::fromMultiPart<std::vector&lt;utility::string_t&gt;>(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix);
template bool CreateCompletionRequest_stop::fromJson<utility::string_t>(const web::json::value& json);
template bool CreateCompletionRequest_stop::fromMultiPart<utility::string_t>(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix);


}
}
}
}


