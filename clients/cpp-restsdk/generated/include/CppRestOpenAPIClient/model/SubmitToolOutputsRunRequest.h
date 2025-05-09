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
 * SubmitToolOutputsRunRequest.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_SubmitToolOutputsRunRequest_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_SubmitToolOutputsRunRequest_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/SubmitToolOutputsRunRequest_tool_outputs_inner.h"
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class SubmitToolOutputsRunRequest_tool_outputs_inner;


/// <summary>
/// 
/// </summary>
class  SubmitToolOutputsRunRequest
    : public ModelBase
{
public:
    SubmitToolOutputsRunRequest();
    virtual ~SubmitToolOutputsRunRequest();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// SubmitToolOutputsRunRequest members

    /// <summary>
    /// A list of tools for which the outputs are being submitted.
    /// </summary>
    std::vector<std::shared_ptr<SubmitToolOutputsRunRequest_tool_outputs_inner>>& getToolOutputs();
    bool toolOutputsIsSet() const;
    void unsetTool_outputs();

    void setToolOutputs(const std::vector<std::shared_ptr<SubmitToolOutputsRunRequest_tool_outputs_inner>>& value);

    /// <summary>
    /// If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message. 
    /// </summary>
    bool isStream() const;
    bool streamIsSet() const;
    void unsetStream();

    void setStream(bool value);


protected:
    std::vector<std::shared_ptr<SubmitToolOutputsRunRequest_tool_outputs_inner>> m_Tool_outputs;
    bool m_Tool_outputsIsSet;
    bool m_Stream;
    bool m_StreamIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_SubmitToolOutputsRunRequest_H_ */
