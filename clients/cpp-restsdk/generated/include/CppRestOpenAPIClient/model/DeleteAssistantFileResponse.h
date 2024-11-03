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
 * DeleteAssistantFileResponse.h
 *
 * Deletes the association between the assistant and the file, but does not delete the [File](/docs/api-reference/files) object itself.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_DeleteAssistantFileResponse_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_DeleteAssistantFileResponse_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// Deletes the association between the assistant and the file, but does not delete the [File](/docs/api-reference/files) object itself.
/// </summary>
class  DeleteAssistantFileResponse
    : public ModelBase
{
public:
    DeleteAssistantFileResponse();
    virtual ~DeleteAssistantFileResponse();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// DeleteAssistantFileResponse members

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    bool isDeleted() const;
    bool deletedIsSet() const;
    void unsetDeleted();

    void setDeleted(bool value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getObject() const;
    bool objectIsSet() const;
    void unsetobject();

    void setObject(const utility::string_t& value);


protected:
    utility::string_t m_Id;
    bool m_IdIsSet;
    bool m_Deleted;
    bool m_DeletedIsSet;
    utility::string_t m_object;
    bool m_objectIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_DeleteAssistantFileResponse_H_ */
