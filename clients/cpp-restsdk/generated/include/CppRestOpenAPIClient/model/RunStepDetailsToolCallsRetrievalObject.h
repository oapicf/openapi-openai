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
 * RunStepDetailsToolCallsRetrievalObject.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_RunStepDetailsToolCallsRetrievalObject_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_RunStepDetailsToolCallsRetrievalObject_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include "CppRestOpenAPIClient/Object.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  RunStepDetailsToolCallsRetrievalObject
    : public ModelBase
{
public:
    RunStepDetailsToolCallsRetrievalObject();
    virtual ~RunStepDetailsToolCallsRetrievalObject();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// RunStepDetailsToolCallsRetrievalObject members

    /// <summary>
    /// The ID of the tool call object.
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// The type of tool call. This is always going to be &#x60;retrieval&#x60; for this type of tool call.
    /// </summary>
    utility::string_t getType() const;
    bool typeIsSet() const;
    void unsetType();

    void setType(const utility::string_t& value);

    /// <summary>
    /// For now, this is always going to be an empty object.
    /// </summary>
    std::shared_ptr<Object> getRetrieval() const;
    bool retrievalIsSet() const;
    void unsetRetrieval();

    void setRetrieval(const std::shared_ptr<Object>& value);


protected:
    utility::string_t m_Id;
    bool m_IdIsSet;
    utility::string_t m_Type;
    bool m_TypeIsSet;
    std::shared_ptr<Object> m_Retrieval;
    bool m_RetrievalIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_RunStepDetailsToolCallsRetrievalObject_H_ */