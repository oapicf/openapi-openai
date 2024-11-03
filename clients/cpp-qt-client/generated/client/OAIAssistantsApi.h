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

#ifndef OAI_OAIAssistantsApi_H
#define OAI_OAIAssistantsApi_H

#include "OAIHelpers.h"
#include "OAIHttpRequest.h"
#include "OAIServerConfiguration.h"
#include "OAIOauth.h"

#include "OAIAssistantFileObject.h"
#include "OAIAssistantObject.h"
#include "OAICreateAssistantFileRequest.h"
#include "OAICreateAssistantRequest.h"
#include "OAICreateMessageRequest.h"
#include "OAICreateRunRequest.h"
#include "OAICreateThreadAndRunRequest.h"
#include "OAICreateThreadRequest.h"
#include "OAIDeleteAssistantFileResponse.h"
#include "OAIDeleteAssistantResponse.h"
#include "OAIDeleteThreadResponse.h"
#include "OAIListAssistantFilesResponse.h"
#include "OAIListAssistantsResponse.h"
#include "OAIListMessageFilesResponse.h"
#include "OAIListMessagesResponse.h"
#include "OAIListRunStepsResponse.h"
#include "OAIListRunsResponse.h"
#include "OAIMessageFileObject.h"
#include "OAIMessageObject.h"
#include "OAIModifyAssistantRequest.h"
#include "OAIModifyMessageRequest.h"
#include "OAIModifyRunRequest.h"
#include "OAIModifyThreadRequest.h"
#include "OAIRunObject.h"
#include "OAIRunStepObject.h"
#include "OAISubmitToolOutputsRunRequest.h"
#include "OAIThreadObject.h"
#include <QString>

#include <QObject>
#include <QByteArray>
#include <QStringList>
#include <QList>
#include <QNetworkAccessManager>

namespace OpenAPI {

class OAIAssistantsApi : public QObject {
    Q_OBJECT

public:
    OAIAssistantsApi(const int timeOut = 0);
    ~OAIAssistantsApi();

    void initializeServerConfigs();
    int setDefaultServerValue(int serverIndex,const QString &operation, const QString &variable,const QString &val);
    void setServerIndex(const QString &operation, int serverIndex);
    void setApiKey(const QString &apiKeyName, const QString &apiKey);
    void setBearerToken(const QString &token);
    void setUsername(const QString &username);
    void setPassword(const QString &password);
    void setTimeOut(const int timeOut);
    void setWorkingDirectory(const QString &path);
    void setNetworkAccessManager(QNetworkAccessManager* manager);
    int addServerConfiguration(const QString &operation, const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables = QMap<QString, OAIServerVariable>());
    void setNewServerForAllOperations(const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables =  QMap<QString, OAIServerVariable>());
    void setNewServer(const QString &operation, const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables =  QMap<QString, OAIServerVariable>());
    void addHeaders(const QString &key, const QString &value);
    void enableRequestCompression();
    void enableResponseCompression();
    void abortRequests();
    QString getParamStylePrefix(const QString &style);
    QString getParamStyleSuffix(const QString &style);
    QString getParamStyleDelimiter(const QString &style, const QString &name, bool isExplode);

    /**
    * @param[in]  thread_id QString [required]
    * @param[in]  run_id QString [required]
    */
    virtual void cancelRun(const QString &thread_id, const QString &run_id);

    /**
    * @param[in]  oai_create_assistant_request OAICreateAssistantRequest [required]
    */
    virtual void createAssistant(const OAICreateAssistantRequest &oai_create_assistant_request);

    /**
    * @param[in]  assistant_id QString [required]
    * @param[in]  oai_create_assistant_file_request OAICreateAssistantFileRequest [required]
    */
    virtual void createAssistantFile(const QString &assistant_id, const OAICreateAssistantFileRequest &oai_create_assistant_file_request);

    /**
    * @param[in]  thread_id QString [required]
    * @param[in]  oai_create_message_request OAICreateMessageRequest [required]
    */
    virtual void createMessage(const QString &thread_id, const OAICreateMessageRequest &oai_create_message_request);

    /**
    * @param[in]  thread_id QString [required]
    * @param[in]  oai_create_run_request OAICreateRunRequest [required]
    */
    virtual void createRun(const QString &thread_id, const OAICreateRunRequest &oai_create_run_request);

    /**
    * @param[in]  oai_create_thread_request OAICreateThreadRequest [optional]
    */
    virtual void createThread(const ::OpenAPI::OptionalParam<OAICreateThreadRequest> &oai_create_thread_request = ::OpenAPI::OptionalParam<OAICreateThreadRequest>());

    /**
    * @param[in]  oai_create_thread_and_run_request OAICreateThreadAndRunRequest [required]
    */
    virtual void createThreadAndRun(const OAICreateThreadAndRunRequest &oai_create_thread_and_run_request);

    /**
    * @param[in]  assistant_id QString [required]
    */
    virtual void deleteAssistant(const QString &assistant_id);

    /**
    * @param[in]  assistant_id QString [required]
    * @param[in]  file_id QString [required]
    */
    virtual void deleteAssistantFile(const QString &assistant_id, const QString &file_id);

    /**
    * @param[in]  thread_id QString [required]
    */
    virtual void deleteThread(const QString &thread_id);

    /**
    * @param[in]  assistant_id QString [required]
    */
    virtual void getAssistant(const QString &assistant_id);

    /**
    * @param[in]  assistant_id QString [required]
    * @param[in]  file_id QString [required]
    */
    virtual void getAssistantFile(const QString &assistant_id, const QString &file_id);

    /**
    * @param[in]  thread_id QString [required]
    * @param[in]  message_id QString [required]
    */
    virtual void getMessage(const QString &thread_id, const QString &message_id);

    /**
    * @param[in]  thread_id QString [required]
    * @param[in]  message_id QString [required]
    * @param[in]  file_id QString [required]
    */
    virtual void getMessageFile(const QString &thread_id, const QString &message_id, const QString &file_id);

    /**
    * @param[in]  thread_id QString [required]
    * @param[in]  run_id QString [required]
    */
    virtual void getRun(const QString &thread_id, const QString &run_id);

    /**
    * @param[in]  thread_id QString [required]
    * @param[in]  run_id QString [required]
    * @param[in]  step_id QString [required]
    */
    virtual void getRunStep(const QString &thread_id, const QString &run_id, const QString &step_id);

    /**
    * @param[in]  thread_id QString [required]
    */
    virtual void getThread(const QString &thread_id);

    /**
    * @param[in]  assistant_id QString [required]
    * @param[in]  limit qint32 [optional]
    * @param[in]  order QString [optional]
    * @param[in]  after QString [optional]
    * @param[in]  before QString [optional]
    */
    virtual void listAssistantFiles(const QString &assistant_id, const ::OpenAPI::OptionalParam<qint32> &limit = ::OpenAPI::OptionalParam<qint32>(), const ::OpenAPI::OptionalParam<QString> &order = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &after = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &before = ::OpenAPI::OptionalParam<QString>());

    /**
    * @param[in]  limit qint32 [optional]
    * @param[in]  order QString [optional]
    * @param[in]  after QString [optional]
    * @param[in]  before QString [optional]
    */
    virtual void listAssistants(const ::OpenAPI::OptionalParam<qint32> &limit = ::OpenAPI::OptionalParam<qint32>(), const ::OpenAPI::OptionalParam<QString> &order = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &after = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &before = ::OpenAPI::OptionalParam<QString>());

    /**
    * @param[in]  thread_id QString [required]
    * @param[in]  message_id QString [required]
    * @param[in]  limit qint32 [optional]
    * @param[in]  order QString [optional]
    * @param[in]  after QString [optional]
    * @param[in]  before QString [optional]
    */
    virtual void listMessageFiles(const QString &thread_id, const QString &message_id, const ::OpenAPI::OptionalParam<qint32> &limit = ::OpenAPI::OptionalParam<qint32>(), const ::OpenAPI::OptionalParam<QString> &order = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &after = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &before = ::OpenAPI::OptionalParam<QString>());

    /**
    * @param[in]  thread_id QString [required]
    * @param[in]  limit qint32 [optional]
    * @param[in]  order QString [optional]
    * @param[in]  after QString [optional]
    * @param[in]  before QString [optional]
    * @param[in]  run_id QString [optional]
    */
    virtual void listMessages(const QString &thread_id, const ::OpenAPI::OptionalParam<qint32> &limit = ::OpenAPI::OptionalParam<qint32>(), const ::OpenAPI::OptionalParam<QString> &order = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &after = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &before = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &run_id = ::OpenAPI::OptionalParam<QString>());

    /**
    * @param[in]  thread_id QString [required]
    * @param[in]  run_id QString [required]
    * @param[in]  limit qint32 [optional]
    * @param[in]  order QString [optional]
    * @param[in]  after QString [optional]
    * @param[in]  before QString [optional]
    */
    virtual void listRunSteps(const QString &thread_id, const QString &run_id, const ::OpenAPI::OptionalParam<qint32> &limit = ::OpenAPI::OptionalParam<qint32>(), const ::OpenAPI::OptionalParam<QString> &order = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &after = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &before = ::OpenAPI::OptionalParam<QString>());

    /**
    * @param[in]  thread_id QString [required]
    * @param[in]  limit qint32 [optional]
    * @param[in]  order QString [optional]
    * @param[in]  after QString [optional]
    * @param[in]  before QString [optional]
    */
    virtual void listRuns(const QString &thread_id, const ::OpenAPI::OptionalParam<qint32> &limit = ::OpenAPI::OptionalParam<qint32>(), const ::OpenAPI::OptionalParam<QString> &order = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &after = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &before = ::OpenAPI::OptionalParam<QString>());

    /**
    * @param[in]  assistant_id QString [required]
    * @param[in]  oai_modify_assistant_request OAIModifyAssistantRequest [required]
    */
    virtual void modifyAssistant(const QString &assistant_id, const OAIModifyAssistantRequest &oai_modify_assistant_request);

    /**
    * @param[in]  thread_id QString [required]
    * @param[in]  message_id QString [required]
    * @param[in]  oai_modify_message_request OAIModifyMessageRequest [required]
    */
    virtual void modifyMessage(const QString &thread_id, const QString &message_id, const OAIModifyMessageRequest &oai_modify_message_request);

    /**
    * @param[in]  thread_id QString [required]
    * @param[in]  run_id QString [required]
    * @param[in]  oai_modify_run_request OAIModifyRunRequest [required]
    */
    virtual void modifyRun(const QString &thread_id, const QString &run_id, const OAIModifyRunRequest &oai_modify_run_request);

    /**
    * @param[in]  thread_id QString [required]
    * @param[in]  oai_modify_thread_request OAIModifyThreadRequest [required]
    */
    virtual void modifyThread(const QString &thread_id, const OAIModifyThreadRequest &oai_modify_thread_request);

    /**
    * @param[in]  thread_id QString [required]
    * @param[in]  run_id QString [required]
    * @param[in]  oai_submit_tool_outputs_run_request OAISubmitToolOutputsRunRequest [required]
    */
    virtual void submitToolOuputsToRun(const QString &thread_id, const QString &run_id, const OAISubmitToolOutputsRunRequest &oai_submit_tool_outputs_run_request);


private:
    QMap<QString,int> _serverIndices;
    QMap<QString,QList<OAIServerConfiguration>> _serverConfigs;
    QMap<QString, QString> _apiKeys;
    QString _bearerToken;
    QString _username;
    QString _password;
    int _timeOut;
    QString _workingDirectory;
    QNetworkAccessManager* _manager;
    QMap<QString, QString> _defaultHeaders;
    bool _isResponseCompressionEnabled;
    bool _isRequestCompressionEnabled;
    OAIHttpRequestInput _latestInput;
    OAIHttpRequestWorker *_latestWorker;
    QStringList _latestScope;
    OauthCode _authFlow;
    OauthImplicit _implicitFlow;
    OauthCredentials _credentialFlow;
    OauthPassword _passwordFlow;
    int _OauthMethod = 0;

    void cancelRunCallback(OAIHttpRequestWorker *worker);
    void createAssistantCallback(OAIHttpRequestWorker *worker);
    void createAssistantFileCallback(OAIHttpRequestWorker *worker);
    void createMessageCallback(OAIHttpRequestWorker *worker);
    void createRunCallback(OAIHttpRequestWorker *worker);
    void createThreadCallback(OAIHttpRequestWorker *worker);
    void createThreadAndRunCallback(OAIHttpRequestWorker *worker);
    void deleteAssistantCallback(OAIHttpRequestWorker *worker);
    void deleteAssistantFileCallback(OAIHttpRequestWorker *worker);
    void deleteThreadCallback(OAIHttpRequestWorker *worker);
    void getAssistantCallback(OAIHttpRequestWorker *worker);
    void getAssistantFileCallback(OAIHttpRequestWorker *worker);
    void getMessageCallback(OAIHttpRequestWorker *worker);
    void getMessageFileCallback(OAIHttpRequestWorker *worker);
    void getRunCallback(OAIHttpRequestWorker *worker);
    void getRunStepCallback(OAIHttpRequestWorker *worker);
    void getThreadCallback(OAIHttpRequestWorker *worker);
    void listAssistantFilesCallback(OAIHttpRequestWorker *worker);
    void listAssistantsCallback(OAIHttpRequestWorker *worker);
    void listMessageFilesCallback(OAIHttpRequestWorker *worker);
    void listMessagesCallback(OAIHttpRequestWorker *worker);
    void listRunStepsCallback(OAIHttpRequestWorker *worker);
    void listRunsCallback(OAIHttpRequestWorker *worker);
    void modifyAssistantCallback(OAIHttpRequestWorker *worker);
    void modifyMessageCallback(OAIHttpRequestWorker *worker);
    void modifyRunCallback(OAIHttpRequestWorker *worker);
    void modifyThreadCallback(OAIHttpRequestWorker *worker);
    void submitToolOuputsToRunCallback(OAIHttpRequestWorker *worker);

Q_SIGNALS:

    void cancelRunSignal(OAIRunObject summary);
    void createAssistantSignal(OAIAssistantObject summary);
    void createAssistantFileSignal(OAIAssistantFileObject summary);
    void createMessageSignal(OAIMessageObject summary);
    void createRunSignal(OAIRunObject summary);
    void createThreadSignal(OAIThreadObject summary);
    void createThreadAndRunSignal(OAIRunObject summary);
    void deleteAssistantSignal(OAIDeleteAssistantResponse summary);
    void deleteAssistantFileSignal(OAIDeleteAssistantFileResponse summary);
    void deleteThreadSignal(OAIDeleteThreadResponse summary);
    void getAssistantSignal(OAIAssistantObject summary);
    void getAssistantFileSignal(OAIAssistantFileObject summary);
    void getMessageSignal(OAIMessageObject summary);
    void getMessageFileSignal(OAIMessageFileObject summary);
    void getRunSignal(OAIRunObject summary);
    void getRunStepSignal(OAIRunStepObject summary);
    void getThreadSignal(OAIThreadObject summary);
    void listAssistantFilesSignal(OAIListAssistantFilesResponse summary);
    void listAssistantsSignal(OAIListAssistantsResponse summary);
    void listMessageFilesSignal(OAIListMessageFilesResponse summary);
    void listMessagesSignal(OAIListMessagesResponse summary);
    void listRunStepsSignal(OAIListRunStepsResponse summary);
    void listRunsSignal(OAIListRunsResponse summary);
    void modifyAssistantSignal(OAIAssistantObject summary);
    void modifyMessageSignal(OAIMessageObject summary);
    void modifyRunSignal(OAIRunObject summary);
    void modifyThreadSignal(OAIThreadObject summary);
    void submitToolOuputsToRunSignal(OAIRunObject summary);


    void cancelRunSignalFull(OAIHttpRequestWorker *worker, OAIRunObject summary);
    void createAssistantSignalFull(OAIHttpRequestWorker *worker, OAIAssistantObject summary);
    void createAssistantFileSignalFull(OAIHttpRequestWorker *worker, OAIAssistantFileObject summary);
    void createMessageSignalFull(OAIHttpRequestWorker *worker, OAIMessageObject summary);
    void createRunSignalFull(OAIHttpRequestWorker *worker, OAIRunObject summary);
    void createThreadSignalFull(OAIHttpRequestWorker *worker, OAIThreadObject summary);
    void createThreadAndRunSignalFull(OAIHttpRequestWorker *worker, OAIRunObject summary);
    void deleteAssistantSignalFull(OAIHttpRequestWorker *worker, OAIDeleteAssistantResponse summary);
    void deleteAssistantFileSignalFull(OAIHttpRequestWorker *worker, OAIDeleteAssistantFileResponse summary);
    void deleteThreadSignalFull(OAIHttpRequestWorker *worker, OAIDeleteThreadResponse summary);
    void getAssistantSignalFull(OAIHttpRequestWorker *worker, OAIAssistantObject summary);
    void getAssistantFileSignalFull(OAIHttpRequestWorker *worker, OAIAssistantFileObject summary);
    void getMessageSignalFull(OAIHttpRequestWorker *worker, OAIMessageObject summary);
    void getMessageFileSignalFull(OAIHttpRequestWorker *worker, OAIMessageFileObject summary);
    void getRunSignalFull(OAIHttpRequestWorker *worker, OAIRunObject summary);
    void getRunStepSignalFull(OAIHttpRequestWorker *worker, OAIRunStepObject summary);
    void getThreadSignalFull(OAIHttpRequestWorker *worker, OAIThreadObject summary);
    void listAssistantFilesSignalFull(OAIHttpRequestWorker *worker, OAIListAssistantFilesResponse summary);
    void listAssistantsSignalFull(OAIHttpRequestWorker *worker, OAIListAssistantsResponse summary);
    void listMessageFilesSignalFull(OAIHttpRequestWorker *worker, OAIListMessageFilesResponse summary);
    void listMessagesSignalFull(OAIHttpRequestWorker *worker, OAIListMessagesResponse summary);
    void listRunStepsSignalFull(OAIHttpRequestWorker *worker, OAIListRunStepsResponse summary);
    void listRunsSignalFull(OAIHttpRequestWorker *worker, OAIListRunsResponse summary);
    void modifyAssistantSignalFull(OAIHttpRequestWorker *worker, OAIAssistantObject summary);
    void modifyMessageSignalFull(OAIHttpRequestWorker *worker, OAIMessageObject summary);
    void modifyRunSignalFull(OAIHttpRequestWorker *worker, OAIRunObject summary);
    void modifyThreadSignalFull(OAIHttpRequestWorker *worker, OAIThreadObject summary);
    void submitToolOuputsToRunSignalFull(OAIHttpRequestWorker *worker, OAIRunObject summary);

    Q_DECL_DEPRECATED_X("Use cancelRunSignalError() instead")
    void cancelRunSignalE(OAIRunObject summary, QNetworkReply::NetworkError error_type, QString error_str);
    void cancelRunSignalError(OAIRunObject summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use createAssistantSignalError() instead")
    void createAssistantSignalE(OAIAssistantObject summary, QNetworkReply::NetworkError error_type, QString error_str);
    void createAssistantSignalError(OAIAssistantObject summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use createAssistantFileSignalError() instead")
    void createAssistantFileSignalE(OAIAssistantFileObject summary, QNetworkReply::NetworkError error_type, QString error_str);
    void createAssistantFileSignalError(OAIAssistantFileObject summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use createMessageSignalError() instead")
    void createMessageSignalE(OAIMessageObject summary, QNetworkReply::NetworkError error_type, QString error_str);
    void createMessageSignalError(OAIMessageObject summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use createRunSignalError() instead")
    void createRunSignalE(OAIRunObject summary, QNetworkReply::NetworkError error_type, QString error_str);
    void createRunSignalError(OAIRunObject summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use createThreadSignalError() instead")
    void createThreadSignalE(OAIThreadObject summary, QNetworkReply::NetworkError error_type, QString error_str);
    void createThreadSignalError(OAIThreadObject summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use createThreadAndRunSignalError() instead")
    void createThreadAndRunSignalE(OAIRunObject summary, QNetworkReply::NetworkError error_type, QString error_str);
    void createThreadAndRunSignalError(OAIRunObject summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use deleteAssistantSignalError() instead")
    void deleteAssistantSignalE(OAIDeleteAssistantResponse summary, QNetworkReply::NetworkError error_type, QString error_str);
    void deleteAssistantSignalError(OAIDeleteAssistantResponse summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use deleteAssistantFileSignalError() instead")
    void deleteAssistantFileSignalE(OAIDeleteAssistantFileResponse summary, QNetworkReply::NetworkError error_type, QString error_str);
    void deleteAssistantFileSignalError(OAIDeleteAssistantFileResponse summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use deleteThreadSignalError() instead")
    void deleteThreadSignalE(OAIDeleteThreadResponse summary, QNetworkReply::NetworkError error_type, QString error_str);
    void deleteThreadSignalError(OAIDeleteThreadResponse summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use getAssistantSignalError() instead")
    void getAssistantSignalE(OAIAssistantObject summary, QNetworkReply::NetworkError error_type, QString error_str);
    void getAssistantSignalError(OAIAssistantObject summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use getAssistantFileSignalError() instead")
    void getAssistantFileSignalE(OAIAssistantFileObject summary, QNetworkReply::NetworkError error_type, QString error_str);
    void getAssistantFileSignalError(OAIAssistantFileObject summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use getMessageSignalError() instead")
    void getMessageSignalE(OAIMessageObject summary, QNetworkReply::NetworkError error_type, QString error_str);
    void getMessageSignalError(OAIMessageObject summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use getMessageFileSignalError() instead")
    void getMessageFileSignalE(OAIMessageFileObject summary, QNetworkReply::NetworkError error_type, QString error_str);
    void getMessageFileSignalError(OAIMessageFileObject summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use getRunSignalError() instead")
    void getRunSignalE(OAIRunObject summary, QNetworkReply::NetworkError error_type, QString error_str);
    void getRunSignalError(OAIRunObject summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use getRunStepSignalError() instead")
    void getRunStepSignalE(OAIRunStepObject summary, QNetworkReply::NetworkError error_type, QString error_str);
    void getRunStepSignalError(OAIRunStepObject summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use getThreadSignalError() instead")
    void getThreadSignalE(OAIThreadObject summary, QNetworkReply::NetworkError error_type, QString error_str);
    void getThreadSignalError(OAIThreadObject summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use listAssistantFilesSignalError() instead")
    void listAssistantFilesSignalE(OAIListAssistantFilesResponse summary, QNetworkReply::NetworkError error_type, QString error_str);
    void listAssistantFilesSignalError(OAIListAssistantFilesResponse summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use listAssistantsSignalError() instead")
    void listAssistantsSignalE(OAIListAssistantsResponse summary, QNetworkReply::NetworkError error_type, QString error_str);
    void listAssistantsSignalError(OAIListAssistantsResponse summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use listMessageFilesSignalError() instead")
    void listMessageFilesSignalE(OAIListMessageFilesResponse summary, QNetworkReply::NetworkError error_type, QString error_str);
    void listMessageFilesSignalError(OAIListMessageFilesResponse summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use listMessagesSignalError() instead")
    void listMessagesSignalE(OAIListMessagesResponse summary, QNetworkReply::NetworkError error_type, QString error_str);
    void listMessagesSignalError(OAIListMessagesResponse summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use listRunStepsSignalError() instead")
    void listRunStepsSignalE(OAIListRunStepsResponse summary, QNetworkReply::NetworkError error_type, QString error_str);
    void listRunStepsSignalError(OAIListRunStepsResponse summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use listRunsSignalError() instead")
    void listRunsSignalE(OAIListRunsResponse summary, QNetworkReply::NetworkError error_type, QString error_str);
    void listRunsSignalError(OAIListRunsResponse summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use modifyAssistantSignalError() instead")
    void modifyAssistantSignalE(OAIAssistantObject summary, QNetworkReply::NetworkError error_type, QString error_str);
    void modifyAssistantSignalError(OAIAssistantObject summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use modifyMessageSignalError() instead")
    void modifyMessageSignalE(OAIMessageObject summary, QNetworkReply::NetworkError error_type, QString error_str);
    void modifyMessageSignalError(OAIMessageObject summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use modifyRunSignalError() instead")
    void modifyRunSignalE(OAIRunObject summary, QNetworkReply::NetworkError error_type, QString error_str);
    void modifyRunSignalError(OAIRunObject summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use modifyThreadSignalError() instead")
    void modifyThreadSignalE(OAIThreadObject summary, QNetworkReply::NetworkError error_type, QString error_str);
    void modifyThreadSignalError(OAIThreadObject summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use submitToolOuputsToRunSignalError() instead")
    void submitToolOuputsToRunSignalE(OAIRunObject summary, QNetworkReply::NetworkError error_type, QString error_str);
    void submitToolOuputsToRunSignalError(OAIRunObject summary, QNetworkReply::NetworkError error_type, const QString &error_str);

    Q_DECL_DEPRECATED_X("Use cancelRunSignalErrorFull() instead")
    void cancelRunSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void cancelRunSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use createAssistantSignalErrorFull() instead")
    void createAssistantSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void createAssistantSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use createAssistantFileSignalErrorFull() instead")
    void createAssistantFileSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void createAssistantFileSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use createMessageSignalErrorFull() instead")
    void createMessageSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void createMessageSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use createRunSignalErrorFull() instead")
    void createRunSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void createRunSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use createThreadSignalErrorFull() instead")
    void createThreadSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void createThreadSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use createThreadAndRunSignalErrorFull() instead")
    void createThreadAndRunSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void createThreadAndRunSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use deleteAssistantSignalErrorFull() instead")
    void deleteAssistantSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void deleteAssistantSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use deleteAssistantFileSignalErrorFull() instead")
    void deleteAssistantFileSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void deleteAssistantFileSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use deleteThreadSignalErrorFull() instead")
    void deleteThreadSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void deleteThreadSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use getAssistantSignalErrorFull() instead")
    void getAssistantSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void getAssistantSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use getAssistantFileSignalErrorFull() instead")
    void getAssistantFileSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void getAssistantFileSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use getMessageSignalErrorFull() instead")
    void getMessageSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void getMessageSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use getMessageFileSignalErrorFull() instead")
    void getMessageFileSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void getMessageFileSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use getRunSignalErrorFull() instead")
    void getRunSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void getRunSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use getRunStepSignalErrorFull() instead")
    void getRunStepSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void getRunStepSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use getThreadSignalErrorFull() instead")
    void getThreadSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void getThreadSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use listAssistantFilesSignalErrorFull() instead")
    void listAssistantFilesSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void listAssistantFilesSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use listAssistantsSignalErrorFull() instead")
    void listAssistantsSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void listAssistantsSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use listMessageFilesSignalErrorFull() instead")
    void listMessageFilesSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void listMessageFilesSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use listMessagesSignalErrorFull() instead")
    void listMessagesSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void listMessagesSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use listRunStepsSignalErrorFull() instead")
    void listRunStepsSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void listRunStepsSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use listRunsSignalErrorFull() instead")
    void listRunsSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void listRunsSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use modifyAssistantSignalErrorFull() instead")
    void modifyAssistantSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void modifyAssistantSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use modifyMessageSignalErrorFull() instead")
    void modifyMessageSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void modifyMessageSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use modifyRunSignalErrorFull() instead")
    void modifyRunSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void modifyRunSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use modifyThreadSignalErrorFull() instead")
    void modifyThreadSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void modifyThreadSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use submitToolOuputsToRunSignalErrorFull() instead")
    void submitToolOuputsToRunSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void submitToolOuputsToRunSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);

    void abortRequestsSignal();
    void allPendingRequestsCompleted();

public Q_SLOTS:
    void tokenAvailable();
};

} // namespace OpenAPI
#endif
