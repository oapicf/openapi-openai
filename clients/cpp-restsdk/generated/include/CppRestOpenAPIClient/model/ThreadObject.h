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
 * ThreadObject.h
 *
 * Represents a thread that contains [messages](/docs/api-reference/messages).
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ThreadObject_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ThreadObject_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include "CppRestOpenAPIClient/Object.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// Represents a thread that contains [messages](/docs/api-reference/messages).
/// </summary>
class  ThreadObject
    : public ModelBase
{
public:
    ThreadObject();
    virtual ~ThreadObject();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ThreadObject members

    /// <summary>
    /// The identifier, which can be referenced in API endpoints.
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// The object type, which is always &#x60;thread&#x60;.
    /// </summary>
    utility::string_t getObject() const;
    bool objectIsSet() const;
    void unsetobject();

    void setObject(const utility::string_t& value);

    /// <summary>
    /// The Unix timestamp (in seconds) for when the thread was created.
    /// </summary>
    int32_t getCreatedAt() const;
    bool createdAtIsSet() const;
    void unsetCreated_at();

    void setCreatedAt(int32_t value);

    /// <summary>
    /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
    /// </summary>
    std::shared_ptr<Object> getMetadata() const;
    bool metadataIsSet() const;
    void unsetMetadata();

    void setMetadata(const std::shared_ptr<Object>& value);


protected:
    utility::string_t m_Id;
    bool m_IdIsSet;
    utility::string_t m_object;
    bool m_objectIsSet;
    int32_t m_Created_at;
    bool m_Created_atIsSet;
    std::shared_ptr<Object> m_Metadata;
    bool m_MetadataIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ThreadObject_H_ */
