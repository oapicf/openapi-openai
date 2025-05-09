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
 * RunStepDeltaStepDetailsToolCallsCodeObject.h
 *
 * Details of the Code Interpreter tool call the run step was involved in.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_RunStepDeltaStepDetailsToolCallsCodeObject_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_RunStepDeltaStepDetailsToolCallsCodeObject_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter.h"
#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter;


/// <summary>
/// Details of the Code Interpreter tool call the run step was involved in.
/// </summary>
class  RunStepDeltaStepDetailsToolCallsCodeObject
    : public ModelBase
{
public:
    RunStepDeltaStepDetailsToolCallsCodeObject();
    virtual ~RunStepDeltaStepDetailsToolCallsCodeObject();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// RunStepDeltaStepDetailsToolCallsCodeObject members

    /// <summary>
    /// The index of the tool call in the tool calls array.
    /// </summary>
    int32_t getIndex() const;
    bool indexIsSet() const;
    void unsetIndex();

    void setIndex(int32_t value);

    /// <summary>
    /// The ID of the tool call.
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call.
    /// </summary>
    utility::string_t getType() const;
    bool typeIsSet() const;
    void unsetType();

    void setType(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter> getCodeInterpreter() const;
    bool codeInterpreterIsSet() const;
    void unsetCode_interpreter();

    void setCodeInterpreter(const std::shared_ptr<RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter>& value);


protected:
    int32_t m_Index;
    bool m_IndexIsSet;
    utility::string_t m_Id;
    bool m_IdIsSet;
    utility::string_t m_Type;
    bool m_TypeIsSet;
    std::shared_ptr<RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter> m_Code_interpreter;
    bool m_Code_interpreterIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_RunStepDeltaStepDetailsToolCallsCodeObject_H_ */
