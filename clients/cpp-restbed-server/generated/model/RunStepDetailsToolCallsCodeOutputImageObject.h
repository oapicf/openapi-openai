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
 * RunStepDetailsToolCallsCodeOutputImageObject.h
 *
 * 
 */

#ifndef RunStepDetailsToolCallsCodeOutputImageObject_H_
#define RunStepDetailsToolCallsCodeOutputImageObject_H_



#include "RunStepDetailsToolCallsCodeOutputImageObject_image.h"
#include <string>
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  RunStepDetailsToolCallsCodeOutputImageObject 
{
public:
    RunStepDetailsToolCallsCodeOutputImageObject() = default;
    explicit RunStepDetailsToolCallsCodeOutputImageObject(boost::property_tree::ptree const& pt);
    virtual ~RunStepDetailsToolCallsCodeOutputImageObject() = default;

    RunStepDetailsToolCallsCodeOutputImageObject(const RunStepDetailsToolCallsCodeOutputImageObject& other) = default; // copy constructor
    RunStepDetailsToolCallsCodeOutputImageObject(RunStepDetailsToolCallsCodeOutputImageObject&& other) noexcept = default; // move constructor

    RunStepDetailsToolCallsCodeOutputImageObject& operator=(const RunStepDetailsToolCallsCodeOutputImageObject& other) = default; // copy assignment
    RunStepDetailsToolCallsCodeOutputImageObject& operator=(RunStepDetailsToolCallsCodeOutputImageObject&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// RunStepDetailsToolCallsCodeOutputImageObject members

    /// <summary>
    /// Always &#x60;image&#x60;.
    /// </summary>
    std::string getType() const;
    void setType(std::string value);

    /// <summary>
    /// 
    /// </summary>
    RunStepDetailsToolCallsCodeOutputImageObject_image getImage() const;
    void setImage(RunStepDetailsToolCallsCodeOutputImageObject_image value);

protected:
    std::string m_Type = "";
    RunStepDetailsToolCallsCodeOutputImageObject_image m_Image;
};

std::vector<RunStepDetailsToolCallsCodeOutputImageObject> createRunStepDetailsToolCallsCodeOutputImageObjectVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<RunStepDetailsToolCallsCodeOutputImageObject>(const RunStepDetailsToolCallsCodeOutputImageObject& val) {
    return val.toPropertyTree();
}

template<>
inline RunStepDetailsToolCallsCodeOutputImageObject fromPt<RunStepDetailsToolCallsCodeOutputImageObject>(const boost::property_tree::ptree& pt) {
    RunStepDetailsToolCallsCodeOutputImageObject ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* RunStepDetailsToolCallsCodeOutputImageObject_H_ */
