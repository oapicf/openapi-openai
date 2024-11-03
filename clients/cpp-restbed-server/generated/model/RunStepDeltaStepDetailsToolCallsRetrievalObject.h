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
 * RunStepDeltaStepDetailsToolCallsRetrievalObject.h
 *
 * 
 */

#ifndef RunStepDeltaStepDetailsToolCallsRetrievalObject_H_
#define RunStepDeltaStepDetailsToolCallsRetrievalObject_H_



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
class  RunStepDeltaStepDetailsToolCallsRetrievalObject 
{
public:
    RunStepDeltaStepDetailsToolCallsRetrievalObject() = default;
    explicit RunStepDeltaStepDetailsToolCallsRetrievalObject(boost::property_tree::ptree const& pt);
    virtual ~RunStepDeltaStepDetailsToolCallsRetrievalObject() = default;

    RunStepDeltaStepDetailsToolCallsRetrievalObject(const RunStepDeltaStepDetailsToolCallsRetrievalObject& other) = default; // copy constructor
    RunStepDeltaStepDetailsToolCallsRetrievalObject(RunStepDeltaStepDetailsToolCallsRetrievalObject&& other) noexcept = default; // move constructor

    RunStepDeltaStepDetailsToolCallsRetrievalObject& operator=(const RunStepDeltaStepDetailsToolCallsRetrievalObject& other) = default; // copy assignment
    RunStepDeltaStepDetailsToolCallsRetrievalObject& operator=(RunStepDeltaStepDetailsToolCallsRetrievalObject&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// RunStepDeltaStepDetailsToolCallsRetrievalObject members

    /// <summary>
    /// The index of the tool call in the tool calls array.
    /// </summary>
    int32_t getIndex() const;
    void setIndex(int32_t value);

    /// <summary>
    /// The ID of the tool call object.
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// The type of tool call. This is always going to be &#x60;retrieval&#x60; for this type of tool call.
    /// </summary>
    std::string getType() const;
    void setType(std::string value);

    /// <summary>
    /// For now, this is always going to be an empty object.
    /// </summary>
    std::string getRetrieval() const;
    void setRetrieval(std::string value);

protected:
    int32_t m_Index = 0;
    std::string m_Id = "";
    std::string m_Type = "";
    std::string m_Retrieval = std::string{};
};

std::vector<RunStepDeltaStepDetailsToolCallsRetrievalObject> createRunStepDeltaStepDetailsToolCallsRetrievalObjectVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<RunStepDeltaStepDetailsToolCallsRetrievalObject>(const RunStepDeltaStepDetailsToolCallsRetrievalObject& val) {
    return val.toPropertyTree();
}

template<>
inline RunStepDeltaStepDetailsToolCallsRetrievalObject fromPt<RunStepDeltaStepDetailsToolCallsRetrievalObject>(const boost::property_tree::ptree& pt) {
    RunStepDeltaStepDetailsToolCallsRetrievalObject ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* RunStepDeltaStepDetailsToolCallsRetrievalObject_H_ */
