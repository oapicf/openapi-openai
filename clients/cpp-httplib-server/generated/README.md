# cpp-httplib-server - C++ Server

## Overview

This server was generated using the [OpenAPI Generator](https://openapi-generator.tech) project.
It uses the [cpp-httplib](https://github.com/yhirose/cpp-httplib) library to implement a lightweight HTTP server
with JSON request/response handling via [nlohmann/json](https://github.com/nlohmann/json).

## Requirements

- C++17 compatible compiler
- CMake (3.14 or higher)
- OpenSSL (for HTTPS support)
- ZLIB (for compression support)

**Note:** The following libraries are automatically downloaded via CMake FetchContent:
- [cpp-httplib](https://github.com/yhirose/cpp-httplib) v0.15.3
- [nlohmann/json](https://github.com/nlohmann/json) v3.11.3

### Platform-Specific Installation

**Linux (Ubuntu/Debian):**
```bash
sudo apt-get update
sudo apt-get install -y libssl-dev zlib1g-dev cmake build-essential
```

**macOS:**
```bash
brew install openssl zlib cmake
```

**Windows:**
```powershell
# Using vcpkg
vcpkg install openssl:x64-windows zlib:x64-windows

# Then configure CMake with vcpkg toolchain:
cmake -B build -DCMAKE_TOOLCHAIN_FILE=[vcpkg_root]/scripts/buildsystems/vcpkg.cmake
```

## Project Structure

```
├── CMakeLists.txt          # Project build configuration
├── README.md               # This file
├── models/                  # Generated model classes
└── api/                    # Generated API handler classes
```

## Building the Project

```bash
mkdir build
cd build
cmake ..
make
```

## Working with Models

### Model Classes

#### models::AdminApiKey

```cpp
// Create a model
auto model = models::AdminApiKey();
model.setObject(/* value */);  // Set object
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setRedactedValue(/* value */);  // Set redacted_value
model.setValue(/* value */);  // Set value
model.setCreatedAt(/* value */);  // Set created_at
model.setOwner(/* value */);  // Set owner

// Serialize to JSON
nlohmann::json json = models::AdminApiKey::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdminApiKey::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdminApiKeyOwner

```cpp
// Create a model
auto model = models::AdminApiKeyOwner();
model.setType(/* value */);  // Set type
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setCreatedAt(/* value */);  // Set created_at
model.setRole(/* value */);  // Set role

// Serialize to JSON
nlohmann::json json = models::AdminApiKeyOwner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdminApiKeyOwner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdminApiKeysCreateRequest

```cpp
// Create a model
auto model = models::AdminApiKeysCreateRequest();
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::AdminApiKeysCreateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdminApiKeysCreateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AdminApiKeysDelete200Response

```cpp
// Create a model
auto model = models::AdminApiKeysDelete200Response();
model.setId(/* value */);  // Set id
model.setObject(/* value */);  // Set object
model.setDeleted(/* value */);  // Set deleted

// Serialize to JSON
nlohmann::json json = models::AdminApiKeysDelete200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AdminApiKeysDelete200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ApiKeyList

```cpp
// Create a model
auto model = models::ApiKeyList();
model.setObject(/* value */);  // Set object
model.setData(/* value */);  // Set data
model.setHasMore(/* value */);  // Set has_more
model.setFirstId(/* value */);  // Set first_id
model.setLastId(/* value */);  // Set last_id

// Serialize to JSON
nlohmann::json json = models::ApiKeyList::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ApiKeyList::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ArrayOfContentPartsInner

```cpp
// Create a model
auto model = models::ArrayOfContentPartsInner();
model.setType(/* value */);  // Set type
model.setImageFile(/* value */);  // Set image_file
model.setImageUrl(/* value */);  // Set image_url
model.setText(/* value */);  // Set text

// Serialize to JSON
nlohmann::json json = models::ArrayOfContentPartsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ArrayOfContentPartsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Assistant

```cpp
// Create a model
auto model = models::Assistant();
model.setId(/* value */);  // Set id
model.setObject(/* value */);  // Set object
model.setCreatedAt(/* value */);  // Set created_at
model.setName(/* value */);  // Set name
model.setDescription(/* value */);  // Set description
model.setModel(/* value */);  // Set model
model.setInstructions(/* value */);  // Set instructions
model.setTools(/* value */);  // Set tools
model.setToolResources(/* value */);  // Set tool_resources
model.setMetadata(/* value */);  // Set metadata
model.setTemperature(/* value */);  // Set temperature
model.setTopP(/* value */);  // Set top_p
model.setResponseFormat(/* value */);  // Set response_format

// Serialize to JSON
nlohmann::json json = models::Assistant::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Assistant::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AssistantObjectToolResources

```cpp
// Create a model
auto model = models::AssistantObjectToolResources();
model.setCodeInterpreter(/* value */);  // Set code_interpreter
model.setFileSearch(/* value */);  // Set file_search

// Serialize to JSON
nlohmann::json json = models::AssistantObjectToolResources::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AssistantObjectToolResources::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AssistantObjectToolResourcesCodeInterpreter

```cpp
// Create a model
auto model = models::AssistantObjectToolResourcesCodeInterpreter();
model.setFileIds(/* value */);  // Set file_ids

// Serialize to JSON
nlohmann::json json = models::AssistantObjectToolResourcesCodeInterpreter::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AssistantObjectToolResourcesCodeInterpreter::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AssistantObjectToolResourcesFileSearch

```cpp
// Create a model
auto model = models::AssistantObjectToolResourcesFileSearch();
model.setVectorStoreIds(/* value */);  // Set vector_store_ids

// Serialize to JSON
nlohmann::json json = models::AssistantObjectToolResourcesFileSearch::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AssistantObjectToolResourcesFileSearch::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AssistantObjectToolsInner

```cpp
// Create a model
auto model = models::AssistantObjectToolsInner();
model.setType(/* value */);  // Set type
model.setFileSearch(/* value */);  // Set file_search
model.setFunction(/* value */);  // Set function

// Serialize to JSON
nlohmann::json json = models::AssistantObjectToolsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AssistantObjectToolsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AssistantStreamEvent

```cpp
// Create a model
auto model = models::AssistantStreamEvent();
model.setEnabled(/* value */);  // Set enabled
model.setEvent(/* value */);  // Set event
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::AssistantStreamEvent::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AssistantStreamEvent::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CodeInterpreterTool

```cpp
// Create a model
auto model = models::CodeInterpreterTool();
model.setType(/* value */);  // Set type

// Serialize to JSON
nlohmann::json json = models::CodeInterpreterTool::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CodeInterpreterTool::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FileSearchTool

```cpp
// Create a model
auto model = models::FileSearchTool();
model.setType(/* value */);  // Set type
model.setFileSearch(/* value */);  // Set file_search

// Serialize to JSON
nlohmann::json json = models::FileSearchTool::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FileSearchTool::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AssistantToolsFileSearchFileSearch

```cpp
// Create a model
auto model = models::AssistantToolsFileSearchFileSearch();
model.setMaxNumResults(/* value */);  // Set max_num_results
model.setRankingOptions(/* value */);  // Set ranking_options

// Serialize to JSON
nlohmann::json json = models::AssistantToolsFileSearchFileSearch::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AssistantToolsFileSearchFileSearch::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FileSearchTool

```cpp
// Create a model
auto model = models::FileSearchTool();
model.setType(/* value */);  // Set type

// Serialize to JSON
nlohmann::json json = models::FileSearchTool::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FileSearchTool::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FunctionTool

```cpp
// Create a model
auto model = models::FunctionTool();
model.setType(/* value */);  // Set type
model.setFunction(/* value */);  // Set function

// Serialize to JSON
nlohmann::json json = models::FunctionTool::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FunctionTool::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AssistantsApiResponseFormatOption

```cpp
// Create a model
auto model = models::AssistantsApiResponseFormatOption();
model.setType(/* value */);  // Set type
model.setJsonSchema(/* value */);  // Set json_schema

// Serialize to JSON
nlohmann::json json = models::AssistantsApiResponseFormatOption::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AssistantsApiResponseFormatOption::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AssistantsApiToolChoiceOption

```cpp
// Create a model
auto model = models::AssistantsApiToolChoiceOption();
model.setType(/* value */);  // Set type
model.setFunction(/* value */);  // Set function

// Serialize to JSON
nlohmann::json json = models::AssistantsApiToolChoiceOption::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AssistantsApiToolChoiceOption::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AssistantsNamedToolChoice

```cpp
// Create a model
auto model = models::AssistantsNamedToolChoice();
model.setType(/* value */);  // Set type
model.setFunction(/* value */);  // Set function

// Serialize to JSON
nlohmann::json json = models::AssistantsNamedToolChoice::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AssistantsNamedToolChoice::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AssistantsNamedToolChoiceFunction

```cpp
// Create a model
auto model = models::AssistantsNamedToolChoiceFunction();
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::AssistantsNamedToolChoiceFunction::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AssistantsNamedToolChoiceFunction::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AudioResponseFormat

```cpp
// Create a model
auto model = models::AudioResponseFormat();

// Serialize to JSON
nlohmann::json json = models::AudioResponseFormat::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AudioResponseFormat::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLog

```cpp
// Create a model
auto model = models::AuditLog();
model.setId(/* value */);  // Set id
model.setType(/* value */);  // Set type
model.setEffectiveAt(/* value */);  // Set effective_at
model.setProject(/* value */);  // Set project
model.setActor(/* value */);  // Set actor
model.setApiKeyCreated(/* value */);  // Set api_key.created
model.setApiKeyUpdated(/* value */);  // Set api_key.updated
model.setApiKeyDeleted(/* value */);  // Set api_key.deleted
model.setInviteSent(/* value */);  // Set invite.sent
model.setInviteAccepted(/* value */);  // Set invite.accepted
model.setInviteDeleted(/* value */);  // Set invite.deleted
model.setLoginFailed(/* value */);  // Set login.failed
model.setLogoutFailed(/* value */);  // Set logout.failed
model.setOrganizationUpdated(/* value */);  // Set organization.updated
model.setProjectCreated(/* value */);  // Set project.created
model.setProjectUpdated(/* value */);  // Set project.updated
model.setProjectArchived(/* value */);  // Set project.archived
model.setRateLimitUpdated(/* value */);  // Set rate_limit.updated
model.setRateLimitDeleted(/* value */);  // Set rate_limit.deleted
model.setServiceAccountCreated(/* value */);  // Set service_account.created
model.setServiceAccountUpdated(/* value */);  // Set service_account.updated
model.setServiceAccountDeleted(/* value */);  // Set service_account.deleted
model.setUserAdded(/* value */);  // Set user.added
model.setUserUpdated(/* value */);  // Set user.updated
model.setUserDeleted(/* value */);  // Set user.deleted

// Serialize to JSON
nlohmann::json json = models::AuditLog::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLog::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogActor

```cpp
// Create a model
auto model = models::AuditLogActor();
model.setType(/* value */);  // Set type
model.setSession(/* value */);  // Set session
model.setApiKey(/* value */);  // Set api_key

// Serialize to JSON
nlohmann::json json = models::AuditLogActor::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogActor::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogActorApiKey

```cpp
// Create a model
auto model = models::AuditLogActorApiKey();
model.setId(/* value */);  // Set id
model.setType(/* value */);  // Set type
model.setUser(/* value */);  // Set user
model.setServiceAccount(/* value */);  // Set service_account

// Serialize to JSON
nlohmann::json json = models::AuditLogActorApiKey::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogActorApiKey::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogActorServiceAccount

```cpp
// Create a model
auto model = models::AuditLogActorServiceAccount();
model.setId(/* value */);  // Set id

// Serialize to JSON
nlohmann::json json = models::AuditLogActorServiceAccount::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogActorServiceAccount::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogActorSession

```cpp
// Create a model
auto model = models::AuditLogActorSession();
model.setUser(/* value */);  // Set user
model.setIpAddress(/* value */);  // Set ip_address

// Serialize to JSON
nlohmann::json json = models::AuditLogActorSession::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogActorSession::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogActorUser

```cpp
// Create a model
auto model = models::AuditLogActorUser();
model.setId(/* value */);  // Set id
model.setEmail(/* value */);  // Set email

// Serialize to JSON
nlohmann::json json = models::AuditLogActorUser::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogActorUser::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogApiKeyCreated

```cpp
// Create a model
auto model = models::AuditLogApiKeyCreated();
model.setId(/* value */);  // Set id
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::AuditLogApiKeyCreated::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogApiKeyCreated::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogApiKeyCreatedData

```cpp
// Create a model
auto model = models::AuditLogApiKeyCreatedData();
model.setScopes(/* value */);  // Set scopes

// Serialize to JSON
nlohmann::json json = models::AuditLogApiKeyCreatedData::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogApiKeyCreatedData::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogApiKeyDeleted

```cpp
// Create a model
auto model = models::AuditLogApiKeyDeleted();
model.setId(/* value */);  // Set id

// Serialize to JSON
nlohmann::json json = models::AuditLogApiKeyDeleted::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogApiKeyDeleted::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogApiKeyUpdated

```cpp
// Create a model
auto model = models::AuditLogApiKeyUpdated();
model.setId(/* value */);  // Set id
model.setChangesRequested(/* value */);  // Set changes_requested

// Serialize to JSON
nlohmann::json json = models::AuditLogApiKeyUpdated::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogApiKeyUpdated::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogApiKeyUpdatedChangesRequested

```cpp
// Create a model
auto model = models::AuditLogApiKeyUpdatedChangesRequested();
model.setScopes(/* value */);  // Set scopes

// Serialize to JSON
nlohmann::json json = models::AuditLogApiKeyUpdatedChangesRequested::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogApiKeyUpdatedChangesRequested::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogEventType

```cpp
// Create a model
auto model = models::AuditLogEventType();

// Serialize to JSON
nlohmann::json json = models::AuditLogEventType::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogEventType::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogInviteAccepted

```cpp
// Create a model
auto model = models::AuditLogInviteAccepted();
model.setId(/* value */);  // Set id

// Serialize to JSON
nlohmann::json json = models::AuditLogInviteAccepted::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogInviteAccepted::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogInviteDeleted

```cpp
// Create a model
auto model = models::AuditLogInviteDeleted();
model.setId(/* value */);  // Set id

// Serialize to JSON
nlohmann::json json = models::AuditLogInviteDeleted::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogInviteDeleted::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogInviteSent

```cpp
// Create a model
auto model = models::AuditLogInviteSent();
model.setId(/* value */);  // Set id
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::AuditLogInviteSent::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogInviteSent::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogInviteSentData

```cpp
// Create a model
auto model = models::AuditLogInviteSentData();
model.setEmail(/* value */);  // Set email
model.setRole(/* value */);  // Set role

// Serialize to JSON
nlohmann::json json = models::AuditLogInviteSentData::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogInviteSentData::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogLoginFailed

```cpp
// Create a model
auto model = models::AuditLogLoginFailed();
model.setErrorCode(/* value */);  // Set error_code
model.setErrorMessage(/* value */);  // Set error_message

// Serialize to JSON
nlohmann::json json = models::AuditLogLoginFailed::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogLoginFailed::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogLogoutFailed

```cpp
// Create a model
auto model = models::AuditLogLogoutFailed();
model.setErrorCode(/* value */);  // Set error_code
model.setErrorMessage(/* value */);  // Set error_message

// Serialize to JSON
nlohmann::json json = models::AuditLogLogoutFailed::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogLogoutFailed::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogOrganizationUpdated

```cpp
// Create a model
auto model = models::AuditLogOrganizationUpdated();
model.setId(/* value */);  // Set id
model.setChangesRequested(/* value */);  // Set changes_requested

// Serialize to JSON
nlohmann::json json = models::AuditLogOrganizationUpdated::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogOrganizationUpdated::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogOrganizationUpdatedChangesRequested

```cpp
// Create a model
auto model = models::AuditLogOrganizationUpdatedChangesRequested();
model.setTitle(/* value */);  // Set title
model.setDescription(/* value */);  // Set description
model.setName(/* value */);  // Set name
model.setSettings(/* value */);  // Set settings

// Serialize to JSON
nlohmann::json json = models::AuditLogOrganizationUpdatedChangesRequested::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogOrganizationUpdatedChangesRequested::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogOrganizationUpdatedChangesRequestedSettings

```cpp
// Create a model
auto model = models::AuditLogOrganizationUpdatedChangesRequestedSettings();
model.setThreadsUiVisibility(/* value */);  // Set threads_ui_visibility
model.setUsageDashboardVisibility(/* value */);  // Set usage_dashboard_visibility

// Serialize to JSON
nlohmann::json json = models::AuditLogOrganizationUpdatedChangesRequestedSettings::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogOrganizationUpdatedChangesRequestedSettings::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogProject

```cpp
// Create a model
auto model = models::AuditLogProject();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::AuditLogProject::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogProject::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogProjectArchived

```cpp
// Create a model
auto model = models::AuditLogProjectArchived();
model.setId(/* value */);  // Set id

// Serialize to JSON
nlohmann::json json = models::AuditLogProjectArchived::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogProjectArchived::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogProjectCreated

```cpp
// Create a model
auto model = models::AuditLogProjectCreated();
model.setId(/* value */);  // Set id
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::AuditLogProjectCreated::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogProjectCreated::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogProjectCreatedData

```cpp
// Create a model
auto model = models::AuditLogProjectCreatedData();
model.setName(/* value */);  // Set name
model.setTitle(/* value */);  // Set title

// Serialize to JSON
nlohmann::json json = models::AuditLogProjectCreatedData::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogProjectCreatedData::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogProjectUpdated

```cpp
// Create a model
auto model = models::AuditLogProjectUpdated();
model.setId(/* value */);  // Set id
model.setChangesRequested(/* value */);  // Set changes_requested

// Serialize to JSON
nlohmann::json json = models::AuditLogProjectUpdated::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogProjectUpdated::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogProjectUpdatedChangesRequested

```cpp
// Create a model
auto model = models::AuditLogProjectUpdatedChangesRequested();
model.setTitle(/* value */);  // Set title

// Serialize to JSON
nlohmann::json json = models::AuditLogProjectUpdatedChangesRequested::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogProjectUpdatedChangesRequested::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogRateLimitDeleted

```cpp
// Create a model
auto model = models::AuditLogRateLimitDeleted();
model.setId(/* value */);  // Set id

// Serialize to JSON
nlohmann::json json = models::AuditLogRateLimitDeleted::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogRateLimitDeleted::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogRateLimitUpdated

```cpp
// Create a model
auto model = models::AuditLogRateLimitUpdated();
model.setId(/* value */);  // Set id
model.setChangesRequested(/* value */);  // Set changes_requested

// Serialize to JSON
nlohmann::json json = models::AuditLogRateLimitUpdated::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogRateLimitUpdated::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogRateLimitUpdatedChangesRequested

```cpp
// Create a model
auto model = models::AuditLogRateLimitUpdatedChangesRequested();
model.setMaxRequestsPer1Minute(/* value */);  // Set max_requests_per_1_minute
model.setMaxTokensPer1Minute(/* value */);  // Set max_tokens_per_1_minute
model.setMaxImagesPer1Minute(/* value */);  // Set max_images_per_1_minute
model.setMaxAudioMegabytesPer1Minute(/* value */);  // Set max_audio_megabytes_per_1_minute
model.setMaxRequestsPer1Day(/* value */);  // Set max_requests_per_1_day
model.setBatch1DayMaxInputTokens(/* value */);  // Set batch_1_day_max_input_tokens

// Serialize to JSON
nlohmann::json json = models::AuditLogRateLimitUpdatedChangesRequested::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogRateLimitUpdatedChangesRequested::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogServiceAccountCreated

```cpp
// Create a model
auto model = models::AuditLogServiceAccountCreated();
model.setId(/* value */);  // Set id
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::AuditLogServiceAccountCreated::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogServiceAccountCreated::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogServiceAccountCreatedData

```cpp
// Create a model
auto model = models::AuditLogServiceAccountCreatedData();
model.setRole(/* value */);  // Set role

// Serialize to JSON
nlohmann::json json = models::AuditLogServiceAccountCreatedData::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogServiceAccountCreatedData::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogServiceAccountDeleted

```cpp
// Create a model
auto model = models::AuditLogServiceAccountDeleted();
model.setId(/* value */);  // Set id

// Serialize to JSON
nlohmann::json json = models::AuditLogServiceAccountDeleted::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogServiceAccountDeleted::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogServiceAccountUpdated

```cpp
// Create a model
auto model = models::AuditLogServiceAccountUpdated();
model.setId(/* value */);  // Set id
model.setChangesRequested(/* value */);  // Set changes_requested

// Serialize to JSON
nlohmann::json json = models::AuditLogServiceAccountUpdated::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogServiceAccountUpdated::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogServiceAccountUpdatedChangesRequested

```cpp
// Create a model
auto model = models::AuditLogServiceAccountUpdatedChangesRequested();
model.setRole(/* value */);  // Set role

// Serialize to JSON
nlohmann::json json = models::AuditLogServiceAccountUpdatedChangesRequested::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogServiceAccountUpdatedChangesRequested::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogUserAdded

```cpp
// Create a model
auto model = models::AuditLogUserAdded();
model.setId(/* value */);  // Set id
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::AuditLogUserAdded::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogUserAdded::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogUserAddedData

```cpp
// Create a model
auto model = models::AuditLogUserAddedData();
model.setRole(/* value */);  // Set role

// Serialize to JSON
nlohmann::json json = models::AuditLogUserAddedData::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogUserAddedData::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogUserDeleted

```cpp
// Create a model
auto model = models::AuditLogUserDeleted();
model.setId(/* value */);  // Set id

// Serialize to JSON
nlohmann::json json = models::AuditLogUserDeleted::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogUserDeleted::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogUserUpdated

```cpp
// Create a model
auto model = models::AuditLogUserUpdated();
model.setId(/* value */);  // Set id
model.setChangesRequested(/* value */);  // Set changes_requested

// Serialize to JSON
nlohmann::json json = models::AuditLogUserUpdated::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogUserUpdated::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AuditLogUserUpdatedChangesRequested

```cpp
// Create a model
auto model = models::AuditLogUserUpdatedChangesRequested();
model.setRole(/* value */);  // Set role

// Serialize to JSON
nlohmann::json json = models::AuditLogUserUpdatedChangesRequested::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AuditLogUserUpdatedChangesRequested::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AutoChunkingStrategy

```cpp
// Create a model
auto model = models::AutoChunkingStrategy();
model.setType(/* value */);  // Set type

// Serialize to JSON
nlohmann::json json = models::AutoChunkingStrategy::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AutoChunkingStrategy::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Batch

```cpp
// Create a model
auto model = models::Batch();
model.setId(/* value */);  // Set id
model.setObject(/* value */);  // Set object
model.setEndpoint(/* value */);  // Set endpoint
model.setErrors(/* value */);  // Set errors
model.setInputFileId(/* value */);  // Set input_file_id
model.setCompletionWindow(/* value */);  // Set completion_window
model.setStatus(/* value */);  // Set status
model.setOutputFileId(/* value */);  // Set output_file_id
model.setErrorFileId(/* value */);  // Set error_file_id
model.setCreatedAt(/* value */);  // Set created_at
model.setInProgressAt(/* value */);  // Set in_progress_at
model.setExpiresAt(/* value */);  // Set expires_at
model.setFinalizingAt(/* value */);  // Set finalizing_at
model.setCompletedAt(/* value */);  // Set completed_at
model.setFailedAt(/* value */);  // Set failed_at
model.setExpiredAt(/* value */);  // Set expired_at
model.setCancellingAt(/* value */);  // Set cancelling_at
model.setCancelledAt(/* value */);  // Set cancelled_at
model.setRequestCounts(/* value */);  // Set request_counts
model.setMetadata(/* value */);  // Set metadata

// Serialize to JSON
nlohmann::json json = models::Batch::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Batch::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BatchErrors

```cpp
// Create a model
auto model = models::BatchErrors();
model.setObject(/* value */);  // Set object
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::BatchErrors::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BatchErrors::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BatchErrorsDataInner

```cpp
// Create a model
auto model = models::BatchErrorsDataInner();
model.setCode(/* value */);  // Set code
model.setMessage(/* value */);  // Set message
model.setParam(/* value */);  // Set param
model.setLine(/* value */);  // Set line

// Serialize to JSON
nlohmann::json json = models::BatchErrorsDataInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BatchErrorsDataInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BatchRequestCounts

```cpp
// Create a model
auto model = models::BatchRequestCounts();
model.setTotal(/* value */);  // Set total
model.setCompleted(/* value */);  // Set completed
model.setFailed(/* value */);  // Set failed

// Serialize to JSON
nlohmann::json json = models::BatchRequestCounts::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BatchRequestCounts::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BatchRequestInput

```cpp
// Create a model
auto model = models::BatchRequestInput();
model.setCustomId(/* value */);  // Set custom_id
model.setMethod(/* value */);  // Set method
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::BatchRequestInput::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BatchRequestInput::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BatchRequestOutput

```cpp
// Create a model
auto model = models::BatchRequestOutput();
model.setId(/* value */);  // Set id
model.setCustomId(/* value */);  // Set custom_id
model.setResponse(/* value */);  // Set response
model.setError(/* value */);  // Set error

// Serialize to JSON
nlohmann::json json = models::BatchRequestOutput::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BatchRequestOutput::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BatchRequestOutputError

```cpp
// Create a model
auto model = models::BatchRequestOutputError();
model.setCode(/* value */);  // Set code
model.setMessage(/* value */);  // Set message

// Serialize to JSON
nlohmann::json json = models::BatchRequestOutputError::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BatchRequestOutputError::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BatchRequestOutputResponse

```cpp
// Create a model
auto model = models::BatchRequestOutputResponse();
model.setStatusCode(/* value */);  // Set status_code
model.setRequestId(/* value */);  // Set request_id
model.setBody(/* value */);  // Set body

// Serialize to JSON
nlohmann::json json = models::BatchRequestOutputResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BatchRequestOutputResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionFunctionCallOption

```cpp
// Create a model
auto model = models::ChatCompletionFunctionCallOption();
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::ChatCompletionFunctionCallOption::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionFunctionCallOption::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionFunctions

```cpp
// Create a model
auto model = models::ChatCompletionFunctions();
model.setDescription(/* value */);  // Set description
model.setName(/* value */);  // Set name
model.setParameters(/* value */);  // Set parameters

// Serialize to JSON
nlohmann::json json = models::ChatCompletionFunctions::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionFunctions::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionMessageToolCall

```cpp
// Create a model
auto model = models::ChatCompletionMessageToolCall();
model.setId(/* value */);  // Set id
model.setType(/* value */);  // Set type
model.setFunction(/* value */);  // Set function

// Serialize to JSON
nlohmann::json json = models::ChatCompletionMessageToolCall::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionMessageToolCall::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionMessageToolCallChunk

```cpp
// Create a model
auto model = models::ChatCompletionMessageToolCallChunk();
model.setIndex(/* value */);  // Set index
model.setId(/* value */);  // Set id
model.setType(/* value */);  // Set type
model.setFunction(/* value */);  // Set function

// Serialize to JSON
nlohmann::json json = models::ChatCompletionMessageToolCallChunk::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionMessageToolCallChunk::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionMessageToolCallChunkFunction

```cpp
// Create a model
auto model = models::ChatCompletionMessageToolCallChunkFunction();
model.setName(/* value */);  // Set name
model.setArguments(/* value */);  // Set arguments

// Serialize to JSON
nlohmann::json json = models::ChatCompletionMessageToolCallChunkFunction::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionMessageToolCallChunkFunction::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionMessageToolCallFunction

```cpp
// Create a model
auto model = models::ChatCompletionMessageToolCallFunction();
model.setName(/* value */);  // Set name
model.setArguments(/* value */);  // Set arguments

// Serialize to JSON
nlohmann::json json = models::ChatCompletionMessageToolCallFunction::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionMessageToolCallFunction::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionNamedToolChoice

```cpp
// Create a model
auto model = models::ChatCompletionNamedToolChoice();
model.setType(/* value */);  // Set type
model.setFunction(/* value */);  // Set function

// Serialize to JSON
nlohmann::json json = models::ChatCompletionNamedToolChoice::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionNamedToolChoice::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionNamedToolChoiceFunction

```cpp
// Create a model
auto model = models::ChatCompletionNamedToolChoiceFunction();
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::ChatCompletionNamedToolChoiceFunction::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionNamedToolChoiceFunction::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AssistantMessage

```cpp
// Create a model
auto model = models::AssistantMessage();
model.setContent(/* value */);  // Set content
model.setRefusal(/* value */);  // Set refusal
model.setRole(/* value */);  // Set role
model.setName(/* value */);  // Set name
model.setAudio(/* value */);  // Set audio
model.setToolCalls(/* value */);  // Set tool_calls
model.setFunctionCall(/* value */);  // Set function_call

// Serialize to JSON
nlohmann::json json = models::AssistantMessage::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AssistantMessage::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionRequestAssistantMessageAudio

```cpp
// Create a model
auto model = models::ChatCompletionRequestAssistantMessageAudio();
model.setId(/* value */);  // Set id

// Serialize to JSON
nlohmann::json json = models::ChatCompletionRequestAssistantMessageAudio::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionRequestAssistantMessageAudio::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionRequestAssistantMessageContent

```cpp
// Create a model
auto model = models::ChatCompletionRequestAssistantMessageContent();

// Serialize to JSON
nlohmann::json json = models::ChatCompletionRequestAssistantMessageContent::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionRequestAssistantMessageContent::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionRequestAssistantMessageContentPart

```cpp
// Create a model
auto model = models::ChatCompletionRequestAssistantMessageContentPart();
model.setType(/* value */);  // Set type
model.setText(/* value */);  // Set text
model.setRefusal(/* value */);  // Set refusal

// Serialize to JSON
nlohmann::json json = models::ChatCompletionRequestAssistantMessageContentPart::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionRequestAssistantMessageContentPart::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionRequestAssistantMessageFunctionCall

```cpp
// Create a model
auto model = models::ChatCompletionRequestAssistantMessageFunctionCall();
model.setArguments(/* value */);  // Set arguments
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::ChatCompletionRequestAssistantMessageFunctionCall::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionRequestAssistantMessageFunctionCall::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DeveloperMessage

```cpp
// Create a model
auto model = models::DeveloperMessage();
model.setContent(/* value */);  // Set content
model.setRole(/* value */);  // Set role
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::DeveloperMessage::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DeveloperMessage::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionRequestDeveloperMessageContent

```cpp
// Create a model
auto model = models::ChatCompletionRequestDeveloperMessageContent();

// Serialize to JSON
nlohmann::json json = models::ChatCompletionRequestDeveloperMessageContent::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionRequestDeveloperMessageContent::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FunctionMessage

```cpp
// Create a model
auto model = models::FunctionMessage();
model.setRole(/* value */);  // Set role
model.setContent(/* value */);  // Set content
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::FunctionMessage::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FunctionMessage::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionRequestMessage

```cpp
// Create a model
auto model = models::ChatCompletionRequestMessage();
model.setContent(/* value */);  // Set content
model.setRole(/* value */);  // Set role
model.setName(/* value */);  // Set name
model.setRefusal(/* value */);  // Set refusal
model.setAudio(/* value */);  // Set audio
model.setToolCalls(/* value */);  // Set tool_calls
model.setFunctionCall(/* value */);  // Set function_call
model.setToolCallId(/* value */);  // Set tool_call_id

// Serialize to JSON
nlohmann::json json = models::ChatCompletionRequestMessage::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionRequestMessage::fromJson(nlohmann::json::parse(jsonString));
```
#### models::AudioContentPart

```cpp
// Create a model
auto model = models::AudioContentPart();
model.setType(/* value */);  // Set type
model.setInputAudio(/* value */);  // Set input_audio

// Serialize to JSON
nlohmann::json json = models::AudioContentPart::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::AudioContentPart::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionRequestMessageContentPartAudioInputAudio

```cpp
// Create a model
auto model = models::ChatCompletionRequestMessageContentPartAudioInputAudio();
model.setData(/* value */);  // Set data
model.setFormat(/* value */);  // Set format

// Serialize to JSON
nlohmann::json json = models::ChatCompletionRequestMessageContentPartAudioInputAudio::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionRequestMessageContentPartAudioInputAudio::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ImageContentPart

```cpp
// Create a model
auto model = models::ImageContentPart();
model.setType(/* value */);  // Set type
model.setImageUrl(/* value */);  // Set image_url

// Serialize to JSON
nlohmann::json json = models::ImageContentPart::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ImageContentPart::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionRequestMessageContentPartImageImageUrl

```cpp
// Create a model
auto model = models::ChatCompletionRequestMessageContentPartImageImageUrl();
model.setUrl(/* value */);  // Set url
model.setDetail(/* value */);  // Set detail

// Serialize to JSON
nlohmann::json json = models::ChatCompletionRequestMessageContentPartImageImageUrl::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionRequestMessageContentPartImageImageUrl::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RefusalContentPart

```cpp
// Create a model
auto model = models::RefusalContentPart();
model.setType(/* value */);  // Set type
model.setRefusal(/* value */);  // Set refusal

// Serialize to JSON
nlohmann::json json = models::RefusalContentPart::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RefusalContentPart::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TextContentPart

```cpp
// Create a model
auto model = models::TextContentPart();
model.setType(/* value */);  // Set type
model.setText(/* value */);  // Set text

// Serialize to JSON
nlohmann::json json = models::TextContentPart::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TextContentPart::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SystemMessage

```cpp
// Create a model
auto model = models::SystemMessage();
model.setContent(/* value */);  // Set content
model.setRole(/* value */);  // Set role
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::SystemMessage::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SystemMessage::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionRequestSystemMessageContent

```cpp
// Create a model
auto model = models::ChatCompletionRequestSystemMessageContent();

// Serialize to JSON
nlohmann::json json = models::ChatCompletionRequestSystemMessageContent::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionRequestSystemMessageContent::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ToolMessage

```cpp
// Create a model
auto model = models::ToolMessage();
model.setRole(/* value */);  // Set role
model.setContent(/* value */);  // Set content
model.setToolCallId(/* value */);  // Set tool_call_id

// Serialize to JSON
nlohmann::json json = models::ToolMessage::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ToolMessage::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionRequestToolMessageContent

```cpp
// Create a model
auto model = models::ChatCompletionRequestToolMessageContent();

// Serialize to JSON
nlohmann::json json = models::ChatCompletionRequestToolMessageContent::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionRequestToolMessageContent::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UserMessage

```cpp
// Create a model
auto model = models::UserMessage();
model.setContent(/* value */);  // Set content
model.setRole(/* value */);  // Set role
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::UserMessage::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UserMessage::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionRequestUserMessageContent

```cpp
// Create a model
auto model = models::ChatCompletionRequestUserMessageContent();

// Serialize to JSON
nlohmann::json json = models::ChatCompletionRequestUserMessageContent::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionRequestUserMessageContent::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionRequestUserMessageContentPart

```cpp
// Create a model
auto model = models::ChatCompletionRequestUserMessageContentPart();
model.setType(/* value */);  // Set type
model.setText(/* value */);  // Set text
model.setImageUrl(/* value */);  // Set image_url
model.setInputAudio(/* value */);  // Set input_audio

// Serialize to JSON
nlohmann::json json = models::ChatCompletionRequestUserMessageContentPart::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionRequestUserMessageContentPart::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionResponseMessage

```cpp
// Create a model
auto model = models::ChatCompletionResponseMessage();
model.setContent(/* value */);  // Set content
model.setRefusal(/* value */);  // Set refusal
model.setToolCalls(/* value */);  // Set tool_calls
model.setRole(/* value */);  // Set role
model.setFunctionCall(/* value */);  // Set function_call
model.setAudio(/* value */);  // Set audio

// Serialize to JSON
nlohmann::json json = models::ChatCompletionResponseMessage::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionResponseMessage::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionResponseMessageAudio

```cpp
// Create a model
auto model = models::ChatCompletionResponseMessageAudio();
model.setId(/* value */);  // Set id
model.setExpiresAt(/* value */);  // Set expires_at
model.setData(/* value */);  // Set data
model.setTranscript(/* value */);  // Set transcript

// Serialize to JSON
nlohmann::json json = models::ChatCompletionResponseMessageAudio::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionResponseMessageAudio::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionResponseMessageFunctionCall

```cpp
// Create a model
auto model = models::ChatCompletionResponseMessageFunctionCall();
model.setArguments(/* value */);  // Set arguments
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::ChatCompletionResponseMessageFunctionCall::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionResponseMessageFunctionCall::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionRole

```cpp
// Create a model
auto model = models::ChatCompletionRole();

// Serialize to JSON
nlohmann::json json = models::ChatCompletionRole::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionRole::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionStreamOptions

```cpp
// Create a model
auto model = models::ChatCompletionStreamOptions();
model.setIncludeUsage(/* value */);  // Set include_usage

// Serialize to JSON
nlohmann::json json = models::ChatCompletionStreamOptions::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionStreamOptions::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionStreamResponseDelta

```cpp
// Create a model
auto model = models::ChatCompletionStreamResponseDelta();
model.setContent(/* value */);  // Set content
model.setFunctionCall(/* value */);  // Set function_call
model.setToolCalls(/* value */);  // Set tool_calls
model.setRole(/* value */);  // Set role
model.setRefusal(/* value */);  // Set refusal

// Serialize to JSON
nlohmann::json json = models::ChatCompletionStreamResponseDelta::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionStreamResponseDelta::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionStreamResponseDeltaFunctionCall

```cpp
// Create a model
auto model = models::ChatCompletionStreamResponseDeltaFunctionCall();
model.setArguments(/* value */);  // Set arguments
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::ChatCompletionStreamResponseDeltaFunctionCall::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionStreamResponseDeltaFunctionCall::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionTokenLogprob

```cpp
// Create a model
auto model = models::ChatCompletionTokenLogprob();
model.setToken(/* value */);  // Set token
model.setLogprob(/* value */);  // Set logprob
model.setBytes(/* value */);  // Set bytes
model.setTopLogprobs(/* value */);  // Set top_logprobs

// Serialize to JSON
nlohmann::json json = models::ChatCompletionTokenLogprob::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionTokenLogprob::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionTokenLogprobTopLogprobsInner

```cpp
// Create a model
auto model = models::ChatCompletionTokenLogprobTopLogprobsInner();
model.setToken(/* value */);  // Set token
model.setLogprob(/* value */);  // Set logprob
model.setBytes(/* value */);  // Set bytes

// Serialize to JSON
nlohmann::json json = models::ChatCompletionTokenLogprobTopLogprobsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionTokenLogprobTopLogprobsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionTool

```cpp
// Create a model
auto model = models::ChatCompletionTool();
model.setType(/* value */);  // Set type
model.setFunction(/* value */);  // Set function

// Serialize to JSON
nlohmann::json json = models::ChatCompletionTool::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionTool::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChatCompletionToolChoiceOption

```cpp
// Create a model
auto model = models::ChatCompletionToolChoiceOption();
model.setType(/* value */);  // Set type
model.setFunction(/* value */);  // Set function

// Serialize to JSON
nlohmann::json json = models::ChatCompletionToolChoiceOption::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChatCompletionToolChoiceOption::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ChunkingStrategyRequestParam

```cpp
// Create a model
auto model = models::ChunkingStrategyRequestParam();
model.setType(/* value */);  // Set type
model.setRStatic(/* value */);  // Set static

// Serialize to JSON
nlohmann::json json = models::ChunkingStrategyRequestParam::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ChunkingStrategyRequestParam::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CompleteUploadRequest

```cpp
// Create a model
auto model = models::CompleteUploadRequest();
model.setPartIds(/* value */);  // Set part_ids
model.setMd5(/* value */);  // Set md5

// Serialize to JSON
nlohmann::json json = models::CompleteUploadRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CompleteUploadRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CompletionUsage

```cpp
// Create a model
auto model = models::CompletionUsage();
model.setCompletionTokens(/* value */);  // Set completion_tokens
model.setPromptTokens(/* value */);  // Set prompt_tokens
model.setTotalTokens(/* value */);  // Set total_tokens
model.setCompletionTokensDetails(/* value */);  // Set completion_tokens_details
model.setPromptTokensDetails(/* value */);  // Set prompt_tokens_details

// Serialize to JSON
nlohmann::json json = models::CompletionUsage::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CompletionUsage::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CompletionUsageCompletionTokensDetails

```cpp
// Create a model
auto model = models::CompletionUsageCompletionTokensDetails();
model.setAcceptedPredictionTokens(/* value */);  // Set accepted_prediction_tokens
model.setAudioTokens(/* value */);  // Set audio_tokens
model.setReasoningTokens(/* value */);  // Set reasoning_tokens
model.setRejectedPredictionTokens(/* value */);  // Set rejected_prediction_tokens

// Serialize to JSON
nlohmann::json json = models::CompletionUsageCompletionTokensDetails::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CompletionUsageCompletionTokensDetails::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CompletionUsagePromptTokensDetails

```cpp
// Create a model
auto model = models::CompletionUsagePromptTokensDetails();
model.setAudioTokens(/* value */);  // Set audio_tokens
model.setCachedTokens(/* value */);  // Set cached_tokens

// Serialize to JSON
nlohmann::json json = models::CompletionUsagePromptTokensDetails::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CompletionUsagePromptTokensDetails::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CostsResult

```cpp
// Create a model
auto model = models::CostsResult();
model.setObject(/* value */);  // Set object
model.setAmount(/* value */);  // Set amount
model.setLineItem(/* value */);  // Set line_item
model.setProjectId(/* value */);  // Set project_id

// Serialize to JSON
nlohmann::json json = models::CostsResult::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CostsResult::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CostsResultAmount

```cpp
// Create a model
auto model = models::CostsResultAmount();
model.setValue(/* value */);  // Set value
model.setCurrency(/* value */);  // Set currency

// Serialize to JSON
nlohmann::json json = models::CostsResultAmount::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CostsResultAmount::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateAssistantRequest

```cpp
// Create a model
auto model = models::CreateAssistantRequest();
model.setModel(/* value */);  // Set model
model.setName(/* value */);  // Set name
model.setDescription(/* value */);  // Set description
model.setInstructions(/* value */);  // Set instructions
model.setTools(/* value */);  // Set tools
model.setToolResources(/* value */);  // Set tool_resources
model.setMetadata(/* value */);  // Set metadata
model.setTemperature(/* value */);  // Set temperature
model.setTopP(/* value */);  // Set top_p
model.setResponseFormat(/* value */);  // Set response_format

// Serialize to JSON
nlohmann::json json = models::CreateAssistantRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateAssistantRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateAssistantRequestModel

```cpp
// Create a model
auto model = models::CreateAssistantRequestModel();

// Serialize to JSON
nlohmann::json json = models::CreateAssistantRequestModel::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateAssistantRequestModel::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateAssistantRequestToolResources

```cpp
// Create a model
auto model = models::CreateAssistantRequestToolResources();
model.setCodeInterpreter(/* value */);  // Set code_interpreter
model.setFileSearch(/* value */);  // Set file_search

// Serialize to JSON
nlohmann::json json = models::CreateAssistantRequestToolResources::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateAssistantRequestToolResources::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateAssistantRequestToolResourcesCodeInterpreter

```cpp
// Create a model
auto model = models::CreateAssistantRequestToolResourcesCodeInterpreter();
model.setFileIds(/* value */);  // Set file_ids

// Serialize to JSON
nlohmann::json json = models::CreateAssistantRequestToolResourcesCodeInterpreter::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateAssistantRequestToolResourcesCodeInterpreter::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateAssistantRequestToolResourcesFileSearch

```cpp
// Create a model
auto model = models::CreateAssistantRequestToolResourcesFileSearch();
model.setVectorStoreIds(/* value */);  // Set vector_store_ids
model.setVectorStores(/* value */);  // Set vector_stores

// Serialize to JSON
nlohmann::json json = models::CreateAssistantRequestToolResourcesFileSearch::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateAssistantRequestToolResourcesFileSearch::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateAssistantRequestToolResourcesFileSearchVectorStoresInner

```cpp
// Create a model
auto model = models::CreateAssistantRequestToolResourcesFileSearchVectorStoresInner();
model.setFileIds(/* value */);  // Set file_ids
model.setChunkingStrategy(/* value */);  // Set chunking_strategy
model.setMetadata(/* value */);  // Set metadata

// Serialize to JSON
nlohmann::json json = models::CreateAssistantRequestToolResourcesFileSearchVectorStoresInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateAssistantRequestToolResourcesFileSearchVectorStoresInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy

```cpp
// Create a model
auto model = models::CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy();
model.setType(/* value */);  // Set type
model.setRStatic(/* value */);  // Set static

// Serialize to JSON
nlohmann::json json = models::CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateAssistantRequestToolsInner

```cpp
// Create a model
auto model = models::CreateAssistantRequestToolsInner();
model.setType(/* value */);  // Set type
model.setFileSearch(/* value */);  // Set file_search
model.setFunction(/* value */);  // Set function

// Serialize to JSON
nlohmann::json json = models::CreateAssistantRequestToolsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateAssistantRequestToolsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateBatchRequest

```cpp
// Create a model
auto model = models::CreateBatchRequest();
model.setInputFileId(/* value */);  // Set input_file_id
model.setEndpoint(/* value */);  // Set endpoint
model.setCompletionWindow(/* value */);  // Set completion_window
model.setMetadata(/* value */);  // Set metadata

// Serialize to JSON
nlohmann::json json = models::CreateBatchRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateBatchRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateChatCompletionFunctionResponse

```cpp
// Create a model
auto model = models::CreateChatCompletionFunctionResponse();
model.setId(/* value */);  // Set id
model.setChoices(/* value */);  // Set choices
model.setCreated(/* value */);  // Set created
model.setModel(/* value */);  // Set model
model.setSystemFingerprint(/* value */);  // Set system_fingerprint
model.setObject(/* value */);  // Set object
model.setUsage(/* value */);  // Set usage

// Serialize to JSON
nlohmann::json json = models::CreateChatCompletionFunctionResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateChatCompletionFunctionResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateChatCompletionFunctionResponseChoicesInner

```cpp
// Create a model
auto model = models::CreateChatCompletionFunctionResponseChoicesInner();
model.setFinishReason(/* value */);  // Set finish_reason
model.setIndex(/* value */);  // Set index
model.setMessage(/* value */);  // Set message

// Serialize to JSON
nlohmann::json json = models::CreateChatCompletionFunctionResponseChoicesInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateChatCompletionFunctionResponseChoicesInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateChatCompletionRequest

```cpp
// Create a model
auto model = models::CreateChatCompletionRequest();
model.setMessages(/* value */);  // Set messages
model.setModel(/* value */);  // Set model
model.setStore(/* value */);  // Set store
model.setReasoningEffort(/* value */);  // Set reasoning_effort
model.setMetadata(/* value */);  // Set metadata
model.setFrequencyPenalty(/* value */);  // Set frequency_penalty
model.setLogitBias(/* value */);  // Set logit_bias
model.setLogprobs(/* value */);  // Set logprobs
model.setTopLogprobs(/* value */);  // Set top_logprobs
model.setMaxTokens(/* value */);  // Set max_tokens
model.setMaxCompletionTokens(/* value */);  // Set max_completion_tokens
model.setN(/* value */);  // Set n
model.setModalities(/* value */);  // Set modalities
model.setPrediction(/* value */);  // Set prediction
model.setAudio(/* value */);  // Set audio
model.setPresencePenalty(/* value */);  // Set presence_penalty
model.setResponseFormat(/* value */);  // Set response_format
model.setSeed(/* value */);  // Set seed
model.setServiceTier(/* value */);  // Set service_tier
model.setStop(/* value */);  // Set stop
model.setStream(/* value */);  // Set stream
model.setStreamOptions(/* value */);  // Set stream_options
model.setTemperature(/* value */);  // Set temperature
model.setTopP(/* value */);  // Set top_p
model.setTools(/* value */);  // Set tools
model.setToolChoice(/* value */);  // Set tool_choice
model.setParallelToolCalls(/* value */);  // Set parallel_tool_calls
model.setUser(/* value */);  // Set user
model.setFunctionCall(/* value */);  // Set function_call
model.setFunctions(/* value */);  // Set functions

// Serialize to JSON
nlohmann::json json = models::CreateChatCompletionRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateChatCompletionRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateChatCompletionRequestAudio

```cpp
// Create a model
auto model = models::CreateChatCompletionRequestAudio();
model.setVoice(/* value */);  // Set voice
model.setFormat(/* value */);  // Set format

// Serialize to JSON
nlohmann::json json = models::CreateChatCompletionRequestAudio::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateChatCompletionRequestAudio::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateChatCompletionRequestFunctionCall

```cpp
// Create a model
auto model = models::CreateChatCompletionRequestFunctionCall();
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::CreateChatCompletionRequestFunctionCall::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateChatCompletionRequestFunctionCall::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateChatCompletionRequestModel

```cpp
// Create a model
auto model = models::CreateChatCompletionRequestModel();

// Serialize to JSON
nlohmann::json json = models::CreateChatCompletionRequestModel::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateChatCompletionRequestModel::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateChatCompletionRequestResponseFormat

```cpp
// Create a model
auto model = models::CreateChatCompletionRequestResponseFormat();
model.setType(/* value */);  // Set type
model.setJsonSchema(/* value */);  // Set json_schema

// Serialize to JSON
nlohmann::json json = models::CreateChatCompletionRequestResponseFormat::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateChatCompletionRequestResponseFormat::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateChatCompletionRequestStop

```cpp
// Create a model
auto model = models::CreateChatCompletionRequestStop();

// Serialize to JSON
nlohmann::json json = models::CreateChatCompletionRequestStop::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateChatCompletionRequestStop::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateChatCompletionResponse

```cpp
// Create a model
auto model = models::CreateChatCompletionResponse();
model.setId(/* value */);  // Set id
model.setChoices(/* value */);  // Set choices
model.setCreated(/* value */);  // Set created
model.setModel(/* value */);  // Set model
model.setServiceTier(/* value */);  // Set service_tier
model.setSystemFingerprint(/* value */);  // Set system_fingerprint
model.setObject(/* value */);  // Set object
model.setUsage(/* value */);  // Set usage

// Serialize to JSON
nlohmann::json json = models::CreateChatCompletionResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateChatCompletionResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateChatCompletionResponseChoicesInner

```cpp
// Create a model
auto model = models::CreateChatCompletionResponseChoicesInner();
model.setFinishReason(/* value */);  // Set finish_reason
model.setIndex(/* value */);  // Set index
model.setMessage(/* value */);  // Set message
model.setLogprobs(/* value */);  // Set logprobs

// Serialize to JSON
nlohmann::json json = models::CreateChatCompletionResponseChoicesInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateChatCompletionResponseChoicesInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateChatCompletionResponseChoicesInnerLogprobs

```cpp
// Create a model
auto model = models::CreateChatCompletionResponseChoicesInnerLogprobs();
model.setContent(/* value */);  // Set content
model.setRefusal(/* value */);  // Set refusal

// Serialize to JSON
nlohmann::json json = models::CreateChatCompletionResponseChoicesInnerLogprobs::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateChatCompletionResponseChoicesInnerLogprobs::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateChatCompletionStreamResponse

```cpp
// Create a model
auto model = models::CreateChatCompletionStreamResponse();
model.setId(/* value */);  // Set id
model.setChoices(/* value */);  // Set choices
model.setCreated(/* value */);  // Set created
model.setModel(/* value */);  // Set model
model.setServiceTier(/* value */);  // Set service_tier
model.setSystemFingerprint(/* value */);  // Set system_fingerprint
model.setObject(/* value */);  // Set object
model.setUsage(/* value */);  // Set usage

// Serialize to JSON
nlohmann::json json = models::CreateChatCompletionStreamResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateChatCompletionStreamResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateChatCompletionStreamResponseChoicesInner

```cpp
// Create a model
auto model = models::CreateChatCompletionStreamResponseChoicesInner();
model.setDelta(/* value */);  // Set delta
model.setLogprobs(/* value */);  // Set logprobs
model.setFinishReason(/* value */);  // Set finish_reason
model.setIndex(/* value */);  // Set index

// Serialize to JSON
nlohmann::json json = models::CreateChatCompletionStreamResponseChoicesInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateChatCompletionStreamResponseChoicesInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateChatCompletionStreamResponseChoicesInnerLogprobs

```cpp
// Create a model
auto model = models::CreateChatCompletionStreamResponseChoicesInnerLogprobs();
model.setContent(/* value */);  // Set content
model.setRefusal(/* value */);  // Set refusal

// Serialize to JSON
nlohmann::json json = models::CreateChatCompletionStreamResponseChoicesInnerLogprobs::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateChatCompletionStreamResponseChoicesInnerLogprobs::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateChatCompletionStreamResponseUsage

```cpp
// Create a model
auto model = models::CreateChatCompletionStreamResponseUsage();
model.setCompletionTokens(/* value */);  // Set completion_tokens
model.setPromptTokens(/* value */);  // Set prompt_tokens
model.setTotalTokens(/* value */);  // Set total_tokens

// Serialize to JSON
nlohmann::json json = models::CreateChatCompletionStreamResponseUsage::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateChatCompletionStreamResponseUsage::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateCompletionRequest

```cpp
// Create a model
auto model = models::CreateCompletionRequest();
model.setModel(/* value */);  // Set model
model.setPrompt(/* value */);  // Set prompt
model.setBestOf(/* value */);  // Set best_of
model.setEcho(/* value */);  // Set echo
model.setFrequencyPenalty(/* value */);  // Set frequency_penalty
model.setLogitBias(/* value */);  // Set logit_bias
model.setLogprobs(/* value */);  // Set logprobs
model.setMaxTokens(/* value */);  // Set max_tokens
model.setN(/* value */);  // Set n
model.setPresencePenalty(/* value */);  // Set presence_penalty
model.setSeed(/* value */);  // Set seed
model.setStop(/* value */);  // Set stop
model.setStream(/* value */);  // Set stream
model.setStreamOptions(/* value */);  // Set stream_options
model.setSuffix(/* value */);  // Set suffix
model.setTemperature(/* value */);  // Set temperature
model.setTopP(/* value */);  // Set top_p
model.setUser(/* value */);  // Set user

// Serialize to JSON
nlohmann::json json = models::CreateCompletionRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateCompletionRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateCompletionRequestModel

```cpp
// Create a model
auto model = models::CreateCompletionRequestModel();

// Serialize to JSON
nlohmann::json json = models::CreateCompletionRequestModel::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateCompletionRequestModel::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateCompletionRequestPrompt

```cpp
// Create a model
auto model = models::CreateCompletionRequestPrompt();

// Serialize to JSON
nlohmann::json json = models::CreateCompletionRequestPrompt::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateCompletionRequestPrompt::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateCompletionRequestStop

```cpp
// Create a model
auto model = models::CreateCompletionRequestStop();

// Serialize to JSON
nlohmann::json json = models::CreateCompletionRequestStop::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateCompletionRequestStop::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateCompletionResponse

```cpp
// Create a model
auto model = models::CreateCompletionResponse();
model.setId(/* value */);  // Set id
model.setChoices(/* value */);  // Set choices
model.setCreated(/* value */);  // Set created
model.setModel(/* value */);  // Set model
model.setSystemFingerprint(/* value */);  // Set system_fingerprint
model.setObject(/* value */);  // Set object
model.setUsage(/* value */);  // Set usage

// Serialize to JSON
nlohmann::json json = models::CreateCompletionResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateCompletionResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateCompletionResponseChoicesInner

```cpp
// Create a model
auto model = models::CreateCompletionResponseChoicesInner();
model.setFinishReason(/* value */);  // Set finish_reason
model.setIndex(/* value */);  // Set index
model.setLogprobs(/* value */);  // Set logprobs
model.setText(/* value */);  // Set text

// Serialize to JSON
nlohmann::json json = models::CreateCompletionResponseChoicesInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateCompletionResponseChoicesInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateCompletionResponseChoicesInnerLogprobs

```cpp
// Create a model
auto model = models::CreateCompletionResponseChoicesInnerLogprobs();
model.setTextOffset(/* value */);  // Set text_offset
model.setTokenLogprobs(/* value */);  // Set token_logprobs
model.setTokens(/* value */);  // Set tokens
model.setTopLogprobs(/* value */);  // Set top_logprobs

// Serialize to JSON
nlohmann::json json = models::CreateCompletionResponseChoicesInnerLogprobs::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateCompletionResponseChoicesInnerLogprobs::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateEmbeddingRequest

```cpp
// Create a model
auto model = models::CreateEmbeddingRequest();
model.setInput(/* value */);  // Set input
model.setModel(/* value */);  // Set model
model.setEncodingFormat(/* value */);  // Set encoding_format
model.setDimensions(/* value */);  // Set dimensions
model.setUser(/* value */);  // Set user

// Serialize to JSON
nlohmann::json json = models::CreateEmbeddingRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateEmbeddingRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateEmbeddingRequestInput

```cpp
// Create a model
auto model = models::CreateEmbeddingRequestInput();

// Serialize to JSON
nlohmann::json json = models::CreateEmbeddingRequestInput::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateEmbeddingRequestInput::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateEmbeddingRequestModel

```cpp
// Create a model
auto model = models::CreateEmbeddingRequestModel();

// Serialize to JSON
nlohmann::json json = models::CreateEmbeddingRequestModel::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateEmbeddingRequestModel::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateEmbeddingResponse

```cpp
// Create a model
auto model = models::CreateEmbeddingResponse();
model.setData(/* value */);  // Set data
model.setModel(/* value */);  // Set model
model.setObject(/* value */);  // Set object
model.setUsage(/* value */);  // Set usage

// Serialize to JSON
nlohmann::json json = models::CreateEmbeddingResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateEmbeddingResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateEmbeddingResponseUsage

```cpp
// Create a model
auto model = models::CreateEmbeddingResponseUsage();
model.setPromptTokens(/* value */);  // Set prompt_tokens
model.setTotalTokens(/* value */);  // Set total_tokens

// Serialize to JSON
nlohmann::json json = models::CreateEmbeddingResponseUsage::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateEmbeddingResponseUsage::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateFineTuningJobRequest

```cpp
// Create a model
auto model = models::CreateFineTuningJobRequest();
model.setModel(/* value */);  // Set model
model.setTrainingFile(/* value */);  // Set training_file
model.setHyperparameters(/* value */);  // Set hyperparameters
model.setSuffix(/* value */);  // Set suffix
model.setValidationFile(/* value */);  // Set validation_file
model.setIntegrations(/* value */);  // Set integrations
model.setSeed(/* value */);  // Set seed
model.setMethod(/* value */);  // Set method

// Serialize to JSON
nlohmann::json json = models::CreateFineTuningJobRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateFineTuningJobRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateFineTuningJobRequestHyperparameters

```cpp
// Create a model
auto model = models::CreateFineTuningJobRequestHyperparameters();
model.setBatchSize(/* value */);  // Set batch_size
model.setLearningRateMultiplier(/* value */);  // Set learning_rate_multiplier
model.setNEpochs(/* value */);  // Set n_epochs

// Serialize to JSON
nlohmann::json json = models::CreateFineTuningJobRequestHyperparameters::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateFineTuningJobRequestHyperparameters::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateFineTuningJobRequestHyperparametersBatchSize

```cpp
// Create a model
auto model = models::CreateFineTuningJobRequestHyperparametersBatchSize();

// Serialize to JSON
nlohmann::json json = models::CreateFineTuningJobRequestHyperparametersBatchSize::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateFineTuningJobRequestHyperparametersBatchSize::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateFineTuningJobRequestHyperparametersLearningRateMultiplier

```cpp
// Create a model
auto model = models::CreateFineTuningJobRequestHyperparametersLearningRateMultiplier();

// Serialize to JSON
nlohmann::json json = models::CreateFineTuningJobRequestHyperparametersLearningRateMultiplier::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateFineTuningJobRequestHyperparametersLearningRateMultiplier::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateFineTuningJobRequestHyperparametersNEpochs

```cpp
// Create a model
auto model = models::CreateFineTuningJobRequestHyperparametersNEpochs();

// Serialize to JSON
nlohmann::json json = models::CreateFineTuningJobRequestHyperparametersNEpochs::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateFineTuningJobRequestHyperparametersNEpochs::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateFineTuningJobRequestIntegrationsInner

```cpp
// Create a model
auto model = models::CreateFineTuningJobRequestIntegrationsInner();
model.setType(/* value */);  // Set type
model.setWandb(/* value */);  // Set wandb

// Serialize to JSON
nlohmann::json json = models::CreateFineTuningJobRequestIntegrationsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateFineTuningJobRequestIntegrationsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateFineTuningJobRequestIntegrationsInnerWandb

```cpp
// Create a model
auto model = models::CreateFineTuningJobRequestIntegrationsInnerWandb();
model.setProject(/* value */);  // Set project
model.setName(/* value */);  // Set name
model.setEntity(/* value */);  // Set entity
model.setTags(/* value */);  // Set tags

// Serialize to JSON
nlohmann::json json = models::CreateFineTuningJobRequestIntegrationsInnerWandb::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateFineTuningJobRequestIntegrationsInnerWandb::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateFineTuningJobRequestModel

```cpp
// Create a model
auto model = models::CreateFineTuningJobRequestModel();

// Serialize to JSON
nlohmann::json json = models::CreateFineTuningJobRequestModel::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateFineTuningJobRequestModel::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateImageEditRequestModel

```cpp
// Create a model
auto model = models::CreateImageEditRequestModel();

// Serialize to JSON
nlohmann::json json = models::CreateImageEditRequestModel::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateImageEditRequestModel::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateImageRequest

```cpp
// Create a model
auto model = models::CreateImageRequest();
model.setPrompt(/* value */);  // Set prompt
model.setModel(/* value */);  // Set model
model.setN(/* value */);  // Set n
model.setQuality(/* value */);  // Set quality
model.setResponseFormat(/* value */);  // Set response_format
model.setSize(/* value */);  // Set size
model.setStyle(/* value */);  // Set style
model.setUser(/* value */);  // Set user

// Serialize to JSON
nlohmann::json json = models::CreateImageRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateImageRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateImageRequestModel

```cpp
// Create a model
auto model = models::CreateImageRequestModel();

// Serialize to JSON
nlohmann::json json = models::CreateImageRequestModel::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateImageRequestModel::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateImageVariationRequestModel

```cpp
// Create a model
auto model = models::CreateImageVariationRequestModel();

// Serialize to JSON
nlohmann::json json = models::CreateImageVariationRequestModel::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateImageVariationRequestModel::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateMessageRequest

```cpp
// Create a model
auto model = models::CreateMessageRequest();
model.setRole(/* value */);  // Set role
model.setContent(/* value */);  // Set content
model.setAttachments(/* value */);  // Set attachments
model.setMetadata(/* value */);  // Set metadata

// Serialize to JSON
nlohmann::json json = models::CreateMessageRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateMessageRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateMessageRequestAttachmentsInner

```cpp
// Create a model
auto model = models::CreateMessageRequestAttachmentsInner();
model.setFileId(/* value */);  // Set file_id
model.setTools(/* value */);  // Set tools

// Serialize to JSON
nlohmann::json json = models::CreateMessageRequestAttachmentsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateMessageRequestAttachmentsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateMessageRequestAttachmentsInnerToolsInner

```cpp
// Create a model
auto model = models::CreateMessageRequestAttachmentsInnerToolsInner();
model.setType(/* value */);  // Set type

// Serialize to JSON
nlohmann::json json = models::CreateMessageRequestAttachmentsInnerToolsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateMessageRequestAttachmentsInnerToolsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateMessageRequestContent

```cpp
// Create a model
auto model = models::CreateMessageRequestContent();

// Serialize to JSON
nlohmann::json json = models::CreateMessageRequestContent::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateMessageRequestContent::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateModerationRequest

```cpp
// Create a model
auto model = models::CreateModerationRequest();
model.setInput(/* value */);  // Set input
model.setModel(/* value */);  // Set model

// Serialize to JSON
nlohmann::json json = models::CreateModerationRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateModerationRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateModerationRequestInput

```cpp
// Create a model
auto model = models::CreateModerationRequestInput();

// Serialize to JSON
nlohmann::json json = models::CreateModerationRequestInput::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateModerationRequestInput::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateModerationRequestInputOneOfInner

```cpp
// Create a model
auto model = models::CreateModerationRequestInputOneOfInner();
model.setType(/* value */);  // Set type
model.setImageUrl(/* value */);  // Set image_url
model.setText(/* value */);  // Set text

// Serialize to JSON
nlohmann::json json = models::CreateModerationRequestInputOneOfInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateModerationRequestInputOneOfInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateModerationRequestInputOneOfInnerOneOf

```cpp
// Create a model
auto model = models::CreateModerationRequestInputOneOfInnerOneOf();
model.setType(/* value */);  // Set type
model.setImageUrl(/* value */);  // Set image_url

// Serialize to JSON
nlohmann::json json = models::CreateModerationRequestInputOneOfInnerOneOf::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateModerationRequestInputOneOfInnerOneOf::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateModerationRequestInputOneOfInnerOneOf1

```cpp
// Create a model
auto model = models::CreateModerationRequestInputOneOfInnerOneOf1();
model.setType(/* value */);  // Set type
model.setText(/* value */);  // Set text

// Serialize to JSON
nlohmann::json json = models::CreateModerationRequestInputOneOfInnerOneOf1::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateModerationRequestInputOneOfInnerOneOf1::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateModerationRequestInputOneOfInnerOneOfImageUrl

```cpp
// Create a model
auto model = models::CreateModerationRequestInputOneOfInnerOneOfImageUrl();
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::CreateModerationRequestInputOneOfInnerOneOfImageUrl::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateModerationRequestInputOneOfInnerOneOfImageUrl::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateModerationRequestModel

```cpp
// Create a model
auto model = models::CreateModerationRequestModel();

// Serialize to JSON
nlohmann::json json = models::CreateModerationRequestModel::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateModerationRequestModel::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateModerationResponse

```cpp
// Create a model
auto model = models::CreateModerationResponse();
model.setId(/* value */);  // Set id
model.setModel(/* value */);  // Set model
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::CreateModerationResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateModerationResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateModerationResponseResultsInner

```cpp
// Create a model
auto model = models::CreateModerationResponseResultsInner();
model.setFlagged(/* value */);  // Set flagged
model.setCategories(/* value */);  // Set categories
model.setCategoryScores(/* value */);  // Set category_scores
model.setCategoryAppliedInputTypes(/* value */);  // Set category_applied_input_types

// Serialize to JSON
nlohmann::json json = models::CreateModerationResponseResultsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateModerationResponseResultsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateModerationResponseResultsInnerCategories

```cpp
// Create a model
auto model = models::CreateModerationResponseResultsInnerCategories();
model.setHate(/* value */);  // Set hate
model.setHateThreatening(/* value */);  // Set hate/threatening
model.setHarassment(/* value */);  // Set harassment
model.setHarassmentThreatening(/* value */);  // Set harassment/threatening
model.setIllicit(/* value */);  // Set illicit
model.setIllicitViolent(/* value */);  // Set illicit/violent
model.setSelfHarm(/* value */);  // Set self-harm
model.setSelfHarmIntent(/* value */);  // Set self-harm/intent
model.setSelfHarmInstructions(/* value */);  // Set self-harm/instructions
model.setSexual(/* value */);  // Set sexual
model.setSexualMinors(/* value */);  // Set sexual/minors
model.setViolence(/* value */);  // Set violence
model.setViolenceGraphic(/* value */);  // Set violence/graphic

// Serialize to JSON
nlohmann::json json = models::CreateModerationResponseResultsInnerCategories::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateModerationResponseResultsInnerCategories::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateModerationResponseResultsInnerCategoryAppliedInputTypes

```cpp
// Create a model
auto model = models::CreateModerationResponseResultsInnerCategoryAppliedInputTypes();
model.setHate(/* value */);  // Set hate
model.setHateThreatening(/* value */);  // Set hate/threatening
model.setHarassment(/* value */);  // Set harassment
model.setHarassmentThreatening(/* value */);  // Set harassment/threatening
model.setIllicit(/* value */);  // Set illicit
model.setIllicitViolent(/* value */);  // Set illicit/violent
model.setSelfHarm(/* value */);  // Set self-harm
model.setSelfHarmIntent(/* value */);  // Set self-harm/intent
model.setSelfHarmInstructions(/* value */);  // Set self-harm/instructions
model.setSexual(/* value */);  // Set sexual
model.setSexualMinors(/* value */);  // Set sexual/minors
model.setViolence(/* value */);  // Set violence
model.setViolenceGraphic(/* value */);  // Set violence/graphic

// Serialize to JSON
nlohmann::json json = models::CreateModerationResponseResultsInnerCategoryAppliedInputTypes::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateModerationResponseResultsInnerCategoryAppliedInputTypes::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateModerationResponseResultsInnerCategoryScores

```cpp
// Create a model
auto model = models::CreateModerationResponseResultsInnerCategoryScores();
model.setHate(/* value */);  // Set hate
model.setHateThreatening(/* value */);  // Set hate/threatening
model.setHarassment(/* value */);  // Set harassment
model.setHarassmentThreatening(/* value */);  // Set harassment/threatening
model.setIllicit(/* value */);  // Set illicit
model.setIllicitViolent(/* value */);  // Set illicit/violent
model.setSelfHarm(/* value */);  // Set self-harm
model.setSelfHarmIntent(/* value */);  // Set self-harm/intent
model.setSelfHarmInstructions(/* value */);  // Set self-harm/instructions
model.setSexual(/* value */);  // Set sexual
model.setSexualMinors(/* value */);  // Set sexual/minors
model.setViolence(/* value */);  // Set violence
model.setViolenceGraphic(/* value */);  // Set violence/graphic

// Serialize to JSON
nlohmann::json json = models::CreateModerationResponseResultsInnerCategoryScores::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateModerationResponseResultsInnerCategoryScores::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateRunRequest

```cpp
// Create a model
auto model = models::CreateRunRequest();
model.setAssistantId(/* value */);  // Set assistant_id
model.setModel(/* value */);  // Set model
model.setInstructions(/* value */);  // Set instructions
model.setAdditionalInstructions(/* value */);  // Set additional_instructions
model.setAdditionalMessages(/* value */);  // Set additional_messages
model.setTools(/* value */);  // Set tools
model.setMetadata(/* value */);  // Set metadata
model.setTemperature(/* value */);  // Set temperature
model.setTopP(/* value */);  // Set top_p
model.setStream(/* value */);  // Set stream
model.setMaxPromptTokens(/* value */);  // Set max_prompt_tokens
model.setMaxCompletionTokens(/* value */);  // Set max_completion_tokens
model.setTruncationStrategy(/* value */);  // Set truncation_strategy
model.setToolChoice(/* value */);  // Set tool_choice
model.setParallelToolCalls(/* value */);  // Set parallel_tool_calls
model.setResponseFormat(/* value */);  // Set response_format

// Serialize to JSON
nlohmann::json json = models::CreateRunRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateRunRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateRunRequestModel

```cpp
// Create a model
auto model = models::CreateRunRequestModel();

// Serialize to JSON
nlohmann::json json = models::CreateRunRequestModel::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateRunRequestModel::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateRunRequestToolsInner

```cpp
// Create a model
auto model = models::CreateRunRequestToolsInner();
model.setType(/* value */);  // Set type
model.setFileSearch(/* value */);  // Set file_search
model.setFunction(/* value */);  // Set function

// Serialize to JSON
nlohmann::json json = models::CreateRunRequestToolsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateRunRequestToolsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateSpeechRequest

```cpp
// Create a model
auto model = models::CreateSpeechRequest();
model.setModel(/* value */);  // Set model
model.setInput(/* value */);  // Set input
model.setVoice(/* value */);  // Set voice
model.setResponseFormat(/* value */);  // Set response_format
model.setSpeed(/* value */);  // Set speed

// Serialize to JSON
nlohmann::json json = models::CreateSpeechRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateSpeechRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateSpeechRequestModel

```cpp
// Create a model
auto model = models::CreateSpeechRequestModel();

// Serialize to JSON
nlohmann::json json = models::CreateSpeechRequestModel::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateSpeechRequestModel::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateThreadAndRunRequest

```cpp
// Create a model
auto model = models::CreateThreadAndRunRequest();
model.setAssistantId(/* value */);  // Set assistant_id
model.setThread(/* value */);  // Set thread
model.setModel(/* value */);  // Set model
model.setInstructions(/* value */);  // Set instructions
model.setTools(/* value */);  // Set tools
model.setToolResources(/* value */);  // Set tool_resources
model.setMetadata(/* value */);  // Set metadata
model.setTemperature(/* value */);  // Set temperature
model.setTopP(/* value */);  // Set top_p
model.setStream(/* value */);  // Set stream
model.setMaxPromptTokens(/* value */);  // Set max_prompt_tokens
model.setMaxCompletionTokens(/* value */);  // Set max_completion_tokens
model.setTruncationStrategy(/* value */);  // Set truncation_strategy
model.setToolChoice(/* value */);  // Set tool_choice
model.setParallelToolCalls(/* value */);  // Set parallel_tool_calls
model.setResponseFormat(/* value */);  // Set response_format

// Serialize to JSON
nlohmann::json json = models::CreateThreadAndRunRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateThreadAndRunRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateThreadAndRunRequestModel

```cpp
// Create a model
auto model = models::CreateThreadAndRunRequestModel();

// Serialize to JSON
nlohmann::json json = models::CreateThreadAndRunRequestModel::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateThreadAndRunRequestModel::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateThreadAndRunRequestToolResources

```cpp
// Create a model
auto model = models::CreateThreadAndRunRequestToolResources();
model.setCodeInterpreter(/* value */);  // Set code_interpreter
model.setFileSearch(/* value */);  // Set file_search

// Serialize to JSON
nlohmann::json json = models::CreateThreadAndRunRequestToolResources::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateThreadAndRunRequestToolResources::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateThreadAndRunRequestToolResourcesCodeInterpreter

```cpp
// Create a model
auto model = models::CreateThreadAndRunRequestToolResourcesCodeInterpreter();
model.setFileIds(/* value */);  // Set file_ids

// Serialize to JSON
nlohmann::json json = models::CreateThreadAndRunRequestToolResourcesCodeInterpreter::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateThreadAndRunRequestToolResourcesCodeInterpreter::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateThreadAndRunRequestToolResourcesFileSearch

```cpp
// Create a model
auto model = models::CreateThreadAndRunRequestToolResourcesFileSearch();
model.setVectorStoreIds(/* value */);  // Set vector_store_ids

// Serialize to JSON
nlohmann::json json = models::CreateThreadAndRunRequestToolResourcesFileSearch::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateThreadAndRunRequestToolResourcesFileSearch::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateThreadAndRunRequestToolsInner

```cpp
// Create a model
auto model = models::CreateThreadAndRunRequestToolsInner();
model.setType(/* value */);  // Set type
model.setFileSearch(/* value */);  // Set file_search
model.setFunction(/* value */);  // Set function

// Serialize to JSON
nlohmann::json json = models::CreateThreadAndRunRequestToolsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateThreadAndRunRequestToolsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateThreadRequest

```cpp
// Create a model
auto model = models::CreateThreadRequest();
model.setMessages(/* value */);  // Set messages
model.setToolResources(/* value */);  // Set tool_resources
model.setMetadata(/* value */);  // Set metadata

// Serialize to JSON
nlohmann::json json = models::CreateThreadRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateThreadRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateThreadRequestToolResources

```cpp
// Create a model
auto model = models::CreateThreadRequestToolResources();
model.setCodeInterpreter(/* value */);  // Set code_interpreter
model.setFileSearch(/* value */);  // Set file_search

// Serialize to JSON
nlohmann::json json = models::CreateThreadRequestToolResources::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateThreadRequestToolResources::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateThreadRequestToolResourcesCodeInterpreter

```cpp
// Create a model
auto model = models::CreateThreadRequestToolResourcesCodeInterpreter();
model.setFileIds(/* value */);  // Set file_ids

// Serialize to JSON
nlohmann::json json = models::CreateThreadRequestToolResourcesCodeInterpreter::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateThreadRequestToolResourcesCodeInterpreter::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateThreadRequestToolResourcesFileSearch

```cpp
// Create a model
auto model = models::CreateThreadRequestToolResourcesFileSearch();
model.setVectorStoreIds(/* value */);  // Set vector_store_ids
model.setVectorStores(/* value */);  // Set vector_stores

// Serialize to JSON
nlohmann::json json = models::CreateThreadRequestToolResourcesFileSearch::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateThreadRequestToolResourcesFileSearch::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateThreadRequestToolResourcesFileSearchVectorStoresInner

```cpp
// Create a model
auto model = models::CreateThreadRequestToolResourcesFileSearchVectorStoresInner();
model.setFileIds(/* value */);  // Set file_ids
model.setChunkingStrategy(/* value */);  // Set chunking_strategy
model.setMetadata(/* value */);  // Set metadata

// Serialize to JSON
nlohmann::json json = models::CreateThreadRequestToolResourcesFileSearchVectorStoresInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateThreadRequestToolResourcesFileSearchVectorStoresInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateThreadRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy

```cpp
// Create a model
auto model = models::CreateThreadRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy();
model.setType(/* value */);  // Set type
model.setRStatic(/* value */);  // Set static

// Serialize to JSON
nlohmann::json json = models::CreateThreadRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateThreadRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateTranscription200Response

```cpp
// Create a model
auto model = models::CreateTranscription200Response();
model.setText(/* value */);  // Set text
model.setLanguage(/* value */);  // Set language
model.setDuration(/* value */);  // Set duration
model.setWords(/* value */);  // Set words
model.setSegments(/* value */);  // Set segments

// Serialize to JSON
nlohmann::json json = models::CreateTranscription200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateTranscription200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateTranscriptionRequestModel

```cpp
// Create a model
auto model = models::CreateTranscriptionRequestModel();

// Serialize to JSON
nlohmann::json json = models::CreateTranscriptionRequestModel::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateTranscriptionRequestModel::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateTranscriptionResponseJson

```cpp
// Create a model
auto model = models::CreateTranscriptionResponseJson();
model.setText(/* value */);  // Set text

// Serialize to JSON
nlohmann::json json = models::CreateTranscriptionResponseJson::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateTranscriptionResponseJson::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateTranscriptionResponseVerboseJson

```cpp
// Create a model
auto model = models::CreateTranscriptionResponseVerboseJson();
model.setLanguage(/* value */);  // Set language
model.setDuration(/* value */);  // Set duration
model.setText(/* value */);  // Set text
model.setWords(/* value */);  // Set words
model.setSegments(/* value */);  // Set segments

// Serialize to JSON
nlohmann::json json = models::CreateTranscriptionResponseVerboseJson::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateTranscriptionResponseVerboseJson::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateTranslation200Response

```cpp
// Create a model
auto model = models::CreateTranslation200Response();
model.setText(/* value */);  // Set text
model.setLanguage(/* value */);  // Set language
model.setDuration(/* value */);  // Set duration
model.setSegments(/* value */);  // Set segments

// Serialize to JSON
nlohmann::json json = models::CreateTranslation200Response::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateTranslation200Response::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateTranslationRequestModel

```cpp
// Create a model
auto model = models::CreateTranslationRequestModel();

// Serialize to JSON
nlohmann::json json = models::CreateTranslationRequestModel::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateTranslationRequestModel::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateTranslationResponseJson

```cpp
// Create a model
auto model = models::CreateTranslationResponseJson();
model.setText(/* value */);  // Set text

// Serialize to JSON
nlohmann::json json = models::CreateTranslationResponseJson::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateTranslationResponseJson::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateTranslationResponseVerboseJson

```cpp
// Create a model
auto model = models::CreateTranslationResponseVerboseJson();
model.setLanguage(/* value */);  // Set language
model.setDuration(/* value */);  // Set duration
model.setText(/* value */);  // Set text
model.setSegments(/* value */);  // Set segments

// Serialize to JSON
nlohmann::json json = models::CreateTranslationResponseVerboseJson::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateTranslationResponseVerboseJson::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateUploadRequest

```cpp
// Create a model
auto model = models::CreateUploadRequest();
model.setFilename(/* value */);  // Set filename
model.setPurpose(/* value */);  // Set purpose
model.setBytes(/* value */);  // Set bytes
model.setMimeType(/* value */);  // Set mime_type

// Serialize to JSON
nlohmann::json json = models::CreateUploadRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateUploadRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateVectorStoreFileBatchRequest

```cpp
// Create a model
auto model = models::CreateVectorStoreFileBatchRequest();
model.setFileIds(/* value */);  // Set file_ids
model.setChunkingStrategy(/* value */);  // Set chunking_strategy

// Serialize to JSON
nlohmann::json json = models::CreateVectorStoreFileBatchRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateVectorStoreFileBatchRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateVectorStoreFileRequest

```cpp
// Create a model
auto model = models::CreateVectorStoreFileRequest();
model.setFileId(/* value */);  // Set file_id
model.setChunkingStrategy(/* value */);  // Set chunking_strategy

// Serialize to JSON
nlohmann::json json = models::CreateVectorStoreFileRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateVectorStoreFileRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateVectorStoreRequest

```cpp
// Create a model
auto model = models::CreateVectorStoreRequest();
model.setFileIds(/* value */);  // Set file_ids
model.setName(/* value */);  // Set name
model.setExpiresAfter(/* value */);  // Set expires_after
model.setChunkingStrategy(/* value */);  // Set chunking_strategy
model.setMetadata(/* value */);  // Set metadata

// Serialize to JSON
nlohmann::json json = models::CreateVectorStoreRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateVectorStoreRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CreateVectorStoreRequestChunkingStrategy

```cpp
// Create a model
auto model = models::CreateVectorStoreRequestChunkingStrategy();
model.setType(/* value */);  // Set type
model.setRStatic(/* value */);  // Set static

// Serialize to JSON
nlohmann::json json = models::CreateVectorStoreRequestChunkingStrategy::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CreateVectorStoreRequestChunkingStrategy::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DefaultProjectErrorResponse

```cpp
// Create a model
auto model = models::DefaultProjectErrorResponse();
model.setCode(/* value */);  // Set code
model.setMessage(/* value */);  // Set message

// Serialize to JSON
nlohmann::json json = models::DefaultProjectErrorResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DefaultProjectErrorResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DeleteAssistantResponse

```cpp
// Create a model
auto model = models::DeleteAssistantResponse();
model.setId(/* value */);  // Set id
model.setDeleted(/* value */);  // Set deleted
model.setObject(/* value */);  // Set object

// Serialize to JSON
nlohmann::json json = models::DeleteAssistantResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DeleteAssistantResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DeleteFileResponse

```cpp
// Create a model
auto model = models::DeleteFileResponse();
model.setId(/* value */);  // Set id
model.setObject(/* value */);  // Set object
model.setDeleted(/* value */);  // Set deleted

// Serialize to JSON
nlohmann::json json = models::DeleteFileResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DeleteFileResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DeleteMessageResponse

```cpp
// Create a model
auto model = models::DeleteMessageResponse();
model.setId(/* value */);  // Set id
model.setDeleted(/* value */);  // Set deleted
model.setObject(/* value */);  // Set object

// Serialize to JSON
nlohmann::json json = models::DeleteMessageResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DeleteMessageResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DeleteModelResponse

```cpp
// Create a model
auto model = models::DeleteModelResponse();
model.setId(/* value */);  // Set id
model.setDeleted(/* value */);  // Set deleted
model.setObject(/* value */);  // Set object

// Serialize to JSON
nlohmann::json json = models::DeleteModelResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DeleteModelResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DeleteThreadResponse

```cpp
// Create a model
auto model = models::DeleteThreadResponse();
model.setId(/* value */);  // Set id
model.setDeleted(/* value */);  // Set deleted
model.setObject(/* value */);  // Set object

// Serialize to JSON
nlohmann::json json = models::DeleteThreadResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DeleteThreadResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DeleteVectorStoreFileResponse

```cpp
// Create a model
auto model = models::DeleteVectorStoreFileResponse();
model.setId(/* value */);  // Set id
model.setDeleted(/* value */);  // Set deleted
model.setObject(/* value */);  // Set object

// Serialize to JSON
nlohmann::json json = models::DeleteVectorStoreFileResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DeleteVectorStoreFileResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DeleteVectorStoreResponse

```cpp
// Create a model
auto model = models::DeleteVectorStoreResponse();
model.setId(/* value */);  // Set id
model.setDeleted(/* value */);  // Set deleted
model.setObject(/* value */);  // Set object

// Serialize to JSON
nlohmann::json json = models::DeleteVectorStoreResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DeleteVectorStoreResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::DoneEvent

```cpp
// Create a model
auto model = models::DoneEvent();
model.setEvent(/* value */);  // Set event
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::DoneEvent::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::DoneEvent::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Embedding

```cpp
// Create a model
auto model = models::Embedding();
model.setIndex(/* value */);  // Set index
model.setEmbedding(/* value */);  // Set embedding
model.setObject(/* value */);  // Set object

// Serialize to JSON
nlohmann::json json = models::Embedding::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Embedding::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Error

```cpp
// Create a model
auto model = models::Error();
model.setCode(/* value */);  // Set code
model.setMessage(/* value */);  // Set message
model.setParam(/* value */);  // Set param
model.setType(/* value */);  // Set type

// Serialize to JSON
nlohmann::json json = models::Error::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Error::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ErrorEvent

```cpp
// Create a model
auto model = models::ErrorEvent();
model.setEvent(/* value */);  // Set event
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::ErrorEvent::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ErrorEvent::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ErrorResponse

```cpp
// Create a model
auto model = models::ErrorResponse();
model.setError(/* value */);  // Set error

// Serialize to JSON
nlohmann::json json = models::ErrorResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ErrorResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FileSearchToolCallRankingOptions

```cpp
// Create a model
auto model = models::FileSearchToolCallRankingOptions();
model.setRanker(/* value */);  // Set ranker
model.setScoreThreshold(/* value */);  // Set score_threshold

// Serialize to JSON
nlohmann::json json = models::FileSearchToolCallRankingOptions::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FileSearchToolCallRankingOptions::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTuneChatCompletionRequestAssistantMessage

```cpp
// Create a model
auto model = models::FineTuneChatCompletionRequestAssistantMessage();
model.setWeight(/* value */);  // Set weight

// Serialize to JSON
nlohmann::json json = models::FineTuneChatCompletionRequestAssistantMessage::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTuneChatCompletionRequestAssistantMessage::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTuneChatRequestInput

```cpp
// Create a model
auto model = models::FineTuneChatRequestInput();
model.setMessages(/* value */);  // Set messages
model.setTools(/* value */);  // Set tools
model.setParallelToolCalls(/* value */);  // Set parallel_tool_calls
model.setFunctions(/* value */);  // Set functions

// Serialize to JSON
nlohmann::json json = models::FineTuneChatRequestInput::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTuneChatRequestInput::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTuneChatRequestInputMessagesInner

```cpp
// Create a model
auto model = models::FineTuneChatRequestInputMessagesInner();
model.setContent(/* value */);  // Set content
model.setRole(/* value */);  // Set role
model.setName(/* value */);  // Set name
model.setWeight(/* value */);  // Set weight
model.setRefusal(/* value */);  // Set refusal
model.setAudio(/* value */);  // Set audio
model.setToolCalls(/* value */);  // Set tool_calls
model.setFunctionCall(/* value */);  // Set function_call
model.setToolCallId(/* value */);  // Set tool_call_id

// Serialize to JSON
nlohmann::json json = models::FineTuneChatRequestInputMessagesInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTuneChatRequestInputMessagesInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTuneCompletionRequestInput

```cpp
// Create a model
auto model = models::FineTuneCompletionRequestInput();
model.setPrompt(/* value */);  // Set prompt
model.setCompletion(/* value */);  // Set completion

// Serialize to JSON
nlohmann::json json = models::FineTuneCompletionRequestInput::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTuneCompletionRequestInput::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTuneDPOMethod

```cpp
// Create a model
auto model = models::FineTuneDPOMethod();
model.setHyperparameters(/* value */);  // Set hyperparameters

// Serialize to JSON
nlohmann::json json = models::FineTuneDPOMethod::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTuneDPOMethod::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTuneDPOMethodHyperparameters

```cpp
// Create a model
auto model = models::FineTuneDPOMethodHyperparameters();
model.setBeta(/* value */);  // Set beta
model.setBatchSize(/* value */);  // Set batch_size
model.setLearningRateMultiplier(/* value */);  // Set learning_rate_multiplier
model.setNEpochs(/* value */);  // Set n_epochs

// Serialize to JSON
nlohmann::json json = models::FineTuneDPOMethodHyperparameters::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTuneDPOMethodHyperparameters::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTuneDPOMethodHyperparametersBatchSize

```cpp
// Create a model
auto model = models::FineTuneDPOMethodHyperparametersBatchSize();

// Serialize to JSON
nlohmann::json json = models::FineTuneDPOMethodHyperparametersBatchSize::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTuneDPOMethodHyperparametersBatchSize::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTuneDPOMethodHyperparametersBeta

```cpp
// Create a model
auto model = models::FineTuneDPOMethodHyperparametersBeta();

// Serialize to JSON
nlohmann::json json = models::FineTuneDPOMethodHyperparametersBeta::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTuneDPOMethodHyperparametersBeta::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTuneDPOMethodHyperparametersLearningRateMultiplier

```cpp
// Create a model
auto model = models::FineTuneDPOMethodHyperparametersLearningRateMultiplier();

// Serialize to JSON
nlohmann::json json = models::FineTuneDPOMethodHyperparametersLearningRateMultiplier::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTuneDPOMethodHyperparametersLearningRateMultiplier::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTuneDPOMethodHyperparametersNEpochs

```cpp
// Create a model
auto model = models::FineTuneDPOMethodHyperparametersNEpochs();

// Serialize to JSON
nlohmann::json json = models::FineTuneDPOMethodHyperparametersNEpochs::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTuneDPOMethodHyperparametersNEpochs::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTuneMethod

```cpp
// Create a model
auto model = models::FineTuneMethod();
model.setType(/* value */);  // Set type
model.setSupervised(/* value */);  // Set supervised
model.setDpo(/* value */);  // Set dpo

// Serialize to JSON
nlohmann::json json = models::FineTuneMethod::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTuneMethod::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTunePreferenceRequestInput

```cpp
// Create a model
auto model = models::FineTunePreferenceRequestInput();
model.setInput(/* value */);  // Set input
model.setPreferredCompletion(/* value */);  // Set preferred_completion
model.setNonPreferredCompletion(/* value */);  // Set non_preferred_completion

// Serialize to JSON
nlohmann::json json = models::FineTunePreferenceRequestInput::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTunePreferenceRequestInput::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTunePreferenceRequestInputInput

```cpp
// Create a model
auto model = models::FineTunePreferenceRequestInputInput();
model.setMessages(/* value */);  // Set messages
model.setTools(/* value */);  // Set tools
model.setParallelToolCalls(/* value */);  // Set parallel_tool_calls

// Serialize to JSON
nlohmann::json json = models::FineTunePreferenceRequestInputInput::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTunePreferenceRequestInputInput::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTunePreferenceRequestInputInputMessagesInner

```cpp
// Create a model
auto model = models::FineTunePreferenceRequestInputInputMessagesInner();
model.setContent(/* value */);  // Set content
model.setRole(/* value */);  // Set role
model.setName(/* value */);  // Set name
model.setWeight(/* value */);  // Set weight
model.setRefusal(/* value */);  // Set refusal
model.setAudio(/* value */);  // Set audio
model.setToolCalls(/* value */);  // Set tool_calls
model.setFunctionCall(/* value */);  // Set function_call
model.setToolCallId(/* value */);  // Set tool_call_id

// Serialize to JSON
nlohmann::json json = models::FineTunePreferenceRequestInputInputMessagesInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTunePreferenceRequestInputInputMessagesInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTunePreferenceRequestInputNonPreferredCompletionInner

```cpp
// Create a model
auto model = models::FineTunePreferenceRequestInputNonPreferredCompletionInner();
model.setContent(/* value */);  // Set content
model.setRefusal(/* value */);  // Set refusal
model.setRole(/* value */);  // Set role
model.setName(/* value */);  // Set name
model.setAudio(/* value */);  // Set audio
model.setToolCalls(/* value */);  // Set tool_calls
model.setFunctionCall(/* value */);  // Set function_call

// Serialize to JSON
nlohmann::json json = models::FineTunePreferenceRequestInputNonPreferredCompletionInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTunePreferenceRequestInputNonPreferredCompletionInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTunePreferenceRequestInputPreferredCompletionInner

```cpp
// Create a model
auto model = models::FineTunePreferenceRequestInputPreferredCompletionInner();
model.setContent(/* value */);  // Set content
model.setRefusal(/* value */);  // Set refusal
model.setRole(/* value */);  // Set role
model.setName(/* value */);  // Set name
model.setAudio(/* value */);  // Set audio
model.setToolCalls(/* value */);  // Set tool_calls
model.setFunctionCall(/* value */);  // Set function_call

// Serialize to JSON
nlohmann::json json = models::FineTunePreferenceRequestInputPreferredCompletionInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTunePreferenceRequestInputPreferredCompletionInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTuneSupervisedMethod

```cpp
// Create a model
auto model = models::FineTuneSupervisedMethod();
model.setHyperparameters(/* value */);  // Set hyperparameters

// Serialize to JSON
nlohmann::json json = models::FineTuneSupervisedMethod::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTuneSupervisedMethod::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTuneSupervisedMethodHyperparameters

```cpp
// Create a model
auto model = models::FineTuneSupervisedMethodHyperparameters();
model.setBatchSize(/* value */);  // Set batch_size
model.setLearningRateMultiplier(/* value */);  // Set learning_rate_multiplier
model.setNEpochs(/* value */);  // Set n_epochs

// Serialize to JSON
nlohmann::json json = models::FineTuneSupervisedMethodHyperparameters::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTuneSupervisedMethodHyperparameters::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTuneSupervisedMethodHyperparametersBatchSize

```cpp
// Create a model
auto model = models::FineTuneSupervisedMethodHyperparametersBatchSize();

// Serialize to JSON
nlohmann::json json = models::FineTuneSupervisedMethodHyperparametersBatchSize::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTuneSupervisedMethodHyperparametersBatchSize::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTuneSupervisedMethodHyperparametersLearningRateMultiplier

```cpp
// Create a model
auto model = models::FineTuneSupervisedMethodHyperparametersLearningRateMultiplier();

// Serialize to JSON
nlohmann::json json = models::FineTuneSupervisedMethodHyperparametersLearningRateMultiplier::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTuneSupervisedMethodHyperparametersLearningRateMultiplier::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTuneSupervisedMethodHyperparametersNEpochs

```cpp
// Create a model
auto model = models::FineTuneSupervisedMethodHyperparametersNEpochs();

// Serialize to JSON
nlohmann::json json = models::FineTuneSupervisedMethodHyperparametersNEpochs::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTuneSupervisedMethodHyperparametersNEpochs::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTuningJobIntegration

```cpp
// Create a model
auto model = models::FineTuningJobIntegration();
model.setType(/* value */);  // Set type
model.setWandb(/* value */);  // Set wandb

// Serialize to JSON
nlohmann::json json = models::FineTuningJobIntegration::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTuningJobIntegration::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTuningIntegrationWandb

```cpp
// Create a model
auto model = models::FineTuningIntegrationWandb();
model.setProject(/* value */);  // Set project
model.setName(/* value */);  // Set name
model.setEntity(/* value */);  // Set entity
model.setTags(/* value */);  // Set tags

// Serialize to JSON
nlohmann::json json = models::FineTuningIntegrationWandb::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTuningIntegrationWandb::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTuningJob

```cpp
// Create a model
auto model = models::FineTuningJob();
model.setId(/* value */);  // Set id
model.setCreatedAt(/* value */);  // Set created_at
model.setError(/* value */);  // Set error
model.setFineTunedModel(/* value */);  // Set fine_tuned_model
model.setFinishedAt(/* value */);  // Set finished_at
model.setHyperparameters(/* value */);  // Set hyperparameters
model.setModel(/* value */);  // Set model
model.setObject(/* value */);  // Set object
model.setOrganizationId(/* value */);  // Set organization_id
model.setResultFiles(/* value */);  // Set result_files
model.setStatus(/* value */);  // Set status
model.setTrainedTokens(/* value */);  // Set trained_tokens
model.setTrainingFile(/* value */);  // Set training_file
model.setValidationFile(/* value */);  // Set validation_file
model.setIntegrations(/* value */);  // Set integrations
model.setSeed(/* value */);  // Set seed
model.setEstimatedFinish(/* value */);  // Set estimated_finish
model.setMethod(/* value */);  // Set method

// Serialize to JSON
nlohmann::json json = models::FineTuningJob::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTuningJob::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTuningJobCheckpoint

```cpp
// Create a model
auto model = models::FineTuningJobCheckpoint();
model.setId(/* value */);  // Set id
model.setCreatedAt(/* value */);  // Set created_at
model.setFineTunedModelCheckpoint(/* value */);  // Set fine_tuned_model_checkpoint
model.setStepNumber(/* value */);  // Set step_number
model.setMetrics(/* value */);  // Set metrics
model.setFineTuningJobId(/* value */);  // Set fine_tuning_job_id
model.setObject(/* value */);  // Set object

// Serialize to JSON
nlohmann::json json = models::FineTuningJobCheckpoint::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTuningJobCheckpoint::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTuningJobCheckpointMetrics

```cpp
// Create a model
auto model = models::FineTuningJobCheckpointMetrics();
model.setStep(/* value */);  // Set step
model.setTrainLoss(/* value */);  // Set train_loss
model.setTrainMeanTokenAccuracy(/* value */);  // Set train_mean_token_accuracy
model.setValidLoss(/* value */);  // Set valid_loss
model.setValidMeanTokenAccuracy(/* value */);  // Set valid_mean_token_accuracy
model.setFullValidLoss(/* value */);  // Set full_valid_loss
model.setFullValidMeanTokenAccuracy(/* value */);  // Set full_valid_mean_token_accuracy

// Serialize to JSON
nlohmann::json json = models::FineTuningJobCheckpointMetrics::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTuningJobCheckpointMetrics::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTuningJobError

```cpp
// Create a model
auto model = models::FineTuningJobError();
model.setCode(/* value */);  // Set code
model.setMessage(/* value */);  // Set message
model.setParam(/* value */);  // Set param

// Serialize to JSON
nlohmann::json json = models::FineTuningJobError::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTuningJobError::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTuningJobEvent

```cpp
// Create a model
auto model = models::FineTuningJobEvent();
model.setObject(/* value */);  // Set object
model.setId(/* value */);  // Set id
model.setCreatedAt(/* value */);  // Set created_at
model.setLevel(/* value */);  // Set level
model.setMessage(/* value */);  // Set message
model.setType(/* value */);  // Set type
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::FineTuningJobEvent::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTuningJobEvent::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTuningJobHyperparameters

```cpp
// Create a model
auto model = models::FineTuningJobHyperparameters();
model.setBatchSize(/* value */);  // Set batch_size
model.setLearningRateMultiplier(/* value */);  // Set learning_rate_multiplier
model.setNEpochs(/* value */);  // Set n_epochs

// Serialize to JSON
nlohmann::json json = models::FineTuningJobHyperparameters::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTuningJobHyperparameters::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTuningJobHyperparametersBatchSize

```cpp
// Create a model
auto model = models::FineTuningJobHyperparametersBatchSize();

// Serialize to JSON
nlohmann::json json = models::FineTuningJobHyperparametersBatchSize::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTuningJobHyperparametersBatchSize::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTuningJobHyperparametersLearningRateMultiplier

```cpp
// Create a model
auto model = models::FineTuningJobHyperparametersLearningRateMultiplier();

// Serialize to JSON
nlohmann::json json = models::FineTuningJobHyperparametersLearningRateMultiplier::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTuningJobHyperparametersLearningRateMultiplier::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTuningJobHyperparametersNEpochs

```cpp
// Create a model
auto model = models::FineTuningJobHyperparametersNEpochs();

// Serialize to JSON
nlohmann::json json = models::FineTuningJobHyperparametersNEpochs::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTuningJobHyperparametersNEpochs::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FineTuningJobIntegrationsInner

```cpp
// Create a model
auto model = models::FineTuningJobIntegrationsInner();
model.setType(/* value */);  // Set type
model.setWandb(/* value */);  // Set wandb

// Serialize to JSON
nlohmann::json json = models::FineTuningJobIntegrationsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FineTuningJobIntegrationsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FunctionObject

```cpp
// Create a model
auto model = models::FunctionObject();
model.setDescription(/* value */);  // Set description
model.setName(/* value */);  // Set name
model.setParameters(/* value */);  // Set parameters
model.setStrict(/* value */);  // Set strict

// Serialize to JSON
nlohmann::json json = models::FunctionObject::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FunctionObject::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Image

```cpp
// Create a model
auto model = models::Image();
model.setB64Json(/* value */);  // Set b64_json
model.setUrl(/* value */);  // Set url
model.setRevisedPrompt(/* value */);  // Set revised_prompt

// Serialize to JSON
nlohmann::json json = models::Image::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Image::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ImagesResponse

```cpp
// Create a model
auto model = models::ImagesResponse();
model.setCreated(/* value */);  // Set created
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::ImagesResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ImagesResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Invite

```cpp
// Create a model
auto model = models::Invite();
model.setObject(/* value */);  // Set object
model.setId(/* value */);  // Set id
model.setEmail(/* value */);  // Set email
model.setRole(/* value */);  // Set role
model.setStatus(/* value */);  // Set status
model.setInvitedAt(/* value */);  // Set invited_at
model.setExpiresAt(/* value */);  // Set expires_at
model.setAcceptedAt(/* value */);  // Set accepted_at
model.setProjects(/* value */);  // Set projects

// Serialize to JSON
nlohmann::json json = models::Invite::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Invite::fromJson(nlohmann::json::parse(jsonString));
```
#### models::InviteDeleteResponse

```cpp
// Create a model
auto model = models::InviteDeleteResponse();
model.setObject(/* value */);  // Set object
model.setId(/* value */);  // Set id
model.setDeleted(/* value */);  // Set deleted

// Serialize to JSON
nlohmann::json json = models::InviteDeleteResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::InviteDeleteResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::InviteListResponse

```cpp
// Create a model
auto model = models::InviteListResponse();
model.setObject(/* value */);  // Set object
model.setData(/* value */);  // Set data
model.setFirstId(/* value */);  // Set first_id
model.setLastId(/* value */);  // Set last_id
model.setHasMore(/* value */);  // Set has_more

// Serialize to JSON
nlohmann::json json = models::InviteListResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::InviteListResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::InviteProjectsInner

```cpp
// Create a model
auto model = models::InviteProjectsInner();
model.setId(/* value */);  // Set id
model.setRole(/* value */);  // Set role

// Serialize to JSON
nlohmann::json json = models::InviteProjectsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::InviteProjectsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::InviteRequest

```cpp
// Create a model
auto model = models::InviteRequest();
model.setEmail(/* value */);  // Set email
model.setRole(/* value */);  // Set role
model.setProjects(/* value */);  // Set projects

// Serialize to JSON
nlohmann::json json = models::InviteRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::InviteRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::InviteRequestProjectsInner

```cpp
// Create a model
auto model = models::InviteRequestProjectsInner();
model.setId(/* value */);  // Set id
model.setRole(/* value */);  // Set role

// Serialize to JSON
nlohmann::json json = models::InviteRequestProjectsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::InviteRequestProjectsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ListAssistantsResponse

```cpp
// Create a model
auto model = models::ListAssistantsResponse();
model.setObject(/* value */);  // Set object
model.setData(/* value */);  // Set data
model.setFirstId(/* value */);  // Set first_id
model.setLastId(/* value */);  // Set last_id
model.setHasMore(/* value */);  // Set has_more

// Serialize to JSON
nlohmann::json json = models::ListAssistantsResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ListAssistantsResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ListAuditLogsEffectiveAtParameter

```cpp
// Create a model
auto model = models::ListAuditLogsEffectiveAtParameter();
model.setGt(/* value */);  // Set gt
model.setGte(/* value */);  // Set gte
model.setLt(/* value */);  // Set lt
model.setLte(/* value */);  // Set lte

// Serialize to JSON
nlohmann::json json = models::ListAuditLogsEffectiveAtParameter::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ListAuditLogsEffectiveAtParameter::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ListAuditLogsResponse

```cpp
// Create a model
auto model = models::ListAuditLogsResponse();
model.setObject(/* value */);  // Set object
model.setData(/* value */);  // Set data
model.setFirstId(/* value */);  // Set first_id
model.setLastId(/* value */);  // Set last_id
model.setHasMore(/* value */);  // Set has_more

// Serialize to JSON
nlohmann::json json = models::ListAuditLogsResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ListAuditLogsResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ListBatchesResponse

```cpp
// Create a model
auto model = models::ListBatchesResponse();
model.setData(/* value */);  // Set data
model.setFirstId(/* value */);  // Set first_id
model.setLastId(/* value */);  // Set last_id
model.setHasMore(/* value */);  // Set has_more
model.setObject(/* value */);  // Set object

// Serialize to JSON
nlohmann::json json = models::ListBatchesResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ListBatchesResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ListFilesResponse

```cpp
// Create a model
auto model = models::ListFilesResponse();
model.setObject(/* value */);  // Set object
model.setData(/* value */);  // Set data
model.setFirstId(/* value */);  // Set first_id
model.setLastId(/* value */);  // Set last_id
model.setHasMore(/* value */);  // Set has_more

// Serialize to JSON
nlohmann::json json = models::ListFilesResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ListFilesResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ListFineTuningJobCheckpointsResponse

```cpp
// Create a model
auto model = models::ListFineTuningJobCheckpointsResponse();
model.setData(/* value */);  // Set data
model.setObject(/* value */);  // Set object
model.setFirstId(/* value */);  // Set first_id
model.setLastId(/* value */);  // Set last_id
model.setHasMore(/* value */);  // Set has_more

// Serialize to JSON
nlohmann::json json = models::ListFineTuningJobCheckpointsResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ListFineTuningJobCheckpointsResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ListFineTuningJobEventsResponse

```cpp
// Create a model
auto model = models::ListFineTuningJobEventsResponse();
model.setData(/* value */);  // Set data
model.setObject(/* value */);  // Set object

// Serialize to JSON
nlohmann::json json = models::ListFineTuningJobEventsResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ListFineTuningJobEventsResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ListMessagesResponse

```cpp
// Create a model
auto model = models::ListMessagesResponse();
model.setObject(/* value */);  // Set object
model.setData(/* value */);  // Set data
model.setFirstId(/* value */);  // Set first_id
model.setLastId(/* value */);  // Set last_id
model.setHasMore(/* value */);  // Set has_more

// Serialize to JSON
nlohmann::json json = models::ListMessagesResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ListMessagesResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ListModelsResponse

```cpp
// Create a model
auto model = models::ListModelsResponse();
model.setObject(/* value */);  // Set object
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::ListModelsResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ListModelsResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ListPaginatedFineTuningJobsResponse

```cpp
// Create a model
auto model = models::ListPaginatedFineTuningJobsResponse();
model.setData(/* value */);  // Set data
model.setHasMore(/* value */);  // Set has_more
model.setObject(/* value */);  // Set object

// Serialize to JSON
nlohmann::json json = models::ListPaginatedFineTuningJobsResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ListPaginatedFineTuningJobsResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ListRunStepsResponse

```cpp
// Create a model
auto model = models::ListRunStepsResponse();
model.setObject(/* value */);  // Set object
model.setData(/* value */);  // Set data
model.setFirstId(/* value */);  // Set first_id
model.setLastId(/* value */);  // Set last_id
model.setHasMore(/* value */);  // Set has_more

// Serialize to JSON
nlohmann::json json = models::ListRunStepsResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ListRunStepsResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ListRunsResponse

```cpp
// Create a model
auto model = models::ListRunsResponse();
model.setObject(/* value */);  // Set object
model.setData(/* value */);  // Set data
model.setFirstId(/* value */);  // Set first_id
model.setLastId(/* value */);  // Set last_id
model.setHasMore(/* value */);  // Set has_more

// Serialize to JSON
nlohmann::json json = models::ListRunsResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ListRunsResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ListThreadsResponse

```cpp
// Create a model
auto model = models::ListThreadsResponse();
model.setObject(/* value */);  // Set object
model.setData(/* value */);  // Set data
model.setFirstId(/* value */);  // Set first_id
model.setLastId(/* value */);  // Set last_id
model.setHasMore(/* value */);  // Set has_more

// Serialize to JSON
nlohmann::json json = models::ListThreadsResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ListThreadsResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ListVectorStoreFilesResponse

```cpp
// Create a model
auto model = models::ListVectorStoreFilesResponse();
model.setObject(/* value */);  // Set object
model.setData(/* value */);  // Set data
model.setFirstId(/* value */);  // Set first_id
model.setLastId(/* value */);  // Set last_id
model.setHasMore(/* value */);  // Set has_more

// Serialize to JSON
nlohmann::json json = models::ListVectorStoreFilesResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ListVectorStoreFilesResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ListVectorStoresResponse

```cpp
// Create a model
auto model = models::ListVectorStoresResponse();
model.setObject(/* value */);  // Set object
model.setData(/* value */);  // Set data
model.setFirstId(/* value */);  // Set first_id
model.setLastId(/* value */);  // Set last_id
model.setHasMore(/* value */);  // Set has_more

// Serialize to JSON
nlohmann::json json = models::ListVectorStoresResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ListVectorStoresResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ImageFile

```cpp
// Create a model
auto model = models::ImageFile();
model.setType(/* value */);  // Set type
model.setImageFile(/* value */);  // Set image_file

// Serialize to JSON
nlohmann::json json = models::ImageFile::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ImageFile::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MessageContentImageFileObjectImageFile

```cpp
// Create a model
auto model = models::MessageContentImageFileObjectImageFile();
model.setFileId(/* value */);  // Set file_id
model.setDetail(/* value */);  // Set detail

// Serialize to JSON
nlohmann::json json = models::MessageContentImageFileObjectImageFile::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MessageContentImageFileObjectImageFile::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ImageUrl

```cpp
// Create a model
auto model = models::ImageUrl();
model.setType(/* value */);  // Set type
model.setImageUrl(/* value */);  // Set image_url

// Serialize to JSON
nlohmann::json json = models::ImageUrl::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ImageUrl::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MessageContentImageUrlObjectImageUrl

```cpp
// Create a model
auto model = models::MessageContentImageUrlObjectImageUrl();
model.setUrl(/* value */);  // Set url
model.setDetail(/* value */);  // Set detail

// Serialize to JSON
nlohmann::json json = models::MessageContentImageUrlObjectImageUrl::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MessageContentImageUrlObjectImageUrl::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Refusal

```cpp
// Create a model
auto model = models::Refusal();
model.setType(/* value */);  // Set type
model.setRefusal(/* value */);  // Set refusal

// Serialize to JSON
nlohmann::json json = models::Refusal::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Refusal::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FileCitation

```cpp
// Create a model
auto model = models::FileCitation();
model.setType(/* value */);  // Set type
model.setText(/* value */);  // Set text
model.setFileCitation(/* value */);  // Set file_citation
model.setStartIndex(/* value */);  // Set start_index
model.setEndIndex(/* value */);  // Set end_index

// Serialize to JSON
nlohmann::json json = models::FileCitation::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FileCitation::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MessageContentTextAnnotationsFileCitationObjectFileCitation

```cpp
// Create a model
auto model = models::MessageContentTextAnnotationsFileCitationObjectFileCitation();
model.setFileId(/* value */);  // Set file_id

// Serialize to JSON
nlohmann::json json = models::MessageContentTextAnnotationsFileCitationObjectFileCitation::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MessageContentTextAnnotationsFileCitationObjectFileCitation::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FilePath

```cpp
// Create a model
auto model = models::FilePath();
model.setType(/* value */);  // Set type
model.setText(/* value */);  // Set text
model.setFilePath(/* value */);  // Set file_path
model.setStartIndex(/* value */);  // Set start_index
model.setEndIndex(/* value */);  // Set end_index

// Serialize to JSON
nlohmann::json json = models::FilePath::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FilePath::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MessageContentTextAnnotationsFilePathObjectFilePath

```cpp
// Create a model
auto model = models::MessageContentTextAnnotationsFilePathObjectFilePath();
model.setFileId(/* value */);  // Set file_id

// Serialize to JSON
nlohmann::json json = models::MessageContentTextAnnotationsFilePathObjectFilePath::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MessageContentTextAnnotationsFilePathObjectFilePath::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Text

```cpp
// Create a model
auto model = models::Text();
model.setType(/* value */);  // Set type
model.setText(/* value */);  // Set text

// Serialize to JSON
nlohmann::json json = models::Text::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Text::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MessageContentTextObjectText

```cpp
// Create a model
auto model = models::MessageContentTextObjectText();
model.setValue(/* value */);  // Set value
model.setAnnotations(/* value */);  // Set annotations

// Serialize to JSON
nlohmann::json json = models::MessageContentTextObjectText::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MessageContentTextObjectText::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MessageContentTextObjectTextAnnotationsInner

```cpp
// Create a model
auto model = models::MessageContentTextObjectTextAnnotationsInner();
model.setType(/* value */);  // Set type
model.setText(/* value */);  // Set text
model.setFileCitation(/* value */);  // Set file_citation
model.setStartIndex(/* value */);  // Set start_index
model.setEndIndex(/* value */);  // Set end_index
model.setFilePath(/* value */);  // Set file_path

// Serialize to JSON
nlohmann::json json = models::MessageContentTextObjectTextAnnotationsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MessageContentTextObjectTextAnnotationsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ImageFile

```cpp
// Create a model
auto model = models::ImageFile();
model.setIndex(/* value */);  // Set index
model.setType(/* value */);  // Set type
model.setImageFile(/* value */);  // Set image_file

// Serialize to JSON
nlohmann::json json = models::ImageFile::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ImageFile::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MessageDeltaContentImageFileObjectImageFile

```cpp
// Create a model
auto model = models::MessageDeltaContentImageFileObjectImageFile();
model.setFileId(/* value */);  // Set file_id
model.setDetail(/* value */);  // Set detail

// Serialize to JSON
nlohmann::json json = models::MessageDeltaContentImageFileObjectImageFile::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MessageDeltaContentImageFileObjectImageFile::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ImageUrl

```cpp
// Create a model
auto model = models::ImageUrl();
model.setIndex(/* value */);  // Set index
model.setType(/* value */);  // Set type
model.setImageUrl(/* value */);  // Set image_url

// Serialize to JSON
nlohmann::json json = models::ImageUrl::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ImageUrl::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MessageDeltaContentImageUrlObjectImageUrl

```cpp
// Create a model
auto model = models::MessageDeltaContentImageUrlObjectImageUrl();
model.setUrl(/* value */);  // Set url
model.setDetail(/* value */);  // Set detail

// Serialize to JSON
nlohmann::json json = models::MessageDeltaContentImageUrlObjectImageUrl::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MessageDeltaContentImageUrlObjectImageUrl::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Refusal

```cpp
// Create a model
auto model = models::Refusal();
model.setIndex(/* value */);  // Set index
model.setType(/* value */);  // Set type
model.setRefusal(/* value */);  // Set refusal

// Serialize to JSON
nlohmann::json json = models::Refusal::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Refusal::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FileCitation

```cpp
// Create a model
auto model = models::FileCitation();
model.setIndex(/* value */);  // Set index
model.setType(/* value */);  // Set type
model.setText(/* value */);  // Set text
model.setFileCitation(/* value */);  // Set file_citation
model.setStartIndex(/* value */);  // Set start_index
model.setEndIndex(/* value */);  // Set end_index

// Serialize to JSON
nlohmann::json json = models::FileCitation::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FileCitation::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation

```cpp
// Create a model
auto model = models::MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation();
model.setFileId(/* value */);  // Set file_id
model.setQuote(/* value */);  // Set quote

// Serialize to JSON
nlohmann::json json = models::MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FilePath

```cpp
// Create a model
auto model = models::FilePath();
model.setIndex(/* value */);  // Set index
model.setType(/* value */);  // Set type
model.setText(/* value */);  // Set text
model.setFilePath(/* value */);  // Set file_path
model.setStartIndex(/* value */);  // Set start_index
model.setEndIndex(/* value */);  // Set end_index

// Serialize to JSON
nlohmann::json json = models::FilePath::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FilePath::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MessageDeltaContentTextAnnotationsFilePathObjectFilePath

```cpp
// Create a model
auto model = models::MessageDeltaContentTextAnnotationsFilePathObjectFilePath();
model.setFileId(/* value */);  // Set file_id

// Serialize to JSON
nlohmann::json json = models::MessageDeltaContentTextAnnotationsFilePathObjectFilePath::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MessageDeltaContentTextAnnotationsFilePathObjectFilePath::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Text

```cpp
// Create a model
auto model = models::Text();
model.setIndex(/* value */);  // Set index
model.setType(/* value */);  // Set type
model.setText(/* value */);  // Set text

// Serialize to JSON
nlohmann::json json = models::Text::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Text::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MessageDeltaContentTextObjectText

```cpp
// Create a model
auto model = models::MessageDeltaContentTextObjectText();
model.setValue(/* value */);  // Set value
model.setAnnotations(/* value */);  // Set annotations

// Serialize to JSON
nlohmann::json json = models::MessageDeltaContentTextObjectText::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MessageDeltaContentTextObjectText::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MessageDeltaContentTextObjectTextAnnotationsInner

```cpp
// Create a model
auto model = models::MessageDeltaContentTextObjectTextAnnotationsInner();
model.setIndex(/* value */);  // Set index
model.setType(/* value */);  // Set type
model.setText(/* value */);  // Set text
model.setFileCitation(/* value */);  // Set file_citation
model.setStartIndex(/* value */);  // Set start_index
model.setEndIndex(/* value */);  // Set end_index
model.setFilePath(/* value */);  // Set file_path

// Serialize to JSON
nlohmann::json json = models::MessageDeltaContentTextObjectTextAnnotationsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MessageDeltaContentTextObjectTextAnnotationsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MessageDeltaObject

```cpp
// Create a model
auto model = models::MessageDeltaObject();
model.setId(/* value */);  // Set id
model.setObject(/* value */);  // Set object
model.setDelta(/* value */);  // Set delta

// Serialize to JSON
nlohmann::json json = models::MessageDeltaObject::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MessageDeltaObject::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MessageDeltaObjectDelta

```cpp
// Create a model
auto model = models::MessageDeltaObjectDelta();
model.setRole(/* value */);  // Set role
model.setContent(/* value */);  // Set content

// Serialize to JSON
nlohmann::json json = models::MessageDeltaObjectDelta::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MessageDeltaObjectDelta::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MessageDeltaObjectDeltaContentInner

```cpp
// Create a model
auto model = models::MessageDeltaObjectDeltaContentInner();
model.setIndex(/* value */);  // Set index
model.setType(/* value */);  // Set type
model.setImageFile(/* value */);  // Set image_file
model.setText(/* value */);  // Set text
model.setRefusal(/* value */);  // Set refusal
model.setImageUrl(/* value */);  // Set image_url

// Serialize to JSON
nlohmann::json json = models::MessageDeltaObjectDeltaContentInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MessageDeltaObjectDeltaContentInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TheMessageObject

```cpp
// Create a model
auto model = models::TheMessageObject();
model.setId(/* value */);  // Set id
model.setObject(/* value */);  // Set object
model.setCreatedAt(/* value */);  // Set created_at
model.setThreadId(/* value */);  // Set thread_id
model.setStatus(/* value */);  // Set status
model.setIncompleteDetails(/* value */);  // Set incomplete_details
model.setCompletedAt(/* value */);  // Set completed_at
model.setIncompleteAt(/* value */);  // Set incomplete_at
model.setRole(/* value */);  // Set role
model.setContent(/* value */);  // Set content
model.setAssistantId(/* value */);  // Set assistant_id
model.setRunId(/* value */);  // Set run_id
model.setAttachments(/* value */);  // Set attachments
model.setMetadata(/* value */);  // Set metadata

// Serialize to JSON
nlohmann::json json = models::TheMessageObject::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TheMessageObject::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MessageObjectAttachmentsInner

```cpp
// Create a model
auto model = models::MessageObjectAttachmentsInner();
model.setFileId(/* value */);  // Set file_id
model.setTools(/* value */);  // Set tools

// Serialize to JSON
nlohmann::json json = models::MessageObjectAttachmentsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MessageObjectAttachmentsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MessageObjectAttachmentsInnerToolsInner

```cpp
// Create a model
auto model = models::MessageObjectAttachmentsInnerToolsInner();
model.setType(/* value */);  // Set type

// Serialize to JSON
nlohmann::json json = models::MessageObjectAttachmentsInnerToolsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MessageObjectAttachmentsInnerToolsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MessageObjectContentInner

```cpp
// Create a model
auto model = models::MessageObjectContentInner();
model.setType(/* value */);  // Set type
model.setImageFile(/* value */);  // Set image_file
model.setImageUrl(/* value */);  // Set image_url
model.setText(/* value */);  // Set text
model.setRefusal(/* value */);  // Set refusal

// Serialize to JSON
nlohmann::json json = models::MessageObjectContentInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MessageObjectContentInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MessageObjectIncompleteDetails

```cpp
// Create a model
auto model = models::MessageObjectIncompleteDetails();
model.setReason(/* value */);  // Set reason

// Serialize to JSON
nlohmann::json json = models::MessageObjectIncompleteDetails::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MessageObjectIncompleteDetails::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Text

```cpp
// Create a model
auto model = models::Text();
model.setType(/* value */);  // Set type
model.setText(/* value */);  // Set text

// Serialize to JSON
nlohmann::json json = models::Text::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Text::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MessageStreamEvent

```cpp
// Create a model
auto model = models::MessageStreamEvent();
model.setEvent(/* value */);  // Set event
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::MessageStreamEvent::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MessageStreamEvent::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MessageStreamEventOneOf

```cpp
// Create a model
auto model = models::MessageStreamEventOneOf();
model.setEvent(/* value */);  // Set event
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::MessageStreamEventOneOf::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MessageStreamEventOneOf::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MessageStreamEventOneOf1

```cpp
// Create a model
auto model = models::MessageStreamEventOneOf1();
model.setEvent(/* value */);  // Set event
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::MessageStreamEventOneOf1::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MessageStreamEventOneOf1::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MessageStreamEventOneOf2

```cpp
// Create a model
auto model = models::MessageStreamEventOneOf2();
model.setEvent(/* value */);  // Set event
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::MessageStreamEventOneOf2::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MessageStreamEventOneOf2::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MessageStreamEventOneOf3

```cpp
// Create a model
auto model = models::MessageStreamEventOneOf3();
model.setEvent(/* value */);  // Set event
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::MessageStreamEventOneOf3::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MessageStreamEventOneOf3::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MessageStreamEventOneOf4

```cpp
// Create a model
auto model = models::MessageStreamEventOneOf4();
model.setEvent(/* value */);  // Set event
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::MessageStreamEventOneOf4::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MessageStreamEventOneOf4::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Model

```cpp
// Create a model
auto model = models::Model();
model.setId(/* value */);  // Set id
model.setCreated(/* value */);  // Set created
model.setObject(/* value */);  // Set object
model.setOwnedBy(/* value */);  // Set owned_by

// Serialize to JSON
nlohmann::json json = models::Model::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Model::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ModifyAssistantRequest

```cpp
// Create a model
auto model = models::ModifyAssistantRequest();
model.setModel(/* value */);  // Set model
model.setName(/* value */);  // Set name
model.setDescription(/* value */);  // Set description
model.setInstructions(/* value */);  // Set instructions
model.setTools(/* value */);  // Set tools
model.setToolResources(/* value */);  // Set tool_resources
model.setMetadata(/* value */);  // Set metadata
model.setTemperature(/* value */);  // Set temperature
model.setTopP(/* value */);  // Set top_p
model.setResponseFormat(/* value */);  // Set response_format

// Serialize to JSON
nlohmann::json json = models::ModifyAssistantRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ModifyAssistantRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ModifyAssistantRequestToolResources

```cpp
// Create a model
auto model = models::ModifyAssistantRequestToolResources();
model.setCodeInterpreter(/* value */);  // Set code_interpreter
model.setFileSearch(/* value */);  // Set file_search

// Serialize to JSON
nlohmann::json json = models::ModifyAssistantRequestToolResources::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ModifyAssistantRequestToolResources::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ModifyAssistantRequestToolResourcesCodeInterpreter

```cpp
// Create a model
auto model = models::ModifyAssistantRequestToolResourcesCodeInterpreter();
model.setFileIds(/* value */);  // Set file_ids

// Serialize to JSON
nlohmann::json json = models::ModifyAssistantRequestToolResourcesCodeInterpreter::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ModifyAssistantRequestToolResourcesCodeInterpreter::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ModifyAssistantRequestToolResourcesFileSearch

```cpp
// Create a model
auto model = models::ModifyAssistantRequestToolResourcesFileSearch();
model.setVectorStoreIds(/* value */);  // Set vector_store_ids

// Serialize to JSON
nlohmann::json json = models::ModifyAssistantRequestToolResourcesFileSearch::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ModifyAssistantRequestToolResourcesFileSearch::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ModifyAssistantRequestToolsInner

```cpp
// Create a model
auto model = models::ModifyAssistantRequestToolsInner();
model.setType(/* value */);  // Set type
model.setFileSearch(/* value */);  // Set file_search
model.setFunction(/* value */);  // Set function

// Serialize to JSON
nlohmann::json json = models::ModifyAssistantRequestToolsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ModifyAssistantRequestToolsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ModifyMessageRequest

```cpp
// Create a model
auto model = models::ModifyMessageRequest();
model.setMetadata(/* value */);  // Set metadata

// Serialize to JSON
nlohmann::json json = models::ModifyMessageRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ModifyMessageRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ModifyRunRequest

```cpp
// Create a model
auto model = models::ModifyRunRequest();
model.setMetadata(/* value */);  // Set metadata

// Serialize to JSON
nlohmann::json json = models::ModifyRunRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ModifyRunRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ModifyThreadRequest

```cpp
// Create a model
auto model = models::ModifyThreadRequest();
model.setToolResources(/* value */);  // Set tool_resources
model.setMetadata(/* value */);  // Set metadata

// Serialize to JSON
nlohmann::json json = models::ModifyThreadRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ModifyThreadRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ModifyThreadRequestToolResources

```cpp
// Create a model
auto model = models::ModifyThreadRequestToolResources();
model.setCodeInterpreter(/* value */);  // Set code_interpreter
model.setFileSearch(/* value */);  // Set file_search

// Serialize to JSON
nlohmann::json json = models::ModifyThreadRequestToolResources::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ModifyThreadRequestToolResources::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ModifyThreadRequestToolResourcesCodeInterpreter

```cpp
// Create a model
auto model = models::ModifyThreadRequestToolResourcesCodeInterpreter();
model.setFileIds(/* value */);  // Set file_ids

// Serialize to JSON
nlohmann::json json = models::ModifyThreadRequestToolResourcesCodeInterpreter::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ModifyThreadRequestToolResourcesCodeInterpreter::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ModifyThreadRequestToolResourcesFileSearch

```cpp
// Create a model
auto model = models::ModifyThreadRequestToolResourcesFileSearch();
model.setVectorStoreIds(/* value */);  // Set vector_store_ids

// Serialize to JSON
nlohmann::json json = models::ModifyThreadRequestToolResourcesFileSearch::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ModifyThreadRequestToolResourcesFileSearch::fromJson(nlohmann::json::parse(jsonString));
```
#### models::OpenAIFile

```cpp
// Create a model
auto model = models::OpenAIFile();
model.setId(/* value */);  // Set id
model.setBytes(/* value */);  // Set bytes
model.setCreatedAt(/* value */);  // Set created_at
model.setFilename(/* value */);  // Set filename
model.setObject(/* value */);  // Set object
model.setPurpose(/* value */);  // Set purpose
model.setStatus(/* value */);  // Set status
model.setStatusDetails(/* value */);  // Set status_details

// Serialize to JSON
nlohmann::json json = models::OpenAIFile::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::OpenAIFile::fromJson(nlohmann::json::parse(jsonString));
```
#### models::OtherChunkingStrategy

```cpp
// Create a model
auto model = models::OtherChunkingStrategy();
model.setType(/* value */);  // Set type

// Serialize to JSON
nlohmann::json json = models::OtherChunkingStrategy::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::OtherChunkingStrategy::fromJson(nlohmann::json::parse(jsonString));
```
#### models::StaticContent

```cpp
// Create a model
auto model = models::StaticContent();
model.setType(/* value */);  // Set type
model.setContent(/* value */);  // Set content

// Serialize to JSON
nlohmann::json json = models::StaticContent::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::StaticContent::fromJson(nlohmann::json::parse(jsonString));
```
#### models::PredictionContentContent

```cpp
// Create a model
auto model = models::PredictionContentContent();

// Serialize to JSON
nlohmann::json json = models::PredictionContentContent::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::PredictionContentContent::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Project

```cpp
// Create a model
auto model = models::Project();
model.setId(/* value */);  // Set id
model.setObject(/* value */);  // Set object
model.setName(/* value */);  // Set name
model.setCreatedAt(/* value */);  // Set created_at
model.setArchivedAt(/* value */);  // Set archived_at
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::Project::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Project::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProjectApiKey

```cpp
// Create a model
auto model = models::ProjectApiKey();
model.setObject(/* value */);  // Set object
model.setRedactedValue(/* value */);  // Set redacted_value
model.setName(/* value */);  // Set name
model.setCreatedAt(/* value */);  // Set created_at
model.setId(/* value */);  // Set id
model.setOwner(/* value */);  // Set owner

// Serialize to JSON
nlohmann::json json = models::ProjectApiKey::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProjectApiKey::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProjectApiKeyDeleteResponse

```cpp
// Create a model
auto model = models::ProjectApiKeyDeleteResponse();
model.setObject(/* value */);  // Set object
model.setId(/* value */);  // Set id
model.setDeleted(/* value */);  // Set deleted

// Serialize to JSON
nlohmann::json json = models::ProjectApiKeyDeleteResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProjectApiKeyDeleteResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProjectApiKeyListResponse

```cpp
// Create a model
auto model = models::ProjectApiKeyListResponse();
model.setObject(/* value */);  // Set object
model.setData(/* value */);  // Set data
model.setFirstId(/* value */);  // Set first_id
model.setLastId(/* value */);  // Set last_id
model.setHasMore(/* value */);  // Set has_more

// Serialize to JSON
nlohmann::json json = models::ProjectApiKeyListResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProjectApiKeyListResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProjectApiKeyOwner

```cpp
// Create a model
auto model = models::ProjectApiKeyOwner();
model.setType(/* value */);  // Set type
model.setUser(/* value */);  // Set user
model.setServiceAccount(/* value */);  // Set service_account

// Serialize to JSON
nlohmann::json json = models::ProjectApiKeyOwner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProjectApiKeyOwner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProjectCreateRequest

```cpp
// Create a model
auto model = models::ProjectCreateRequest();
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::ProjectCreateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProjectCreateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProjectListResponse

```cpp
// Create a model
auto model = models::ProjectListResponse();
model.setObject(/* value */);  // Set object
model.setData(/* value */);  // Set data
model.setFirstId(/* value */);  // Set first_id
model.setLastId(/* value */);  // Set last_id
model.setHasMore(/* value */);  // Set has_more

// Serialize to JSON
nlohmann::json json = models::ProjectListResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProjectListResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProjectRateLimit

```cpp
// Create a model
auto model = models::ProjectRateLimit();
model.setObject(/* value */);  // Set object
model.setId(/* value */);  // Set id
model.setModel(/* value */);  // Set model
model.setMaxRequestsPer1Minute(/* value */);  // Set max_requests_per_1_minute
model.setMaxTokensPer1Minute(/* value */);  // Set max_tokens_per_1_minute
model.setMaxImagesPer1Minute(/* value */);  // Set max_images_per_1_minute
model.setMaxAudioMegabytesPer1Minute(/* value */);  // Set max_audio_megabytes_per_1_minute
model.setMaxRequestsPer1Day(/* value */);  // Set max_requests_per_1_day
model.setBatch1DayMaxInputTokens(/* value */);  // Set batch_1_day_max_input_tokens

// Serialize to JSON
nlohmann::json json = models::ProjectRateLimit::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProjectRateLimit::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProjectRateLimitListResponse

```cpp
// Create a model
auto model = models::ProjectRateLimitListResponse();
model.setObject(/* value */);  // Set object
model.setData(/* value */);  // Set data
model.setFirstId(/* value */);  // Set first_id
model.setLastId(/* value */);  // Set last_id
model.setHasMore(/* value */);  // Set has_more

// Serialize to JSON
nlohmann::json json = models::ProjectRateLimitListResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProjectRateLimitListResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProjectRateLimitUpdateRequest

```cpp
// Create a model
auto model = models::ProjectRateLimitUpdateRequest();
model.setMaxRequestsPer1Minute(/* value */);  // Set max_requests_per_1_minute
model.setMaxTokensPer1Minute(/* value */);  // Set max_tokens_per_1_minute
model.setMaxImagesPer1Minute(/* value */);  // Set max_images_per_1_minute
model.setMaxAudioMegabytesPer1Minute(/* value */);  // Set max_audio_megabytes_per_1_minute
model.setMaxRequestsPer1Day(/* value */);  // Set max_requests_per_1_day
model.setBatch1DayMaxInputTokens(/* value */);  // Set batch_1_day_max_input_tokens

// Serialize to JSON
nlohmann::json json = models::ProjectRateLimitUpdateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProjectRateLimitUpdateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProjectServiceAccount

```cpp
// Create a model
auto model = models::ProjectServiceAccount();
model.setObject(/* value */);  // Set object
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setRole(/* value */);  // Set role
model.setCreatedAt(/* value */);  // Set created_at

// Serialize to JSON
nlohmann::json json = models::ProjectServiceAccount::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProjectServiceAccount::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProjectServiceAccountApiKey

```cpp
// Create a model
auto model = models::ProjectServiceAccountApiKey();
model.setObject(/* value */);  // Set object
model.setValue(/* value */);  // Set value
model.setName(/* value */);  // Set name
model.setCreatedAt(/* value */);  // Set created_at
model.setId(/* value */);  // Set id

// Serialize to JSON
nlohmann::json json = models::ProjectServiceAccountApiKey::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProjectServiceAccountApiKey::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProjectServiceAccountCreateRequest

```cpp
// Create a model
auto model = models::ProjectServiceAccountCreateRequest();
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::ProjectServiceAccountCreateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProjectServiceAccountCreateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProjectServiceAccountCreateResponse

```cpp
// Create a model
auto model = models::ProjectServiceAccountCreateResponse();
model.setObject(/* value */);  // Set object
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setRole(/* value */);  // Set role
model.setCreatedAt(/* value */);  // Set created_at
model.setApiKey(/* value */);  // Set api_key

// Serialize to JSON
nlohmann::json json = models::ProjectServiceAccountCreateResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProjectServiceAccountCreateResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProjectServiceAccountDeleteResponse

```cpp
// Create a model
auto model = models::ProjectServiceAccountDeleteResponse();
model.setObject(/* value */);  // Set object
model.setId(/* value */);  // Set id
model.setDeleted(/* value */);  // Set deleted

// Serialize to JSON
nlohmann::json json = models::ProjectServiceAccountDeleteResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProjectServiceAccountDeleteResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProjectServiceAccountListResponse

```cpp
// Create a model
auto model = models::ProjectServiceAccountListResponse();
model.setObject(/* value */);  // Set object
model.setData(/* value */);  // Set data
model.setFirstId(/* value */);  // Set first_id
model.setLastId(/* value */);  // Set last_id
model.setHasMore(/* value */);  // Set has_more

// Serialize to JSON
nlohmann::json json = models::ProjectServiceAccountListResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProjectServiceAccountListResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProjectUpdateRequest

```cpp
// Create a model
auto model = models::ProjectUpdateRequest();
model.setName(/* value */);  // Set name

// Serialize to JSON
nlohmann::json json = models::ProjectUpdateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProjectUpdateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProjectUser

```cpp
// Create a model
auto model = models::ProjectUser();
model.setObject(/* value */);  // Set object
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setEmail(/* value */);  // Set email
model.setRole(/* value */);  // Set role
model.setAddedAt(/* value */);  // Set added_at

// Serialize to JSON
nlohmann::json json = models::ProjectUser::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProjectUser::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProjectUserCreateRequest

```cpp
// Create a model
auto model = models::ProjectUserCreateRequest();
model.setUserId(/* value */);  // Set user_id
model.setRole(/* value */);  // Set role

// Serialize to JSON
nlohmann::json json = models::ProjectUserCreateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProjectUserCreateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProjectUserDeleteResponse

```cpp
// Create a model
auto model = models::ProjectUserDeleteResponse();
model.setObject(/* value */);  // Set object
model.setId(/* value */);  // Set id
model.setDeleted(/* value */);  // Set deleted

// Serialize to JSON
nlohmann::json json = models::ProjectUserDeleteResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProjectUserDeleteResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProjectUserListResponse

```cpp
// Create a model
auto model = models::ProjectUserListResponse();
model.setObject(/* value */);  // Set object
model.setData(/* value */);  // Set data
model.setFirstId(/* value */);  // Set first_id
model.setLastId(/* value */);  // Set last_id
model.setHasMore(/* value */);  // Set has_more

// Serialize to JSON
nlohmann::json json = models::ProjectUserListResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProjectUserListResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ProjectUserUpdateRequest

```cpp
// Create a model
auto model = models::ProjectUserUpdateRequest();
model.setRole(/* value */);  // Set role

// Serialize to JSON
nlohmann::json json = models::ProjectUserUpdateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ProjectUserUpdateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeClientEventConversationItemCreate

```cpp
// Create a model
auto model = models::RealtimeClientEventConversationItemCreate();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setPreviousItemId(/* value */);  // Set previous_item_id
model.setItem(/* value */);  // Set item

// Serialize to JSON
nlohmann::json json = models::RealtimeClientEventConversationItemCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeClientEventConversationItemCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeClientEventConversationItemDelete

```cpp
// Create a model
auto model = models::RealtimeClientEventConversationItemDelete();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setItemId(/* value */);  // Set item_id

// Serialize to JSON
nlohmann::json json = models::RealtimeClientEventConversationItemDelete::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeClientEventConversationItemDelete::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeClientEventConversationItemTruncate

```cpp
// Create a model
auto model = models::RealtimeClientEventConversationItemTruncate();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setItemId(/* value */);  // Set item_id
model.setContentIndex(/* value */);  // Set content_index
model.setAudioEndMs(/* value */);  // Set audio_end_ms

// Serialize to JSON
nlohmann::json json = models::RealtimeClientEventConversationItemTruncate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeClientEventConversationItemTruncate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeClientEventInputAudioBufferAppend

```cpp
// Create a model
auto model = models::RealtimeClientEventInputAudioBufferAppend();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setAudio(/* value */);  // Set audio

// Serialize to JSON
nlohmann::json json = models::RealtimeClientEventInputAudioBufferAppend::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeClientEventInputAudioBufferAppend::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeClientEventInputAudioBufferClear

```cpp
// Create a model
auto model = models::RealtimeClientEventInputAudioBufferClear();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type

// Serialize to JSON
nlohmann::json json = models::RealtimeClientEventInputAudioBufferClear::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeClientEventInputAudioBufferClear::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeClientEventInputAudioBufferCommit

```cpp
// Create a model
auto model = models::RealtimeClientEventInputAudioBufferCommit();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type

// Serialize to JSON
nlohmann::json json = models::RealtimeClientEventInputAudioBufferCommit::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeClientEventInputAudioBufferCommit::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeClientEventResponseCancel

```cpp
// Create a model
auto model = models::RealtimeClientEventResponseCancel();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setResponseId(/* value */);  // Set response_id

// Serialize to JSON
nlohmann::json json = models::RealtimeClientEventResponseCancel::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeClientEventResponseCancel::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeClientEventResponseCreate

```cpp
// Create a model
auto model = models::RealtimeClientEventResponseCreate();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setResponse(/* value */);  // Set response

// Serialize to JSON
nlohmann::json json = models::RealtimeClientEventResponseCreate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeClientEventResponseCreate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeClientEventSessionUpdate

```cpp
// Create a model
auto model = models::RealtimeClientEventSessionUpdate();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setSession(/* value */);  // Set session

// Serialize to JSON
nlohmann::json json = models::RealtimeClientEventSessionUpdate::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeClientEventSessionUpdate::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeConversationItem

```cpp
// Create a model
auto model = models::RealtimeConversationItem();
model.setId(/* value */);  // Set id
model.setType(/* value */);  // Set type
model.setObject(/* value */);  // Set object
model.setStatus(/* value */);  // Set status
model.setRole(/* value */);  // Set role
model.setContent(/* value */);  // Set content
model.setCallId(/* value */);  // Set call_id
model.setName(/* value */);  // Set name
model.setArguments(/* value */);  // Set arguments
model.setOutput(/* value */);  // Set output

// Serialize to JSON
nlohmann::json json = models::RealtimeConversationItem::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeConversationItem::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeConversationItemContentInner

```cpp
// Create a model
auto model = models::RealtimeConversationItemContentInner();
model.setType(/* value */);  // Set type
model.setText(/* value */);  // Set text
model.setId(/* value */);  // Set id
model.setAudio(/* value */);  // Set audio
model.setTranscript(/* value */);  // Set transcript

// Serialize to JSON
nlohmann::json json = models::RealtimeConversationItemContentInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeConversationItemContentInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeResponse

```cpp
// Create a model
auto model = models::RealtimeResponse();
model.setId(/* value */);  // Set id
model.setObject(/* value */);  // Set object
model.setStatus(/* value */);  // Set status
model.setStatusDetails(/* value */);  // Set status_details
model.setOutput(/* value */);  // Set output
model.setMetadata(/* value */);  // Set metadata
model.setUsage(/* value */);  // Set usage

// Serialize to JSON
nlohmann::json json = models::RealtimeResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeResponseCreateParams

```cpp
// Create a model
auto model = models::RealtimeResponseCreateParams();
model.setModalities(/* value */);  // Set modalities
model.setInstructions(/* value */);  // Set instructions
model.setVoice(/* value */);  // Set voice
model.setOutputAudioFormat(/* value */);  // Set output_audio_format
model.setTools(/* value */);  // Set tools
model.setToolChoice(/* value */);  // Set tool_choice
model.setTemperature(/* value */);  // Set temperature
model.setMaxResponseOutputTokens(/* value */);  // Set max_response_output_tokens
model.setConversation(/* value */);  // Set conversation
model.setMetadata(/* value */);  // Set metadata
model.setInput(/* value */);  // Set input

// Serialize to JSON
nlohmann::json json = models::RealtimeResponseCreateParams::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeResponseCreateParams::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeResponseCreateParamsConversation

```cpp
// Create a model
auto model = models::RealtimeResponseCreateParamsConversation();

// Serialize to JSON
nlohmann::json json = models::RealtimeResponseCreateParamsConversation::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeResponseCreateParamsConversation::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeResponseCreateParamsMaxResponseOutputTokens

```cpp
// Create a model
auto model = models::RealtimeResponseCreateParamsMaxResponseOutputTokens();

// Serialize to JSON
nlohmann::json json = models::RealtimeResponseCreateParamsMaxResponseOutputTokens::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeResponseCreateParamsMaxResponseOutputTokens::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeResponseCreateParamsToolsInner

```cpp
// Create a model
auto model = models::RealtimeResponseCreateParamsToolsInner();
model.setType(/* value */);  // Set type
model.setName(/* value */);  // Set name
model.setDescription(/* value */);  // Set description
model.setParameters(/* value */);  // Set parameters

// Serialize to JSON
nlohmann::json json = models::RealtimeResponseCreateParamsToolsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeResponseCreateParamsToolsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeResponseStatusDetails

```cpp
// Create a model
auto model = models::RealtimeResponseStatusDetails();
model.setType(/* value */);  // Set type
model.setReason(/* value */);  // Set reason
model.setError(/* value */);  // Set error

// Serialize to JSON
nlohmann::json json = models::RealtimeResponseStatusDetails::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeResponseStatusDetails::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeResponseStatusDetailsError

```cpp
// Create a model
auto model = models::RealtimeResponseStatusDetailsError();
model.setType(/* value */);  // Set type
model.setCode(/* value */);  // Set code

// Serialize to JSON
nlohmann::json json = models::RealtimeResponseStatusDetailsError::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeResponseStatusDetailsError::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeResponseUsage

```cpp
// Create a model
auto model = models::RealtimeResponseUsage();
model.setTotalTokens(/* value */);  // Set total_tokens
model.setInputTokens(/* value */);  // Set input_tokens
model.setOutputTokens(/* value */);  // Set output_tokens
model.setInputTokenDetails(/* value */);  // Set input_token_details
model.setOutputTokenDetails(/* value */);  // Set output_token_details

// Serialize to JSON
nlohmann::json json = models::RealtimeResponseUsage::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeResponseUsage::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeResponseUsageInputTokenDetails

```cpp
// Create a model
auto model = models::RealtimeResponseUsageInputTokenDetails();
model.setCachedTokens(/* value */);  // Set cached_tokens
model.setTextTokens(/* value */);  // Set text_tokens
model.setAudioTokens(/* value */);  // Set audio_tokens

// Serialize to JSON
nlohmann::json json = models::RealtimeResponseUsageInputTokenDetails::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeResponseUsageInputTokenDetails::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeResponseUsageOutputTokenDetails

```cpp
// Create a model
auto model = models::RealtimeResponseUsageOutputTokenDetails();
model.setTextTokens(/* value */);  // Set text_tokens
model.setAudioTokens(/* value */);  // Set audio_tokens

// Serialize to JSON
nlohmann::json json = models::RealtimeResponseUsageOutputTokenDetails::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeResponseUsageOutputTokenDetails::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventConversationCreated

```cpp
// Create a model
auto model = models::RealtimeServerEventConversationCreated();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setConversation(/* value */);  // Set conversation

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventConversationCreated::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventConversationCreated::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventConversationCreatedConversation

```cpp
// Create a model
auto model = models::RealtimeServerEventConversationCreatedConversation();
model.setId(/* value */);  // Set id
model.setObject(/* value */);  // Set object

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventConversationCreatedConversation::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventConversationCreatedConversation::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventConversationItemCreated

```cpp
// Create a model
auto model = models::RealtimeServerEventConversationItemCreated();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setPreviousItemId(/* value */);  // Set previous_item_id
model.setItem(/* value */);  // Set item

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventConversationItemCreated::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventConversationItemCreated::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventConversationItemDeleted

```cpp
// Create a model
auto model = models::RealtimeServerEventConversationItemDeleted();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setItemId(/* value */);  // Set item_id

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventConversationItemDeleted::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventConversationItemDeleted::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventConversationItemInputAudioTranscriptionCompleted

```cpp
// Create a model
auto model = models::RealtimeServerEventConversationItemInputAudioTranscriptionCompleted();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setItemId(/* value */);  // Set item_id
model.setContentIndex(/* value */);  // Set content_index
model.setTranscript(/* value */);  // Set transcript

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventConversationItemInputAudioTranscriptionFailed

```cpp
// Create a model
auto model = models::RealtimeServerEventConversationItemInputAudioTranscriptionFailed();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setItemId(/* value */);  // Set item_id
model.setContentIndex(/* value */);  // Set content_index
model.setError(/* value */);  // Set error

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventConversationItemInputAudioTranscriptionFailed::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventConversationItemInputAudioTranscriptionFailed::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventConversationItemInputAudioTranscriptionFailedError

```cpp
// Create a model
auto model = models::RealtimeServerEventConversationItemInputAudioTranscriptionFailedError();
model.setType(/* value */);  // Set type
model.setCode(/* value */);  // Set code
model.setMessage(/* value */);  // Set message
model.setParam(/* value */);  // Set param

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventConversationItemInputAudioTranscriptionFailedError::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventConversationItemInputAudioTranscriptionFailedError::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventConversationItemTruncated

```cpp
// Create a model
auto model = models::RealtimeServerEventConversationItemTruncated();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setItemId(/* value */);  // Set item_id
model.setContentIndex(/* value */);  // Set content_index
model.setAudioEndMs(/* value */);  // Set audio_end_ms

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventConversationItemTruncated::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventConversationItemTruncated::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventError

```cpp
// Create a model
auto model = models::RealtimeServerEventError();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setError(/* value */);  // Set error

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventError::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventError::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventErrorError

```cpp
// Create a model
auto model = models::RealtimeServerEventErrorError();
model.setType(/* value */);  // Set type
model.setCode(/* value */);  // Set code
model.setMessage(/* value */);  // Set message
model.setParam(/* value */);  // Set param
model.setEventId(/* value */);  // Set event_id

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventErrorError::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventErrorError::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventInputAudioBufferCleared

```cpp
// Create a model
auto model = models::RealtimeServerEventInputAudioBufferCleared();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventInputAudioBufferCleared::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventInputAudioBufferCleared::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventInputAudioBufferCommitted

```cpp
// Create a model
auto model = models::RealtimeServerEventInputAudioBufferCommitted();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setPreviousItemId(/* value */);  // Set previous_item_id
model.setItemId(/* value */);  // Set item_id

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventInputAudioBufferCommitted::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventInputAudioBufferCommitted::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventInputAudioBufferSpeechStarted

```cpp
// Create a model
auto model = models::RealtimeServerEventInputAudioBufferSpeechStarted();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setAudioStartMs(/* value */);  // Set audio_start_ms
model.setItemId(/* value */);  // Set item_id

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventInputAudioBufferSpeechStarted::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventInputAudioBufferSpeechStarted::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventInputAudioBufferSpeechStopped

```cpp
// Create a model
auto model = models::RealtimeServerEventInputAudioBufferSpeechStopped();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setAudioEndMs(/* value */);  // Set audio_end_ms
model.setItemId(/* value */);  // Set item_id

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventInputAudioBufferSpeechStopped::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventInputAudioBufferSpeechStopped::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventRateLimitsUpdated

```cpp
// Create a model
auto model = models::RealtimeServerEventRateLimitsUpdated();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setRateLimits(/* value */);  // Set rate_limits

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventRateLimitsUpdated::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventRateLimitsUpdated::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventRateLimitsUpdatedRateLimitsInner

```cpp
// Create a model
auto model = models::RealtimeServerEventRateLimitsUpdatedRateLimitsInner();
model.setName(/* value */);  // Set name
model.setLimit(/* value */);  // Set limit
model.setRemaining(/* value */);  // Set remaining
model.setResetSeconds(/* value */);  // Set reset_seconds

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventRateLimitsUpdatedRateLimitsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventRateLimitsUpdatedRateLimitsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventResponseAudioDelta

```cpp
// Create a model
auto model = models::RealtimeServerEventResponseAudioDelta();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setResponseId(/* value */);  // Set response_id
model.setItemId(/* value */);  // Set item_id
model.setOutputIndex(/* value */);  // Set output_index
model.setContentIndex(/* value */);  // Set content_index
model.setDelta(/* value */);  // Set delta

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventResponseAudioDelta::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventResponseAudioDelta::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventResponseAudioDone

```cpp
// Create a model
auto model = models::RealtimeServerEventResponseAudioDone();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setResponseId(/* value */);  // Set response_id
model.setItemId(/* value */);  // Set item_id
model.setOutputIndex(/* value */);  // Set output_index
model.setContentIndex(/* value */);  // Set content_index

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventResponseAudioDone::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventResponseAudioDone::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventResponseAudioTranscriptDelta

```cpp
// Create a model
auto model = models::RealtimeServerEventResponseAudioTranscriptDelta();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setResponseId(/* value */);  // Set response_id
model.setItemId(/* value */);  // Set item_id
model.setOutputIndex(/* value */);  // Set output_index
model.setContentIndex(/* value */);  // Set content_index
model.setDelta(/* value */);  // Set delta

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventResponseAudioTranscriptDelta::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventResponseAudioTranscriptDelta::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventResponseAudioTranscriptDone

```cpp
// Create a model
auto model = models::RealtimeServerEventResponseAudioTranscriptDone();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setResponseId(/* value */);  // Set response_id
model.setItemId(/* value */);  // Set item_id
model.setOutputIndex(/* value */);  // Set output_index
model.setContentIndex(/* value */);  // Set content_index
model.setTranscript(/* value */);  // Set transcript

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventResponseAudioTranscriptDone::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventResponseAudioTranscriptDone::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventResponseContentPartAdded

```cpp
// Create a model
auto model = models::RealtimeServerEventResponseContentPartAdded();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setResponseId(/* value */);  // Set response_id
model.setItemId(/* value */);  // Set item_id
model.setOutputIndex(/* value */);  // Set output_index
model.setContentIndex(/* value */);  // Set content_index
model.setPart(/* value */);  // Set part

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventResponseContentPartAdded::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventResponseContentPartAdded::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventResponseContentPartAddedPart

```cpp
// Create a model
auto model = models::RealtimeServerEventResponseContentPartAddedPart();
model.setType(/* value */);  // Set type
model.setText(/* value */);  // Set text
model.setAudio(/* value */);  // Set audio
model.setTranscript(/* value */);  // Set transcript

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventResponseContentPartAddedPart::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventResponseContentPartAddedPart::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventResponseContentPartDone

```cpp
// Create a model
auto model = models::RealtimeServerEventResponseContentPartDone();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setResponseId(/* value */);  // Set response_id
model.setItemId(/* value */);  // Set item_id
model.setOutputIndex(/* value */);  // Set output_index
model.setContentIndex(/* value */);  // Set content_index
model.setPart(/* value */);  // Set part

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventResponseContentPartDone::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventResponseContentPartDone::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventResponseContentPartDonePart

```cpp
// Create a model
auto model = models::RealtimeServerEventResponseContentPartDonePart();
model.setType(/* value */);  // Set type
model.setText(/* value */);  // Set text
model.setAudio(/* value */);  // Set audio
model.setTranscript(/* value */);  // Set transcript

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventResponseContentPartDonePart::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventResponseContentPartDonePart::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventResponseCreated

```cpp
// Create a model
auto model = models::RealtimeServerEventResponseCreated();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setResponse(/* value */);  // Set response

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventResponseCreated::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventResponseCreated::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventResponseDone

```cpp
// Create a model
auto model = models::RealtimeServerEventResponseDone();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setResponse(/* value */);  // Set response

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventResponseDone::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventResponseDone::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventResponseFunctionCallArgumentsDelta

```cpp
// Create a model
auto model = models::RealtimeServerEventResponseFunctionCallArgumentsDelta();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setResponseId(/* value */);  // Set response_id
model.setItemId(/* value */);  // Set item_id
model.setOutputIndex(/* value */);  // Set output_index
model.setCallId(/* value */);  // Set call_id
model.setDelta(/* value */);  // Set delta

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventResponseFunctionCallArgumentsDelta::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventResponseFunctionCallArgumentsDelta::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventResponseFunctionCallArgumentsDone

```cpp
// Create a model
auto model = models::RealtimeServerEventResponseFunctionCallArgumentsDone();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setResponseId(/* value */);  // Set response_id
model.setItemId(/* value */);  // Set item_id
model.setOutputIndex(/* value */);  // Set output_index
model.setCallId(/* value */);  // Set call_id
model.setArguments(/* value */);  // Set arguments

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventResponseFunctionCallArgumentsDone::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventResponseFunctionCallArgumentsDone::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventResponseOutputItemAdded

```cpp
// Create a model
auto model = models::RealtimeServerEventResponseOutputItemAdded();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setResponseId(/* value */);  // Set response_id
model.setOutputIndex(/* value */);  // Set output_index
model.setItem(/* value */);  // Set item

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventResponseOutputItemAdded::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventResponseOutputItemAdded::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventResponseOutputItemDone

```cpp
// Create a model
auto model = models::RealtimeServerEventResponseOutputItemDone();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setResponseId(/* value */);  // Set response_id
model.setOutputIndex(/* value */);  // Set output_index
model.setItem(/* value */);  // Set item

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventResponseOutputItemDone::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventResponseOutputItemDone::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventResponseTextDelta

```cpp
// Create a model
auto model = models::RealtimeServerEventResponseTextDelta();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setResponseId(/* value */);  // Set response_id
model.setItemId(/* value */);  // Set item_id
model.setOutputIndex(/* value */);  // Set output_index
model.setContentIndex(/* value */);  // Set content_index
model.setDelta(/* value */);  // Set delta

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventResponseTextDelta::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventResponseTextDelta::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventResponseTextDone

```cpp
// Create a model
auto model = models::RealtimeServerEventResponseTextDone();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setResponseId(/* value */);  // Set response_id
model.setItemId(/* value */);  // Set item_id
model.setOutputIndex(/* value */);  // Set output_index
model.setContentIndex(/* value */);  // Set content_index
model.setText(/* value */);  // Set text

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventResponseTextDone::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventResponseTextDone::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventSessionCreated

```cpp
// Create a model
auto model = models::RealtimeServerEventSessionCreated();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setSession(/* value */);  // Set session

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventSessionCreated::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventSessionCreated::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeServerEventSessionUpdated

```cpp
// Create a model
auto model = models::RealtimeServerEventSessionUpdated();
model.setEventId(/* value */);  // Set event_id
model.setType(/* value */);  // Set type
model.setSession(/* value */);  // Set session

// Serialize to JSON
nlohmann::json json = models::RealtimeServerEventSessionUpdated::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeServerEventSessionUpdated::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeSession

```cpp
// Create a model
auto model = models::RealtimeSession();
model.setId(/* value */);  // Set id
model.setModalities(/* value */);  // Set modalities
model.setModel(/* value */);  // Set model
model.setInstructions(/* value */);  // Set instructions
model.setVoice(/* value */);  // Set voice
model.setInputAudioFormat(/* value */);  // Set input_audio_format
model.setOutputAudioFormat(/* value */);  // Set output_audio_format
model.setInputAudioTranscription(/* value */);  // Set input_audio_transcription
model.setTurnDetection(/* value */);  // Set turn_detection
model.setTools(/* value */);  // Set tools
model.setToolChoice(/* value */);  // Set tool_choice
model.setTemperature(/* value */);  // Set temperature
model.setMaxResponseOutputTokens(/* value */);  // Set max_response_output_tokens

// Serialize to JSON
nlohmann::json json = models::RealtimeSession::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeSession::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeSessionCreateRequest

```cpp
// Create a model
auto model = models::RealtimeSessionCreateRequest();
model.setModalities(/* value */);  // Set modalities
model.setModel(/* value */);  // Set model
model.setInstructions(/* value */);  // Set instructions
model.setVoice(/* value */);  // Set voice
model.setInputAudioFormat(/* value */);  // Set input_audio_format
model.setOutputAudioFormat(/* value */);  // Set output_audio_format
model.setInputAudioTranscription(/* value */);  // Set input_audio_transcription
model.setTurnDetection(/* value */);  // Set turn_detection
model.setTools(/* value */);  // Set tools
model.setToolChoice(/* value */);  // Set tool_choice
model.setTemperature(/* value */);  // Set temperature
model.setMaxResponseOutputTokens(/* value */);  // Set max_response_output_tokens

// Serialize to JSON
nlohmann::json json = models::RealtimeSessionCreateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeSessionCreateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeSessionCreateRequestInputAudioTranscription

```cpp
// Create a model
auto model = models::RealtimeSessionCreateRequestInputAudioTranscription();
model.setModel(/* value */);  // Set model

// Serialize to JSON
nlohmann::json json = models::RealtimeSessionCreateRequestInputAudioTranscription::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeSessionCreateRequestInputAudioTranscription::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeSessionCreateRequestMaxResponseOutputTokens

```cpp
// Create a model
auto model = models::RealtimeSessionCreateRequestMaxResponseOutputTokens();

// Serialize to JSON
nlohmann::json json = models::RealtimeSessionCreateRequestMaxResponseOutputTokens::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeSessionCreateRequestMaxResponseOutputTokens::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeSessionCreateRequestToolsInner

```cpp
// Create a model
auto model = models::RealtimeSessionCreateRequestToolsInner();
model.setType(/* value */);  // Set type
model.setName(/* value */);  // Set name
model.setDescription(/* value */);  // Set description
model.setParameters(/* value */);  // Set parameters

// Serialize to JSON
nlohmann::json json = models::RealtimeSessionCreateRequestToolsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeSessionCreateRequestToolsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeSessionCreateRequestTurnDetection

```cpp
// Create a model
auto model = models::RealtimeSessionCreateRequestTurnDetection();
model.setType(/* value */);  // Set type
model.setThreshold(/* value */);  // Set threshold
model.setPrefixPaddingMs(/* value */);  // Set prefix_padding_ms
model.setSilenceDurationMs(/* value */);  // Set silence_duration_ms
model.setCreateResponse(/* value */);  // Set create_response

// Serialize to JSON
nlohmann::json json = models::RealtimeSessionCreateRequestTurnDetection::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeSessionCreateRequestTurnDetection::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeSessionCreateResponse

```cpp
// Create a model
auto model = models::RealtimeSessionCreateResponse();
model.setClientSecret(/* value */);  // Set client_secret
model.setModalities(/* value */);  // Set modalities
model.setInstructions(/* value */);  // Set instructions
model.setVoice(/* value */);  // Set voice
model.setInputAudioFormat(/* value */);  // Set input_audio_format
model.setOutputAudioFormat(/* value */);  // Set output_audio_format
model.setInputAudioTranscription(/* value */);  // Set input_audio_transcription
model.setTurnDetection(/* value */);  // Set turn_detection
model.setTools(/* value */);  // Set tools
model.setToolChoice(/* value */);  // Set tool_choice
model.setTemperature(/* value */);  // Set temperature
model.setMaxResponseOutputTokens(/* value */);  // Set max_response_output_tokens

// Serialize to JSON
nlohmann::json json = models::RealtimeSessionCreateResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeSessionCreateResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeSessionCreateResponseClientSecret

```cpp
// Create a model
auto model = models::RealtimeSessionCreateResponseClientSecret();
model.setValue(/* value */);  // Set value
model.setExpiresAt(/* value */);  // Set expires_at

// Serialize to JSON
nlohmann::json json = models::RealtimeSessionCreateResponseClientSecret::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeSessionCreateResponseClientSecret::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeSessionCreateResponseInputAudioTranscription

```cpp
// Create a model
auto model = models::RealtimeSessionCreateResponseInputAudioTranscription();
model.setModel(/* value */);  // Set model

// Serialize to JSON
nlohmann::json json = models::RealtimeSessionCreateResponseInputAudioTranscription::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeSessionCreateResponseInputAudioTranscription::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeSessionCreateResponseMaxResponseOutputTokens

```cpp
// Create a model
auto model = models::RealtimeSessionCreateResponseMaxResponseOutputTokens();

// Serialize to JSON
nlohmann::json json = models::RealtimeSessionCreateResponseMaxResponseOutputTokens::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeSessionCreateResponseMaxResponseOutputTokens::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeSessionCreateResponseToolsInner

```cpp
// Create a model
auto model = models::RealtimeSessionCreateResponseToolsInner();
model.setType(/* value */);  // Set type
model.setName(/* value */);  // Set name
model.setDescription(/* value */);  // Set description
model.setParameters(/* value */);  // Set parameters

// Serialize to JSON
nlohmann::json json = models::RealtimeSessionCreateResponseToolsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeSessionCreateResponseToolsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeSessionCreateResponseTurnDetection

```cpp
// Create a model
auto model = models::RealtimeSessionCreateResponseTurnDetection();
model.setType(/* value */);  // Set type
model.setThreshold(/* value */);  // Set threshold
model.setPrefixPaddingMs(/* value */);  // Set prefix_padding_ms
model.setSilenceDurationMs(/* value */);  // Set silence_duration_ms

// Serialize to JSON
nlohmann::json json = models::RealtimeSessionCreateResponseTurnDetection::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeSessionCreateResponseTurnDetection::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeSessionInputAudioTranscription

```cpp
// Create a model
auto model = models::RealtimeSessionInputAudioTranscription();
model.setModel(/* value */);  // Set model

// Serialize to JSON
nlohmann::json json = models::RealtimeSessionInputAudioTranscription::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeSessionInputAudioTranscription::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeSessionMaxResponseOutputTokens

```cpp
// Create a model
auto model = models::RealtimeSessionMaxResponseOutputTokens();

// Serialize to JSON
nlohmann::json json = models::RealtimeSessionMaxResponseOutputTokens::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeSessionMaxResponseOutputTokens::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeSessionModel

```cpp
// Create a model
auto model = models::RealtimeSessionModel();

// Serialize to JSON
nlohmann::json json = models::RealtimeSessionModel::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeSessionModel::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeSessionToolsInner

```cpp
// Create a model
auto model = models::RealtimeSessionToolsInner();
model.setType(/* value */);  // Set type
model.setName(/* value */);  // Set name
model.setDescription(/* value */);  // Set description
model.setParameters(/* value */);  // Set parameters

// Serialize to JSON
nlohmann::json json = models::RealtimeSessionToolsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeSessionToolsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RealtimeSessionTurnDetection

```cpp
// Create a model
auto model = models::RealtimeSessionTurnDetection();
model.setType(/* value */);  // Set type
model.setThreshold(/* value */);  // Set threshold
model.setPrefixPaddingMs(/* value */);  // Set prefix_padding_ms
model.setSilenceDurationMs(/* value */);  // Set silence_duration_ms

// Serialize to JSON
nlohmann::json json = models::RealtimeSessionTurnDetection::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RealtimeSessionTurnDetection::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ResponseFormatJsonObject

```cpp
// Create a model
auto model = models::ResponseFormatJsonObject();
model.setType(/* value */);  // Set type

// Serialize to JSON
nlohmann::json json = models::ResponseFormatJsonObject::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ResponseFormatJsonObject::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ResponseFormatJsonSchema

```cpp
// Create a model
auto model = models::ResponseFormatJsonSchema();
model.setType(/* value */);  // Set type
model.setJsonSchema(/* value */);  // Set json_schema

// Serialize to JSON
nlohmann::json json = models::ResponseFormatJsonSchema::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ResponseFormatJsonSchema::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ResponseFormatJsonSchemaJsonSchema

```cpp
// Create a model
auto model = models::ResponseFormatJsonSchemaJsonSchema();
model.setDescription(/* value */);  // Set description
model.setName(/* value */);  // Set name
model.setSchema(/* value */);  // Set schema
model.setStrict(/* value */);  // Set strict

// Serialize to JSON
nlohmann::json json = models::ResponseFormatJsonSchemaJsonSchema::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ResponseFormatJsonSchemaJsonSchema::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ResponseFormatText

```cpp
// Create a model
auto model = models::ResponseFormatText();
model.setType(/* value */);  // Set type

// Serialize to JSON
nlohmann::json json = models::ResponseFormatText::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ResponseFormatText::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunCompletionUsage

```cpp
// Create a model
auto model = models::RunCompletionUsage();
model.setCompletionTokens(/* value */);  // Set completion_tokens
model.setPromptTokens(/* value */);  // Set prompt_tokens
model.setTotalTokens(/* value */);  // Set total_tokens

// Serialize to JSON
nlohmann::json json = models::RunCompletionUsage::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunCompletionUsage::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ARunOnAThread

```cpp
// Create a model
auto model = models::ARunOnAThread();
model.setId(/* value */);  // Set id
model.setObject(/* value */);  // Set object
model.setCreatedAt(/* value */);  // Set created_at
model.setThreadId(/* value */);  // Set thread_id
model.setAssistantId(/* value */);  // Set assistant_id
model.setStatus(/* value */);  // Set status
model.setRequiredAction(/* value */);  // Set required_action
model.setLastError(/* value */);  // Set last_error
model.setExpiresAt(/* value */);  // Set expires_at
model.setStartedAt(/* value */);  // Set started_at
model.setCancelledAt(/* value */);  // Set cancelled_at
model.setFailedAt(/* value */);  // Set failed_at
model.setCompletedAt(/* value */);  // Set completed_at
model.setIncompleteDetails(/* value */);  // Set incomplete_details
model.setModel(/* value */);  // Set model
model.setInstructions(/* value */);  // Set instructions
model.setTools(/* value */);  // Set tools
model.setMetadata(/* value */);  // Set metadata
model.setUsage(/* value */);  // Set usage
model.setTemperature(/* value */);  // Set temperature
model.setTopP(/* value */);  // Set top_p
model.setMaxPromptTokens(/* value */);  // Set max_prompt_tokens
model.setMaxCompletionTokens(/* value */);  // Set max_completion_tokens
model.setTruncationStrategy(/* value */);  // Set truncation_strategy
model.setToolChoice(/* value */);  // Set tool_choice
model.setParallelToolCalls(/* value */);  // Set parallel_tool_calls
model.setResponseFormat(/* value */);  // Set response_format

// Serialize to JSON
nlohmann::json json = models::ARunOnAThread::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ARunOnAThread::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunObjectIncompleteDetails

```cpp
// Create a model
auto model = models::RunObjectIncompleteDetails();
model.setReason(/* value */);  // Set reason

// Serialize to JSON
nlohmann::json json = models::RunObjectIncompleteDetails::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunObjectIncompleteDetails::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunObjectLastError

```cpp
// Create a model
auto model = models::RunObjectLastError();
model.setCode(/* value */);  // Set code
model.setMessage(/* value */);  // Set message

// Serialize to JSON
nlohmann::json json = models::RunObjectLastError::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunObjectLastError::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunObjectRequiredAction

```cpp
// Create a model
auto model = models::RunObjectRequiredAction();
model.setType(/* value */);  // Set type
model.setSubmitToolOutputs(/* value */);  // Set submit_tool_outputs

// Serialize to JSON
nlohmann::json json = models::RunObjectRequiredAction::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunObjectRequiredAction::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunObjectRequiredActionSubmitToolOutputs

```cpp
// Create a model
auto model = models::RunObjectRequiredActionSubmitToolOutputs();
model.setToolCalls(/* value */);  // Set tool_calls

// Serialize to JSON
nlohmann::json json = models::RunObjectRequiredActionSubmitToolOutputs::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunObjectRequiredActionSubmitToolOutputs::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunObjectToolsInner

```cpp
// Create a model
auto model = models::RunObjectToolsInner();
model.setType(/* value */);  // Set type
model.setFileSearch(/* value */);  // Set file_search
model.setFunction(/* value */);  // Set function

// Serialize to JSON
nlohmann::json json = models::RunObjectToolsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunObjectToolsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStepCompletionUsage

```cpp
// Create a model
auto model = models::RunStepCompletionUsage();
model.setCompletionTokens(/* value */);  // Set completion_tokens
model.setPromptTokens(/* value */);  // Set prompt_tokens
model.setTotalTokens(/* value */);  // Set total_tokens

// Serialize to JSON
nlohmann::json json = models::RunStepCompletionUsage::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStepCompletionUsage::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStepDeltaObject

```cpp
// Create a model
auto model = models::RunStepDeltaObject();
model.setId(/* value */);  // Set id
model.setObject(/* value */);  // Set object
model.setDelta(/* value */);  // Set delta

// Serialize to JSON
nlohmann::json json = models::RunStepDeltaObject::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStepDeltaObject::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStepDeltaObjectDelta

```cpp
// Create a model
auto model = models::RunStepDeltaObjectDelta();
model.setStepDetails(/* value */);  // Set step_details

// Serialize to JSON
nlohmann::json json = models::RunStepDeltaObjectDelta::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStepDeltaObjectDelta::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStepDeltaObjectDeltaStepDetails

```cpp
// Create a model
auto model = models::RunStepDeltaObjectDeltaStepDetails();
model.setType(/* value */);  // Set type
model.setMessageCreation(/* value */);  // Set message_creation
model.setToolCalls(/* value */);  // Set tool_calls

// Serialize to JSON
nlohmann::json json = models::RunStepDeltaObjectDeltaStepDetails::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStepDeltaObjectDeltaStepDetails::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MessageCreation

```cpp
// Create a model
auto model = models::MessageCreation();
model.setType(/* value */);  // Set type
model.setMessageCreation(/* value */);  // Set message_creation

// Serialize to JSON
nlohmann::json json = models::MessageCreation::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MessageCreation::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStepDeltaStepDetailsMessageCreationObjectMessageCreation

```cpp
// Create a model
auto model = models::RunStepDeltaStepDetailsMessageCreationObjectMessageCreation();
model.setMessageId(/* value */);  // Set message_id

// Serialize to JSON
nlohmann::json json = models::RunStepDeltaStepDetailsMessageCreationObjectMessageCreation::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStepDeltaStepDetailsMessageCreationObjectMessageCreation::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CodeInterpreterToolCall

```cpp
// Create a model
auto model = models::CodeInterpreterToolCall();
model.setIndex(/* value */);  // Set index
model.setId(/* value */);  // Set id
model.setType(/* value */);  // Set type
model.setCodeInterpreter(/* value */);  // Set code_interpreter

// Serialize to JSON
nlohmann::json json = models::CodeInterpreterToolCall::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CodeInterpreterToolCall::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter

```cpp
// Create a model
auto model = models::RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter();
model.setInput(/* value */);  // Set input
model.setOutputs(/* value */);  // Set outputs

// Serialize to JSON
nlohmann::json json = models::RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner

```cpp
// Create a model
auto model = models::RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner();
model.setIndex(/* value */);  // Set index
model.setType(/* value */);  // Set type
model.setLogs(/* value */);  // Set logs
model.setImage(/* value */);  // Set image

// Serialize to JSON
nlohmann::json json = models::RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CodeInterpreterImageOutput

```cpp
// Create a model
auto model = models::CodeInterpreterImageOutput();
model.setIndex(/* value */);  // Set index
model.setType(/* value */);  // Set type
model.setImage(/* value */);  // Set image

// Serialize to JSON
nlohmann::json json = models::CodeInterpreterImageOutput::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CodeInterpreterImageOutput::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage

```cpp
// Create a model
auto model = models::RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage();
model.setFileId(/* value */);  // Set file_id

// Serialize to JSON
nlohmann::json json = models::RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CodeInterpreterLogOutput

```cpp
// Create a model
auto model = models::CodeInterpreterLogOutput();
model.setIndex(/* value */);  // Set index
model.setType(/* value */);  // Set type
model.setLogs(/* value */);  // Set logs

// Serialize to JSON
nlohmann::json json = models::CodeInterpreterLogOutput::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CodeInterpreterLogOutput::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FileSearchToolCall

```cpp
// Create a model
auto model = models::FileSearchToolCall();
model.setIndex(/* value */);  // Set index
model.setId(/* value */);  // Set id
model.setType(/* value */);  // Set type
model.setFileSearch(/* value */);  // Set file_search

// Serialize to JSON
nlohmann::json json = models::FileSearchToolCall::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FileSearchToolCall::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FunctionToolCall

```cpp
// Create a model
auto model = models::FunctionToolCall();
model.setIndex(/* value */);  // Set index
model.setId(/* value */);  // Set id
model.setType(/* value */);  // Set type
model.setFunction(/* value */);  // Set function

// Serialize to JSON
nlohmann::json json = models::FunctionToolCall::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FunctionToolCall::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStepDeltaStepDetailsToolCallsFunctionObjectFunction

```cpp
// Create a model
auto model = models::RunStepDeltaStepDetailsToolCallsFunctionObjectFunction();
model.setName(/* value */);  // Set name
model.setArguments(/* value */);  // Set arguments
model.setOutput(/* value */);  // Set output

// Serialize to JSON
nlohmann::json json = models::RunStepDeltaStepDetailsToolCallsFunctionObjectFunction::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStepDeltaStepDetailsToolCallsFunctionObjectFunction::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ToolCalls

```cpp
// Create a model
auto model = models::ToolCalls();
model.setType(/* value */);  // Set type
model.setToolCalls(/* value */);  // Set tool_calls

// Serialize to JSON
nlohmann::json json = models::ToolCalls::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ToolCalls::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStepDeltaStepDetailsToolCallsObjectToolCallsInner

```cpp
// Create a model
auto model = models::RunStepDeltaStepDetailsToolCallsObjectToolCallsInner();
model.setIndex(/* value */);  // Set index
model.setId(/* value */);  // Set id
model.setType(/* value */);  // Set type
model.setCodeInterpreter(/* value */);  // Set code_interpreter
model.setFileSearch(/* value */);  // Set file_search
model.setFunction(/* value */);  // Set function

// Serialize to JSON
nlohmann::json json = models::RunStepDeltaStepDetailsToolCallsObjectToolCallsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStepDeltaStepDetailsToolCallsObjectToolCallsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::MessageCreation

```cpp
// Create a model
auto model = models::MessageCreation();
model.setType(/* value */);  // Set type
model.setMessageCreation(/* value */);  // Set message_creation

// Serialize to JSON
nlohmann::json json = models::MessageCreation::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::MessageCreation::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStepDetailsMessageCreationObjectMessageCreation

```cpp
// Create a model
auto model = models::RunStepDetailsMessageCreationObjectMessageCreation();
model.setMessageId(/* value */);  // Set message_id

// Serialize to JSON
nlohmann::json json = models::RunStepDetailsMessageCreationObjectMessageCreation::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStepDetailsMessageCreationObjectMessageCreation::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CodeInterpreterToolCall

```cpp
// Create a model
auto model = models::CodeInterpreterToolCall();
model.setId(/* value */);  // Set id
model.setType(/* value */);  // Set type
model.setCodeInterpreter(/* value */);  // Set code_interpreter

// Serialize to JSON
nlohmann::json json = models::CodeInterpreterToolCall::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CodeInterpreterToolCall::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStepDetailsToolCallsCodeObjectCodeInterpreter

```cpp
// Create a model
auto model = models::RunStepDetailsToolCallsCodeObjectCodeInterpreter();
model.setInput(/* value */);  // Set input
model.setOutputs(/* value */);  // Set outputs

// Serialize to JSON
nlohmann::json json = models::RunStepDetailsToolCallsCodeObjectCodeInterpreter::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStepDetailsToolCallsCodeObjectCodeInterpreter::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner

```cpp
// Create a model
auto model = models::RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner();
model.setType(/* value */);  // Set type
model.setLogs(/* value */);  // Set logs
model.setImage(/* value */);  // Set image

// Serialize to JSON
nlohmann::json json = models::RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CodeInterpreterImageOutput

```cpp
// Create a model
auto model = models::CodeInterpreterImageOutput();
model.setType(/* value */);  // Set type
model.setImage(/* value */);  // Set image

// Serialize to JSON
nlohmann::json json = models::CodeInterpreterImageOutput::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CodeInterpreterImageOutput::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStepDetailsToolCallsCodeOutputImageObjectImage

```cpp
// Create a model
auto model = models::RunStepDetailsToolCallsCodeOutputImageObjectImage();
model.setFileId(/* value */);  // Set file_id

// Serialize to JSON
nlohmann::json json = models::RunStepDetailsToolCallsCodeOutputImageObjectImage::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStepDetailsToolCallsCodeOutputImageObjectImage::fromJson(nlohmann::json::parse(jsonString));
```
#### models::CodeInterpreterLogOutput

```cpp
// Create a model
auto model = models::CodeInterpreterLogOutput();
model.setType(/* value */);  // Set type
model.setLogs(/* value */);  // Set logs

// Serialize to JSON
nlohmann::json json = models::CodeInterpreterLogOutput::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::CodeInterpreterLogOutput::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FileSearchToolCall

```cpp
// Create a model
auto model = models::FileSearchToolCall();
model.setId(/* value */);  // Set id
model.setType(/* value */);  // Set type
model.setFileSearch(/* value */);  // Set file_search

// Serialize to JSON
nlohmann::json json = models::FileSearchToolCall::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FileSearchToolCall::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStepDetailsToolCallsFileSearchObjectFileSearch

```cpp
// Create a model
auto model = models::RunStepDetailsToolCallsFileSearchObjectFileSearch();
model.setRankingOptions(/* value */);  // Set ranking_options
model.setResults(/* value */);  // Set results

// Serialize to JSON
nlohmann::json json = models::RunStepDetailsToolCallsFileSearchObjectFileSearch::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStepDetailsToolCallsFileSearchObjectFileSearch::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FileSearchToolCallRankingOptions

```cpp
// Create a model
auto model = models::FileSearchToolCallRankingOptions();
model.setRanker(/* value */);  // Set ranker
model.setScoreThreshold(/* value */);  // Set score_threshold

// Serialize to JSON
nlohmann::json json = models::FileSearchToolCallRankingOptions::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FileSearchToolCallRankingOptions::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FileSearchToolCallResult

```cpp
// Create a model
auto model = models::FileSearchToolCallResult();
model.setFileId(/* value */);  // Set file_id
model.setFileName(/* value */);  // Set file_name
model.setScore(/* value */);  // Set score
model.setContent(/* value */);  // Set content

// Serialize to JSON
nlohmann::json json = models::FileSearchToolCallResult::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FileSearchToolCallResult::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStepDetailsToolCallsFileSearchResultObjectContentInner

```cpp
// Create a model
auto model = models::RunStepDetailsToolCallsFileSearchResultObjectContentInner();
model.setType(/* value */);  // Set type
model.setText(/* value */);  // Set text

// Serialize to JSON
nlohmann::json json = models::RunStepDetailsToolCallsFileSearchResultObjectContentInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStepDetailsToolCallsFileSearchResultObjectContentInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::FunctionToolCall

```cpp
// Create a model
auto model = models::FunctionToolCall();
model.setId(/* value */);  // Set id
model.setType(/* value */);  // Set type
model.setFunction(/* value */);  // Set function

// Serialize to JSON
nlohmann::json json = models::FunctionToolCall::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::FunctionToolCall::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStepDetailsToolCallsFunctionObjectFunction

```cpp
// Create a model
auto model = models::RunStepDetailsToolCallsFunctionObjectFunction();
model.setName(/* value */);  // Set name
model.setArguments(/* value */);  // Set arguments
model.setOutput(/* value */);  // Set output

// Serialize to JSON
nlohmann::json json = models::RunStepDetailsToolCallsFunctionObjectFunction::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStepDetailsToolCallsFunctionObjectFunction::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ToolCalls

```cpp
// Create a model
auto model = models::ToolCalls();
model.setType(/* value */);  // Set type
model.setToolCalls(/* value */);  // Set tool_calls

// Serialize to JSON
nlohmann::json json = models::ToolCalls::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ToolCalls::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStepDetailsToolCallsObjectToolCallsInner

```cpp
// Create a model
auto model = models::RunStepDetailsToolCallsObjectToolCallsInner();
model.setId(/* value */);  // Set id
model.setType(/* value */);  // Set type
model.setCodeInterpreter(/* value */);  // Set code_interpreter
model.setFileSearch(/* value */);  // Set file_search
model.setFunction(/* value */);  // Set function

// Serialize to JSON
nlohmann::json json = models::RunStepDetailsToolCallsObjectToolCallsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStepDetailsToolCallsObjectToolCallsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunSteps

```cpp
// Create a model
auto model = models::RunSteps();
model.setId(/* value */);  // Set id
model.setObject(/* value */);  // Set object
model.setCreatedAt(/* value */);  // Set created_at
model.setAssistantId(/* value */);  // Set assistant_id
model.setThreadId(/* value */);  // Set thread_id
model.setRunId(/* value */);  // Set run_id
model.setType(/* value */);  // Set type
model.setStatus(/* value */);  // Set status
model.setStepDetails(/* value */);  // Set step_details
model.setLastError(/* value */);  // Set last_error
model.setExpiredAt(/* value */);  // Set expired_at
model.setCancelledAt(/* value */);  // Set cancelled_at
model.setFailedAt(/* value */);  // Set failed_at
model.setCompletedAt(/* value */);  // Set completed_at
model.setMetadata(/* value */);  // Set metadata
model.setUsage(/* value */);  // Set usage

// Serialize to JSON
nlohmann::json json = models::RunSteps::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunSteps::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStepObjectLastError

```cpp
// Create a model
auto model = models::RunStepObjectLastError();
model.setCode(/* value */);  // Set code
model.setMessage(/* value */);  // Set message

// Serialize to JSON
nlohmann::json json = models::RunStepObjectLastError::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStepObjectLastError::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStepObjectStepDetails

```cpp
// Create a model
auto model = models::RunStepObjectStepDetails();
model.setType(/* value */);  // Set type
model.setMessageCreation(/* value */);  // Set message_creation
model.setToolCalls(/* value */);  // Set tool_calls

// Serialize to JSON
nlohmann::json json = models::RunStepObjectStepDetails::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStepObjectStepDetails::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStepStreamEvent

```cpp
// Create a model
auto model = models::RunStepStreamEvent();
model.setEvent(/* value */);  // Set event
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::RunStepStreamEvent::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStepStreamEvent::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStepStreamEventOneOf

```cpp
// Create a model
auto model = models::RunStepStreamEventOneOf();
model.setEvent(/* value */);  // Set event
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::RunStepStreamEventOneOf::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStepStreamEventOneOf::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStepStreamEventOneOf1

```cpp
// Create a model
auto model = models::RunStepStreamEventOneOf1();
model.setEvent(/* value */);  // Set event
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::RunStepStreamEventOneOf1::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStepStreamEventOneOf1::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStepStreamEventOneOf2

```cpp
// Create a model
auto model = models::RunStepStreamEventOneOf2();
model.setEvent(/* value */);  // Set event
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::RunStepStreamEventOneOf2::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStepStreamEventOneOf2::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStepStreamEventOneOf3

```cpp
// Create a model
auto model = models::RunStepStreamEventOneOf3();
model.setEvent(/* value */);  // Set event
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::RunStepStreamEventOneOf3::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStepStreamEventOneOf3::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStepStreamEventOneOf4

```cpp
// Create a model
auto model = models::RunStepStreamEventOneOf4();
model.setEvent(/* value */);  // Set event
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::RunStepStreamEventOneOf4::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStepStreamEventOneOf4::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStepStreamEventOneOf5

```cpp
// Create a model
auto model = models::RunStepStreamEventOneOf5();
model.setEvent(/* value */);  // Set event
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::RunStepStreamEventOneOf5::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStepStreamEventOneOf5::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStepStreamEventOneOf6

```cpp
// Create a model
auto model = models::RunStepStreamEventOneOf6();
model.setEvent(/* value */);  // Set event
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::RunStepStreamEventOneOf6::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStepStreamEventOneOf6::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStreamEvent

```cpp
// Create a model
auto model = models::RunStreamEvent();
model.setEvent(/* value */);  // Set event
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::RunStreamEvent::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStreamEvent::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStreamEventOneOf

```cpp
// Create a model
auto model = models::RunStreamEventOneOf();
model.setEvent(/* value */);  // Set event
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::RunStreamEventOneOf::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStreamEventOneOf::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStreamEventOneOf1

```cpp
// Create a model
auto model = models::RunStreamEventOneOf1();
model.setEvent(/* value */);  // Set event
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::RunStreamEventOneOf1::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStreamEventOneOf1::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStreamEventOneOf2

```cpp
// Create a model
auto model = models::RunStreamEventOneOf2();
model.setEvent(/* value */);  // Set event
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::RunStreamEventOneOf2::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStreamEventOneOf2::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStreamEventOneOf3

```cpp
// Create a model
auto model = models::RunStreamEventOneOf3();
model.setEvent(/* value */);  // Set event
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::RunStreamEventOneOf3::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStreamEventOneOf3::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStreamEventOneOf4

```cpp
// Create a model
auto model = models::RunStreamEventOneOf4();
model.setEvent(/* value */);  // Set event
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::RunStreamEventOneOf4::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStreamEventOneOf4::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStreamEventOneOf5

```cpp
// Create a model
auto model = models::RunStreamEventOneOf5();
model.setEvent(/* value */);  // Set event
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::RunStreamEventOneOf5::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStreamEventOneOf5::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStreamEventOneOf6

```cpp
// Create a model
auto model = models::RunStreamEventOneOf6();
model.setEvent(/* value */);  // Set event
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::RunStreamEventOneOf6::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStreamEventOneOf6::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStreamEventOneOf7

```cpp
// Create a model
auto model = models::RunStreamEventOneOf7();
model.setEvent(/* value */);  // Set event
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::RunStreamEventOneOf7::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStreamEventOneOf7::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStreamEventOneOf8

```cpp
// Create a model
auto model = models::RunStreamEventOneOf8();
model.setEvent(/* value */);  // Set event
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::RunStreamEventOneOf8::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStreamEventOneOf8::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunStreamEventOneOf9

```cpp
// Create a model
auto model = models::RunStreamEventOneOf9();
model.setEvent(/* value */);  // Set event
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::RunStreamEventOneOf9::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunStreamEventOneOf9::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunToolCallObject

```cpp
// Create a model
auto model = models::RunToolCallObject();
model.setId(/* value */);  // Set id
model.setType(/* value */);  // Set type
model.setFunction(/* value */);  // Set function

// Serialize to JSON
nlohmann::json json = models::RunToolCallObject::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunToolCallObject::fromJson(nlohmann::json::parse(jsonString));
```
#### models::RunToolCallObjectFunction

```cpp
// Create a model
auto model = models::RunToolCallObjectFunction();
model.setName(/* value */);  // Set name
model.setArguments(/* value */);  // Set arguments

// Serialize to JSON
nlohmann::json json = models::RunToolCallObjectFunction::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::RunToolCallObjectFunction::fromJson(nlohmann::json::parse(jsonString));
```
#### models::StaticChunkingStrategy

```cpp
// Create a model
auto model = models::StaticChunkingStrategy();
model.setType(/* value */);  // Set type
model.setRStatic(/* value */);  // Set static

// Serialize to JSON
nlohmann::json json = models::StaticChunkingStrategy::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::StaticChunkingStrategy::fromJson(nlohmann::json::parse(jsonString));
```
#### models::StaticChunkingStrategy

```cpp
// Create a model
auto model = models::StaticChunkingStrategy();
model.setType(/* value */);  // Set type
model.setRStatic(/* value */);  // Set static

// Serialize to JSON
nlohmann::json json = models::StaticChunkingStrategy::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::StaticChunkingStrategy::fromJson(nlohmann::json::parse(jsonString));
```
#### models::StaticChunkingStrategy1Static

```cpp
// Create a model
auto model = models::StaticChunkingStrategy1Static();
model.setMaxChunkSizeTokens(/* value */);  // Set max_chunk_size_tokens
model.setChunkOverlapTokens(/* value */);  // Set chunk_overlap_tokens

// Serialize to JSON
nlohmann::json json = models::StaticChunkingStrategy1Static::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::StaticChunkingStrategy1Static::fromJson(nlohmann::json::parse(jsonString));
```
#### models::StaticChunkingStrategy

```cpp
// Create a model
auto model = models::StaticChunkingStrategy();
model.setType(/* value */);  // Set type
model.setRStatic(/* value */);  // Set static

// Serialize to JSON
nlohmann::json json = models::StaticChunkingStrategy::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::StaticChunkingStrategy::fromJson(nlohmann::json::parse(jsonString));
```
#### models::StaticChunkingStrategyStatic

```cpp
// Create a model
auto model = models::StaticChunkingStrategyStatic();
model.setMaxChunkSizeTokens(/* value */);  // Set max_chunk_size_tokens
model.setChunkOverlapTokens(/* value */);  // Set chunk_overlap_tokens

// Serialize to JSON
nlohmann::json json = models::StaticChunkingStrategyStatic::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::StaticChunkingStrategyStatic::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SubmitToolOutputsRunRequest

```cpp
// Create a model
auto model = models::SubmitToolOutputsRunRequest();
model.setToolOutputs(/* value */);  // Set tool_outputs
model.setStream(/* value */);  // Set stream

// Serialize to JSON
nlohmann::json json = models::SubmitToolOutputsRunRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SubmitToolOutputsRunRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SubmitToolOutputsRunRequestToolOutputsInner

```cpp
// Create a model
auto model = models::SubmitToolOutputsRunRequestToolOutputsInner();
model.setToolCallId(/* value */);  // Set tool_call_id
model.setOutput(/* value */);  // Set output

// Serialize to JSON
nlohmann::json json = models::SubmitToolOutputsRunRequestToolOutputsInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SubmitToolOutputsRunRequestToolOutputsInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Thread

```cpp
// Create a model
auto model = models::Thread();
model.setId(/* value */);  // Set id
model.setObject(/* value */);  // Set object
model.setCreatedAt(/* value */);  // Set created_at
model.setToolResources(/* value */);  // Set tool_resources
model.setMetadata(/* value */);  // Set metadata

// Serialize to JSON
nlohmann::json json = models::Thread::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Thread::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ThreadObjectToolResources

```cpp
// Create a model
auto model = models::ThreadObjectToolResources();
model.setCodeInterpreter(/* value */);  // Set code_interpreter
model.setFileSearch(/* value */);  // Set file_search

// Serialize to JSON
nlohmann::json json = models::ThreadObjectToolResources::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ThreadObjectToolResources::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ThreadObjectToolResourcesCodeInterpreter

```cpp
// Create a model
auto model = models::ThreadObjectToolResourcesCodeInterpreter();
model.setFileIds(/* value */);  // Set file_ids

// Serialize to JSON
nlohmann::json json = models::ThreadObjectToolResourcesCodeInterpreter::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ThreadObjectToolResourcesCodeInterpreter::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ThreadObjectToolResourcesFileSearch

```cpp
// Create a model
auto model = models::ThreadObjectToolResourcesFileSearch();
model.setVectorStoreIds(/* value */);  // Set vector_store_ids

// Serialize to JSON
nlohmann::json json = models::ThreadObjectToolResourcesFileSearch::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ThreadObjectToolResourcesFileSearch::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ThreadStreamEvent

```cpp
// Create a model
auto model = models::ThreadStreamEvent();
model.setEnabled(/* value */);  // Set enabled
model.setEvent(/* value */);  // Set event
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::ThreadStreamEvent::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ThreadStreamEvent::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TranscriptionSegment

```cpp
// Create a model
auto model = models::TranscriptionSegment();
model.setId(/* value */);  // Set id
model.setSeek(/* value */);  // Set seek
model.setStart(/* value */);  // Set start
model.setEnd(/* value */);  // Set end
model.setText(/* value */);  // Set text
model.setTokens(/* value */);  // Set tokens
model.setTemperature(/* value */);  // Set temperature
model.setAvgLogprob(/* value */);  // Set avg_logprob
model.setCompressionRatio(/* value */);  // Set compression_ratio
model.setNoSpeechProb(/* value */);  // Set no_speech_prob

// Serialize to JSON
nlohmann::json json = models::TranscriptionSegment::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TranscriptionSegment::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TranscriptionWord

```cpp
// Create a model
auto model = models::TranscriptionWord();
model.setWord(/* value */);  // Set word
model.setStart(/* value */);  // Set start
model.setEnd(/* value */);  // Set end

// Serialize to JSON
nlohmann::json json = models::TranscriptionWord::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TranscriptionWord::fromJson(nlohmann::json::parse(jsonString));
```
#### models::ThreadTruncationControls

```cpp
// Create a model
auto model = models::ThreadTruncationControls();
model.setType(/* value */);  // Set type
model.setLastMessages(/* value */);  // Set last_messages

// Serialize to JSON
nlohmann::json json = models::ThreadTruncationControls::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::ThreadTruncationControls::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UpdateVectorStoreRequest

```cpp
// Create a model
auto model = models::UpdateVectorStoreRequest();
model.setName(/* value */);  // Set name
model.setExpiresAfter(/* value */);  // Set expires_after
model.setMetadata(/* value */);  // Set metadata

// Serialize to JSON
nlohmann::json json = models::UpdateVectorStoreRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UpdateVectorStoreRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Upload

```cpp
// Create a model
auto model = models::Upload();
model.setId(/* value */);  // Set id
model.setCreatedAt(/* value */);  // Set created_at
model.setFilename(/* value */);  // Set filename
model.setBytes(/* value */);  // Set bytes
model.setPurpose(/* value */);  // Set purpose
model.setStatus(/* value */);  // Set status
model.setExpiresAt(/* value */);  // Set expires_at
model.setObject(/* value */);  // Set object
model.setFile(/* value */);  // Set file

// Serialize to JSON
nlohmann::json json = models::Upload::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Upload::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UploadPart

```cpp
// Create a model
auto model = models::UploadPart();
model.setId(/* value */);  // Set id
model.setCreatedAt(/* value */);  // Set created_at
model.setUploadId(/* value */);  // Set upload_id
model.setObject(/* value */);  // Set object

// Serialize to JSON
nlohmann::json json = models::UploadPart::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UploadPart::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UsageAudioSpeechesResult

```cpp
// Create a model
auto model = models::UsageAudioSpeechesResult();
model.setObject(/* value */);  // Set object
model.setCharacters(/* value */);  // Set characters
model.setNumModelRequests(/* value */);  // Set num_model_requests
model.setProjectId(/* value */);  // Set project_id
model.setUserId(/* value */);  // Set user_id
model.setApiKeyId(/* value */);  // Set api_key_id
model.setModel(/* value */);  // Set model

// Serialize to JSON
nlohmann::json json = models::UsageAudioSpeechesResult::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UsageAudioSpeechesResult::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UsageAudioTranscriptionsResult

```cpp
// Create a model
auto model = models::UsageAudioTranscriptionsResult();
model.setObject(/* value */);  // Set object
model.setSeconds(/* value */);  // Set seconds
model.setNumModelRequests(/* value */);  // Set num_model_requests
model.setProjectId(/* value */);  // Set project_id
model.setUserId(/* value */);  // Set user_id
model.setApiKeyId(/* value */);  // Set api_key_id
model.setModel(/* value */);  // Set model

// Serialize to JSON
nlohmann::json json = models::UsageAudioTranscriptionsResult::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UsageAudioTranscriptionsResult::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UsageCodeInterpreterSessionsResult

```cpp
// Create a model
auto model = models::UsageCodeInterpreterSessionsResult();
model.setObject(/* value */);  // Set object
model.setSessions(/* value */);  // Set sessions
model.setProjectId(/* value */);  // Set project_id

// Serialize to JSON
nlohmann::json json = models::UsageCodeInterpreterSessionsResult::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UsageCodeInterpreterSessionsResult::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UsageCompletionsResult

```cpp
// Create a model
auto model = models::UsageCompletionsResult();
model.setObject(/* value */);  // Set object
model.setInputTokens(/* value */);  // Set input_tokens
model.setInputCachedTokens(/* value */);  // Set input_cached_tokens
model.setOutputTokens(/* value */);  // Set output_tokens
model.setInputAudioTokens(/* value */);  // Set input_audio_tokens
model.setOutputAudioTokens(/* value */);  // Set output_audio_tokens
model.setNumModelRequests(/* value */);  // Set num_model_requests
model.setProjectId(/* value */);  // Set project_id
model.setUserId(/* value */);  // Set user_id
model.setApiKeyId(/* value */);  // Set api_key_id
model.setModel(/* value */);  // Set model
model.setBatch(/* value */);  // Set batch

// Serialize to JSON
nlohmann::json json = models::UsageCompletionsResult::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UsageCompletionsResult::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UsageEmbeddingsResult

```cpp
// Create a model
auto model = models::UsageEmbeddingsResult();
model.setObject(/* value */);  // Set object
model.setInputTokens(/* value */);  // Set input_tokens
model.setNumModelRequests(/* value */);  // Set num_model_requests
model.setProjectId(/* value */);  // Set project_id
model.setUserId(/* value */);  // Set user_id
model.setApiKeyId(/* value */);  // Set api_key_id
model.setModel(/* value */);  // Set model

// Serialize to JSON
nlohmann::json json = models::UsageEmbeddingsResult::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UsageEmbeddingsResult::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UsageImagesResult

```cpp
// Create a model
auto model = models::UsageImagesResult();
model.setObject(/* value */);  // Set object
model.setImages(/* value */);  // Set images
model.setNumModelRequests(/* value */);  // Set num_model_requests
model.setSource(/* value */);  // Set source
model.setSize(/* value */);  // Set size
model.setProjectId(/* value */);  // Set project_id
model.setUserId(/* value */);  // Set user_id
model.setApiKeyId(/* value */);  // Set api_key_id
model.setModel(/* value */);  // Set model

// Serialize to JSON
nlohmann::json json = models::UsageImagesResult::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UsageImagesResult::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UsageModerationsResult

```cpp
// Create a model
auto model = models::UsageModerationsResult();
model.setObject(/* value */);  // Set object
model.setInputTokens(/* value */);  // Set input_tokens
model.setNumModelRequests(/* value */);  // Set num_model_requests
model.setProjectId(/* value */);  // Set project_id
model.setUserId(/* value */);  // Set user_id
model.setApiKeyId(/* value */);  // Set api_key_id
model.setModel(/* value */);  // Set model

// Serialize to JSON
nlohmann::json json = models::UsageModerationsResult::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UsageModerationsResult::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UsageResponse

```cpp
// Create a model
auto model = models::UsageResponse();
model.setObject(/* value */);  // Set object
model.setData(/* value */);  // Set data
model.setHasMore(/* value */);  // Set has_more
model.setNextPage(/* value */);  // Set next_page

// Serialize to JSON
nlohmann::json json = models::UsageResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UsageResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UsageTimeBucket

```cpp
// Create a model
auto model = models::UsageTimeBucket();
model.setObject(/* value */);  // Set object
model.setStartTime(/* value */);  // Set start_time
model.setEndTime(/* value */);  // Set end_time
model.setResult(/* value */);  // Set result

// Serialize to JSON
nlohmann::json json = models::UsageTimeBucket::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UsageTimeBucket::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UsageTimeBucketResultInner

```cpp
// Create a model
auto model = models::UsageTimeBucketResultInner();
model.setObject(/* value */);  // Set object
model.setInputTokens(/* value */);  // Set input_tokens
model.setInputCachedTokens(/* value */);  // Set input_cached_tokens
model.setOutputTokens(/* value */);  // Set output_tokens
model.setInputAudioTokens(/* value */);  // Set input_audio_tokens
model.setOutputAudioTokens(/* value */);  // Set output_audio_tokens
model.setNumModelRequests(/* value */);  // Set num_model_requests
model.setProjectId(/* value */);  // Set project_id
model.setUserId(/* value */);  // Set user_id
model.setApiKeyId(/* value */);  // Set api_key_id
model.setModel(/* value */);  // Set model
model.setBatch(/* value */);  // Set batch
model.setImages(/* value */);  // Set images
model.setSource(/* value */);  // Set source
model.setSize(/* value */);  // Set size
model.setCharacters(/* value */);  // Set characters
model.setSeconds(/* value */);  // Set seconds
model.setUsageBytes(/* value */);  // Set usage_bytes
model.setSessions(/* value */);  // Set sessions
model.setAmount(/* value */);  // Set amount
model.setLineItem(/* value */);  // Set line_item

// Serialize to JSON
nlohmann::json json = models::UsageTimeBucketResultInner::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UsageTimeBucketResultInner::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UsageVectorStoresResult

```cpp
// Create a model
auto model = models::UsageVectorStoresResult();
model.setObject(/* value */);  // Set object
model.setUsageBytes(/* value */);  // Set usage_bytes
model.setProjectId(/* value */);  // Set project_id

// Serialize to JSON
nlohmann::json json = models::UsageVectorStoresResult::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UsageVectorStoresResult::fromJson(nlohmann::json::parse(jsonString));
```
#### models::User

```cpp
// Create a model
auto model = models::User();
model.setObject(/* value */);  // Set object
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setEmail(/* value */);  // Set email
model.setRole(/* value */);  // Set role
model.setAddedAt(/* value */);  // Set added_at

// Serialize to JSON
nlohmann::json json = models::User::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::User::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UserDeleteResponse

```cpp
// Create a model
auto model = models::UserDeleteResponse();
model.setObject(/* value */);  // Set object
model.setId(/* value */);  // Set id
model.setDeleted(/* value */);  // Set deleted

// Serialize to JSON
nlohmann::json json = models::UserDeleteResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UserDeleteResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UserListResponse

```cpp
// Create a model
auto model = models::UserListResponse();
model.setObject(/* value */);  // Set object
model.setData(/* value */);  // Set data
model.setFirstId(/* value */);  // Set first_id
model.setLastId(/* value */);  // Set last_id
model.setHasMore(/* value */);  // Set has_more

// Serialize to JSON
nlohmann::json json = models::UserListResponse::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UserListResponse::fromJson(nlohmann::json::parse(jsonString));
```
#### models::UserRoleUpdateRequest

```cpp
// Create a model
auto model = models::UserRoleUpdateRequest();
model.setRole(/* value */);  // Set role

// Serialize to JSON
nlohmann::json json = models::UserRoleUpdateRequest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::UserRoleUpdateRequest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::VectorStoreExpirationPolicy

```cpp
// Create a model
auto model = models::VectorStoreExpirationPolicy();
model.setAnchor(/* value */);  // Set anchor
model.setDays(/* value */);  // Set days

// Serialize to JSON
nlohmann::json json = models::VectorStoreExpirationPolicy::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::VectorStoreExpirationPolicy::fromJson(nlohmann::json::parse(jsonString));
```
#### models::VectorStoreFileBatch

```cpp
// Create a model
auto model = models::VectorStoreFileBatch();
model.setId(/* value */);  // Set id
model.setObject(/* value */);  // Set object
model.setCreatedAt(/* value */);  // Set created_at
model.setVectorStoreId(/* value */);  // Set vector_store_id
model.setStatus(/* value */);  // Set status
model.setFileCounts(/* value */);  // Set file_counts

// Serialize to JSON
nlohmann::json json = models::VectorStoreFileBatch::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::VectorStoreFileBatch::fromJson(nlohmann::json::parse(jsonString));
```
#### models::VectorStoreFileBatchObjectFileCounts

```cpp
// Create a model
auto model = models::VectorStoreFileBatchObjectFileCounts();
model.setInProgress(/* value */);  // Set in_progress
model.setCompleted(/* value */);  // Set completed
model.setFailed(/* value */);  // Set failed
model.setCancelled(/* value */);  // Set cancelled
model.setTotal(/* value */);  // Set total

// Serialize to JSON
nlohmann::json json = models::VectorStoreFileBatchObjectFileCounts::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::VectorStoreFileBatchObjectFileCounts::fromJson(nlohmann::json::parse(jsonString));
```
#### models::VectorStoreFiles

```cpp
// Create a model
auto model = models::VectorStoreFiles();
model.setId(/* value */);  // Set id
model.setObject(/* value */);  // Set object
model.setUsageBytes(/* value */);  // Set usage_bytes
model.setCreatedAt(/* value */);  // Set created_at
model.setVectorStoreId(/* value */);  // Set vector_store_id
model.setStatus(/* value */);  // Set status
model.setLastError(/* value */);  // Set last_error
model.setChunkingStrategy(/* value */);  // Set chunking_strategy

// Serialize to JSON
nlohmann::json json = models::VectorStoreFiles::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::VectorStoreFiles::fromJson(nlohmann::json::parse(jsonString));
```
#### models::VectorStoreFileObjectChunkingStrategy

```cpp
// Create a model
auto model = models::VectorStoreFileObjectChunkingStrategy();
model.setType(/* value */);  // Set type
model.setRStatic(/* value */);  // Set static

// Serialize to JSON
nlohmann::json json = models::VectorStoreFileObjectChunkingStrategy::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::VectorStoreFileObjectChunkingStrategy::fromJson(nlohmann::json::parse(jsonString));
```
#### models::VectorStoreFileObjectLastError

```cpp
// Create a model
auto model = models::VectorStoreFileObjectLastError();
model.setCode(/* value */);  // Set code
model.setMessage(/* value */);  // Set message

// Serialize to JSON
nlohmann::json json = models::VectorStoreFileObjectLastError::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::VectorStoreFileObjectLastError::fromJson(nlohmann::json::parse(jsonString));
```
#### models::VectorStore

```cpp
// Create a model
auto model = models::VectorStore();
model.setId(/* value */);  // Set id
model.setObject(/* value */);  // Set object
model.setCreatedAt(/* value */);  // Set created_at
model.setName(/* value */);  // Set name
model.setUsageBytes(/* value */);  // Set usage_bytes
model.setFileCounts(/* value */);  // Set file_counts
model.setStatus(/* value */);  // Set status
model.setExpiresAfter(/* value */);  // Set expires_after
model.setExpiresAt(/* value */);  // Set expires_at
model.setLastActiveAt(/* value */);  // Set last_active_at
model.setMetadata(/* value */);  // Set metadata

// Serialize to JSON
nlohmann::json json = models::VectorStore::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::VectorStore::fromJson(nlohmann::json::parse(jsonString));
```
#### models::VectorStoreObjectFileCounts

```cpp
// Create a model
auto model = models::VectorStoreObjectFileCounts();
model.setInProgress(/* value */);  // Set in_progress
model.setCompleted(/* value */);  // Set completed
model.setFailed(/* value */);  // Set failed
model.setCancelled(/* value */);  // Set cancelled
model.setTotal(/* value */);  // Set total

// Serialize to JSON
nlohmann::json json = models::VectorStoreObjectFileCounts::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::VectorStoreObjectFileCounts::fromJson(nlohmann::json::parse(jsonString));
```

## Implementing API Handlers

### API Classes

Each API is generated as an abstract base class with pure virtual methods that you must implement.

#### Assistants

Create a class that inherits from the generated base class:

```cpp
#include "api/AssistantsApi.h"

class AssistantsImpl : public Api::Assistants {
public:
    ThreadsthreadIdrunsrunIdcancelPostResponse handlePostForThreadsthreadIdrunsrunIdcancel(const ThreadsthreadIdrunsrunIdcancelPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_threadId
        // Path: params.m_runId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_RUN_OBJECT):
        models::RunObject successResponse;
        // ... populate response ...
        return successResponse;
    }

    AssistantsPostResponse handlePostForAssistants(const AssistantsPostRequest& params) override {
        // Access request parameters:
        // Body: params.m_request (std::optional<models::CreateAssistantRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ASSISTANT_OBJECT):
        models::AssistantObject successResponse;
        // ... populate response ...
        return successResponse;
    }

    ThreadsthreadIdmessagesPostResponse handlePostForThreadsthreadIdmessages(const ThreadsthreadIdmessagesPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_threadId
        // Body: params.m_request (std::optional<models::CreateMessageRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_MESSAGE_OBJECT):
        models::MessageObject successResponse;
        // ... populate response ...
        return successResponse;
    }

    ThreadsthreadIdrunsPostResponse handlePostForThreadsthreadIdruns(const ThreadsthreadIdrunsPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_threadId
        // Query: params.m_includeLeft_Square_BracketRight_Square_Bracket (optional)
        // Body: params.m_request (std::optional<models::CreateRunRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_RUN_OBJECT):
        models::RunObject successResponse;
        // ... populate response ...
        return successResponse;
    }

    ThreadsPostResponse handlePostForThreads(const ThreadsPostRequest& params) override {
        // Access request parameters:
        // Body: params.m_request (std::optional<models::CreateThreadRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_THREAD_OBJECT):
        models::ThreadObject successResponse;
        // ... populate response ...
        return successResponse;
    }

    ThreadsrunsPostResponse handlePostForThreadsruns(const ThreadsrunsPostRequest& params) override {
        // Access request parameters:
        // Body: params.m_request (std::optional<models::CreateThreadAndRunRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_RUN_OBJECT):
        models::RunObject successResponse;
        // ... populate response ...
        return successResponse;
    }

    AssistantsassistantIdDeleteResponse handleDeleteForAssistantsassistantId(const AssistantsassistantIdDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_assistantId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_DELETE_ASSISTANT_RESPONSE):
        models::DeleteAssistantResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    ThreadsthreadIdmessagesmessageIdDeleteResponse handleDeleteForThreadsthreadIdmessagesmessageId(const ThreadsthreadIdmessagesmessageIdDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_threadId
        // Path: params.m_messageId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_DELETE_MESSAGE_RESPONSE):
        models::DeleteMessageResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    ThreadsthreadIdDeleteResponse handleDeleteForThreadsthreadId(const ThreadsthreadIdDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_threadId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_DELETE_THREAD_RESPONSE):
        models::DeleteThreadResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    AssistantsassistantIdGetResponse handleGetForAssistantsassistantId(const AssistantsassistantIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_assistantId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ASSISTANT_OBJECT):
        models::AssistantObject successResponse;
        // ... populate response ...
        return successResponse;
    }

    ThreadsthreadIdmessagesmessageIdGetResponse handleGetForThreadsthreadIdmessagesmessageId(const ThreadsthreadIdmessagesmessageIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_threadId
        // Path: params.m_messageId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_MESSAGE_OBJECT):
        models::MessageObject successResponse;
        // ... populate response ...
        return successResponse;
    }

    ThreadsthreadIdrunsrunIdGetResponse handleGetForThreadsthreadIdrunsrunId(const ThreadsthreadIdrunsrunIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_threadId
        // Path: params.m_runId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_RUN_OBJECT):
        models::RunObject successResponse;
        // ... populate response ...
        return successResponse;
    }

    ThreadsthreadIdrunsrunIdstepsstepIdGetResponse handleGetForThreadsthreadIdrunsrunIdstepsstepId(const ThreadsthreadIdrunsrunIdstepsstepIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_threadId
        // Path: params.m_runId
        // Path: params.m_stepId
        // Query: params.m_includeLeft_Square_BracketRight_Square_Bracket (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_RUN_STEP_OBJECT):
        models::RunStepObject successResponse;
        // ... populate response ...
        return successResponse;
    }

    ThreadsthreadIdGetResponse handleGetForThreadsthreadId(const ThreadsthreadIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_threadId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_THREAD_OBJECT):
        models::ThreadObject successResponse;
        // ... populate response ...
        return successResponse;
    }

    AssistantsGetResponse handleGetForAssistants(const AssistantsGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_order (optional)
        // Query: params.m_after (optional)
        // Query: params.m_before (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LIST_ASSISTANTS_RESPONSE):
        models::ListAssistantsResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    ThreadsthreadIdmessagesGetResponse handleGetForThreadsthreadIdmessages(const ThreadsthreadIdmessagesGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_threadId
        // Query: params.m_limit (optional)
        // Query: params.m_order (optional)
        // Query: params.m_after (optional)
        // Query: params.m_before (optional)
        // Query: params.m_runId (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LIST_MESSAGES_RESPONSE):
        models::ListMessagesResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    ThreadsthreadIdrunsrunIdstepsGetResponse handleGetForThreadsthreadIdrunsrunIdsteps(const ThreadsthreadIdrunsrunIdstepsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_threadId
        // Path: params.m_runId
        // Query: params.m_limit (optional)
        // Query: params.m_order (optional)
        // Query: params.m_after (optional)
        // Query: params.m_before (optional)
        // Query: params.m_includeLeft_Square_BracketRight_Square_Bracket (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LIST_RUN_STEPS_RESPONSE):
        models::ListRunStepsResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    ThreadsthreadIdrunsGetResponse handleGetForThreadsthreadIdruns(const ThreadsthreadIdrunsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_threadId
        // Query: params.m_limit (optional)
        // Query: params.m_order (optional)
        // Query: params.m_after (optional)
        // Query: params.m_before (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LIST_RUNS_RESPONSE):
        models::ListRunsResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    AssistantsassistantIdPostResponse handlePostForAssistantsassistantId(const AssistantsassistantIdPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_assistantId
        // Body: params.m_request (std::optional<models::ModifyAssistantRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ASSISTANT_OBJECT):
        models::AssistantObject successResponse;
        // ... populate response ...
        return successResponse;
    }

    ThreadsthreadIdmessagesmessageIdPostResponse handlePostForThreadsthreadIdmessagesmessageId(const ThreadsthreadIdmessagesmessageIdPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_threadId
        // Path: params.m_messageId
        // Body: params.m_request (std::optional<models::ModifyMessageRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_MESSAGE_OBJECT):
        models::MessageObject successResponse;
        // ... populate response ...
        return successResponse;
    }

    ThreadsthreadIdrunsrunIdPostResponse handlePostForThreadsthreadIdrunsrunId(const ThreadsthreadIdrunsrunIdPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_threadId
        // Path: params.m_runId
        // Body: params.m_request (std::optional<models::ModifyRunRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_RUN_OBJECT):
        models::RunObject successResponse;
        // ... populate response ...
        return successResponse;
    }

    ThreadsthreadIdPostResponse handlePostForThreadsthreadId(const ThreadsthreadIdPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_threadId
        // Body: params.m_request (std::optional<models::ModifyThreadRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_THREAD_OBJECT):
        models::ThreadObject successResponse;
        // ... populate response ...
        return successResponse;
    }

    ThreadsthreadIdrunsrunIdsubmitToolOutputsPostResponse handlePostForThreadsthreadIdrunsrunIdsubmitToolOutputs(const ThreadsthreadIdrunsrunIdsubmitToolOutputsPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_threadId
        // Path: params.m_runId
        // Body: params.m_request (std::optional<models::SubmitToolOutputsRunRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_RUN_OBJECT):
        models::RunObject successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```
#### Audio

Create a class that inherits from the generated base class:

```cpp
#include "api/AudioApi.h"

class AudioImpl : public Api::Audio {
public:
    AudiospeechPostResponse handlePostForAudiospeech(const AudiospeechPostRequest& params) override {
        // Access request parameters:
        // Body: params.m_request (std::optional<models::CreateSpeechRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_FILE):
        std::string successResponse;
        // ... populate response ...
        return successResponse;
    }

    AudiotranscriptionsPostResponse handlePostForAudiotranscriptions() override {

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CREATE_TRANSCRIPTION200_RESPONSE):
        models::CreateTranscription200Response successResponse;
        // ... populate response ...
        return successResponse;
    }

    AudiotranslationsPostResponse handlePostForAudiotranslations() override {

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CREATE_TRANSLATION200_RESPONSE):
        models::CreateTranslation200Response successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```
#### AuditLogs

Create a class that inherits from the generated base class:

```cpp
#include "api/AuditLogsApi.h"

class AuditLogsImpl : public Api::AuditLogs {
public:
    OrganizationauditLogsGetResponse handleGetForOrganizationauditLogs(const OrganizationauditLogsGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_effectiveAt (optional)
        // Query: params.m_projectIdsLeft_Square_BracketRight_Square_Bracket (optional)
        // Query: params.m_eventTypesLeft_Square_BracketRight_Square_Bracket (optional)
        // Query: params.m_actorIdsLeft_Square_BracketRight_Square_Bracket (optional)
        // Query: params.m_actorEmailsLeft_Square_BracketRight_Square_Bracket (optional)
        // Query: params.m_resourceIdsLeft_Square_BracketRight_Square_Bracket (optional)
        // Query: params.m_limit (optional)
        // Query: params.m_after (optional)
        // Query: params.m_before (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LIST_AUDIT_LOGS_RESPONSE):
        models::ListAuditLogsResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```
#### Batch

Create a class that inherits from the generated base class:

```cpp
#include "api/BatchApi.h"

class BatchImpl : public Api::Batch {
public:
    BatchesbatchIdcancelPostResponse handlePostForBatchesbatchIdcancel(const BatchesbatchIdcancelPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_batchId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BATCH):
        models::Batch successResponse;
        // ... populate response ...
        return successResponse;
    }

    BatchesPostResponse handlePostForBatches(const BatchesPostRequest& params) override {
        // Access request parameters:
        // Body: params.m_request (std::optional<models::CreateBatchRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BATCH):
        models::Batch successResponse;
        // ... populate response ...
        return successResponse;
    }

    BatchesGetResponse handleGetForBatches(const BatchesGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_after (optional)
        // Query: params.m_limit (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LIST_BATCHES_RESPONSE):
        models::ListBatchesResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    BatchesbatchIdGetResponse handleGetForBatchesbatchId(const BatchesbatchIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_batchId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BATCH):
        models::Batch successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```
#### Chat

Create a class that inherits from the generated base class:

```cpp
#include "api/ChatApi.h"

class ChatImpl : public Api::Chat {
public:
    ChatcompletionsPostResponse handlePostForChatcompletions(const ChatcompletionsPostRequest& params) override {
        // Access request parameters:
        // Body: params.m_request (std::optional<models::CreateChatCompletionRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CREATE_CHAT_COMPLETION_RESPONSE):
        models::CreateChatCompletionResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```
#### Completions

Create a class that inherits from the generated base class:

```cpp
#include "api/CompletionsApi.h"

class CompletionsImpl : public Api::Completions {
public:
    CompletionsPostResponse handlePostForCompletions(const CompletionsPostRequest& params) override {
        // Access request parameters:
        // Body: params.m_request (std::optional<models::CreateCompletionRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CREATE_COMPLETION_RESPONSE):
        models::CreateCompletionResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```
#### CppHttplibServerapi

Create a class that inherits from the generated base class:

```cpp
#include "api/CppHttplibServerapiApi.h"

class CppHttplibServerapiImpl : public Api::CppHttplibServerapi {
public:
    OrganizationadminApiKeysPostResponse handlePostForOrganizationadminApiKeys(const OrganizationadminApiKeysPostRequest& params) override {
        // Access request parameters:
        // Body: params.m_request (std::optional<models::AdminApiKeysCreateRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ADMIN_API_KEY):
        models::AdminApiKey successResponse;
        // ... populate response ...
        return successResponse;
    }

    OrganizationadminApiKeyskeyIdDeleteResponse handleDeleteForOrganizationadminApiKeyskeyId(const OrganizationadminApiKeyskeyIdDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_keyId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ADMIN_API_KEYS_DELETE200_RESPONSE):
        models::AdminApiKeysDelete200Response successResponse;
        // ... populate response ...
        return successResponse;
    }

    OrganizationadminApiKeyskeyIdGetResponse handleGetForOrganizationadminApiKeyskeyId(const OrganizationadminApiKeyskeyIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_keyId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_ADMIN_API_KEY):
        models::AdminApiKey successResponse;
        // ... populate response ...
        return successResponse;
    }

    OrganizationadminApiKeysGetResponse handleGetForOrganizationadminApiKeys(const OrganizationadminApiKeysGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_after (optional)
        // Query: params.m_order (optional)
        // Query: params.m_limit (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_API_KEY_LIST):
        models::ApiKeyList successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```
#### Embeddings

Create a class that inherits from the generated base class:

```cpp
#include "api/EmbeddingsApi.h"

class EmbeddingsImpl : public Api::Embeddings {
public:
    EmbeddingsPostResponse handlePostForEmbeddings(const EmbeddingsPostRequest& params) override {
        // Access request parameters:
        // Body: params.m_request (std::optional<models::CreateEmbeddingRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CREATE_EMBEDDING_RESPONSE):
        models::CreateEmbeddingResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```
#### Files

Create a class that inherits from the generated base class:

```cpp
#include "api/FilesApi.h"

class FilesImpl : public Api::Files {
public:
    FilesPostResponse handlePostForFiles() override {

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_OPEN_AI_FILE):
        models::OpenAIFile successResponse;
        // ... populate response ...
        return successResponse;
    }

    FilesfileIdDeleteResponse handleDeleteForFilesfileId(const FilesfileIdDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_fileId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_DELETE_FILE_RESPONSE):
        models::DeleteFileResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    FilesfileIdcontentGetResponse handleGetForFilesfileIdcontent(const FilesfileIdcontentGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_fileId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_STRING):
        std::string successResponse;
        // ... populate response ...
        return successResponse;
    }

    FilesGetResponse handleGetForFiles(const FilesGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_purpose (optional)
        // Query: params.m_limit (optional)
        // Query: params.m_order (optional)
        // Query: params.m_after (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LIST_FILES_RESPONSE):
        models::ListFilesResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    FilesfileIdGetResponse handleGetForFilesfileId(const FilesfileIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_fileId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_OPEN_AI_FILE):
        models::OpenAIFile successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```
#### FineTuning

Create a class that inherits from the generated base class:

```cpp
#include "api/FineTuningApi.h"

class FineTuningImpl : public Api::FineTuning {
public:
    FineTuningjobsfineTuningJobIdcancelPostResponse handlePostForFineTuningjobsfineTuningJobIdcancel(const FineTuningjobsfineTuningJobIdcancelPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_fineTuningJobId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_FINE_TUNING_JOB):
        models::FineTuningJob successResponse;
        // ... populate response ...
        return successResponse;
    }

    FineTuningjobsPostResponse handlePostForFineTuningjobs(const FineTuningjobsPostRequest& params) override {
        // Access request parameters:
        // Body: params.m_request (std::optional<models::CreateFineTuningJobRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_FINE_TUNING_JOB):
        models::FineTuningJob successResponse;
        // ... populate response ...
        return successResponse;
    }

    FineTuningjobsfineTuningJobIdeventsGetResponse handleGetForFineTuningjobsfineTuningJobIdevents(const FineTuningjobsfineTuningJobIdeventsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_fineTuningJobId
        // Query: params.m_after (optional)
        // Query: params.m_limit (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LIST_FINE_TUNING_JOB_EVENTS_RESPONSE):
        models::ListFineTuningJobEventsResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    FineTuningjobsfineTuningJobIdcheckpointsGetResponse handleGetForFineTuningjobsfineTuningJobIdcheckpoints(const FineTuningjobsfineTuningJobIdcheckpointsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_fineTuningJobId
        // Query: params.m_after (optional)
        // Query: params.m_limit (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LIST_FINE_TUNING_JOB_CHECKPOINTS_RESPONSE):
        models::ListFineTuningJobCheckpointsResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    FineTuningjobsGetResponse handleGetForFineTuningjobs(const FineTuningjobsGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_after (optional)
        // Query: params.m_limit (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LIST_PAGINATED_FINE_TUNING_JOBS_RESPONSE):
        models::ListPaginatedFineTuningJobsResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    FineTuningjobsfineTuningJobIdGetResponse handleGetForFineTuningjobsfineTuningJobId(const FineTuningjobsfineTuningJobIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_fineTuningJobId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_FINE_TUNING_JOB):
        models::FineTuningJob successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```
#### Images

Create a class that inherits from the generated base class:

```cpp
#include "api/ImagesApi.h"

class ImagesImpl : public Api::Images {
public:
    ImagesgenerationsPostResponse handlePostForImagesgenerations(const ImagesgenerationsPostRequest& params) override {
        // Access request parameters:
        // Body: params.m_request (std::optional<models::CreateImageRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_IMAGES_RESPONSE):
        models::ImagesResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    ImageseditsPostResponse handlePostForImagesedits() override {

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_IMAGES_RESPONSE):
        models::ImagesResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    ImagesvariationsPostResponse handlePostForImagesvariations() override {

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_IMAGES_RESPONSE):
        models::ImagesResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```
#### Invites

Create a class that inherits from the generated base class:

```cpp
#include "api/InvitesApi.h"

class InvitesImpl : public Api::Invites {
public:
    OrganizationinvitesinviteIdDeleteResponse handleDeleteForOrganizationinvitesinviteId(const OrganizationinvitesinviteIdDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_inviteId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_INVITE_DELETE_RESPONSE):
        models::InviteDeleteResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    OrganizationinvitesPostResponse handlePostForOrganizationinvites(const OrganizationinvitesPostRequest& params) override {
        // Access request parameters:
        // Body: params.m_request (std::optional<models::InviteRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_INVITE):
        models::Invite successResponse;
        // ... populate response ...
        return successResponse;
    }

    OrganizationinvitesGetResponse handleGetForOrganizationinvites(const OrganizationinvitesGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_after (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_INVITE_LIST_RESPONSE):
        models::InviteListResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    OrganizationinvitesinviteIdGetResponse handleGetForOrganizationinvitesinviteId(const OrganizationinvitesinviteIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_inviteId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_INVITE):
        models::Invite successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```
#### Models

Create a class that inherits from the generated base class:

```cpp
#include "api/ModelsApi.h"

class ModelsImpl : public Api::Models {
public:
    ModelsmodelDeleteResponse handleDeleteForModelsmodel(const ModelsmodelDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_model

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_DELETE_MODEL_RESPONSE):
        models::DeleteModelResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    ModelsGetResponse handleGetForModels() override {

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LIST_MODELS_RESPONSE):
        models::ListModelsResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    ModelsmodelGetResponse handleGetForModelsmodel(const ModelsmodelGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_model

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_MODEL):
        models::Model successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```
#### Moderations

Create a class that inherits from the generated base class:

```cpp
#include "api/ModerationsApi.h"

class ModerationsImpl : public Api::Moderations {
public:
    ModerationsPostResponse handlePostForModerations(const ModerationsPostRequest& params) override {
        // Access request parameters:
        // Body: params.m_request (std::optional<models::CreateModerationRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_CREATE_MODERATION_RESPONSE):
        models::CreateModerationResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```
#### Projects

Create a class that inherits from the generated base class:

```cpp
#include "api/ProjectsApi.h"

class ProjectsImpl : public Api::Projects {
public:
    OrganizationprojectsprojectIdarchivePostResponse handlePostForOrganizationprojectsprojectIdarchive(const OrganizationprojectsprojectIdarchivePostRequest& params) override {
        // Access request parameters:
        // Path: params.m_projectId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PROJECT):
        models::Project successResponse;
        // ... populate response ...
        return successResponse;
    }

    OrganizationprojectsPostResponse handlePostForOrganizationprojects(const OrganizationprojectsPostRequest& params) override {
        // Access request parameters:
        // Body: params.m_request (std::optional<models::ProjectCreateRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PROJECT):
        models::Project successResponse;
        // ... populate response ...
        return successResponse;
    }

    OrganizationprojectsprojectIdserviceAccountsPostResponse handlePostForOrganizationprojectsprojectIdserviceAccounts(const OrganizationprojectsprojectIdserviceAccountsPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_projectId
        // Body: params.m_request (std::optional<models::ProjectServiceAccountCreateRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PROJECT_SERVICE_ACCOUNT_CREATE_RESPONSE):
        models::ProjectServiceAccountCreateResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_ERROR_RESPONSE):
        // models::ErrorResponse errorResponse;
        // return errorResponse;
    }

    OrganizationprojectsprojectIdusersPostResponse handlePostForOrganizationprojectsprojectIdusers(const OrganizationprojectsprojectIdusersPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_projectId
        // Body: params.m_request (std::optional<models::ProjectUserCreateRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PROJECT_USER):
        models::ProjectUser successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_ERROR_RESPONSE):
        // models::ErrorResponse errorResponse;
        // return errorResponse;
    }

    OrganizationprojectsprojectIdapiKeyskeyIdDeleteResponse handleDeleteForOrganizationprojectsprojectIdapiKeyskeyId(const OrganizationprojectsprojectIdapiKeyskeyIdDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_projectId
        // Path: params.m_keyId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PROJECT_API_KEY_DELETE_RESPONSE):
        models::ProjectApiKeyDeleteResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_ERROR_RESPONSE):
        // models::ErrorResponse errorResponse;
        // return errorResponse;
    }

    OrganizationprojectsprojectIdserviceAccountsserviceAccountIdDeleteResponse handleDeleteForOrganizationprojectsprojectIdserviceAccountsserviceAccountId(const OrganizationprojectsprojectIdserviceAccountsserviceAccountIdDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_projectId
        // Path: params.m_serviceAccountId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PROJECT_SERVICE_ACCOUNT_DELETE_RESPONSE):
        models::ProjectServiceAccountDeleteResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    OrganizationprojectsprojectIdusersuserIdDeleteResponse handleDeleteForOrganizationprojectsprojectIdusersuserId(const OrganizationprojectsprojectIdusersuserIdDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_projectId
        // Path: params.m_userId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PROJECT_USER_DELETE_RESPONSE):
        models::ProjectUserDeleteResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_ERROR_RESPONSE):
        // models::ErrorResponse errorResponse;
        // return errorResponse;
    }

    OrganizationprojectsprojectIdapiKeysGetResponse handleGetForOrganizationprojectsprojectIdapiKeys(const OrganizationprojectsprojectIdapiKeysGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_projectId
        // Query: params.m_limit (optional)
        // Query: params.m_after (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PROJECT_API_KEY_LIST_RESPONSE):
        models::ProjectApiKeyListResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    OrganizationprojectsprojectIdrateLimitsGetResponse handleGetForOrganizationprojectsprojectIdrateLimits(const OrganizationprojectsprojectIdrateLimitsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_projectId
        // Query: params.m_limit (optional)
        // Query: params.m_after (optional)
        // Query: params.m_before (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PROJECT_RATE_LIMIT_LIST_RESPONSE):
        models::ProjectRateLimitListResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    OrganizationprojectsprojectIdserviceAccountsGetResponse handleGetForOrganizationprojectsprojectIdserviceAccounts(const OrganizationprojectsprojectIdserviceAccountsGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_projectId
        // Query: params.m_limit (optional)
        // Query: params.m_after (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PROJECT_SERVICE_ACCOUNT_LIST_RESPONSE):
        models::ProjectServiceAccountListResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_ERROR_RESPONSE):
        // models::ErrorResponse errorResponse;
        // return errorResponse;
    }

    OrganizationprojectsprojectIdusersGetResponse handleGetForOrganizationprojectsprojectIdusers(const OrganizationprojectsprojectIdusersGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_projectId
        // Query: params.m_limit (optional)
        // Query: params.m_after (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PROJECT_USER_LIST_RESPONSE):
        models::ProjectUserListResponse successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_ERROR_RESPONSE):
        // models::ErrorResponse errorResponse;
        // return errorResponse;
    }

    OrganizationprojectsGetResponse handleGetForOrganizationprojects(const OrganizationprojectsGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_after (optional)
        // Query: params.m_includeArchived (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PROJECT_LIST_RESPONSE):
        models::ProjectListResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    OrganizationprojectsprojectIdPostResponse handlePostForOrganizationprojectsprojectId(const OrganizationprojectsprojectIdPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_projectId
        // Body: params.m_request (std::optional<models::ProjectUpdateRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PROJECT):
        models::Project successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_ERROR_RESPONSE):
        // models::ErrorResponse errorResponse;
        // return errorResponse;
    }

    OrganizationprojectsprojectIdusersuserIdPostResponse handlePostForOrganizationprojectsprojectIdusersuserId(const OrganizationprojectsprojectIdusersuserIdPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_projectId
        // Path: params.m_userId
        // Body: params.m_request (std::optional<models::ProjectUserUpdateRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PROJECT_USER):
        models::ProjectUser successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_ERROR_RESPONSE):
        // models::ErrorResponse errorResponse;
        // return errorResponse;
    }

    OrganizationprojectsprojectIdGetResponse handleGetForOrganizationprojectsprojectId(const OrganizationprojectsprojectIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_projectId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PROJECT):
        models::Project successResponse;
        // ... populate response ...
        return successResponse;
    }

    OrganizationprojectsprojectIdapiKeyskeyIdGetResponse handleGetForOrganizationprojectsprojectIdapiKeyskeyId(const OrganizationprojectsprojectIdapiKeyskeyIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_projectId
        // Path: params.m_keyId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PROJECT_API_KEY):
        models::ProjectApiKey successResponse;
        // ... populate response ...
        return successResponse;
    }

    OrganizationprojectsprojectIdserviceAccountsserviceAccountIdGetResponse handleGetForOrganizationprojectsprojectIdserviceAccountsserviceAccountId(const OrganizationprojectsprojectIdserviceAccountsserviceAccountIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_projectId
        // Path: params.m_serviceAccountId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PROJECT_SERVICE_ACCOUNT):
        models::ProjectServiceAccount successResponse;
        // ... populate response ...
        return successResponse;
    }

    OrganizationprojectsprojectIdusersuserIdGetResponse handleGetForOrganizationprojectsprojectIdusersuserId(const OrganizationprojectsprojectIdusersuserIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_projectId
        // Path: params.m_userId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PROJECT_USER):
        models::ProjectUser successResponse;
        // ... populate response ...
        return successResponse;
    }

    OrganizationprojectsprojectIdrateLimitsrateLimitIdPostResponse handlePostForOrganizationprojectsprojectIdrateLimitsrateLimitId(const OrganizationprojectsprojectIdrateLimitsrateLimitIdPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_projectId
        // Path: params.m_rateLimitId
        // Body: params.m_request (std::optional<models::ProjectRateLimitUpdateRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PROJECT_RATE_LIMIT):
        models::ProjectRateLimit successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_ERROR_RESPONSE):
        // models::ErrorResponse errorResponse;
        // return errorResponse;
    }

};
```
#### Realtime

Create a class that inherits from the generated base class:

```cpp
#include "api/RealtimeApi.h"

class RealtimeImpl : public Api::Realtime {
public:
    RealtimesessionsPostResponse handlePostForRealtimesessions(const RealtimesessionsPostRequest& params) override {
        // Access request parameters:
        // Body: params.m_request (std::optional<models::RealtimeSessionCreateRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_REALTIME_SESSION_CREATE_RESPONSE):
        models::RealtimeSessionCreateResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```
#### Uploads

Create a class that inherits from the generated base class:

```cpp
#include "api/UploadsApi.h"

class UploadsImpl : public Api::Uploads {
public:
    UploadsuploadIdpartsPostResponse handlePostForUploadsuploadIdparts(const UploadsuploadIdpartsPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_uploadId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_UPLOAD_PART):
        models::UploadPart successResponse;
        // ... populate response ...
        return successResponse;
    }

    UploadsuploadIdcancelPostResponse handlePostForUploadsuploadIdcancel(const UploadsuploadIdcancelPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_uploadId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_UPLOAD):
        models::Upload successResponse;
        // ... populate response ...
        return successResponse;
    }

    UploadsuploadIdcompletePostResponse handlePostForUploadsuploadIdcomplete(const UploadsuploadIdcompletePostRequest& params) override {
        // Access request parameters:
        // Path: params.m_uploadId
        // Body: params.m_request (std::optional<models::CompleteUploadRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_UPLOAD):
        models::Upload successResponse;
        // ... populate response ...
        return successResponse;
    }

    UploadsPostResponse handlePostForUploads(const UploadsPostRequest& params) override {
        // Access request parameters:
        // Body: params.m_request (std::optional<models::CreateUploadRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_UPLOAD):
        models::Upload successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```
#### Usage

Create a class that inherits from the generated base class:

```cpp
#include "api/UsageApi.h"

class UsageImpl : public Api::Usage {
public:
    OrganizationusageaudioSpeechesGetResponse handleGetForOrganizationusageaudioSpeeches(const OrganizationusageaudioSpeechesGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_startTime
        // Query: params.m_endTime (optional)
        // Query: params.m_bucketWidth (optional)
        // Query: params.m_projectIds (optional)
        // Query: params.m_userIds (optional)
        // Query: params.m_apiKeyIds (optional)
        // Query: params.m_models (optional)
        // Query: params.m_groupBy (optional)
        // Query: params.m_limit (optional)
        // Query: params.m_page (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_USAGE_RESPONSE):
        models::UsageResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    OrganizationusageaudioTranscriptionsGetResponse handleGetForOrganizationusageaudioTranscriptions(const OrganizationusageaudioTranscriptionsGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_startTime
        // Query: params.m_endTime (optional)
        // Query: params.m_bucketWidth (optional)
        // Query: params.m_projectIds (optional)
        // Query: params.m_userIds (optional)
        // Query: params.m_apiKeyIds (optional)
        // Query: params.m_models (optional)
        // Query: params.m_groupBy (optional)
        // Query: params.m_limit (optional)
        // Query: params.m_page (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_USAGE_RESPONSE):
        models::UsageResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    OrganizationusagecodeInterpreterSessionsGetResponse handleGetForOrganizationusagecodeInterpreterSessions(const OrganizationusagecodeInterpreterSessionsGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_startTime
        // Query: params.m_endTime (optional)
        // Query: params.m_bucketWidth (optional)
        // Query: params.m_projectIds (optional)
        // Query: params.m_groupBy (optional)
        // Query: params.m_limit (optional)
        // Query: params.m_page (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_USAGE_RESPONSE):
        models::UsageResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    OrganizationusagecompletionsGetResponse handleGetForOrganizationusagecompletions(const OrganizationusagecompletionsGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_startTime
        // Query: params.m_endTime (optional)
        // Query: params.m_bucketWidth (optional)
        // Query: params.m_projectIds (optional)
        // Query: params.m_userIds (optional)
        // Query: params.m_apiKeyIds (optional)
        // Query: params.m_models (optional)
        // Query: params.m_batch (optional)
        // Query: params.m_groupBy (optional)
        // Query: params.m_limit (optional)
        // Query: params.m_page (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_USAGE_RESPONSE):
        models::UsageResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    OrganizationcostsGetResponse handleGetForOrganizationcosts(const OrganizationcostsGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_startTime
        // Query: params.m_endTime (optional)
        // Query: params.m_bucketWidth (optional)
        // Query: params.m_projectIds (optional)
        // Query: params.m_groupBy (optional)
        // Query: params.m_limit (optional)
        // Query: params.m_page (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_USAGE_RESPONSE):
        models::UsageResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    OrganizationusageembeddingsGetResponse handleGetForOrganizationusageembeddings(const OrganizationusageembeddingsGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_startTime
        // Query: params.m_endTime (optional)
        // Query: params.m_bucketWidth (optional)
        // Query: params.m_projectIds (optional)
        // Query: params.m_userIds (optional)
        // Query: params.m_apiKeyIds (optional)
        // Query: params.m_models (optional)
        // Query: params.m_groupBy (optional)
        // Query: params.m_limit (optional)
        // Query: params.m_page (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_USAGE_RESPONSE):
        models::UsageResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    OrganizationusageimagesGetResponse handleGetForOrganizationusageimages(const OrganizationusageimagesGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_startTime
        // Query: params.m_endTime (optional)
        // Query: params.m_bucketWidth (optional)
        // Query: params.m_sources (optional)
        // Query: params.m_sizes (optional)
        // Query: params.m_projectIds (optional)
        // Query: params.m_userIds (optional)
        // Query: params.m_apiKeyIds (optional)
        // Query: params.m_models (optional)
        // Query: params.m_groupBy (optional)
        // Query: params.m_limit (optional)
        // Query: params.m_page (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_USAGE_RESPONSE):
        models::UsageResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    OrganizationusagemoderationsGetResponse handleGetForOrganizationusagemoderations(const OrganizationusagemoderationsGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_startTime
        // Query: params.m_endTime (optional)
        // Query: params.m_bucketWidth (optional)
        // Query: params.m_projectIds (optional)
        // Query: params.m_userIds (optional)
        // Query: params.m_apiKeyIds (optional)
        // Query: params.m_models (optional)
        // Query: params.m_groupBy (optional)
        // Query: params.m_limit (optional)
        // Query: params.m_page (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_USAGE_RESPONSE):
        models::UsageResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    OrganizationusagevectorStoresGetResponse handleGetForOrganizationusagevectorStores(const OrganizationusagevectorStoresGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_startTime
        // Query: params.m_endTime (optional)
        // Query: params.m_bucketWidth (optional)
        // Query: params.m_projectIds (optional)
        // Query: params.m_groupBy (optional)
        // Query: params.m_limit (optional)
        // Query: params.m_page (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_USAGE_RESPONSE):
        models::UsageResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```
#### Users

Create a class that inherits from the generated base class:

```cpp
#include "api/UsersApi.h"

class UsersImpl : public Api::Users {
public:
    OrganizationusersuserIdDeleteResponse handleDeleteForOrganizationusersuserId(const OrganizationusersuserIdDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_userId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_USER_DELETE_RESPONSE):
        models::UserDeleteResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    OrganizationusersGetResponse handleGetForOrganizationusers(const OrganizationusersGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_after (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_USER_LIST_RESPONSE):
        models::UserListResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    OrganizationusersuserIdPostResponse handlePostForOrganizationusersuserId(const OrganizationusersuserIdPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_userId
        // Body: params.m_request (std::optional<models::UserRoleUpdateRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_USER):
        models::User successResponse;
        // ... populate response ...
        return successResponse;
    }

    OrganizationusersuserIdGetResponse handleGetForOrganizationusersuserId(const OrganizationusersuserIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_userId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_USER):
        models::User successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```
#### VectorStores

Create a class that inherits from the generated base class:

```cpp
#include "api/VectorStoresApi.h"

class VectorStoresImpl : public Api::VectorStores {
public:
    VectorStoresvectorStoreIdfileBatchesbatchIdcancelPostResponse handlePostForVectorStoresvectorStoreIdfileBatchesbatchIdcancel(const VectorStoresvectorStoreIdfileBatchesbatchIdcancelPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_vectorStoreId
        // Path: params.m_batchId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_VECTOR_STORE_FILE_BATCH_OBJECT):
        models::VectorStoreFileBatchObject successResponse;
        // ... populate response ...
        return successResponse;
    }

    VectorStoresPostResponse handlePostForVectorStores(const VectorStoresPostRequest& params) override {
        // Access request parameters:
        // Body: params.m_request (std::optional<models::CreateVectorStoreRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_VECTOR_STORE_OBJECT):
        models::VectorStoreObject successResponse;
        // ... populate response ...
        return successResponse;
    }

    VectorStoresvectorStoreIdfilesPostResponse handlePostForVectorStoresvectorStoreIdfiles(const VectorStoresvectorStoreIdfilesPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_vectorStoreId
        // Body: params.m_request (std::optional<models::CreateVectorStoreFileRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_VECTOR_STORE_FILE_OBJECT):
        models::VectorStoreFileObject successResponse;
        // ... populate response ...
        return successResponse;
    }

    VectorStoresvectorStoreIdfileBatchesPostResponse handlePostForVectorStoresvectorStoreIdfileBatches(const VectorStoresvectorStoreIdfileBatchesPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_vectorStoreId
        // Body: params.m_request (std::optional<models::CreateVectorStoreFileBatchRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_VECTOR_STORE_FILE_BATCH_OBJECT):
        models::VectorStoreFileBatchObject successResponse;
        // ... populate response ...
        return successResponse;
    }

    VectorStoresvectorStoreIdDeleteResponse handleDeleteForVectorStoresvectorStoreId(const VectorStoresvectorStoreIdDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_vectorStoreId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_DELETE_VECTOR_STORE_RESPONSE):
        models::DeleteVectorStoreResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    VectorStoresvectorStoreIdfilesfileIdDeleteResponse handleDeleteForVectorStoresvectorStoreIdfilesfileId(const VectorStoresvectorStoreIdfilesfileIdDeleteRequest& params) override {
        // Access request parameters:
        // Path: params.m_vectorStoreId
        // Path: params.m_fileId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_DELETE_VECTOR_STORE_FILE_RESPONSE):
        models::DeleteVectorStoreFileResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    VectorStoresvectorStoreIdGetResponse handleGetForVectorStoresvectorStoreId(const VectorStoresvectorStoreIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_vectorStoreId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_VECTOR_STORE_OBJECT):
        models::VectorStoreObject successResponse;
        // ... populate response ...
        return successResponse;
    }

    VectorStoresvectorStoreIdfilesfileIdGetResponse handleGetForVectorStoresvectorStoreIdfilesfileId(const VectorStoresvectorStoreIdfilesfileIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_vectorStoreId
        // Path: params.m_fileId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_VECTOR_STORE_FILE_OBJECT):
        models::VectorStoreFileObject successResponse;
        // ... populate response ...
        return successResponse;
    }

    VectorStoresvectorStoreIdfileBatchesbatchIdGetResponse handleGetForVectorStoresvectorStoreIdfileBatchesbatchId(const VectorStoresvectorStoreIdfileBatchesbatchIdGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_vectorStoreId
        // Path: params.m_batchId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_VECTOR_STORE_FILE_BATCH_OBJECT):
        models::VectorStoreFileBatchObject successResponse;
        // ... populate response ...
        return successResponse;
    }

    VectorStoresvectorStoreIdfileBatchesbatchIdfilesGetResponse handleGetForVectorStoresvectorStoreIdfileBatchesbatchIdfiles(const VectorStoresvectorStoreIdfileBatchesbatchIdfilesGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_vectorStoreId
        // Path: params.m_batchId
        // Query: params.m_limit (optional)
        // Query: params.m_order (optional)
        // Query: params.m_after (optional)
        // Query: params.m_before (optional)
        // Query: params.m_filter (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LIST_VECTOR_STORE_FILES_RESPONSE):
        models::ListVectorStoreFilesResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    VectorStoresvectorStoreIdfilesGetResponse handleGetForVectorStoresvectorStoreIdfiles(const VectorStoresvectorStoreIdfilesGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_vectorStoreId
        // Query: params.m_limit (optional)
        // Query: params.m_order (optional)
        // Query: params.m_after (optional)
        // Query: params.m_before (optional)
        // Query: params.m_filter (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LIST_VECTOR_STORE_FILES_RESPONSE):
        models::ListVectorStoreFilesResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    VectorStoresGetResponse handleGetForVectorStores(const VectorStoresGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_limit (optional)
        // Query: params.m_order (optional)
        // Query: params.m_after (optional)
        // Query: params.m_before (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_LIST_VECTOR_STORES_RESPONSE):
        models::ListVectorStoresResponse successResponse;
        // ... populate response ...
        return successResponse;
    }

    VectorStoresvectorStoreIdPostResponse handlePostForVectorStoresvectorStoreId(const VectorStoresvectorStoreIdPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_vectorStoreId
        // Body: params.m_request (std::optional<models::UpdateVectorStoreRequest>)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_VECTOR_STORE_OBJECT):
        models::VectorStoreObject successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```

## Running the Server

Here's a complete example of setting up and running the server:

```cpp
#include <httplib.h>
#include <memory>

#include "api/AssistantsApi.h"

#include "api/AudioApi.h"

#include "api/AuditLogsApi.h"

#include "api/BatchApi.h"

#include "api/ChatApi.h"

#include "api/CompletionsApi.h"

#include "api/CppHttplibServerapiApi.h"

#include "api/EmbeddingsApi.h"

#include "api/FilesApi.h"

#include "api/FineTuningApi.h"

#include "api/ImagesApi.h"

#include "api/InvitesApi.h"

#include "api/ModelsApi.h"

#include "api/ModerationsApi.h"

#include "api/ProjectsApi.h"

#include "api/RealtimeApi.h"

#include "api/UploadsApi.h"

#include "api/UsageApi.h"

#include "api/UsersApi.h"

#include "api/VectorStoresApi.h"

#include "api/AuthenticationManager.h"

int main() {
    httplib::Server server;

    // Create authentication manager (required for this API)
    auto authMgr = std::make_shared<MyAuthManager>();

    // Create API implementations

    AssistantsImpl assistants;

    AudioImpl audio;

    AuditLogsImpl auditLogs;

    BatchImpl batch;

    ChatImpl chat;

    CompletionsImpl completions;

    CppHttplibServerapiImpl default;

    EmbeddingsImpl embeddings;

    FilesImpl files;

    FineTuningImpl fineTuning;

    ImagesImpl images;

    InvitesImpl invites;

    ModelsImpl models;

    ModerationsImpl moderations;

    ProjectsImpl projects;

    RealtimeImpl realtime;

    UploadsImpl uploads;

    UsageImpl usage;

    UsersImpl users;

    VectorStoresImpl vectorStores;


    // Register routes

    assistants.registerRoutes(server, authMgr);

    audio.registerRoutes(server, authMgr);

    auditLogs.registerRoutes(server, authMgr);

    batch.registerRoutes(server, authMgr);

    chat.registerRoutes(server, authMgr);

    completions.registerRoutes(server, authMgr);

    default.registerRoutes(server, authMgr);

    embeddings.registerRoutes(server, authMgr);

    files.registerRoutes(server, authMgr);

    fineTuning.registerRoutes(server, authMgr);

    images.registerRoutes(server, authMgr);

    invites.registerRoutes(server, authMgr);

    models.registerRoutes(server, authMgr);

    moderations.registerRoutes(server, authMgr);

    projects.registerRoutes(server, authMgr);

    realtime.registerRoutes(server, authMgr);

    uploads.registerRoutes(server, authMgr);

    usage.registerRoutes(server, authMgr);

    users.registerRoutes(server, authMgr);

    vectorStores.registerRoutes(server, authMgr);


    // Start server
    std::cout << "Server starting on http://localhost:8080" << std::endl;
    server.listen("localhost", 8080);

    return 0;
}
```

### With Authentication

When authentication is required, you must:
1. Implement the `AuthenticationManager` interface (see Authentication section below)
2. Pass the authentication manager to `registerRoutes()`


## Authentication

This API requires authentication. Implement the `AuthenticationManager` interface to provide your authentication logic:

```cpp
#include "api/AuthenticationManager.h"

class MyAuthManager : public Api::AuthenticationManager {
public:
    bool validateApiKey(const std::string& key) override {
        // Validate API key from header, query, or cookie
        // Example: check against database or cache
        return checkApiKeyInDatabase(key);
    }

    bool validateBearerToken(const std::string& token) override {
        // Validate JWT or other bearer tokens
        // Example: verify signature and expiration
        return jwt::verify(token, secret_key);
    }

    bool validateBasicAuth(const std::string& username, const std::string& password) override {
        // Validate username/password credentials
        // Example: check against user database with hashed passwords
        auto user = findUser(username);
        return user && bcrypt::verify(password, user->passwordHash);
    }

    bool validateOAuth2(const std::string& token, const std::vector<std::string>& scopes) override {
        // Validate OAuth2 token and check required scopes
        // Example: introspect token and verify scopes
        auto introspection = oauthProvider.introspect(token);
        return introspection.active && hasAllScopes(introspection.scopes, scopes);
    }
};
```

### Authentication Flow

1. The server automatically extracts credentials from requests (headers, query params, cookies)
2. Before calling your handler, it validates credentials using your `AuthenticationManager`
3. If validation fails, the server returns HTTP 401 Unauthorized automatically
4. If validation succeeds, your handler is called

### Security Schemes

The generated code supports:
- **API Key**: Header, query parameter, or cookie-based authentication
- **Bearer Token**: Authorization header with "Bearer" scheme (e.g., JWT)
- **Basic Auth**: HTTP Basic authentication (username:password)
- **OAuth2**: OAuth 2.0 token-based authentication with scope validation


## Error Handling

### Response Variants

Each API endpoint that returns data uses `std::variant` to represent multiple possible response types (success and errors):

```cpp
// Example: endpoint returns success (User) or errors (NotFound, ServerError)
using GetUserResponse = std::variant<User, NotFound, ServerError>;

GetUserResponse handleGetUser(const GetUserRequest& params) override {
    if (userExists(params.m_userId)) {
        User user = fetchUser(params.m_userId);
        return user;  // Automatically sets HTTP 200
    } else {
        NotFound error;
        error.setMessage("User not found");
        return error;  // Automatically sets HTTP 404
    }
}
```

The server automatically:
- Detects which type is returned from the variant
- Sets the appropriate HTTP status code
- Serializes the response to JSON

### HTTP Status Codes

Status codes are automatically set based on the response type you return. Each model type is associated with a specific HTTP status code defined in your OpenAPI specification.

**Optimized Status Code Constants:**
The generator only creates HTTP status code constants (e.g., `HTTP_RESPONSE_CODE_200`, `HTTP_RESPONSE_CODE_404`) for codes actually used by your API operations. This reduces code bloat and compilation time compared to generating all possible HTTP status codes.

### Parameter Validation

The generated code automatically validates:
- **Required parameters**: Returns HTTP 400 if missing
- **Type conversion**: Returns HTTP 400 if parameter cannot be converted to expected type
- **JSON parsing**: Returns HTTP 400 if request body is invalid JSON

Custom validation logic should be implemented in your handler methods.

### Working with Optional Parameters

Optional parameters and model fields use `std::optional`:

```cpp
void handleRequest(const RequestParams& params) override {
    // Check if optional query parameter is present
    if (params.m_optionalParam) {
        auto value = *params.m_optionalParam;  // Dereference to get value
        // Use value...
    }

    // Check if optional request body is present
    if (params.m_request) {
        auto body = *params.m_request;  // Dereference to get body
        // Use body...
    }
}
```

## Advanced Features

### Parameter Serialization Styles

The generator supports various parameter serialization styles as defined in OpenAPI:

- **simple**: Comma-separated values (default for path/header)
- **form**: Ampersand-separated values (default for query)
- **spaceDelimited**: Space-separated values
- **pipeDelimited**: Pipe-separated values
- **deepObject**: Nested object notation for query parameters

These are automatically handled during parameter parsing.

### Enum Handling

All generated enums automatically include an `UNSPECIFIED` value as the first enum entry for safe initialization:

```cpp
enum class Status {
    UNSPECIFIED = 0,  // Added automatically for safety
    PENDING,
    APPROVED,
    REJECTED
};

// Safe default initialization
Status status;  // Defaults to UNSPECIFIED (0)

// Explicit initialization
Status activeStatus = Status::APPROVED;

// Enum serialization/deserialization
// UNSPECIFIED is not a valid API value and indicates uninitialized state
```

**Why UNSPECIFIED?**
- Provides a safe default value for uninitialized enums
- Prevents undefined behavior from using uninitialized enum values
- Makes it clear when an enum hasn't been set vs. having a valid API value
- Does not appear in OpenAPI spec - internal C++ implementation detail

### Union Types (anyOf/oneOf)

When your OpenAPI spec uses `anyOf` or `oneOf`, the generated code uses `std::variant`:

```cpp
// OpenAPI: { "anyOf": [{"type": "string"}, {"type": "number"}] }
using MyUnionType = std::variant<std::string, double>;

// In your model:
MyUnionType value;

// Use std::visit to handle different types:
std::visit([](const auto& v) {
    using T = std::decay_t<decltype(v)>;
    if constexpr (std::is_same_v<T, std::string>) {
        std::cout << "String: " << v << std::endl;
    } else if constexpr (std::is_same_v<T, double>) {
        std::cout << "Number: " << v << std::endl;
    }
}, value);
```

## Additional Resources

- [cpp-httplib Documentation](https://github.com/yhirose/cpp-httplib)
- [nlohmann/json Documentation](https://github.com/nlohmann/json)
- [OpenAPI Generator Documentation](https://openapi-generator.tech/docs/generators/cpp-httplib-server)
- [OpenAPI Specification](https://swagger.io/specification/)

- [cpp-httplib Documentation](https://github.com/yhirose/cpp-httplib)
- [nlohmann/json Documentation](https://github.com/nlohmann/json)
- [OpenAPI Generator Documentation](https://openapi-generator.tech/docs/generators/)
