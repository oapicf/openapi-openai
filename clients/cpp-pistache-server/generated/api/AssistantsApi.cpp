/**
* OpenAI API
* The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
*
* The version of the OpenAPI document: 2.0.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/

#include "AssistantsApi.h"
#include "Helpers.h"

namespace org::openapitools::server::api
{

using namespace org::openapitools::server::helpers;
using namespace org::openapitools::server::model;

const std::string AssistantsApi::base = "/v1";

AssistantsApi::AssistantsApi(const std::shared_ptr<Pistache::Rest::Router>& rtr)
    : ApiBase(rtr)
{
}

void AssistantsApi::init() {
    setupRoutes();
}

void AssistantsApi::setupRoutes() {
    using namespace Pistache::Rest;

    Routes::Post(*router, base + "/threads/:thread_id/runs/:run_id/cancel", Routes::bind(&AssistantsApi::cancel_run_handler, this));
    Routes::Post(*router, base + "/assistants", Routes::bind(&AssistantsApi::create_assistant_handler, this));
    Routes::Post(*router, base + "/assistants/:assistant_id/files", Routes::bind(&AssistantsApi::create_assistant_file_handler, this));
    Routes::Post(*router, base + "/threads/:thread_id/messages", Routes::bind(&AssistantsApi::create_message_handler, this));
    Routes::Post(*router, base + "/threads/:thread_id/runs", Routes::bind(&AssistantsApi::create_run_handler, this));
    Routes::Post(*router, base + "/threads", Routes::bind(&AssistantsApi::create_thread_handler, this));
    Routes::Post(*router, base + "/threads/runs", Routes::bind(&AssistantsApi::create_thread_and_run_handler, this));
    Routes::Delete(*router, base + "/assistants/:assistant_id", Routes::bind(&AssistantsApi::delete_assistant_handler, this));
    Routes::Delete(*router, base + "/assistants/:assistant_id/files/:file_id", Routes::bind(&AssistantsApi::delete_assistant_file_handler, this));
    Routes::Delete(*router, base + "/threads/:thread_id", Routes::bind(&AssistantsApi::delete_thread_handler, this));
    Routes::Get(*router, base + "/assistants/:assistant_id", Routes::bind(&AssistantsApi::get_assistant_handler, this));
    Routes::Get(*router, base + "/assistants/:assistant_id/files/:file_id", Routes::bind(&AssistantsApi::get_assistant_file_handler, this));
    Routes::Get(*router, base + "/threads/:thread_id/messages/:message_id", Routes::bind(&AssistantsApi::get_message_handler, this));
    Routes::Get(*router, base + "/threads/:thread_id/messages/:message_id/files/:file_id", Routes::bind(&AssistantsApi::get_message_file_handler, this));
    Routes::Get(*router, base + "/threads/:thread_id/runs/:run_id", Routes::bind(&AssistantsApi::get_run_handler, this));
    Routes::Get(*router, base + "/threads/:thread_id/runs/:run_id/steps/:step_id", Routes::bind(&AssistantsApi::get_run_step_handler, this));
    Routes::Get(*router, base + "/threads/:thread_id", Routes::bind(&AssistantsApi::get_thread_handler, this));
    Routes::Get(*router, base + "/assistants/:assistant_id/files", Routes::bind(&AssistantsApi::list_assistant_files_handler, this));
    Routes::Get(*router, base + "/assistants", Routes::bind(&AssistantsApi::list_assistants_handler, this));
    Routes::Get(*router, base + "/threads/:thread_id/messages/:message_id/files", Routes::bind(&AssistantsApi::list_message_files_handler, this));
    Routes::Get(*router, base + "/threads/:thread_id/messages", Routes::bind(&AssistantsApi::list_messages_handler, this));
    Routes::Get(*router, base + "/threads/:thread_id/runs/:run_id/steps", Routes::bind(&AssistantsApi::list_run_steps_handler, this));
    Routes::Get(*router, base + "/threads/:thread_id/runs", Routes::bind(&AssistantsApi::list_runs_handler, this));
    Routes::Post(*router, base + "/assistants/:assistant_id", Routes::bind(&AssistantsApi::modify_assistant_handler, this));
    Routes::Post(*router, base + "/threads/:thread_id/messages/:message_id", Routes::bind(&AssistantsApi::modify_message_handler, this));
    Routes::Post(*router, base + "/threads/:thread_id/runs/:run_id", Routes::bind(&AssistantsApi::modify_run_handler, this));
    Routes::Post(*router, base + "/threads/:thread_id", Routes::bind(&AssistantsApi::modify_thread_handler, this));
    Routes::Post(*router, base + "/threads/:thread_id/runs/:run_id/submit_tool_outputs", Routes::bind(&AssistantsApi::submit_tool_ouputs_to_run_handler, this));

    // Default handler, called when a route is not found
    router->addCustomHandler(Routes::bind(&AssistantsApi::assistants_api_default_handler, this));
}

void AssistantsApi::handleParsingException(const std::exception& ex, Pistache::Http::ResponseWriter &response) const noexcept
{
    std::pair<Pistache::Http::Code, std::string> codeAndError = handleParsingException(ex);
    response.send(codeAndError.first, codeAndError.second);
}

std::pair<Pistache::Http::Code, std::string> AssistantsApi::handleParsingException(const std::exception& ex) const noexcept
{
    try {
        throw;
    } catch (nlohmann::detail::exception &e) {
        return std::make_pair(Pistache::Http::Code::Bad_Request, e.what());
    } catch (org::openapitools::server::helpers::ValidationException &e) {
        return std::make_pair(Pistache::Http::Code::Bad_Request, e.what());
    } catch (std::exception &e) {
        return std::make_pair(Pistache::Http::Code::Internal_Server_Error, e.what());
    }
}

void AssistantsApi::handleOperationException(const std::exception& ex, Pistache::Http::ResponseWriter &response) const noexcept
{
    std::pair<Pistache::Http::Code, std::string> codeAndError = handleOperationException(ex);
    response.send(codeAndError.first, codeAndError.second);
}

std::pair<Pistache::Http::Code, std::string> AssistantsApi::handleOperationException(const std::exception& ex) const noexcept
{
    return std::make_pair(Pistache::Http::Code::Internal_Server_Error, ex.what());
}

void AssistantsApi::cancel_run_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto threadId = request.param(":threadId").as<std::string>();
    auto runId = request.param(":runId").as<std::string>();
    
    try {
        this->cancel_run(threadId, runId, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AssistantsApi::create_assistant_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {


    // Getting the body param
    
    CreateAssistantRequest createAssistantRequest;
    
    try {
        nlohmann::json::parse(request.body()).get_to(createAssistantRequest);
        createAssistantRequest.validate();
    } catch (std::exception &e) {
        this->handleParsingException(e, response);
        return;
    }

    try {
        this->create_assistant(createAssistantRequest, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AssistantsApi::create_assistant_file_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto assistantId = request.param(":assistantId").as<std::string>();
    
    // Getting the body param
    
    CreateAssistantFileRequest createAssistantFileRequest;
    
    try {
        nlohmann::json::parse(request.body()).get_to(createAssistantFileRequest);
        createAssistantFileRequest.validate();
    } catch (std::exception &e) {
        this->handleParsingException(e, response);
        return;
    }

    try {
        this->create_assistant_file(assistantId, createAssistantFileRequest, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AssistantsApi::create_message_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto threadId = request.param(":threadId").as<std::string>();
    
    // Getting the body param
    
    CreateMessageRequest createMessageRequest;
    
    try {
        nlohmann::json::parse(request.body()).get_to(createMessageRequest);
        createMessageRequest.validate();
    } catch (std::exception &e) {
        this->handleParsingException(e, response);
        return;
    }

    try {
        this->create_message(threadId, createMessageRequest, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AssistantsApi::create_run_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto threadId = request.param(":threadId").as<std::string>();
    
    // Getting the body param
    
    CreateRunRequest createRunRequest;
    
    try {
        nlohmann::json::parse(request.body()).get_to(createRunRequest);
        createRunRequest.validate();
    } catch (std::exception &e) {
        this->handleParsingException(e, response);
        return;
    }

    try {
        this->create_run(threadId, createRunRequest, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AssistantsApi::create_thread_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {


    // Getting the body param
    
    CreateThreadRequest createThreadRequest;
    
    try {
        nlohmann::json::parse(request.body()).get_to(createThreadRequest);
        createThreadRequest.validate();
    } catch (std::exception &e) {
        this->handleParsingException(e, response);
        return;
    }

    try {
        this->create_thread(createThreadRequest, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AssistantsApi::create_thread_and_run_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {


    // Getting the body param
    
    CreateThreadAndRunRequest createThreadAndRunRequest;
    
    try {
        nlohmann::json::parse(request.body()).get_to(createThreadAndRunRequest);
        createThreadAndRunRequest.validate();
    } catch (std::exception &e) {
        this->handleParsingException(e, response);
        return;
    }

    try {
        this->create_thread_and_run(createThreadAndRunRequest, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AssistantsApi::delete_assistant_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto assistantId = request.param(":assistantId").as<std::string>();
    
    try {
        this->delete_assistant(assistantId, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AssistantsApi::delete_assistant_file_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto assistantId = request.param(":assistantId").as<std::string>();
    auto fileId = request.param(":fileId").as<std::string>();
    
    try {
        this->delete_assistant_file(assistantId, fileId, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AssistantsApi::delete_thread_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto threadId = request.param(":threadId").as<std::string>();
    
    try {
        this->delete_thread(threadId, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AssistantsApi::get_assistant_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto assistantId = request.param(":assistantId").as<std::string>();
    
    try {
        this->get_assistant(assistantId, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AssistantsApi::get_assistant_file_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto assistantId = request.param(":assistantId").as<std::string>();
    auto fileId = request.param(":fileId").as<std::string>();
    
    try {
        this->get_assistant_file(assistantId, fileId, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AssistantsApi::get_message_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto threadId = request.param(":threadId").as<std::string>();
    auto messageId = request.param(":messageId").as<std::string>();
    
    try {
        this->get_message(threadId, messageId, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AssistantsApi::get_message_file_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto threadId = request.param(":threadId").as<std::string>();
    auto messageId = request.param(":messageId").as<std::string>();
    auto fileId = request.param(":fileId").as<std::string>();
    
    try {
        this->get_message_file(threadId, messageId, fileId, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AssistantsApi::get_run_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto threadId = request.param(":threadId").as<std::string>();
    auto runId = request.param(":runId").as<std::string>();
    
    try {
        this->get_run(threadId, runId, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AssistantsApi::get_run_step_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto threadId = request.param(":threadId").as<std::string>();
    auto runId = request.param(":runId").as<std::string>();
    auto stepId = request.param(":stepId").as<std::string>();
    
    try {
        this->get_run_step(threadId, runId, stepId, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AssistantsApi::get_thread_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto threadId = request.param(":threadId").as<std::string>();
    
    try {
        this->get_thread(threadId, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AssistantsApi::list_assistant_files_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto assistantId = request.param(":assistantId").as<std::string>();
    
    // Getting the query params
    auto limitQuery = request.query().get("limit");
    std::optional<int32_t> limit;
    if(limitQuery.has_value()){
        int32_t valueQuery_instance;
        if(fromStringValue(limitQuery.value(), valueQuery_instance)){
            limit = valueQuery_instance;
        }
    }
    auto orderQuery = request.query().get("order");
    std::optional<std::string> order;
    if(orderQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(orderQuery.value(), valueQuery_instance)){
            order = valueQuery_instance;
        }
    }
    auto afterQuery = request.query().get("after");
    std::optional<std::string> after;
    if(afterQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(afterQuery.value(), valueQuery_instance)){
            after = valueQuery_instance;
        }
    }
    auto beforeQuery = request.query().get("before");
    std::optional<std::string> before;
    if(beforeQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(beforeQuery.value(), valueQuery_instance)){
            before = valueQuery_instance;
        }
    }
    
    try {
        this->list_assistant_files(assistantId, limit, order, after, before, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AssistantsApi::list_assistants_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {


    // Getting the query params
    auto limitQuery = request.query().get("limit");
    std::optional<int32_t> limit;
    if(limitQuery.has_value()){
        int32_t valueQuery_instance;
        if(fromStringValue(limitQuery.value(), valueQuery_instance)){
            limit = valueQuery_instance;
        }
    }
    auto orderQuery = request.query().get("order");
    std::optional<std::string> order;
    if(orderQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(orderQuery.value(), valueQuery_instance)){
            order = valueQuery_instance;
        }
    }
    auto afterQuery = request.query().get("after");
    std::optional<std::string> after;
    if(afterQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(afterQuery.value(), valueQuery_instance)){
            after = valueQuery_instance;
        }
    }
    auto beforeQuery = request.query().get("before");
    std::optional<std::string> before;
    if(beforeQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(beforeQuery.value(), valueQuery_instance)){
            before = valueQuery_instance;
        }
    }
    
    try {
        this->list_assistants(limit, order, after, before, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AssistantsApi::list_message_files_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto threadId = request.param(":threadId").as<std::string>();
    auto messageId = request.param(":messageId").as<std::string>();
    
    // Getting the query params
    auto limitQuery = request.query().get("limit");
    std::optional<int32_t> limit;
    if(limitQuery.has_value()){
        int32_t valueQuery_instance;
        if(fromStringValue(limitQuery.value(), valueQuery_instance)){
            limit = valueQuery_instance;
        }
    }
    auto orderQuery = request.query().get("order");
    std::optional<std::string> order;
    if(orderQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(orderQuery.value(), valueQuery_instance)){
            order = valueQuery_instance;
        }
    }
    auto afterQuery = request.query().get("after");
    std::optional<std::string> after;
    if(afterQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(afterQuery.value(), valueQuery_instance)){
            after = valueQuery_instance;
        }
    }
    auto beforeQuery = request.query().get("before");
    std::optional<std::string> before;
    if(beforeQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(beforeQuery.value(), valueQuery_instance)){
            before = valueQuery_instance;
        }
    }
    
    try {
        this->list_message_files(threadId, messageId, limit, order, after, before, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AssistantsApi::list_messages_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto threadId = request.param(":threadId").as<std::string>();
    
    // Getting the query params
    auto limitQuery = request.query().get("limit");
    std::optional<int32_t> limit;
    if(limitQuery.has_value()){
        int32_t valueQuery_instance;
        if(fromStringValue(limitQuery.value(), valueQuery_instance)){
            limit = valueQuery_instance;
        }
    }
    auto orderQuery = request.query().get("order");
    std::optional<std::string> order;
    if(orderQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(orderQuery.value(), valueQuery_instance)){
            order = valueQuery_instance;
        }
    }
    auto afterQuery = request.query().get("after");
    std::optional<std::string> after;
    if(afterQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(afterQuery.value(), valueQuery_instance)){
            after = valueQuery_instance;
        }
    }
    auto beforeQuery = request.query().get("before");
    std::optional<std::string> before;
    if(beforeQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(beforeQuery.value(), valueQuery_instance)){
            before = valueQuery_instance;
        }
    }
    auto runIdQuery = request.query().get("run_id");
    std::optional<std::string> runId;
    if(runIdQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(runIdQuery.value(), valueQuery_instance)){
            runId = valueQuery_instance;
        }
    }
    
    try {
        this->list_messages(threadId, limit, order, after, before, runId, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AssistantsApi::list_run_steps_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto threadId = request.param(":threadId").as<std::string>();
    auto runId = request.param(":runId").as<std::string>();
    
    // Getting the query params
    auto limitQuery = request.query().get("limit");
    std::optional<int32_t> limit;
    if(limitQuery.has_value()){
        int32_t valueQuery_instance;
        if(fromStringValue(limitQuery.value(), valueQuery_instance)){
            limit = valueQuery_instance;
        }
    }
    auto orderQuery = request.query().get("order");
    std::optional<std::string> order;
    if(orderQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(orderQuery.value(), valueQuery_instance)){
            order = valueQuery_instance;
        }
    }
    auto afterQuery = request.query().get("after");
    std::optional<std::string> after;
    if(afterQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(afterQuery.value(), valueQuery_instance)){
            after = valueQuery_instance;
        }
    }
    auto beforeQuery = request.query().get("before");
    std::optional<std::string> before;
    if(beforeQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(beforeQuery.value(), valueQuery_instance)){
            before = valueQuery_instance;
        }
    }
    
    try {
        this->list_run_steps(threadId, runId, limit, order, after, before, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AssistantsApi::list_runs_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto threadId = request.param(":threadId").as<std::string>();
    
    // Getting the query params
    auto limitQuery = request.query().get("limit");
    std::optional<int32_t> limit;
    if(limitQuery.has_value()){
        int32_t valueQuery_instance;
        if(fromStringValue(limitQuery.value(), valueQuery_instance)){
            limit = valueQuery_instance;
        }
    }
    auto orderQuery = request.query().get("order");
    std::optional<std::string> order;
    if(orderQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(orderQuery.value(), valueQuery_instance)){
            order = valueQuery_instance;
        }
    }
    auto afterQuery = request.query().get("after");
    std::optional<std::string> after;
    if(afterQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(afterQuery.value(), valueQuery_instance)){
            after = valueQuery_instance;
        }
    }
    auto beforeQuery = request.query().get("before");
    std::optional<std::string> before;
    if(beforeQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(beforeQuery.value(), valueQuery_instance)){
            before = valueQuery_instance;
        }
    }
    
    try {
        this->list_runs(threadId, limit, order, after, before, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AssistantsApi::modify_assistant_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto assistantId = request.param(":assistantId").as<std::string>();
    
    // Getting the body param
    
    ModifyAssistantRequest modifyAssistantRequest;
    
    try {
        nlohmann::json::parse(request.body()).get_to(modifyAssistantRequest);
        modifyAssistantRequest.validate();
    } catch (std::exception &e) {
        this->handleParsingException(e, response);
        return;
    }

    try {
        this->modify_assistant(assistantId, modifyAssistantRequest, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AssistantsApi::modify_message_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto threadId = request.param(":threadId").as<std::string>();
    auto messageId = request.param(":messageId").as<std::string>();
    
    // Getting the body param
    
    ModifyMessageRequest modifyMessageRequest;
    
    try {
        nlohmann::json::parse(request.body()).get_to(modifyMessageRequest);
        modifyMessageRequest.validate();
    } catch (std::exception &e) {
        this->handleParsingException(e, response);
        return;
    }

    try {
        this->modify_message(threadId, messageId, modifyMessageRequest, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AssistantsApi::modify_run_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto threadId = request.param(":threadId").as<std::string>();
    auto runId = request.param(":runId").as<std::string>();
    
    // Getting the body param
    
    ModifyRunRequest modifyRunRequest;
    
    try {
        nlohmann::json::parse(request.body()).get_to(modifyRunRequest);
        modifyRunRequest.validate();
    } catch (std::exception &e) {
        this->handleParsingException(e, response);
        return;
    }

    try {
        this->modify_run(threadId, runId, modifyRunRequest, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AssistantsApi::modify_thread_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto threadId = request.param(":threadId").as<std::string>();
    
    // Getting the body param
    
    ModifyThreadRequest modifyThreadRequest;
    
    try {
        nlohmann::json::parse(request.body()).get_to(modifyThreadRequest);
        modifyThreadRequest.validate();
    } catch (std::exception &e) {
        this->handleParsingException(e, response);
        return;
    }

    try {
        this->modify_thread(threadId, modifyThreadRequest, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AssistantsApi::submit_tool_ouputs_to_run_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto threadId = request.param(":threadId").as<std::string>();
    auto runId = request.param(":runId").as<std::string>();
    
    // Getting the body param
    
    SubmitToolOutputsRunRequest submitToolOutputsRunRequest;
    
    try {
        nlohmann::json::parse(request.body()).get_to(submitToolOutputsRunRequest);
        submitToolOutputsRunRequest.validate();
    } catch (std::exception &e) {
        this->handleParsingException(e, response);
        return;
    }

    try {
        this->submit_tool_ouputs_to_run(threadId, runId, submitToolOutputsRunRequest, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}

void AssistantsApi::assistants_api_default_handler(const Pistache::Rest::Request &, Pistache::Http::ResponseWriter response) {
    response.send(Pistache::Http::Code::Not_Found, "The requested method does not exist");
}

} // namespace org::openapitools::server::api

