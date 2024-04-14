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
 * ErrorResponse.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ErrorResponse_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ErrorResponse_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/Error.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class Error;

/// <summary>
/// 
/// </summary>
class  ErrorResponse
    : public ModelBase
{
public:
    ErrorResponse();
    virtual ~ErrorResponse();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ErrorResponse members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Error> getError() const;
    bool errorIsSet() const;
    void unsetError();

    void setError(const std::shared_ptr<Error>& value);


protected:
    std::shared_ptr<Error> m_Error;
    bool m_ErrorIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ErrorResponse_H_ */
