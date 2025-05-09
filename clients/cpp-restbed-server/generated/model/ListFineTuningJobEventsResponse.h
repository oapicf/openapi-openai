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
 * ListFineTuningJobEventsResponse.h
 *
 * 
 */

#ifndef ListFineTuningJobEventsResponse_H_
#define ListFineTuningJobEventsResponse_H_



#include "FineTuningJobEvent.h"
#include <string>
#include <vector>
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
class  ListFineTuningJobEventsResponse 
{
public:
    ListFineTuningJobEventsResponse() = default;
    explicit ListFineTuningJobEventsResponse(boost::property_tree::ptree const& pt);
    virtual ~ListFineTuningJobEventsResponse() = default;

    ListFineTuningJobEventsResponse(const ListFineTuningJobEventsResponse& other) = default; // copy constructor
    ListFineTuningJobEventsResponse(ListFineTuningJobEventsResponse&& other) noexcept = default; // move constructor

    ListFineTuningJobEventsResponse& operator=(const ListFineTuningJobEventsResponse& other) = default; // copy assignment
    ListFineTuningJobEventsResponse& operator=(ListFineTuningJobEventsResponse&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// ListFineTuningJobEventsResponse members

    /// <summary>
    /// 
    /// </summary>
    std::vector<FineTuningJobEvent> getData() const;
    void setData(std::vector<FineTuningJobEvent> value);

    /// <summary>
    /// 
    /// </summary>
    std::string getObject() const;
    void setObject(std::string value);

protected:
    std::vector<FineTuningJobEvent> m_Data;
    std::string m_object = "";
};

std::vector<ListFineTuningJobEventsResponse> createListFineTuningJobEventsResponseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ListFineTuningJobEventsResponse>(const ListFineTuningJobEventsResponse& val) {
    return val.toPropertyTree();
}

template<>
inline ListFineTuningJobEventsResponse fromPt<ListFineTuningJobEventsResponse>(const boost::property_tree::ptree& pt) {
    ListFineTuningJobEventsResponse ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ListFineTuningJobEventsResponse_H_ */
