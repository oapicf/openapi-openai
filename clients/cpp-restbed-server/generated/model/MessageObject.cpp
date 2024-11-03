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



#include "MessageObject.h"

#include <string>
#include <vector>
#include <map>
#include <sstream>
#include <stdexcept>
#include <regex>
#include <algorithm>
#include <boost/lexical_cast.hpp>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>
#include "helpers.h"

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

MessageObject::MessageObject(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string MessageObject::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void MessageObject::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree MessageObject::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("id", m_Id);
	pt.put("object", m_object);
	pt.put("created_at", m_Created_at);
	pt.put("thread_id", m_Thread_id);
	pt.put("status", m_Status);
	pt.add_child("incomplete_details", m_Incomplete_details.toPropertyTree());
	pt.put("completed_at", m_Completed_at);
	pt.put("incomplete_at", m_Incomplete_at);
	pt.put("role", m_Role);
	// generate tree for Content
    tmp_node.clear();
	if (!m_Content.empty()) {
        tmp_node = toPt(m_Content);
		pt.add_child("content", tmp_node);
		tmp_node.clear();
	}
	pt.put("assistant_id", m_Assistant_id);
	pt.put("run_id", m_Run_id);
	// generate tree for File_ids
    tmp_node.clear();
	if (!m_File_ids.empty()) {
        tmp_node = toPt(m_File_ids);
		pt.add_child("file_ids", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void MessageObject::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Id = pt.get("id", "");
	setObject(pt.get("object", ""));
	m_Created_at = pt.get("created_at", 0);
	m_Thread_id = pt.get("thread_id", "");
	setStatus(pt.get("status", ""));
	if (pt.get_child_optional("incomplete_details")) {
        m_Incomplete_details = fromPt<MessageObject_incomplete_details>(pt.get_child("incomplete_details"));
	}
	m_Completed_at = pt.get("completed_at", 0);
	m_Incomplete_at = pt.get("incomplete_at", 0);
	setRole(pt.get("role", ""));
	// push all items of Content into member
	if (pt.get_child_optional("content")) {
        m_Content = fromPt<std::vector<MessageObject_content_inner>>(pt.get_child("content"));
	}
	m_Assistant_id = pt.get("assistant_id", "");
	m_Run_id = pt.get("run_id", "");
	// push all items of File_ids into member
	if (pt.get_child_optional("file_ids")) {
        m_File_ids = fromPt<std::vector<std::string>>(pt.get_child("file_ids"));
	}
}

std::string MessageObject::getId() const
{
    return m_Id;
}

void MessageObject::setId(std::string value)
{
    m_Id = value;
}


std::string MessageObject::getObject() const
{
    return m_object;
}

void MessageObject::setObject(std::string value)
{
    static const std::array<std::string, 1> allowedValues = {
        "thread.message"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_object = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}


int32_t MessageObject::getCreatedAt() const
{
    return m_Created_at;
}

void MessageObject::setCreatedAt(int32_t value)
{
    m_Created_at = value;
}


std::string MessageObject::getThreadId() const
{
    return m_Thread_id;
}

void MessageObject::setThreadId(std::string value)
{
    m_Thread_id = value;
}


std::string MessageObject::getStatus() const
{
    return m_Status;
}

void MessageObject::setStatus(std::string value)
{
    static const std::array<std::string, 3> allowedValues = {
        "in_progress", "incomplete", "completed"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_Status = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}


MessageObject_incomplete_details MessageObject::getIncompleteDetails() const
{
    return m_Incomplete_details;
}

void MessageObject::setIncompleteDetails(MessageObject_incomplete_details value)
{
    m_Incomplete_details = value;
}


int32_t MessageObject::getCompletedAt() const
{
    return m_Completed_at;
}

void MessageObject::setCompletedAt(int32_t value)
{
    m_Completed_at = value;
}


int32_t MessageObject::getIncompleteAt() const
{
    return m_Incomplete_at;
}

void MessageObject::setIncompleteAt(int32_t value)
{
    m_Incomplete_at = value;
}


std::string MessageObject::getRole() const
{
    return m_Role;
}

void MessageObject::setRole(std::string value)
{
    static const std::array<std::string, 2> allowedValues = {
        "user", "assistant"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_Role = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}


std::vector<MessageObject_content_inner> MessageObject::getContent() const
{
    return m_Content;
}

void MessageObject::setContent(std::vector<MessageObject_content_inner> value)
{
    m_Content = value;
}


std::string MessageObject::getAssistantId() const
{
    return m_Assistant_id;
}

void MessageObject::setAssistantId(std::string value)
{
    m_Assistant_id = value;
}


std::string MessageObject::getRunId() const
{
    return m_Run_id;
}

void MessageObject::setRunId(std::string value)
{
    m_Run_id = value;
}


std::vector<std::string> MessageObject::getFileIds() const
{
    return m_File_ids;
}

void MessageObject::setFileIds(std::vector<std::string> value)
{
    m_File_ids = value;
}


std::string MessageObject::getMetadata() const
{
    return m_Metadata;
}

void MessageObject::setMetadata(std::string value)
{
    m_Metadata = value;
}



std::vector<MessageObject> createMessageObjectVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<MessageObject>();
    for (const auto& child: pt) {
        vec.emplace_back(MessageObject(child.second));
    }

    return vec;
}

}
}
}
}

