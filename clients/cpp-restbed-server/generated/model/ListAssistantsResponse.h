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
 * ListAssistantsResponse.h
 *
 * 
 */

#ifndef ListAssistantsResponse_H_
#define ListAssistantsResponse_H_



#include <string>
#include "AssistantObject.h"
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ListAssistantsResponse 
{
public:
    ListAssistantsResponse() = default;
    explicit ListAssistantsResponse(boost::property_tree::ptree const& pt);
    virtual ~ListAssistantsResponse() = default;

    ListAssistantsResponse(const ListAssistantsResponse& other) = default; // copy constructor
    ListAssistantsResponse(ListAssistantsResponse&& other) noexcept = default; // move constructor

    ListAssistantsResponse& operator=(const ListAssistantsResponse& other) = default; // copy assignment
    ListAssistantsResponse& operator=(ListAssistantsResponse&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// ListAssistantsResponse members

    /// <summary>
    /// 
    /// </summary>
    std::string getObject() const;
    void setObject(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::vector<AssistantObject> getData() const;
    void setData(std::vector<AssistantObject> value);

    /// <summary>
    /// 
    /// </summary>
    std::string getFirstId() const;
    void setFirstId(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getLastId() const;
    void setLastId(std::string value);

    /// <summary>
    /// 
    /// </summary>
    bool isHasMore() const;
    void setHasMore(bool value);

protected:
    std::string m_object = "";
    std::vector<AssistantObject> m_Data;
    std::string m_First_id = "";
    std::string m_Last_id = "";
    bool m_Has_more = false;
};

std::vector<ListAssistantsResponse> createListAssistantsResponseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ListAssistantsResponse>(const ListAssistantsResponse& val) {
    return val.toPropertyTree();
}

template<>
inline ListAssistantsResponse fromPt<ListAssistantsResponse>(const boost::property_tree::ptree& pt) {
    ListAssistantsResponse ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ListAssistantsResponse_H_ */
